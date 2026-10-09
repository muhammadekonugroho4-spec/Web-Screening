package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/KycWidgetStatusVerificationTime;", "", "verificationTimeId", "", "verificationTimeEn", "(Ljava/lang/String;Ljava/lang/String;)V", "getVerificationTimeEn", "()Ljava/lang/String;", "getVerificationTimeId", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycWidgetStatusVerificationTime {

    @SerializedName("en")
    private final String verificationTimeEn;

    @SerializedName(Constants.KEY_ID)
    private final String verificationTimeId;

    /* JADX WARN: Multi-variable type inference failed */
    public KycWidgetStatusVerificationTime() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycWidgetStatusVerificationTime copy$default(KycWidgetStatusVerificationTime r02, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.verificationTimeId;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.verificationTimeEn;
    L9:
        return r02.copy(r1, r2);
    }

    public final String component1() {
        return this.verificationTimeId;
    }

    public final String component2() {
        return this.verificationTimeEn;
    }

    public final KycWidgetStatusVerificationTime copy(String r2, String r3) {
        p.l(r2, "verificationTimeId");
        p.l(r3, "verificationTimeEn");
        return new KycWidgetStatusVerificationTime(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycWidgetStatusVerificationTime) == true) goto L8;
        return false;
    L8:
        KycWidgetStatusVerificationTime r52 = (KycWidgetStatusVerificationTime) r5;
        if (p.g(this.verificationTimeId, r52.verificationTimeId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.verificationTimeEn, r52.verificationTimeEn) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final String getVerificationTimeEn() {
        return this.verificationTimeEn;
    }

    public final String getVerificationTimeId() {
        return this.verificationTimeId;
    }

    public int hashCode() {
        int r02 = this.verificationTimeId.hashCode() * 31;
        return this.verificationTimeEn.hashCode() + r02;
    }

    public String toString() {
        return "KycWidgetStatusVerificationTime(verificationTimeId=" + this.verificationTimeId + ", verificationTimeEn=" + this.verificationTimeEn + ")";
    }

    public KycWidgetStatusVerificationTime(String r2, String r3) {
        p.l(r2, "verificationTimeId");
        p.l(r3, "verificationTimeEn");
        this.verificationTimeId = r2;
        this.verificationTimeEn = r3;
    }

    public /* synthetic */ KycWidgetStatusVerificationTime(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
