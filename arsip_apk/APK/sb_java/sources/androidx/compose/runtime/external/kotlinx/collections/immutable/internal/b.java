package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f16257a;

    static {
    }

    public b(int r1) {
        this.f16257a = r1;
    }

    public final int a() {
        return this.f16257a;
    }

    public final void b(int r2) {
        this.f16257a += r2;
    }

    public final void c(int r1) {
        this.f16257a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (this.f16257a == ((b) r4).f16257a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f16257a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f16257a + ')';
    }

    public /* synthetic */ b(int r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
