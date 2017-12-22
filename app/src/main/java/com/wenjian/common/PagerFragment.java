package com.wenjian.common;


import android.os.Bundle;

import com.wenjian.core.ui.base.BaseFragment;


/**
 * @author wenjian
 */
public class PagerFragment extends BaseFragment {

    public PagerFragment() {
    }

    public static PagerFragment newInstance() {
        Bundle args = new Bundle();
        PagerFragment fragment = new PagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected Object getContentLayout() {
        return R.layout.fragment_pager;
    }
}
