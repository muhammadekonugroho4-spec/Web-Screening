package androidx.compose.ui.semantics;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class C implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final C f19410a = null;

    static {
        f19410a = new C();
    }

    public C() {
    }

    public int a(Pair r3, Pair r4) {
        int r02 = Float.compare(((androidx.compose.ui.geometry.g) r3.e()).n(), ((androidx.compose.ui.geometry.g) r4.e()).n());
        if (r02 == 0) goto L6;
        return r02;
    L6:
        return Float.compare(((androidx.compose.ui.geometry.g) r3.e()).e(), ((androidx.compose.ui.geometry.g) r4.e()).e());
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
        return a((Pair) r1, (Pair) r2);
    }
}
