package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15988a;

    static {
    }

    public Q0(String r1) {
        this.f15988a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof Q0) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f15988a, ((Q0) r4).f15988a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f15988a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f15988a + ')';
    }
}
