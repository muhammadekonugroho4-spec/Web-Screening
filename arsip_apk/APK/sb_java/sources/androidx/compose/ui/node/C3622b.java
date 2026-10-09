package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import kotlin.KotlinNothingValueException;

/* renamed from: androidx.compose.ui.node.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3622b implements FocusProperties {

    /* renamed from: b, reason: collision with root package name */
    public static final C3622b f18781b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f18782c;

    static {
        f18781b = new C3622b();
    }

    public C3622b() {
    }

    public final boolean c() {
        if (f18782c == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void h(boolean r1) {
        f18782c = Boolean.valueOf(r1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean k() {
        Boolean r02 = f18782c;
        if (r02 != null) goto L5;
        androidx.compose.ui.internal.a.c("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    L5:
        return r02.booleanValue();
    }

    public final void p() {
        f18782c = null;
    }
}
