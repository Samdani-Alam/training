<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>

	<s:form action="verify">
		<s:textfield name="user.uname" label="Enter Username" />
		<br>
		<s:password name="user.password" label="Enter Password" />
		<br>
		<s:submit value="Login" align="center" />
	</s:form>
	
	<br>
	<a href="fwdToUserRegistration.action">User Registration</a>
	<a href="hello.action">Say Hello</a>
	<br>
	<a href="role.action">ROLE SEARCH FORM</a>
	
</body>
</html>