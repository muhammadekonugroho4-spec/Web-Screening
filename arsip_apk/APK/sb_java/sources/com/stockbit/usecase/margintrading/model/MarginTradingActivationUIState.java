package com.stockbit.usecase.margintrading.model;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006("}, d2 = {"Lcom/stockbit/usecase/margintrading/model/MarginTradingActivationUIState;", "Ljava/io/Serializable;", "minimalDepositRaw", "", "minimalDepositFormatted", "", "buyingPower", "holdingPeriod", "interestRate", "totalEquityRaw", "totalEquityFormatted", "isAbleToCreateMarginTrading", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V", "getMinimalDepositRaw", "()J", "getMinimalDepositFormatted", "()Ljava/lang/String;", "getBuyingPower", "getHoldingPeriod", "getInterestRate", "getTotalEquityRaw", "getTotalEquityFormatted", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "usecase-margintrading"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MarginTradingActivationUIState implements Serializable {
    private final String buyingPower;
    private final String holdingPeriod;
    private final String interestRate;
    private final boolean isAbleToCreateMarginTrading;
    private final String minimalDepositFormatted;
    private final long minimalDepositRaw;
    private final String totalEquityFormatted;
    private final long totalEquityRaw;

    public MarginTradingActivationUIState(long r2, String r4, String r5, String r6, String r7, long r8, String r10, boolean r11) {
        p.l(r4, "minimalDepositFormatted");
        p.l(r5, "buyingPower");
        p.l(r6, "holdingPeriod");
        p.l(r7, "interestRate");
        p.l(r10, "totalEquityFormatted");
        this.minimalDepositRaw = r2;
        this.minimalDepositFormatted = r4;
        this.buyingPower = r5;
        this.holdingPeriod = r6;
        this.interestRate = r7;
        this.totalEquityRaw = r8;
        this.totalEquityFormatted = r10;
        this.isAbleToCreateMarginTrading = r11;
    }

    public final String a() {
        return this.buyingPower;
    }

    public final String b() {
        return this.holdingPeriod;
    }

    public final String c() {
        return this.interestRate;
    }

    public final String d() {
        return this.minimalDepositFormatted;
    }

    public final long e() {
        return this.minimalDepositRaw;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MarginTradingActivationUIState) == true) goto L8;
        return false;
    L8:
        MarginTradingActivationUIState r82 = (MarginTradingActivationUIState) r8;
        if (this.minimalDepositRaw == r82.minimalDepositRaw) goto L12;
        return false;
    L12:
        if (p.g(this.minimalDepositFormatted, r82.minimalDepositFormatted) == true) goto L15;
        return false;
    L15:
        if (p.g(this.buyingPower, r82.buyingPower) == true) goto L18;
        return false;
    L18:
        if (p.g(this.holdingPeriod, r82.holdingPeriod) == true) goto L21;
        return false;
    L21:
        if (p.g(this.interestRate, r82.interestRate) == true) goto L24;
        return false;
    L24:
        if (this.totalEquityRaw == r82.totalEquityRaw) goto L27;
        return false;
    L27:
        if (p.g(this.totalEquityFormatted, r82.totalEquityFormatted) == true) goto L30;
        return false;
    L30:
        if (this.isAbleToCreateMarginTrading == r82.isAbleToCreateMarginTrading) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.totalEquityFormatted;
    }

    public final boolean g() {
        return this.isAbleToCreateMarginTrading;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.minimalDepositRaw) * 31) + this.minimalDepositFormatted.hashCode()) * 31) + this.buyingPower.hashCode()) * 31) + this.holdingPeriod.hashCode()) * 31) + this.interestRate.hashCode()) * 31) + Long.hashCode(this.totalEquityRaw)) * 31) + this.totalEquityFormatted.hashCode()) * 31) + Boolean.hashCode(this.isAbleToCreateMarginTrading);
    }

    public String toString() {
        return "MarginTradingActivationUIState(minimalDepositRaw=" + this.minimalDepositRaw + ", minimalDepositFormatted=" + this.minimalDepositFormatted + ", buyingPower=" + this.buyingPower + ", holdingPeriod=" + this.holdingPeriod + ", interestRate=" + this.interestRate + ", totalEquityRaw=" + this.totalEquityRaw + ", totalEquityFormatted=" + this.totalEquityFormatted + ", isAbleToCreateMarginTrading=" + this.isAbleToCreateMarginTrading + ")";
    }

    public /* synthetic */ MarginTradingActivationUIState(long r4, String r6, String r7, String r8, String r9, long r10, String r12, boolean r13, int r14, i r15) {
        if ((r14 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r6 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r7 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r8 = "";
    L15:
        if ((r14 & 16) == 0) goto L18;
        r9 = "";
    L18:
        if ((r14 & 32) == 0) goto L21;
        r10 = 0;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r12 = "";
    L24:
        if ((r14 & 128) == 0) goto L26;
        r13 = false;
    L26:
        long r11 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        long r5 = r4;
        this(r5, r72, r82, r92, r102, r11, r12, r13);
    }
}
