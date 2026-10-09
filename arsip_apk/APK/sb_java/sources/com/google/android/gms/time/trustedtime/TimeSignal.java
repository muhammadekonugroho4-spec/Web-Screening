package com.google.android.gms.time.trustedtime;

import com.google.android.gms.time.Ticks;
import java.time.Duration;

/* loaded from: classes5.dex */
public interface TimeSignal {
    ComputedInstant computeCurrentInstant();

    ComputedInstant computeInstantAt(Ticks r1);

    Duration getAcquisitionEstimatedError();

    long getAcquisitionEstimatedErrorMillis();

    Ticks getAcquisitionTicks();
}
