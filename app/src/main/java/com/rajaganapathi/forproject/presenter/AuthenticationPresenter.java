package com.rajaganapathi.forproject.presenter;

import android.os.Bundle;

import com.rajaganapathi.forproject.presenter.ipresenter.IAuthenticationPresenter;
import com.rajaganapathi.forproject.view.fragment.LoginFragment;
import com.rajaganapathi.forproject.view.fragment.RegisterFragment;
import com.rajaganapathi.forproject.view.iview.IAuthenticationView;

public class AuthenticationPresenter extends BasePresenter<IAuthenticationView>
        implements IAuthenticationPresenter {

    public AuthenticationPresenter(IAuthenticationView iView) {
        super(iView);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle.getString("OpenScreen").equals("Login")) goToLogin();
        else goToRegistration();
    }

    @Override
    public void goToLogin() {
        iView.openScreen(new Bundle(), new LoginFragment());
    }

    @Override
    public void goToRegistration() {
        iView.openScreen(new Bundle(), new RegisterFragment());
    }

}
