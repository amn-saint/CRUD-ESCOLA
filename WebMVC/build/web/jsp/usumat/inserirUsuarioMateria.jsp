<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="dm20241m.model.bean.Usuario"%>
<%@page import="dm20241m.controller.ControllerUsuario"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.controller.ControllerMateria"%>
<%@page import="dm20241m.model.bean.UsuarioMateria"%>
<%@page import="dm20241m.controller.ControllerUsuarioMateria"%>

<%
    ControllerMateria sisCont = new ControllerMateria();
    Materia pf = new Materia("");
    List<Materia> listaMateria = sisCont.listar(pf);

    ControllerUsuario usuCont = new ControllerUsuario();
    Usuario usuEnt = new Usuario("");
    List<Usuario> listaUsuario = usuCont.listar(usuEnt);
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR USUARIO MATÉRIA</title>
    <body>
        <div class="container"/>
            <h1>Inseri Usuario Materia</h1>
            <form name="inseriUsuarioMateria" action="validaUsuarioMateria.jsp" method="POST">
                <table>
                    <tr>
                        <td>Materia:</td>
                        <td>
                            <select NAME ="ID_MATERIA" class="browser-default">
                               <% for (Materia sisSaida : listaMateria) { %>
                                    <option value="<%=sisSaida.getId()%>"><%=sisSaida.getNome()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Usuario:</td>
                        <td>
                            <select NAME="ID_USUARIO" class="browser-default">
                               <% for (Usuario usuSaida : listaUsuario) { %>
                                    <option value="<%=usuSaida.getId()%>"><%=usuSaida.getLogin()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Observação:</td>
                        <td><input type="text" name="OBS" value=""></td>
                    </tr>
                </table>    
                <input type="submit" name="Enviar" value="Enviar">  <br>
            </form>
        </div>                     
    </body>
</html>
