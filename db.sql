DROP DATABASE IF EXISTS `voter`;
CREATE database voter character set utf8;

use voter;

DROP TABLE IF EXISTS `Section`;
CREATE TABLE `Section` (
      `id` int NOT NULL AUTO_INCREMENT,
      `name` varchar(40) NOT NULL,
      `description` varchar(600) NOT NULL,
      `status` tinyint,
      PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `Section` (`id`, `name`, `description`, `status`) VALUES (1, 'sec1', 'desc1', 1);
INSERT INTO `Section` (`id`, `name`, `description`, `status`) VALUES (2, 'sec2', 'desc2', 1);
INSERT INTO `Section` (`id`, `name`, `description`, `status`) VALUES (3, 'sec3', 'desc3', 1);
INSERT INTO `Section` (`id`, `name`, `description`, `status`) VALUES (4, 'sec4', '中文', 1);

DROP TABLE IF EXISTS `Survey`;
CREATE TABLE `Survey` (
    `id` int NOT NULL AUTO_INCREMENT,
    `title` varchar(140) NOT NULL,
    `description` varchar(600) NOT NULL,
    `status` tinyint,
    `holder` varchar(40) NOT NULL,
    `sectionId` int,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`sectionId`) REFERENCES `Section`(`id`)
    ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `Survey` (`id`, `title`, `description`, `status`, `holder`, `sectionId`) VALUES (1, 'how old are you?', 'as you see', 1, 'admin', 4);
INSERT INTO `Survey` (`id`, `title`, `description`, `status`, `holder`, `sectionId`) VALUES (2, 'how are you?', 'as you see', 1, 'admin', 3);
INSERT INTO `Survey` (`id`, `title`, `description`, `status`, `holder`, `sectionId`) VALUES (3, 'how much do you want?', 'as you see', 1, 'admin', 2);
INSERT INTO `Survey` (`id`, `title`, `description`, `status`, `holder`, `sectionId`) VALUES (4, 'where are you from?', 'as you see', 1, 'admin', 1);
