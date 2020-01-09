package com.delhidairy.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.ProgressBar;
import android.widget.Toast;

public class DairyUtils {
    static ProgressDialog progressBar;



    public static void showProgress(Context context,String message,boolean cancelable){
        progressBar = new ProgressDialog(context);
        progressBar.setMessage(message);
        progressBar.setCancelable(cancelable);
        progressBar.show();
    }
    public static void displayToast(Context applicationContext, String s) {
        Toast.makeText(applicationContext, s, Toast.LENGTH_LONG).show();

    }

    public static void dismissDialog(){
        if (progressBar!=null && progressBar.isShowing()){
            progressBar.dismiss();
        }
    }


    public static boolean getConnectivityStatus(Context context) {
        boolean status = false;
        ConnectivityManager cm = (ConnectivityManager)           context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                status = true;
                return status;
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                status =true;
                return status;
            }
        } else {
            status = false;
            return status;
        }
        return status;
    }
}
