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

    <title>Тестування - Система тестування НАУ</title>
</head>

<body>
    <!-- HEADER -->
    <header class="header header_theme">
        <h1 class="title">Тестування за предметом : #</h1>
        <h2>Ваш логин: ${login}</h2>
    </header>

    <div class="main main_theme">
        <div class="group-test">
            <a href="#" class="number-test">1</a>
            <a href="#" class="number-test">2</a>
            <a href="#" class="number-test">3</a>
            <a href="#" class="number-test">4</a>
            <a href="#" class="number-test">5</a>
            <a href="#" class="number-test">6</a>
            <a href="#" class="number-test">7</a>
            <a href="#" class="number-test">8</a>
            <a href="#" class="number-test">9</a>
            <a href="#" class="number-test">10</a>
            <a href="#" class="number-test">11</a>
            <a href="#" class="number-test">12</a>
            <a href="#" class="number-test">13</a>
            <a href="#" class="number-test">14</a>
            <a href="#" class="number-test">15</a>
            <a href="#" class="number-test">16</a>
            <a href="#" class="number-test">17</a>
            <a href="#" class="number-test">18</a>
            <a href="#" class="number-test">19</a>
            <a href="#" class="number-test">20</a>
        </div>
        <div class="task">
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatem labore voluptates illo vitae reprehenderit enim unde
                facere assumenda iure! Assumenda temporibus iusto expedita saepe ipsam sit. Vel voluptatibus officia quaerat.
            </p>
        </div>
        <div class="answer">
            <ul class="answer__list">
                <li class="answer__item">
                    <span>Вибиріть відповідь :</span>
                </li>
                <li class="answer__item">
                    <input type="checkbox" class="checkbox" id="A" />
                    <label for="A">А. Текст відповіді</label>
                </li>
                <li class="answer__item">
                    <input type="checkbox" class="checkbox" id="B" />
                    <label for="B">Б. Текст відповіді</label>
                </li>
                <li class="answer__item">
                    <input type="checkbox" class="checkbox" id="C" />
                    <label for="C">В. Текст відповіді</label>
                </li>
            </ul>




        </div>

        <a href="#" class="button">Відповісти</a>

    </div>
    <!-- FOOTER -->
    <footer class="footer footer_theme">
        Автор проекту : Денисенко Лілія
    </footer>
</body>

</html>