<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation</title>
</head>

<body>
<!-- Background call to student.getters with student.xxx -->
The student is confirmed: ${student.firstName} ${student.lastName}
<br>
The student's country is: ${student.country}
<br>
The student's other country is: ${student.countryAlt}
<br>
The student's favorite programming language: ${student.favoriteLanguage}
<br>
Operating systems experience:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> ${temp} </li>
    </c:forEach>
</ul>  
</body>

</html>