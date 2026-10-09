package ai.advance.event;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.android.SystemUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f extends a {
    public static String c() {
        FileInputStream r1 = new FileInputStream(new File("/sys/class/net/wlan0/address"));
        String r02 = d(r1);
        r1.close();
        return r02;
    }

    public static String d(InputStream r5) {
        if (r5 == null) goto L15;
        StringWriter r02 = new StringWriter();
        char[] r1 = new char[2048];
        BufferedReader r2 = new BufferedReader(new InputStreamReader(r5, "UTF-8"));     // Catch: Throwable -> L9
    L5:
        int r3 = r2.read(r1);     // Catch: Throwable -> L9
        if (r3 == (-1)) goto L11;
        r02.write(r1, 0, r3);     // Catch: Throwable -> L9
        goto L5
    L11:
        r5.close();
        return r02.toString();
    L9:
        th = move-exception;
        r5.close();
        throw th;
    L15:
        return "No Contents";
    }

    public static String e() {
        Iterator r02 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();     // Catch: Exception -> L21
    L4:
        if (r02.hasNext() == false) goto L28;
        NetworkInterface r1 = (NetworkInterface) r02.next();     // Catch: Exception -> L21
        if (r1.getName().equalsIgnoreCase("wlan0") == false) goto L4;
        byte[] r03 = r1.getHardwareAddress();     // Catch: Exception -> L21
        if (r03 != null) goto L11;
        return "";
    L11:
        StringBuilder r12 = new StringBuilder();     // Catch: Exception -> L21
        int r2 = r03.length;     // Catch: Exception -> L21
        int r3 = 0;
    L12:
        if (r3 >= r2) goto L15;
        r12.append(String.format("%02X:", new Object[]{Byte.valueOf(r03[r3])}));     // Catch: Exception -> L21
        r3 = r3 + 1;     // Catch: Exception -> L21
        goto L12
    L15:
        if (r12.length() <= 0) goto L17;
        r12.deleteCharAt(r12.length() - 1);     // Catch: Exception -> L21
    L17:
        return r12.toString();
    L28:
        return null;
    L19:
        return null;
    }

    public static String f(Context r2) {
        if (r2 != null) goto L5;
    L16:
        return "02:00:00:00:00:00";
    L5:
        if (a.b(r2, "android.permission.ACCESS_WIFI_STATE") == false) goto L16;
        WifiManager r22 = (WifiManager) r2.getApplicationContext().getSystemService(Constants.CLTAP_CONNECTED_TO_WIFI);
        if (r22 == null) goto L16;
        WifiInfo r23 = r22.getConnectionInfo();
        if (r23 == null) goto L16;
        String r24 = r23.getMacAddress();
        if ("02:00:00:00:00:00".equals(r24) == false) goto L20;
        String r25 = e();     // Catch: Exception -> L17
        if (r25 != null) goto L21;
        return c();
    L21:
        return r25;
    L20:
        return r24;
    }

    public static String g(Context r5) {
        if (a.b(r5, "android.permission.ACCESS_NETWORK_STATE") == true) goto L37;
    L35:
        return SystemUtils.UNKNOWN;
    L37:
        NetworkInfo r02 = ((ConnectivityManager) r5.getSystemService("connectivity")).getActiveNetworkInfo();     // Catch: Exception -> L36
        if (r02 != null) goto L8;
        return "no_network";
    L8:
        int r3 = r02.getType();     // Catch: Exception -> L36
        if (r3 != 1) goto L12;
        return "WIFI";
    L12:
        if (r3 != 0) goto L31;
        TelephonyManager r52 = (TelephonyManager) r5.getSystemService("phone");     // Catch: Exception -> L36
        if (r52 == null) goto L16;
        int r53 = r52.getNetworkType();     // Catch: Exception -> L36
    L18:
        if (r53 == 20) goto L28;
        switch(r53) {
            case 1: goto L26;
            case 2: goto L26;
            case 3: goto L24;
            case 4: goto L26;
            case 5: goto L24;
            case 6: goto L24;
            case 7: goto L26;
            case 8: goto L24;
            case 9: goto L24;
            case 10: goto L24;
            case 11: goto L26;
            case 12: goto L24;
            case 13: goto L22;
            case 14: goto L24;
            case 15: goto L24;
            default: goto L21;
        };     // Catch: Exception -> L36
    L22:
        return "4G";
    L24:
        return "3G";
    L26:
        return "2G";
    L21:
        return String.valueOf(r53);
    L28:
        return "5G";
    L16:
        r53 = 0;
        goto L18
    L31:
        if (r3 != (-1)) goto L34;
        return "no_network";
    L34:
        return r02.getTypeName();
    }
}
