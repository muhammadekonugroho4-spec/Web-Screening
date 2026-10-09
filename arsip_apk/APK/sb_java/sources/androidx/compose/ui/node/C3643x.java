package androidx.compose.ui.node;

import androidx.compose.ui.graphics.M0;
import androidx.compose.ui.graphics.z1;

/* renamed from: androidx.compose.ui.node.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3643x {

    /* renamed from: a, reason: collision with root package name */
    public float f18832a;

    /* renamed from: b, reason: collision with root package name */
    public float f18833b;

    /* renamed from: c, reason: collision with root package name */
    public float f18834c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f18835e;

    /* renamed from: f, reason: collision with root package name */
    public float f18836f;

    /* renamed from: g, reason: collision with root package name */
    public float f18837g;

    /* renamed from: h, reason: collision with root package name */
    public float f18838h;

    /* renamed from: i, reason: collision with root package name */
    public long f18839i;

    public C3643x() {
        this.f18832a = 1.0f;
        this.f18833b = 1.0f;
        this.f18838h = 8.0f;
        this.f18839i = z1.f17867b.a();
    }

    public final void a(M0 r3) {
        this.f18832a = r3.I();
        this.f18833b = r3.P();
        this.f18834c = r3.z();
        this.d = r3.y();
        this.f18835e = r3.M();
        this.f18836f = r3.B();
        this.f18837g = r3.C();
        this.f18838h = r3.l();
        this.f18839i = r3.A1();
    }

    public final void b(C3643x r3) {
        this.f18832a = r3.f18832a;
        this.f18833b = r3.f18833b;
        this.f18834c = r3.f18834c;
        this.d = r3.d;
        this.f18835e = r3.f18835e;
        this.f18836f = r3.f18836f;
        this.f18837g = r3.f18837g;
        this.f18838h = r3.f18838h;
        this.f18839i = r3.f18839i;
    }

    public final boolean c(C3643x r5) {
        if (this.f18832a == r5.f18832a) goto L5;
        return false;
    L5:
        if (this.f18833b == r5.f18833b) goto L7;
        return false;
    L7:
        if (this.f18834c == r5.f18834c) goto L9;
        return false;
    L9:
        if (this.d == r5.d) goto L11;
        return false;
    L11:
        if (this.f18835e == r5.f18835e) goto L13;
        return false;
    L13:
        if (this.f18836f == r5.f18836f) goto L15;
        return false;
    L15:
        if (this.f18837g == r5.f18837g) goto L17;
        return false;
    L17:
        if (this.f18838h == r5.f18838h) goto L19;
        return false;
    L19:
        if (z1.e(this.f18839i, r5.f18839i) == false) goto L31;
        return true;
    L31:
        return false;
    }
}
