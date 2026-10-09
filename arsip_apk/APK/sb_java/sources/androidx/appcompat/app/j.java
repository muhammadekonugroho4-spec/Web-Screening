package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ void a(OnBackInvokedDispatcher r02, OnBackInvokedCallback r1) {
        r02.unregisterOnBackInvokedCallback(r1);
    }
}
