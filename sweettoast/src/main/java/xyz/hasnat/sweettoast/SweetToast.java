package xyz.hasnat.sweettoast;

import android.content.Context;
import android.graphics.Color;
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
        setToastText(string, Color.WHITE);
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
        setToastText(string, Color.WHITE);
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
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_info);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }

    /** For ERROR Toast */
    public static void error(Context context, String string, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape_error);
        setToastText(string, Color.WHITE);
        setToastIcon(R.drawable.ic_close);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }


    /** Custom Toast For USER defined */
    // without Icon >> dynamic text color and background color
    public static void custom(Context context, String string, int textColor, int backgroundColor, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(backgroundColor);
        setToastText(string, textColor);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }

    // Only Icon >> in pre-defined background gray and txt Color BLACK
    public static void custom(Context context, String string, int icon, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(R.drawable.round_shape);
        setToastText(string, Color.BLACK);
        setToastIcon(icon);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }

    // text, icon, txtColor, bgColor, duration >> all
    public static void custom(Context context, String string, int icon, int textColor, int backgroundColor, int duration){
        myView = inflateMyLayout(context);
        setBackgroundLayout(backgroundColor);
        setToastText(string, textColor);
        setToastIcon(icon);
        toast = new Toast(context);
        toast.setView(myView);
        toast.show();
        waitingSec(duration);
    }

    /** SupperCustom Toast For fully USER customized */
    public static Toast supperCustom(Context context, String string, int duration) {
        toast = new Toast(context);
        // not completed

        return toast;
    }


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
    private static TextView setToastText(String string, int textColor) {
        TextView toastTitle = view.findViewById(R.id.toastTitle);
        toastTitle.setText(string);
        toastTitle.setTextColor(textColor);
        return toastTitle;
    }
    private static void setToastIcon(int resId) {
        ImageView toastIcon = view.findViewById(R.id.toastIcon);
        toastIcon.setImageResource(resId);
    }

    // time handling for toast duration
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