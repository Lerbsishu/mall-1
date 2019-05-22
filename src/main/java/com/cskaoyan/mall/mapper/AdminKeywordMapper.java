package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.AdminKeyword;

public interface AdminKeywordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminKeyword record);

    int insertSelective(AdminKeyword record);

    AdminKeyword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminKeyword record);

    int updateByPrimaryKey(AdminKeyword record);
}