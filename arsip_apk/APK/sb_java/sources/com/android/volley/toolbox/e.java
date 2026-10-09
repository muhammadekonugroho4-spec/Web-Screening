package com.android.volley.toolbox;

import com.android.volley.a;
import com.clevertap.android.sdk.Constants;
import com.google.common.net.HttpHeaders;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public abstract class e {
    public static List a(List r4, a.C0304a r5) {
        TreeSet r02 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (r4.isEmpty() == true) goto L8;
        Iterator r1 = r4.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        r02.add(((com.android.volley.e) r1.next()).a());
    L8:
        ArrayList r12 = new ArrayList(r4);
        List r42 = r5.f31977h;
        if (r42 == null) goto L19;
        if (r42.isEmpty() == true) goto L26;
        Iterator r43 = r5.f31977h.iterator();
    L14:
        if (r43.hasNext() == false) goto L26;
        com.android.volley.e r52 = (com.android.volley.e) r43.next();
        if (r02.contains(r52.a()) == true) goto L14;
        r12.add(r52);
    L26:
        return r12;
    L19:
        if (r5.f31976g.isEmpty() == true) goto L26;
        Iterator r44 = r5.f31976g.entrySet().iterator();
    L22:
        if (r44.hasNext() == false) goto L26;
        Map.Entry r53 = (Map.Entry) r44.next();
        if (r02.contains(r53.getKey()) == true) goto L22;
        r12.add(new com.android.volley.e((String) r53.getKey(), (String) r53.getValue()));
        goto L22
    }

    public static String b(long r2) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(r2));
    }

    public static Map c(a.C0304a r5) {
        if (r5 == null) goto L4;
        HashMap r02 = new HashMap();
        String r1 = r5.f31972b;
        if (r1 == null) goto L8;
        r02.put(HttpHeaders.IF_NONE_MATCH, r1);
    L8:
        long r12 = r5.d;
        if (r12 <= 0) goto L11;
        r02.put(HttpHeaders.IF_MODIFIED_SINCE, b(r12));
    L11:
        return r02;
    L4:
        return Collections.EMPTY_MAP;
    }

    public static SimpleDateFormat d(String r2) {
        SimpleDateFormat r02 = new SimpleDateFormat(r2, Locale.US);
        r02.setTimeZone(TimeZone.getTimeZone("GMT"));
        return r02;
    }

    public static a.C0304a e(com.android.volley.h r20) {
        long r1 = System.currentTimeMillis();
        Map r3 = r20.f32003c;
        if (r3 != null) goto L5;
        return null;
    L5:
        String r5 = (String) r3.get(HttpHeaders.DATE);
        if (r5 == null) goto L8;
        long r8 = f(r5);
    L9:
        String r52 = (String) r3.get(HttpHeaders.CACHE_CONTROL);
        int r10 = 0;
        if (r52 == null) goto L37;
        String[] r53 = r52.split(Constants.SEPARATOR_COMMA, 0);
        boolean r11 = false;
        long r12 = 0;
        long r14 = 0;
    L13:
        if (r10 >= r53.length) goto L36;
        String r4 = r53[r10].trim();
        if (r4.equals("no-cache") == true) goto L35;
        if (r4.equals("no-store") == true) goto L35;
        if (r4.startsWith("max-age=") == false) goto L25;
        r12 = Long.parseLong(r4.substring(8));     // Catch: Exception -> L63
    L34:
        r10 = r10 + 1;
        goto L13
    L25:
        if (r4.startsWith("stale-while-revalidate=") == false) goto L30;
        r14 = Long.parseLong(r4.substring(23));     // Catch: Exception -> L63
        goto L34
    L30:
        if (r4.equals("must-revalidate") == false) goto L32;
    L33:
        r11 = true;
        goto L34
    L32:
        if (r4.equals("proxy-revalidate") == false) goto L34;
    L35:
        return null;
    L36:
        long r18 = 0;
        r10 = 1;
    L38:
        String r42 = (String) r3.get(HttpHeaders.EXPIRES);
        if (r42 == null) goto L41;
        long r43 = f(r42);
    L42:
        String r6 = (String) r3.get(HttpHeaders.LAST_MODIFIED);
        if (r6 == null) goto L46;
        long r62 = f(r6);
    L47:
        String r13 = (String) r3.get(HttpHeaders.ETAG);
        if (r10 == 0) goto L55;
        long r122 = r1 + (r12 * 1000);
        if (r11 == false) goto L52;
        long r142 = r122;
    L53:
        long r44 = r122;
    L61:
        a.C0304a r2 = new a.C0304a();
        r2.f31971a = r20.f32002b;
        r2.f31972b = r13;
        r2.f31975f = r44;
        r2.f31974e = r142;
        r2.f31973c = r8;
        r2.d = r62;
        r2.f31976g = r3;
        r2.f31977h = r20.d;
        return r2;
    L52:
        r142 = (r14 * 1000) + r122;
        goto L53
    L55:
        if (r8 > r18) goto L57;
    L60:
        r44 = r18;
    L59:
        r142 = r44;
        goto L61
    L57:
        if (r43 < r8) goto L60;
        r44 = r1 + (r43 - r8);
        goto L59
    L46:
        r62 = r18;
        goto L47
    L41:
        r43 = r18;
        goto L42
    L37:
        r18 = 0;
        r11 = false;
        r12 = 0;
        r14 = 0;
        goto L38
    L8:
        r8 = 0;
        goto L9
    }

    public static long f(String r3) {
        return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(r3).getTime();
    L4:
        e = move-exception;
        if ("0".equals(r3) == false) goto L8;
    L11:
        com.android.volley.m.e("Unable to parse dateStr: %s, falling back to 0", new Object[]{r3});
        return 0;
    L8:
        if ("-1".equals(r3) == true) goto L11;
        com.android.volley.m.d(e, "Unable to parse dateStr: %s, falling back to 0", new Object[]{r3});
        return 0;
    }

    public static List g(Map r4) {
        ArrayList r02 = new ArrayList(r4.size());
        Iterator r42 = r4.entrySet().iterator();
    L4:
        if (r42.hasNext() == false) goto L6;
        Map.Entry r1 = (Map.Entry) r42.next();
        r02.add(new com.android.volley.e((String) r1.getKey(), (String) r1.getValue()));
        goto L4
    L6:
        return r02;
    }

    public static Map h(List r3) {
        TreeMap r02 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        com.android.volley.e r1 = (com.android.volley.e) r32.next();
        r02.put(r1.a(), r1.b());
        goto L4
    L6:
        return r02;
    }
}
