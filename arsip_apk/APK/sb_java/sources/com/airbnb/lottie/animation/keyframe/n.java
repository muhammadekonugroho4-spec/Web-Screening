package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.Collections;

/* loaded from: classes4.dex */
public class n extends a {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f31033i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f31034j;

    /* renamed from: k, reason: collision with root package name */
    public final a f31035k;

    /* renamed from: l, reason: collision with root package name */
    public final a f31036l;

    /* renamed from: m, reason: collision with root package name */
    public com.airbnb.lottie.value.c f31037m;

    /* renamed from: n, reason: collision with root package name */
    public com.airbnb.lottie.value.c f31038n;

    public n(a r2, a r3) {
        super(Collections.EMPTY_LIST);
        this.f31033i = new PointF();
        this.f31034j = new PointF();
        this.f31035k = r2;
        this.f31036l = r3;
        m(f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public /* bridge */ /* synthetic */ Object h() {
        return p();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public /* bridge */ /* synthetic */ Object i(com.airbnb.lottie.value.a r1, float r2) {
        return q(r1, r2);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float r3) {
        this.f31035k.m(r3);
        this.f31036l.m(r3);
        this.f31033i.set(((Float) this.f31035k.h()).floatValue(), ((Float) this.f31036l.h()).floatValue());
        int r32 = 0;
    L4:
        if (r32 >= this.f31000a.size()) goto L6;
        ((a.b) this.f31000a.get(r32)).d();
        r32 = r32 + 1;
        goto L4
    }

    public PointF p() {
        return q(null, 0.0f);
    }

    public PointF q(com.airbnb.lottie.value.a r11, float r12) {
        Float r02 = null;
        if (this.f31037m == null) goto L11;
        com.airbnb.lottie.value.a r112 = this.f31035k.b();
        if (r112 == null) goto L11;
        float r9 = this.f31035k.d();
        Float r1 = r112.f31637h;
        com.airbnb.lottie.value.c r2 = this.f31037m;
        float r3 = r112.f31636g;
        if (r1 != null) goto L9;
        float r4 = r3;
    L10:
        float r6 = r12;
        Float r113 = (Float) r2.b(r3, r4, (Float) r112.f31632b, (Float) r112.f31633c, r12, r12, r9);
    L13:
        if (this.f31038n == null) goto L22;
        com.airbnb.lottie.value.a r122 = this.f31036l.b();
        if (r122 == null) goto L22;
        float r8 = this.f31036l.d();
        Float r03 = r122.f31637h;
        com.airbnb.lottie.value.c r13 = this.f31038n;
        float r22 = r122.f31636g;
        if (r03 != null) goto L19;
        float r32 = r22;
    L20:
        r02 = (Float) r13.b(r22, r32, (Float) r122.f31632b, (Float) r122.f31633c, r6, r6, r8);
        goto L22
    L19:
        r32 = r03.floatValue();
    L22:
        if (r113 != null) goto L24;
        this.f31034j.set(this.f31033i.x, 0.0f);
    L25:
        if (r02 != null) goto L27;
        PointF r114 = this.f31034j;
        r114.set(r114.x, this.f31033i.y);
    L29:
        return this.f31034j;
    L27:
        PointF r115 = this.f31034j;
        r115.set(r115.x, r02.floatValue());
        goto L29
    L24:
        this.f31034j.set(r113.floatValue(), 0.0f);
        goto L25
    L9:
        r4 = r1.floatValue();
    L11:
        r6 = r12;
        r113 = null;
        goto L13
    }

    public void r(com.airbnb.lottie.value.c r3) {
        com.airbnb.lottie.value.c r02 = this.f31037m;
        if (r02 == null) goto L5;
        r02.c(null);
    L5:
        this.f31037m = r3;
        if (r3 == null) goto L9;
        r3.c(this);
        return;
    }

    public void s(com.airbnb.lottie.value.c r3) {
        com.airbnb.lottie.value.c r02 = this.f31038n;
        if (r02 == null) goto L5;
        r02.c(null);
    L5:
        this.f31038n = r3;
        if (r3 == null) goto L9;
        r3.c(this);
        return;
    }
}
