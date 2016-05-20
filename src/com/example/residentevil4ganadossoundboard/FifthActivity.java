package com.example.residentevil4ganadossoundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends Activity {
	
	
	
	Button fourth5_button14;
	MediaPlayer fourth5_fourteen;
	Button fourth5_button15;
	MediaPlayer fourth5_fifteen;
	Button fourth5_button16;
	MediaPlayer fourth5_sixteen;
	Button fourth5_button17;
	MediaPlayer fourth5_seventeen;
	Button fourth5_button18;
	MediaPlayer fourth5_eighteen;
	Button fourth5_button19;
	MediaPlayer fourth5_nineteen;
	Button fourth5_button20;
	MediaPlayer fourth5_twenty;
	Button fourth5_button21;
	MediaPlayer fourth5_twentyone;
	Button fourth5_button22;
	MediaPlayer fourth5_twentytwo;
	Button fourth5_button23;
	MediaPlayer fourth5_twentythree;
	

	//Back Button
	
	Button fourth5_back2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fifth);
		
		
		//Button creation and ids
        final Button fourth5_button14 = (Button) findViewById(R.id.fourth5_button14);
        final MediaPlayer fourth5_fourteen = MediaPlayer.create(getApplicationContext(), R.raw.rezar3);
        final Button fourth5_button15 = (Button) findViewById(R.id.fourth5_button15);
        final MediaPlayer fourth5_fifteen = MediaPlayer.create(getApplicationContext(), R.raw.romperpedazos);
        
        final Button fourth5_button16 = (Button) findViewById(R.id.fourth5_button16);
        final MediaPlayer fourth5_sixteen = MediaPlayer.create(getApplicationContext(), R.raw.socerdo);
        final Button fourth5_button17 = (Button) findViewById(R.id.fourth5_button17);
        final MediaPlayer fourth5_seventeen = MediaPlayer.create(getApplicationContext(), R.raw.tecogi);
        
        final Button fourth5_button18 = (Button) findViewById(R.id.fourth5_button18);
        final MediaPlayer fourth5_eighteen = MediaPlayer.create(getApplicationContext(), R.raw.tecogi2);
        final Button fourth5_button19 = (Button) findViewById(R.id.fourth5_button19);
        final MediaPlayer fourth5_nineteen = MediaPlayer.create(getApplicationContext(), R.raw.tevoyamatar);
        
        final Button fourth5_button20 = (Button) findViewById(R.id.fourth5_button20);
        final MediaPlayer fourth5_twenty = MediaPlayer.create(getApplicationContext(), R.raw.tevoyamatar2);
        final Button fourth5_button21 = (Button) findViewById(R.id.fourth5_button21);
        final MediaPlayer fourth5_twentyone = MediaPlayer.create(getApplicationContext(), R.raw.tevoyamatar3);
        
        final Button fourth5_button22 = (Button) findViewById(R.id.fourth5_button22);
        final MediaPlayer fourth5_twentytwo = MediaPlayer.create(getApplicationContext(), R.raw.tevoyamatar4);
        final Button fourth5_button23 = (Button) findViewById(R.id.fourth5_button23);
        final MediaPlayer fourth5_twentythree = MediaPlayer.create(getApplicationContext(), R.raw.tevoyamatar5);

        
        // Button and Back
       
        final Button fourth5_back2 = (Button) findViewById(R.id.fourth5_back2);

		
 fourth5_button14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth5_fourteen.start();
					}
						
			}
			});
        
        fourth5_button15.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth5_fifteen.start();
					}
						
			}
			});
        
        
        fourth5_button16.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth5_sixteen.start();
					}
						
			}
			});
        
        fourth5_button17.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth5_seventeen.start();
					}
						
			}
			});
        
        
        fourth5_button18.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth5_eighteen.start();
					}
						
			}
			});
        
        fourth5_button19.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth5_nineteen.start();
					}
						
			}
			});
        
        
        fourth5_button20.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth5_twenty.start();
					}
						
			}
			});
        
        fourth5_button21.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth5_twentyone.start();
					}
						
			}
			});
        
        
        fourth5_button22.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
						fourth5_twentytwo.start();
					}
						
			}
			});
        
        fourth5_button23.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
						fourth5_twentythree.start();
					}
						
			}
			});
        
   
       
        
        // Back Button
        fourth5_back2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					Intent i = new Intent(getApplicationContext(), FourthActivity.class);
					startActivity(i);
			}
			});
		
        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fifth, menu);
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
