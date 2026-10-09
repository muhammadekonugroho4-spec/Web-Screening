package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class CreationContext {
    private static final String DEFAULT_BACKEND_NAME = "cct";

    public CreationContext() {
    }

    public static CreationContext create(Context r2, Clock r3, Clock r4) {
        return new AutoValue_CreationContext(r2, r3, r4, DEFAULT_BACKEND_NAME);
    }

    public abstract Context getApplicationContext();

    public abstract String getBackendName();

    public abstract Clock getMonotonicClock();

    public abstract Clock getWallClock();

    public static CreationContext create(Context r1, Clock r2, Clock r3, String r4) {
        return new AutoValue_CreationContext(r1, r2, r3, r4);
    }
}
