package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.y;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public interface a {
    static /* synthetic */ Object i2(a r02, long r1, e r3) {
        return y.b(y.f20664b.a());
    }

    static /* synthetic */ Object l1(a r02, long r1, long r3, e r5) {
        return y.b(y.f20664b.a());
    }

    default Object R0(long r1, e r3) {
        return i2(this, r1, r3);
    }

    default Object T(long r1, long r3, e r5) {
        return l1(this, r1, r3, r5);
    }

    default long e2(long r1, int r3) {
        return androidx.compose.ui.geometry.e.f17050b.c();
    }

    default long n0(long r1, long r3, int r5) {
        return androidx.compose.ui.geometry.e.f17050b.c();
    }
}
