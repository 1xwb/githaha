package com.example.listview1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private String data[] = { "�㶫ũ����", "�㶫ũ����", "�㶫ũ����", "�㶫ũ����", "�㶫ũ����",
			"�㶫ũ����", "�㶫ũ����", "�㶫ũ����", "�㶫ũ����", "�㶫ũ����", "�㶫ũ����", "�㶫ũ����",
			"�㶫ũ����" };

	private ListView listview = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		listview = new ListView(this);//ʵ����listview
		listview.setAdapter(new ArrayAdapter<String>(this,//����listview����ʾ�������� 
				android.R.layout.simple_expandable_list_item_1, this.data));
		setContentView(listview);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
