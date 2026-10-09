package com.stockbit.usecase.globalsetting.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stockbit/usecase/globalsetting/model/SentryThrottleConfig;", "", "sessionTtlMs", "", "persistentTtlMs", "<init>", "(JJ)V", "getSessionTtlMs", "()J", "setSessionTtlMs", "(J)V", "getPersistentTtlMs", "setPersistentTtlMs", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "usecase-global-setting"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SentryThrottleConfig {

    @SerializedName("persistent_ttl_ms")
    private long persistentTtlMs;

    @SerializedName("session_ttl_ms")
    private long sessionTtlMs;

    public SentryThrottleConfig() {
        long r1 = 0;
        long r3 = 0;
        this(r1, r3, 3, null);
    }

    public final long a() {
        return this.persistentTtlMs;
    }

    public final long b() {
        return this.sessionTtlMs;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof SentryThrottleConfig) == true) goto L8;
        return false;
    L8:
        SentryThrottleConfig r82 = (SentryThrottleConfig) r8;
        if (this.sessionTtlMs == r82.sessionTtlMs) goto L12;
        return false;
    L12:
        if (this.persistentTtlMs == r82.persistentTtlMs) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.sessionTtlMs) * 31) + Long.hashCode(this.persistentTtlMs);
    }

    public String toString() {
        return "SentryThrottleConfig(sessionTtlMs=" + this.sessionTtlMs + ", persistentTtlMs=" + this.persistentTtlMs + ")";
    }

    public SentryThrottleConfig(long r1, long r3) {
        this.sessionTtlMs = r1;
        this.persistentTtlMs = r3;
    }

    public /* synthetic */ SentryThrottleConfig(long r1, long r3, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = Constants.ONE_MIN_IN_MILLIS;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r3 = Constants.ONE_DAY_IN_MILLIS;
    L8:
        this(r1, r3);
    }
}
