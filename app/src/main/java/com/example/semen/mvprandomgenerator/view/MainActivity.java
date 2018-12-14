package com.example.semen.mvprandomgenerator.view;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.example.semen.mvprandomgenerator.R;

public class MainActivity extends MvpAppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            loadFragment(OneFragment.newInstance(), R.id.fragment_one_container);
        }
    }

    private void loadFragment(Fragment fragment, @IdRes int i) {
        getSupportFragmentManager().beginTransaction()
                .replace(i, fragment)
                .commit();
    }
}
