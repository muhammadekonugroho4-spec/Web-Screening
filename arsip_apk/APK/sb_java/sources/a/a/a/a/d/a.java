package a.a.a.a.d;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.midtrans.sdk.corekit.core.Logger;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.FileReader;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1450a = "a";

    static {
    }

    public static int a(TelephonyManager r1) {
        return r1.getDataNetworkType();
    L4:
        e = move-exception;
        Log.e(f1450a, e.toString());
        return 0;
    }

    public static String b() {
        Runtime r02 = Runtime.getRuntime();
        return ((r02.totalMemory() - r02.freeMemory()) / SentryOptions.MAX_EVENT_SIZE_BYTES) + "MB";
    }

    public static String c(Context r2) {
        NetworkInfo r02 = ((ConnectivityManager) r2.getSystemService("connectivity")).getActiveNetworkInfo();
        TelephonyManager r22 = (TelephonyManager) r2.getSystemService("phone");
        if (r02.getType() != 1) goto L7;
        return "WIFI";
    L7:
        switch(a(r22)) {
            case 1: goto L14;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L12;
            case 7: goto L14;
            case 8: goto L12;
            case 9: goto L12;
            case 10: goto L12;
            case 11: goto L14;
            case 12: goto L12;
            case 13: goto L10;
            case 14: goto L12;
            case 15: goto L12;
            default: goto L8;
        };
    L8:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    L10:
        return "4G";
    L12:
        return "3G";
    L14:
        return "2G";
    }

    public static String[] d(Activity r4) {
        String[] r02 = new String[2];
        String r1 = r4.getPackageManager().getPackageInfo(r4.getPackageName(), 0).versionName;     // Catch: Exception -> L5
        r02[0] = r4.getApplication().getApplicationInfo().loadLabel(r4.getPackageManager()).toString();     // Catch: Exception -> L5
        r02[1] = r1;     // Catch: Exception -> L5
        return r02;
    L5:
        e = move-exception;
        Logger.d(f1450a, "appinfo:" + e.getMessage());
        return r02;
    }

    public static String e() {
        BufferedReader r02 = new BufferedReader(new FileReader("/proc/stat"));     // Catch: Exception -> L4
        String[] r1 = r02.readLine().split("[ ]+", 9);     // Catch: Exception -> L4
        long r4 = (((Long.parseLong(r1[4]) + ((Long.parseLong(r1[1]) + Long.parseLong(r1[2])) + Long.parseLong(r1[3]))) + Long.parseLong(r1[5])) + Long.parseLong(r1[6])) + Long.parseLong(r1[7]);     // Catch: Exception -> L4
        r02.close();     // Catch: Exception -> L4
        return String.valueOf((Math.round((r2 * 100) / r4) * 100) / 100) + "%";
    L4:
        e = move-exception;
        Logger.e(f1450a, "cpu:" + e.getMessage());
        return "0";
    }

    public static String f(Activity r3) {
        DisplayMetrics r02 = new DisplayMetrics();
        r3.getWindowManager().getDefaultDisplay().getMetrics(r02);
        int r32 = r02.widthPixels;
        int r1 = r02.heightPixels;
        float r2 = r02.xdpi;
        return (r32 / r2) + " x " + (r1 / r02.ydpi) + " inches";
    }
}
