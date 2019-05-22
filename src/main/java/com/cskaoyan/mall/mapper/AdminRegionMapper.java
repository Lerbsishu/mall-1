package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.AdminRegion;

public interface AdminRegionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminRegion record);

    int insertSelective(AdminRegion record);

    AdminRegion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminRegion record);

    int updateByPrimaryKey(AdminRegion record);
}