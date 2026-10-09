package com.stockbit.remote.models.request.account;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/remote/models/request/account/RenamePortfolioRequest;", "", "idemPotencyRef", "", "targetAccountNumber", "newPortfolioName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdemPotencyRef", "()Ljava/lang/String;", "getTargetAccountNumber", "getNewPortfolioName", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RenamePortfolioRequest {

    @SerializedName("idempotency_ref")
    private final String idemPotencyRef;

    @SerializedName("new_portfolio_name")
    private final String newPortfolioName;

    @SerializedName("target_account_number")
    private final String targetAccountNumber;

    public RenamePortfolioRequest(String r2, String r3, String r4) {
        p.l(r2, "idemPotencyRef");
        p.l(r3, "targetAccountNumber");
        p.l(r4, "newPortfolioName");
        this.idemPotencyRef = r2;
        this.targetAccountNumber = r3;
        this.newPortfolioName = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RenamePortfolioRequest) == true) goto L8;
        return false;
    L8:
        RenamePortfolioRequest r52 = (RenamePortfolioRequest) r5;
        if (p.g(this.idemPotencyRef, r52.idemPotencyRef) == true) goto L12;
        return false;
    L12:
        if (p.g(this.targetAccountNumber, r52.targetAccountNumber) == true) goto L15;
        return false;
    L15:
        if (p.g(this.newPortfolioName, r52.newPortfolioName) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.idemPotencyRef.hashCode() * 31) + this.targetAccountNumber.hashCode()) * 31) + this.newPortfolioName.hashCode();
    }

    public String toString() {
        return "RenamePortfolioRequest(idemPotencyRef=" + this.idemPotencyRef + ", targetAccountNumber=" + this.targetAccountNumber + ", newPortfolioName=" + this.newPortfolioName + ')';
    }
}
