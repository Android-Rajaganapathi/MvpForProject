package com.rajaganapathi.forproject.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.presenter.AuthenticationPresenter;
import com.rajaganapathi.forproject.presenter.ipresenter.IAuthenticationPresenter;
import com.rajaganapathi.forproject.view.iview.IAuthenticationView;

public class AuthenticationActivity
        extends BaseActivity<IAuthenticationPresenter>
        implements IAuthenticationView {

    @Override
    protected void initViews() {
    }

    @Override
    int attachLayout() {
        return R.layout.activity_authentication;
    }

    @Override
    IAuthenticationPresenter initPresenter() {
        return new AuthenticationPresenter(this);
    }

    @Override
    public void openScreen(Bundle bundle, Fragment fragment) {
        replaceFragment(bundle, R.id.flAuthenticationContainer, fragment);
    }

}
