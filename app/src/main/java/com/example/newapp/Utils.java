package com.example.newapp;

import android.content.Context;
import android.widget.Toast;

public class Utils {
    public static void makeToast(String message, Toast toast, Context context) {
        if (toast == null) {
            toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
        } else {
            toast.setText(message);
        }
        toast.show();
    }
}
