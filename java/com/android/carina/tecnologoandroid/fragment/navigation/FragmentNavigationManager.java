package com.android.carina.tecnologoandroid.fragment.navigation;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.android.carina.tecnologoandroid.BuildConfig;
import com.android.carina.tecnologoandroid.MainActivity;
import com.android.carina.tecnologoandroid.R;
import com.android.carina.tecnologoandroid.fragment.FragmentCaja;
import com.android.carina.tecnologoandroid.fragment.FragmentConfiguracion;
import com.android.carina.tecnologoandroid.fragment.FragmentGestionar;


public class FragmentNavigationManager implements NavigationManager {

    private static FragmentNavigationManager sInstance;

    private FragmentManager mFragmentManager;
    private MainActivity mActivity;

    public static FragmentNavigationManager obtain(MainActivity activity) {
        if (sInstance == null) {
            sInstance = new FragmentNavigationManager();
        }
        sInstance.configure(activity);
        return sInstance;
    }

    private void configure(MainActivity activity) {
        mActivity = activity;
        mFragmentManager = mActivity.getSupportFragmentManager();
    }


    @Override
    public void showFragmentGestionar(String title) {
        showFragment(FragmentGestionar.newInstance(title), false);
    }


    @Override
    public void showFragmentCaja(String title) {
        showFragment(FragmentCaja.newInstance(title), false);
    }



    @Override
    public void showFragmentConfiguracion(String title) {
        showFragment(FragmentConfiguracion.newInstance(title), false);
    }



    private void showFragment(Fragment fragment, boolean allowStateLoss) {
        FragmentManager fm = mFragmentManager;

        @SuppressLint("CommitTransaction")
        FragmentTransaction ft = fm.beginTransaction()
            .replace(R.id.container, fragment);

        ft.addToBackStack(null);

        if (allowStateLoss || !BuildConfig.DEBUG) {
            ft.commitAllowingStateLoss();
        } else {
            ft.commit();
        }

        fm.executePendingTransactions();
    }
}
