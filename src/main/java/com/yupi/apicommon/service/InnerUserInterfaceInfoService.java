package com.yupi.apicommon.service;


/**
* @author Lavender
*/
public interface InnerUserInterfaceInfoService{

    boolean invokeCount(long interfaceInfoId, long userId);

    boolean getUserLeftNum(long interfaceInfoId, long userId);

    void checkUserInterfaceinfo(long interfaceInfoId, long userId);
}
