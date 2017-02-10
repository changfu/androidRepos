package aop.hcf.com.aoplibrary.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者：HuChangfu on 2017/1/20.
 * 邮箱：changfu.hu@lvmama.com
 * 版本：7.9.0
 * 描述：xxx
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface LogTrace {
    String getMessage() default "";
}
