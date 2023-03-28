package com.yupi.apicommon.service;


import com.yupi.apicommon.model.entity.User;

/**
 * 用户服务
 */
public interface InnerUserService{

    /**
     * 从数据库中查找是否已分配秘钥
     */
    User getInvokeUser(String accessKey);
}
