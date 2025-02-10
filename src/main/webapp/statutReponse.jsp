<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/dark.css">
    <title>Reponse</title>
</head>
<body>

    <%
        String nom = (String) request.getAttribute("pNom");
        String age = (String) request.getAttribute("pAge");
        String statut = (String) request.getAttribute("pStatut");
    %>
    <h1>Bonjour <%=nom%> , vous avez <%=age%>
        ans et vous êtes <%=statut%> ! </h1>
</body>
</html>
