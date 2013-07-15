package com.jojoagogogo.hello;

import android.content.Context;
import android.widget.Toast;

public class Utils {
	
	Context _context;
	
	public Utils(Context context) {
		_context = context;
	}
	
    public void toastLong(String message) {
        Toast.makeText(_context, message, Toast.LENGTH_LONG).show();
    }

    public void toastShort(String message) {
        Toast.makeText(_context, message, Toast.LENGTH_SHORT).show();
    }
}
