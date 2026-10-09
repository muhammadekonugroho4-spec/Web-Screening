package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.customtabs.b f3857a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f3858b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3859c;

    public class a extends f {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3860b;

        public a(Context r1) {
            this.f3860b = r1;
        }

        @Override // androidx.browser.customtabs.f
        public final void a(ComponentName r3, c r4) {
            r4.h(0);
            this.f3860b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName r1) {
        }
    }

    public class b extends a.AbstractBinderC0006a {

        /* renamed from: a, reason: collision with root package name */
        public Handler f3861a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.browser.customtabs.b f3862b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f3863c;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f3864a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f3865b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f3866c;

            public a(b r1, int r2, Bundle r3) {
                this.f3866c = r1;
                this.f3864a = r2;
                this.f3865b = r3;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3866c.f3862b.e(this.f3864a, this.f3865b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        public class RunnableC0037b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f3867a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f3868b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f3869c;

            public RunnableC0037b(b r1, String r2, Bundle r3) {
                this.f3869c = r1;
                this.f3867a = r2;
                this.f3868b = r3;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3869c.f3862b.a(this.f3867a, this.f3868b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$c, reason: collision with other inner class name */
        public class RunnableC0038c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f3870a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f3871b;

            public RunnableC0038c(b r1, Bundle r2) {
                this.f3871b = r1;
                this.f3870a = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3871b.f3862b.d(this.f3870a);
            }
        }

        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f3872a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f3873b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f3874c;

            public d(b r1, String r2, Bundle r3) {
                this.f3874c = r1;
                this.f3872a = r2;
                this.f3873b = r3;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3874c.f3862b.f(this.f3872a, this.f3873b);
            }
        }

        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f3875a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uri f3876b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f3877c;
            public final /* synthetic */ Bundle d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f3878e;

            public e(b r1, int r2, Uri r3, boolean r4, Bundle r5) {
                this.f3878e = r1;
                this.f3875a = r2;
                this.f3876b = r3;
                this.f3877c = r4;
                this.d = r5;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3878e.f3862b.g(this.f3875a, this.f3876b, this.f3877c, this.d);
            }
        }

        public class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f3879a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f3880b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f3881c;
            public final /* synthetic */ b d;

            public f(b r1, int r2, int r3, Bundle r4) {
                this.d = r1;
                this.f3879a = r2;
                this.f3880b = r3;
                this.f3881c = r4;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.d.f3862b.c(this.f3879a, this.f3880b, this.f3881c);
            }
        }

        public b(c r1, androidx.browser.customtabs.b r2) {
            this.f3863c = r1;
            this.f3862b = r2;
            this.f3861a = new Handler(Looper.getMainLooper());
        }

        @Override // android.support.customtabs.a
        public void Q(String r3, Bundle r4) {
            if (this.f3862b != null) goto L5;
            return;
        L5:
            this.f3861a.post(new d(this, r3, r4));
        }

        @Override // android.support.customtabs.a
        public void R(Bundle r3) {
            if (this.f3862b != null) goto L5;
            return;
        L5:
            this.f3861a.post(new RunnableC0038c(this, r3));
        }

        @Override // android.support.customtabs.a
        public void S(int r8, Uri r9, boolean r10, Bundle r11) {
            if (this.f3862b != null) goto L5;
            return;
        L5:
            this.f3861a.post(new e(this, r8, r9, r10, r11));
        }

        @Override // android.support.customtabs.a
        public Bundle f(String r2, Bundle r3) {
            androidx.browser.customtabs.b r02 = this.f3862b;
            if (r02 != null) goto L7;
            return null;
        L7:
            return r02.b(r2, r3);
        }

        @Override // android.support.customtabs.a
        public void n(int r3, int r4, Bundle r5) {
            if (this.f3862b != null) goto L5;
            return;
        L5:
            this.f3861a.post(new f(this, r3, r4, r5));
        }

        @Override // android.support.customtabs.a
        public void q(int r3, Bundle r4) {
            if (this.f3862b != null) goto L5;
            return;
        L5:
            this.f3861a.post(new a(this, r3, r4));
        }

        @Override // android.support.customtabs.a
        public void z(String r3, Bundle r4) {
            if (this.f3862b != null) goto L5;
            return;
        L5:
            this.f3861a.post(new RunnableC0037b(this, r3, r4));
        }
    }

    public c(android.support.customtabs.b r1, ComponentName r2, Context r3) {
        this.f3857a = r1;
        this.f3858b = r2;
        this.f3859c = r3;
    }

    public static boolean a(Context r2, String r3, f r4) {
        r4.b(r2.getApplicationContext());
        Intent r02 = new Intent("android.support.customtabs.action.CustomTabsService");
        if (TextUtils.isEmpty(r3) == true) goto L6;
        r02.setPackage(r3);
    L6:
        return r2.bindService(r02, r4, 33);
    }

    public static boolean b(Context r2, String r3) {
        if (r3 != null) goto L5;
        return false;
    L5:
        Context r22 = r2.getApplicationContext();
        return a(r22, r3, new a(r22));
    L8:
        return false;
    }

    public static String d(Context r1, List r2) {
        return e(r1, r2, false);
    }

    public static String e(Context r4, List r5, boolean r6) {
        PackageManager r42 = r4.getPackageManager();
        if (r5 != null) goto L5;
        List r02 = new ArrayList();
    L6:
        Intent r1 = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (r6 == true) goto L14;
        ResolveInfo r62 = r42.resolveActivity(r1, 0);
        if (r62 == null) goto L14;
        String r63 = r62.activityInfo.packageName;
        ArrayList r12 = new ArrayList(r02.size() + 1);
        r12.add(r63);
        if (r5 == null) goto L13;
        r12.addAll(r5);
    L13:
        r02 = r12;
    L14:
        Intent r52 = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator r64 = r02.iterator();
    L16:
        if (r64.hasNext() == false) goto L21;
        String r03 = (String) r64.next();
        r52.setPackage(r03);
        if (r42.resolveService(r52, 0) == null) goto L16;
        return r03;
    L21:
        if (Build.VERSION.SDK_INT < 30) goto L28;
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    L28:
        return null;
    L5:
        r02 = r5;
        goto L6
    }

    public final a.AbstractBinderC0006a c(androidx.browser.customtabs.b r2) {
        return new b(this, r2);
    }

    public g f(androidx.browser.customtabs.b r2) {
        return g(r2, null);
    }

    public final g g(androidx.browser.customtabs.b r4, PendingIntent r5) {
        a.AbstractBinderC0006a r42 = c(r4);
        if (r5 == null) goto L5;
        Bundle r1 = new Bundle();     // Catch: RemoteException -> L10
        r1.putParcelable("android.support.customtabs.extra.SESSION_ID", r5);     // Catch: RemoteException -> L10
        boolean r12 = this.f3857a.y(r42, r1);     // Catch: RemoteException -> L10
    L6:
        if (r12 == true) goto L9;
        return null;
    L9:
        return new g(this.f3857a, r42, this.f3858b, r5);
    L5:
        r12 = this.f3857a.p(r42);     // Catch: RemoteException -> L10
    L13:
        return null;
    }

    public boolean h(long r2) {
        return this.f3857a.m(r2);
    L4:
        return false;
    }
}
