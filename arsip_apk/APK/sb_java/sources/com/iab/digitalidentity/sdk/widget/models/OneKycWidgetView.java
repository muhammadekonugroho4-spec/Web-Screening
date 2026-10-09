package com.iab.digitalidentity.sdk.widget.models;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetView;", "", "view", "Landroid/view/View;", "viewType", "Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetViewType;", "cta", "Lcom/iab/digitalidentity/sdk/widget/models/OneKycCtaDetails;", "(Landroid/view/View;Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetViewType;Lcom/iab/digitalidentity/sdk/widget/models/OneKycCtaDetails;)V", "getCta", "()Lcom/iab/digitalidentity/sdk/widget/models/OneKycCtaDetails;", "getView", "()Landroid/view/View;", "getViewType", "()Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetViewType;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneKycWidgetView {
    private final OneKycCtaDetails cta;
    private final View view;
    private final OneKycWidgetViewType viewType;

    public OneKycWidgetView(View r2, OneKycWidgetViewType r3, OneKycCtaDetails r4) {
        p.l(r3, "viewType");
        this.view = r2;
        this.viewType = r3;
        this.cta = r4;
    }

    public static /* synthetic */ OneKycWidgetView copy$default(OneKycWidgetView r02, View r1, OneKycWidgetViewType r2, OneKycCtaDetails r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.view;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.viewType;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.cta;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final View component1() {
        return this.view;
    }

    public final OneKycWidgetViewType component2() {
        return this.viewType;
    }

    public final OneKycCtaDetails component3() {
        return this.cta;
    }

    public final OneKycWidgetView copy(View r2, OneKycWidgetViewType r3, OneKycCtaDetails r4) {
        p.l(r3, "viewType");
        return new OneKycWidgetView(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OneKycWidgetView) == true) goto L8;
        return false;
    L8:
        OneKycWidgetView r52 = (OneKycWidgetView) r5;
        if (p.g(this.view, r52.view) == true) goto L12;
        return false;
    L12:
        if (this.viewType == r52.viewType) goto L15;
        return false;
    L15:
        if (p.g(this.cta, r52.cta) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final OneKycCtaDetails getCta() {
        return this.cta;
    }

    public final View getView() {
        return this.view;
    }

    public final OneKycWidgetViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        View r02 = this.view;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r2 = (this.viewType.hashCode() + (r03 * 31)) * 31;
        OneKycCtaDetails r04 = this.cta;
        if (r04 == null) goto L11;
        r1 = r04.hashCode();
    L11:
        return r2 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OneKycWidgetView(view=" + this.view + ", viewType=" + this.viewType + ", cta=" + this.cta + ")";
    }
}
