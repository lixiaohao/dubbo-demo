/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-11-14 15:15:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `ID` int(11) DEFAULT NULL,
  `USER_NAEM` varchar(255) DEFAULT NULL,
  `USER_PASS` varchar(255) DEFAULT NULL,
  `USER_AGE` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2', '消息', '123456', '50');
INSERT INTO `t_user` VALUES ('11', 'zhangsan', '123456', '28');
INSERT INTO `t_user` VALUES ('32', 'fasfad', 'ffasfda', '3124');
INSERT INTO `t_user` VALUES ('33', 'dddd', 'dddd', '333344');
INSERT INTO `t_user` VALUES ('44', '3333', '3333', '33333');
INSERT INTO `t_user` VALUES ('555', 'zhangsan', '5555', '5555');
INSERT INTO `t_user` VALUES ('15', '3333', '敢死队高2532', '22');
INSERT INTO `t_user` VALUES ('15', 'ques', '敢死队高2532', '22');
