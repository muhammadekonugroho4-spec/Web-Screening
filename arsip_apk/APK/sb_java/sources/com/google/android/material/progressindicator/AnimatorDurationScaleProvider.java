package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes5.dex */
public class AnimatorDurationScaleProvider {
    public AnimatorDurationScaleProvider() {
    }

    public float getSystemAnimatorDurationScale(ContentResolver r3) {
        return Settings.Global.getFloat(r3, "animator_duration_scale", 1.0f);
    }
}
