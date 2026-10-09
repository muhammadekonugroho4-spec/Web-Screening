package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator f32043e = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f32044a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32045b;

    /* renamed from: c, reason: collision with root package name */
    public int f32046c;
    public final int d;

    public class a implements Comparator {
        public a() {
        }

        public int a(byte[] r1, byte[] r2) {
            return r1.length - r2.length;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((byte[]) r1, (byte[]) r2);
        }
    }

    static {
        f32043e = new a();
    }

    public c(int r3) {
        this.f32044a = new ArrayList();
        this.f32045b = new ArrayList(64);
        this.f32046c = 0;
        this.d = r3;
    }

    public synchronized byte[] a(int r4) {
        monitor-enter(this);
        int r02 = 0;
    L19:
    L11:
        th = move-exception;
        throw th;
    L5:
        if (r02 >= this.f32045b.size()) goto L14;
        byte[] r1 = (byte[]) this.f32045b.get(r02);     // Catch: Throwable -> L11
        if (r1.length >= r4) goto L8;
        r02 = r02 + 1;
        goto L19
    L8:
        this.f32046c -= r1.length;
        this.f32045b.remove(r02);     // Catch: Throwable -> L11
        this.f32044a.remove(r1);     // Catch: Throwable -> L11
        monitor-exit(this);
        return r1;
    L14:
        byte[] r42 = new byte[r4];     // Catch: Throwable -> L11
        monitor-exit(this);
        return r42;
    }

    public synchronized void b(byte[] r3) {
        monitor-enter(this);
        if (r3 != null) goto L18;
    L16:
        monitor-exit(this);
        return;
    L18:
    L13:
        th = move-exception;
        throw th;
    L5:
        if (r3.length > this.d) goto L16;
        this.f32044a.add(r3);     // Catch: Throwable -> L13
        int r02 = Collections.binarySearch(this.f32045b, r3, f32043e);     // Catch: Throwable -> L13
        if (r02 >= 0) goto L10;
        r02 = (-r02) - 1;
    L10:
        this.f32045b.add(r02, r3);     // Catch: Throwable -> L13
        this.f32046c += r3.length;
        c();     // Catch: Throwable -> L13
        monitor-exit(this);
    }

    public final synchronized void c() {
        monitor-enter(this);
    L13:
        if (this.f32046c <= this.d) goto L9;
        byte[] r02 = (byte[]) this.f32044a.remove(0);     // Catch: Throwable -> L7
        this.f32045b.remove(r02);     // Catch: Throwable -> L7
        this.f32046c -= r02.length;
        goto L13
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
