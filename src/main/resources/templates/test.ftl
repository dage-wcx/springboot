<html>
	<head>
		<title>测试</title>
		<meta charset="utf-8"></meta>
	</head>
	
	<body>
		<table align="center" border="1" width="50%">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>password</th>
			</tr>
			<#list list as user>
				<tr>
					<td>${user.id}</td>
					<td>${user.username}</td>
					<td>${user.password}</td>
				</tr>
			</#list>
		</table>
	</body>
</html>