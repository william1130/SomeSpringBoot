package org.wm.someSB.dao;

import org.apache.ibatis.annotations.Mapper;
import org.wm.someSB.model.SysUser;

import java.util.List;

@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);

    SysUser findByName(String username);
}