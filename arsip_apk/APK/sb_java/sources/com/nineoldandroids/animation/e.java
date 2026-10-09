package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.g;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public float f43539g;

    /* renamed from: h, reason: collision with root package name */
    public float f43540h;

    /* renamed from: i, reason: collision with root package name */
    public float f43541i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43542j;

    public e(g.a... r1) {
        super(r1);
        this.f43542j = true;
    }

    @Override // com.nineoldandroids.animation.h
    public /* bridge */ /* synthetic */ h a() {
        return d();
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return d();
    }

    public e d() {
        ArrayList r02 = this.f43550e;
        int r1 = r02.size();
        g.a[] r2 = new g.a[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L6;
        r2[r3] = (g.a) ((g) r02.get(r3)).a();
        r3 = r3 + 1;
        goto L3
    L6:
        return new e(r2);
    }

    public float e(float r6) {
        int r02 = this.f43547a;
        if (r02 != 2) goto L18;
        if (this.f43542j == false) goto L7;
        this.f43542j = false;
        this.f43539g = ((g.a) this.f43550e.get(0)).m();
        float r03 = ((g.a) this.f43550e.get(1)).m();
        this.f43540h = r03;
        this.f43541i = r03 - this.f43539g;
    L7:
        Interpolator r04 = this.d;
        if (r04 == null) goto L10;
        r6 = r04.getInterpolation(r6);
    L10:
        l r05 = this.f43551f;
        if (r05 != null) goto L16;
        float r06 = this.f43539g;
        float r1 = this.f43541i;
    L14:
        return r06 + (r6 * r1);
    L16:
        return ((Number) r05.evaluate(r6, Float.valueOf(this.f43539g), Float.valueOf(this.f43540h))).floatValue();
    L18:
        if (r6 > 0.0f) goto L29;
        g.a r07 = (g.a) this.f43550e.get(0);
        g.a r12 = (g.a) this.f43550e.get(1);
        float r2 = r07.m();
        float r3 = r12.m();
        float r08 = r07.b();
        float r4 = r12.b();
        Interpolator r13 = r12.c();
        if (r13 == null) goto L22;
        r6 = r13.getInterpolation(r6);
    L22:
        float r62 = (r6 - r08) / (r4 - r08);
        l r09 = this.f43551f;
        if (r09 != null) goto L27;
    L25:
        return r2 + (r62 * (r3 - r2));
    L27:
        return ((Number) r09.evaluate(r62, Float.valueOf(r2), Float.valueOf(r3))).floatValue();
    L29:
        if (r6 < 1.0f) goto L38;
        g.a r010 = (g.a) this.f43550e.get(r02 - 2);
        g.a r14 = (g.a) this.f43550e.get(this.f43547a - 1);
        r2 = r010.m();
        r3 = r14.m();
        float r011 = r010.b();
        float r42 = r14.b();
        Interpolator r15 = r14.c();
        if (r15 == null) goto L33;
        r6 = r15.getInterpolation(r6);
    L33:
        r62 = (r6 - r011) / (r42 - r011);
        l r012 = this.f43551f;
        if (r012 == null) goto L25;
        return ((Number) r012.evaluate(r62, Float.valueOf(r2), Float.valueOf(r3))).floatValue();
    L38:
        g.a r013 = (g.a) this.f43550e.get(0);
        int r16 = 1;
    L39:
        int r32 = this.f43547a;
        if (r16 >= r32) goto L53;
        g.a r33 = (g.a) this.f43550e.get(r16);
        if (r6 < r33.b()) goto L43;
        r16 = r16 + 1;
        r013 = r33;
        goto L39
    L43:
        Interpolator r17 = r33.c();
        if (r17 == null) goto L46;
        r6 = r17.getInterpolation(r6);
    L46:
        r6 = (r6 - r013.b()) / (r33.b() - r013.b());
        r06 = r013.m();
        float r18 = r33.m();
        l r22 = this.f43551f;
        if (r22 != null) goto L50;
        r1 = r18 - r06;
        goto L14
    L50:
        return ((Number) r22.evaluate(r6, Float.valueOf(r06), Float.valueOf(r18))).floatValue();
    L53:
        return ((Number) ((g) this.f43550e.get(r32 - 1)).e()).floatValue();
    }
}
