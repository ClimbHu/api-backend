package com.api.project.service.impl;

import com.api.project.mapper.UserInterfaceInfoMapper;
import com.api.project.model.entity.UserInterfaceInfo;
import com.api.project.service.UserInterfaceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ProberJ
 * @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service实现
 * @createDate 2023-11-02 23:01:45
 */
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
        implements UserInterfaceInfoService {

}




