package com.stockbit.remote.models.request.account;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/remote/models/request/account/CreateNewPortfolioRequest;", "", "idemPotencyRef", "", "portfolioName", "tnc", "Lcom/stockbit/remote/models/request/account/CreateNewPortfolioRequest$TnC;", "purpose", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/remote/models/request/account/CreateNewPortfolioRequest$TnC;Ljava/lang/String;)V", "getIdemPotencyRef", "()Ljava/lang/String;", "getPortfolioName", "getTnc", "()Lcom/stockbit/remote/models/request/account/CreateNewPortfolioRequest$TnC;", "getPurpose", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "TnC", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateNewPortfolioRequest {

    @SerializedName("idempotency_ref")
    private final String idemPotencyRef;

    @SerializedName("portfolio_name")
    private final String portfolioName;

    @SerializedName("purpose")
    private final String purpose;

    @SerializedName("tnc")
    private final TnC tnc;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/remote/models/request/account/CreateNewPortfolioRequest$TnC;", "", "featureId", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "getVersion", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TnC {

        @SerializedName("feature_id")
        private final String featureId;

        @SerializedName("version")
        private final String version;

        public TnC(String r2, String r3) {
            p.l(r2, "featureId");
            p.l(r3, "version");
            this.featureId = r2;
            this.version = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof TnC) == true) goto L8;
            return false;
        L8:
            TnC r52 = (TnC) r5;
            if (p.g(this.featureId, r52.featureId) == true) goto L12;
            return false;
        L12:
            if (p.g(this.version, r52.version) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.featureId.hashCode() * 31) + this.version.hashCode();
        }

        public String toString() {
            return "TnC(featureId=" + this.featureId + ", version=" + this.version + ')';
        }
    }

    public CreateNewPortfolioRequest(String r2, String r3, TnC r4, String r5) {
        p.l(r2, "idemPotencyRef");
        p.l(r3, "portfolioName");
        p.l(r4, "tnc");
        p.l(r5, "purpose");
        this.idemPotencyRef = r2;
        this.portfolioName = r3;
        this.tnc = r4;
        this.purpose = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CreateNewPortfolioRequest) == true) goto L8;
        return false;
    L8:
        CreateNewPortfolioRequest r52 = (CreateNewPortfolioRequest) r5;
        if (p.g(this.idemPotencyRef, r52.idemPotencyRef) == true) goto L12;
        return false;
    L12:
        if (p.g(this.portfolioName, r52.portfolioName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.tnc, r52.tnc) == true) goto L18;
        return false;
    L18:
        if (p.g(this.purpose, r52.purpose) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.idemPotencyRef.hashCode() * 31) + this.portfolioName.hashCode()) * 31) + this.tnc.hashCode()) * 31) + this.purpose.hashCode();
    }

    public String toString() {
        return "CreateNewPortfolioRequest(idemPotencyRef=" + this.idemPotencyRef + ", portfolioName=" + this.portfolioName + ", tnc=" + this.tnc + ", purpose=" + this.purpose + ')';
    }
}
