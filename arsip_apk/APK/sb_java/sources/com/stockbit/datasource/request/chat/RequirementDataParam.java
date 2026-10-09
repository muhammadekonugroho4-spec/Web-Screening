package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/datasource/request/chat/RequirementDataParam;", "", "minimumPortfolioEquity", "Lcom/stockbit/datasource/request/chat/MinimumPortfolioEquityDataParam;", "rejectionMessage", "", "<init>", "(Lcom/stockbit/datasource/request/chat/MinimumPortfolioEquityDataParam;Ljava/lang/String;)V", "getMinimumPortfolioEquity", "()Lcom/stockbit/datasource/request/chat/MinimumPortfolioEquityDataParam;", "getRejectionMessage", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RequirementDataParam {

    @SerializedName("minimum_portfolio_equity")
    private final MinimumPortfolioEquityDataParam minimumPortfolioEquity;

    @SerializedName("rejection_message")
    private final String rejectionMessage;

    public RequirementDataParam(MinimumPortfolioEquityDataParam r1, String r2) {
        this.minimumPortfolioEquity = r1;
        this.rejectionMessage = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RequirementDataParam) == true) goto L8;
        return false;
    L8:
        RequirementDataParam r52 = (RequirementDataParam) r5;
        if (p.g(this.minimumPortfolioEquity, r52.minimumPortfolioEquity) == true) goto L12;
        return false;
    L12:
        if (p.g(this.rejectionMessage, r52.rejectionMessage) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        MinimumPortfolioEquityDataParam r02 = this.minimumPortfolioEquity;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.rejectionMessage;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RequirementDataParam(minimumPortfolioEquity=" + this.minimumPortfolioEquity + ", rejectionMessage=" + this.rejectionMessage + ")";
    }
}
