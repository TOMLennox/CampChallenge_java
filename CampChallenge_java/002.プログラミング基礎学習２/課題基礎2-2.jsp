<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    char key = 'あああ';
    switch(key) {
        case 'A':
            out.print("英語");
            break;
        case 'あ':
            out.print("日本語");
            break;
        default:
            out.print("想定外");
            break;
    }
%>
