package com.koushikdutta.async.http.cache;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: com.koushikdutta.async.http.cache.a$a, reason: collision with other inner class name */
    public interface InterfaceC0449a {
        void a(String r1, String r2);
    }

    public static void a(String r4, InterfaceC0449a r5) {
        if (r4 == null) goto L20;
        int r02 = 0;
    L6:
        if (r02 >= r4.length()) goto L28;
        int r1 = c(r4, r02, "=,");
        String r03 = r4.substring(r02, r1).trim();
        if (r1 == r4.length()) goto L19;
        if (r4.charAt(r1) == ',') goto L19;
        int r12 = d(r4, r1 + 1);
        if (r12 < r4.length()) goto L15;
    L17:
        int r2 = c(r4, r12, Constants.SEPARATOR_COMMA);
        String r13 = r4.substring(r12, r2).trim();
    L18:
        r5.a(r03, r13);
        r02 = r2;
        goto L6
    L15:
        if (r4.charAt(r12) != '\"') goto L17;
        int r14 = r12 + 1;
        int r22 = c(r4, r14, "\"");
        r13 = r4.substring(r14, r22);
        r2 = r22 + 1;
    L19:
        r5.a(r03, null);
        r02 = r1 + 1;
        goto L6
    L28:
        return;
    }

    public static int b(String r4) {
        long r02 = Long.parseLong(r4);     // Catch: NumberFormatException -> L13
        if (r02 <= 2147483647L) goto L8;
        return Integer.MAX_VALUE;
    L8:
        if (r02 >= 0) goto L12;
        return 0;
    L12:
        return (int) r02;
    L13:
        return -1;
    }

    public static int c(String r2, int r3, String r4) {
    L3:
        if (r3 >= r2.length()) goto L8;
        if (r4.indexOf(r2.charAt(r3)) != (-1)) goto L8;
        r3 = r3 + 1;
    L8:
        return r3;
    }

    public static int d(String r2, int r3) {
    L3:
        if (r3 >= r2.length()) goto L10;
        char r02 = r2.charAt(r3);
        if (r02 == ' ') goto L9;
        if (r02 != '\t') goto L10;
    L9:
        r3 = r3 + 1;
    L10:
        return r3;
    }
}
