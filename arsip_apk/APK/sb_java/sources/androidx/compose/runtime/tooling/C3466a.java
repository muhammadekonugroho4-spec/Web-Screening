package androidx.compose.runtime.tooling;

import java.util.List;

/* renamed from: androidx.compose.runtime.tooling.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3466a {

    /* renamed from: a, reason: collision with root package name */
    public final List f16644a;

    static {
    }

    public C3466a(List r1) {
        this.f16644a = r1;
    }

    public final List a() {
        return this.f16644a;
    }

    public final boolean b() {
        List r02 = this.f16644a;
        int r1 = r02.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (((d) r02.get(r3)).e() != null) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }
}
