package com.stockbit.core.ui.callmonitor;

import android.media.AudioManager;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ void a(AudioManager r02, AudioManager.OnModeChangedListener r1) {
        r02.removeOnModeChangedListener(r1);
    }
}
