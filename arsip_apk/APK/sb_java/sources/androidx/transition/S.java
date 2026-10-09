package androidx.transition;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class S extends P {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f28354g = true;

    public static class a {
        public static void a(View r02, int r1, int r2, int r3, int r4) {
            Q.a(r02, r1, r2, r3, r4);
        }
    }

    static {
    }

    public S() {
    }

    @Override // androidx.transition.M
    public void e(View r2, int r3, int r4, int r5, int r6) {
        if (f28354g == false) goto L10;
        a.a(r2, r3, r4, r5, r6);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f28354g = false;
        return;
    }
}
