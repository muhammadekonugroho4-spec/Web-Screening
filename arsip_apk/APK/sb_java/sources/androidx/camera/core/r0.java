package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class r0 extends I {
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final S f6000e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f6001f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6002g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6003h;

    public r0(W r2, S r3) {
        this(r2, null, r3);
    }

    @Override // androidx.camera.core.I, androidx.camera.core.W
    public void Y0(Rect r4) {
        if (r4 == null) goto L7;
        Rect r02 = new Rect(r4);
        if (r02.intersect(0, 0, getWidth(), getHeight()) == true) goto L6;
        r02.setEmpty();
    L6:
        r4 = r02;
    L7:
        Object r03 = this.d;
        monitor-enter(r03);
        this.f6001f = r4;     // Catch: Throwable -> L12
        monitor-exit(r03);     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // androidx.camera.core.I, androidx.camera.core.W
    public int getHeight() {
        return this.f6003h;
    }

    @Override // androidx.camera.core.I, androidx.camera.core.W
    public int getWidth() {
        return this.f6002g;
    }

    @Override // androidx.camera.core.I, androidx.camera.core.W
    public S m0() {
        return this.f6000e;
    }

    public r0(W r1, Size r2, S r3) {
        super(r1);
        this.d = new Object();
        if (r2 != null) goto L5;
        this.f6002g = super.getWidth();
        this.f6003h = super.getHeight();
    L6:
        this.f6000e = r3;
        return;
    L5:
        this.f6002g = r2.getWidth();
        this.f6003h = r2.getHeight();
        goto L6
    }
}
