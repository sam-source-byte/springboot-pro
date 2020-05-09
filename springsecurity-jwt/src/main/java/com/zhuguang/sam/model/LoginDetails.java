package com.zhuguang.sam.model;

/**
 * 百度腾讯课堂 搜素"烛光学院"请关注我们吧！
 * 需要往期视频斯琪老师：2996372122
 * 课后答疑可以加Sam老师QQ:1696862282
 *
 * @Auther: Sam
 * @Date: 2020/3/30 14:21
 * @Description:
 */
public class LoginDetails {
    //是否记住我
    private Boolean rememberMe;
    //验证码
    private String verifyCode;

    public LoginDetails(Boolean rememberMe, String verifyCode) {
        this.rememberMe = rememberMe;
        this.verifyCode = verifyCode;
    }

    public LoginDetails() {}

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
