package aop.hcf.com.aoplibrary.aspects;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {
    @Pointcut("execution(@aop.hcf.com.aoplibrary.annotation.TestTrace public * **(..))")
    public void myTest(){}

    @Around("myTest()")
    public void toTest(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.e("myTag", "toTest");
        joinPoint.proceed();
    }
}
