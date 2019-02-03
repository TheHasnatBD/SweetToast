package xyz.hasnat.sweettoastlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import xyz.hasnat.sweettoast.SweetToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void defaultShort(View view) {
        SweetToast.shortToast(this, "Android Default Short Toast");
    }

    public void defaultLong(View view) {
        SweetToast.longToast(this, "Android Default Long Toast");
    }
}
