package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17780a;

    static {
    }

    public e() {
        this.f17780a = new ArrayList(32);
    }

    public final e a() {
        this.f17780a.add(f.b.f17789c);
        return this;
    }

    public final e b(float r9, float r10, float r11, float r12, float r13, float r14) {
        this.f17780a.add(new f.c(r9, r10, r11, r12, r13, r14));
        return this;
    }

    public final List c() {
        return this.f17780a;
    }

    public final e d(float r3) {
        this.f17780a.add(new f.l(r3));
        return this;
    }

    public final e e(float r3, float r4) {
        this.f17780a.add(new f.e(r3, r4));
        return this;
    }

    public final e f(float r3, float r4) {
        this.f17780a.add(new f.m(r3, r4));
        return this;
    }

    public final e g(float r3, float r4) {
        this.f17780a.add(new f.C0124f(r3, r4));
        return this;
    }

    public final e h(float r3, float r4, float r5, float r6) {
        this.f17780a.add(new f.h(r3, r4, r5, r6));
        return this;
    }

    public final e i(float r3, float r4, float r5, float r6) {
        this.f17780a.add(new f.p(r3, r4, r5, r6));
        return this;
    }

    public final e j(float r3) {
        this.f17780a.add(new f.r(r3));
        return this;
    }
}
