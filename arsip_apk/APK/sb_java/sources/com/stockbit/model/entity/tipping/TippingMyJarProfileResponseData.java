package com.stockbit.model.entity.tipping;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JG\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011¨\u0006&"}, d2 = {"Lcom/stockbit/model/entity/tipping/TippingMyJarProfileResponseData;", "", "gopayAccount", "", "balance", "", "percentFee", "statusFee", "claimMinimum", "claimMaximum", "<init>", "(Ljava/lang/String;IIIII)V", "getGopayAccount", "()Ljava/lang/String;", "getBalance", "()I", "setBalance", "(I)V", "getPercentFee", "setPercentFee", "getStatusFee", "setStatusFee", "getClaimMinimum", "setClaimMinimum", "getClaimMaximum", "setClaimMaximum", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TippingMyJarProfileResponseData {

    @SerializedName("balance")
    private int balance;

    @SerializedName("claim_maximum")
    private int claimMaximum;

    @SerializedName("claim_minimum")
    private int claimMinimum;

    @SerializedName("gopay_account")
    private final String gopayAccount;

    @SerializedName("percent_fee")
    private int percentFee;

    @SerializedName("status_fee")
    private int statusFee;

    public TippingMyJarProfileResponseData(String r1, int r2, int r3, int r4, int r5, int r6) {
        this.gopayAccount = r1;
        this.balance = r2;
        this.percentFee = r3;
        this.statusFee = r4;
        this.claimMinimum = r5;
        this.claimMaximum = r6;
    }

    public final int a() {
        return this.balance;
    }

    public final int b() {
        return this.claimMaximum;
    }

    public final int c() {
        return this.claimMinimum;
    }

    public final String d() {
        return this.gopayAccount;
    }

    public final int e() {
        return this.percentFee;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TippingMyJarProfileResponseData) == true) goto L8;
        return false;
    L8:
        TippingMyJarProfileResponseData r52 = (TippingMyJarProfileResponseData) r5;
        if (p.g(this.gopayAccount, r52.gopayAccount) == true) goto L12;
        return false;
    L12:
        if (this.balance == r52.balance) goto L15;
        return false;
    L15:
        if (this.percentFee == r52.percentFee) goto L18;
        return false;
    L18:
        if (this.statusFee == r52.statusFee) goto L21;
        return false;
    L21:
        if (this.claimMinimum == r52.claimMinimum) goto L24;
        return false;
    L24:
        if (this.claimMaximum == r52.claimMaximum) goto L26;
        return false;
    L26:
        return true;
    }

    public final int f() {
        return this.statusFee;
    }

    public int hashCode() {
        String r02 = this.gopayAccount;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((r03 * 31) + Integer.hashCode(this.balance)) * 31) + Integer.hashCode(this.percentFee)) * 31) + Integer.hashCode(this.statusFee)) * 31) + Integer.hashCode(this.claimMinimum)) * 31) + Integer.hashCode(this.claimMaximum);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "TippingMyJarProfileResponseData(gopayAccount=" + this.gopayAccount + ", balance=" + this.balance + ", percentFee=" + this.percentFee + ", statusFee=" + this.statusFee + ", claimMinimum=" + this.claimMinimum + ", claimMaximum=" + this.claimMaximum + ')';
    }

    public /* synthetic */ TippingMyJarProfileResponseData(String r2, int r3, int r4, int r5, int r6, int r7, int r8, i r9) {
        if ((r8 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r8 & 8) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r8 & 16) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r8 & 32) == 0) goto L18;
        int r82 = 0;
    L17:
        int r72 = r6;
        int r62 = r5;
        this(r2, r3, r4, r62, r72, r82);
        return;
    L18:
        r82 = r7;
        goto L17
    }
}
