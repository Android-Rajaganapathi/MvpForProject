package com.rajaganapathi.forproject.presenter;

import com.rajaganapathi.forproject.presenter.ipresenter.IDashboardPresenter;
import com.rajaganapathi.forproject.view.iview.IDashboardView;

public class DashboardPresenter extends BasePresenter<IDashboardView>
        implements IDashboardPresenter {

    public DashboardPresenter(IDashboardView iView) {
        super(iView);
    }
}
