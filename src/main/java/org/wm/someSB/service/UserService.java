package org.wm.someSB.service;

import org.springframework.http.ResponseEntity;
import org.wm.someSB.model.SysRole;
import org.wm.someSB.model.SysUser;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface UserService {

    String getUser(int id);

    ResponseEntity register(SysUser user);
    
    SysUser findByName(String username);
    
    List<SysRole> selectByUserId(int userId);
}
