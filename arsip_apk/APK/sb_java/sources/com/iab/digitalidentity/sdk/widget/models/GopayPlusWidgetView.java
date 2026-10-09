package com.iab.digitalidentity.sdk.widget.models;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/GopayPlusWidgetView;", "", "view", "Landroid/view/View;", "viewType", "Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetViewType;", "(Landroid/view/View;Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetViewType;)V", "getView", "()Landroid/view/View;", "getViewType", "()Lcom/iab/digitalidentity/sdk/widget/models/OneKycWidgetViewType;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GopayPlusWidgetView {
    private final View view;
    private final OneKycWidgetViewType viewType;

    public GopayPlusWidgetView(View r2, OneKycWidgetViewType r3) {
        p.l(r2, "view");
        p.l(r3, "viewType");
        this.view = r2;
        this.viewType = r3;
    }

    public static /* synthetic */ GopayPlusWidgetView copy$default(GopayPlusWidgetView r02, View r1, OneKycWidgetViewType r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.view;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.viewType;
    L9:
        return r02.copy(r1, r2);
    }

    public final View component1() {
        return this.view;
    }

    public final OneKycWidgetViewType component2() {
        return this.viewType;
    }

    public final GopayPlusWidgetView copy(View r2, OneKycWidgetViewType r3) {
        p.l(r2, "view");
        p.l(r3, "viewType");
        return new GopayPlusWidgetView(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GopayPlusWidgetView) == true) goto L8;
        return false;
    L8:
        GopayPlusWidgetView r52 = (GopayPlusWidgetView) r5;
        if (p.g(this.view, r52.view) == true) goto L12;
        return false;
    L12:
        if (this.viewType == r52.viewType) goto L14;
        return false;
    L14:
        return true;
    }

    public final View getView() {
        return this.view;
    }

    public final OneKycWidgetViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int r02 = this.view.hashCode() * 31;
        return this.viewType.hashCode() + r02;
    }

    public String toString() {
        return "GopayPlusWidgetView(view=" + this.view + ", viewType=" + this.viewType + ")";
    }

    public /* synthetic */ GopayPlusWidgetView(View r1, OneKycWidgetViewType r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = OneKycWidgetViewType.KYC_STATE_VIEW;
    L5:
        this(r1, r2);
    }
}
