package com.example.semen.mvprandomgenerator.presenter;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.semen.mvprandomgenerator.model.RandomGenerator;
import com.example.semen.mvprandomgenerator.view.OneView;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;


@InjectViewState
public class OnePresenter extends MvpPresenter<OneView> {
    Disposable disposable;

    public void startGenerate() {
        disposable = Observable.interval(1, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(i -> {
                            int c = RandomGenerator.generateResult();
                            getViewState().setText(c, RandomGenerator.getCount());
                            Log.i("RxJava", String.valueOf(c));
                        }
                );
    }

    public void stopGenerate() {
        disposable.dispose();
    }
}
