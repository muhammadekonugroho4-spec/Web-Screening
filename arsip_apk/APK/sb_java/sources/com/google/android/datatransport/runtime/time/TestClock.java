package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class TestClock implements Clock {
    private final AtomicLong timestamp;

    public TestClock(long r2) {
        this.timestamp = new AtomicLong(r2);
    }

    public void advance(long r3) {
        if (r3 < 0) goto L7;
        this.timestamp.addAndGet(r3);
        return;
    L7:
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        advance(1);
    }
}
