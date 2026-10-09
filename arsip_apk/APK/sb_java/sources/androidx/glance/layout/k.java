package androidx.glance.layout;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f25323a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25324b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25325c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25326e;

    /* renamed from: f, reason: collision with root package name */
    public final float f25327f;

    static {
    }

    public /* synthetic */ k(float r1, float r2, float r3, float r4, float r5, float r6, kotlin.jvm.internal.i r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    public final float a() {
        return this.f25327f;
    }

    public final float b() {
        return this.f25323a;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.f25325c;
    }

    public final k e(boolean r10) {
        float r1 = this.f25323a;
        if (r10 == false) goto L5;
        float r2 = this.f25326e;
    L6:
        float r12 = androidx.compose.ui.unit.i.h(r1 + r2);
        float r3 = this.f25325c;
        float r22 = this.d;
        if (r10 == false) goto L9;
        float r102 = this.f25324b;
    L10:
        float r23 = 0.0f;
        float r5 = 0.0f;
        return new k(r12, r23, r3, androidx.compose.ui.unit.i.h(r22 + r102), r5, this.f25327f, 18, null);
    L9:
        r102 = this.f25326e;
        goto L10
    L5:
        r2 = this.f25324b;
        goto L6
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (androidx.compose.ui.unit.i.j(this.f25323a, r52.f25323a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.i.j(this.f25324b, r52.f25324b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.unit.i.j(this.f25325c, r52.f25325c) == true) goto L18;
        return false;
    L18:
        if (androidx.compose.ui.unit.i.j(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (androidx.compose.ui.unit.i.j(this.f25326e, r52.f25326e) == true) goto L24;
        return false;
    L24:
        if (androidx.compose.ui.unit.i.j(this.f25327f, r52.f25327f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.unit.i.k(this.f25323a) * 31) + androidx.compose.ui.unit.i.k(this.f25324b)) * 31) + androidx.compose.ui.unit.i.k(this.f25325c)) * 31) + androidx.compose.ui.unit.i.k(this.d)) * 31) + androidx.compose.ui.unit.i.k(this.f25326e)) * 31) + androidx.compose.ui.unit.i.k(this.f25327f);
    }

    public String toString() {
        return "PaddingInDp(left=" + androidx.compose.ui.unit.i.l(this.f25323a) + ", start=" + androidx.compose.ui.unit.i.l(this.f25324b) + ", top=" + androidx.compose.ui.unit.i.l(this.f25325c) + ", right=" + androidx.compose.ui.unit.i.l(this.d) + ", end=" + androidx.compose.ui.unit.i.l(this.f25326e) + ", bottom=" + androidx.compose.ui.unit.i.l(this.f25327f) + ')';
    }

    public k(float r1, float r2, float r3, float r4, float r5, float r6) {
        this.f25323a = r1;
        this.f25324b = r2;
        this.f25325c = r3;
        this.d = r4;
        this.f25326e = r5;
        this.f25327f = r6;
    }

    public /* synthetic */ k(float r8, float r9, float r10, float r11, float r12, float r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 1) == 0) goto L5;
        float r02 = androidx.compose.ui.unit.i.h(0);
    L7:
        if ((r14 & 2) == 0) goto L9;
        float r2 = androidx.compose.ui.unit.i.h(0);
    L11:
        if ((r14 & 4) == 0) goto L13;
        float r3 = androidx.compose.ui.unit.i.h(0);
    L15:
        if ((r14 & 8) == 0) goto L17;
        float r4 = androidx.compose.ui.unit.i.h(0);
    L19:
        if ((r14 & 16) == 0) goto L21;
        float r5 = androidx.compose.ui.unit.i.h(0);
    L23:
        if ((r14 & 32) == 0) goto L25;
        float r1 = androidx.compose.ui.unit.i.h(0);
    L26:
        float r102 = r2;
        float r112 = r3;
        float r122 = r4;
        float r132 = r5;
        this(r02, r102, r112, r122, r132, r1, null);
        return;
    L25:
        r1 = r13;
        goto L26
    L21:
        r5 = r12;
        goto L23
    L17:
        r4 = r11;
        goto L19
    L13:
        r3 = r10;
        goto L15
    L9:
        r2 = r9;
        goto L11
    L5:
        r02 = r8;
        goto L7
    }
}
