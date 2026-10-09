package com.stockbit.remote.models.request.cashsweep;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stockbit/remote/models/request/cashsweep/ActivateCashSweepRequest;", "", "reservedAmount", "", "theme", "", "callbackUrl", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "getReservedAmount", "()D", "getTheme", "()Ljava/lang/String;", "getCallbackUrl", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivateCashSweepRequest {

    @SerializedName("callback_url")
    private final String callbackUrl;

    @SerializedName("reserved_amount")
    private final double reservedAmount;

    @SerializedName("theme")
    private final String theme;

    public ActivateCashSweepRequest(double r2, String r4, String r5) {
        p.l(r4, "theme");
        p.l(r5, "callbackUrl");
        this.reservedAmount = r2;
        this.theme = r4;
        this.callbackUrl = r5;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ActivateCashSweepRequest) == true) goto L8;
        return false;
    L8:
        ActivateCashSweepRequest r82 = (ActivateCashSweepRequest) r8;
        if (Double.compare(this.reservedAmount, r82.reservedAmount) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.theme, r82.theme) == true) goto L15;
        return false;
    L15:
        if (p.g(this.callbackUrl, r82.callbackUrl) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.reservedAmount) * 31) + this.theme.hashCode()) * 31) + this.callbackUrl.hashCode();
    }

    public String toString() {
        return "ActivateCashSweepRequest(reservedAmount=" + this.reservedAmount + ", theme=" + this.theme + ", callbackUrl=" + this.callbackUrl + ')';
    }
}
