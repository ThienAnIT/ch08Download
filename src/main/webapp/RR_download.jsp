<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
<h1>Downloads</h1>
<h2>Rực Rỡ - Cody Nam Võ</h2>

<table>
    <tr>
        <th>Song title</th>
        <th>Audio Format</th>
    </tr>
    <tr>
        <td>Rực Rỡ</td>
        <td>
            <a href="${pageContext.request.contextPath}/musicStore/sound/${param.productCode}/RR_CDNV.mp3">Download MP3</a>
        </td>
    </tr>

</table>

<p><a href="index.jsp">View all songs</a></p>
</body>
</html>