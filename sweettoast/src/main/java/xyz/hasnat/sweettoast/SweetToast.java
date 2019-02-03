package xyz.hasnat.sweettoast;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SweetToast {

    // initializations
    private static View view, myView;
    private static LayoutInflater layoutInflater;
    private static Toast toast;


    /** For Default Toast */
    // for default short toast
    public static void shortToast(Context context, String string){
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
    }
    // for default long toast
    public static void longToast(Context context, String string){
        Toast.makeText(context, string, Toast.LENGTH_LONG).show();
    }

    /** For SUCCESS Toast */
    public static void success(Context context, String string, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_success);
        setToastText(string);
        setToastIcon(R.drawable.ic_done);
        toast = new Toast(context);
        toast.setView(myView);
        //toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
        waitingSec(duration);
    }

    /** For INFO Toast */
    public static void info(Context context, String string, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_info);
        setToastText(string);
        setToastIcon(R.drawable.ic_info);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }

    /** For WARNING Toast */
    public static void warning(Context context, String string, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_warning);
        setToastText(string);
        setToastIcon(R.drawable.ic_close);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }

    /** For ERROR Toast */
    public static void error(Context context, String string, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_error);
        setToastText(string);
        setToastIcon(R.drawable.ic_close);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }


    /** Custom Toast For USER defined */
    // without Icon
    // with Icon


    // inflate for separate layout
    private static View inflateMyLayout(Context context) {
        layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.toast_layout, null);
        return view;
    }
    private static void setBackgroundLayout(int resId){
        LinearLayout layout = view.findViewById(R.id.toastLay);
        layout.setBackgroundResource(resId);
    }
    private static void setToastText(String string) {
        TextView toastTitle = view.findViewById(R.id.toastTitle);
        toastTitle.setText(string);
    }
    private static void setToastIcon(int resId) {
        ImageView toastIcon = view.findViewById(R.id.toastIcon);
        toastIcon.setImageResource(resId);
    }

    // time handling for toast showing
    private static void waitingSec(int duration) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, duration);
    }


}