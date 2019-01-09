package org.wm.someSB.dao;

import org.apache.ibatis.annotations.Mapper;
import org.wm.someSB.model.SysRole;

import java.util.List;

@Mapper
public interface SysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
    
    List<SysRole> selectByUserId(Long userId);
}