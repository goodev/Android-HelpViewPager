package org.goodev.helpviewpager;

import android.support.v4.app.Fragment;

/**
 * Automatic finish the Activity when scroll to the last page.
 * Useful when use ViewPage for help content which will show on the App first started.
 *
 */
public interface EventOnLastPage {
    
    /**
     * return the last page, usually is a transparent View.
     * @return if return <code>null</code>, will use a transparent View.
     */
    Fragment getBlankPage();
    
    /**
     * return the Help Content Page
     * @param position
     * @return
     */
    public abstract Fragment getHelpItem(int position);
    
    /**
     * return the Help Content Page Count
     * @return
     */
    public abstract int getHelpCount();
}
