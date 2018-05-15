<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="краткое описание">
  <meta name="keywords" content="разные, ключевые, слова">
  <link rel="shortcut icon" href="#" />

  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/fonts.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/normalize.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/media.css">

  <title>Авторизація в системі - Система тестування НАУ</title>
</head>

<body>
<!-- HEADER -->
<header class="header">
  <h1 class="title">${title}</h1>
</header>

<div class="main">

  <form action="#">
    <div class="form-fild">
      <label for="login">Логін</label>
      <input type="text" name="login" id="login">
    </div>
    <div class="form-fild">
      <label for="password">Пароль</label>
      <input type="password" name="password" id="password">
    </div>
    <div class="form-fild">
      <a href="#" class="button button_ytheme">Вхід</a>
      <a href="${pageContext.request.contextPath}/registration" class="button button_btheme">Реєстрація</a>
    </div>
  </form>

</div>
<!-- FOOTER -->
<footer class="footer">
  Автор проекту : Денисенко Лілія
</footer>
</body>

</html>