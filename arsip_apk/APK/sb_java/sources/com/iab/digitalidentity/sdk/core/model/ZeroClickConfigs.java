package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/ZeroClickConfigs;", "", "selfiePrepareTimerDuration", "", "bestFramePreviewDisabled", "", "selfiePrepareOption", "", "(JZLjava/lang/String;)V", "getBestFramePreviewDisabled", "()Z", "getSelfiePrepareOption", "()Ljava/lang/String;", "getSelfiePrepareTimerDuration", "()J", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZeroClickConfigs {

    @SerializedName("bestframe_capture_preview_disabled")
    private final boolean bestFramePreviewDisabled;

    @SerializedName("selfie_prepare_option")
    private final String selfiePrepareOption;

    @SerializedName("selfie_prepare_timer")
    private final long selfiePrepareTimerDuration;

    public ZeroClickConfigs() {
        long r1 = 0;
        boolean r3 = false;
        String r4 = null;
        this(r1, r3, r4, 7, null);
    }

    public static /* synthetic */ ZeroClickConfigs copy$default(ZeroClickConfigs r02, long r1, boolean r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.selfiePrepareTimerDuration;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r02.bestFramePreviewDisabled;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r02.selfiePrepareOption;
    L12:
        return r02.copy(r1, r3, r4);
    }

    public final long component1() {
        return this.selfiePrepareTimerDuration;
    }

    public final boolean component2() {
        return this.bestFramePreviewDisabled;
    }

    public final String component3() {
        return this.selfiePrepareOption;
    }

    public final ZeroClickConfigs copy(long r2, boolean r4, String r5) {
        p.l(r5, "selfiePrepareOption");
        return new ZeroClickConfigs(r2, r4, r5);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ZeroClickConfigs) == true) goto L8;
        return false;
    L8:
        ZeroClickConfigs r82 = (ZeroClickConfigs) r8;
        if (this.selfiePrepareTimerDuration == r82.selfiePrepareTimerDuration) goto L12;
        return false;
    L12:
        if (this.bestFramePreviewDisabled == r82.bestFramePreviewDisabled) goto L15;
        return false;
    L15:
        if (p.g(this.selfiePrepareOption, r82.selfiePrepareOption) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final boolean getBestFramePreviewDisabled() {
        return this.bestFramePreviewDisabled;
    }

    public final String getSelfiePrepareOption() {
        return this.selfiePrepareOption;
    }

    public final long getSelfiePrepareTimerDuration() {
        return this.selfiePrepareTimerDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = Long.hashCode(this.selfiePrepareTimerDuration) * 31;
        boolean r1 = this.bestFramePreviewDisabled;
        int r12 = r1;
        if (r1 == 0) goto L5;
        r12 = 1;
    L5:
        int r03 = (r02 + r12) * 31;
        return this.selfiePrepareOption.hashCode() + r03;
    }

    public String toString() {
        return "ZeroClickConfigs(selfiePrepareTimerDuration=" + this.selfiePrepareTimerDuration + ", bestFramePreviewDisabled=" + this.bestFramePreviewDisabled + ", selfiePrepareOption=" + this.selfiePrepareOption + ")";
    }

    public ZeroClickConfigs(long r2, boolean r4, String r5) {
        p.l(r5, "selfiePrepareOption");
        this.selfiePrepareTimerDuration = r2;
        this.bestFramePreviewDisabled = r4;
        this.selfiePrepareOption = r5;
    }

    public /* synthetic */ ZeroClickConfigs(long r1, boolean r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 3000;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A;
    L11:
        this(r1, r3, r4);
    }
}
