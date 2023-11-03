package com.api.project.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author proberj
 */
@SpringBootTest
class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    /**
     * 调用统计次数的方法
     */
    @Test
    void invokeCount() {
        Boolean b = userInterfaceInfoService.invokeCount(1l, 1l);
        // Assertions.assertEquals(b, true);
        Assertions.assertTrue(b);
    }
}