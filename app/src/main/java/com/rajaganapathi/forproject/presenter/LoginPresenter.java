package com.rajaganapathi.forproject.presenter;

import android.os.Bundle;

import com.rajaganapathi.forproject.presenter.ipresenter.ILoginPresenter;
import com.rajaganapathi.forproject.view.iview.ILoginView;

public class LoginPresenter extends BasePresenter<ILoginView> implements ILoginPresenter {

    public LoginPresenter(ILoginView iView) {
        super(iView);
    }

    @Override
    public void openRegistration() {
        iView.openRegistration(new Bundle());
    }

    @Override
    public void openForgotPassword() {
        iView.openForgotPassword(new Bundle());
    }

    @Override
    public void openDashBoard() {
        iView.openDashboard(new Bundle());
    }
}
