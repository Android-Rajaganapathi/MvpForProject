package com.rajaganapathi.forproject.view.activity;

import android.os.Bundle;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.presenter.SplashPresenter;
import com.rajaganapathi.forproject.presenter.ipresenter.ISplashPresenter;
import com.rajaganapathi.forproject.view.iview.ISplashView;

public class SplashActivity extends BaseActivity<ISplashPresenter> implements ISplashView {

    @Override
    protected void initViews() {

    }

    @Override
    int attachLayout() {
        return R.layout.activity_splash;
    }

    @Override
    ISplashPresenter initPresenter() {
        return new SplashPresenter(this);
    }

    @Override
    public void goToAuthentication(Bundle bundle) {
        navigateTo(IntroSliderActivity.class, true, bundle);
    }

    @Override
    public void goToDashboard(Bundle bundle) {
        navigateTo(DashboardActivity.class, true, bundle);
    }
}
