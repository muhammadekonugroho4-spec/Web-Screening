package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.C3576a;
import androidx.compose.ui.input.pointer.InterfaceC3594t;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f19099a = null;

    static {
        f19099a = new B();
    }

    public B() {
    }

    public final void a(View r2, InterfaceC3594t r3) {
        PointerIcon r32 = b(r2.getContext(), r3);
        if (kotlin.jvm.internal.p.g(r2.getPointerIcon(), r32) == true) goto L6;
        r2.setPointerIcon(r32);
        return;
    }

    public final PointerIcon b(Context r2, InterfaceC3594t r3) {
        if ((r3 instanceof C3576a) == false) goto L7;
        return PointerIcon.getSystemIcon(r2, ((C3576a) r3).a());
    L7:
        return PointerIcon.getSystemIcon(r2, 1000);
    }
}
