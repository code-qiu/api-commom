package com.yupi.apicommon.service;


import com.yupi.apicommon.model.entity.InterfaceInfo;

/**
* @author Lavender
*/
public interface InnerInterfaceInfoService{
    /**
     * 从数据库中判断接口是否存在
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
