package com.iab.digitalidentity.sdk.core.model;

import b.AbstractC4230a;
import b.AbstractC4231b;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/FRChallengeConfigs;", "", "verificationTimer", "", "pollingInterval", "pollingBatch", "", "pollingCeiling", "auroraConfigVariant", "", "(JJIILjava/lang/String;)V", "getAuroraConfigVariant", "()Ljava/lang/String;", "getPollingBatch", "()I", "getPollingCeiling", "getPollingInterval", "()J", "getVerificationTimer", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FRChallengeConfigs {

    @SerializedName("aurora_configs")
    private final String auroraConfigVariant;

    @SerializedName("polling_batch")
    private final int pollingBatch;

    @SerializedName("polling_ceiling")
    private final int pollingCeiling;

    @SerializedName("polling_interval")
    private final long pollingInterval;

    @SerializedName("verification_timer")
    private final long verificationTimer;

    public FRChallengeConfigs() {
        long r1 = 0;
        long r3 = 0;
        int r5 = 0;
        int r6 = 0;
        String r7 = null;
        this(r1, r3, r5, r6, r7, 31, null);
    }

    public static /* synthetic */ FRChallengeConfigs copy$default(FRChallengeConfigs r8, long r9, long r11, int r13, int r14, String r15, int r16, Object r17) {
        if ((r16 & 1) == 0) goto L5;
        r9 = r8.verificationTimer;
    L5:
        long r1 = r9;
        if ((r16 & 2) == 0) goto L8;
        r11 = r8.pollingInterval;
    L8:
        long r3 = r11;
        if ((r16 & 4) == 0) goto L11;
        r13 = r8.pollingBatch;
    L11:
        int r5 = r13;
        if ((r16 & 8) == 0) goto L14;
        r14 = r8.pollingCeiling;
    L14:
        int r6 = r14;
        if ((r16 & 16) == 0) goto L18;
        r15 = r8.auroraConfigVariant;
    L18:
        return r8.copy(r1, r3, r5, r6, r15);
    }

    public final long component1() {
        return this.verificationTimer;
    }

    public final long component2() {
        return this.pollingInterval;
    }

    public final int component3() {
        return this.pollingBatch;
    }

    public final int component4() {
        return this.pollingCeiling;
    }

    public final String component5() {
        return this.auroraConfigVariant;
    }

    public final FRChallengeConfigs copy(long r9, long r11, int r13, int r14, String r15) {
        return new FRChallengeConfigs(r9, r11, r13, r14, r15);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof FRChallengeConfigs) == true) goto L8;
        return false;
    L8:
        FRChallengeConfigs r82 = (FRChallengeConfigs) r8;
        if (this.verificationTimer == r82.verificationTimer) goto L12;
        return false;
    L12:
        if (this.pollingInterval == r82.pollingInterval) goto L15;
        return false;
    L15:
        if (this.pollingBatch == r82.pollingBatch) goto L18;
        return false;
    L18:
        if (this.pollingCeiling == r82.pollingCeiling) goto L21;
        return false;
    L21:
        if (p.g(this.auroraConfigVariant, r82.auroraConfigVariant) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final String getAuroraConfigVariant() {
        return this.auroraConfigVariant;
    }

    public final int getPollingBatch() {
        return this.pollingBatch;
    }

    public final int getPollingCeiling() {
        return this.pollingCeiling;
    }

    public final long getPollingInterval() {
        return this.pollingInterval;
    }

    public final long getVerificationTimer() {
        return this.verificationTimer;
    }

    public int hashCode() {
        int r02 = Long.hashCode(this.verificationTimer) * 31;
        int r03 = AbstractC4231b.a(this.pollingInterval, r02, 31);
        int r04 = AbstractC4230a.a(this.pollingBatch, r03, 31);
        int r05 = AbstractC4230a.a(this.pollingCeiling, r04, 31);
        String r1 = this.auroraConfigVariant;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r05 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "FRChallengeConfigs(verificationTimer=" + this.verificationTimer + ", pollingInterval=" + this.pollingInterval + ", pollingBatch=" + this.pollingBatch + ", pollingCeiling=" + this.pollingCeiling + ", auroraConfigVariant=" + this.auroraConfigVariant + ")";
    }

    public FRChallengeConfigs(long r1, long r3, int r5, int r6, String r7) {
        this.verificationTimer = r1;
        this.pollingInterval = r3;
        this.pollingBatch = r5;
        this.pollingCeiling = r6;
        this.auroraConfigVariant = r7;
    }

    public /* synthetic */ FRChallengeConfigs(long r8, long r10, int r12, int r13, String r14, int r15, i r16) {
        if ((r15 & 1) == 0) goto L5;
        long r02 = 5000;
    L7:
        if ((r15 & 2) == 0) goto L9;
        long r2 = 1000;
    L10:
        int r5 = 5;
        if ((r15 & 4) == 0) goto L13;
        int r4 = 5;
    L15:
        if ((r15 & 8) != 0) goto L19;
        r5 = r13;
    L19:
        if ((r15 & 16) == 0) goto L22;
        String r152 = null;
    L23:
        this(r02, r2, r4, r5, r152);
        return;
    L22:
        r152 = r14;
        goto L23
    L13:
        r4 = r12;
        goto L15
    L9:
        r2 = r10;
        goto L10
    L5:
        r02 = r8;
        goto L7
    }
}
