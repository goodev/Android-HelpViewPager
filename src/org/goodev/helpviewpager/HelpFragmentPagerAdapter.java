package org.goodev.helpviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public abstract class HelpFragmentPagerAdapter extends FragmentPagerAdapter implements EventOnLastPage{

    public HelpFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == getHelpCount()) {
            return getBlankPage();
        }
        return getHelpItem(position);
    }
    

    @Override
    public int getCount() {
        return getHelpCount() + 1;
    }
    
    @Override
    public Fragment getBlankPage() {
        return new BlankFragment();
    }
    

}
