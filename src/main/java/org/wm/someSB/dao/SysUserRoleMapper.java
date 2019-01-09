package org.wm.someSB.dao;

import org.apache.ibatis.annotations.Mapper;
import org.wm.someSB.model.SysUserRole;

import java.util.List;

@Mapper
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long id);

    List<SysUserRole> selectAll();

    int updateByPrimaryKey(SysUserRole record);
}