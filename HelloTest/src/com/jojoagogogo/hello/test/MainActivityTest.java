package com.jojoagogogo.hello.test;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.util.Log;

import com.jojoagogogo.hello.MainActivity;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {

	MainActivity activity;
	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	public void testSay(){
		activity = startActivity(new Intent(),null,null);
		assertEquals("Hello", activity.say());
	}
	public void testClick(){
		activity = startActivity(new Intent(),null,null);
		activity.clickBtn1(null);
		assertEquals(activity,this.getActivity());
		
		Intent intent = getStartedActivityIntent();
		String message = intent.getStringExtra(MainActivity.MESSAGE);
		Log.d("%%",message);
		assertEquals("Message from MainActivity",message);
		
	}
}
