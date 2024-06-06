<%@page contentType="text/html" pageEncoding="UTF-8"%>
%@page import="dm20241m.model.bean.Usuario"%>
<%@page import="dm20241m.controller.ControllerUsuario"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.controller.ControllerMateria"%>
<%@page import="dm20241m.model.bean.UsuarioMateria"%>
<%@page import="dm20241m.controller.ControllerUsuarioMateria"%>


<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    int idU = Integer.parseInt(request.getParameter("ID_USUARIO"));
    int idMat = Integer.parseInt(request.getParameter("ID_MATERIA"));
    String obs = request.getParameter("OBS");
    String pbusca = request.getParameter("PBUSCA");
    UsuarioMateria ussis = new UsuarioMateria(id,idU, idMat, obs);
    ControllerUsuarioMateria ususiscont = new ControllerUsuarioMateria();
    ususiscont.alterar(ussis);
    String url = "validaConsultarUsuarioMateria.jsp?OBS=" + pbusca;
    response.sendRedirect(url);
%>    
    
    