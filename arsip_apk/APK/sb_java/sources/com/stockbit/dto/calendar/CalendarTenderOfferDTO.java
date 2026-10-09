package com.stockbit.dto.calendar;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÂ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0014\u00108\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020;HÖ\u0081\u0004J\n\u0010<\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006="}, d2 = {"Lcom/stockbit/dto/calendar/CalendarTenderOfferDTO;", "", "tenderId", "", "companyId", "tenderPrice", "tenderShares", "tenderPercentage", "tenderStart", "tenderEnd", "tenderPaydate", "tenderCreated", "tenderDataHash", "companySymbol", "companyName", "corpActionActive", "", "eventNote", "tenderPriceFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getTenderId", "()Ljava/lang/String;", "getCompanyId", "getTenderPrice", "getTenderShares", "getTenderPercentage", "getTenderStart", "getTenderEnd", "getTenderPaydate", "getTenderCreated", "getTenderDataHash", "getCompanySymbol", "getCompanyName", "getCorpActionActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEventNote", "getTenderPriceFormatted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/calendar/CalendarTenderOfferDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CalendarTenderOfferDTO {

    @SerializedName("company_id")
    private final String companyId;

    @SerializedName("company_name")
    private final String companyName;

    @SerializedName("company_symbol")
    private final String companySymbol;

    @SerializedName("corp_action_active")
    private final Boolean corpActionActive;

    @SerializedName("event_note")
    private final String eventNote;

    @SerializedName("tender_created")
    private final String tenderCreated;

    @SerializedName("tender_datahash")
    private final String tenderDataHash;

    @SerializedName("tender_end")
    private final String tenderEnd;

    @SerializedName("tender_id")
    private final String tenderId;

    @SerializedName("tender_paydate")
    private final String tenderPaydate;

    @SerializedName("tender_percentage")
    private final String tenderPercentage;

    @SerializedName("tender_price")
    private final String tenderPrice;

    @SerializedName("tender_price_formatted")
    private final String tenderPriceFormatted;

    @SerializedName("tender_shares")
    private final String tenderShares;

    @SerializedName("tender_start")
    private final String tenderStart;

    public CalendarTenderOfferDTO() {
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
        Boolean r13 = null;
        String r14 = null;
        String r15 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, 32767, null);
    }

    public final String a() {
        return this.companyId;
    }

    public final String b() {
        return this.companyName;
    }

    public final String c() {
        return this.companySymbol;
    }

    public final Boolean d() {
        return this.corpActionActive;
    }

    public final String e() {
        return this.eventNote;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CalendarTenderOfferDTO) == true) goto L8;
        return false;
    L8:
        CalendarTenderOfferDTO r52 = (CalendarTenderOfferDTO) r5;
        if (p.g(this.tenderId, r52.tenderId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.companyId, r52.companyId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.tenderPrice, r52.tenderPrice) == true) goto L18;
        return false;
    L18:
        if (p.g(this.tenderShares, r52.tenderShares) == true) goto L21;
        return false;
    L21:
        if (p.g(this.tenderPercentage, r52.tenderPercentage) == true) goto L24;
        return false;
    L24:
        if (p.g(this.tenderStart, r52.tenderStart) == true) goto L27;
        return false;
    L27:
        if (p.g(this.tenderEnd, r52.tenderEnd) == true) goto L30;
        return false;
    L30:
        if (p.g(this.tenderPaydate, r52.tenderPaydate) == true) goto L33;
        return false;
    L33:
        if (p.g(this.tenderCreated, r52.tenderCreated) == true) goto L36;
        return false;
    L36:
        if (p.g(this.tenderDataHash, r52.tenderDataHash) == true) goto L39;
        return false;
    L39:
        if (p.g(this.companySymbol, r52.companySymbol) == true) goto L42;
        return false;
    L42:
        if (p.g(this.companyName, r52.companyName) == true) goto L45;
        return false;
    L45:
        if (p.g(this.corpActionActive, r52.corpActionActive) == true) goto L48;
        return false;
    L48:
        if (p.g(this.eventNote, r52.eventNote) == true) goto L51;
        return false;
    L51:
        if (p.g(this.tenderPriceFormatted, r52.tenderPriceFormatted) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.tenderCreated;
    }

    public final String g() {
        return this.tenderEnd;
    }

    public final String h() {
        return this.tenderId;
    }

    public int hashCode() {
        String r02 = this.tenderId;
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
        String r23 = this.tenderPrice;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.tenderShares;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.tenderPercentage;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.tenderStart;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.tenderEnd;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.tenderPaydate;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.tenderCreated;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.tenderDataHash;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.companySymbol;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.companyName;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        Boolean r223 = this.corpActionActive;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.eventNote;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.tenderPriceFormatted;
        if (r227 == null) goto L63;
        r1 = r227.hashCode();
    L63:
        return r017 + r1;
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
        return this.tenderPaydate;
    }

    public final String j() {
        return this.tenderPercentage;
    }

    public final String k() {
        return this.tenderPrice;
    }

    public final String l() {
        return this.tenderPriceFormatted;
    }

    public final String m() {
        return this.tenderShares;
    }

    public final String n() {
        return this.tenderStart;
    }

    public String toString() {
        return "CalendarTenderOfferDTO(tenderId=" + this.tenderId + ", companyId=" + this.companyId + ", tenderPrice=" + this.tenderPrice + ", tenderShares=" + this.tenderShares + ", tenderPercentage=" + this.tenderPercentage + ", tenderStart=" + this.tenderStart + ", tenderEnd=" + this.tenderEnd + ", tenderPaydate=" + this.tenderPaydate + ", tenderCreated=" + this.tenderCreated + ", tenderDataHash=" + this.tenderDataHash + ", companySymbol=" + this.companySymbol + ", companyName=" + this.companyName + ", corpActionActive=" + this.corpActionActive + ", eventNote=" + this.eventNote + ", tenderPriceFormatted=" + this.tenderPriceFormatted + ")";
    }

    public CalendarTenderOfferDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, Boolean r13, String r14, String r15) {
        this.tenderId = r1;
        this.companyId = r2;
        this.tenderPrice = r3;
        this.tenderShares = r4;
        this.tenderPercentage = r5;
        this.tenderStart = r6;
        this.tenderEnd = r7;
        this.tenderPaydate = r8;
        this.tenderCreated = r9;
        this.tenderDataHash = r10;
        this.companySymbol = r11;
        this.companyName = r12;
        this.corpActionActive = r13;
        this.eventNote = r14;
        this.tenderPriceFormatted = r15;
    }

    public /* synthetic */ CalendarTenderOfferDTO(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, Boolean r29, String r30, String r31, int r32, i r33) {
        if ((r32 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        Boolean r14 = null;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        String r322 = null;
    L63:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r322);
        return;
    L62:
        r322 = r31;
        goto L63
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
