<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm20241m.model.bean.Usuario"%>
<%@page import="dm20241m.controller.ControllerUsuario"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.model.bean.UsuarioMateria"%>
<%@page import="dm20241m.controller.ControllerUsuarioMateria"%>
<%
    int idU = Integer.parseInt(request.getParameter("ID_USUARIO"));
    int idMat = Integer.parseInt(request.getParameter("ID_MATERIA"));
    String obs = request.getParameter("OBS");
    UsuarioMateria ussis = new UsuarioMateria(idU, idMat, obs);
    ControllerUsuarioMateria ususiscont = new ControllerUsuarioMateria();
    ususiscont.inserir(ussis);
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirUsuarioMateria.jsp";
    response.sendRedirect(url);

%>