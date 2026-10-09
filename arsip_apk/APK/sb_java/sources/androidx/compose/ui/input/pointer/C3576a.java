package androidx.compose.ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3576a implements InterfaceC3594t {

    /* renamed from: b, reason: collision with root package name */
    public final int f18119b;

    static {
    }

    public C3576a(int r1) {
        this.f18119b = r1;
    }

    public final int a() {
        return this.f18119b;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if (r4 == null) goto L7;
        Class<?> r1 = r4.getClass();
    L9:
        if (kotlin.jvm.internal.p.g(C3576a.class, r1) == true) goto L11;
        return false;
    L11:
        kotlin.jvm.internal.p.j(r4, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.f18119b == ((C3576a) r4).f18119b) goto L14;
        return false;
    L14:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public int hashCode() {
        return this.f18119b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f18119b + ')';
    }
}
