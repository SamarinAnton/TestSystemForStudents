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

    <title>Добавление новых тестов</title>
</head>

<body>
    <!-- HEADER -->
    <header class="header">
        <h1 class="title">Добавление новых тестов</h1>
    </header>

    <div class="main">

        <form action="${pageContext.request.contextPath}/add-new-test">
            <div class="form-fild">
                <label for="name">Ім'я</label>
                <input type="text" name="name" id="name" placeholder="Введіть ім'я">
            </div>
            <div class="form-fild">
                <label for="surname">Прізвище</label>
                <input type="text" name="surname" id="surname" placeholder="Введіть прізвище">
            </div>
            <div class="form-fild">
                <label for="group">Група</label>
                <input type="number" name="group" id="group" placeholder="Введіть номер групи">
            </div>
            <div class="form-fild">
                <label for="group">Группа</label>
                <input type="text" name="groupUser" id="groupUser" placeholder="Введите вашу категорию группы">
            </div>
            <div class="form-fild">
                <label for="login">Логін</label>
                <input type="text" name="login" id="login" placeholder="Введіть введіть логін">
            </div>
            <div class="form-fild">
                <label for="password">Пароль</label>
                <input type="password" name="password" id="password" placeholder="Введіть пароль">
            </div>
            <div class="form-fild">
                <button type="submit" value="Submit" class="button button_ytheme">Зберегти</button>
            </div>
        </form>

    </div>
    <!-- FOOTER -->
    <footer class="footer">
        Автор проекту : Денисенко Лілія
    </footer>
</body>

</html>