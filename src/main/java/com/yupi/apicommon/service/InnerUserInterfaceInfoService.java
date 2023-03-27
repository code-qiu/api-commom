package com.yupi.apicommon.service;


/**
* @author Lavender
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-03-19 15:11:41
*/
public interface InnerUserInterfaceInfoService{

    boolean invokeCount(long interfaceInfoId, long userId);

    boolean getUserLeftNum(long interfaceInfoId, long userId);

    void checkUserInterfaceinfo(long interfaceInfoId, long userId);
}
