package com.github.gcacace.signaturepad.view;

import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
public abstract class b {
    public static void a(ViewTreeObserver r02, ViewTreeObserver.OnGlobalLayoutListener r1) {
        r02.removeOnGlobalLayoutListener(r1);
    }
}
