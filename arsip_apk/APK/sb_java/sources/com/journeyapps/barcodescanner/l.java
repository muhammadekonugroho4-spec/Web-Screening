package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes6.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f41183a;

    /* renamed from: b, reason: collision with root package name */
    public WindowManager f41184b;

    /* renamed from: c, reason: collision with root package name */
    public OrientationEventListener f41185c;
    public k d;

    public class a extends OrientationEventListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f41186a;

        public a(l r1, Context r2, int r3) {
            this.f41186a = r1;
            super(r2, r3);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int r3) {
            WindowManager r32 = l.a(this.f41186a);
            k r02 = l.b(this.f41186a);
            if (l.a(this.f41186a) == null) goto L9;
            if (r02 == null) goto L10;
            int r33 = r32.getDefaultDisplay().getRotation();
            if (r33 == l.c(this.f41186a)) goto L11;
            l.d(this.f41186a, r33);
            r02.a(r33);
            return;
        L11:
            return;
        L10:
            return;
        }
    }

    public l() {
    }

    public static /* synthetic */ WindowManager a(l r02) {
        return r02.f41184b;
    }

    public static /* synthetic */ k b(l r02) {
        return r02.d;
    }

    public static /* synthetic */ int c(l r02) {
        return r02.f41183a;
    }

    public static /* synthetic */ int d(l r02, int r1) {
        r02.f41183a = r1;
        return r1;
    }

    public void e(Context r2, k r3) {
        f();
        Context r22 = r2.getApplicationContext();
        this.d = r3;
        this.f41184b = (WindowManager) r22.getSystemService("window");
        a r32 = new a(this, r22, 3);
        this.f41185c = r32;
        r32.enable();
        this.f41183a = this.f41184b.getDefaultDisplay().getRotation();
    }

    public void f() {
        OrientationEventListener r02 = this.f41185c;
        if (r02 == null) goto L5;
        r02.disable();
    L5:
        this.f41185c = null;
        this.f41184b = null;
        this.d = null;
    }
}
