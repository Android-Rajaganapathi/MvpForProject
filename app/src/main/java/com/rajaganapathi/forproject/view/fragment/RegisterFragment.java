package com.rajaganapathi.forproject.view.fragment;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.presenter.RegisterPresenter;
import com.rajaganapathi.forproject.presenter.ipresenter.IRegisterPresenter;
import com.rajaganapathi.forproject.view.iview.IRegisterView;

public class RegisterFragment extends BaseFragment<IRegisterPresenter> implements IRegisterView {

    @Override
    protected void initViews() {

    }

    @Override
    int attachLayout() {
        return R.layout.fragment_register;
    }

    @Override
    IRegisterPresenter initPresenter() {
        return new RegisterPresenter(this);
    }
}
