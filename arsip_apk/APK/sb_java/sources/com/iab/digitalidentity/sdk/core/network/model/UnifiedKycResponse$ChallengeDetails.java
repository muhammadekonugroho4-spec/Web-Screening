package com.iab.digitalidentity.sdk.core.network.model;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$ChallengeDetails", "", "", NotificationCompat.CATEGORY_STATUS, "attemptsRemaining", "maximumAttemptsAllowed", "coolDownTimeInSeconds", "rejectionReasonCode", "rejectionReasonTitle", "rejectionReasonMessage", "verificationToken", "currentAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "a", "getMaximumAttemptsAllowed", "getCoolDownTimeInSeconds", "c", "e", Constants.INAPP_DATA_TAG, "g", "b", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$ChallengeDetails {

    @SerializedName("attemptsRemaining")
    private final String attemptsRemaining;

    @SerializedName("cooldownTimeInSeconds")
    private final String coolDownTimeInSeconds;

    @SerializedName("currentAction")
    private final String currentAction;

    @SerializedName("maximumAttemptsAllowed")
    private final String maximumAttemptsAllowed;

    @SerializedName("rejectionReasonCode")
    private final String rejectionReasonCode;

    @SerializedName("rejectionReasonMessage")
    private final String rejectionReasonMessage;

    @SerializedName("rejectionReasonTitle")
    private final String rejectionReasonTitle;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("verificationToken")
    private final String verificationToken;

    public UnifiedKycResponse$ChallengeDetails() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public final String a() {
        return this.attemptsRemaining;
    }

    public final String b() {
        return this.currentAction;
    }

    public final String c() {
        return this.rejectionReasonCode;
    }

    public final String d() {
        return this.rejectionReasonMessage;
    }

    public final String e() {
        return this.rejectionReasonTitle;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$ChallengeDetails) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$ChallengeDetails r52 = (UnifiedKycResponse$ChallengeDetails) r5;
        if (p.g(this.status, r52.status) == true) goto L12;
        return false;
    L12:
        if (p.g(this.attemptsRemaining, r52.attemptsRemaining) == true) goto L15;
        return false;
    L15:
        if (p.g(this.maximumAttemptsAllowed, r52.maximumAttemptsAllowed) == true) goto L18;
        return false;
    L18:
        if (p.g(this.coolDownTimeInSeconds, r52.coolDownTimeInSeconds) == true) goto L21;
        return false;
    L21:
        if (p.g(this.rejectionReasonCode, r52.rejectionReasonCode) == true) goto L24;
        return false;
    L24:
        if (p.g(this.rejectionReasonTitle, r52.rejectionReasonTitle) == true) goto L27;
        return false;
    L27:
        if (p.g(this.rejectionReasonMessage, r52.rejectionReasonMessage) == true) goto L30;
        return false;
    L30:
        if (p.g(this.verificationToken, r52.verificationToken) == true) goto L33;
        return false;
    L33:
        if (p.g(this.currentAction, r52.currentAction) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.status;
    }

    public final String g() {
        return this.verificationToken;
    }

    public final int hashCode() {
        String r02 = this.status;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.attemptsRemaining;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.maximumAttemptsAllowed;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.coolDownTimeInSeconds;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.rejectionReasonCode;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.rejectionReasonTitle;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.rejectionReasonMessage;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.verificationToken;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.currentAction;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
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
        return "ChallengeDetails(status=" + this.status + ", attemptsRemaining=" + this.attemptsRemaining + ", maximumAttemptsAllowed=" + this.maximumAttemptsAllowed + ", coolDownTimeInSeconds=" + this.coolDownTimeInSeconds + ", rejectionReasonCode=" + this.rejectionReasonCode + ", rejectionReasonTitle=" + this.rejectionReasonTitle + ", rejectionReasonMessage=" + this.rejectionReasonMessage + ", verificationToken=" + this.verificationToken + ", currentAction=" + this.currentAction + ")";
    }

    public UnifiedKycResponse$ChallengeDetails(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.status = r1;
        this.attemptsRemaining = r2;
        this.maximumAttemptsAllowed = r3;
        this.coolDownTimeInSeconds = r4;
        this.rejectionReasonCode = r5;
        this.rejectionReasonTitle = r6;
        this.rejectionReasonMessage = r7;
        this.verificationToken = r8;
        this.currentAction = r9;
    }

    public /* synthetic */ UnifiedKycResponse$ChallengeDetails(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = "";
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
