package com.vedisoft;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Second extends Activity {
	TextView tv1,tv2,tv3;
	Button btn1,btn2;
	EditText et1, et2;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv=new TextView(this);
		tv.setText("helloWorld from Java");
		setContentView(tv);}
	
	public void oncreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		tv1=(TextView)findViewById(R.id.text1);
		tv2=(TextView)findViewById(R.id.text2);
		tv3=(TextView)findViewById(R.id.text1);
		
		
		
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		
		tv1.setText("Number1");
		tv2.setText("Number2");
		tv3.setText("Number3");
		
		btn1.setText("sum");
		btn2.setText("difference");
		

	}
 class A implements View.OnClickListener{

	@Override
	public void onClick(View view) {
		
		String str1= et1.getText().toString();
		String str2= et2.getText().toString();
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		int n3 = n1+n2;
		tv3.setText("Result"+n3);
	}}
 class B implements View.OnClickListener{

		@Override
		public void onClick(View view) {
			
			String str1= et1.getText().toString();
			String str2= et2.getText().toString();
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);
			int n3 = n1-n2;
			tv3.setText("Result"+n3);
		}}
}
			
