<%-- 
    Document   : InscripcionEnCurso
    Created on : 30-05-2020, 07:44:22 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>☠☠ SWQC-P3 ☠☠</title>
    </head>
    <body>
        <h1>Inscripcion en curso</h1>
       	<form action="ServletControlador" method="POST">
		<p>Nombre: <input type="text" name="nombre" required></p>
		
		<p>Apellido: <input type="text" name="apellido" required></p>
               
		<p>Cursos: 
			<select name="cursos">
			<option value="Robotica">Robotica</option>
			<option value="BaseDeDatos">Base de Datos</option>
			<option value="EmergentesII">Emergentes II</option>
			<option value="CalculoI">Calculo I</option>
		</select></p>
                <br>
		<input type="submit" value="Enviar">
	</form>
     
    </body>
</html>
