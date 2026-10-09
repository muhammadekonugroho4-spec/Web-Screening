package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.b;
import androidx.browser.trusted.e;
import androidx.core.app.q;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public NotificationManager f3903a;

    /* renamed from: b, reason: collision with root package name */
    public int f3904b;

    /* renamed from: c, reason: collision with root package name */
    public final b.a f3905c;

    public class a extends b.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TrustedWebActivityService f3906a;

        public a(TrustedWebActivityService r1) {
            this.f3906a = r1;
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle D() {
            V();
            return new e.a(this.f3906a.g()).a();
        }

        @Override // android.support.customtabs.trusted.b
        public int L() {
            V();
            return this.f3906a.i();
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle M(Bundle r2) {
            V();
            e.c r22 = e.c.a(r2);
            return new e.C0039e(this.f3906a.d(r22.f3911a)).a();
        }

        @Override // android.support.customtabs.trusted.b
        public void O(Bundle r3) {
            V();
            e.b r32 = e.b.a(r3);
            this.f3906a.e(r32.f3909a, r32.f3910b);
        }

        public final void V() {
            TrustedWebActivityService r02 = this.f3906a;
            int r1 = r02.f3904b;
            if (r1 != (-1)) goto L5;
            r02.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            this.f3906a.c();
            throw null;
        L5:
            if (r1 != Binder.getCallingUid()) goto L8;
            return;
        L8:
            throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle i(Bundle r5) {
            V();
            e.d r52 = e.d.a(r5);
            return new e.C0039e(this.f3906a.j(r52.f3912a, r52.f3913b, r52.f3914c, r52.d)).a();
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle u(String r2, Bundle r3, IBinder r4) {
            V();
            return this.f3906a.f(r2, r3, d.a(r4));
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle v() {
            V();
            return this.f3906a.h();
        }
    }

    public TrustedWebActivityService() {
        this.f3904b = -1;
        this.f3905c = new a(this);
    }

    public static String a(String r3) {
        return r3.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void b() {
        if (this.f3903a == null) goto L6;
        return;
    L6:
        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public abstract c c();

    public boolean d(String r2) {
        b();
        if (q.e(this).a() == true) goto L7;
        return false;
    L7:
        return b.b(this.f3903a, a(r2));
    }

    public void e(String r2, int r3) {
        b();
        this.f3903a.cancel(r2, r3);
    }

    public Bundle f(String r1, Bundle r2, d r3) {
        return null;
    }

    public Parcelable[] g() {
        b();
        return androidx.browser.trusted.a.a(this.f3903a);
    }

    public Bundle h() {
        int r02 = i();
        Bundle r1 = new Bundle();
        if (r02 != (-1)) goto L5;
        return r1;
    L5:
        r1.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), r02));
        return r1;
    }

    public int i() {
        Bundle r1 = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;     // Catch: PackageManager.NameNotFoundException -> L8
        if (r1 != null) goto L6;
        return -1;
    L6:
        return r1.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
    L11:
        return -1;
    }

    public boolean j(String r4, int r5, Notification r6, String r7) {
        b();
        if (q.e(this).a() == true) goto L5;
        return false;
    L5:
        String r02 = a(r7);
        Notification r62 = b.a(this, this.f3903a, r6, r02, r7);
        if (b.b(this.f3903a, r02) == true) goto L8;
        return false;
    L8:
        this.f3903a.notify(r4, r5, r62);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent r1) {
        return this.f3905c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f3903a = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent r2) {
        this.f3904b = -1;
        return super.onUnbind(r2);
    }
}
