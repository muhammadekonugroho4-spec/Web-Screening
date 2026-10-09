package com.iab.digitalidentity.sdk.widget.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/models/GopayPlusWidgetState;", "", "viewData", "Lcom/iab/digitalidentity/sdk/widget/models/GopayPlusWidgetView;", "isPollingNeeded", "", "pollingInterval", "", "(Lcom/iab/digitalidentity/sdk/widget/models/GopayPlusWidgetView;ZJ)V", "()Z", "getPollingInterval", "()J", "getViewData", "()Lcom/iab/digitalidentity/sdk/widget/models/GopayPlusWidgetView;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GopayPlusWidgetState {
    private final boolean isPollingNeeded;
    private final long pollingInterval;
    private final GopayPlusWidgetView viewData;

    public GopayPlusWidgetState(GopayPlusWidgetView r2, boolean r3, long r4) {
        p.l(r2, "viewData");
        this.viewData = r2;
        this.isPollingNeeded = r3;
        this.pollingInterval = r4;
    }

    public static /* synthetic */ GopayPlusWidgetState copy$default(GopayPlusWidgetState r02, GopayPlusWidgetView r1, boolean r2, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.viewData;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.isPollingNeeded;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.pollingInterval;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final GopayPlusWidgetView component1() {
        return this.viewData;
    }

    public final boolean component2() {
        return this.isPollingNeeded;
    }

    public final long component3() {
        return this.pollingInterval;
    }

    public final GopayPlusWidgetState copy(GopayPlusWidgetView r2, boolean r3, long r4) {
        p.l(r2, "viewData");
        return new GopayPlusWidgetState(r2, r3, r4);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof GopayPlusWidgetState) == true) goto L8;
        return false;
    L8:
        GopayPlusWidgetState r82 = (GopayPlusWidgetState) r8;
        if (p.g(this.viewData, r82.viewData) == true) goto L12;
        return false;
    L12:
        if (this.isPollingNeeded == r82.isPollingNeeded) goto L15;
        return false;
    L15:
        if (this.pollingInterval == r82.pollingInterval) goto L17;
        return false;
    L17:
        return true;
    }

    public final long getPollingInterval() {
        return this.pollingInterval;
    }

    public final GopayPlusWidgetView getViewData() {
        return this.viewData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = this.viewData.hashCode() * 31;
        boolean r1 = this.isPollingNeeded;
        int r12 = r1;
        if (r1 == 0) goto L5;
        r12 = 1;
    L5:
        int r03 = (r02 + r12) * 31;
        return Long.hashCode(this.pollingInterval) + r03;
    }

    public final boolean isPollingNeeded() {
        return this.isPollingNeeded;
    }

    public String toString() {
        return "GopayPlusWidgetState(viewData=" + this.viewData + ", isPollingNeeded=" + this.isPollingNeeded + ", pollingInterval=" + this.pollingInterval + ")";
    }

    public /* synthetic */ GopayPlusWidgetState(GopayPlusWidgetView r1, boolean r2, long r3, int r5, i r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = -1;
    L8:
        this(r1, r2, r3);
    }
}
