package download;

// Import các class từ package ngắn hơn
import business.User;
import data.UserIO;
import util.CookieUtil;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "viewAlbums";
        }

        String url = "/index.jsp";

        if (action.equals("checkUser")) {
            String productCode = request.getParameter("productCode");
            HttpSession session = request.getSession();
            session.setAttribute("productCode", productCode);

            User user = (User) session.getAttribute("user");

            if (user == null) {
                Cookie[] cookies = request.getCookies();
                String emailAddress = CookieUtil.getCookieValue(cookies, "emailCookie");

                if (emailAddress == null || emailAddress.isEmpty()) {
                    url = "/register.jsp";
                } else {
                    ServletContext sc = getServletContext();
                    String path = sc.getRealPath("/WEB-INF/EmailList.txt");
                    user = UserIO.getUser(emailAddress, path);

                    session.setAttribute("user", user);
                    url = "/" + productCode + "_download.jsp";
                }
            } else {
                url = "/" + productCode + "_download.jsp";
            }
        }
        else if (action.equals("registerUser")) {
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            User user = new User(firstName, lastName, email);

            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            ServletContext sc = getServletContext();
            String path = sc.getRealPath("/WEB-INF/EmailList.txt");
            UserIO.addRecord(user, path);

            Cookie c = new Cookie("emailCookie", email);
            c.setMaxAge(60 * 60 * 24 * 365 * 2);
            c.setPath("/");
            response.addCookie(c);

            String productCode = (String) session.getAttribute("productCode");
            url = "/" + productCode + "_download.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}