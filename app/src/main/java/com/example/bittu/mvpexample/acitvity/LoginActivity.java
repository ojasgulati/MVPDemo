package com.example.bittu.mvpexample.acitvity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bittu.mvpexample.R;
import com.example.bittu.mvpexample.presenter.SignInContract;
import com.example.bittu.mvpexample.presenter.SignInImplementation;

public class LoginActivity extends AppCompatActivity implements SignInContract.SignInView{
SignInImplementation signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signIn = new SignInImplementation(this);
        signIn.SignIn("ojasgulati","password");
    }

    @Override
    public void showValidationError() {
        Toast.makeText(this,"Bad Credentials",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSignInSuccess() {
        Toast.makeText(this,"SignInSuccess",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSignInError() {

    }
}
