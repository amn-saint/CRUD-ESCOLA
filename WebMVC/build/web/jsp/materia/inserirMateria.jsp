<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - USUÁRIO</title>
    <body>
       <div class="container"/>
        <h1>INSERIR USUÁRIO</h1>
        <form name="inserirMateria" action="validaInserirMateria.jsp" method="post">
            Nome: <input type="text" name="NOME" value=""> <br>
            Periodo: <input type="text" name="PERIODO" value=""> <br>
            Status: <input type="text" name="STATUS" value=""> <br>
            Professor: <input type="text" name="PROFESSOR" value=""> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        </div>
    </body>
</html>
