<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Feedback</title>
</head>
<body>

<form action="addFeedback">
<center>
<label><h1>Feedback Us</h1></label>
  	<input type="text" name="name" placeholder="Enter your name" required="" /><br><br>
  	<input type="email" name="email" placeholder="Enter your email address" required="" /><br><br>
  	
<textarea name="msg" placeholder="Enter your message" required="" rows="5">
</textarea><br>

<div class="row">
<input type="radio" name="rating"/><br>
	<input type="radio" id="rating-5" name="rating" value="5"/><label for="rating-5"></label>
	<input type="radio" id="rating-4" name="rating" value="4" /><label for="rating-4"></label>
	<input type="radio" id="rating-3" name="rating" value="3" /><label for="rating-3"></label>
	<input type="radio" id="rating-2" name="rating" value="2" /><label for="rating-2"></label>
	<input type="radio" id="rating-1" name="rating" value="1"/><label for="rating-1"></label>
</div>

<input type="reset" value="reset">
<input type="submit" value="submit">
</center>
</form>

</body>
</html>