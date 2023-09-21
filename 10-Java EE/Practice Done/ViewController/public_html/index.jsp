<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
  <html>
    <head>
      <meta http-equiv="Content-Type"
            content="text/html; charset=windows-1252"/>
      <title>index</title>
    </head>
    <body>
      <h:form>
      
      <center>
        <h2>
            <f:actionListener/>
            Please provide your Login Details </h2>
        <table> 
            <tr>
                <td> UserName : </td>
                <td> <h:inputText value= "#{lbRef.userName}" /></td>
                </tr>
                
             <tr>
                <td> Passsword : </td>
                <td> <h:inputSecret value= "#{lbRef.password}" required="true">
                  <f:validateLength/>
                  <f:validateLength minimum="6" maximum="20"/>
                  <f:valueChangeListener/>
                </h:inputSecret></td>
                </tr>
                
                <tr>
                    <td> <h:commandButton value= "Login" action=  "#{lbRef.navigate}" >
                  <f:actionListener type="training.iqgateway.banking.OurActionListener"/>
                  <f:actionListener/>
                </h:commandButton> </td>
                </tr>
                </table>
                <h:messages/>
                
        
      </center>
      </h:form>
    </body>
  </html>
</f:view>