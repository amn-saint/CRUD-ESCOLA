<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.controller.ControllerMateria"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String nome = request.getParameter("NOME");
    String periodo = request.getParameter("PERIODO");
    String status = request.getParameter("STATUS");
    String professor = request.getParameter("PROFESSOR");
    String pbusca = request.getParameter("PBUSCA");

    Materia mat = new Materia(id,nome,periodo,status,professor);
    ControllerMateria matCont = new ControllerMateria();
    matCont.alterar(mat);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarMateria.jsp?LOGIN=" + pbusca;
    response.sendRedirect(url);
%>