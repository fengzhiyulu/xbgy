/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : xbgy

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2016-09-25 22:45:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `accountId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `fullName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`accountId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'test01', '张三', 'test01');
INSERT INTO `account` VALUES ('2', 'test02', '李四', 'test02');

-- ----------------------------
-- Table structure for `account_role`
-- ----------------------------
DROP TABLE IF EXISTS `account_role`;
CREATE TABLE `account_role` (
  `aid` int(11) NOT NULL DEFAULT '0',
  `rid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`aid`,`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account_role
-- ----------------------------
INSERT INTO `account_role` VALUES ('1', '1');
INSERT INTO `account_role` VALUES ('2', '2');

-- ----------------------------
-- Table structure for `privilege`
-- ----------------------------
DROP TABLE IF EXISTS `privilege`;
CREATE TABLE `privilege` (
  `priId` int(11) NOT NULL AUTO_INCREMENT,
  `priName` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`priId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of privilege
-- ----------------------------
INSERT INTO `privilege` VALUES ('1', '管理员页面');
INSERT INTO `privilege` VALUES ('2', '用户页面');

-- ----------------------------
-- Table structure for `privilege_role`
-- ----------------------------
DROP TABLE IF EXISTS `privilege_role`;
CREATE TABLE `privilege_role` (
  `pid` int(11) NOT NULL DEFAULT '0',
  `rid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`rid`,`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of privilege_role
-- ----------------------------
INSERT INTO `privilege_role` VALUES ('1', '1');
INSERT INTO `privilege_role` VALUES ('2', '1');
INSERT INTO `privilege_role` VALUES ('2', '2');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(200) DEFAULT NULL,
  `roleDesc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ADMIN', '管理员账户');
INSERT INTO `role` VALUES ('2', 'USER', '普通账户');

-- ----------------------------
-- Table structure for `url`
-- ----------------------------
DROP TABLE IF EXISTS `url`;
CREATE TABLE `url` (
  `urlId` int(11) NOT NULL AUTO_INCREMENT,
  `urlName` varchar(200) DEFAULT NULL,
  `priId` int(11) DEFAULT NULL,
  PRIMARY KEY (`urlId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of url
-- ----------------------------
INSERT INTO `url` VALUES ('1', '/admin/save.jsp', '1');
INSERT INTO `url` VALUES ('2', '/admin/save2.jsp', '1');
INSERT INTO `url` VALUES ('3', '/user/save.jsp', '2');
INSERT INTO `url` VALUES ('4', '/user/save2.jsp', '2');
