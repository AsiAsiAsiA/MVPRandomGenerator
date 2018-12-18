package com.example.semen.mvprandomgenerator.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.semen.mvprandomgenerator.model.RandomGenerator;
import com.example.semen.mvprandomgenerator.view.OneView;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;


@InjectViewState
public class OnePresenter extends MvpPresenter<OneView> {
    public void startGenerate() {
        Observable.interval(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(i ->
                        getViewState().setText(RandomGenerator.generateResult(), RandomGenerator.getCount()));
    }
}
