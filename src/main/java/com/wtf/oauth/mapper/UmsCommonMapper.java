package com.wtf.oauth.mapper;

import com.wtf.oauth.base.BaseDao;
import com.wtf.oauth.model.dto.UmsPermissionDTO;
import com.wtf.oauth.po.UmsPermission;
import com.wtf.oauth.po.UmsUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UmsCommonMapper extends BaseDao<UmsUser> {
    // 获取用户权限
    List<UmsPermission> getPermissionsByUserId(Long userId);
    // 获取所有角色权限
    List<UmsPermissionDTO> getPermissionsWithRole();
}