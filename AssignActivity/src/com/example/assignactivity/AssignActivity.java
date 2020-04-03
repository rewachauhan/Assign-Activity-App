package com.example.assignactivity;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;




public class AssignActivity extends Activity {
	CheckBox c1,c2,c3,c4,c5;
	Button bt;
	EditText et1,et2,et3,et4,et5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        et3=(EditText) findViewById(R.id.editText3);
        et4=(EditText) findViewById(R.id.editText4);
        et5=(EditText) findViewById(R.id.editText5);
        c1=(CheckBox) findViewById(R.id.checkBox1);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        c3=(CheckBox) findViewById(R.id.checkBox3);
        c4=(CheckBox) findViewById(R.id.checkBox4);
        c5=(CheckBox) findViewById(R.id.checkBox5);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int tot=0;
				if(c1.isChecked())
				{
					int a=Integer.parseInt(et1.getText().toString());
					tot=a*100;
				}
				if(c2.isChecked())
				{
					int b=Integer.parseInt(et2.getText().toString());
					tot=tot+(b*200);
				}
				if(c3.isChecked())
				{
					int c=Integer.parseInt(et3.getText().toString());
					tot=tot+(c*300);
				}
				if(c4.isChecked())
				{
					int d=Integer.parseInt(et4.getText().toString());
					tot=tot+(d*400);
				}
				if(c5.isChecked())
				{
					int e=Integer.parseInt(et1.getText().toString());
					tot=tot+(e*500);
				}
				
				Intent i=new Intent(AssignActivity.this,Assign2Activity.class);
				String d;
				d=String.valueOf(tot).toString();
				i.putExtra("total", d);
				startActivity(i);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.assign, menu);
        return true;
    }
    
}
