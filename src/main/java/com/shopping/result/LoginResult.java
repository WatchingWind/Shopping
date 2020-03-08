package com.shopping.result;

public class LoginResult implements ILoginResult {
    private int state;
    private String msg;

    public LoginResult(int state,String msg) {
        this.state = state;
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public String getMsg() {
        return msg;
    }

    public static LoginResult COUNT_NOTEXIST = new LoginResult(0,"账户不存在");
    public static LoginResult PASSWORD_ERROR = new LoginResult(1,"密码错误" );
    public static LoginResult SUCCESS = new LoginResult(2,"登陆成功");
}
