package school.cjlu.aspect.annotation;

import school.cjlu.aspect.enums.LogType;

import java.lang.annotation.*;

/**
 * Author:Young
 * Date:2020/11/28-22:38
 * 自定义操作日志记录注解
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 标题或模块
     */
    String title() default "";

    /**
     * 功能
     */
    LogType logType() default LogType.OTHER;

    /**
     * 请求参数
     */
    boolean requestParam() default true;
}
