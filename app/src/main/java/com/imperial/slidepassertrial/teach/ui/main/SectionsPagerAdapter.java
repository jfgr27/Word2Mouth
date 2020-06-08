package com.imperial.slidepassertrial.teach.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.imperial.slidepassertrial.R;
import com.imperial.slidepassertrial.learn.main.offline.LearnOfflineMainFragment;
import com.imperial.slidepassertrial.learn.main.online.LearnOnlineMainFragment;
import com.imperial.slidepassertrial.teach.offline.TeachOfflineMainFragment;
import com.imperial.slidepassertrial.teach.online.TeachOnlineMainFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.offline, R.string.online};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new TeachOfflineMainFragment();
                break;
            case 1:
                fragment = new TeachOnlineMainFragment();
                break;
        }

        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}