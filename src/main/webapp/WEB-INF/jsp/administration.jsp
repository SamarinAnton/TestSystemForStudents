<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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

    <title>Сторінка адміністратора - Система тестування НАУ</title>
</head>

<body>
    <!-- HEADER -->
    <header class="header">
        <h1 class="title">Сторінка адміністратора</h1>
        <h2>login: ${login}, your status: ${status}</h2>
    </header>

    <div class="main">
        <a href="${pageContext.request.contextPath}/administration-table" class="button ">Список результатів тестування</a>
        <a href="${pageContext.request.contextPath}/tasks/new-test" class="button ">Створення нового тесту</a>
        <a href="${pageContext.request.contextPath}/exit" class="button ">Вихід</a>
    
    </div>
    <!-- FOOTER -->
    <footer class="footer">
        Автор проекту : Денисенко Лілія
    </footer>
</body>

</html>