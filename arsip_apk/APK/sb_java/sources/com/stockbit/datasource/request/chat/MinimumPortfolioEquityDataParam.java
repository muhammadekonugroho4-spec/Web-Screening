package com.stockbit.datasource.request.chat;

import com.google.firebase.perf.util.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/stockbit/datasource/request/chat/MinimumPortfolioEquityDataParam;", "", Constants.ENABLE_DISABLE, "", "value", "", "<init>", "(ZJ)V", "()Z", "getValue", "()J", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MinimumPortfolioEquityDataParam {

    @SerializedName("is_enabled")
    private final boolean isEnabled;

    @SerializedName("value")
    private final long value;

    public MinimumPortfolioEquityDataParam(boolean r1, long r2) {
        this.isEnabled = r1;
        this.value = r2;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MinimumPortfolioEquityDataParam) == true) goto L8;
        return false;
    L8:
        MinimumPortfolioEquityDataParam r82 = (MinimumPortfolioEquityDataParam) r8;
        if (this.isEnabled == r82.isEnabled) goto L12;
        return false;
    L12:
        if (this.value == r82.value) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isEnabled) * 31) + Long.hashCode(this.value);
    }

    public String toString() {
        return "MinimumPortfolioEquityDataParam(isEnabled=" + this.isEnabled + ", value=" + this.value + ")";
    }
}
