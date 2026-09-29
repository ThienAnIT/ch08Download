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

<h2>Joe Satriani - Flying in a Blue Dream</h2>

<table>
    <tr>
        <th>Song title</th>
        <th>Audio Format</th>
    </tr>
    <tr>
        <td>Flying in a Blue Dream</td>
        <td>
            <a href="musicStore/sound/jr01/flying.mp3" download>MP3</a>
        </td>
    </tr>
    <tr>
        <td>The Mystical Experiences</td>
        <td>
            <a href="musicStore/sound/jr01/mystical.mp3" download>MP3</a>
        </td>
    </tr>
</table>

<p><a href="download?action=viewAlbums">View list of albums</a></p>

</body>
</html>