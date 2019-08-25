<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 25/08/2019
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator Simple</title>
  </head>
  <body>
  <h1> Caculator Simple </h1>
  <form action="http://localhost:8080/Caculator_JSP_war_exploded/calculate" method="post">
      First operand: <input type="text" name = "firstOperand">
      <br/>
      Operator: <select name = "operator">
                    <option value="+"> Addition </option>
                    <option value="-"> Subtraction </option>
                    <option value="*"> Mutiplication </option>
                    <option value="/"> Division </option>
                </select>
      <br/>
      Second operand: <input type="text" name = "secondOperand">
      <br/>
      <button type="submit"> Caculate </button>
  </form>
  </body>
</html>
