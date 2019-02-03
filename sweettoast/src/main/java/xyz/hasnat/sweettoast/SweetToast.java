package xyz.hasnat.sweettoast;

import android.content.Context;
import android.widget.Toast;

public class SweetToast {

    /** For Default Toast */
    // for default short toast
    public static void shortToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    // for default long toast
    public static void longToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /** For SUCCESS Toast */

    /** For INFO Toast */

    /** For WARNING Toast */

    /** For ERROR Toast */

    /** For ERROR Toast */

    /** Custom Toast For USER defined */

}
