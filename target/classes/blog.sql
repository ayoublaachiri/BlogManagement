CREATE DATABASE  IF NOT EXISTS `db_boot_SID`;
USE `db_boot_SID`;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;



--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `titre` varchar(255) NOT NULL,
  `content` varchar(1280) NOT NULL,
  PRIMARY KEY (`titre`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(255) unsigned NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_id` varchar(255) NOT NULL,
  `id_titre` varchar(255) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `fk_user_roleid_idx` (`id_role`),
  KEY `fk_user_titreid_idx` (`id_titre`),
  CONSTRAINT `fk_user_roleid_idx` FOREIGN KEY (`id_role`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
  CONSTRAINT `fk_user_titreid_idx` FOREIGN KEY (`id_titre`) REFERENCES `article` (`titre`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;