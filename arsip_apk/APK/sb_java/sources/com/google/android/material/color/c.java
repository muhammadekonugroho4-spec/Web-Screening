package com.google.android.material.color;

import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ void a(UiModeManager r02, Executor r1, UiModeManager$ContrastChangeListener r2) {
        r02.addContrastChangeListener(r1, r2);
    }
}
