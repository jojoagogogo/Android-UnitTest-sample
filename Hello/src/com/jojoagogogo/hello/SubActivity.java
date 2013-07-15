package com.jojoagogogo.hello;

import android.app.Activity;
import android.os.Bundle;

public class SubActivity extends Activity {

	Utils _utils;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		_utils = new Utils(this);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
	}
}
