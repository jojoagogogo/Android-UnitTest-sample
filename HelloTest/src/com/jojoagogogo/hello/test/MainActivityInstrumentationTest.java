package com.jojoagogogo.hello.test;

import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.jojoagogogo.hello.MainActivity;
import com.jojoagogogo.hello.R;

public class MainActivityInstrumentationTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	MainActivity activity;
	TextView tv1;
	Button btn1;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		activity = this.getActivity();
		tv1 = (TextView) activity.findViewById(R.id.tv1);
		btn1 = (Button) activity.findViewById(R.id.btn1);
	}

	public MainActivityInstrumentationTest() {
		super(MainActivity.class);
	}

	public void test(){
		Context context = this.getInstrumentation().getContext();
		assertEquals("com.jojoagogogo.hello.test", context.getPackageName());
	}
	
	public void testSay() {
		assertEquals("Hello", activity.say());
	}

	@SuppressWarnings("static-access")
	public void testTextView() {
		this.assertEquals("Hello world!", tv1.getText().toString());
	}

	public void testUI() {
		activity.runOnUiThread(new Runnable() {
			@Override
			public void run() {
				btn1.performClick();

				assertEquals(tv1.getText().toString(), "clickBtn1");
			}
		});
		getInstrumentation().waitForIdleSync();

	}

}
