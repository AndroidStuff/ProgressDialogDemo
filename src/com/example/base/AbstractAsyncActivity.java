package com.example.base;

import android.app.Activity;
import android.app.ProgressDialog;

public class AbstractAsyncActivity extends Activity {

	private ProgressDialog progressDialog;
	private boolean destroyed = false;

	@Override
	protected void onDestroy() {
		super.onDestroy();
		destroyed = true;
	}

	protected void showProgressDialog(CharSequence message) {
		if (progressDialog == null) {
			progressDialog = new ProgressDialog(this);
			progressDialog.setIndeterminate(true);
		}
		progressDialog.setMessage(message);
		progressDialog.show();
	}

	protected void dismissProgressDialog() {
		if (progressDialog != null && !destroyed) {
			progressDialog.dismiss();
		}
	}

}
