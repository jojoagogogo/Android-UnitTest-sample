package com.jojoagogogo.hello.test;

import android.content.Intent;
import android.test.ActivityUnitTestCase;

import com.jojoagogogo.hello.MainActivity;

@SuppressWarnings("rawtypes")
public class MainActivityTest extends ActivityUnitTestCase {

    @SuppressWarnings("unchecked")
	public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testSay(){
        startActivity(new Intent(),null,null);
        MainActivity activity = (MainActivity)getActivity();
        activity.say();
        assertEquals("Hello",activity.say());
    }

}
