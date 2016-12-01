<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<String> al = 
new ArrayList<String>();

    al.add("10");
    al.add("100");
    al.add("soeda");
    al.add("hayashi");
    al.add("-20");
    al.add("118");
    al.add("END");

    out.println(al.get(1));

    al.set(2, "33");
    out.println(al.get(2));
%>
