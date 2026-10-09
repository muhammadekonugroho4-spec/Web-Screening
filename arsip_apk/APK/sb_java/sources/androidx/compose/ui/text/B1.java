package androidx.compose.ui.text;

import androidx.compose.ui.text.style.u;

/* loaded from: classes.dex */
public abstract class B1 {
    public static final /* synthetic */ boolean a(int r02) {
        return b(r02);
    }

    public static final boolean b(int r2) {
        u.a r02 = androidx.compose.ui.text.style.u.f20329a;
        if (androidx.compose.ui.text.style.u.g(r2, r02.b()) == false) goto L5;
        return true;
    L5:
        if (androidx.compose.ui.text.style.u.g(r2, r02.d()) == false) goto L7;
        return true;
    L7:
        if (androidx.compose.ui.text.style.u.g(r2, r02.c()) == true) goto L14;
        return false;
    L14:
        return true;
    }
}
