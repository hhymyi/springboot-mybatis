package com.hhymyi.springbootmybatis.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

//描述切面类
@Aspect
@Configuration
public class TestAop {

    /*
     * 定义一个切入点
     */
    @Pointcut("execution(* com.hhymyi.springbootmybatis.service..*.*(..))")
    public void excudeService() {}

    @Before("excudeService()")
    public void before() {
        System.out.println("before");
    }

    @Around("excudeService()")
    public Object twiceAsOld(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        System.out.println("around 前");
        Object proceed = thisJoinPoint.proceed();
        System.out.println("around 后");
        return proceed;
    }

    @After("excudeService()")
    public void after() {
        System.out.println("after");
    }

}