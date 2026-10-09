package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final M f19662a;

    /* renamed from: b, reason: collision with root package name */
    public final L f19663b;

    static {
    }

    public N(M r1, L r2) {
        this.f19662a = r1;
        this.f19663b = r2;
    }

    public final L a() {
        return this.f19663b;
    }

    public final M b() {
        return this.f19662a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof N) == true) goto L8;
        return false;
    L8:
        N r52 = (N) r5;
        if (kotlin.jvm.internal.p.g(this.f19663b, r52.f19663b) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f19662a, r52.f19662a) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        M r02 = this.f19662a;
        int r1 = 0;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L6:
        int r04 = r03 * 31;
        L r2 = this.f19663b;
        if (r2 == null) goto L10;
        r1 = r2.hashCode();
    L10:
        return r04 + r1;
    L5:
        r03 = 0;
        goto L6
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f19662a + ", paragraphSyle=" + this.f19663b + ')';
    }

    public N(boolean r2) {
        this(null, new L(r2));
    }
}
