package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010PJ\u0014\u0010Q\u001a\u00020\u00132\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010S\u001a\u00020THÖ\u0081\u0004J\n\u0010U\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001a¨\u0006V"}, d2 = {"Lcom/stockbit/model/entity/ReverseSplit;", "", "stockSplitId", "", "companyid", "companySymbol", "stockSplitCumDate", "stockSplitExDate", "stockSplitRatio", "stockSplitRecDate", "stockSplitNew", "stockSplitOld", "stockSplitFactor", "stockSplitLock", "stockSplitCreated", "stockSplitNewShare", "stockSplitNewPrice", "stockSplitLastUpdate", "corpActionActive", "", "eventNote", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getStockSplitId", "()Ljava/lang/String;", "setStockSplitId", "(Ljava/lang/String;)V", "getCompanyid", "setCompanyid", "getCompanySymbol", "setCompanySymbol", "getStockSplitCumDate", "setStockSplitCumDate", "getStockSplitExDate", "setStockSplitExDate", "getStockSplitRatio", "setStockSplitRatio", "getStockSplitRecDate", "setStockSplitRecDate", "getStockSplitNew", "setStockSplitNew", "getStockSplitOld", "setStockSplitOld", "getStockSplitFactor", "setStockSplitFactor", "getStockSplitLock", "setStockSplitLock", "getStockSplitCreated", "setStockSplitCreated", "getStockSplitNewShare", "setStockSplitNewShare", "getStockSplitNewPrice", "setStockSplitNewPrice", "getStockSplitLastUpdate", "setStockSplitLastUpdate", "getCorpActionActive", "()Ljava/lang/Boolean;", "setCorpActionActive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEventNote", "setEventNote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stockbit/model/entity/ReverseSplit;", "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReverseSplit {

    @SerializedName("company_symbol")
    private String companySymbol;

    @SerializedName("company_id")
    private String companyid;

    @SerializedName("corp_action_active")
    private Boolean corpActionActive;

    @SerializedName("event_note")
    private String eventNote;

    @SerializedName("stocksplit_created")
    private String stockSplitCreated;

    @SerializedName("stocksplit_cumdate")
    private String stockSplitCumDate;

    @SerializedName("stocksplit_exdate")
    private String stockSplitExDate;

    @SerializedName("stocksplit_factor")
    private String stockSplitFactor;

    @SerializedName("stocksplit_id")
    private String stockSplitId;

    @SerializedName("stocksplit_lastupdate")
    private String stockSplitLastUpdate;

    @SerializedName("stocksplit_lock")
    private String stockSplitLock;

    @SerializedName("stocksplit_new")
    private String stockSplitNew;

    @SerializedName("stocksplit_new_price")
    private String stockSplitNewPrice;

    @SerializedName("stocksplit_new_share")
    private String stockSplitNewShare;

    @SerializedName("stocksplit_old")
    private String stockSplitOld;

    @SerializedName("stocksplit_ratio")
    private String stockSplitRatio;

    @SerializedName("stocksplit_recdate")
    private String stockSplitRecDate;

    public ReverseSplit() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        Boolean r16 = null;
        String r17 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, 131071, null);
    }

    public final String a() {
        return this.companySymbol;
    }

    public final String b() {
        return this.stockSplitCumDate;
    }

    public final String c() {
        return this.stockSplitExDate;
    }

    public final String d() {
        return this.stockSplitFactor;
    }

    public final String e() {
        return this.stockSplitRatio;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReverseSplit) == true) goto L8;
        return false;
    L8:
        ReverseSplit r52 = (ReverseSplit) r5;
        if (p.g(this.stockSplitId, r52.stockSplitId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.companyid, r52.companyid) == true) goto L15;
        return false;
    L15:
        if (p.g(this.companySymbol, r52.companySymbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.stockSplitCumDate, r52.stockSplitCumDate) == true) goto L21;
        return false;
    L21:
        if (p.g(this.stockSplitExDate, r52.stockSplitExDate) == true) goto L24;
        return false;
    L24:
        if (p.g(this.stockSplitRatio, r52.stockSplitRatio) == true) goto L27;
        return false;
    L27:
        if (p.g(this.stockSplitRecDate, r52.stockSplitRecDate) == true) goto L30;
        return false;
    L30:
        if (p.g(this.stockSplitNew, r52.stockSplitNew) == true) goto L33;
        return false;
    L33:
        if (p.g(this.stockSplitOld, r52.stockSplitOld) == true) goto L36;
        return false;
    L36:
        if (p.g(this.stockSplitFactor, r52.stockSplitFactor) == true) goto L39;
        return false;
    L39:
        if (p.g(this.stockSplitLock, r52.stockSplitLock) == true) goto L42;
        return false;
    L42:
        if (p.g(this.stockSplitCreated, r52.stockSplitCreated) == true) goto L45;
        return false;
    L45:
        if (p.g(this.stockSplitNewShare, r52.stockSplitNewShare) == true) goto L48;
        return false;
    L48:
        if (p.g(this.stockSplitNewPrice, r52.stockSplitNewPrice) == true) goto L51;
        return false;
    L51:
        if (p.g(this.stockSplitLastUpdate, r52.stockSplitLastUpdate) == true) goto L54;
        return false;
    L54:
        if (p.g(this.corpActionActive, r52.corpActionActive) == true) goto L57;
        return false;
    L57:
        if (p.g(this.eventNote, r52.eventNote) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public final String f() {
        return this.stockSplitRecDate;
    }

    public int hashCode() {
        String r02 = this.stockSplitId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.companyid;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.companySymbol;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.stockSplitCumDate;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.stockSplitExDate;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.stockSplitRatio;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.stockSplitRecDate;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.stockSplitNew;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.stockSplitOld;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.stockSplitFactor;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.stockSplitLock;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.stockSplitCreated;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.stockSplitNewShare;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.stockSplitNewPrice;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.stockSplitLastUpdate;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        Boolean r229 = this.corpActionActive;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.eventNote;
        if (r231 == null) goto L71;
        r1 = r231.hashCode();
    L71:
        return r019 + r1;
    L65:
        r230 = r229.hashCode();
        goto L66
    L61:
        r228 = r227.hashCode();
        goto L62
    L57:
        r226 = r225.hashCode();
        goto L58
    L53:
        r224 = r223.hashCode();
        goto L54
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ReverseSplit(stockSplitId=" + this.stockSplitId + ", companyid=" + this.companyid + ", companySymbol=" + this.companySymbol + ", stockSplitCumDate=" + this.stockSplitCumDate + ", stockSplitExDate=" + this.stockSplitExDate + ", stockSplitRatio=" + this.stockSplitRatio + ", stockSplitRecDate=" + this.stockSplitRecDate + ", stockSplitNew=" + this.stockSplitNew + ", stockSplitOld=" + this.stockSplitOld + ", stockSplitFactor=" + this.stockSplitFactor + ", stockSplitLock=" + this.stockSplitLock + ", stockSplitCreated=" + this.stockSplitCreated + ", stockSplitNewShare=" + this.stockSplitNewShare + ", stockSplitNewPrice=" + this.stockSplitNewPrice + ", stockSplitLastUpdate=" + this.stockSplitLastUpdate + ", corpActionActive=" + this.corpActionActive + ", eventNote=" + this.eventNote + ')';
    }

    public ReverseSplit(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, Boolean r16, String r17) {
        this.stockSplitId = r1;
        this.companyid = r2;
        this.companySymbol = r3;
        this.stockSplitCumDate = r4;
        this.stockSplitExDate = r5;
        this.stockSplitRatio = r6;
        this.stockSplitRecDate = r7;
        this.stockSplitNew = r8;
        this.stockSplitOld = r9;
        this.stockSplitFactor = r10;
        this.stockSplitLock = r11;
        this.stockSplitCreated = r12;
        this.stockSplitNewShare = r13;
        this.stockSplitNewPrice = r14;
        this.stockSplitLastUpdate = r15;
        this.corpActionActive = r16;
        this.eventNote = r17;
    }

    public /* synthetic */ ReverseSplit(String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, Boolean r34, String r35, int r36, i r37) {
        if ((r36 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r36 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r36 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r36 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r36 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r36 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r36 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r36 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r36 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        Boolean r16 = null;
    L67:
        if ((r36 & 65536) == 0) goto L70;
        String r362 = null;
    L71:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r362);
        return;
    L70:
        r362 = r35;
        goto L71
    L65:
        r16 = r34;
        goto L67
    L61:
        r2 = r33;
        goto L63
    L57:
        r15 = r32;
        goto L59
    L53:
        r14 = r31;
        goto L55
    L49:
        r13 = r30;
        goto L51
    L45:
        r12 = r29;
        goto L47
    L41:
        r11 = r28;
        goto L43
    L37:
        r10 = r27;
        goto L39
    L33:
        r9 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L23
    L17:
        r5 = r22;
        goto L19
    L13:
        r4 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
