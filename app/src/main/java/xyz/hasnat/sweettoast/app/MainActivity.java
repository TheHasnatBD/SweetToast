package xyz.hasnat.sweettoast.app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import xyz.hasnat.sweettoast.SweetToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void defaultShort(View view) {
        SweetToast.defaultShort(this, "Android Default Short Toast");
    }

    public void defaultLong(View view) {
        SweetToast.defaultLong(this, "Android Default Long Toast");
    }

    public void info(View view) {
        SweetToast.info(this, "Info type toast", 3000);
    }

    public void success(View view) {
        SweetToast.success(this, "Success type toast", 3000);
    }

    public void warning(View view) {
        SweetToast.warning(this, "Warning type toast", 3000);
    }

    public void error(View view) {
        SweetToast.error(this, "Error type toast", 3000);
    }

    public void custom1(View view) {
        SweetToast.custom(this, "Custom Text Toast", Color.parseColor("#FFFFFF"), R.drawable.toast_bg2, 3000);
    }

    public void custom2(View view) {
        SweetToast.custom(this, "Only Custom Icon in a Toast", R.drawable.ic_stars, 3000);
    }

    public void custom3(View view) {
        SweetToast.custom(this, "It's a fully custom Toast", R.drawable.ic_android, getResources().getColor(R.color.colorWhite), R.drawable.toast_bg1, 3000);
    }
}
