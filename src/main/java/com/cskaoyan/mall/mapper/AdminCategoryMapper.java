package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.AdminCategory;

public interface AdminCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminCategory record);

    int insertSelective(AdminCategory record);

    AdminCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminCategory record);

    int updateByPrimaryKey(AdminCategory record);
}