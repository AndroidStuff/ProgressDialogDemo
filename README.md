# ProgressDialogDemo

## About
Demo Progress Dialog in Android. This comes as nice UX for end-user when performing Async-Task.

## Code to show ProgressDialog
```Java
ProgressDialog progressDialog = new ProgressDialog(this);
progressDialog.setIndeterminate(true);
progressDialog.setMessage("Please wait while the data is being processed..");
progressDialog.show();
```

## Good Practice - Usage Pattern
Methods to show and dismiss Progress Dialog can be extracted to utility methods.
These methods can further be pulled up to abstract super class as in this example, where the `showProgressDialog(CharSequence message)` and `dismissProgressDialog()` are pulled to `abstract class AbstractAsyncActivity` that `extends Activity`