# servletexercise(Login and Logout Using Session in servlet jsp html on Window By Ngann Sophal)<br>
<b>Features:</b><br>
-User Object : (id, email , password , createdDate, urlPhoto) <br>
-Create mockup list of users info 10 records<br>

-Store user info in session Object. <br>
-create login page and servlet to authentication<br>
-If login success --> redirect to myProfile.jsp page ( content is display user info and with logout link). click logout - remove this user from session.<br>
-myProfile.jsp : there is a link which user can upload image.<br>
-create generic error page to handle all errors.<br>
-create filter to trace out log console (system.out.print) with info : remote-ip , Date and timespent per request for all request. ex:<br>
Access from ip : xxx.xxx.xxx - Date - timespent [xx] millis<br>


<b>Run:</b><br>
>Note:https://github.com/ngsophal/servletexercise<br>
Every changing <br>
1: mvn install<br>
2: mvn jetty:run<br>
First: http://localhost:8080/servletexercise/<br>
-Url Filther: http://localhost:8080/servletexercise/myFilter.jsp<br>
-Upload folder C:\workspace\servlet-jsp-html-exercise\uploads<br>

<b>>REfference</b>
http://www.java2s.com/Code/Java/Collections-Data-Structure/Storeuserdefinedobjectsinarraylist.htm
http://www.javatpoint.com/example-to-display-image-using-servlet
http://www.javatpoint.com/servlet-http-session-login-and-logout-example
