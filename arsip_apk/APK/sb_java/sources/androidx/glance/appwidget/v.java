package androidx.glance.appwidget;

import java.util.Map;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f25134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25135b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f25136c;

    static {
    }

    public v(int r1, int r2, Map r3) {
        this.f25134a = r1;
        this.f25135b = r2;
        this.f25136c = r3;
    }

    public static /* synthetic */ v b(v r02, int r1, int r2, Map r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f25134a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f25135b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f25136c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final v a(int r2, int r3, Map r4) {
        return new v(r2, r3, r4);
    }

    public final Map c() {
        return this.f25136c;
    }

    public final int d() {
        return this.f25135b;
    }

    public final int e() {
        return this.f25134a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (this.f25134a == r52.f25134a) goto L12;
        return false;
    L12:
        if (this.f25135b == r52.f25135b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f25136c, r52.f25136c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f25134a) * 31) + Integer.hashCode(this.f25135b)) * 31) + this.f25136c.hashCode();
    }

    public String toString() {
        return "InsertedViewInfo(mainViewId=" + this.f25134a + ", complexViewId=" + this.f25135b + ", children=" + this.f25136c + ')';
    }

    public /* synthetic */ v(int r2, int r3, Map r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = -1;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = -1;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = kotlin.collections.S.j();
    L11:
        this(r2, r3, r4);
    }
}
