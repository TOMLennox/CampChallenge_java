<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    for(int i = 1; i <= 20; i++){
        out.println(Math.pow(8, i));
    }
%>
// 結果をlong型に指定しなければ表示できず。
