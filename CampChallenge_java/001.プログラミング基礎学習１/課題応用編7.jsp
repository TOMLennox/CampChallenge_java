<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

String hensu1 = request.getParameter("雑貨");    // 2が入ります
String hensu2 = request.getParameter("生鮮食品");    // 300が入ります
String hensu3 = request.getParameter("その他");    // 40が入ります
   out.print(hensu1);
%>


