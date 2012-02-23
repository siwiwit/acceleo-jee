SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `newtimetracker` DEFAULT CHARACTER SET latin1 ;
USE `newtimetracker` ;

-- -----------------------------------------------------
-- Table `newtimetracker`.`users`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `newtimetracker`.`users` (
  `user_id` BIGINT(20) NOT NULL AUTO_INCREMENT ,
  `username` VARCHAR(200) NULL DEFAULT NULL ,
  `password` VARCHAR(200) NULL DEFAULT NULL ,
  `firstName` VARCHAR(200) NULL DEFAULT NULL ,
  `lastName` VARCHAR(200) NULL DEFAULT NULL ,
  `email` VARCHAR(200) NULL DEFAULT NULL ,
  `isActive` BIT(1) NULL DEFAULT NULL ,
  `creationDate` DATE NULL DEFAULT NULL ,
  `comment` VARCHAR(200) NULL DEFAULT NULL ,
  PRIMARY KEY (`user_id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 106
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `newtimetracker`.`timecards`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `newtimetracker`.`timecards` (
  `timecard_id` BIGINT(20) NOT NULL AUTO_INCREMENT ,
  `status` VARCHAR(200) NULL DEFAULT NULL ,
  `startDate` DATE NULL DEFAULT NULL ,
  `comments` VARCHAR(200) NULL DEFAULT NULL ,
  `user_approver` BIGINT(20) NOT NULL ,
  `user_submitter` BIGINT(20) NOT NULL ,
  `users_user_id` BIGINT(20) NOT NULL ,
  PRIMARY KEY (`timecard_id`) ,
  UNIQUE INDEX `user_approver` (`user_approver` ASC) ,
  UNIQUE INDEX `user_submitter` (`user_submitter` ASC) ,
  CONSTRAINT `fk_timecards_users`
    FOREIGN KEY (`user_approver` )
    REFERENCES `newtimetracker`.`users` (`user_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_timecards_users1`
    FOREIGN KEY (`user_submitter` )
    REFERENCES `newtimetracker`.`users` (`user_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 54
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `newtimetracker`.`timeallocations`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `newtimetracker`.`timeallocations` (
  `timeallocation_id` BIGINT(20) NOT NULL AUTO_INCREMENT ,
  `startTime` DATE NULL DEFAULT NULL ,
  `endTime` DATE NULL DEFAULT NULL ,
  `task_task` BIGINT(20) NOT NULL ,
  `timecard_timecard` BIGINT(20) NOT NULL ,
  PRIMARY KEY (`timeallocation_id`) ,
  UNIQUE INDEX `task_task` (`task_task` ASC) ,
  UNIQUE INDEX `timecard_timecard` (`timecard_timecard` ASC) ,
  CONSTRAINT `fk_timeallocations_timecards1`
    FOREIGN KEY (`timecard_timecard` )
    REFERENCES `newtimetracker`.`timecards` (`timecard_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 29
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `newtimetracker`.`tasks`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `newtimetracker`.`tasks` (
  `task_id` BIGINT(20) NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(200) NULL DEFAULT NULL ,
  `timeallocation_timeallocations` BIGINT(20) NOT NULL ,
  PRIMARY KEY (`task_id`, `timeallocation_timeallocations`) ,
  INDEX `fk_tasks_timeallocations1` (`timeallocation_timeallocations` ASC) ,
  CONSTRAINT `fk_tasks_timeallocations1`
    FOREIGN KEY (`timeallocation_timeallocations` )
    REFERENCES `newtimetracker`.`timeallocations` (`timeallocation_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 64
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `newtimetracker`.`testinheristances`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `newtimetracker`.`testinheristances` (
  `timeallocation_id` BIGINT(20) NOT NULL AUTO_INCREMENT ,
  PRIMARY KEY (`timeallocation_id`) ,
  CONSTRAINT `fk_testinheristances_timeallocations1`
    FOREIGN KEY (`timeallocation_id` )
    REFERENCES `newtimetracker`.`timeallocations` (`timeallocation_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `newtimetracker`.`userroles`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `newtimetracker`.`userroles` (
  `userrole_id` BIGINT(20) NOT NULL AUTO_INCREMENT ,
  `role` VARCHAR(200) NULL DEFAULT NULL ,
  `user_user` BIGINT(20) NOT NULL ,
  PRIMARY KEY (`userrole_id`) ,
  INDEX `fk_userroles_users1` (`user_user` ASC) ,
  CONSTRAINT `fk_userroles_users1`
    FOREIGN KEY (`user_user` )
    REFERENCES `newtimetracker`.`users` (`user_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = latin1;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
