package com.stockbit.dto.calendar;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010=J\u0014\u0010>\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010@\u001a\u00020AHÖ\u0081\u0004J\n\u0010B\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006C"}, d2 = {"Lcom/stockbit/dto/calendar/CalendarDividendDTO;", "", "dividendId", "", "companyId", "companySymbol", "dividendCumDate", "dividendExDate", "dividendRecDate", "dividendPayDate", "dividendValue", "dividendDataHash", "dividendCreated", "dividendLock", "dividendLastUpdate", "lastPrice", "lastPriceFormatted", "corpActionActive", "", "eventNote", "dividendValueFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getDividendId", "()Ljava/lang/String;", "getCompanyId", "getCompanySymbol", "getDividendCumDate", "getDividendExDate", "getDividendRecDate", "getDividendPayDate", "getDividendValue", "getDividendDataHash", "getDividendCreated", "getDividendLock", "getDividendLastUpdate", "getLastPrice", "getLastPriceFormatted", "getCorpActionActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEventNote", "getDividendValueFormatted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/calendar/CalendarDividendDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CalendarDividendDTO {

    @SerializedName("company_id")
    private final String companyId;

    @SerializedName("company_symbol")
    private final String companySymbol;

    @SerializedName("corp_action_active")
    private final Boolean corpActionActive;

    @SerializedName("dividend_created")
    private final String dividendCreated;

    @SerializedName("dividend_cumdate")
    private final String dividendCumDate;

    @SerializedName("dividend_datahash")
    private final String dividendDataHash;

    @SerializedName("dividend_exdate")
    private final String dividendExDate;

    @SerializedName("dividend_id")
    private final String dividendId;

    @SerializedName("dividend_lastupdate")
    private final String dividendLastUpdate;

    @SerializedName("dividend_lock")
    private final String dividendLock;

    @SerializedName("dividend_paydate")
    private final String dividendPayDate;

    @SerializedName("dividend_recdate")
    private final String dividendRecDate;

    @SerializedName("dividend_value")
    private final String dividendValue;

    @SerializedName("dividend_value_formatted")
    private final String dividendValueFormatted;

    @SerializedName("event_note")
    private final String eventNote;

    @SerializedName("lastprice")
    private final String lastPrice;

    @SerializedName("lastprice_formatted")
    private final String lastPriceFormatted;

    public CalendarDividendDTO() {
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
        Boolean r15 = null;
        String r16 = null;
        String r17 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, 131071, null);
    }

    public final String a() {
        return this.companySymbol;
    }

    public final Boolean b() {
        return this.corpActionActive;
    }

    public final String c() {
        return this.dividendCumDate;
    }

    public final String d() {
        return this.dividendExDate;
    }

    public final String e() {
        return this.dividendPayDate;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CalendarDividendDTO) == true) goto L8;
        return false;
    L8:
        CalendarDividendDTO r52 = (CalendarDividendDTO) r5;
        if (p.g(this.dividendId, r52.dividendId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.companyId, r52.companyId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.companySymbol, r52.companySymbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.dividendCumDate, r52.dividendCumDate) == true) goto L21;
        return false;
    L21:
        if (p.g(this.dividendExDate, r52.dividendExDate) == true) goto L24;
        return false;
    L24:
        if (p.g(this.dividendRecDate, r52.dividendRecDate) == true) goto L27;
        return false;
    L27:
        if (p.g(this.dividendPayDate, r52.dividendPayDate) == true) goto L30;
        return false;
    L30:
        if (p.g(this.dividendValue, r52.dividendValue) == true) goto L33;
        return false;
    L33:
        if (p.g(this.dividendDataHash, r52.dividendDataHash) == true) goto L36;
        return false;
    L36:
        if (p.g(this.dividendCreated, r52.dividendCreated) == true) goto L39;
        return false;
    L39:
        if (p.g(this.dividendLock, r52.dividendLock) == true) goto L42;
        return false;
    L42:
        if (p.g(this.dividendLastUpdate, r52.dividendLastUpdate) == true) goto L45;
        return false;
    L45:
        if (p.g(this.lastPrice, r52.lastPrice) == true) goto L48;
        return false;
    L48:
        if (p.g(this.lastPriceFormatted, r52.lastPriceFormatted) == true) goto L51;
        return false;
    L51:
        if (p.g(this.corpActionActive, r52.corpActionActive) == true) goto L54;
        return false;
    L54:
        if (p.g(this.eventNote, r52.eventNote) == true) goto L57;
        return false;
    L57:
        if (p.g(this.dividendValueFormatted, r52.dividendValueFormatted) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public final String f() {
        return this.dividendRecDate;
    }

    public final String g() {
        return this.dividendValue;
    }

    public final String h() {
        return this.dividendValueFormatted;
    }

    public int hashCode() {
        String r02 = this.dividendId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.companyId;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.companySymbol;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.dividendCumDate;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.dividendExDate;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.dividendRecDate;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.dividendPayDate;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.dividendValue;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.dividendDataHash;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.dividendCreated;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.dividendLock;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.dividendLastUpdate;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.lastPrice;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.lastPriceFormatted;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        Boolean r227 = this.corpActionActive;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.eventNote;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.dividendValueFormatted;
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

    public final String i() {
        return this.eventNote;
    }

    public final String j() {
        return this.lastPriceFormatted;
    }

    public String toString() {
        return "CalendarDividendDTO(dividendId=" + this.dividendId + ", companyId=" + this.companyId + ", companySymbol=" + this.companySymbol + ", dividendCumDate=" + this.dividendCumDate + ", dividendExDate=" + this.dividendExDate + ", dividendRecDate=" + this.dividendRecDate + ", dividendPayDate=" + this.dividendPayDate + ", dividendValue=" + this.dividendValue + ", dividendDataHash=" + this.dividendDataHash + ", dividendCreated=" + this.dividendCreated + ", dividendLock=" + this.dividendLock + ", dividendLastUpdate=" + this.dividendLastUpdate + ", lastPrice=" + this.lastPrice + ", lastPriceFormatted=" + this.lastPriceFormatted + ", corpActionActive=" + this.corpActionActive + ", eventNote=" + this.eventNote + ", dividendValueFormatted=" + this.dividendValueFormatted + ")";
    }

    public CalendarDividendDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, Boolean r15, String r16, String r17) {
        this.dividendId = r1;
        this.companyId = r2;
        this.companySymbol = r3;
        this.dividendCumDate = r4;
        this.dividendExDate = r5;
        this.dividendRecDate = r6;
        this.dividendPayDate = r7;
        this.dividendValue = r8;
        this.dividendDataHash = r9;
        this.dividendCreated = r10;
        this.dividendLock = r11;
        this.dividendLastUpdate = r12;
        this.lastPrice = r13;
        this.lastPriceFormatted = r14;
        this.corpActionActive = r15;
        this.eventNote = r16;
        this.dividendValueFormatted = r17;
    }

    public /* synthetic */ CalendarDividendDTO(String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, Boolean r33, String r34, String r35, int r36, i r37) {
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
        Boolean r2 = null;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        String r16 = null;
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
