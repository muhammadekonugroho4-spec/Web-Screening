package com.stockbit.core.ui.callmonitor;

import android.media.AudioManager;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ void a(AudioManager r02, Executor r1, AudioManager.OnModeChangedListener r2) {
        r02.addOnModeChangedListener(r1, r2);
    }
}
