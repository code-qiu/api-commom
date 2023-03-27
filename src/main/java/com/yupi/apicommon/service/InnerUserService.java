package com.yupi.apicommon.service;


import com.yupi.apicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService{

    /**
     * 从数据库中查找是否已分配秘钥
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
