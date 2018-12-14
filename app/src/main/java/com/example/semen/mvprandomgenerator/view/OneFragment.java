package com.example.semen.mvprandomgenerator.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.semen.mvprandomgenerator.R;
import com.example.semen.mvprandomgenerator.presenter.OnePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends MvpAppCompatFragment implements OneView {
    private static String TAG = "setText";
    TextView tvResult;
    TextView tvCount;
    Button btnGenerate;
    Button btnStop;

    @InjectPresenter
    OnePresenter presenter;

    public OneFragment() {
        // Required empty public constructor
    }

    public static OneFragment newInstance() {
        return new OneFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);

        btnGenerate.setOnClickListener((v) -> presenter.startGenerate());

    }

    private void initViews(View view) {
        tvResult = view.findViewById(R.id.tvResult);
        tvCount = view.findViewById(R.id.tvCount);
        btnGenerate = view.findViewById(R.id.btnGenerate);
        btnStop = view.findViewById(R.id.btnStop);
    }

    @Override
    public void setText(int result, int count) {
        tvResult.setText(getString(R.string.result, result));
        tvCount.setText(getString(R.string.count, count));
        Log.i(TAG, "setText");
    }
}
