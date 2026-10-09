package com.midtrans.sdk.corekit.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.timepicker.TimeModel;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.snap.Authentication;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class Utils {
    public static final String CARD_TYPE_AMEX = "AMEX";
    public static final String CARD_TYPE_JCB = "JCB";
    public static final String CARD_TYPE_MASTERCARD = "MASTERCARD";
    public static final String CARD_TYPE_VISA = "VISA";
    private static final long DAY = 86400000;
    private static final long HOUR = 3600000;
    private static final long MINUTE = 60000;
    private static final long SECOND = 1000;

    public Utils() {
    }

    public static int dpToPx(int r1) {
        return (int) (r1 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static String formatDouble(double r4) {
        long r02 = (long) r4;
        if (r4 != r02) goto L9;
        return String.format(TimeModel.NUMBER_FORMAT, new Object[]{Long.valueOf(r02)});
    L9:
        return String.format("%s", new Object[]{Double.valueOf(r4)});
    L10:
        e = move-exception;
        Logger.e("formatDouble():" + e.getMessage());
        return "0";
    }

    public static String getCardType(String r8) {
    L44:
        return "";
    L4:
        if (r8.isEmpty() == false) goto L8;
        return "";
    L8:
        if (r8.charAt(0) != '4') goto L12;
        return CARD_TYPE_VISA;
    L12:
        if (r8.charAt(0) != '5') goto L26;
        if (r8.charAt(1) != '1') goto L16;
        return CARD_TYPE_MASTERCARD;
    L16:
        if (r8.charAt(1) != '2') goto L18;
        return CARD_TYPE_MASTERCARD;
    L18:
        if (r8.charAt(1) != '3') goto L20;
        return CARD_TYPE_MASTERCARD;
    L20:
        if (r8.charAt(1) != '4') goto L22;
        return CARD_TYPE_MASTERCARD;
    L22:
        if (r8.charAt(1) != '5') goto L26;
        return CARD_TYPE_MASTERCARD;
    L26:
        if (r8.charAt(0) != '3') goto L35;
        if (r8.charAt(1) != '4') goto L31;
        return CARD_TYPE_AMEX;
    L31:
        if (r8.charAt(1) != '7') goto L35;
        return CARD_TYPE_AMEX;
    L35:
        if (r8.startsWith("35") == false) goto L37;
        return CARD_TYPE_JCB;
    L37:
        if (r8.startsWith("2131") == true) goto L52;
        if (r8.startsWith("1800") == true) goto L53;
        return "";
    L53:
        return CARD_TYPE_JCB;
    L52:
        return CARD_TYPE_JCB;
    }

    public static String getDeviceType(Activity r4) {
        DisplayMetrics r02 = new DisplayMetrics();
        r4.getWindowManager().getDefaultDisplay().getMetrics(r02);
        float r42 = r02.heightPixels / r02.ydpi;
        float r1 = r02.widthPixels / r02.xdpi;
        if (Math.sqrt((r1 * r1) + (r42 * r42)) < 6.5d) goto L6;
        return "TABLET";
    L6:
        return "PHONE";
    }

    public static String getFormattedAmount(double r3) {
        DecimalFormatSymbols r02 = new DecimalFormatSymbols(Locale.US);     // Catch: Throwable -> L4
        r02.setDecimalSeparator('.');     // Catch: Throwable -> L4
        r02.setGroupingSeparator(',');     // Catch: Throwable -> L4
        return new DecimalFormat("#,###.##", r02).format(r3);
    L5:
        return "" + r3;
    }

    public static String getFormattedCreditCardNumber(String r4) {
        StringBuilder r02 = new StringBuilder();
        if (r4.length() != 16) goto L8;
        int r1 = 0;
    L5:
        if (r1 >= 16) goto L8;
        int r3 = r1 + 4;
        r02.append(r4.substring(r1, r3));
        r02.append(" ");
        r1 = r3;
    L8:
        return r02.toString();
    }

    public static String getFormattedTime(long r2) {
        SimpleDateFormat r02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        r02.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        return r02.format(new Date(r2));
    }

    public static String getMonth(int r02) {
        switch(r02) {
            case 1: goto L27;
            case 2: goto L25;
            case 3: goto L23;
            case 4: goto L21;
            case 5: goto L19;
            case 6: goto L17;
            case 7: goto L15;
            case 8: goto L13;
            case 9: goto L11;
            case 10: goto L9;
            case 11: goto L7;
            case 12: goto L5;
            default: goto L3;
        };
    L3:
        return "Invalid Month";
    L5:
        return "December";
    L7:
        return "November";
    L9:
        return "October";
    L11:
        return "September";
    L13:
        return "August";
    L15:
        return "July";
    L17:
        return "June";
    L19:
        return "May";
    L21:
        return "April";
    L23:
        return "March";
    L25:
        return "February";
    L27:
        return "January";
    }

    public static String getValidityTime(String r9) {
        if (r9 == null) goto L9;
        String[] r1 = r9.split(" ");
        if (r1.length <= 1) goto L9;
        SimpleDateFormat r2 = new SimpleDateFormat("yyyy-MM-dd");     // Catch: ParseException -> L7
        Calendar r4 = Calendar.getInstance();     // Catch: ParseException -> L7
        r4.setTime(r2.parse(r1[0]));     // Catch: ParseException -> L7
        r4.add(5, 1);     // Catch: ParseException -> L7
        String r22 = r2.format(r4.getTime());     // Catch: ParseException -> L7
        String[] r42 = r22.split("-");     // Catch: ParseException -> L7
        String r6 = getMonth(Integer.parseInt(r42[1]));     // Catch: ParseException -> L7
        String r02 = "" + r42[2] + " " + r6 + " " + r42[0] + ", " + r1[1];     // Catch: ParseException -> L7
        Logger.i("after parsing validity date becomes : " + r22);     // Catch: ParseException -> L7
        Logger.i("month is : " + r6);     // Catch: ParseException -> L7
        Logger.i("validity time is : " + r02);     // Catch: ParseException -> L7
        return r02;
    L7:
        e = move-exception;
        Logger.e("Error while parsing date : " + e.getMessage());
    L9:
        return r9;
    }

    public static void hideKeyboard(Context r2, View r3) {
        InputMethodManager r22 = (InputMethodManager) r2.getSystemService("input_method");     // Catch: Exception -> L6
        if (r3 == null) goto L11;
        r22.hideSoftInputFromWindow(r3.getWindowToken(), 0);     // Catch: Exception -> L6
        r3.clearFocus();     // Catch: Exception -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        Logger.e(e.getMessage());
    }

    public static boolean isNetworkAvailable(Context r2) {
        ConnectivityManager r22 = (ConnectivityManager) r2.getSystemService("connectivity");     // Catch: Exception -> L11
        if (r22.getActiveNetworkInfo() != null) goto L6;
    L13:
        return false;
    L6:
        if (r22.getActiveNetworkInfo().isAvailable() == false) goto L13;
        if (r22.getActiveNetworkInfo().isConnected() == false) goto L13;
        return true;
    L11:
        e = move-exception;
        Logger.e(e.getMessage());
        return false;
    }

    public static String mappingToCreditCardAuthentication(String r2, boolean r3) {
        if (r2.equalsIgnoreCase(Authentication.AUTH_3DS) == false) goto L7;
        if (r3 == false) goto L7;
        return Authentication.AUTH_3DS;
    L7:
        if (r2.equalsIgnoreCase("rba") == false) goto L10;
        if (r3 == true) goto L12;
        return "rba";
    L12:
        return "none";
    L10:
        return "none";
    }
}
