<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<h1>This is the signup page</h1>
<form:form action="done" modelAttribute="car">
Car Number: 
<form:input path="RegisterationNumber" />
<br/>
Car Name:
<form:select path="CarName">
<form:option value="Seltos">Seltos</form:option>
<form:option value="Sonnet">Sonnet</form:option>
</form:select>
<br/>
Covered In Warranty:
<form:select path="CarDetails">
<form:option value="Yes">Yes</form:option>
<form:option value="No">No</form:option>
</form:select>
<br/>
Any remarks:
<form:input path="CarWork" />
<br/>
<input type="submit" value="Submit">
</form:form>

</html>
