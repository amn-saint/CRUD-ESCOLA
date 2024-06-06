
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dm20241m.model.bean.Materia"%>
<%@page import="dm20241m.model.bean.Usuario"%>
<%@page import="dm20241m.controller.ControllerMateria"%>

<%
    String nome = request.getParameter("nome");
    Materia usu = new Materia(nome);
    ControllerMateria usucont = new ControllerMateria();
    List<Materia> listaMateria = usucont.listar(usu);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + usuLogado.getLogin()+"&ID=" ;
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA MATÉRIAS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="id">Id</th>
                  <th data-field="nome">Nome</th>
                  <th data-field="periodo">Periodo</th>
                  <th data-field="status">Status</th>
                  <th data-field="professor">Professor</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(listaMateria.isEmpty())) { %>  
                    JOptionPane.showMessageDialog(null, 'Jesus !');;
                <tbody>
                    <% for (Materia usuSaida : listaMateria) { %>
                    <tr>
                            <td><%=usuSaida.getId()%></td>
                            <td><%=usuSaida.getNome()%></td>
                            <td><%=usuSaida.getPeriodo()%></td>
                            <td><%=usuSaida.getStatus()%></td>
                            <td><%=usuSaida.getProfessor()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirMateria.jsp?<%=url + usuSaida.getId()%>">Excluir</a></td>
                                <td><a href="alterarMateria.jsp?<%=url + usuSaida.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>