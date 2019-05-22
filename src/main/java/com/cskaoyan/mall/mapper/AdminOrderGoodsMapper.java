package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.AdminOrderGoods;

public interface AdminOrderGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminOrderGoods record);

    int insertSelective(AdminOrderGoods record);

    AdminOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminOrderGoods record);

    int updateByPrimaryKey(AdminOrderGoods record);
}