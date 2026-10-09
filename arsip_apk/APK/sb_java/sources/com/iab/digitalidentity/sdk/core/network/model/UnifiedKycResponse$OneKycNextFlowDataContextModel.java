package com.iab.digitalidentity.sdk.core.network.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycNextFlowDataContextModel", "", "", "reasonCode", "reasonTitle", "reasonMessage", "challengeId", "consentId", "flow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "f", "e", "a", "b", "c", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$OneKycNextFlowDataContextModel {

    @SerializedName("challengeId")
    private final String challengeId;

    @SerializedName("consentId")
    private final String consentId;

    @SerializedName("flow")
    private final String flow;

    @SerializedName("reasonCode")
    private final String reasonCode;

    @SerializedName("reasonMessage")
    private final String reasonMessage;

    @SerializedName("reasonTitle")
    private final String reasonTitle;

    public UnifiedKycResponse$OneKycNextFlowDataContextModel() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final String a() {
        return this.challengeId;
    }

    public final String b() {
        return this.consentId;
    }

    public final String c() {
        return this.flow;
    }

    public final String d() {
        return this.reasonCode;
    }

    public final String e() {
        return this.reasonMessage;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$OneKycNextFlowDataContextModel) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$OneKycNextFlowDataContextModel r52 = (UnifiedKycResponse$OneKycNextFlowDataContextModel) r5;
        if (p.g(this.reasonCode, r52.reasonCode) == true) goto L12;
        return false;
    L12:
        if (p.g(this.reasonTitle, r52.reasonTitle) == true) goto L15;
        return false;
    L15:
        if (p.g(this.reasonMessage, r52.reasonMessage) == true) goto L18;
        return false;
    L18:
        if (p.g(this.challengeId, r52.challengeId) == true) goto L21;
        return false;
    L21:
        if (p.g(this.consentId, r52.consentId) == true) goto L24;
        return false;
    L24:
        if (p.g(this.flow, r52.flow) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.reasonTitle;
    }

    public final int hashCode() {
        String r02 = this.reasonCode;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.reasonTitle;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.reasonMessage;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.challengeId;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.consentId;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.flow;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "OneKycNextFlowDataContextModel(reasonCode=" + this.reasonCode + ", reasonTitle=" + this.reasonTitle + ", reasonMessage=" + this.reasonMessage + ", challengeId=" + this.challengeId + ", consentId=" + this.consentId + ", flow=" + this.flow + ")";
    }

    public UnifiedKycResponse$OneKycNextFlowDataContextModel(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.reasonCode = r1;
        this.reasonTitle = r2;
        this.reasonMessage = r3;
        this.challengeId = r4;
        this.consentId = r5;
        this.flow = r6;
    }

    public /* synthetic */ UnifiedKycResponse$OneKycNextFlowDataContextModel(String r2, String r3, String r4, String r5, String r6, String r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L21;
        String r82 = null;
    L20:
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
