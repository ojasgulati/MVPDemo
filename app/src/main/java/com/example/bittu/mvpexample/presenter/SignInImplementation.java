package com.example.bittu.mvpexample.presenter;


import android.text.TextUtils;
import com.example.bittu.mvpexample.presenter.SignInContract.SignInView;

public class SignInImplementation implements SignInContract.Presenter {
    SignInView signInView;

    public SignInImplementation(SignInView signInView) {
        this.signInView = signInView;
    }

    @Override
    public void SignIn(String username, String password) {
        if(TextUtils.isEmpty(username)|| TextUtils.isEmpty(password)){

        }else {
            if(username.equalsIgnoreCase("ojasgulati") && password.equalsIgnoreCase("password")){
                signInView.showSignInSuccess();
            }
            else {
                signInView.showValidationError();
            }
        }

    }
}
