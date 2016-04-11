package com.yeungeek.monkeyandroid.ui;

import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.model.ConfigSplash;
import com.yeungeek.monkeyandroid.R;
import com.yeungeek.monkeyandroid.ui.main.MainActivity;
import com.yeungeek.monkeyandroid.util.AppCst;

/**
 * Created by yeungeek on 2016/3/16.
 */
public class LauncherActivity extends AwesomeSplash {

    @Override
    public void initSplash(ConfigSplash configSplash) {
        //Title
        configSplash.setTitleSplash(getString(R.string.app_name));
        configSplash.setBackgroundColor(R.color.colorPrimary);

        //path
        //Customize Path
        configSplash.setPathSplash(AppCst.DROID_LOGO); //set path String
        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.colorAccent); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setPathSplashFillColor(R.color.blue_200); //path object filling color
    }

    @Override
    public void animationsFinished() {
        startActivity(MainActivity.getStartIntent(this));
        finish();
    }
}
