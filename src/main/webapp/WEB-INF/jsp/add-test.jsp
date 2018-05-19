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

        <form action="${pageContext.request.contextPath}/tasks/add-new-test">
            <div class="form-fild">
                <label for="subject">Тема предмета</label>
                <input type="text" name="subject" id="subject" placeholder="Введите тему предмета">
            </div>
            <div class="form-fild">
                <label for="condition">Прізвище</label>
                <input type="text" name="condition" id="condition" placeholder="Введите условия теста">
            </div>
            <div class="form-fild">
                <label for="answer">Група</label>
                <input type="text" name="answer" id="answer" placeholder="Введите правильный ответ на вопрос">
            </div>
            <div class="form-fild">
                <label for="option">Группа</label>
                <input type="text" name="option" id="option" placeholder="Введите ответы на вопрос">
            </div>
            <div class="form-fild">
                <button type="submit" value="Submit" class="button button_ytheme">Добавить тест</button>
            </div>
        </form>

    </div>
    <!-- FOOTER -->
    <footer class="footer">
        Автор проекту : Денисенко Лілія
    </footer>
</body>

</html>