package M0;

import b.AbstractC4230a;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f963b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.a f964c;
    public final int d;

    static {
    }

    public d(int r1, int r2, kotlin.jvm.functions.a r3, int r4) {
        this.f962a = r1;
        this.f963b = r2;
        this.f964c = r3;
        this.d = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f962a == r52.f962a) goto L12;
        return false;
    L12:
        if (this.f963b == r52.f963b) goto L15;
        return false;
    L15:
        if (p.g(this.f964c, r52.f964c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = Integer.hashCode(this.f962a) * 31;
        int r03 = AbstractC4230a.a(this.f963b, r02, 31);
        kotlin.jvm.functions.a r2 = this.f964c;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r04 = (r03 + r22) * 31;
        return AbstractC4230a.a(this.d, r04, 31);
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        return "KycPlusTextSpanDetails(spanStartPosition=" + this.f962a + ", spanEndPosition=" + this.f963b + ", clickCallback=" + this.f964c + ", spanStyle=" + this.d + ", shouldUnderLineUnderSpanArea=false)";
    }
}
