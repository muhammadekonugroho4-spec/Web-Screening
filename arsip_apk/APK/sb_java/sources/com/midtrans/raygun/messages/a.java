package com.midtrans.raygun.messages;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public List f42108a;

    /* renamed from: b, reason: collision with root package name */
    public String f42109b;

    public a(Context r2) {
        this.f42108a = new ArrayList();
        b();
        this.f42109b = c(r2);
    }

    public boolean a(String r3) {
        if ((InetAddress.getByName(r3) instanceof Inet4Address) == false) goto L12;
        return true;
    L12:
        return false;
    L6:
        e = move-exception;
        Log.e("isIpV4", "ip:" + e.getMessage());
        return false;
    }

    public final void b() {
        Iterator r02 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();     // Catch: Exception -> L25
    L3:
        if (r02.hasNext() == false) goto L43;
        Iterator r1 = Collections.list(((NetworkInterface) r02.next()).getInetAddresses()).iterator();     // Catch: Exception -> L25
    L7:
        if (r1.hasNext() == false) goto L3;
        InetAddress r2 = (InetAddress) r1.next();     // Catch: Exception -> L25
        if (r2.isLoopbackAddress() == true) goto L7;
        String r22 = r2.getHostAddress().toUpperCase();     // Catch: Exception -> L25
        boolean r3 = a(r22);     // Catch: Exception -> L25
        if (r3 == true) goto L13;
        if (r3 == true) goto L7;
        int r32 = r22.indexOf(37);     // Catch: Exception -> L25
        if (r32 < 0) goto L21;
        r22 = r22.substring(0, r32);     // Catch: Exception -> L25
    L21:
        if (this.f42108a.contains(r22) == true) goto L7;
        this.f42108a.add(r22);     // Catch: Exception -> L25
        goto L7
    L13:
        if (this.f42108a.contains(r22) == true) goto L7;
        this.f42108a.add(r22);     // Catch: Exception -> L25
        goto L7
    L43:
        return;
    }

    public final String c(Context r3) {
        NetworkInfo r32 = ((ConnectivityManager) r3.getSystemService("connectivity")).getActiveNetworkInfo();
        if (r32 != null) goto L5;
        return "Not connected";
    L5:
        if (r32.isConnected() == true) goto L7;
        return "Not connected";
    L7:
        switch(r32.getType()) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L14;
            case 3: goto L14;
            case 4: goto L14;
            case 5: goto L14;
            case 6: goto L11;
            default: goto L9;
        };
    L14:
        String r02 = "Connected - Mobile - ";
        switch(r32.getSubtype()) {
            case 1: goto L39;
            case 2: goto L37;
            case 3: goto L35;
            case 4: goto L33;
            case 5: goto L31;
            case 6: goto L29;
            case 7: goto L27;
            case 8: goto L25;
            case 9: goto L23;
            case 10: goto L21;
            case 11: goto L19;
            default: goto L17;
        };
    L17:
        return r02 + "subtype unknown/EVDO_B/EHRPD/LTE/HSPAP or similar";
    L19:
        return r02 + "IDEN";
    L21:
        return r02 + "HSPA";
    L23:
        return r02 + "HSUPA";
    L25:
        return r02 + "HSDPA";
    L27:
        return r02 + "1xRTT";
    L29:
        return r02 + "EVDO_A";
    L31:
        return r02 + "EVDO_0";
    L33:
        return r02 + "CDMA";
    L35:
        return r02 + "UMTS";
    L37:
        return r02 + "EDGE";
    L39:
        return r02 + "GPRS";
    L9:
        return "Connected - unknown type";
    L11:
        return "Connected - WiMax";
    L13:
        return "Connected - WiFi";
    }
}
