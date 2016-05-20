package com.example.residentevil4ganadossoundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends Activity {
	
	
	Button fourth_button14;
	MediaPlayer fourth_fourteen;
	Button fourth_button15;
	MediaPlayer fourth_fifteen;
	Button fourth_button16;
	MediaPlayer fourth_sixteen;
	Button fourth_button17;
	MediaPlayer fourth_seventeen;
	Button fourth_button18;
	MediaPlayer fourth_eighteen;
	Button fourth_button19;
	MediaPlayer fourth_nineteen;
	Button fourth_button20;
	MediaPlayer fourth_twenty;
	Button fourth_button21;
	MediaPlayer fourth_twentyone;
	Button fourth_button22;
	MediaPlayer fourth_twentytwo;
	Button fourth_button23;
	MediaPlayer fourth_twentythree;
	Button fourth_button24;
	MediaPlayer fourth_twentyfour;
	Button fourth_button25;
	MediaPlayer fourth_twentyfive;
	//Next Button
	Button fourth_next2;
	Button fourth_back2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		
		//Button creation and ids
        final Button fourth_button14 = (Button) findViewById(R.id.fourth_button14);
        final MediaPlayer fourth_fourteen = MediaPlayer.create(getApplicationContext(), R.raw.mierda);
        final Button fourth_button15 = (Button) findViewById(R.id.fourth_button15);
        final MediaPlayer fourth_fifteen = MediaPlayer.create(getApplicationContext(), R.raw.mierda2);
        
        final Button fourth_button16 = (Button) findViewById(R.id.fourth_button16);
        final MediaPlayer fourth_sixteen = MediaPlayer.create(getApplicationContext(), R.raw.moriresvivir);
        final Button fourth_button17 = (Button) findViewById(R.id.fourth_button17);
        final MediaPlayer fourth_seventeen = MediaPlayer.create(getApplicationContext(), R.raw.moriresvivir2);
        
        final Button fourth_button18 = (Button) findViewById(R.id.fourth_button18);
        final MediaPlayer fourth_eighteen = MediaPlayer.create(getApplicationContext(), R.raw.muere);
        final Button fourth_button19 = (Button) findViewById(R.id.fourth_button19);
        final MediaPlayer fourth_nineteen = MediaPlayer.create(getApplicationContext(), R.raw.muere2);
        
        final Button fourth_button20 = (Button) findViewById(R.id.fourth_button20);
        final MediaPlayer fourth_twenty = MediaPlayer.create(getApplicationContext(), R.raw.muerte);
        final Button fourth_button21 = (Button) findViewById(R.id.fourth_button21);
        final MediaPlayer fourth_twentyone = MediaPlayer.create(getApplicationContext(), R.raw.picadillo);
        
        final Button fourth_button22 = (Button) findViewById(R.id.fourth_button22);
        final MediaPlayer fourth_twentytwo = MediaPlayer.create(getApplicationContext(), R.raw.puedescorrer);
        final Button fourth_button23 = (Button) findViewById(R.id.fourth_button23);
        final MediaPlayer fourth_twentythree = MediaPlayer.create(getApplicationContext(), R.raw.quieromatar);
        
        final Button fourth_button24 = (Button) findViewById(R.id.fourth_button24);
        final MediaPlayer fourth_twentyfour = MediaPlayer.create(getApplicationContext(), R.raw.rezar);
        final Button fourth_button25 = (Button) findViewById(R.id.fourth_button25);
        final MediaPlayer fourth_twentyfive = MediaPlayer.create(getApplicationContext(), R.raw.rezar2);
        
        //Next Button and Back
        
        final Button fourth_next2 = (Button) findViewById(R.id.fourth_next2);
        final Button fourth_back2 = (Button) findViewById(R.id.fourth_back2);

		
        fourth_button14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth_fourteen.start();
					}
						
			}
			});
        
        fourth_button15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth_fifteen.start();
					}
						
			}
			});
        
        
        fourth_button16.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth_sixteen.start();
					}
						
			}
			});
        
        fourth_button17.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth_seventeen.start();
					}
						
			}
			});
        
        
        fourth_button18.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth_eighteen.start();
					}
						
			}
			});
        
        fourth_button19.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth_nineteen.start();
					}
						
			}
			});
        
        
        fourth_button20.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth_twenty.start();
					}
						
			}
			});
        
        fourth_button21.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth_twentyone.start();
					}
						
			}
			});
        
        
        fourth_button22.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth_twentytwo.start();
					}
						
			}
			});
        
        fourth_button23.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth_twentythree.start();
					}
						
			}
			});
        
        
        fourth_button24.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth_twentyfour.start();
					}
						
			}
			});
        
        fourth_button25.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth_twentyfive.start();
					}
						
			}
			});
        
        
        // Next Button
        fourth_next2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(), FifthActivity.class);
					startActivity(i);
			}
			});
        
        // Back Button
        fourth_back2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(), ThirdActivity.class);
					startActivity(i);
			}
			});
		

        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth, menu);
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
