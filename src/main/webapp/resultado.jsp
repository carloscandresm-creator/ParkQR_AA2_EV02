<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>ParkQR - Resultado</title>
</head>
<body>

<h1>ParkQR</h1>

<h2>Vehículo registrado correctamente</h2>

<p>
    <strong>Placa:</strong>
    <%= request.getAttribute("placa") %>
</p>

<p>
    <strong>Tipo de vehículo:</strong>
    <%= request.getAttribute("tipo") %>
</p>

<br>

<a href="index.html">Registrar otro vehículo</a>

</body>
</html>