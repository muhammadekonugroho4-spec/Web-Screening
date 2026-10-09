package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class Rate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long numTimeUnits;
    private long numTokensPerTotalTimeUnit;
    private TimeUnit timeUnit;

    /* renamed from: com.google.firebase.perf.util.Rate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit = null;

        static {
            int[] r02 = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = r02;
            r02[TimeUnit.NANOSECONDS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L10:
            $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L12:
            $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
            return;
        }
    }

    static {
    }

    public Rate(long r1, long r3, TimeUnit r5) {
        this.numTokensPerTotalTimeUnit = r1;
        this.numTimeUnits = r3;
        this.timeUnit = r5;
    }

    public double getTokensPerSeconds() {
        int r02 = AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit[this.timeUnit.ordinal()];
        if (r02 == 1) goto L15;
        if (r02 == 2) goto L13;
        if (r02 == 3) goto L11;
        return this.numTokensPerTotalTimeUnit / this.timeUnit.toSeconds(this.numTimeUnits);
    L11:
        return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toMillis(1);
    L13:
        return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toMicros(1);
    L15:
        return (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toNanos(1);
    }
}
