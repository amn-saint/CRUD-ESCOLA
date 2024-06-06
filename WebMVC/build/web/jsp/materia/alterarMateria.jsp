<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.controller.ControllerMateria"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Materia mat = new Materia(id);
    ControllerMateria matCont = new ControllerMateria();
    mat = matCont.buscar(mat);
    String pbusca = request.getParameter("PBUSCA");

%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - USUÁRIO</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR USUÁRIO</h1>
        <form name="alterarMateria" action="validaAlterarMateria.jsp" method="post">
            Nome: <input type="text" name="NOME" value="<%=mat.getNome()%>"> <br>
            Periodo: <input type="text" name="PERIODO" value="<%=mat.getPeriodo()%>"> <br>
            Status: <input type="text" name="STATUS" value="<%=mat.getStatus()%>"> <br>
            Professor: <input type="text" name="PROFESSOR" value="<%=mat.getProfessor()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=mat.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>