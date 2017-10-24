package org.feezu.liuli.timeselectordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.feezu.liuli.timeselector.TimeSelector;

public class MainActivity extends AppCompatActivity
{
	private TimeSelector timeSelector;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		timeSelector = new TimeSelector(this, new TimeSelector.ResultHandler()
		{
			@Override
			public void handle(String time)
			{
				Toast.makeText(getApplicationContext(), time, Toast.LENGTH_LONG).show();
			}
		}, "1989-01-30 00:00", "2018-12-31 00:00");

		//        timeSelector.setIsLoop(false);
	}

	public void show(View v)
	{
		timeSelector.show();
	}
}