package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.AdminBrand;

public interface AdminBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminBrand record);

    int insertSelective(AdminBrand record);

    AdminBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminBrand record);

    int updateByPrimaryKey(AdminBrand record);
}