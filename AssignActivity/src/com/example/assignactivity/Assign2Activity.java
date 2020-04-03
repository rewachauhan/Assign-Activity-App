package com.example.assignactivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Assign2Activity extends Activity {
	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assign2);
		
		String s=getIntent().getStringExtra("total");
		
		tv=(TextView) findViewById(R.id.textView2);
		tv.setText(s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.assign2, menu);
		return true;
	}

}
