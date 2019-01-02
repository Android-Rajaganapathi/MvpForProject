package com.rajaganapathi.forproject.view.fragment;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.presenter.LoginPresenter;
import com.rajaganapathi.forproject.presenter.ipresenter.ILoginPresenter;
import com.rajaganapathi.forproject.view.activity.DashboardActivity;
import com.rajaganapathi.forproject.view.iview.ILoginView;

public class LoginFragment extends BaseFragment<ILoginPresenter> implements ILoginView {

    private TextInputLayout tilMobile, tilPassword;
    private TextInputEditText ietMobile, ietPassword;

    @Override
    protected void initViews() {

        tilMobile = vRootView.findViewById(R.id.tilMobileNumber);
        tilPassword = vRootView.findViewById(R.id.tilPassword);
        ietMobile = vRootView.findViewById(R.id.etMobileNumber);
        ietPassword = vRootView.findViewById(R.id.etPassword);

        getPrefHelper().setString("mobile", "9988776655");
        getPrefHelper().setString("password", "aA1!1234");

        ietMobile.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!getCodeSnippet().isValidPhoneNumber(ietMobile.getText().toString()))
                    showTextInputLayoutError(tilMobile, ietMobile, getString(R.string.enter_mobile));
                else {
                    tilMobile.setErrorEnabled(false);
                    tilMobile.setError(null);
                }
                if (ietMobile.getText().length() == 10
                        && getPrefHelper().getString("mobile").equals(ietMobile.getText().toString()))
                    ietPassword.requestFocus();
            }
        });

        ietPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!getCodeSnippet().isValidPassword(ietPassword.getText().toString()))
                    showTextInputLayoutError(tilPassword, ietPassword, getString(R.string.enter_password));
                else if (TextUtils.equals(ietPassword.getText().toString(), getPrefHelper().getString("password")))
                    openDashboard(new Bundle());
                else {
                    showToast("Done");
                    tilPassword.setError(null);
                    tilPassword.setErrorEnabled(false);
                }
            }
        });

        vRootView.findViewById(R.id.tvRegister).setOnClickListener(v -> iPresenter.openRegistration());

        vRootView.findViewById(R.id.tvForgotPass).setOnClickListener(v -> iPresenter.openForgotPassword());
    }

    @Override
    int attachLayout() {
        return R.layout.fragment_login;
    }

    @Override
    ILoginPresenter initPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void openDashboard(Bundle bundle) {
        navigateTo(DashboardActivity.class, true, bundle);
    }

    @Override
    public void openRegistration(Bundle bundle) {
        addFragment(bundle, R.id.flAuthenticationContainer, new RegisterFragment());
    }

    @Override
    public void openForgotPassword(Bundle bundle) {
        addFragment(bundle, R.id.flAuthenticationContainer, new ForgotPasswordFragment());
    }
}
