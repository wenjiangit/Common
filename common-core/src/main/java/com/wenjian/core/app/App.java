package com.wenjian.core.app;

import android.app.Application;

import com.wenjian.core.utils.Utils;

/**
 * Description: App
 * Date: 2017/12/19
 *
 * @author jian.wen@ubtrobot.com
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
    }
}
