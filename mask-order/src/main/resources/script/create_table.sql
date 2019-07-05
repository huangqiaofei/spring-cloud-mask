CREATE TABLE `order_main` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '订单号',
  `order_status` tinyint(2) NOT NULL COMMENT '订单状态',
  `payment` decimal(10,2) NOT NULL COMMENT '实际付款金额',
  `user_id` bigint(11) NOT NULL COMMENT '用户id',
  `shipping_id` bigint(11) NOT NULL COMMENT '商店id',
  `payment_type` tinyint(2) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `payment_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_order_no` (`order_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin