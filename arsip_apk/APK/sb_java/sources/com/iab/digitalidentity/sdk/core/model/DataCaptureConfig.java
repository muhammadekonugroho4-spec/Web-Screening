package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/DataCaptureConfig;", "", "frameRate", "", "appDebugLogs", "", "ojoDebugLogs", "frameRetryLimit", "", "(JZZI)V", "getAppDebugLogs", "()Z", "getFrameRate", "()J", "getFrameRetryLimit", "()I", "getOjoDebugLogs", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataCaptureConfig {

    @SerializedName("debug_logs_app")
    private final boolean appDebugLogs;

    @SerializedName("frame_rate")
    private final long frameRate;

    @SerializedName("frame_retry")
    private final int frameRetryLimit;

    @SerializedName("debug_logs_ojo")
    private final boolean ojoDebugLogs;

    public DataCaptureConfig() {
        long r1 = 0;
        boolean r3 = false;
        boolean r4 = false;
        int r5 = 0;
        this(r1, r3, r4, r5, 15, null);
    }

    public static /* synthetic */ DataCaptureConfig copy$default(DataCaptureConfig r6, long r7, boolean r9, boolean r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = r6.frameRate;
    L5:
        long r1 = r7;
        if ((r12 & 2) == 0) goto L8;
        r9 = r6.appDebugLogs;
    L8:
        boolean r3 = r9;
        if ((r12 & 4) == 0) goto L11;
        r10 = r6.ojoDebugLogs;
    L11:
        boolean r4 = r10;
        if ((r12 & 8) == 0) goto L15;
        r11 = r6.frameRetryLimit;
    L15:
        return r6.copy(r1, r3, r4, r11);
    }

    public final long component1() {
        return this.frameRate;
    }

    public final boolean component2() {
        return this.appDebugLogs;
    }

    public final boolean component3() {
        return this.ojoDebugLogs;
    }

    public final int component4() {
        return this.frameRetryLimit;
    }

    public final DataCaptureConfig copy(long r7, boolean r9, boolean r10, int r11) {
        return new DataCaptureConfig(r7, r9, r10, r11);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof DataCaptureConfig) == true) goto L8;
        return false;
    L8:
        DataCaptureConfig r82 = (DataCaptureConfig) r8;
        if (this.frameRate == r82.frameRate) goto L12;
        return false;
    L12:
        if (this.appDebugLogs == r82.appDebugLogs) goto L15;
        return false;
    L15:
        if (this.ojoDebugLogs == r82.ojoDebugLogs) goto L18;
        return false;
    L18:
        if (this.frameRetryLimit == r82.frameRetryLimit) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean getAppDebugLogs() {
        return this.appDebugLogs;
    }

    public final long getFrameRate() {
        return this.frameRate;
    }

    public final int getFrameRetryLimit() {
        return this.frameRetryLimit;
    }

    public final boolean getOjoDebugLogs() {
        return this.ojoDebugLogs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = Long.hashCode(this.frameRate) * 31;
        boolean r1 = this.appDebugLogs;
        int r2 = 1;
        int r12 = r1;
        if (r1 == 0) goto L5;
        r12 = 1;
    L5:
        int r03 = (r02 + r12) * 31;
        boolean r13 = this.ojoDebugLogs;
        if (r13 == true) goto L10;
        r2 = r13 ? 1 : 0;
    L10:
        return Integer.hashCode(this.frameRetryLimit) + ((r03 + r2) * 31);
    }

    public String toString() {
        return "DataCaptureConfig(frameRate=" + this.frameRate + ", appDebugLogs=" + this.appDebugLogs + ", ojoDebugLogs=" + this.ojoDebugLogs + ", frameRetryLimit=" + this.frameRetryLimit + ")";
    }

    public DataCaptureConfig(long r1, boolean r3, boolean r4, int r5) {
        this.frameRate = r1;
        this.appDebugLogs = r3;
        this.ojoDebugLogs = r4;
        this.frameRetryLimit = r5;
    }

    public /* synthetic */ DataCaptureConfig(long r7, boolean r9, boolean r10, int r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = 0;
    L5:
        long r1 = r7;
        if ((r12 & 2) == 0) goto L8;
        boolean r3 = false;
    L10:
        if ((r12 & 4) == 0) goto L12;
        boolean r4 = false;
    L14:
        if ((r12 & 8) == 0) goto L16;
        r11 = 3;
    L16:
        this(r1, r3, r4, r11);
        return;
    L12:
        r4 = r10;
        goto L14
    L8:
        r3 = r9;
        goto L10
    }
}
