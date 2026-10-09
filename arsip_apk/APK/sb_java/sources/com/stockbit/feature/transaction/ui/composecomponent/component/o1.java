package com.stockbit.feature.transaction.ui.composecomponent.component;

/* loaded from: classes9.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f112479a;

    /* renamed from: b, reason: collision with root package name */
    public final float f112480b;

    /* renamed from: c, reason: collision with root package name */
    public final float f112481c;
    public final float d;

    static {
    }

    public /* synthetic */ o1(float r1, float r2, float r3, float r4, kotlin.jvm.internal.i r5) {
        this(r1, r2, r3, r4);
    }

    public final float a() {
        return this.f112480b;
    }

    public final float b() {
        return this.f112479a;
    }

    public final float c() {
        return this.f112481c;
    }

    public final float d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o1) == true) goto L8;
        return false;
    L8:
        o1 r52 = (o1) r5;
        if (androidx.compose.ui.unit.i.j(this.f112479a, r52.f112479a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.i.j(this.f112480b, r52.f112480b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.unit.i.j(this.f112481c, r52.f112481c) == true) goto L18;
        return false;
    L18:
        if (androidx.compose.ui.unit.i.j(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.i.k(this.f112479a) * 31) + androidx.compose.ui.unit.i.k(this.f112480b)) * 31) + androidx.compose.ui.unit.i.k(this.f112481c)) * 31) + androidx.compose.ui.unit.i.k(this.d);
    }

    public String toString() {
        return "ThicknessState(left=" + androidx.compose.ui.unit.i.l(this.f112479a) + ", bottom=" + androidx.compose.ui.unit.i.l(this.f112480b) + ", right=" + androidx.compose.ui.unit.i.l(this.f112481c) + ", top=" + androidx.compose.ui.unit.i.l(this.d) + ')';
    }

    public o1(float r1, float r2, float r3, float r4) {
        this.f112479a = r1;
        this.f112480b = r2;
        this.f112481c = r3;
        this.d = r4;
    }

    public /* synthetic */ o1(float r8, float r9, float r10, float r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L5;
        r8 = androidx.compose.ui.unit.i.h(0);
    L5:
        float r2 = r8;
        if ((r12 & 2) == 0) goto L8;
        r9 = androidx.compose.ui.unit.i.h(0);
    L8:
        float r3 = r9;
        if ((r12 & 4) == 0) goto L11;
        r10 = androidx.compose.ui.unit.i.h(0);
    L11:
        float r4 = r10;
        if ((r12 & 8) == 0) goto L14;
        r11 = androidx.compose.ui.unit.i.h(0);
    L14:
        this(r2, r3, r4, r11, null);
    }
}
