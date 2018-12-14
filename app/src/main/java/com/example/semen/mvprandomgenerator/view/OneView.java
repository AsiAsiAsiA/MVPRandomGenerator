package com.example.semen.mvprandomgenerator.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface OneView extends MvpView {
    @StateStrategyType(SingleStateStrategy.class)
    void setText(int result, int count);
}
