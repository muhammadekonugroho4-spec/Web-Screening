package com.koushikdutta.async.http;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f41570a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f41571b = null;

    public static class a extends ThreadLocal {
        public a() {
        }

        public DateFormat a() {
            SimpleDateFormat r02 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            r02.setTimeZone(TimeZone.getTimeZone("UTC"));
            return r02;
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return a();
        }
    }

    static {
        f41570a = new a();
        f41571b = new String[]{"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    }

    public static String a(Date r1) {
        return ((DateFormat) f41570a.get()).format(r1);
    }

    public static Date b(String r7) {
        if (r7 != null) goto L14;
        return null;
    L14:
        return ((DateFormat) f41570a.get()).parse(r7);
    L7:
        String[] r1 = f41571b;
        int r2 = r1.length;
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L13;
        String r4 = r1[r3];
        return new SimpleDateFormat(r4, Locale.US).parse(r7);
    L12:
        r3 = r3 + 1;
        goto L8
    L13:
        return null;
    }
}
