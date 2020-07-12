package com.wtf.oauth.service.impl;

import com.wtf.oauth.base.BaseDao;
import com.wtf.oauth.base.BaseServiceImpl;
import com.wtf.oauth.mapper.UmsCommonMapper;
import com.wtf.oauth.mapper.UmsPermissionMapper;
import com.wtf.oauth.model.dto.UmsPermissionDTO;
import com.wtf.oauth.po.UmsPermission;
import com.wtf.oauth.service.UmsPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WTF
 * @Date 2020/2/13 19:03
 * @Description
 */
@Service
public class UmsPermissionServiceImpl extends BaseServiceImpl<UmsPermission> implements UmsPermissionService {


    @Autowired
    private UmsPermissionMapper umsPermissionMapper;

    @Autowired
    private UmsCommonMapper umsCommonMapper;

    @Override
    public BaseDao<UmsPermission> getMapper() {
        return umsPermissionMapper;
    }


    @Override
    public List<UmsPermissionDTO> getPermissionsWithRole() {
        return umsCommonMapper.getPermissionsWithRole();
    }
}
