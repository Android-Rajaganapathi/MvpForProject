package com.rajaganapathi.forproject.presenter;

import com.rajaganapathi.forproject.presenter.ipresenter.IRegisterPresenter;
import com.rajaganapathi.forproject.view.iview.IRegisterView;

public class RegisterPresenter extends BasePresenter<IRegisterView> implements IRegisterPresenter {

    public RegisterPresenter(IRegisterView iView) {
        super(iView);
    }

}
