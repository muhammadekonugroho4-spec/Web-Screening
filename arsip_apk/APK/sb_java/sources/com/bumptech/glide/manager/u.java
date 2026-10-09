package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class u {
    public static volatile u d;

    /* renamed from: a, reason: collision with root package name */
    public final c f33230a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f33231b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33232c;

    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33233a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f33234b;

        public a(u r1, Context r2) {
            this.f33234b = r1;
            this.f33233a = r2;
        }

        public ConnectivityManager a() {
            return (ConnectivityManager) this.f33233a.getSystemService("connectivity");
        }

        @Override // com.bumptech.glide.util.f.b
        public /* bridge */ /* synthetic */ Object get() {
            return a();
        }
    }

    public class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f33235a;

        public b(u r1) {
            this.f33235a = r1;
        }

        @Override // com.bumptech.glide.manager.c.a
        public void a(boolean r4) {
            com.bumptech.glide.util.l.b();
            u r02 = this.f33235a;
            monitor-enter(r02);
            ArrayList r1 = new ArrayList(this.f33235a.f33231b);     // Catch: Throwable -> L11
            monitor-exit(r02);     // Catch: Throwable -> L11
            Iterator r03 = r1.iterator();
        L8:
            if (r03.hasNext() == false) goto L10;
            ((c.a) r03.next()).a(r4);
            goto L8
        L10:
            return;
        L11:
            th = move-exception;
            throw th;
        }
    }

    public interface c {
        boolean a();

        void unregister();
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f33236a;

        /* renamed from: b, reason: collision with root package name */
        public final c.a f33237b;

        /* renamed from: c, reason: collision with root package name */
        public final f.b f33238c;
        public final ConnectivityManager.NetworkCallback d;

        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f33239a;

            /* renamed from: com.bumptech.glide.manager.u$d$a$a, reason: collision with other inner class name */
            public class RunnableC0336a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f33240a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f33241b;

                public RunnableC0336a(a r1, boolean r2) {
                    this.f33241b = r1;
                    this.f33240a = r2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f33241b.a(this.f33240a);
                }
            }

            public a(d r1) {
                this.f33239a = r1;
            }

            public void a(boolean r3) {
                com.bumptech.glide.util.l.b();
                d r02 = this.f33239a;
                boolean r1 = r02.f33236a;
                r02.f33236a = r3;
                if (r1 == r3) goto L6;
                r02.f33237b.a(r3);
                return;
            }

            public final void b(boolean r2) {
                com.bumptech.glide.util.l.v(new RunnableC0336a(this, r2));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network r1) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network r1) {
                b(false);
            }
        }

        public d(f.b r2, c.a r3) {
            this.d = new a(this);
            this.f33238c = r2;
            this.f33237b = r3;
        }

        @Override // com.bumptech.glide.manager.u.c
        public boolean a() {
            if (((ConnectivityManager) this.f33238c.get()).getActiveNetwork() == null) goto L5;
            boolean r02 = true;
        L6:
            this.f33236a = r02;
            ((ConnectivityManager) this.f33238c.get()).registerDefaultNetworkCallback(this.d);     // Catch: RuntimeException -> L9
            return true;
        L9:
            e = move-exception;
            if (Log.isLoggable("ConnectivityMonitor", 5) == false) goto L13;
            Log.w("ConnectivityMonitor", "Failed to register callback", e);
        L13:
            return false;
        L5:
            r02 = false;
            goto L6
        }

        @Override // com.bumptech.glide.manager.u.c
        public void unregister() {
            ((ConnectivityManager) this.f33238c.get()).unregisterNetworkCallback(this.d);
        }
    }

    public u(Context r3) {
        this.f33231b = new HashSet();
        this.f33230a = new d(com.bumptech.glide.util.f.a(new a(this, r3)), new b(this));
    }

    public static u a(Context r2) {
        if (d != null) goto L16;
        monitor-enter(u.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (d != null) goto L11;
        d = new u(r2.getApplicationContext());     // Catch: Throwable -> L9
    L11:
        monitor-exit(u.class);     // Catch: Throwable -> L9
    L16:
        return d;
    }

    public final void b() {
        if (this.f33232c == false) goto L5;
        return;
    L5:
        if (this.f33231b.isEmpty() == true) goto L10;
        this.f33232c = this.f33230a.a();
        return;
    }

    public final void c() {
        if (this.f33232c == true) goto L5;
        return;
    L5:
        if (this.f33231b.isEmpty() == false) goto L10;
        this.f33230a.unregister();
        this.f33232c = false;
        return;
    }

    public synchronized void d(c.a r2) {
        monitor-enter(this);
        this.f33231b.add(r2);     // Catch: Throwable -> L6
        b();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void e(c.a r2) {
        monitor-enter(this);
        this.f33231b.remove(r2);     // Catch: Throwable -> L6
        c();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
