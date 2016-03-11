package com.example.progressdialogdemo;

import com.example.base.AbstractAsyncActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AbstractAsyncActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	//onClick Event Handler
	public void showProgressBar(View v) {
		new RandomAsyncTask().execute();
	}

	class RandomAsyncTask extends AsyncTask<Void, Void, Void> {

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			showProgressDialog("Relax!..while we are fetching the data for you.");
		}

		@Override
		protected Void doInBackground(Void... params) {
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
			dismissProgressDialog();
		}
	}
}
