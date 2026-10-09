package androidx.transition;

import android.os.Build;
import android.view.View;

/* loaded from: classes4.dex */
public class U extends S {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f28395h = true;

    public static class a {
        public static void a(View r02, int r1) {
            T.a(r02, r1);
        }
    }

    static {
    }

    public U() {
    }

    @Override // androidx.transition.M
    public void g(View r3, int r4) {
        if (Build.VERSION.SDK_INT != 28) goto L7;
        super.g(r3, r4);
        return;
    L7:
        if (f28395h == false) goto L14;
        a.a(r3, r4);     // Catch: NoSuchMethodError -> L10
        return;
    L10:
        f28395h = false;
        return;
    }
}
