package com.wtf.oauth.service;

import com.wtf.oauth.model.dto.UmsPermissionDTO;

import java.util.List;

public interface UmsPermissionService {
    // 获取所有角色权限
    List<UmsPermissionDTO> getPermissionsWithRole();

}
