<%-- 
    Document   : ageCalculator
    Created on : 23-Sep-2020, 8:35:42 AM
    Author     : 822408
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            
            <input type="submit" value="Age next birthday">
        </form>
        ${message}<br>
        <a href="/Week03Lab_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
