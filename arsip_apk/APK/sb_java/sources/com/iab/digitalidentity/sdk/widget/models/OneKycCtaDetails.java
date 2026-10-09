package com.iab.digitalidentity.sdk.widget.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/OneKycCtaDetails;", "", "ctaText", "", "actionType", "Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetCtaType;", "(Ljava/lang/String;Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetCtaType;)V", "getActionType", "()Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetCtaType;", "getCtaText", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneKycCtaDetails {
    private final OneKycWidgetCtaType actionType;
    private final String ctaText;

    public OneKycCtaDetails(String r2, OneKycWidgetCtaType r3) {
        p.l(r2, "ctaText");
        p.l(r3, "actionType");
        this.ctaText = r2;
        this.actionType = r3;
    }

    public static /* synthetic */ OneKycCtaDetails copy$default(OneKycCtaDetails r02, String r1, OneKycWidgetCtaType r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.ctaText;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.actionType;
    L9:
        return r02.copy(r1, r2);
    }

    public final String component1() {
        return this.ctaText;
    }

    public final OneKycWidgetCtaType component2() {
        return this.actionType;
    }

    public final OneKycCtaDetails copy(String r2, OneKycWidgetCtaType r3) {
        p.l(r2, "ctaText");
        p.l(r3, "actionType");
        return new OneKycCtaDetails(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OneKycCtaDetails) == true) goto L8;
        return false;
    L8:
        OneKycCtaDetails r52 = (OneKycCtaDetails) r5;
        if (p.g(this.ctaText, r52.ctaText) == true) goto L12;
        return false;
    L12:
        if (this.actionType == r52.actionType) goto L14;
        return false;
    L14:
        return true;
    }

    public final OneKycWidgetCtaType getActionType() {
        return this.actionType;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public int hashCode() {
        int r02 = this.ctaText.hashCode() * 31;
        return this.actionType.hashCode() + r02;
    }

    public String toString() {
        return "OneKycCtaDetails(ctaText=" + this.ctaText + ", actionType=" + this.actionType + ")";
    }
}
