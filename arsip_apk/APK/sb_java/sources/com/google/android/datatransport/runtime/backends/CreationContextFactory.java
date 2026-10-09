package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;

/* loaded from: classes4.dex */
class CreationContextFactory {
    private final Context applicationContext;
    private final Clock monotonicClock;
    private final Clock wallClock;

    public CreationContextFactory(Context r1, @WallTime Clock r2, @Monotonic Clock r3) {
        this.applicationContext = r1;
        this.wallClock = r2;
        this.monotonicClock = r3;
    }

    public CreationContext create(String r4) {
        return CreationContext.create(this.applicationContext, this.wallClock, this.monotonicClock, r4);
    }
}
