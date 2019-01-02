package com.rajaganapathi.forproject.presenter;

import com.rajaganapathi.forproject.presenter.ipresenter.IForgotPasswordPresenter;
import com.rajaganapathi.forproject.view.iview.IForgotPasswordView;

public class ForgotPasswordPresenter extends BasePresenter<IForgotPasswordView> implements IForgotPasswordPresenter {

    public ForgotPasswordPresenter(IForgotPasswordView iView) {
        super(iView);
    }
}
