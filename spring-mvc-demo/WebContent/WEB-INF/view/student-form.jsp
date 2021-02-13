<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Input Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input type="text" path="firstName"
            placeholder="What's your first name?" />
        <br>
        Last name: <form:input type="text" path="lastName"
            placeholder="What's your last name?" />
        <br><br>
        Country:
        <form:select path="country">
            <form:option value="USA" label="USA" />
			<form:option value="UK" label="United Kingdom" />
			<form:option value="GER" label="Germany" />
			<form:option value="PRC" label="China" />
		</form:select>

   <!-- Second alternative: populate selector out of bean
        <br>        		
		Alt. Country:
		<form:select path="countryAlt">
			<form:options items="${student.countryOptions}" />
		</form:select>
	-->
   	
    <!-- Third alternative: populated out of properties file via model
        <br>        		
		Alt. 2 Country:
		<form:select path="countryAlt">
			<form:options items="${myCountryOptions}" />
		</form:select>
	-->
	    <br>
	    Favorite language:
	    Java <form:radiobutton path="favoriteLanguage" value="Java" />
	    C# <form:radiobutton path="favoriteLanguage" value="C#" />
	    
	    <br>
	    Operating systems:
	    Linux <form:checkbox path="operatingSystems" value="Linux" />
	    Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
	    MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
	        
	    <br>	 	
		<input type="submit" />
    <!-- Background call to student.setters for each path="..."  -->    
    </form:form>  
</body>
</html>