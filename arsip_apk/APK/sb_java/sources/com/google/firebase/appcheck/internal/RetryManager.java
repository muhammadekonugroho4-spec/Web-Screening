package com.google.firebase.appcheck.internal;

import com.google.firebase.appcheck.internal.util.Clock;

/* loaded from: classes6.dex */
public class RetryManager {
    static final int BAD_REQUEST_ERROR_CODE = 400;
    private static final int EXPONENTIAL = 0;
    static final long MAX_EXP_BACKOFF_MILLIS = 14400000;
    private static final double MAX_JITTER_MULTIPLIER = 0.5d;
    static final int NOT_FOUND_ERROR_CODE = 404;
    private static final int ONE_DAY = 1;
    static final long ONE_DAY_MILLIS = 86400000;
    static final long ONE_SECOND_MILLIS = 1000;
    static final long UNSET_RETRY_TIME = -1;
    private final Clock clock;
    private long currentRetryCount;
    private long nextRetryTimeMillis;

    public RetryManager() {
        this.currentRetryCount = 0;
        this.nextRetryTimeMillis = -1;
        this.clock = new Clock.DefaultClock();
    }

    private static int getBackoffStrategyByErrorCode(int r1) {
        if (r1 != 400) goto L5;
        return 1;
    L5:
        if (r1 == NOT_FOUND_ERROR_CODE) goto L11;
        return 0;
    L11:
        return 1;
    }

    public boolean canRetry() {
        if (this.nextRetryTimeMillis > this.clock.currentTimeMillis()) goto L6;
        return true;
    L6:
        return false;
    }

    public long getNextRetryTimeMillis() {
        return this.nextRetryTimeMillis;
    }

    public void resetBackoffOnSuccess() {
        this.currentRetryCount = 0;
        this.nextRetryTimeMillis = -1;
    }

    public void updateBackoffOnFailure(int r7) {
        this.currentRetryCount++;
        if (getBackoffStrategyByErrorCode(r7) != 1) goto L6;
        this.nextRetryTimeMillis = this.clock.currentTimeMillis() + 86400000;
        return;
    L6:
        this.nextRetryTimeMillis = this.clock.currentTimeMillis() + Math.min((long) (Math.pow(2.0d, this.currentRetryCount * ((Math.random() * MAX_JITTER_MULTIPLIER) + 1.0d)) * 1000.0d), MAX_EXP_BACKOFF_MILLIS);
    }

    public RetryManager(Clock r3) {
        this.currentRetryCount = 0;
        this.nextRetryTimeMillis = -1;
        this.clock = r3;
    }
}
