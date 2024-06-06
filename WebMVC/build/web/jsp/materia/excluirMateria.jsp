<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.controller.ControllerMateria"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Materia mat = new Materia(id);
    ControllerMateria matCont = new ControllerMateria();
    matCont.excluir(mat);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarMateria.jsp?LOGIN=" + pbusca;
    response.sendRedirect(url);
%>