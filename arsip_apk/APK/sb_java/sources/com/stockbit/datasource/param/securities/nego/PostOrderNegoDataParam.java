package com.stockbit.datasource.param.securities.nego;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, d2 = {"Lcom/stockbit/datasource/param/securities/nego/PostOrderNegoDataParam;", "", "verificationSessionId", "", "idemPotencyKey", "assetCode", "shares", "counterPartyId", "orderSide", FirebaseAnalytics.Param.PRICE, "orderVisibility", "purpose", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVerificationSessionId", "()Ljava/lang/String;", "getIdemPotencyKey", "getAssetCode", "getShares", "getCounterPartyId", "getOrderSide", "getPrice", "getOrderVisibility", "getPurpose", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostOrderNegoDataParam {

    @SerializedName("asset_code")
    private final String assetCode;

    @SerializedName("counterparty_order_id")
    private final String counterPartyId;

    @SerializedName("idempotency_key")
    private final String idemPotencyKey;

    @SerializedName("order_side")
    private final String orderSide;

    @SerializedName("order_visibility")
    private final String orderVisibility;

    @SerializedName("order_price")
    private final String price;

    @SerializedName("purpose")
    private final String purpose;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("verification_session_id")
    private final String verificationSessionId;

    public PostOrderNegoDataParam(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        p.l(r2, "verificationSessionId");
        p.l(r3, "idemPotencyKey");
        p.l(r4, "assetCode");
        p.l(r5, "shares");
        p.l(r6, "counterPartyId");
        p.l(r7, "orderSide");
        p.l(r8, FirebaseAnalytics.Param.PRICE);
        p.l(r9, "orderVisibility");
        p.l(r10, "purpose");
        p.l(r11, "reason");
        this.verificationSessionId = r2;
        this.idemPotencyKey = r3;
        this.assetCode = r4;
        this.shares = r5;
        this.counterPartyId = r6;
        this.orderSide = r7;
        this.price = r8;
        this.orderVisibility = r9;
        this.purpose = r10;
        this.reason = r11;
    }

    public final String a() {
        return this.assetCode;
    }

    public final String b() {
        return this.counterPartyId;
    }

    public final String c() {
        return this.idemPotencyKey;
    }

    public final String d() {
        return this.orderSide;
    }

    public final String e() {
        return this.orderVisibility;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostOrderNegoDataParam) == true) goto L8;
        return false;
    L8:
        PostOrderNegoDataParam r52 = (PostOrderNegoDataParam) r5;
        if (p.g(this.verificationSessionId, r52.verificationSessionId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.idemPotencyKey, r52.idemPotencyKey) == true) goto L15;
        return false;
    L15:
        if (p.g(this.assetCode, r52.assetCode) == true) goto L18;
        return false;
    L18:
        if (p.g(this.shares, r52.shares) == true) goto L21;
        return false;
    L21:
        if (p.g(this.counterPartyId, r52.counterPartyId) == true) goto L24;
        return false;
    L24:
        if (p.g(this.orderSide, r52.orderSide) == true) goto L27;
        return false;
    L27:
        if (p.g(this.price, r52.price) == true) goto L30;
        return false;
    L30:
        if (p.g(this.orderVisibility, r52.orderVisibility) == true) goto L33;
        return false;
    L33:
        if (p.g(this.purpose, r52.purpose) == true) goto L36;
        return false;
    L36:
        if (p.g(this.reason, r52.reason) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.price;
    }

    public final String g() {
        return this.purpose;
    }

    public final String h() {
        return this.reason;
    }

    public int hashCode() {
        return (((((((((((((((((this.verificationSessionId.hashCode() * 31) + this.idemPotencyKey.hashCode()) * 31) + this.assetCode.hashCode()) * 31) + this.shares.hashCode()) * 31) + this.counterPartyId.hashCode()) * 31) + this.orderSide.hashCode()) * 31) + this.price.hashCode()) * 31) + this.orderVisibility.hashCode()) * 31) + this.purpose.hashCode()) * 31) + this.reason.hashCode();
    }

    public final String i() {
        return this.shares;
    }

    public final String j() {
        return this.verificationSessionId;
    }

    public String toString() {
        return "PostOrderNegoDataParam(verificationSessionId=" + this.verificationSessionId + ", idemPotencyKey=" + this.idemPotencyKey + ", assetCode=" + this.assetCode + ", shares=" + this.shares + ", counterPartyId=" + this.counterPartyId + ", orderSide=" + this.orderSide + ", price=" + this.price + ", orderVisibility=" + this.orderVisibility + ", purpose=" + this.purpose + ", reason=" + this.reason + ")";
    }
}
