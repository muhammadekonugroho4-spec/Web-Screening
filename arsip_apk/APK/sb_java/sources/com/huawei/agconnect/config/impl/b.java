package com.huawei.agconnect.config.impl;

import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class b {
    public static void a(Closeable r1) {
        if (r1 == null) goto L9;
        r1.close();     // Catch: IOException -> L5
        return;
    L5:
        Log.e("Utils", "Exception when closing the 'Closeable'.");
        return;
    }

    public static void b(Reader r1, Writer r2) {
        c(r1, r2, new char[4096]);
    }

    public static void c(Reader r2, Writer r3, char[] r4) {
    L2:
        int r02 = r2.read(r4);
        if ((-1) == r02) goto L5;
        r3.write(r4, 0, r02);
        goto L2
    }

    public static Map d(Map r3) {
        HashMap r02 = new HashMap();
        Iterator r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry r1 = (Map.Entry) r32.next();
        r02.put(e((String) r1.getKey()), r1.getValue());
        goto L4
    L6:
        return r02;
    }

    public static String e(String r3) {
        int r1 = 0;
        if (r3.length() <= 0) goto L8;
    L5:
        if (r3.charAt(r1) != '/') goto L8;
        r1 = r1 + 1;
    L8:
        return RemoteSettings.FORWARD_SLASH_STRING + r3.substring(r1);
    }

    public static com.huawei.agconnect.b f(String r1, String r2) {
        if (r1 == null) goto L33;
        char r22 = 65535;
        switch(r1.hashCode()) {
            case 2155: goto L19;
            case 2177: goto L15;
            case 2627: goto L11;
            case 2644: goto L7;
            default: goto L22;
        };
    L22:
        switch(r22) {
            case 0: goto L32;
            case 1: goto L30;
            case 2: goto L28;
            case 3: goto L26;
            default: goto L24;
        };
    L24:
        return com.huawei.agconnect.b.f38818b;
    L26:
        return com.huawei.agconnect.b.f38821f;
    L28:
        return com.huawei.agconnect.b.f38820e;
    L30:
        return com.huawei.agconnect.b.d;
    L32:
        return com.huawei.agconnect.b.f38819c;
    L7:
        if (r1.equals("SG") == false) goto L22;
        r22 = 3;
        goto L22
    L11:
        if (r1.equals("RU") == false) goto L22;
        r22 = 2;
        goto L22
    L15:
        if (r1.equals("DE") == false) goto L22;
        r22 = 1;
        goto L22
    L19:
        if (r1.equals("CN") == false) goto L22;
        r22 = 0;
        goto L22
    L33:
        if (r2 == null) goto L51;
        if (r2.contains("connect-drcn") == false) goto L39;
        return com.huawei.agconnect.b.f38819c;
    L39:
        if (r2.contains("connect-dre") == false) goto L43;
        return com.huawei.agconnect.b.d;
    L43:
        if (r2.contains("connect-drru") == false) goto L47;
        return com.huawei.agconnect.b.f38820e;
    L47:
        if (r2.contains("connect-dra") == false) goto L51;
        return com.huawei.agconnect.b.f38821f;
    L51:
        return com.huawei.agconnect.b.f38818b;
    }

    public static String g(InputStream r2, String r3) {
        StringWriter r02 = new StringWriter();
        b(new InputStreamReader(r2, r3), r02);
        return r02.toString();
    }
}
