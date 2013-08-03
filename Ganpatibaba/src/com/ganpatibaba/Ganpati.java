package com.ganpatibaba;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Ganpati extends Activity {
MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle GanpatiaBabaMoria) {
		// TODO Auto-generated method stub
		super.onCreate(GanpatiaBabaMoria);
		setContentView(R.layout.ganpati);
	    ourSong= MediaPlayer.create(Ganpati.this,R.raw.ganpatisound);
		ourSong.start();
		Thread timer= new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openGanpatibaba= new Intent("com.ganpatibaba.GANPATIBABA");
					startActivity(openGanpatibaba);
				}
			
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
	
	

}
