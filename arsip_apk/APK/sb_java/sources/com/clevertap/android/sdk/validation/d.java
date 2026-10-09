package com.clevertap.android.sdk.validation;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f34971b = null;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f34972a;

    static {
        f34971b = new Object();
    }

    public d() {
        this.f34972a = new ArrayList();
    }

    public b a() {
        Object r02 = f34971b;
        monitor-enter(r02);
        b r1 = null;
    L9:
        th = move-exception;
        throw th;
    L6:
        if (this.f34972a.isEmpty() == true) goto L11;
        r1 = (b) this.f34972a.remove(0);     // Catch: Throwable -> L9 Exception -> L15
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return r1;
    }

    public void b(b r6) {
        Object r02 = f34971b;
        monitor-enter(r02);
        int r1 = this.f34972a.size();     // Catch: Throwable -> L9 Exception -> L17
        if (r1 <= 50) goto L12;
        ArrayList r2 = new ArrayList();     // Catch: Throwable -> L9 Exception -> L17
        int r3 = 10;
    L7:
        if (r3 >= r1) goto L11;
        r2.add((b) this.f34972a.get(r3));     // Catch: Throwable -> L9 Exception -> L17
        r3 = r3 + 1;     // Catch: Throwable -> L9 Exception -> L17
        goto L7
    L11:
        r2.add(r6);     // Catch: Throwable -> L9 Exception -> L17
        this.f34972a = r2;     // Catch: Throwable -> L9 Exception -> L17
        goto L13
    L12:
        this.f34972a.add(r6);     // Catch: Throwable -> L9 Exception -> L17
    L9:
        th = move-exception;
        throw th;
    L13:
        monitor-exit(r02);     // Catch: Throwable -> L9
    }
}
