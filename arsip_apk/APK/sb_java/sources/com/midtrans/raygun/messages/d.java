package com.midtrans.raygun.messages;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.view.Display;
import android.view.WindowManager;
import io.sentry.SentryOptions;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f42114a;

    /* renamed from: b, reason: collision with root package name */
    public int f42115b;

    /* renamed from: c, reason: collision with root package name */
    public String f42116c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public int f42117e;

    /* renamed from: f, reason: collision with root package name */
    public int f42118f;

    /* renamed from: g, reason: collision with root package name */
    public String f42119g;

    /* renamed from: h, reason: collision with root package name */
    public String f42120h;

    /* renamed from: i, reason: collision with root package name */
    public long f42121i;

    /* renamed from: j, reason: collision with root package name */
    public long f42122j;

    /* renamed from: k, reason: collision with root package name */
    public long f42123k;

    /* renamed from: l, reason: collision with root package name */
    public double f42124l;

    /* renamed from: m, reason: collision with root package name */
    public String f42125m;

    /* renamed from: n, reason: collision with root package name */
    public String f42126n;

    /* renamed from: o, reason: collision with root package name */
    public String f42127o;

    /* renamed from: p, reason: collision with root package name */
    public String f42128p;

    public d(Context r7) {
        this.f42114a = Build.CPU_ABI;     // Catch: Exception -> L6
        this.f42116c = Build.VERSION.RELEASE;     // Catch: Exception -> L6
        this.d = Build.VERSION.SDK;     // Catch: Exception -> L6
        this.f42125m = Build.MODEL;     // Catch: Exception -> L6
        this.f42128p = Build.DEVICE;     // Catch: Exception -> L6
        this.f42126n = Build.BRAND;     // Catch: Exception -> L6
        this.f42127o = Build.BOARD;     // Catch: Exception -> L6
        this.f42115b = Runtime.getRuntime().availableProcessors();     // Catch: Exception -> L6
        int r02 = r7.getResources().getConfiguration().orientation;     // Catch: Exception -> L6
        if (r02 != 1) goto L9;
        this.f42119g = "Portrait";     // Catch: Exception -> L6
    L15:
        Display r03 = ((WindowManager) r7.getSystemService("window")).getDefaultDisplay();     // Catch: Exception -> L6
        this.f42117e = r03.getWidth();     // Catch: Exception -> L6
        this.f42118f = r03.getHeight();     // Catch: Exception -> L6
        TimeZone r04 = TimeZone.getDefault();     // Catch: Exception -> L6
        Date r2 = new Date();     // Catch: Exception -> L6
        this.f42124l = TimeUnit.SECONDS.convert(r04.getOffset(r2.getTime()), TimeUnit.MILLISECONDS) / 3600;     // Catch: Exception -> L6
        this.f42120h = r7.getResources().getConfiguration().locale.toString();     // Catch: Exception -> L6
        ActivityManager.MemoryInfo r05 = new ActivityManager.MemoryInfo();     // Catch: Exception -> L6
        ((ActivityManager) r7.getSystemService("activity")).getMemoryInfo(r05);     // Catch: Exception -> L6
        this.f42122j = r05.availMem / SentryOptions.MAX_EVENT_SIZE_BYTES;     // Catch: Exception -> L6
        Matcher r72 = Pattern.compile("^\\D*(\\d*).*$").matcher(a());     // Catch: Exception -> L6
        r72.find();     // Catch: Exception -> L6
        this.f42121i = Long.parseLong(r72.group(1)) / 1024;     // Catch: Exception -> L6
        StatFs r73 = new StatFs(Environment.getDataDirectory().getPath());     // Catch: Exception -> L6
        this.f42123k = (r73.getAvailableBlocks() * r73.getBlockSize()) / SentryOptions.MAX_EVENT_SIZE_BYTES;     // Catch: Exception -> L6
        return;
    L9:
        if (r02 != 2) goto L12;
        this.f42119g = "Landscape";     // Catch: Exception -> L6
        goto L15
    L12:
        if (r02 != 3) goto L14;
        this.f42119g = "Square";     // Catch: Exception -> L6
        goto L15
    L14:
        this.f42119g = "Undefined";     // Catch: Exception -> L6
    L6:
        e = move-exception;
        com.midtrans.raygun.d.d("Couldn't get all env data: " + e);
    }

    public final String a() {
        RandomAccessFile r1 = new RandomAccessFile("/proc/meminfo", "r");     // Catch: Throwable -> L9
        String r02 = r1.readLine();     // Catch: Throwable -> L7
        r1.close();
        return r02;
    L7:
        Throwable th = th;
    L11:
        r1.close();
        throw th;
    L9:
        th = move-exception;
        r1 = null;
        th = th;
        goto L11
    }
}
