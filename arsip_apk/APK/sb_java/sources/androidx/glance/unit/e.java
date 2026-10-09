package androidx.glance.unit;

import android.content.Context;
import androidx.compose.ui.graphics.C3567v0;
import kotlin.jvm.internal.i;

/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f25456a;

    static {
    }

    public /* synthetic */ e(long r1, i r3) {
        this(r1);
    }

    @Override // androidx.glance.unit.a
    public long a(Context r3) {
        return this.f25456a;
    }

    public final long b() {
        return this.f25456a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L9;
        return false;
    L9:
        if (C3567v0.o(this.f25456a, ((e) r8).f25456a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return C3567v0.u(this.f25456a);
    }

    public String toString() {
        return "FixedColorProvider(color=" + C3567v0.v(this.f25456a) + ')';
    }

    public e(long r1) {
        this.f25456a = r1;
    }
}
