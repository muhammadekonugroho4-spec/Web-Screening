package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;

    @SuppressLint({"ThreadPoolCreation"})
    private final Handler mainThreadHandler;
    private final AtomicReference<View> viewReference;

    /* renamed from: com.google.firebase.perf.util.FirstDrawDoneListener$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnAttachStateChangeListener {
        final /* synthetic */ FirstDrawDoneListener val$listener;

        public AnonymousClass1(FirstDrawDoneListener r1) {
            this.val$listener = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View r3) {
            r3.getViewTreeObserver().addOnDrawListener(this.val$listener);
            r3.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View r1) {
            r1.removeOnAttachStateChangeListener(this);
        }
    }

    private FirstDrawDoneListener(View r3, Runnable r4) {
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.viewReference = new AtomicReference(r3);
        this.callback = r4;
    }

    public static /* synthetic */ void a(FirstDrawDoneListener r02, View r1) {
        r02.getClass();
        r1.getViewTreeObserver().removeOnDrawListener(r02);
    }

    private static boolean isAliveAndAttached(View r1) {
        if (r1.getViewTreeObserver().isAlive() == true) goto L5;
        return false;
    L5:
        if (isAttachedToWindow(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    private static boolean isAttachedToWindow(View r02) {
        return r02.isAttachedToWindow();
    }

    public static void registerForNextDraw(View r1, Runnable r2) {
        FirstDrawDoneListener r02 = new FirstDrawDoneListener(r1, r2);
        r1.getViewTreeObserver().addOnDrawListener(r02);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View r02 = this.viewReference.getAndSet(null);
        if (r02 != null) goto L5;
        return;
    L5:
        r02.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, r02));
        this.mainThreadHandler.postAtFrontOfQueue(this.callback);
    }
}
