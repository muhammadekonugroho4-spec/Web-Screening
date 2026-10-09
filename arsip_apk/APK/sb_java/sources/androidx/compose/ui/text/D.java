package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final E f19625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19627c;

    static {
    }

    public D(E r1, int r2, int r3) {
        this.f19625a = r1;
        this.f19626b = r2;
        this.f19627c = r3;
    }

    public final int a() {
        return this.f19627c;
    }

    public final E b() {
        return this.f19625a;
    }

    public final int c() {
        return this.f19626b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof D) == true) goto L8;
        return false;
    L8:
        D r52 = (D) r5;
        if (kotlin.jvm.internal.p.g(this.f19625a, r52.f19625a) == true) goto L12;
        return false;
    L12:
        if (this.f19626b == r52.f19626b) goto L15;
        return false;
    L15:
        if (this.f19627c == r52.f19627c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f19625a.hashCode() * 31) + Integer.hashCode(this.f19626b)) * 31) + Integer.hashCode(this.f19627c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f19625a + ", startIndex=" + this.f19626b + ", endIndex=" + this.f19627c + ')';
    }
}
