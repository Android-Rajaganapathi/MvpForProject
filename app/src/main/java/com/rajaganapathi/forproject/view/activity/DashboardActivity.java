package com.rajaganapathi.forproject.view.activity;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.presenter.DashboardPresenter;
import com.rajaganapathi.forproject.presenter.ipresenter.IDashboardPresenter;
import com.rajaganapathi.forproject.view.iview.IDashboardView;

public class DashboardActivity extends BaseActivity<IDashboardPresenter>
        implements IDashboardView {

    @Override
    protected void initViews() {

    }

    @Override
    int attachLayout() {
        return R.layout.activity_dashboard;
    }

    @Override
    IDashboardPresenter initPresenter() {
        return new DashboardPresenter(this);
    }
}
