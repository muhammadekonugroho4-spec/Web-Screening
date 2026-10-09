package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.g;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public int f43547a;

    /* renamed from: b, reason: collision with root package name */
    public g f43548b;

    /* renamed from: c, reason: collision with root package name */
    public g f43549c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f43550e;

    /* renamed from: f, reason: collision with root package name */
    public l f43551f;

    public h(g... r2) {
        this.f43547a = r2.length;
        ArrayList r02 = new ArrayList();
        this.f43550e = r02;
        r02.addAll(Arrays.asList(r2));
        this.f43548b = (g) this.f43550e.get(0);
        g r22 = (g) this.f43550e.get(this.f43547a - 1);
        this.f43549c = r22;
        this.d = r22.c();
    }

    public static h b(float... r6) {
        int r02 = r6.length;
        g.a[] r1 = new g.a[Math.max(r02, 2)];
        int r4 = 1;
        if (r02 != 1) goto L5;
        r1[0] = (g.a) g.h(0.0f);
        r1[1] = (g.a) g.i(1.0f, r6[0]);
    L9:
        return new e(r1);
    L5:
        r1[0] = (g.a) g.i(0.0f, r6[0]);
    L6:
        if (r4 >= r02) goto L9;
        r1[r4] = (g.a) g.i(r4 / (r02 - 1), r6[r4]);
        r4 = r4 + 1;
        goto L6
    }

    public abstract h a();

    public void c(l r1) {
        this.f43551f = r1;
    }

    public String toString() {
        String r02 = " ";
        int r1 = 0;
    L4:
        if (r1 >= this.f43547a) goto L6;
        r02 = r02 + ((g) this.f43550e.get(r1)).e() + "  ";
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }
}
