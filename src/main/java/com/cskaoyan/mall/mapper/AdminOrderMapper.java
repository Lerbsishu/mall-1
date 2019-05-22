package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.AdminOrder;

public interface AdminOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminOrder record);

    int insertSelective(AdminOrder record);

    AdminOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminOrder record);

    int updateByPrimaryKey(AdminOrder record);
}