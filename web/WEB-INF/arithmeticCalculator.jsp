<%-- 
    Document   : arithmeticCalculator
    Created on : 23-Sep-2020, 9:08:35 AM
    Author     : 822408
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value="${firstNum}"><br>
            Second: <input type="text" name="secondNum" value="${secondNum}"><br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="modulus" value="%">
        </form><br>
        Result: ${result}<br>
        <a href="/Week03Lab_Calculators/age">Age Calculator</a>   
    </body>
</html>
