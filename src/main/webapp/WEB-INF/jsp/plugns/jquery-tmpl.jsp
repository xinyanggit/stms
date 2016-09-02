<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<!-- https://github.com/BorisMoore/jquery-tmpl/ -->
<script src="js/jquery-1.7.2.js"></script>
<script src="js/jquery.tmpl.js"></script>
<script type="text/javascript">
	/* $(function() {
		var movies = [ {
			Name : "The Red Violin",
			ReleaseYear : "1998"
		}, {
			Name : "Eyes Wide Shut",
			ReleaseYear : "1999"
		}, {
			Name : "The Inheritance",
			ReleaseYear : "1976"
		} ];

		var markup = "<li><b>${Name}</b> (${ReleaseYear})</li>";
		// Compile the markup as a named template
		$.template("movieTemplate", markup);

		// Render the template with the movies data and insert
		// the rendered HTML under the "movieList" element
		$.tmpl("movieTemplate", movies).appendTo("#movieList");
	}); */

	//Using Remote Data
	/* $(function() {
		var markup = "<li><b>${Name}</b> (${ReleaseYear})</li>";

		// Compile the markup as a named template
		$.template("movieTemplate", markup);

		$.ajax({
			dataType : "jsonp",
			url : moviesServiceUrl,
			jsonp : "$callback",
			success : showMovies
		});

		// Within the callback, use .tmpl() to render the data.
		function showMovies(data) {
			// Render the template with the "movies" data and insert
			// the rendered HTML under the 'movieList' element
			$.tmpl("movieTemplate", data).appendTo("#movieList");
		}
	}); */
	
	
	
	
	
</script>

</head>
<body>

	<div id=movieList></div>
	<br>
	
	<a href="/stms/jqueryTmpl2.action">Example: Render data from a remote service, using jQuery.tmpl()</a>

</body>
</html>

