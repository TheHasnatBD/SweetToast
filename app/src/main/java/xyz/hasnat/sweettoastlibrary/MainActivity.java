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

    public void info(View view) {
        SweetToast.info(this, "Info type toast", 4000);
    }

    public void success(View view) {
        SweetToast.success(this, "Success type toast", 3000);
    }

    public void warning(View view) {
        SweetToast.warning(this, "Warning type toast", 2000);
    }

    public void error(View view) {
        SweetToast.error(this, "Error type toast", 1000);
    }

    public void custom(View view) {
    }
}
