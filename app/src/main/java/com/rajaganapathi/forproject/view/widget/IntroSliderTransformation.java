package com.rajaganapathi.forproject.view.widget;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rajaganapathi.forproject.R;

public class IntroSliderTransformation implements PageTransformer {
    public void transformPage(@NonNull View page, float position) {
        TextView tvDesc = page.findViewById(R.id.tvDesc);
        TextView tvTitle = page.findViewById(R.id.tvTitle);
        ImageView ivIntroImg = page.findViewById(R.id.ivIntroImg);
        if (position < (float) -1) page.setAlpha(0.0F);
        else if (position <= (float) 1) {
            ivIntroImg.setTranslationX(-position * 0.5F * (float) page.getWidth());
            tvTitle.setTranslationX(-position * 1.0F * (float) page.getWidth());
            tvDesc.setTranslationX(-position * 2.0F * (float) page.getWidth());
        } else page.setAlpha(0.0F);
    }
}
