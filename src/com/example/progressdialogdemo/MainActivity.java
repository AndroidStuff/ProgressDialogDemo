package com.example.progressdialogdemo;

import com.example.base.AbstractAsyncActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AbstractAsyncActivity {
	protected static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	//onClick Event Handler
	public void showProgressBar(View v) {
		Log.d(TAG, "In showProgressBar() onclick event handler");
		new RandomAsyncTask().execute();
	}

	class RandomAsyncTask extends AsyncTask<Void, Void, Void> {

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Log.d(TAG, "In onPreExecute()");
			showProgressDialog("Relax!..while we are fetching the data for you.");
		}

		@Override
		protected Void doInBackground(Void... params) {
			Log.d(TAG, "In doInBackground()");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);
			Log.d(TAG, "In onPostExecute()");
			dismissProgressDialog();
		}
	}
}
