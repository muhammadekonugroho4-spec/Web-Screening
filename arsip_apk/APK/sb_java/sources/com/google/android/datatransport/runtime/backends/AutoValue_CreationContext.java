package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: classes4.dex */
final class AutoValue_CreationContext extends CreationContext {
    private final Context applicationContext;
    private final String backendName;
    private final Clock monotonicClock;
    private final Clock wallClock;

    public AutoValue_CreationContext(Context r1, Clock r2, Clock r3, String r4) {
        if (r1 == null) goto L19;
        this.applicationContext = r1;
        if (r2 == null) goto L17;
        this.wallClock = r2;
        if (r3 == null) goto L15;
        this.monotonicClock = r3;
        if (r4 == null) goto L13;
        this.backendName = r4;
        return;
    L13:
        throw new NullPointerException("Null backendName");
    L15:
        throw new NullPointerException("Null monotonicClock");
    L17:
        throw new NullPointerException("Null wallClock");
    L19:
        throw new NullPointerException("Null applicationContext");
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof CreationContext) == false) goto L16;
        CreationContext r52 = (CreationContext) r5;
        if (this.applicationContext.equals(r52.getApplicationContext()) == false) goto L16;
        if (this.wallClock.equals(r52.getWallClock()) == false) goto L16;
        if (this.monotonicClock.equals(r52.getMonotonicClock()) == false) goto L16;
        if (this.backendName.equals(r52.getBackendName()) == false) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.monotonicClock;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.wallClock;
    }

    public int hashCode() {
        return ((((((this.applicationContext.hashCode() ^ 1000003) * 1000003) ^ this.wallClock.hashCode()) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003) ^ this.backendName.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.applicationContext + ", wallClock=" + this.wallClock + ", monotonicClock=" + this.monotonicClock + ", backendName=" + this.backendName + "}";
    }
}
