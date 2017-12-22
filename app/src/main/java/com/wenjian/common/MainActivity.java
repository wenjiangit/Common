package com.wenjian.common;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.wenjian.core.ui.base.BaseActivity;

import butterknife.BindView;


/**
 * @author wenjian
 */
public class MainActivity extends BaseActivity {


    @BindView(R.id.tab_main)
    TabLayout mTabMain;
    @BindView(R.id.vp_main)
    ViewPager mVpMain;

    @Override
    protected Object getContentLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();

        FragmentPagerAdapter pagerAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        mVpMain.setAdapter(pagerAdapter);
        mTabMain.setupWithViewPager(mVpMain);
        mTabMain.setTabMode(TabLayout.MODE_FIXED);
    }

    private static class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

        private static final String[] TAB_TITLES = {"tab1", "tab2", "tab3", "tab4"};

        SimpleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PagerFragment.newInstance();
        }

        @Override
        public int getCount() {
            return TAB_TITLES.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TAB_TITLES[position];
        }

    }


}
