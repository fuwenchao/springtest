package com.bocd.commom.handler;

import com.bocd.anno.CurrentOp;
import com.bocd.model.UserModel;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author wenchaofu
 * @version 1.0, 2019/9/19
 * @desc
 */
public class UserModelMethodArgumentResolver implements HandlerMethodArgumentResolver {

    public static final String id = "123221";

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().isAssignableFrom(UserModel.class) &&
                methodParameter.hasParameterAnnotation(CurrentOp.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        UserModel userModel = new UserModel();
        userModel.setDept("tec");
        userModel.setName("wenchaofu");
        return userModel;
    }
}
