package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BodyPartFragment extends Fragment {

    @BindView(R.id.iv_body_part)
    ImageView mImageView;
    private Unbinder unbinder;

    //Empty constructor
    public BodyPartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android_Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        unbinder= ButterKnife.bind(this, rootView);
        // Set the image to the first image in the list of heads
        mImageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
