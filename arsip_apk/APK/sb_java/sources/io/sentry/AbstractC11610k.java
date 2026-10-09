package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* renamed from: io.sentry.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11610k {
    public static long a(Date r2) {
        return i(r2.getTime());
    }

    public static double b(Date r2) {
        return j(r2.getTime());
    }

    public static BigDecimal c(Double r2) {
        return BigDecimal.valueOf(r2.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static Date d() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f176917a).getTime();
    }

    public static Date e(long r1) {
        Calendar r02 = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f176917a);
        r02.setTimeInMillis(r1);
        return r02.getTime();
    }

    public static Date f(String r3) {
        return io.sentry.vendor.gson.internal.bind.util.a.f(r3, new ParsePosition(0));
    L5:
        throw new IllegalArgumentException("timestamp is not ISO format " + r3);
    }

    public static Date g(String r3) {
        return e(new BigDecimal(r3).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
    L5:
        throw new IllegalArgumentException("timestamp is not millis format " + r3);
    }

    public static String h(Date r1) {
        return io.sentry.vendor.gson.internal.bind.util.a.b(r1, true);
    }

    public static long i(long r2) {
        return r2 * 1000000;
    }

    public static double j(double r2) {
        return r2 / 1000.0d;
    }

    public static Date k(long r02) {
        return e(Double.valueOf(l(r02)).longValue());
    }

    public static double l(double r2) {
        return r2 / 1000000.0d;
    }

    public static double m(long r2) {
        return r2 / 1.0E9d;
    }

    public static long n(long r2) {
        return r2 * 1000000000;
    }

    public static Date o(AbstractC11588f2 r02) {
        if (r02 != null) goto L6;
        return null;
    L6:
        return p(r02);
    }

    public static Date p(AbstractC11588f2 r2) {
        return k(r2.g());
    }
}
