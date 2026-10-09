package androidx.compose.runtime.internal;

import kotlin.text.AbstractC11848a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f16329a;

    static {
    }

    public n(int r1) {
        this.f16329a = r1;
    }

    public final int a() {
        return this.f16329a;
    }

    public final void b(int r1) {
        this.f16329a = r1;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("IntRef(element = ");
        r02.append(this.f16329a);
        r02.append(")@");
        String r1 = Integer.toString(hashCode(), AbstractC11848a.a(16));
        kotlin.jvm.internal.p.k(r1, "toString(...)");
        r02.append(r1);
        return r02.toString();
    }

    public /* synthetic */ n(int r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
