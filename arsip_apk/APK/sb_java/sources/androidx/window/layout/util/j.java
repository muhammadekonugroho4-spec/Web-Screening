package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f29001a = null;

    static {
        f29001a = new j();
    }

    public j() {
    }

    public final Context a(Context r4) {
        kotlin.jvm.internal.p.l(r4, "context");
        Context r02 = r4;
    L4:
        if ((r02 instanceof ContextWrapper) == false) goto L15;
        if ((r02 instanceof Activity) == true) goto L7;
        if ((r02 instanceof InputMethodService) == true) goto L10;
        ContextWrapper r1 = (ContextWrapper) r02;
        if (r1.getBaseContext() == null) goto L13;
        r02 = r1.getBaseContext();
        kotlin.jvm.internal.p.k(r02, "getBaseContext(...)");
        goto L4
    L13:
        return r02;
    L10:
        return r02;
    L7:
        return r02;
    L15:
        return r4;
    }
}
