package com.wtf.oauth.model.dto;

import com.wtf.oauth.po.UmsPermission;
import com.wtf.oauth.po.UmsRole;

import java.util.List;

/**
 * @Author WTF
 * @Date 2020/2/18 13:31
 * @Description
 */

public class UmsPermissionDTO extends UmsPermission {
    private List<UmsRole> roles;

    public List<UmsRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UmsRole> roles) {
        this.roles = roles;
    }
}
