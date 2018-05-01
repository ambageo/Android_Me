package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class MasterListFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.fragment_master_list, container, false);

        MasterListAdapter masterAdapter= new MasterListAdapter(getContext(), AndroidImageAssets.getAll());
        GridView gridView= rootView.findViewById(R.id.images_grid_view);
        gridView.setAdapter(masterAdapter);
        return rootView;
    }

    public MasterListFragment() {

    }
}
