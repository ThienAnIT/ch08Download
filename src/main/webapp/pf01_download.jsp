<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

<h1>Downloads</h1>

<h2>Pink Floyd - The Wall</h2>

<table>
    <tr>
        <th>Song title</th>
        <th>Audio Format</th>
    </tr>
    <tr>
        <td>Another Brick in the Wall (Part 2)</td>
        <td>
            <a href="musicStore/sound/pf01/brick.mp3" download>MP3</a>
        </td>
    </tr>
    <tr>
        <td>Comfortably Numb</td>
        <td>
            <a href="musicStore/sound/pf01/numb.mp3" download>MP3</a>
        </td>
    </tr>
</table>

<p><a href="download?action=viewAlbums">View list of albums</a></p>

</body>
</html>