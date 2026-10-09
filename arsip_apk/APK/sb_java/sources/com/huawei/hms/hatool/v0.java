package com.huawei.hms.hatool;

import android.util.Pair;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class v0 {
    public static long a(String r2, long r3) {
        SimpleDateFormat r02 = new SimpleDateFormat(r2, Locale.getDefault());     // Catch: ParseException -> L4
        return r02.parse(r02.format(Long.valueOf(r3))).getTime();
    L4:
        z.f("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
        return 0;
    }

    public static Pair<String, String> a(String r5) {
        if ("_default_config_tag".equals(r5) == true) goto L11;
        String[] r02 = r5.split("-");
        if (r02.length <= 2) goto L7;
        String r03 = r02[r02.length - 1];
        int r1 = r03.length();
        String r52 = r5.substring(0, (r5.length() - r1) - 1);
    L9:
        return new Pair(r52, r03);
    L7:
        r52 = r02[0];
        r03 = r02[1];
        goto L9
    L11:
        return new Pair(r5, "");
    }

    public static String a(int r1) {
        if (r1 != 0) goto L4;
        return "oper";
    L4:
        if (r1 != 1) goto L6;
        return "maint";
    L6:
        if (r1 != 2) goto L8;
        return "preins";
    L8:
        if (r1 == 3) goto L11;
        return "alltype";
    L11:
        return "diffprivacy";
    }

    public static String a(String r1, String r2) {
        if ("_default_config_tag".equals(r1) == false) goto L6;
        return r1;
    L6:
        return r1 + "-" + r2;
    }

    public static String a(String r1, String r2, String r3) {
        if ("_default_config_tag".equals(r1) == false) goto L7;
        return "_default_config_tag#" + r3;
    L7:
        return r1 + "-" + r2 + "#" + r3;
    }

    public static Set<String> a(Set<String> r6) {
        if (r6 == null) goto L15;
        if (r6.size() == 0) goto L15;
        HashSet r02 = new HashSet();
        Iterator<String> r62 = r6.iterator();
    L8:
        if (r62.hasNext() == false) goto L13;
        String r1 = r62.next();
        if ("_default_config_tag".equals(r1) == false) goto L11;
        r02.add("_default_config_tag");
        goto L8
    L11:
        String r2 = r1 + "-oper";
        String r4 = r1 + "-maint";
        r02.add(r2);
        r02.add(r4);
        r02.add(r1 + "-diffprivacy");
        goto L8
    L13:
        return r02;
    L15:
        return new HashSet();
    }
}
