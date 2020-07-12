package com.wtf.oauth.service;

import com.wtf.oauth.po.UmsPermission;
import com.wtf.oauth.po.UmsUser;

import java.util.List;

public interface UmsUserService {
    // 获取用户权限
    List<UmsPermission> getPermissionsByUserId(Long userId);
    // 根据用户名获取用户信息
    UmsUser getUserByName(String username);
}
