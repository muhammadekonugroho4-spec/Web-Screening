package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static /* bridge */ /* synthetic */ void a(OnBackInvokedDispatcher r02, int r1, OnBackInvokedCallback r2) {
        r02.registerOnBackInvokedCallback(r1, r2);
    }
}
