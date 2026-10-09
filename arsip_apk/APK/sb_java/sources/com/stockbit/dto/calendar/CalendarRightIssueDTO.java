package com.stockbit.dto.calendar;

import com.clevertap.android.sdk.Constants;
import com.google.android.flexbox.FlexItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J®\u0002\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010RJ\u0014\u0010S\u001a\u00020\u00192\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010U\u001a\u00020VHÖ\u0081\u0004J\n\u0010W\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001f¨\u0006X"}, d2 = {"Lcom/stockbit/dto/calendar/CalendarRightIssueDTO;", "", "rightIssueId", "", "companyId", "companySymbol", "rightIssueCumDate", "rightIssueExDate", "rightIssueRatio", "rightIssueRecDate", "rightIssueTradingStart", "rightIssueTradingEnd", "rightIssueOld", "rightIssueNew", "rightIssueFactor", "rightIssuePriceFactor", "rightIssuePrice", "rightIssueSubDate", "rightIssueCreated", "rightIssueLock", "rightIssuePriceAdj", "rightIssueAdjFactor", "rightIssueLastUpdate", "rightIssueNewShare", "corpActionActive", "", "eventNote", "rightIssuePriceFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getRightIssueId", "()Ljava/lang/String;", "getCompanyId", "getCompanySymbol", "getRightIssueCumDate", "getRightIssueExDate", "getRightIssueRatio", "getRightIssueRecDate", "getRightIssueTradingStart", "getRightIssueTradingEnd", "getRightIssueOld", "getRightIssueNew", "getRightIssueFactor", "getRightIssuePriceFactor", "getRightIssuePrice", "getRightIssueSubDate", "getRightIssueCreated", "getRightIssueLock", "getRightIssuePriceAdj", "getRightIssueAdjFactor", "getRightIssueLastUpdate", "getRightIssueNewShare", "getCorpActionActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEventNote", "getRightIssuePriceFormatted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/calendar/CalendarRightIssueDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CalendarRightIssueDTO {

    @SerializedName("company_id")
    private final String companyId;

    @SerializedName("company_symbol")
    private final String companySymbol;

    @SerializedName("corp_action_active")
    private final Boolean corpActionActive;

    @SerializedName("event_note")
    private final String eventNote;

    @SerializedName("rightissue_adj_factor")
    private final String rightIssueAdjFactor;

    @SerializedName("rightissue_created")
    private final String rightIssueCreated;

    @SerializedName("rightissue_cumdate")
    private final String rightIssueCumDate;

    @SerializedName("rightissue_exdate")
    private final String rightIssueExDate;

    @SerializedName("rightissue_factor")
    private final String rightIssueFactor;

    @SerializedName("rightissue_id")
    private final String rightIssueId;

    @SerializedName("rightissue_lastupdate")
    private final String rightIssueLastUpdate;

    @SerializedName("rightissue_lock")
    private final String rightIssueLock;

    @SerializedName("rightissue_new")
    private final String rightIssueNew;

    @SerializedName("rightissue_new_share")
    private final String rightIssueNewShare;

    @SerializedName("rightissue_old")
    private final String rightIssueOld;

    @SerializedName("rightissue_price")
    private final String rightIssuePrice;

    @SerializedName("rightissue_price_adj")
    private final String rightIssuePriceAdj;

    @SerializedName("rightissue_price_factor")
    private final String rightIssuePriceFactor;

    @SerializedName("rightissue_price_formatted")
    private final String rightIssuePriceFormatted;

    @SerializedName("rightissue_ratio")
    private final String rightIssueRatio;

    @SerializedName("rightissue_recdate")
    private final String rightIssueRecDate;

    @SerializedName("rightissue_subdate")
    private final String rightIssueSubDate;

    @SerializedName("rightissue_trading_end")
    private final String rightIssueTradingEnd;

    @SerializedName("rightissue_trading_start")
    private final String rightIssueTradingStart;

    public CalendarRightIssueDTO() {
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
        String r16 = null;
        String r17 = null;
        String r18 = null;
        String r19 = null;
        String r20 = null;
        String r21 = null;
        Boolean r22 = null;
        String r23 = null;
        String r24 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, FlexItem.MAX_SIZE, null);
    }

    public final String a() {
        return this.companyId;
    }

    public final String b() {
        return this.companySymbol;
    }

    public final Boolean c() {
        return this.corpActionActive;
    }

    public final String d() {
        return this.eventNote;
    }

    public final String e() {
        return this.rightIssueAdjFactor;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CalendarRightIssueDTO) == true) goto L8;
        return false;
    L8:
        CalendarRightIssueDTO r52 = (CalendarRightIssueDTO) r5;
        if (p.g(this.rightIssueId, r52.rightIssueId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.companyId, r52.companyId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.companySymbol, r52.companySymbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.rightIssueCumDate, r52.rightIssueCumDate) == true) goto L21;
        return false;
    L21:
        if (p.g(this.rightIssueExDate, r52.rightIssueExDate) == true) goto L24;
        return false;
    L24:
        if (p.g(this.rightIssueRatio, r52.rightIssueRatio) == true) goto L27;
        return false;
    L27:
        if (p.g(this.rightIssueRecDate, r52.rightIssueRecDate) == true) goto L30;
        return false;
    L30:
        if (p.g(this.rightIssueTradingStart, r52.rightIssueTradingStart) == true) goto L33;
        return false;
    L33:
        if (p.g(this.rightIssueTradingEnd, r52.rightIssueTradingEnd) == true) goto L36;
        return false;
    L36:
        if (p.g(this.rightIssueOld, r52.rightIssueOld) == true) goto L39;
        return false;
    L39:
        if (p.g(this.rightIssueNew, r52.rightIssueNew) == true) goto L42;
        return false;
    L42:
        if (p.g(this.rightIssueFactor, r52.rightIssueFactor) == true) goto L45;
        return false;
    L45:
        if (p.g(this.rightIssuePriceFactor, r52.rightIssuePriceFactor) == true) goto L48;
        return false;
    L48:
        if (p.g(this.rightIssuePrice, r52.rightIssuePrice) == true) goto L51;
        return false;
    L51:
        if (p.g(this.rightIssueSubDate, r52.rightIssueSubDate) == true) goto L54;
        return false;
    L54:
        if (p.g(this.rightIssueCreated, r52.rightIssueCreated) == true) goto L57;
        return false;
    L57:
        if (p.g(this.rightIssueLock, r52.rightIssueLock) == true) goto L60;
        return false;
    L60:
        if (p.g(this.rightIssuePriceAdj, r52.rightIssuePriceAdj) == true) goto L63;
        return false;
    L63:
        if (p.g(this.rightIssueAdjFactor, r52.rightIssueAdjFactor) == true) goto L66;
        return false;
    L66:
        if (p.g(this.rightIssueLastUpdate, r52.rightIssueLastUpdate) == true) goto L69;
        return false;
    L69:
        if (p.g(this.rightIssueNewShare, r52.rightIssueNewShare) == true) goto L72;
        return false;
    L72:
        if (p.g(this.corpActionActive, r52.corpActionActive) == true) goto L75;
        return false;
    L75:
        if (p.g(this.eventNote, r52.eventNote) == true) goto L78;
        return false;
    L78:
        if (p.g(this.rightIssuePriceFormatted, r52.rightIssuePriceFormatted) == true) goto L80;
        return false;
    L80:
        return true;
    }

    public final String f() {
        return this.rightIssueCreated;
    }

    public final String g() {
        return this.rightIssueCumDate;
    }

    public final String h() {
        return this.rightIssueExDate;
    }

    public int hashCode() {
        String r02 = this.rightIssueId;
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
        String r25 = this.rightIssueCumDate;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.rightIssueExDate;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.rightIssueRatio;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.rightIssueRecDate;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.rightIssueTradingStart;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.rightIssueTradingEnd;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.rightIssueOld;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.rightIssueNew;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.rightIssueFactor;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.rightIssuePriceFactor;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.rightIssuePrice;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.rightIssueSubDate;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.rightIssueCreated;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.rightIssueLock;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        String r233 = this.rightIssuePriceAdj;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        String r235 = this.rightIssueAdjFactor;
        if (r235 != null) goto L77;
        int r236 = 0;
    L78:
        int r022 = (r021 + r236) * 31;
        String r237 = this.rightIssueLastUpdate;
        if (r237 != null) goto L81;
        int r238 = 0;
    L82:
        int r023 = (r022 + r238) * 31;
        String r239 = this.rightIssueNewShare;
        if (r239 != null) goto L85;
        int r240 = 0;
    L86:
        int r024 = (r023 + r240) * 31;
        Boolean r241 = this.corpActionActive;
        if (r241 != null) goto L89;
        int r242 = 0;
    L90:
        int r025 = (r024 + r242) * 31;
        String r243 = this.eventNote;
        if (r243 != null) goto L93;
        int r244 = 0;
    L94:
        int r026 = (r025 + r244) * 31;
        String r245 = this.rightIssuePriceFormatted;
        if (r245 == null) goto L99;
        r1 = r245.hashCode();
    L99:
        return r026 + r1;
    L93:
        r244 = r243.hashCode();
        goto L94
    L89:
        r242 = r241.hashCode();
        goto L90
    L85:
        r240 = r239.hashCode();
        goto L86
    L81:
        r238 = r237.hashCode();
        goto L82
    L77:
        r236 = r235.hashCode();
        goto L78
    L73:
        r234 = r233.hashCode();
        goto L74
    L69:
        r232 = r231.hashCode();
        goto L70
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
        return this.rightIssueFactor;
    }

    public final String j() {
        return this.rightIssueId;
    }

    public final String k() {
        return this.rightIssueLastUpdate;
    }

    public final String l() {
        return this.rightIssueNew;
    }

    public final String m() {
        return this.rightIssueNewShare;
    }

    public final String n() {
        return this.rightIssueOld;
    }

    public final String o() {
        return this.rightIssuePrice;
    }

    public final String p() {
        return this.rightIssuePriceAdj;
    }

    public final String q() {
        return this.rightIssuePriceFactor;
    }

    public final String r() {
        return this.rightIssuePriceFormatted;
    }

    public final String s() {
        return this.rightIssueRatio;
    }

    public final String t() {
        return this.rightIssueRecDate;
    }

    public String toString() {
        return "CalendarRightIssueDTO(rightIssueId=" + this.rightIssueId + ", companyId=" + this.companyId + ", companySymbol=" + this.companySymbol + ", rightIssueCumDate=" + this.rightIssueCumDate + ", rightIssueExDate=" + this.rightIssueExDate + ", rightIssueRatio=" + this.rightIssueRatio + ", rightIssueRecDate=" + this.rightIssueRecDate + ", rightIssueTradingStart=" + this.rightIssueTradingStart + ", rightIssueTradingEnd=" + this.rightIssueTradingEnd + ", rightIssueOld=" + this.rightIssueOld + ", rightIssueNew=" + this.rightIssueNew + ", rightIssueFactor=" + this.rightIssueFactor + ", rightIssuePriceFactor=" + this.rightIssuePriceFactor + ", rightIssuePrice=" + this.rightIssuePrice + ", rightIssueSubDate=" + this.rightIssueSubDate + ", rightIssueCreated=" + this.rightIssueCreated + ", rightIssueLock=" + this.rightIssueLock + ", rightIssuePriceAdj=" + this.rightIssuePriceAdj + ", rightIssueAdjFactor=" + this.rightIssueAdjFactor + ", rightIssueLastUpdate=" + this.rightIssueLastUpdate + ", rightIssueNewShare=" + this.rightIssueNewShare + ", corpActionActive=" + this.corpActionActive + ", eventNote=" + this.eventNote + ", rightIssuePriceFormatted=" + this.rightIssuePriceFormatted + ")";
    }

    public final String u() {
        return this.rightIssueSubDate;
    }

    public final String v() {
        return this.rightIssueTradingEnd;
    }

    public final String w() {
        return this.rightIssueTradingStart;
    }

    public CalendarRightIssueDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, Boolean r22, String r23, String r24) {
        this.rightIssueId = r1;
        this.companyId = r2;
        this.companySymbol = r3;
        this.rightIssueCumDate = r4;
        this.rightIssueExDate = r5;
        this.rightIssueRatio = r6;
        this.rightIssueRecDate = r7;
        this.rightIssueTradingStart = r8;
        this.rightIssueTradingEnd = r9;
        this.rightIssueOld = r10;
        this.rightIssueNew = r11;
        this.rightIssueFactor = r12;
        this.rightIssuePriceFactor = r13;
        this.rightIssuePrice = r14;
        this.rightIssueSubDate = r15;
        this.rightIssueCreated = r16;
        this.rightIssueLock = r17;
        this.rightIssuePriceAdj = r18;
        this.rightIssueAdjFactor = r19;
        this.rightIssueLastUpdate = r20;
        this.rightIssueNewShare = r21;
        this.corpActionActive = r22;
        this.eventNote = r23;
        this.rightIssuePriceFormatted = r24;
    }

    public /* synthetic */ CalendarRightIssueDTO(String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, String r39, String r40, String r41, String r42, String r43, String r44, String r45, String r46, Boolean r47, String r48, String r49, int r50, i r51) {
        if ((r50 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r50 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r50 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r50 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r50 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r50 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r50 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r50 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r50 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r50 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r50 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r50 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r50 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r50 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r50 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r50 & 32768) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r50 & 65536) == 0) goto L69;
        String r17 = null;
    L71:
        if ((r50 & 131072) == 0) goto L73;
        String r18 = null;
    L75:
        if ((r50 & 262144) == 0) goto L77;
        String r19 = null;
    L79:
        if ((r50 & 524288) == 0) goto L81;
        String r20 = null;
    L83:
        if ((r50 & 1048576) == 0) goto L85;
        String r21 = null;
    L87:
        if ((r50 & 2097152) == 0) goto L89;
        Boolean r22 = null;
    L91:
        if ((r50 & 4194304) == 0) goto L93;
        String r23 = null;
    L95:
        if ((r50 & 8388608) == 0) goto L98;
        String r502 = null;
    L99:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r21, r22, r23, r502);
        return;
    L98:
        r502 = r49;
        goto L99
    L93:
        r23 = r48;
        goto L95
    L89:
        r22 = r47;
        goto L91
    L85:
        r21 = r46;
        goto L87
    L81:
        r20 = r45;
        goto L83
    L77:
        r19 = r44;
        goto L79
    L73:
        r18 = r43;
        goto L75
    L69:
        r17 = r42;
        goto L71
    L65:
        r16 = r41;
        goto L67
    L61:
        r2 = r40;
        goto L63
    L57:
        r15 = r39;
        goto L59
    L53:
        r14 = r38;
        goto L55
    L49:
        r13 = r37;
        goto L51
    L45:
        r12 = r36;
        goto L47
    L41:
        r11 = r35;
        goto L43
    L37:
        r10 = r34;
        goto L39
    L33:
        r9 = r33;
        goto L35
    L29:
        r8 = r32;
        goto L31
    L25:
        r7 = r31;
        goto L27
    L21:
        r6 = r30;
        goto L23
    L17:
        r5 = r29;
        goto L19
    L13:
        r4 = r28;
        goto L15
    L9:
        r3 = r27;
        goto L11
    L5:
        r1 = r26;
        goto L7
    }
}
