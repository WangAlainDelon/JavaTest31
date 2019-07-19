package com.wx.exam1.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* com.wx.exam1.service.imp.FilmServiceImp.insertFilm(..))")
    private void pointcut1() {
    }

    @Pointcut("execution(* com.wx.exam1.service.imp.FilmServiceImp.insertFilm(..))")
    private void pointcut2() {
    }

    // 前置增强：在目标方法执行之前执行.
    @Before("MyAspect.pointcut1()")
    public void before() {
        System.out.println("Before Insert Film Data");
    }

    //后置增强：在目标方法执行之后执行.
    @AfterReturning("MyAspect.pointcut2()")
    public void afterreturning() {
        System.out.println("After Insert Film Data");
    }
}
