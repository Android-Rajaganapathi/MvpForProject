package com.rajaganapathi.forproject.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.model.dto.OnBoardItem;
import com.rajaganapathi.forproject.presenter.IntroSliderPresenter;
import com.rajaganapathi.forproject.presenter.ipresenter.IIntroSliderPresenter;
import com.rajaganapathi.forproject.view.adapter.IntroSliderAdapter;
import com.rajaganapathi.forproject.view.iview.IIntroSliderView;
import com.rajaganapathi.forproject.view.widget.CircleIndicator;
import com.rajaganapathi.forproject.view.widget.IntroSliderTransformation;

import java.util.ArrayList;

public class IntroSliderActivity extends BaseActivity<IIntroSliderPresenter>
        implements IIntroSliderView {

    private ArrayList<OnBoardItem> onBoardItems = new ArrayList<>();
    private IntroSliderTransformation mTransformation;
    private ViewPager mViewPager;
    private CircleIndicator mIndicator;

    @Override
    protected void initViews() {
        mViewPager = findViewById(R.id.viewpager);
        mIndicator = findViewById(R.id.indicator);
        mTransformation = new IntroSliderTransformation();
        loadAdapter();

        findViewById(R.id.btLogin).setOnClickListener(v -> iPresenter.goToLogin());

        findViewById(R.id.btRegister).setOnClickListener(v -> iPresenter.goToRegister());
    }

    @Override
    int attachLayout() {
        return R.layout.activity_intro_slider;
    }

    @Override
    IIntroSliderPresenter initPresenter() {
        return new IntroSliderPresenter(this);
    }

    public void loadAdapter() {

        int[] header = {R.string.intro_title_one, R.string.intro_title_two, R.string.intro_title_three};
        int[] desc = {R.string.intro_desc_one, R.string.intro_desc_two, R.string.intro_desc_three};
        int[] imageId = {R.drawable.ic_burn_button, R.drawable.ic_burn_button, R.drawable.ic_burn_button};

        for (int i = 0; i < imageId.length; i++) {
            OnBoardItem item = new OnBoardItem();
            item.setImageID(imageId[i]);
            item.setTitle(getResources().getString(header[i]));
            item.setDescription(getResources().getString(desc[i]));
            onBoardItems.add(item);
        }

        mViewPager.setAdapter(new IntroSliderAdapter(this, onBoardItems));
        mViewPager.setPageTransformer(true, mTransformation);
        mIndicator.setViewPager(mViewPager);
        mViewPager.setCurrentItem(0);
    }

    @Override
    public void goToAuthentication(Bundle bundle) {
        navigateTo(AuthenticationActivity.class, true, bundle);
    }
}
