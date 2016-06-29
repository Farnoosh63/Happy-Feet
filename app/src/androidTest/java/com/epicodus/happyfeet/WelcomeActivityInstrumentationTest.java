package com.epicodus.happyfeet;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;
import android.view.View;
import android.widget.ListView;


import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.util.regex.Pattern.matches;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class WelcomeActivityInstrumentationTest {
    private ListView mWomanListView;

    @Rule
    public ActivityTestRule<WelcomeActivity> activityTestRule =
            new ActivityTestRule<>(WelcomeActivity.class);

//    @Test
//    public void womanImageButtonClicked() {
////        onView(withId(R.id.logoButton)).perform(click());
//        onView(withId(R.id.womanImageButton)).perform(click());
//        Log.d("list view ", mWomanListView.getAdapter().isEmpty() + "?");
////        assertNotNull(mWomanListView.getAdapter());
//        assertEquals(mWomanListView.getAdapter().getCount(), 4);
////        onView(withId(R.id.womanListView)).check(matches(withText("shoes")));
//    }
}
