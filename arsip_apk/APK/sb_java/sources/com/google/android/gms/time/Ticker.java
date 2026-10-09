package com.google.android.gms.time;

import java.time.Duration;

/* loaded from: classes5.dex */
public interface Ticker {
    Duration durationBetween(Ticks r1, Ticks r2);

    long elapsedRealtimeMillisForTicks(Ticks r1);

    long elapsedRealtimeNanosForTicks(Ticks r1);

    long millisBetween(Ticks r1, Ticks r2);

    Ticks ticks();

    Ticks ticksForElapsedRealtimeMillis(long r1);

    Ticks ticksForElapsedRealtimeNanos(long r1);
}
