package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class K1 extends I1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f19656a;

    static {
    }

    public K1(String r2) {
        super(null);
        this.f19656a = r2;
    }

    public final String a() {
        return this.f19656a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof K1) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f19656a, ((K1) r4).f19656a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f19656a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f19656a + ')';
    }
}
