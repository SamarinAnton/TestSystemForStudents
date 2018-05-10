-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema `TestSystem`
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `TestSystem` ;

-- -----------------------------------------------------
-- Schema `TestSystem`
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `TestSystem` DEFAULT CHARACTER SET utf8 ;
USE `TestSystem` ;

-- -----------------------------------------------------
-- Table `TestSystem`.`users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TestSystem`.`users` ;

CREATE TABLE IF NOT EXISTS `TestSystem`.`users` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `status` ENUM ('TEACHER', 'STUDENT') NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TestSystem`.`teachers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TestSystem`.`teachers` ;

CREATE TABLE IF NOT EXISTS `TestSystem`.`teachers` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `users_id` INT UNSIGNED NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_teachers_users1_idx` (`users_id` ASC),
  CONSTRAINT `fk_teachers_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `TestSystem`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TestSystem`.`lessons`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TestSystem`.`lessons` ;

CREATE TABLE IF NOT EXISTS `TestSystem`.`lessons` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TestSystem`.`tasks`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TestSystem`.`tasks` ;

CREATE TABLE IF NOT EXISTS `TestSystem`.`tasks` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `lessons_id` INT UNSIGNED NOT NULL,
  `condition` TEXT NOT NULL,
  `answer` VARCHAR(45) NOT NULL,
  `options` TEXT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tasks_lessons1_idx` (`lessons_id` ASC),
  CONSTRAINT `fk_tasks_lessons1`
    FOREIGN KEY (`lessons_id`)
    REFERENCES `TestSystem`.`lessons` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TestSystem`.`students`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TestSystem`.`students` ;

CREATE TABLE IF NOT EXISTS `TestSystem`.`students` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `users_id` INT UNSIGNED NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_students_users_idx` (`users_id` ASC),
  CONSTRAINT `fk_students_users`
    FOREIGN KEY (`users_id`)
    REFERENCES `TestSystem`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TestSystem`.`history`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TestSystem`.`history` ;

CREATE TABLE IF NOT EXISTS `TestSystem`.`history` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  ` time` DATETIME NOT NULL DEFAULT NOW(),
  `right` INT UNSIGNED NOT NULL,
  `all` INT UNSIGNED NOT NULL,
  `lessons_id` INT UNSIGNED NOT NULL,
  `users_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_history_lessons1_idx` (`lessons_id` ASC),
  INDEX `fk_history_users1_idx` (`users_id` ASC),
  CONSTRAINT `fk_history_lessons1`
    FOREIGN KEY (`lessons_id`)
    REFERENCES `TestSystem`.`lessons` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_history_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `TestSystem`.`students` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

