package com.stockbit.datasource.param.orderqueue;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006<"}, d2 = {"Lcom/stockbit/datasource/param/orderqueue/GetOrderQueueDataParam;", "", "symbol", "", FirebaseAnalytics.Param.PRICE, "", "firstExchangeOrderNumber", "lastExchangeOrderNumber", "searchExchangeOrderNumber", "jumpExchangeOrderNumber", "actionType", "orderStatus", "boardType", "sortBy", "sortDirection", Constants.KEY_LIMIT, "", "timeStart", "timeEnd", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getPrice", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFirstExchangeOrderNumber", "getLastExchangeOrderNumber", "getSearchExchangeOrderNumber", "getJumpExchangeOrderNumber", "getActionType", "getOrderStatus", "getBoardType", "getSortBy", "getSortDirection", "getLimit", "()I", "getTimeStart", "getTimeEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/stockbit/datasource/param/orderqueue/GetOrderQueueDataParam;", "equals", "", "other", "hashCode", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetOrderQueueDataParam {

    @SerializedName("action_type")
    private final String actionType;

    @SerializedName("board_type")
    private final String boardType;

    @SerializedName("first_exchange_order_number")
    private final String firstExchangeOrderNumber;

    @SerializedName("jump_exchange_order_number")
    private final String jumpExchangeOrderNumber;

    @SerializedName("last_exchange_order_number")
    private final String lastExchangeOrderNumber;

    @SerializedName(Constants.KEY_LIMIT)
    private final int limit;

    @SerializedName("order_status")
    private final String orderStatus;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final Float price;

    @SerializedName("search_exchange_order_number")
    private final String searchExchangeOrderNumber;

    @SerializedName("sort_by")
    private final String sortBy;

    @SerializedName("sort_direction")
    private final String sortDirection;

    @SerializedName("stock_code")
    private final String symbol;

    @SerializedName("filter_time.end")
    private final String timeEnd;

    @SerializedName("filter_time.start")
    private final String timeStart;

    public GetOrderQueueDataParam(String r2, Float r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, String r14, String r15) {
        p.l(r2, "symbol");
        p.l(r8, "actionType");
        p.l(r9, "orderStatus");
        p.l(r10, "boardType");
        p.l(r12, "sortDirection");
        this.symbol = r2;
        this.price = r3;
        this.firstExchangeOrderNumber = r4;
        this.lastExchangeOrderNumber = r5;
        this.searchExchangeOrderNumber = r6;
        this.jumpExchangeOrderNumber = r7;
        this.actionType = r8;
        this.orderStatus = r9;
        this.boardType = r10;
        this.sortBy = r11;
        this.sortDirection = r12;
        this.limit = r13;
        this.timeStart = r14;
        this.timeEnd = r15;
    }

    public final String a() {
        return this.actionType;
    }

    public final String b() {
        return this.boardType;
    }

    public final String c() {
        return this.firstExchangeOrderNumber;
    }

    public final String d() {
        return this.jumpExchangeOrderNumber;
    }

    public final String e() {
        return this.lastExchangeOrderNumber;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GetOrderQueueDataParam) == true) goto L8;
        return false;
    L8:
        GetOrderQueueDataParam r52 = (GetOrderQueueDataParam) r5;
        if (p.g(this.symbol, r52.symbol) == true) goto L12;
        return false;
    L12:
        if (p.g(this.price, r52.price) == true) goto L15;
        return false;
    L15:
        if (p.g(this.firstExchangeOrderNumber, r52.firstExchangeOrderNumber) == true) goto L18;
        return false;
    L18:
        if (p.g(this.lastExchangeOrderNumber, r52.lastExchangeOrderNumber) == true) goto L21;
        return false;
    L21:
        if (p.g(this.searchExchangeOrderNumber, r52.searchExchangeOrderNumber) == true) goto L24;
        return false;
    L24:
        if (p.g(this.jumpExchangeOrderNumber, r52.jumpExchangeOrderNumber) == true) goto L27;
        return false;
    L27:
        if (p.g(this.actionType, r52.actionType) == true) goto L30;
        return false;
    L30:
        if (p.g(this.orderStatus, r52.orderStatus) == true) goto L33;
        return false;
    L33:
        if (p.g(this.boardType, r52.boardType) == true) goto L36;
        return false;
    L36:
        if (p.g(this.sortBy, r52.sortBy) == true) goto L39;
        return false;
    L39:
        if (p.g(this.sortDirection, r52.sortDirection) == true) goto L42;
        return false;
    L42:
        if (this.limit == r52.limit) goto L45;
        return false;
    L45:
        if (p.g(this.timeStart, r52.timeStart) == true) goto L48;
        return false;
    L48:
        if (p.g(this.timeEnd, r52.timeEnd) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final int f() {
        return this.limit;
    }

    public final String g() {
        return this.orderStatus;
    }

    public final Float h() {
        return this.price;
    }

    public int hashCode() {
        int r02 = this.symbol.hashCode() * 31;
        Float r1 = this.price;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.firstExchangeOrderNumber;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.lastExchangeOrderNumber;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.searchExchangeOrderNumber;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.jumpExchangeOrderNumber;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (((((((r06 + r110) * 31) + this.actionType.hashCode()) * 31) + this.orderStatus.hashCode()) * 31) + this.boardType.hashCode()) * 31;
        String r111 = this.sortBy;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (((((r07 + r112) * 31) + this.sortDirection.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31;
        String r113 = this.timeStart;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.timeEnd;
        if (r115 == null) goto L35;
        r2 = r115.hashCode();
    L35:
        return r09 + r2;
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.searchExchangeOrderNumber;
    }

    public final String j() {
        return this.sortBy;
    }

    public final String k() {
        return this.sortDirection;
    }

    public final String l() {
        return this.symbol;
    }

    public final String m() {
        return this.timeEnd;
    }

    public final String n() {
        return this.timeStart;
    }

    public String toString() {
        return "GetOrderQueueDataParam(symbol=" + this.symbol + ", price=" + this.price + ", firstExchangeOrderNumber=" + this.firstExchangeOrderNumber + ", lastExchangeOrderNumber=" + this.lastExchangeOrderNumber + ", searchExchangeOrderNumber=" + this.searchExchangeOrderNumber + ", jumpExchangeOrderNumber=" + this.jumpExchangeOrderNumber + ", actionType=" + this.actionType + ", orderStatus=" + this.orderStatus + ", boardType=" + this.boardType + ", sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ", limit=" + this.limit + ", timeStart=" + this.timeStart + ", timeEnd=" + this.timeEnd + ")";
    }
}
