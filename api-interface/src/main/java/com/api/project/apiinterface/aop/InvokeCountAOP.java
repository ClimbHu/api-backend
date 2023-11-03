package com.api.project.apiinterface.aop;

/**
 * 调用此时切面【伪代码】
 *    单个项目可使用AOP，多个项目推荐网关
 * @author proberj
 */
// @RestControllerAdvice
public class InvokeCountAOP {

    // @Resource
    // private UserInterfaceInfoService userInterfaceInfoService;

    // 伪代码
    // 定义漆面触发的时机（什么时候执行方法） controller 接口的方法执行成功后，执行下属方法
    // public void doInvokeCount(ProceedingJoinPoint joinPoint) {
        // 调用方法
        // Object.proceed();
        // 调用成功后，次数 + 1
        // userInterfaceInfoService.invokeCount();
    // }
}
