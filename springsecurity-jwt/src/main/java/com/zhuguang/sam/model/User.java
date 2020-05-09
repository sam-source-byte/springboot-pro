package com.zhuguang.sam.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 *  Spring Security 整合 Jwt 本质上就是用自己自定义的登陆过滤器，
 *  去替换 Spring Security 原生的登陆过滤器，这样的话，原生的记住我功能就会无法使用，
 *  所以我在 User 对象里添加了记住我的信息，用来自己实现这个功能。
 *
 * @Auther: Sam
 * @Date: 2020/3/30 14:25
 * @Description:
 */
public class User implements UserDetails {
    private String username;
    private String password;
    private Boolean rememberMe;
    private String verifyCode;
    private String power;
    private Long expirationTime;
    private List<GrantedAuthority> authorities;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

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

    public String getPower() {
        return power;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
