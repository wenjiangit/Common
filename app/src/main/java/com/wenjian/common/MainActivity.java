package com.wenjian.common;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.wenjian.core.utils.AnimationUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author wenjian
 */
public class MainActivity extends AppCompatActivity {

    private Unbinder mUnbinder;

    @BindView(R.id.lay_root)
    FrameLayout mFrameLayout;

    @BindView(R.id.tv_test)
    TextView mTestTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);


    }


    @OnClick(R.id.tv_test)
    public void onClickView() {
        mFrameLayout.setBackgroundColor(Color.BLUE);
        AnimationUtils.animateRevealShow(mFrameLayout);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
    }
}
