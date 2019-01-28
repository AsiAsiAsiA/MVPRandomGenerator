package com.example.semen.mvprandomgenerator.view;

import android.os.Bundle;

import com.example.semen.mvprandomgenerator.R;
import com.example.semen.mvprandomgenerator.moxyandroidx.MvpAppCompatActivity;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;

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
