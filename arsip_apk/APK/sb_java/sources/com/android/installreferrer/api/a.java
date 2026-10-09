package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends InstallReferrerClient {

    /* renamed from: a, reason: collision with root package name */
    public int f31962a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f31963b;

    /* renamed from: c, reason: collision with root package name */
    public IGetInstallReferrerService f31964c;
    public ServiceConnection d;

    /* renamed from: com.android.installreferrer.api.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0303a {
    }

    public final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final InstallReferrerStateListener f31965a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f31966b;

        public /* synthetic */ b(a r1, InstallReferrerStateListener r2, C0303a r3) {
            this(r1, r2);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName r2, IBinder r3) {
            com.android.installreferrer.commons.a.a("InstallReferrerClient", "Install Referrer service connected.");
            a.e(this.f31966b, IGetInstallReferrerService.Stub.b(r3));
            a.f(this.f31966b, 2);
            this.f31965a.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName r2) {
            com.android.installreferrer.commons.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            a.e(this.f31966b, null);
            a.f(this.f31966b, 0);
            this.f31965a.b();
        }

        public b(a r1, InstallReferrerStateListener r2) {
            this.f31966b = r1;
            if (r2 == null) goto L7;
            this.f31965a = r2;
            return;
        L7:
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public a(Context r2) {
        this.f31962a = 0;
        this.f31963b = r2.getApplicationContext();
    }

    public static /* synthetic */ IGetInstallReferrerService e(a r02, IGetInstallReferrerService r1) {
        r02.f31964c = r1;
        return r1;
    }

    public static /* synthetic */ int f(a r02, int r1) {
        r02.f31962a = r1;
        return r1;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void a() {
        this.f31962a = 3;
        if (this.d == null) goto L5;
        com.android.installreferrer.commons.a.a("InstallReferrerClient", "Unbinding from service.");
        this.f31963b.unbindService(this.d);
        this.d = null;
    L5:
        this.f31964c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails b() {
        if (h() == false) goto L11;
        Bundle r02 = new Bundle();
        r02.putString("package_name", this.f31963b.getPackageName());
        return new ReferrerDetails(this.f31964c.c(r02));
    L7:
        e = move-exception;
        com.android.installreferrer.commons.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
        this.f31962a = 0;
        throw e;
    L11:
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void d(InstallReferrerStateListener r9) {
        if (h() == false) goto L6;
        com.android.installreferrer.commons.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
        r9.a(0);
        return;
    L6:
        int r02 = this.f31962a;
        if (r02 != 1) goto L10;
        com.android.installreferrer.commons.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
        r9.a(3);
        return;
    L10:
        if (r02 != 3) goto L13;
        com.android.installreferrer.commons.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
        r9.a(3);
        return;
    L13:
        com.android.installreferrer.commons.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent r03 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        r03.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> r3 = this.f31963b.getPackageManager().queryIntentServices(r03, 0);
        if (r3 != null) goto L16;
    L35:
        this.f31962a = 0;
        com.android.installreferrer.commons.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
        r9.a(2);
        return;
    L16:
        if (r3.isEmpty() == true) goto L35;
        ServiceInfo r32 = r3.get(0).serviceInfo;
        if (r32 == null) goto L35;
        String r7 = r32.packageName;
        String r33 = r32.name;
        if ("com.android.vending".equals(r7) == false) goto L33;
        if (r33 == null) goto L33;
        if (g() == false) goto L33;
        Intent r34 = new Intent(r03);
        b r04 = new b(this, r9, null);
        this.d = r04;
        if (this.f31963b.bindService(r34, r04, 1) == false) goto L29;
        com.android.installreferrer.commons.a.a("InstallReferrerClient", "Service was bonded successfully.");
        return;
    L29:
        com.android.installreferrer.commons.a.b("InstallReferrerClient", "Connection to service is blocked.");
        this.f31962a = 0;
        r9.a(1);
        return;
    L31:
        com.android.installreferrer.commons.a.b("InstallReferrerClient", "No permission to connect to service.");
        this.f31962a = 0;
        r9.a(4);
        return;
    L33:
        com.android.installreferrer.commons.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f31962a = 0;
        r9.a(2);
    }

    public final boolean g() {
        if (this.f31963b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode < 80837300) goto L8;
        return true;
    L8:
        return false;
    }

    public boolean h() {
        if (this.f31962a == 2) goto L5;
        return false;
    L5:
        if (this.f31964c != null) goto L7;
        return false;
    L7:
        if (this.d == null) goto L13;
        return true;
    L13:
        return false;
    }
}
