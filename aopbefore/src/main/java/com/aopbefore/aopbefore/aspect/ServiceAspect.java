package com.aopbefore.aopbefore.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;






@Aspect
@Component
public class ServiceAspect {

@Before(value = "execution(* com.aopbefore.aopbefore.service.Service.*(..))")
public void beforeAdvice(JoinPoint joinPoint) {
    System.out.println("Before method:" + joinPoint.getSignature());
    System.out.println("Creating Employee with name - ");
}
@After(value = "execution(* com.aopbefore.aopbefore.service.Service.*(..))")
    public void aferAdvice(JoinPoint joinPoint) {
    System.out.println("ceated employee with name");
}
@AfterReturning(value = "execution(* com.aopbefore.aopbefore.service.Service.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result)
{
    System.out.println("the name is "+result);
}


}
