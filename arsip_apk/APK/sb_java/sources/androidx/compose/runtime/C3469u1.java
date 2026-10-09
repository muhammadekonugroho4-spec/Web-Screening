package androidx.compose.runtime;

/* renamed from: androidx.compose.runtime.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3469u1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3469u1 f16679a = null;

    static {
        f16679a = new C3469u1();
    }

    public C3469u1() {
    }

    @Override // androidx.compose.runtime.a2
    public boolean a(Object r1, Object r2) {
        if (r1 != r2) goto L5;
        return true;
    L5:
        return false;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
