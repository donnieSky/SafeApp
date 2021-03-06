package com.donnie.safe;

import com.donnie.safe.view.MainAdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

	private GridView gv_main;
	private MainAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		gv_main = (GridView) findViewById(R.id.gv_main);
		adapter = new MainAdapter(this);
		gv_main.setAdapter(adapter);
		
		gv_main.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					Intent intent = new Intent(MainActivity.this,LostProtectActivity.class);
					MainActivity.this.startActivity(intent);
					break;
				case 1:
					Intent intent1 = new Intent(MainActivity.this, BlackListActivity.class);
					MainActivity.this.startActivity(intent1);
					break;
				case 2:
					Intent intent2 = new Intent(MainActivity.this, AppManagerActivity.class);
					MainActivity.this.startActivity(intent2);
					break;
				case 3:
					Intent intent3 = new Intent(MainActivity.this, TaskManagerActivity.class);
					MainActivity.this.startActivity(intent3);
					break;
				case 4:
					Intent intent4 = new Intent(MainActivity.this, TrafficManagerActivity.class);
					MainActivity.this.startActivity(intent4);
					break;
				case 5:
					Intent intent5 = new Intent(MainActivity.this, KillVirusActivity.class);
					MainActivity.this.startActivity(intent5);
					break;
				case 7:
					Intent intent7 = new Intent(MainActivity.this,SupToolActivity.class);
					startActivity(intent7);
					break;
				case 8:
					Intent intent8 = new Intent(MainActivity.this,SettingActivity.class);
					startActivity(intent8);
					break;

				default:
					break;
				}
			}
		});
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		adapter.notifyDataSetChanged();
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
