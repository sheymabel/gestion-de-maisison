<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Ajoute Personne Form</title>
</head>
<body>
    <h2>Ajoute Personne</h2>
    <form action="personneDetails.jsp" method="post">
        <label>Nom: <input type="text" name="nom"></label><br>
        <label>Prenom: <input type="text" name="prenom"></label><br>
        <label>Rebom: <input type="text" name="rebom"></label><br>
        <label>Adresse: <input type="text" name="adresse"></label><br>
        <label>Ville: <input type="text" name="ville"></label><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
