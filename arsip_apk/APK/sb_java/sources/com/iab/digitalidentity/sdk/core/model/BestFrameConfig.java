package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/BestFrameConfig;", "", "quality", "", "isDebugMode", "", "retryLimit", "(IZI)V", "()Z", "getQuality", "()I", "getRetryLimit", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BestFrameConfig {

    @SerializedName("debug")
    private final boolean isDebugMode;

    @SerializedName("quality")
    private final int quality;

    @SerializedName("retry")
    private final int retryLimit;

    public BestFrameConfig() {
        int r1 = 0;
        boolean r2 = false;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BestFrameConfig copy$default(BestFrameConfig r02, int r1, boolean r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.quality;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.isDebugMode;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.retryLimit;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.quality;
    }

    public final boolean component2() {
        return this.isDebugMode;
    }

    public final int component3() {
        return this.retryLimit;
    }

    public final BestFrameConfig copy(int r2, boolean r3, int r4) {
        return new BestFrameConfig(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BestFrameConfig) == true) goto L8;
        return false;
    L8:
        BestFrameConfig r52 = (BestFrameConfig) r5;
        if (this.quality == r52.quality) goto L12;
        return false;
    L12:
        if (this.isDebugMode == r52.isDebugMode) goto L15;
        return false;
    L15:
        if (this.retryLimit == r52.retryLimit) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getQuality() {
        return this.quality;
    }

    public final int getRetryLimit() {
        return this.retryLimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = Integer.hashCode(this.quality) * 31;
        boolean r1 = this.isDebugMode;
        int r12 = r1;
        if (r1 == 0) goto L5;
        r12 = 1;
    L5:
        int r03 = (r02 + r12) * 31;
        return Integer.hashCode(this.retryLimit) + r03;
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    public String toString() {
        return "BestFrameConfig(quality=" + this.quality + ", isDebugMode=" + this.isDebugMode + ", retryLimit=" + this.retryLimit + ")";
    }

    public BestFrameConfig(int r1, boolean r2, int r3) {
        this.quality = r1;
        this.isDebugMode = r2;
        this.retryLimit = r3;
    }

    public /* synthetic */ BestFrameConfig(int r1, boolean r2, int r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 100;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = false;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = 2;
    L11:
        this(r1, r2, r3);
    }
}
