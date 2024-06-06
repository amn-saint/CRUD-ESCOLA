<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="dm20241m.model.bean.Usuario"%>
<%@page import="dm20241m.controller.ControllerUsuario"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.controller.ControllerMateria"%>
<%@page import="dm20241m.model.bean.UsuarioMateria"%>
<%@page import="dm20241m.controller.ControllerUsuarioMateria"%>

<%
    String obs = request.getParameter("OBS");
    UsuarioMateria ususis = new UsuarioMateria(obs);
    ControllerUsuarioMateria usupescont = new ControllerUsuarioMateria();
    List<UsuarioMateria> listaususist = usupescont.listar(ususis);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + ususis.getObs()+"&ID=" ;
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA USUÁRIOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="IdUsuSist">Id</th>
                  <th data-field="IdU">IdUsuario</th>
                  <th data-field="Login">Login</th>
                  <th data-field="IdMat">IdMateria</th>
                  <th data-field="NomeMateria">Materia</th>
                  <th data-field="Observacao">Observacao</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(listaususist.isEmpty())) { %>    
                <tbody>
                    <% for (UsuarioMateria usuSistSaida : listaususist) { 
                        %>
                        <tr>
                            <td><%=usuSistSaida.getId()%></td>
                            <td><%=usuSistSaida.getIdU()%></td>
                            <td><%=usuSistSaida.getUsu().getLogin()%></td>
                            <td><%=usuSistSaida.getIdMat()%></td>
                            <td><%=usuSistSaida.getMat().getNome()%></td>
                            <td><%=usuSistSaida.getObs()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirUsuarioMateria.jsp?<%=url + usuSistSaida.getId()%>">Excluir</a></td>
                                <td><a href="alterarUsuarioMateria.jsp?<%=url + usuSistSaida.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>