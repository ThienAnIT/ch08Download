package data;

import business.User;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class UserIO {

    public static boolean addRecord(User user, String filepath) {
        File file = new File(filepath);
        try (PrintWriter out = new PrintWriter(
                new FileWriter(file, true))) {
            out.println(user.getEmail() + "|"
                    + user.getFirstName() + "|"
                    + user.getLastName());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static User getUser(String email, String filepath) {
        File file = new File(filepath);
        try (BufferedReader in = new BufferedReader(
                new FileReader(file))) {

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                if (t.countTokens() >= 3) {
                    String emailAddress = t.nextToken();
                    if (email.equalsIgnoreCase(emailAddress)) {
                        String firstName = t.nextToken();
                        String lastName = t.nextToken();
                        User user = new User();
                        user.setEmail(emailAddress);
                        user.setFirstName(firstName);
                        user.setLastName(lastName);
                        return user;
                    }
                }
                line = in.readLine();
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}