
DROP TABLE IF EXISTS `order_main`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_code` varchar(40) DEFAULT NULL,
  `order_status` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
