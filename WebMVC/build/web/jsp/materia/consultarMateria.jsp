<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>CONSULTAR - MATÉRIA</title>
    <body>
       <div class="container"/>
       <h1>CONSULTAR MATÉRIA</h1>
       <form name="consultarMateria" action="validaConsultarMateria.jsp" method="post">
           NOME <input type="text" name = "nome" value=""> <br>
           <input type="submit" name ="Enviar" value="Enviar"> <br>
       </form>
       </div>
    </body>
</html>
