package com.jojoagogogo.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static final String MESSAGE = "MESSAGE";
	Utils _utils;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		_utils = new Utils(this);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public String say(){
		return "Hello";
	}
	
	public void clickBtn1(View view){
		TextView tv1 = (TextView)this.findViewById(R.id.tv1);
		tv1.setText("clickBtn1");

		Intent intent = new Intent();
		intent.setClassName("com.jojoagogogo.hello", "com.jojoagogogo.hello.SubActivity");
		intent.putExtra(MESSAGE, "Message from MainActivity");
		startActivity(intent);
	}
}
