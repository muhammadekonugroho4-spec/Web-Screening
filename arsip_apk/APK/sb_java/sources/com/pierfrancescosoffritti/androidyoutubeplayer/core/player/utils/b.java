package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f43679a;

    /* renamed from: b, reason: collision with root package name */
    public final List f43680b;

    /* renamed from: c, reason: collision with root package name */
    public com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.a f43681c;
    public ConnectivityManager.NetworkCallback d;

    public interface a {
        void a();

        void b();
    }

    /* renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b$b, reason: collision with other inner class name */
    public static final class C0500b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f43682a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f43683b;

        public C0500b(b r2) {
            this.f43683b = r2;
            this.f43682a = new Handler(Looper.getMainLooper());
        }

        public static /* synthetic */ void a(b r02) {
            d(r02);
        }

        public static /* synthetic */ void b(b r02) {
            c(r02);
        }

        public static final void c(b r1) {
            Iterator r12 = r1.c().iterator();
        L4:
            if (r12.hasNext() == false) goto L6;
            ((a) r12.next()).b();
            goto L4
        }

        public static final void d(b r1) {
            Iterator r12 = r1.c().iterator();
        L4:
            if (r12.hasNext() == false) goto L6;
            ((a) r12.next()).a();
            goto L4
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network r3) {
            p.l(r3, "network");
            Handler r32 = this.f43682a;
            final b r02 = this.f43683b;
            r32.post(new c(r02));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network r3) {
            p.l(r3, "network");
            Handler r32 = this.f43682a;
            final b r02 = this.f43683b;
            r32.post(new d(r02));
        }
    }

    public b(Context r2) {
        p.l(r2, "context");
        this.f43679a = r2;
        this.f43680b = new ArrayList();
    }

    public final void a() {
        ConnectivityManager.NetworkCallback r02 = this.d;
        if (r02 != null) goto L5;
        return;
    L5:
        Object r1 = this.f43679a.getSystemService("connectivity");
        p.j(r1, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) r1).unregisterNetworkCallback(r02);
        this.f43680b.clear();
        this.d = null;
        this.f43681c = null;
    }

    public final void b(Context r3) {
        C0500b r02 = new C0500b(this);
        this.d = r02;
        Object r32 = r3.getSystemService("connectivity");
        p.j(r32, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) r32).registerDefaultNetworkCallback(r02);
    }

    public final List c() {
        return this.f43680b;
    }

    public final void d() {
        b(this.f43679a);
    }
}
