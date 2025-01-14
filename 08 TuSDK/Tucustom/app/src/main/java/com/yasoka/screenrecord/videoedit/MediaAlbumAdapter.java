/**
 *  TuSDK
 *  TuSDKVideoDemo3
 *  MediaAlbumAdapter.java
 *  @author  H.ys
 *  @Date    2019/6/3 15:08
 *  @Copyright 	(c) 2019 tusdk.com. All rights reserved.
 *
 *
 */
package com.yasoka.screenrecord.videoedit;

/*import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;*/

/*import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;*/

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class MediaAlbumAdapter extends FragmentPagerAdapter {

    public List<Fragment> getFragmentList() {
        return mFragmentList;
    }

    private List<Fragment> mFragmentList;

    public MediaAlbumAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.mFragmentList = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
