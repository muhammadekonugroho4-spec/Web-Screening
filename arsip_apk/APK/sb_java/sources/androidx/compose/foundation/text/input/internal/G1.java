package androidx.compose.foundation.text.input.internal;

/* loaded from: classes.dex */
public final class G1 implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final G1 f10091a = null;

    static {
        f10091a = new G1();
    }

    public G1() {
    }

    @Override // androidx.compose.foundation.text.input.internal.r
    public int a(int r1, int r2) {
        if (r2 != 10) goto L7;
        return 32;
    L7:
        if (r2 != 13) goto L10;
        return 65279;
    L10:
        return r2;
    }

    public String toString() {
        return "SingleLineCodepointTransformation";
    }
}
