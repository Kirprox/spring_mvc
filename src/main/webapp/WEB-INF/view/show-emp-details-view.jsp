<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    Dear Employee, you are Welcome!!!
</h2>
<br>
<br>
<br>
<br>
<%--your name: ${param.employeeName}--%>
your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department:${employee.department}
<br>
Your car:${employee.carBrand}
<br>
Language(s) :
<ul>
    <c:forEach var = "lang" items="${employee.languages}">
        <li>   ${lang}  </li>
    </c:forEach>
</ul>
<br>
Your phone number: ${employee.phoneNumber}
<br>
Your email: ${employee.email}
</body>

</html>
