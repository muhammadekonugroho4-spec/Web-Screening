package com.stockbit.remote.models.request.intraservice;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/remote/models/request/intraservice/MoveCashRequest;", "", "fromAccNo", "", "toAccNo", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromAccNo", "()Ljava/lang/String;", "getToAccNo", "getAmount", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MoveCashRequest {

    @SerializedName("amount")
    private final String amount;

    @SerializedName("from_acc_no")
    private final String fromAccNo;

    @SerializedName("to_acc_no")
    private final String toAccNo;

    public MoveCashRequest(String r2, String r3, String r4) {
        p.l(r2, "fromAccNo");
        p.l(r3, "toAccNo");
        p.l(r4, "amount");
        this.fromAccNo = r2;
        this.toAccNo = r3;
        this.amount = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MoveCashRequest) == true) goto L8;
        return false;
    L8:
        MoveCashRequest r52 = (MoveCashRequest) r5;
        if (p.g(this.fromAccNo, r52.fromAccNo) == true) goto L12;
        return false;
    L12:
        if (p.g(this.toAccNo, r52.toAccNo) == true) goto L15;
        return false;
    L15:
        if (p.g(this.amount, r52.amount) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.fromAccNo.hashCode() * 31) + this.toAccNo.hashCode()) * 31) + this.amount.hashCode();
    }

    public String toString() {
        return "MoveCashRequest(fromAccNo=" + this.fromAccNo + ", toAccNo=" + this.toAccNo + ", amount=" + this.amount + ')';
    }
}
