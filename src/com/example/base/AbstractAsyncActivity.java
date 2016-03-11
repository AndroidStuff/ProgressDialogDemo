package com.example.base;

import android.app.Activity;
import android.app.ProgressDialog;

public class AbstractAsyncActivity extends Activity {

	private ProgressDialog progressDialog;

	protected void showProgressDialog(CharSequence message) {
		if (progressDialog == null) {
			progressDialog = new ProgressDialog(this);
			progressDialog.setIndeterminate(true);
		}
		progressDialog.setMessage(message);
		progressDialog.show();
	}

	protected void dismissProgressDialog() {
		if (progressDialog != null) {
			progressDialog.dismiss();
		}
	}

}
