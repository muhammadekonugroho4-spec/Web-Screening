package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f39016a;

    /* renamed from: b, reason: collision with root package name */
    private String f39017b;

    /* renamed from: c, reason: collision with root package name */
    private d f39018c;

    public b() {
        this.f39016a = 4;
        this.f39018c = new c();
    }

    private e b(int r4, String r5, String r6, Throwable r7) {
        e r02 = new e(8, this.f39017b, r4, r5);
        r02.a(r6);
        r02.a(r7);
        return r02;
    }

    public void a(Context r1, int r2, String r3) {
        this.f39016a = r2;
        this.f39017b = r3;
        this.f39018c.a(r1, "HMSCore");
    }

    private void b() {
        Log.e("HMSSDK_LogAdaptor", "log happened OOM error.");     // Catch: Throwable -> L4
        return;
    }

    public d a() {
        return this.f39018c;
    }

    public void a(d r1) {
        this.f39018c = r1;
    }

    public boolean a(int r2) {
        if (r2 < this.f39016a) goto L6;
        return true;
    L6:
        return false;
    }

    public void a(int r4, String r5, String r6, Throwable r7) {
    L6:
        b();
        return;
    L3:
        if (a(r4) == false) goto L10;
        e r02 = b(r4, r5, r6, r7);     // Catch: OutOfMemoryError -> L6
        String r03 = r02.b() + r02.a();     // Catch: OutOfMemoryError -> L6
        this.f39018c.a(r03, r4, r5, r6 + '\n' + Log.getStackTraceString(r7));     // Catch: OutOfMemoryError -> L6
        return;
    }

    public void a(int r4, String r5, String r6) {
    L6:
        b();
        return;
    L3:
        if (a(r4) == false) goto L10;
        e r02 = b(r4, r5, r6, null);     // Catch: OutOfMemoryError -> L6
        this.f39018c.a(r02.b() + r02.a(), r4, r5, r6);     // Catch: OutOfMemoryError -> L6
        return;
    }

    public void a(String r5, String r6) {
        e r02 = b(4, r5, r6, null);     // Catch: OutOfMemoryError -> L5
        this.f39018c.a(r02.b() + '\n' + r02.a(), 4, r5, r6);     // Catch: OutOfMemoryError -> L5
        return;
    L5:
        b();
    }
}
