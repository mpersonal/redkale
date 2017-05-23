/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkale.net.http;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 只能依附在WebSocket类上，name默认为Service的类名小写并去掉Service字样及后面的字符串 (如HelloWebSocket/HelloWebSocketImpl，的默认路径为 hello)。
 * <p>
 * 详情见: https://redkale.org
 *
 * @author zhangjx
 */
@Inherited
@Documented
@Target({TYPE})
@Retention(RUNTIME)
public @interface RestWebSocket {

    /**
     * 模块名, 只能是模块名,不能含特殊字符， 只能小写字母+数字，且不能以数字开头
     *
     * @return 模块名
     */
    String name() default "";

    /**
     * 目录名, 不能含特殊字符， 只能小写字母+数字，且不能以数字开头
     *
     * @return 目录名
     */
    String catalog() default "";

    /**
     * 是否屏蔽该类的转换
     *
     * @return 默认false
     */
    boolean ignore() default false;

    /**
     * 同&#64;WebServlet的repair属性
     *
     * @return 默认true
     */
    boolean repair() default true;

    /**
     * 备注描述
     *
     * @return 备注描述
     */
    String comment() default "";
}
