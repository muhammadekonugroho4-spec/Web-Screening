package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class PreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    private final Runnable callbackBoQ;
    private final Runnable callbackFoQ;

    @SuppressLint({"ThreadPoolCreation"})
    private final Handler mainThreadHandler;
    private final AtomicReference<View> viewReference;

    private PreDrawListener(View r3, Runnable r4, Runnable r5) {
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.viewReference = new AtomicReference(r3);
        this.callbackBoQ = r4;
        this.callbackFoQ = r5;
    }

    public static void registerForNextDraw(View r1, Runnable r2, Runnable r3) {
        PreDrawListener r02 = new PreDrawListener(r1, r2, r3);
        r1.getViewTreeObserver().addOnPreDrawListener(r02);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View r02 = this.viewReference.getAndSet(null);
        if (r02 != null) goto L5;
        return true;
    L5:
        r02.getViewTreeObserver().removeOnPreDrawListener(this);
        this.mainThreadHandler.post(this.callbackBoQ);
        this.mainThreadHandler.postAtFrontOfQueue(this.callbackFoQ);
        return true;
    }
}
