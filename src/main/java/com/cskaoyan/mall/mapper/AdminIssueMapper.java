package com.cskaoyan.mall.mapper;

import com.cskaoyan.mall.bean.AdminIssue;

public interface AdminIssueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminIssue record);

    int insertSelective(AdminIssue record);

    AdminIssue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminIssue record);

    int updateByPrimaryKey(AdminIssue record);
}