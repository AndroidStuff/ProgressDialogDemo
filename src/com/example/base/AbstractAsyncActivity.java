package com.example.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;

public class AbstractAsyncActivity extends Activity {
	protected static final String TAG = AbstractAsyncActivity.class.getSimpleName();

	private ProgressDialog progressDialog;
	private boolean destroyed = false;

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "In onDestroy()");
		destroyed = true;
	}

	protected void showProgressDialog(CharSequence message) {
		Log.d(TAG, "In showProgressDialog(..)");
		if (progressDialog == null) {
			progressDialog = new ProgressDialog(this);
			progressDialog.setIndeterminate(true);
		}
		progressDialog.setMessage(message);
		progressDialog.show();
	}

	protected void dismissProgressDialog() {
		Log.d(TAG, "In dismissProgressDialog()");
		if (progressDialog != null && !destroyed) {
			progressDialog.dismiss();
		}
	}

}
