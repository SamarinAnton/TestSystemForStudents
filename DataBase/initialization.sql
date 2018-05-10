START TRANSACTION;
USE `TestSystem`;
INSERT INTO `users` (`id`, `login`, `password`, `status`) VALUES (DEFAULT, 'teacher1', 'teacher1', 'TEACHER');
INSERT INTO `users` (`id`, `login`, `password`, `status`) VALUES (DEFAULT, 'teacher2', 'teacher2', 'TEACHER');
INSERT INTO `users` (`id`, `login`, `password`, `status`) VALUES (DEFAULT, 'student1', 'student1', 'STUDENT');
INSERT INTO `users` (`id`, `login`, `password`, `status`) VALUES (DEFAULT, 'student2', 'student2', 'STUDENT');
INSERT INTO `users` (`id`, `login`, `password`, `status`) VALUES (DEFAULT, 'student3', 'student3', 'STUDENT');

COMMIT;


START TRANSACTION;
USE `TestSystem`;
INSERT INTO `teachers` (id, users_id, first_name, last_name) VALUE (DEFAULT, 1, 'Alex', 'Markov');
INSERT INTO `teachers` (id, users_id, first_name, last_name) VALUE (DEFAULT, 2, 'Konstantin', 'Petrov');

COMMIT;


START TRANSACTION;
USE `TestSystem`;
INSERT INTO `students` (id, users_id, first_name, last_name) VALUE (DEFAULT, 3, 'Pavel', 'Orlov');
INSERT INTO `students` (id, users_id, first_name, last_name) VALUE (DEFAULT, 4, 'Andrey', 'Nechaev');
INSERT INTO `students` (id, users_id, first_name, last_name) VALUE (DEFAULT, 5, 'Sergey', 'Rublev');

COMMIT;


START TRANSACTION;
USE `TestSystem`;
INSERT INTO `lessons` (id, subject) VALUE (DEFAULT, 'Mathematics');
INSERT INTO `lessons` (id, subject) VALUE (DEFAULT, 'Chemistry');
INSERT INTO `lessons` (id, subject) VALUE (DEFAULT, 'Programming');

COMMIT;


START TRANSACTION;
USE `TestSystem`;
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 1, 'How rational numbers are denoted?', 'Q', 'N~Z~R~Q');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 1, '1 + 2?', '3', '1~2~3~4~5');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 1, 'What is the first digit of the number pi?', '3', '4~1~3');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 2, 'How many protons has lithium?', '3', '4~1~3~2~0');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 2, 'Where metal is on the list?', 'Fr', 'C~Br~Fr~S');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 2, 'Chemistry is cool?', 'Yes', 'Yes~No');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 3, 'What is programming language object-oriented?', 'Java', 'Haskell~Java~C~Perl');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 3, 'What is DBMS we use?', 'MySQL', 'MySQL~MongoDB~Oracle');
INSERT INTO `tasks` (id, lessons_id, `condition`, answer, options) VALUE (DEFAULT, 3, 'What is more popular language for ML?', 'Python', 'Python~R~C++~Rust');

COMMIT;
