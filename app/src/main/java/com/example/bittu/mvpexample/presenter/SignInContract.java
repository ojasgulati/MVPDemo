package com.example.bittu.mvpexample.presenter;


public interface SignInContract {

    interface SignInView {

        void showValidationError();
        void showSignInSuccess();
        void showSignInError();
    }

    interface Presenter{
        void SignIn(String username,String password);
    }
}
