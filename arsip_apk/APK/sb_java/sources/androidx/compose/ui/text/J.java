package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final long f19645a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19646b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19647c;

    static {
    }

    public /* synthetic */ J(long r1, long r3, int r5, kotlin.jvm.internal.i r6) {
        this(r1, r3, r5);
    }

    public final long a() {
        return this.f19646b;
    }

    public final int b() {
        return this.f19647c;
    }

    public final long c() {
        return this.f19645a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof J) == true) goto L8;
        return false;
    L8:
        J r82 = (J) r8;
        if (androidx.compose.ui.unit.v.e(this.f19645a, r82.f19645a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.v.e(this.f19646b, r82.f19646b) == true) goto L15;
        return false;
    L15:
        if (K.i(this.f19647c, r82.f19647c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((androidx.compose.ui.unit.v.i(this.f19645a) * 31) + androidx.compose.ui.unit.v.i(this.f19646b)) * 31) + K.j(this.f19647c);
    }

    public String toString() {
        return "Placeholder(width=" + androidx.compose.ui.unit.v.l(this.f19645a) + ", height=" + androidx.compose.ui.unit.v.l(this.f19646b) + ", placeholderVerticalAlign=" + K.k(this.f19647c) + ')';
    }

    public J(long r3, long r5, int r7) {
        this.f19645a = r3;
        this.f19646b = r5;
        this.f19647c = r7;
        boolean r4 = false;
        if (androidx.compose.ui.unit.v.f(r3) != 0) goto L5;
        boolean r32 = true;
    L6:
        if (r32 == false) goto L9;
        androidx.compose.ui.text.internal.a.a("width cannot be TextUnit.Unspecified");
    L9:
        if (androidx.compose.ui.unit.v.f(r5) != 0) goto L11;
        r4 = true;
    L11:
        if (r4 == false) goto L14;
        androidx.compose.ui.text.internal.a.a("height cannot be TextUnit.Unspecified");
        return;
    L14:
        return;
    L5:
        r32 = false;
        goto L6
    }
}
