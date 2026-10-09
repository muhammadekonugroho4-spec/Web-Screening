package com.skydoves.balloon;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f44154a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile o f44155b;

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f44156c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final o a(Context r4) {
            kotlin.jvm.internal.p.l(r4, "context");
            o r02 = o.a();
            if (r02 != null) goto L15;
            monitor-enter(this);
            o r03 = o.a();     // Catch: Throwable -> L9
            if (r03 != null) goto L11;
            r03 = new o(null);     // Catch: Throwable -> L9
            o.b(r03);     // Catch: Throwable -> L9
            SharedPreferences r42 = r4.getSharedPreferences("com.skydoves.balloon", 0);     // Catch: Throwable -> L9
            kotlin.jvm.internal.p.k(r42, "context.getSharedPrefere…n\", Context.MODE_PRIVATE)");     // Catch: Throwable -> L9
            o.c(r42);     // Catch: Throwable -> L9
        L11:
            monitor-exit(this);
            return r03;
        L9:
            th = move-exception;
            throw th;
        L15:
            return r02;
        }

        public final String b(String r3) {
            kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return "SHOWED_UP" + r3;
        }

        public a() {
        }
    }

    static {
        f44154a = new a(null);
    }

    public /* synthetic */ o(kotlin.jvm.internal.i r1) {
        this();
    }

    public static final /* synthetic */ o a() {
        return f44155b;
    }

    public static final /* synthetic */ void b(o r02) {
        f44155b = r02;
    }

    public static final /* synthetic */ void c(SharedPreferences r02) {
        f44156c = r02;
    }

    public final int d(String r3) {
        SharedPreferences r02 = f44156c;
        if (r02 != null) goto L6;
        kotlin.jvm.internal.p.D("sharedPreferenceManager");
        r02 = null;
    L6:
        return r02.getInt(f44154a.b(r3), 0);
    }

    public final void e(String r3, int r4) {
        SharedPreferences r02 = f44156c;
        if (r02 != null) goto L5;
        kotlin.jvm.internal.p.D("sharedPreferenceManager");
        r02 = null;
    L5:
        SharedPreferences.Editor r03 = r02.edit();
        kotlin.jvm.internal.p.k(r03, "editor");
        r03.putInt(f44154a.b(r3), r4);
        r03.apply();
    }

    public final void f(String r2) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e(r2, d(r2) + 1);
    }

    public final boolean g(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (d(r2) >= r3) goto L6;
        return true;
    L6:
        return false;
    }

    public o() {
    }
}
