<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>GestDepo</h2>

<s:if test="#session.loginId != null">
	<s:actionmessage />
	<s:actionerror/>
	<s:a action="logOut">LogOut</s:a>
	
</s:if>
<s:else>
	
	<s:form action="loginUser">
		<s:actionmessage />
		<s:actionerror />
		
		<s:textfield id="userName" name="userName" key="login.user.name" />
		<s:submit />
	</s:form>
	
</s:else>