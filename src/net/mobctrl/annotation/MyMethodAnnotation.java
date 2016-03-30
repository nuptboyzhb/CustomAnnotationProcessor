package net.mobctrl.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Zheng Haibo (mochuan)
 * @Company Alibaba Group
 * @PersonalWebsite http://www.mobctrl.net
 * @version $Id: MyMethodAnnotation.java, v 0.1 2016年3月30日 下午3:52:58 mochuan.zhb Exp $
 * @Description
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface MyMethodAnnotation {
    int layoutId() default 0;
    int viewType() default 0;
    String viewHolder();
}
