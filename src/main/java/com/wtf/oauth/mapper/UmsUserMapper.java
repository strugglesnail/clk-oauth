package com.wtf.oauth.mapper;

import com.wtf.oauth.base.BaseDao;
import com.wtf.oauth.po.UmsUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsUserMapper extends BaseDao<UmsUser> {
    // 获取用户权限
//    List<UmsPermission> getPermissionsByUserId(Long userId);
}