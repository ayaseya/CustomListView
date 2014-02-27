package com.example.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CustomListViewActivity extends Activity {

	private String[] rate = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0" };
	private ListView list;
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_list_view);

		list = (ListView) findViewById(R.id.listView1);

		list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

		// ArrayListの生成
		adapter = new ArrayAdapter<String>
				(this, android.R.layout.simple_list_item_1, rate);

		// ListViewのデータを表示
		list.setAdapter(adapter);
		

	}

}
