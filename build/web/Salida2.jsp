<%-- 
    Document   : Salida2
    Created on : 30-05-2020, 11:29:09 PM
    Author     : usuario
--%>

<%@page import="com.emergentes.modelo.RegistroUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    RegistroUsuario Reg = (RegistroUsuario) request.getAttribute("miReg");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>☠☠ SWQC-P3 ☠☠</title>
    </head>
    <body>
        <h1>Registro </h1>
        
        <p>su Nombre es: <%= Reg.getNombre() %></p>
	<p>su Apellido es:<%= Reg.getApellido() %></p>
        <p>su Correo es:<%= Reg.getCorreo() %></p>
	<p>su Contraseña es:<%= Reg.getClave() %></p>
    </body>
</html>
