package com.ganpatibaba;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Ganpatibaba extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello world!);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ganpatibaba, menu);
		return true;
	}

}
