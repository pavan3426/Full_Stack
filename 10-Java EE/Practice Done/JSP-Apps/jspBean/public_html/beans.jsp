<%@ page import="jspbean.JavaLanguageBean" %>

<jsp:useBean id="languageBean" scope="page" class="jspbean.JavaLanguageBean" />
<jsp:setProperty name="languageBean" property="*" />

<HTML>
<HEAD>
    <TITLE>UseBean Action Test</TITLE>
</HEAD>

<BODY>
    <h1>UseBean Action Test Result</h1>
    <p>Hello, <jsp:getProperty name="languageBean" property="name" />.</p>

    <p>Your Favorite Language is 
        <jsp:getProperty name="languageBean" property="language" />.</p>

    <p>My Comments on Your Language:</p>

    <p><jsp:getProperty name="languageBean" property="languageComments" /></p>
</BODY>
</HTML>
