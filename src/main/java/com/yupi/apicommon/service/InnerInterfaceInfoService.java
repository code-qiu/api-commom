package com.yupi.apicommon.service;


import com.yupi.apicommon.model.entity.InterfaceInfo;

/**
* @author Lavender
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-15 17:11:14
*/
public interface InnerInterfaceInfoService{
    /**
     * 从数据库中判断接口是否存在
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
