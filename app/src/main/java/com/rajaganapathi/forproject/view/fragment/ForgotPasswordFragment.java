package com.rajaganapathi.forproject.view.fragment;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.presenter.ForgotPasswordPresenter;
import com.rajaganapathi.forproject.presenter.ipresenter.IForgotPasswordPresenter;
import com.rajaganapathi.forproject.view.iview.IForgotPasswordView;

public class ForgotPasswordFragment extends BaseFragment<IForgotPasswordPresenter> implements IForgotPasswordView {

    @Override
    protected void initViews() {

    }

    @Override
    int attachLayout() {
        return R.layout.fragment_forgot_pass;
    }

    @Override
    IForgotPasswordPresenter initPresenter() {
        return new ForgotPasswordPresenter(this);
    }
}
