<%-- 
    Document   : RegistroProducto
    Created on : 31-05-2020, 01:08:29 PM
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
        <h1>Registro de Productos</h1>
        <form action="ServletControlador3" method="post">
		<p>Producto<input type="text" name="producto" required></p>
		<p>Categoria 
                    <select name="categoria">
			<option value="comida">Comida</option>
			<option value="bebidas">Bebidas</option>
			<option value="moda mujer">Moda Mujer</option>
			<option value="moda hombre">Moda Hombre</option>
			<option value="calzado">Calzado</option>
			<option value="electronica">Electronica</option>
			<option value="informatica">Informatica</option>
			<option value="electrodomestico">Electrodomestico</option>
			
		</select></p>
		<p>Existencia<input type="number" name="existencia">Existencias</p>
		<p>Precio<input type="number" name="precio"></p>
		<p><input type="submit" name="Enviar"></p>
	</form>
    </body>
</html>
