package com.rajaganapathi.forproject.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rajaganapathi.forproject.common.CodeSnippet;
import com.rajaganapathi.forproject.common.PermissionUtils;
import com.rajaganapathi.forproject.common.PreferencesHelper;
import com.rajaganapathi.forproject.presenter.ipresenter.IPresenter;
import com.rajaganapathi.forproject.view.activity.BaseActivity;
import com.rajaganapathi.forproject.view.iview.IView;

import java.util.Objects;

public abstract class BaseFragment<P extends IPresenter> extends Fragment implements IView {

    protected P iPresenter;

    protected View vRootView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        vRootView = LayoutInflater.from(getContext()).inflate(attachLayout(), container, false);
        iPresenter = initPresenter();
        assert getArguments() != null;
        iPresenter.onCreate(getArguments());
        initViews();
        return vRootView;
    }

    protected abstract void initViews();

    abstract int attachLayout();

    abstract P initPresenter();

    @Override
    public void showToast(String message) {
        ((IView) Objects.requireNonNull(getActivity())).showToast(message);
    }

    @Override
    public void showAlert(String message) {
        ((IView) Objects.requireNonNull(getActivity())).showAlert(message);
    }

    @Override
    public void showSnackBar(String message) {
        ((IView) Objects.requireNonNull(getActivity())).showSnackBar(message);
    }

    @Override
    public void showSnackBar(@NonNull View view, String message) {
        ((IView) Objects.requireNonNull(getActivity())).showSnackBar(view, message);
    }

    @Override
    public void logoutSession() {
        ((IView) Objects.requireNonNull(getActivity())).logoutSession();
    }

    @Override
    public boolean isNetworkEnabled() {
        return ((IView) Objects.requireNonNull(getActivity())).isNetworkEnabled();
    }

    @Override
    public String stringFromRes(int resId) {
        return ((IView) Objects.requireNonNull(getActivity())).stringFromRes(resId);
    }

    @Override
    public void showProgressbar() {
        ((IView) Objects.requireNonNull(getActivity())).showProgressbar();
    }

    @Override
    public void hideProgressbar() {
        ((IView) Objects.requireNonNull(getActivity())).hideProgressbar();
    }

    @Override
    public void showNetworkAlert() {
        ((IView) Objects.requireNonNull(getActivity())).showNetworkAlert();
    }

    @Override
    public CodeSnippet getCodeSnippet() {
        return ((IView) Objects.requireNonNull(getActivity())).getCodeSnippet();
    }

    @Override
    public PermissionUtils getPermissionUtil() {
        return ((IView) Objects.requireNonNull(getActivity())).getPermissionUtil();
    }

    @Override
    public PreferencesHelper getPrefHelper() {
        return ((IView) Objects.requireNonNull(getActivity())).getPrefHelper();
    }

    @Override
    public void navigateTo(@NonNull Class<?> cls, boolean isFinishActivity, @NonNull Bundle bundle) {
        ((IView) Objects.requireNonNull(getActivity())).navigateTo(cls, isFinishActivity, bundle);
    }

    @Override
    public void addFragment(Bundle bundle, int containerViewId, @NonNull Fragment fragment) {
        ((IView) Objects.requireNonNull(getActivity())).addFragment(bundle, containerViewId, fragment);
    }

    @Override
    public void replaceFragment(Bundle bundle, int containerViewId, @NonNull Fragment fragment) {
        ((IView) Objects.requireNonNull(getActivity())).replaceFragment(bundle, containerViewId, fragment);
    }

    public void showTextInputLayoutError(TextInputLayout til, TextInputEditText iet, String s) {
        ((BaseActivity) Objects.requireNonNull(getActivity())).showTextInputLayoutError(til, iet, s);
    }
}