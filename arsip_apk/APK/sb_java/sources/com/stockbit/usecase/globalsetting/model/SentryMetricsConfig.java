package com.stockbit.usecase.globalsetting.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/usecase/globalsetting/model/SentryMetricsConfig;", "", "enable", "", "intervalSeconds", "", "<init>", "(ZJ)V", "getEnable", "()Z", "setEnable", "(Z)V", "getIntervalSeconds", "()J", "setIntervalSeconds", "(J)V", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "usecase-global-setting"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SentryMetricsConfig {

    @SerializedName("enable")
    private boolean enable;

    @SerializedName("interval_seconds")
    private long intervalSeconds;

    public SentryMetricsConfig() {
        boolean r1 = false;
        long r2 = 0;
        this(r1, r2, 3, null);
    }

    public final boolean a() {
        return this.enable;
    }

    public final long b() {
        return this.intervalSeconds;
    }

    public final void c(boolean r1) {
        this.enable = r1;
    }

    public final void d(long r1) {
        this.intervalSeconds = r1;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof SentryMetricsConfig) == true) goto L8;
        return false;
    L8:
        SentryMetricsConfig r82 = (SentryMetricsConfig) r8;
        if (this.enable == r82.enable) goto L12;
        return false;
    L12:
        if (this.intervalSeconds == r82.intervalSeconds) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enable) * 31) + Long.hashCode(this.intervalSeconds);
    }

    public String toString() {
        return "SentryMetricsConfig(enable=" + this.enable + ", intervalSeconds=" + this.intervalSeconds + ")";
    }

    public SentryMetricsConfig(boolean r1, long r2) {
        this.enable = r1;
        this.intervalSeconds = r2;
    }

    public /* synthetic */ SentryMetricsConfig(boolean r1, long r2, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = 120;
    L8:
        this(r1, r2);
    }
}
