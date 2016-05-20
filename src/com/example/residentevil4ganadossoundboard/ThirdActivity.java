package com.example.residentevil4ganadossoundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {

	
	Button third_button14;
	MediaPlayer third_fourteen;
	Button third_button15;
	MediaPlayer third_fifteen;
	Button third_button16;
	MediaPlayer third_sixteen;
	Button third_button17;
	MediaPlayer third_seventeen;
	Button third_button18;
	MediaPlayer third_eighteen;
	Button third_button19;
	MediaPlayer third_nineteen;
	Button third_button20;
	MediaPlayer third_twenty;
	Button third_button21;
	MediaPlayer third_twentyone;
	Button third_button22;
	MediaPlayer third_twentytwo;
	Button third_button23;
	MediaPlayer third_twentythree;
	Button third_button24;
	MediaPlayer third_twentyfour;
	Button third_button25;
	MediaPlayer third_twentyfive;
	//Next Button
	Button third_next2;
	Button third_back2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		//Button creation and ids
        final Button third_button14 = (Button) findViewById(R.id.third_button14);
        final MediaPlayer third_fourteen = MediaPlayer.create(getApplicationContext(), R.raw.imbecil);
        final Button third_button15 = (Button) findViewById(R.id.third_button15);
        final MediaPlayer third_fifteen = MediaPlayer.create(getApplicationContext(), R.raw.imbecil2);
        
        final Button third_button16 = (Button) findViewById(R.id.third_button16);
        final MediaPlayer third_sixteen = MediaPlayer.create(getApplicationContext(), R.raw.imbecil3);
        final Button third_button17 = (Button) findViewById(R.id.third_button17);
        final MediaPlayer third_seventeen = MediaPlayer.create(getApplicationContext(), R.raw.imbecil4);
        
        final Button third_button18 = (Button) findViewById(R.id.third_button18);
        final MediaPlayer third_eighteen = MediaPlayer.create(getApplicationContext(), R.raw.imbecil5);
        final Button third_button19 = (Button) findViewById(R.id.third_button19);
        final MediaPlayer third_nineteen = MediaPlayer.create(getApplicationContext(), R.raw.intruso);
        
        final Button third_button20 = (Button) findViewById(R.id.third_button20);
        final MediaPlayer third_twenty = MediaPlayer.create(getApplicationContext(), R.raw.islavivo);
        final Button third_button21 = (Button) findViewById(R.id.third_button21);
        final MediaPlayer third_twentyone = MediaPlayer.create(getApplicationContext(), R.raw.lord);
        
        final Button third_button22 = (Button) findViewById(R.id.third_button22);
        final MediaPlayer third_twentytwo = MediaPlayer.create(getApplicationContext(), R.raw.lord2);
        final Button third_button23 = (Button) findViewById(R.id.third_button23);
        final MediaPlayer third_twentythree = MediaPlayer.create(getApplicationContext(), R.raw.malditasea);
        
        final Button third_button24 = (Button) findViewById(R.id.third_button24);
        final MediaPlayer third_twentyfour = MediaPlayer.create(getApplicationContext(), R.raw.matalo);
        final Button third_button25 = (Button) findViewById(R.id.third_button25);
        final MediaPlayer third_twentyfive = MediaPlayer.create(getApplicationContext(), R.raw.matalo2);
        
        //Next Button and Back
        
        final Button third_next2 = (Button) findViewById(R.id.third_next2);
        final Button third_back2 = (Button) findViewById(R.id.third_back2);
		
        
        third_button14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						third_fourteen.start();
					}
						
			}
			});
        
        third_button15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						third_fifteen.start();
					}
						
			}
			});
        
        
        third_button16.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						third_sixteen.start();
					}
						
			}
			});
        
        third_button17.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						third_seventeen.start();
					}
						
			}
			});
        
        
        third_button18.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						third_eighteen.start();
					}
						
			}
			});
        
        third_button19.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						third_nineteen.start();
					}
						
			}
			});
        
        
        third_button20.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						third_twenty.start();
					}
						
			}
			});
        
        third_button21.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						third_twentyone.start();
					}
						
			}
			});
        
        
        third_button22.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						third_twentytwo.start();
					}
						
			}
			});
        
        third_button23.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						third_twentythree.start();
					}
						
			}
			});
        
        
        third_button24.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						third_twentyfour.start();
					}
						
			}
			});
        
        third_button25.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						third_twentyfive.start();
					}
						
			}
			});
        
        
        // Next Button
        third_next2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(), FourthActivity.class);
					startActivity(i);
			}
			});
        
        // Back Button
        third_back2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(), SecondActivity.class);
					startActivity(i);
			}
			});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
