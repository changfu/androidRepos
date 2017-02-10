package aop.hcf.com.aoplibrary.aspects;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import aop.hcf.com.aoplibrary.annotation.LogTrace;

@Aspect
public class LogAspect {

    @Pointcut("execution(@aop.hcf.com.aoplibrary.annotation.LogTrace public * on*(..)) && @annotation(logTrace)")
    public void logForMethod(LogTrace logTrace){}

//    @Pointcut("execution(aop.hcf.com.aoplibrary.annotation.LogTrace)")
//    public void logForMethod2(LogTrace logTrace){}

    @Pointcut("execution(@aop.hcf.com.aoplibrary.annotation.LogTrace public *.new(..)) && @annotation(logTrace)")
    public void logForConstructor(LogTrace logTrace){}

    @Around("logForMethod(logTrace) || logForConstructor(logTrace)")
    public void weaveJoinPoint(ProceedingJoinPoint joinPoint, LogTrace logTrace) throws Throwable{
//        if (true){
            Log.e("myTag", "begin weave "+logTrace.getMessage());
//            return;
//        }
        joinPoint.proceed();
    }
}
