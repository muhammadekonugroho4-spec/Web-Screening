package com.stockbit.common.utils;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.stockbit.common.utils.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5860j {

    /* renamed from: a, reason: collision with root package name */
    public androidx.browser.customtabs.g f62324a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.browser.customtabs.f f62325b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62326c;

    /* renamed from: com.stockbit.common.utils.j$a */
    public interface a {
        void a();

        void b(String r1);
    }

    /* renamed from: com.stockbit.common.utils.j$b */
    public static final class b extends androidx.browser.customtabs.f {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C5860j f62327b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.browser.customtabs.b f62328c;
        public final /* synthetic */ String d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f62329e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f62330f;

        public b(C5860j r1, androidx.browser.customtabs.b r2, String r3, Context r4, a r5) {
            this.f62327b = r1;
            this.f62328c = r2;
            this.d = r3;
            this.f62329e = r4;
            this.f62330f = r5;
        }

        @Override // androidx.browser.customtabs.f
        public void a(ComponentName r3, androidx.browser.customtabs.c r4) {
            kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            kotlin.jvm.internal.p.l(r4, "client");
            C5860j.c(this.f62327b, r4.f(this.f62328c));
            r4.h(0);
            Uri r32 = Uri.parse(this.d);
            androidx.browser.customtabs.d r42 = new d.b(C5860j.a(this.f62327b)).b();
            kotlin.jvm.internal.p.k(r42, "build(...)");
            r42.a(this.f62329e, r32);     // Catch: Exception -> L5
            return;
        L5:
            this.f62330f.b(this.d);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName r2) {
            kotlin.jvm.internal.p.l(r2, "componentName");
        }
    }

    /* renamed from: com.stockbit.common.utils.j$c */
    public static final class c extends androidx.browser.customtabs.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C5860j f62331a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f62332b;

        public c(C5860j r1, a r2) {
            this.f62331a = r1;
            this.f62332b = r2;
        }

        @Override // androidx.browser.customtabs.b
        public void e(int r1, Bundle r2) {
            super.e(r1, r2);
            if (r1 == 2) goto L9;
            if (r1 == 5) goto L9;
            return;
        L9:
            if (C5860j.b(this.f62331a) == false) goto L12;
            this.f62332b.a();
            C5860j.d(this.f62331a, false);
            return;
        }
    }

    static {
    }

    public C5860j() {
        this.f62326c = true;
    }

    public static final /* synthetic */ androidx.browser.customtabs.g a(C5860j r02) {
        return r02.f62324a;
    }

    public static final /* synthetic */ boolean b(C5860j r02) {
        return r02.f62326c;
    }

    public static final /* synthetic */ void c(C5860j r02, androidx.browser.customtabs.g r1) {
        r02.f62324a = r1;
    }

    public static final /* synthetic */ void d(C5860j r02, boolean r1) {
        r02.f62326c = r1;
    }

    public final void e(Context r8, String r9, a r10) {
        kotlin.jvm.internal.p.l(r8, "context");
        kotlin.jvm.internal.p.l(r9, "url");
        kotlin.jvm.internal.p.l(r10, "loadCallback");
        this.f62325b = new b(this, new c(this, r10), r9, r8, r10);
        androidx.browser.customtabs.f r82 = null;
        String r92 = androidx.browser.customtabs.c.d(r8, null);
        if (r92 != null) goto L6;
        r10.b(r9);
        return;
    L6:
        androidx.browser.customtabs.f r102 = this.f62325b;
        if (r102 != null) goto L9;
        kotlin.jvm.internal.p.D("mConnection");
    L10:
        androidx.browser.customtabs.c.a(r8, r92, r82);
        return;
    L9:
        r82 = r102;
        goto L10
    }
}
