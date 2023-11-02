package com.api.project.service;

import com.api.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ProberJ
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-10-31 15:34:00
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
