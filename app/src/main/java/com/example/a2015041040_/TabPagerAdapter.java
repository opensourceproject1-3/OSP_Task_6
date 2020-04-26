package com.example.a2015041040_;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs; // 탭의 개수

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.mNumOfTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                dog tab1 = new dog();
                return tab1;
            case 1:
                cat tab2 = new cat();
                return tab2;
            case 2:
                rabbit tab3 = new rabbit();
                return tab3;
            case 3:
                horse tab4 = new horse();
                return tab4;
                default:
                    return null;
        }
        // return null;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
