package com.wtf.oauth.po;

public class UmsPermission {
    private Long id;

    //父ID
    private Long parentId;

    //资源名称
    private String name;

    private String enname;

    //资源类型 button menu
    private String type;

    //资源URL
    private String url;

    //图标
    private String iconUrl;

    //权限描述
    private String description;

    //是否可见 0-不可见 1-可见
    private Byte available;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取父ID
     *
     * @return parent_id - 父ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父ID
     *
     * @param parentId 父ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return enname
     */
    public String getEnname() {
        return enname;
    }

    /**
     * @param enname
     */
    public void setEnname(String enname) {
        this.enname = enname;
    }

    /**
     * 获取资源类型 button menu
     *
     * @return type - 资源类型 button menu
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资源类型 button menu
     *
     * @param type 资源类型 button menu
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取资源URL
     *
     * @return url - 资源URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源URL
     *
     * @param url 资源URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图标
     *
     * @return icon_url - 图标
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 设置图标
     *
     * @param iconUrl 图标
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 获取权限描述
     *
     * @return description - 权限描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置权限描述
     *
     * @param description 权限描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取是否可见 0-不可见 1-可见
     *
     * @return available - 是否可见 0-不可见 1-可见
     */
    public Byte getAvailable() {
        return available;
    }

    /**
     * 设置是否可见 0-不可见 1-可见
     *
     * @param available 是否可见 0-不可见 1-可见
     */
    public void setAvailable(Byte available) {
        this.available = available;
    }
}