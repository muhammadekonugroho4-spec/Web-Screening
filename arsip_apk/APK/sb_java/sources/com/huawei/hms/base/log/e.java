package com.huawei.hms.base.log;

import android.os.Process;
import android.util.Log;
import com.gojek.ojosdk.exif.ExifInterface;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f39020a;

    /* renamed from: b, reason: collision with root package name */
    private String f39021b;

    /* renamed from: c, reason: collision with root package name */
    private String f39022c;
    private int d;

    /* renamed from: e, reason: collision with root package name */
    private long f39023e;

    /* renamed from: f, reason: collision with root package name */
    private long f39024f;

    /* renamed from: g, reason: collision with root package name */
    private String f39025g;

    /* renamed from: h, reason: collision with root package name */
    private int f39026h;

    /* renamed from: i, reason: collision with root package name */
    private int f39027i;

    /* renamed from: j, reason: collision with root package name */
    private int f39028j;

    public e(int r3, String r4, int r5, String r6) {
        this.f39020a = new StringBuilder();
        this.f39022c = "HMS";
        this.f39023e = 0;
        this.f39024f = 0;
        this.f39028j = r3;
        this.f39021b = r4;
        this.d = r5;
        if (r6 == null) goto L5;
        this.f39022c = r6;
    L5:
        c();
    }

    public static String a(int r1) {
        if (r1 != 3) goto L5;
        return "D";
    L5:
        if (r1 != 4) goto L7;
        return "I";
    L7:
        if (r1 != 5) goto L9;
        return ExifInterface.GpsLongitudeRef.WEST;
    L9:
        if (r1 != 6) goto L11;
        return ExifInterface.GpsLongitudeRef.EAST;
    L11:
        return String.valueOf(r1);
    }

    private e c() {
        this.f39023e = System.currentTimeMillis();
        Thread r02 = Thread.currentThread();
        this.f39024f = r02.getId();
        this.f39026h = Process.myPid();
        StackTraceElement[] r03 = r02.getStackTrace();
        int r1 = r03.length;
        int r2 = this.f39028j;
        if (r1 <= r2) goto L5;
        StackTraceElement r04 = r03[r2];
        this.f39025g = r04.getFileName();
        this.f39027i = r04.getLineNumber();
    L5:
        return this;
    }

    public String b() {
        StringBuilder r02 = new StringBuilder();
        b(r02);
        return r02.toString();
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        b(r02);
        a(r02);
        return r02.toString();
    }

    public <T> e a(T r2) {
        this.f39020a.append(r2);
        return this;
    }

    public e a(Throwable r2) {
        a('\n').a(Log.getStackTraceString(r2));
        return this;
    }

    private StringBuilder b(StringBuilder r5) {
        SimpleDateFormat r02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        r5.append('[');
        r5.append(r02.format(Long.valueOf(this.f39023e)));
        String r03 = a(this.d);
        r5.append(' ');
        r5.append(r03);
        r5.append('/');
        r5.append(this.f39022c);
        r5.append('/');
        r5.append(this.f39021b);
        r5.append(' ');
        r5.append(this.f39026h);
        r5.append(':');
        r5.append(this.f39024f);
        r5.append(' ');
        r5.append(this.f39025g);
        r5.append(':');
        r5.append(this.f39027i);
        r5.append(']');
        return r5;
    }

    public String a() {
        StringBuilder r02 = new StringBuilder();
        a(r02);
        return r02.toString();
    }

    private StringBuilder a(StringBuilder r2) {
        r2.append(' ');
        r2.append(this.f39020a.toString());
        return r2;
    }
}
