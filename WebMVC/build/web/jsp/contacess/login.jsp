<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LOGIN - SISTEMA</title>
    <style>
      body{
        background-image: url('https://cdn.discordapp.com/attachments/1178084391990333594/1230647150862663802/lebron-sunshine-lebron-james-sunshine.gif?ex=66341479&is=66219f79&hm=33b25f144b86b134bd56f3ffc774845d5ec9b02c4da0dba8a2022a4b6afe6475&');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
        }
    </style>
    <audio controls>
	<source src="../assets/lebron_musica.mp3" type="audio/mpeg">
    </audio>
    <body>
        <div class="container"/>
            <h1>LOGIN</h1>
            <form name="FORMLOGIN" action="menu.jsp" method="post">
                LOGIN: <input type="text" name ="LOGIN"> <br>
                SENHA: <input type="password" name ="SENHA"> <br>
                <input type="submit" name="ENVIAR" value="ENVIAR">
            </form>
        </div>
    </body>
</html>
