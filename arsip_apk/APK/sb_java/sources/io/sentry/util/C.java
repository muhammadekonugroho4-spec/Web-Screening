package io.sentry.util;

import io.sentry.Q;
import io.sentry.SentryLevel;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f176840a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f176841b = null;

    static {
        f176840a = Charset.forName("UTF-8");
        f176841b = Pattern.compile("[\\W_]+");
    }

    public static String a(String r4, Q r5) {
        if (r4 != null) goto L5;
    L15:
        return null;
    L5:
        if (r4.isEmpty() == true) goto L15;
        return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(r4.getBytes(f176840a))).toString(16)).toString();
    L11:
        e = move-exception;
        r5.a(SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", e);
    L9:
        th = move-exception;
        r5.c(SentryLevel.INFO, "string: %s could not calculate its hash", new Object[]{th, r4});
        goto L15
    }

    public static String b(String r4) {
        if (r4 != null) goto L4;
        return r4;
    L4:
        if (r4.isEmpty() == true) goto L13;
        String[] r42 = f176841b.split(r4, -1);
        StringBuilder r02 = new StringBuilder();
        int r1 = r42.length;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L10;
        r02.append(c(r42[r2]));
        r2 = r2 + 1;
        goto L7
    L10:
        return r02.toString();
    L13:
        return r4;
    }

    public static String c(String r4) {
        if (r4 != null) goto L4;
        return r4;
    L4:
        if (r4.isEmpty() == true) goto L9;
        StringBuilder r02 = new StringBuilder();
        String r1 = r4.substring(0, 1);
        Locale r3 = Locale.ROOT;
        r02.append(r1.toUpperCase(r3));
        r02.append(r4.substring(1).toLowerCase(r3));
        return r02.toString();
    L9:
        return r4;
    }

    public static int d(String r3, char r4) {
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r02 >= r3.length()) goto L9;
        if (r3.charAt(r02) != r4) goto L8;
        r1 = r1 + 1;
    L8:
        r02 = r02 + 1;
        goto L4
    L9:
        return r1;
    }

    public static String e(String r2) {
        if (r2 == null) goto L9;
        int r02 = r2.lastIndexOf(".");
        if (r02 < 0) goto L11;
        int r03 = r02 + 1;
        if (r2.length() > r03) goto L8;
        return r2;
    L8:
        return r2.substring(r03);
    L11:
        return r2;
    L9:
        return null;
    }

    public static String f(CharSequence r2, Iterable r3) {
        StringBuilder r02 = new StringBuilder();
        Iterator r32 = r3.iterator();
        if (r32.hasNext() == false) goto L9;
        r02.append((CharSequence) r32.next());
    L6:
        if (r32.hasNext() == false) goto L9;
        r02.append(r2);
        r02.append((CharSequence) r32.next());
    L9:
        return r02.toString();
    }

    public static String g(String r1) {
        if (r1.equals("0000-0000") == false) goto L6;
        return "00000000-0000-0000-0000-000000000000";
    L6:
        return r1;
    }

    public static String h(String r2, String r3) {
        if (r2 == null) goto L10;
        if (r3 != null) goto L5;
        return r2;
    L5:
        if (r2.startsWith(r3) == true) goto L7;
        return r2;
    L7:
        if (r2.endsWith(r3) == true) goto L9;
        return r2;
    L9:
        return r2.substring(r3.length(), r2.length() - r3.length());
    L10:
        return r2;
    }

    public static String i(Object r02) {
        if (r02 != null) goto L6;
        return null;
    L6:
        return r02.toString();
    }
}
