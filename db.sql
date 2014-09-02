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
