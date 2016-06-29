package com.epicodus.happyfeet;

import android.os.Build;
import android.widget.ImageButton;
import android.widget.Switch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class WelcomeActivityTest {

    private WelcomeActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(WelcomeActivity.class);
    }

    @Test
    public void validateSwitchText() {
        Switch switchText = (Switch) activity.findViewById(R.id.saleSwitch);
        assertTrue("turn on sale".equals(switchText.getText().toString()));
    }
}