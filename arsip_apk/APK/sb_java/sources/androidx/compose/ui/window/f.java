package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f20831a = null;

    static {
        f20831a = new f();
    }

    public f() {
    }

    public static /* synthetic */ void a(kotlin.jvm.functions.a r02) {
        c(r02);
    }

    public static final OnBackInvokedCallback b(final kotlin.jvm.functions.a r1) {
        return new e(r1);
    }

    public static final void c(kotlin.jvm.functions.a r02) {
        if (r02 == null) goto L5;
        r02.invoke();
        return;
    }

    public static final void d(View r1, Object r2) {
        if ((r2 instanceof OnBackInvokedCallback) == false) goto L8;
        OnBackInvokedDispatcher r12 = r1.findOnBackInvokedDispatcher();
        if (r12 == null) goto L9;
        r12.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) r2);
        return;
    L9:
        return;
    }

    public static final void e(View r1, Object r2) {
        if ((r2 instanceof OnBackInvokedCallback) == false) goto L8;
        OnBackInvokedDispatcher r12 = r1.findOnBackInvokedDispatcher();
        if (r12 == null) goto L9;
        r12.unregisterOnBackInvokedCallback((OnBackInvokedCallback) r2);
        return;
    L9:
        return;
    }
}
