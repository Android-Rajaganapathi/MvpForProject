package com.rajaganapathi.forproject.view.iview;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.rajaganapathi.forproject.common.CodeSnippet;
import com.rajaganapathi.forproject.common.PermissionUtils;
import com.rajaganapathi.forproject.common.PreferencesHelper;

public interface IView {

    void showToast(String message);

    void showAlert(String message);

    void showSnackBar(String message);

    void showSnackBar(@NonNull View view, String message);

    void logoutSession();

    boolean isNetworkEnabled();

    String stringFromRes(int resId);

    void showProgressbar();

    void hideProgressbar();

    void showNetworkAlert();

    FragmentActivity getActivity();

    CodeSnippet getCodeSnippet();

    PermissionUtils getPermissionUtil();

    PreferencesHelper getPrefHelper();

    void navigateTo(@NonNull Class<?> cls, boolean isFinishActivity, @NonNull Bundle bundle);

    void addFragment(Bundle bundle, @IdRes int containerViewId, @NonNull Fragment fragment);

    void replaceFragment(Bundle bundle, @IdRes int containerViewId, @NonNull Fragment fragment);
}