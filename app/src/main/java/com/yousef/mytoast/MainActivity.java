package com.yousef.mytoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyToast.setShortToast(this,"This is short Toast", MyToast.SUCCESS);

        MyToast.setLongToast(this,"This is long Toast", MyToast.FAIL);
    }
}