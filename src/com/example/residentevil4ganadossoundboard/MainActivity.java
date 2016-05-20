package com.example.residentevil4ganadossoundboard;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	
	Button button1;
	MediaPlayer one;
	Button button2;
	MediaPlayer two;
	Button button3;
	MediaPlayer three;
	Button button4;
	MediaPlayer four;
	Button button5;
	MediaPlayer five;
	Button button6;
	MediaPlayer six;
	Button button7;
	MediaPlayer seven;
	Button button8;
	MediaPlayer eight;
	Button button9;
	MediaPlayer nine;
	Button button10;
	MediaPlayer ten;
	Button button11;
	MediaPlayer eleven;
	Button button12;
	MediaPlayer twelve;
	//Next Button
	Button next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Button creation and ids
        final Button button1 = (Button) findViewById(R.id.button1);
        final MediaPlayer one = MediaPlayer.create(getApplicationContext(), R.raw.aca);
        final Button button2 = (Button) findViewById(R.id.button2);
        final MediaPlayer two = MediaPlayer.create(getApplicationContext(), R.raw.agarrenlo);
        
        final Button button3 = (Button) findViewById(R.id.button3);
        final MediaPlayer three = MediaPlayer.create(getApplicationContext(), R.raw.ahiesta);
        final Button button4 = (Button) findViewById(R.id.button4);
        final MediaPlayer four = MediaPlayer.create(getApplicationContext(), R.raw.ahiesta2);
        
        final Button button5 = (Button) findViewById(R.id.button5);
        final MediaPlayer five = MediaPlayer.create(getApplicationContext(), R.raw.ahiesta3);
        final Button button6 = (Button) findViewById(R.id.button6);
        final MediaPlayer six = MediaPlayer.create(getApplicationContext(), R.raw.ahiesta4);
        
        final Button button7 = (Button) findViewById(R.id.button7);
        final MediaPlayer seven = MediaPlayer.create(getApplicationContext(), R.raw.apuren);
        final Button button8 = (Button) findViewById(R.id.button8);
        final MediaPlayer eight = MediaPlayer.create(getApplicationContext(), R.raw.aporel);
        
        final Button button9 = (Button) findViewById(R.id.button9);
        final MediaPlayer nine = MediaPlayer.create(getApplicationContext(), R.raw.asplastar);
        final Button button10 = (Button) findViewById(R.id.button10);
        final MediaPlayer ten = MediaPlayer.create(getApplicationContext(), R.raw.basta);
        
        final Button button11 = (Button) findViewById(R.id.button11);
        final MediaPlayer eleven = MediaPlayer.create(getApplicationContext(), R.raw.basta2);
        final Button button12 = (Button) findViewById(R.id.button12);
        final MediaPlayer twelve = MediaPlayer.create(getApplicationContext(), R.raw.bloqueale);
        
        //Next Button
        
        final Button next1 = (Button) findViewById(R.id.next1);
        
        button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					one.start();
					}
						
			}
			});
        
        button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					two.start();
					}
						
			}
			});
        
        
  button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					three.start();
					}
						
			}
			});
        
        button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					four.start();
					}
						
			}
			});
        
        
  button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					five.start();
					}
						
			}
			});
        
        button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					six.start();
					}
						
			}
			});
        
        
  button7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					seven.start();
					}
						
			}
			});
        
        button8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					eight.start();
					}
						
			}
			});
        
        
  button9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					nine.start();
					}
						
			}
			});
        
        button10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					ten.start();
					}
						
			}
			});
        
        
  button11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button1.setBackgroundColor(Color.RED);
					eleven.start();
					}
						
			}
			});
        
        button12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					if(v.isClickable()){
					//button2.setBackgroundColor(Color.RED);
					twelve.start();
					}
						
			}
			});
        
        
        // Next Button
        next1.setOnClickListener(new View.OnClickListener() {
			
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
        getMenuInflater().inflate(R.menu.main, menu);
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
