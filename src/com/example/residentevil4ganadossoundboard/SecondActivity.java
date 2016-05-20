package com.example.residentevil4ganadossoundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

	Button button14;
	MediaPlayer fourteen;
	Button button15;
	MediaPlayer fifteen;
	Button button16;
	MediaPlayer sixteen;
	Button button17;
	MediaPlayer seventeen;
	Button button18;
	MediaPlayer eighteen;
	Button button19;
	MediaPlayer nineteen;
	Button button20;
	MediaPlayer twenty;
	Button button21;
	MediaPlayer twentyone;
	Button button22;
	MediaPlayer twentytwo;
	Button button23;
	MediaPlayer twentythree;
	Button button24;
	MediaPlayer twentyfour;
	Button button25;
	MediaPlayer twentyfive;
	//Next Button
	Button next2;
	Button back2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//Button creation and ids
        final Button button14 = (Button) findViewById(R.id.button14);
        final MediaPlayer fourteen = MediaPlayer.create(getApplicationContext(), R.raw.cabeza);
        final Button button15 = (Button) findViewById(R.id.button15);
        final MediaPlayer fifteen = MediaPlayer.create(getApplicationContext(), R.raw.cabron);
        
        final Button button16 = (Button) findViewById(R.id.button16);
        final MediaPlayer sixteen = MediaPlayer.create(getApplicationContext(), R.raw.cabron2);
        final Button button17 = (Button) findViewById(R.id.button17);
        final MediaPlayer seventeen = MediaPlayer.create(getApplicationContext(), R.raw.cerebro);
        
        final Button button18 = (Button) findViewById(R.id.button18);
        final MediaPlayer eighteen = MediaPlayer.create(getApplicationContext(), R.raw.cogedlo);
        final Button button19 = (Button) findViewById(R.id.button19);
        final MediaPlayer nineteen = MediaPlayer.create(getApplicationContext(), R.raw.cogedlo2);
        
        final Button button20 = (Button) findViewById(R.id.button20);
        final MediaPlayer twenty = MediaPlayer.create(getApplicationContext(), R.raw.cogedlo3);
        final Button button21 = (Button) findViewById(R.id.button21);
        final MediaPlayer twentyone = MediaPlayer.create(getApplicationContext(), R.raw.cogedlo4);
        
        final Button button22 = (Button) findViewById(R.id.button22);
        final MediaPlayer twentytwo = MediaPlayer.create(getApplicationContext(), R.raw.escape);
        final Button button23 = (Button) findViewById(R.id.button23);
        final MediaPlayer twentythree = MediaPlayer.create(getApplicationContext(), R.raw.estaherido);
        
        final Button button24 = (Button) findViewById(R.id.button24);
        final MediaPlayer twentyfour = MediaPlayer.create(getApplicationContext(), R.raw.forastero);
        final Button button25 = (Button) findViewById(R.id.button25);
        final MediaPlayer twentyfive = MediaPlayer.create(getApplicationContext(), R.raw.trampa);
        
        //Next Button and Back
        
        final Button next2 = (Button) findViewById(R.id.next2);
        final Button back2 = (Button) findViewById(R.id.back2);
		
        
 button14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					fourteen.start();
					}
						
			}
			});
        
        button15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					fifteen.start();
					}
						
			}
			});
        
        
  button16.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					sixteen.start();
					}
						
			}
			});
        
        button17.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					seventeen.start();
					}
						
			}
			});
        
        
  button18.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					eighteen.start();
					}
						
			}
			});
        
        button19.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					nineteen.start();
					}
						
			}
			});
        
        
  button20.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					twenty.start();
					}
						
			}
			});
        
        button21.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					twentyone.start();
					}
						
			}
			});
        
        
  button22.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					twentytwo.start();
					}
						
			}
			});
        
        button23.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					twentythree.start();
					}
						
			}
			});
        
        
  button24.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					twentyfour.start();
					}
						
			}
			});
        
        button25.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					twentyfive.start();
					}
						
			}
			});
        
        
        // Next Button
        next2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(), ThirdActivity.class);
					startActivity(i);
			}
			});
        
        // Back Button
        back2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(), MainActivity.class);
					startActivity(i);
			}
			});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
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
