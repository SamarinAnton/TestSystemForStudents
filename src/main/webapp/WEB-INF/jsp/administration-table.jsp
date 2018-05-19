<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>Список результатів тестування - Система тестування НАУ</title>
</head>

<body>
    <!-- HEADER -->
    <header class="header">
        <h1 class="title">Список результатів тестування</h1>
        <h2>login: ${login}</h2>
    </header>

    <div class="main">
        <table class="res-table">
            <tbody>
                <tr>
                    <th>Автор : </th>
                    <th>Результат :</th>
                </tr>
            <c:forEach items="${studentList}" var="student">
                <tr>
                    <th>${student.lastName} ${student.firstName}</th>
                    <th>85</th>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <a href="${pageContext.request.contextPath}/administration" class="button ">Вихід</a>

    </div>
    <!-- FOOTER -->
    <footer class="footer">
        Автор проекту : Денисенко Лілія
    </footer>
</body>

</html>