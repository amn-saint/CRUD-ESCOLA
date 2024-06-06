<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm20241m.model.bean.UsuarioMateria"%>
<%@page import="dm20241m.controller.ControllerUsuarioMateria"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    UsuarioMateria ususis = new UsuarioMateria(id);
    ControllerUsuarioMateria ususisCont = new ControllerUsuarioMateria();
    ususisCont.excluir(ususis);
    String pbusca = request.getParameter("PBUSCA");
    String url = "validaConsultarUsuarioMateria.jsp?OBS=" + pbusca;
    response.sendRedirect(url);
%>

