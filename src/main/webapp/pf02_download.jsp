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

<h2>Pink Floyd - The Dark Side of the Moon</h2>

<table>
    <tr>
        <th>Song title</th>
        <th>Audio Format</th>
    </tr>
    <tr>
        <td>Time</td>
        <td>
            <a href="musicStore/sound/pf02/time.mp3" download>MP3</a>
        </td>
    </tr>
    <tr>
        <td>Money</td>
        <td>
            <a href="musicStore/sound/pf02/money.mp3" download>MP3</a>
        </td>
    </tr>
</table>

<p><a href="download?action=viewAlbums">View list of albums</a></p>

</body>
</html>