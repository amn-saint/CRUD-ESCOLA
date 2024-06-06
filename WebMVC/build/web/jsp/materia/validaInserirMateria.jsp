<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.controller.ControllerMateria"%>

<%
    String nome = request.getParameter("NOME");
    String periodo = request.getParameter("PERIODO");
    String status = request.getParameter("STATUS");
    String professor = request.getParameter("PROFESSOR");
    Materia usu = new Materia(nome,periodo,status,professor);
    ControllerMateria usucont = new ControllerMateria();
    usucont.inserir(usu);
    
    String url = "inserirMateria.jsp";
    response.sendRedirect(url);
%>
