/*
 Navicat Premium Data Transfer

 Source Server         : 106.52.14.176
 Source Server Type    : MySQL
 Source Server Version : 50734 (5.7.34-log)
 Source Host           : 106.52.14.176:3306
 Source Schema         : yamis

 Target Server Type    : MySQL
 Target Server Version : 50734 (5.7.34-log)
 File Encoding         : 65001

 Date: 27/11/2023 11:05:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin_menus
-- ----------------------------
DROP TABLE IF EXISTS `admin_menus`;
CREATE TABLE `admin_menus`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL DEFAULT 0,
  `order` int(11) NOT NULL DEFAULT 0,
  `title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '菜单名称',
  `icon` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '菜单图标',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '菜单路由',
  `url_type` tinyint(4) NOT NULL DEFAULT 1 COMMENT '路由类型(1:路由,2:外链)',
  `visible` tinyint(4) NOT NULL DEFAULT 1 COMMENT '是否可见',
  `is_home` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否为首页',
  `extension` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '扩展',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_menus
-- ----------------------------
INSERT INTO `admin_menus` VALUES (1, 0, 0, '控制台', 'mdi:chart-line', '/dashboard', 1, 1, 1, NULL, '2023-09-24 13:18:00', '2023-11-26 19:29:35');
INSERT INTO `admin_menus` VALUES (2, 0, 0, '系统管理', 'material-symbols:settings-outline', '/system', 1, 1, 0, NULL, '2023-09-24 13:18:00', '2023-11-26 19:29:33');
INSERT INTO `admin_menus` VALUES (3, 2, 0, '管理员', 'ph:user-gear', '/sys/admin/admin-users/list-view', 1, 1, 0, NULL, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_menus` VALUES (4, 2, 0, '角色', 'carbon:user-role', '/sys/admin/admin-roles/list-view', 1, 1, 0, NULL, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_menus` VALUES (5, 2, 0, '权限', 'fluent-mdl2:permissions', '/system/admin_permissions', 1, 1, 0, NULL, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_menus` VALUES (6, 2, 0, '菜单', 'ant-design:menu-unfold-outlined', '/sys/menus/admin-menus/list-view', 1, 1, 0, NULL, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_menus` VALUES (7, 2, 0, '设置', 'akar-icons:settings-horizontal', '/system/settings', 1, 1, 0, NULL, '2023-09-24 13:18:00', '2023-11-26 18:53:08');
INSERT INTO `admin_menus` VALUES (8, 0, 0, '代码生成器', 'ph:circle', '/gen-code-view', 1, 1, 0, NULL, '2023-09-25 13:57:39', '2023-11-26 19:25:05');

-- ----------------------------
-- Table structure for admin_permission_menu
-- ----------------------------
DROP TABLE IF EXISTS `admin_permission_menu`;
CREATE TABLE `admin_permission_menu`  (
  `permission_id` int(11) NOT NULL,
  `menu_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  INDEX `admin_permission_menu_permission_id_menu_id_index`(`permission_id`, `menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_permission_menu
-- ----------------------------
INSERT INTO `admin_permission_menu` VALUES (1, 1, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (2, 2, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (3, 3, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (2, 3, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (4, 4, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (2, 4, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (5, 5, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (2, 5, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (6, 6, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (2, 6, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (7, 7, '2023-09-24 13:18:01', '2023-09-24 13:18:01');
INSERT INTO `admin_permission_menu` VALUES (2, 7, '2023-09-24 13:18:01', '2023-09-24 13:18:01');

-- ----------------------------
-- Table structure for admin_permissions
-- ----------------------------
DROP TABLE IF EXISTS `admin_permissions`;
CREATE TABLE `admin_permissions`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `slug` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `http_method` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  `http_path` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  `order` int(11) NOT NULL DEFAULT 0,
  `parent_id` int(11) NOT NULL DEFAULT 0,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `admin_permissions_name_unique`(`name`) USING BTREE,
  UNIQUE INDEX `admin_permissions_slug_unique`(`slug`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_permissions
-- ----------------------------
INSERT INTO `admin_permissions` VALUES (1, '首页', 'home', NULL, '[\'/home*\']', 0, 0, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_permissions` VALUES (2, '系统', 'system', NULL, '', 0, 0, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_permissions` VALUES (3, '管理员', 'admin_users', NULL, '[\'/admin_users*\']', 0, 2, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_permissions` VALUES (4, '角色', 'roles', NULL, '[\'/roles*\']', 0, 2, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_permissions` VALUES (5, '权限', 'permissions', NULL, '[\'/permissions*\']', 0, 2, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_permissions` VALUES (6, '菜单', 'menus', NULL, '[\'/menus*\']', 0, 2, '2023-09-24 13:18:00', '2023-09-24 13:18:00');
INSERT INTO `admin_permissions` VALUES (7, '设置', 'settings', NULL, '[\'/settings*\']', 0, 2, '2023-09-24 13:18:00', '2023-09-24 13:18:00');

-- ----------------------------
-- Table structure for admin_role_users
-- ----------------------------
DROP TABLE IF EXISTS `admin_role_users`;
CREATE TABLE `admin_role_users`  (
  `role_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  INDEX `admin_role_users_role_id_user_id_index`(`role_id`, `user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_role_users
-- ----------------------------
INSERT INTO `admin_role_users` VALUES (1, 1, '2023-09-24 13:17:59', '2023-09-24 13:17:59');

-- ----------------------------
-- Table structure for admin_roles
-- ----------------------------
DROP TABLE IF EXISTS `admin_roles`;
CREATE TABLE `admin_roles`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '角色名',
  `slug` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标识',
  `created_at` timestamp NULL DEFAULT NULL COMMENT '开始时间',
  `updated_at` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `admin_roles_name_unique`(`name`) USING BTREE,
  UNIQUE INDEX `admin_roles_slug_unique`(`slug`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_roles
-- ----------------------------
INSERT INTO `admin_roles` VALUES (1, 'Administrator', 'administrator', '2023-09-24 13:17:59', '2023-09-24 13:17:59');

-- ----------------------------
-- Table structure for admin_settings
-- ----------------------------
DROP TABLE IF EXISTS `admin_settings`;
CREATE TABLE `admin_settings`  (
  `key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `values` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_settings
-- ----------------------------

-- ----------------------------
-- Table structure for admin_users
-- ----------------------------
DROP TABLE IF EXISTS `admin_users`;
CREATE TABLE `admin_users`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `remember_token` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `admin_users_username_unique`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_users
-- ----------------------------
INSERT INTO `admin_users` VALUES (1, 'admin', 'e10adc3949ba59abbe56e057f20f883e', 'Administrator', '/logo.png', NULL, '2023-09-24 13:17:59', '2023-09-24 13:17:59');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `remember_token` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `users_email_unique`(`email`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
