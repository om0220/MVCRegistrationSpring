<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.model.Person" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person List</title>
</head>
<body>

<h2>Registered Persons</h2>

<table border="1" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>GENDER</th>
        <th>ADDRESS</th>
        <th>CITY</th>
        <th>STATE</th>
        <th>Email</th>
        <th>PASSWORD</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>

    <%
        List<Person> list = (List<Person>) request.getAttribute("list");
        if (list != null) {
            for (Person p : list) {
    %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getGender() %></td>
        <td><%= p.getAddress() %></td>
        <td><%= p.getCity() %></td>
        <td><%= p.getState() %></td>
        <td><%= p.getEmail() %></td>
        <td><%= p.getPassword() %></td>
        <td>
            <form action="edit" method="post">
                <input type="hidden" name="id" value="<%= p.getId() %>">
                <input type="submit" value="Edit" style="background-color:blue; color:white;">
            </form>
        </td>
        <td>
            <form action="delete" method="post">
                <input type="hidden" name="id" value="<%= p.getId() %>">
                <input type="submit" value="Delete" style="background-color:red; color:white;">
            </form>
        </td>
    </tr>
    <%
            }
        } else {
    %>
        <tr><td colspan="10">No data available</td></tr>
    <%
        }
    %>
</table>

<br>
<a href="index">Add New Person</a>

</body>
</html>
