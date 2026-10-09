package com.journeyapps.barcodescanner.camera;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final String f41082i = "a";

    /* renamed from: j, reason: collision with root package name */
    public static final Collection f41083j = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f41084a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41085b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41086c;
    public final Camera d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f41087e;

    /* renamed from: f, reason: collision with root package name */
    public int f41088f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler.Callback f41089g;

    /* renamed from: h, reason: collision with root package name */
    public final Camera.AutoFocusCallback f41090h;

    /* renamed from: com.journeyapps.barcodescanner.camera.a$a, reason: collision with other inner class name */
    public class C0440a implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41091a;

        public C0440a(a r1) {
            this.f41091a = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message r2) {
            if (r2.what != a.a(this.f41091a)) goto L6;
            a.b(this.f41091a);
            return true;
        L6:
            return false;
        }
    }

    public class b implements Camera.AutoFocusCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f41092a;

        /* renamed from: com.journeyapps.barcodescanner.camera.a$b$a, reason: collision with other inner class name */
        public class RunnableC0441a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f41093a;

            public RunnableC0441a(b r1) {
                this.f41093a = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.c(this.f41093a.f41092a, false);
                a.d(this.f41093a.f41092a);
            }
        }

        public b(a r1) {
            this.f41092a = r1;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean r1, Camera r2) {
            a.e(this.f41092a).post(new RunnableC0441a(this));
        }
    }

    static {
        ArrayList r02 = new ArrayList(2);
        f41083j = r02;
        r02.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        r02.add("macro");
    }

    public a(Camera r4, CameraSettings r5) {
        boolean r02 = true;
        this.f41088f = 1;
        C0440a r1 = new C0440a(this);
        this.f41089g = r1;
        this.f41090h = new b(this);
        this.f41087e = new Handler(r1);
        this.d = r4;
        String r42 = r4.getParameters().getFocusMode();
        if (r5.c() == true) goto L5;
    L7:
        r02 = false;
    L8:
        this.f41086c = r02;
        Log.i(f41082i, "Current focus mode '" + r42 + "'; use auto focus? " + r02);
        i();
        return;
    L5:
        if (f41083j.contains(r42) == false) goto L7;
        goto L7
    }

    public static /* synthetic */ int a(a r02) {
        return r02.f41088f;
    }

    public static /* synthetic */ void b(a r02) {
        r02.h();
    }

    public static /* synthetic */ boolean c(a r02, boolean r1) {
        r02.f41085b = r1;
        return r1;
    }

    public static /* synthetic */ void d(a r02) {
        r02.f();
    }

    public static /* synthetic */ Handler e(a r02) {
        return r02.f41087e;
    }

    public final synchronized void f() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.f41084a == false) goto L6;
    L11:
        monitor-exit(this);
        return;
    L6:
        if (this.f41087e.hasMessages(this.f41088f) == true) goto L11;
        Handler r02 = this.f41087e;     // Catch: Throwable -> L9
        r02.sendMessageDelayed(r02.obtainMessage(this.f41088f), Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS);     // Catch: Throwable -> L9
        goto L11
    }

    public final void g() {
        this.f41087e.removeMessages(this.f41088f);
    }

    public final void h() {
        if (this.f41086c == true) goto L5;
        return;
    L5:
        if (this.f41084a == false) goto L7;
        return;
    L7:
        if (this.f41085b == true) goto L17;
        this.d.autoFocus(this.f41090h);     // Catch: RuntimeException -> L10
        this.f41085b = true;     // Catch: RuntimeException -> L10
        return;
    L10:
        e = move-exception;
        Log.w(f41082i, "Unexpected exception while focusing", e);
        f();
        return;
    }

    public void i() {
        this.f41084a = false;
        h();
    }

    public void j() {
        this.f41084a = true;
        this.f41085b = false;
        g();
        if (this.f41086c == false) goto L11;
        this.d.cancelAutoFocus();     // Catch: RuntimeException -> L6
        return;
    L6:
        e = move-exception;
        Log.w(f41082i, "Unexpected exception while cancelling focusing", e);
        return;
    }
}
