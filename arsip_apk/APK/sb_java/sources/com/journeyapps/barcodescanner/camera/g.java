package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.m;
import java.util.List;

/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public m f41137a;

    /* renamed from: b, reason: collision with root package name */
    public int f41138b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41139c;
    public k d;

    static {
    }

    public g(int r2, m r3) {
        this.f41139c = false;
        this.d = new h();
        this.f41138b = r2;
        this.f41137a = r3;
    }

    public m a(List r2, boolean r3) {
        m r32 = b(r3);
        return this.d.b(r2, r32);
    }

    public m b(boolean r2) {
        m r02 = this.f41137a;
        if (r02 != null) goto L6;
        return null;
    L6:
        if (r2 == true) goto L8;
        return r02;
    L8:
        return r02.b();
    }

    public int c() {
        return this.f41138b;
    }

    public Rect d(m r3) {
        return this.d.d(r3, this.f41137a);
    }

    public void e(k r1) {
        this.d = r1;
    }
}
