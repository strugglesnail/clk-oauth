package com.wtf.oauth.service.impl;

import com.wtf.oauth.base.BaseDao;
import com.wtf.oauth.base.BaseServiceImpl;
import com.wtf.oauth.mapper.UmsCommonMapper;
import com.wtf.oauth.mapper.UmsUserMapper;
import com.wtf.oauth.po.UmsPermission;
import com.wtf.oauth.po.UmsUser;
import com.wtf.oauth.service.UmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WTF
 * @Date 2020/2/13 19:03
 * @Description
 */
@Service
public class UmsUserServiceImpl extends BaseServiceImpl<UmsUser> implements UmsUserService {

    @Autowired
    private UmsUserMapper umsUserMapper;

    @Autowired
    private UmsCommonMapper umsCommonMapper;

    @Override
    public BaseDao<UmsUser> getMapper() {
        return umsUserMapper;
    }

    // 获取用户权限
    @Override
    public List<UmsPermission> getPermissionsByUserId(Long userId) {
        return umsCommonMapper.getPermissionsByUserId(userId);
    }

    @Override
    public UmsUser getUserByName(String username) {
        UmsUser umsUser = new UmsUser();
        umsUser.setUsername(username);
        return umsUserMapper.getOne(umsUser);
    }
}
