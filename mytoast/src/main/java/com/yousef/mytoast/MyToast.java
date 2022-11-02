package com.yousef.mytoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyToast {

    public static final String SUCCESS = "Success";
    public static final String FAIL = "Fail";

    @SuppressLint("NewApi")
    public static void setShortToast(Context context, String text, String status){

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);

        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(context).inflate(R.layout.item_toast, null, false);

        TextView toastText=view.findViewById(R.id.toastText);
        ImageView toastImage = view.findViewById(R.id.toastImage);

        switch (status) {
            case SUCCESS:
                toastImage.setImageResource(R.drawable.success);
                toastText.setTextColor(context.getColor(R.color.green));
                break;
            case FAIL:
                toastImage.setImageResource(R.drawable.error);
                toastText.setTextColor(context.getColor(R.color.red));
                break;
        }

        toastText.setText(text);
        toast.setView(view);
        toast.show();
    }

    @SuppressLint("NewApi")
    public static void setLongToast(Context context, String text, String status){

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(context).inflate(R.layout.item_toast, null, false);

        TextView toastText=view.findViewById(R.id.toastText);
        ImageView toastImage = view.findViewById(R.id.toastImage);

        switch (status) {
            case SUCCESS:
                toastImage.setImageResource(R.drawable.success);
                toastText.setTextColor(context.getColor(R.color.green));
                break;
            case FAIL:
                toastImage.setImageResource(R.drawable.error);
                toastText.setTextColor(context.getColor(R.color.red));
                break;
        }

        toastText.setText(text);
        toast.setView(view);
        toast.show();
    }
}
