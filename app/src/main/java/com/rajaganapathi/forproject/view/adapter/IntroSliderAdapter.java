package com.rajaganapathi.forproject.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rajaganapathi.forproject.R;
import com.rajaganapathi.forproject.model.dto.OnBoardItem;
import java.util.ArrayList;

public class IntroSliderAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<OnBoardItem> onBoardItems;

    public IntroSliderAdapter(Context mContext, ArrayList<OnBoardItem> items) {
        this.mContext = mContext;
        this.onBoardItems = items;
    }

    @Override
    public int getCount() {
        return onBoardItems.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_intro_slider, container, false);

        OnBoardItem item = onBoardItems.get(position);

        ImageView imageView = itemView.findViewById(R.id.ivIntroImg);
        imageView.setImageResource(item.getImageID());

        TextView tv_title = itemView.findViewById(R.id.tvTitle);
        tv_title.setText(item.getTitle());

        TextView tv_content = itemView.findViewById(R.id.tvDesc);
        tv_content.setText(item.getDescription());

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }

}
