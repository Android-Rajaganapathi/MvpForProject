package com.rajaganapathi.forproject.presenter;

import android.os.Bundle;

import com.rajaganapathi.forproject.presenter.ipresenter.IIntroSliderPresenter;
import com.rajaganapathi.forproject.view.iview.IIntroSliderView;

public class IntroSliderPresenter extends BasePresenter<IIntroSliderView> implements IIntroSliderPresenter {

    public IntroSliderPresenter(IIntroSliderView iView) {
        super(iView);
    }

    @Override
    public void goToLogin() {
        Bundle bundle = new Bundle();
        bundle.putString("OpenScreen", "Login");
        iView.goToAuthentication(bundle);
    }

    @Override
    public void goToRegister() {
        Bundle bundle = new Bundle();
        bundle.putString("OpenScreen", "Register");
        iView.goToAuthentication(bundle);
    }
}
