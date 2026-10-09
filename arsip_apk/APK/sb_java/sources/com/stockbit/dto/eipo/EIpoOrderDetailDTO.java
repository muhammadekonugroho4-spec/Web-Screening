package com.stockbit.dto.eipo;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010F\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jþ\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010M\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010N\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c¨\u0006O"}, d2 = {"Lcom/stockbit/dto/eipo/EIpoOrderDetailDTO;", "", "orderId", "", FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.PRICE, "total", "stageDisplay", "statusDisplay", "orderDate", "origin", "orderType", "orderTypeDisplay", "offeringQuantity", "allotmentPercentage", "", "stage", "orderStage", "orderStageDisplay", NotificationCompat.CATEGORY_STATUS, "originDisplay", "warrant", "", "allotmentPercentageDecimal", "eipoBrokerPortalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getQuantity", "getPrice", "getTotal", "getStageDisplay", "getStatusDisplay", "getOrderDate", "getOrigin", "getOrderType", "getOrderTypeDisplay", "getOfferingQuantity", "getAllotmentPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStage", "getOrderStage", "getOrderStageDisplay", "getStatus", "getOriginDisplay", "getWarrant", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAllotmentPercentageDecimal", "getEipoBrokerPortalId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/dto/eipo/EIpoOrderDetailDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EIpoOrderDetailDTO {

    @SerializedName("allotment_percentage")
    private final Integer allotmentPercentage;

    @SerializedName("allotment_percentage_decimal")
    private final Double allotmentPercentageDecimal;

    @SerializedName("eipo_broker_portal_id")
    private final String eipoBrokerPortalId;

    @SerializedName("offering_quantity")
    private final String offeringQuantity;

    @SerializedName("order_date")
    private final String orderDate;

    @SerializedName("order_id")
    private final String orderId;

    @SerializedName("order_stage")
    private final String orderStage;

    @SerializedName("order_stage_display")
    private final String orderStageDisplay;

    @SerializedName("order_type")
    private final String orderType;

    @SerializedName("order_type_display")
    private final String orderTypeDisplay;

    @SerializedName("origin")
    private final String origin;

    @SerializedName("origin_display")
    private final String originDisplay;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final String quantity;

    @SerializedName("stage")
    private final String stage;

    @SerializedName("stage_display")
    private final String stageDisplay;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("status_display")
    private final String statusDisplay;

    @SerializedName("total")
    private final String total;

    @SerializedName("warrant")
    private final Double warrant;

    public EIpoOrderDetailDTO() {
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
        Integer r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        Double r18 = null;
        Double r19 = null;
        String r20 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, 1048575, null);
    }

    public final Integer a() {
        return this.allotmentPercentage;
    }

    public final Double b() {
        return this.allotmentPercentageDecimal;
    }

    public final String c() {
        return this.eipoBrokerPortalId;
    }

    public final String d() {
        return this.offeringQuantity;
    }

    public final String e() {
        return this.orderDate;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof EIpoOrderDetailDTO) == true) goto L8;
        return false;
    L8:
        EIpoOrderDetailDTO r52 = (EIpoOrderDetailDTO) r5;
        if (p.g(this.orderId, r52.orderId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.quantity, r52.quantity) == true) goto L15;
        return false;
    L15:
        if (p.g(this.price, r52.price) == true) goto L18;
        return false;
    L18:
        if (p.g(this.total, r52.total) == true) goto L21;
        return false;
    L21:
        if (p.g(this.stageDisplay, r52.stageDisplay) == true) goto L24;
        return false;
    L24:
        if (p.g(this.statusDisplay, r52.statusDisplay) == true) goto L27;
        return false;
    L27:
        if (p.g(this.orderDate, r52.orderDate) == true) goto L30;
        return false;
    L30:
        if (p.g(this.origin, r52.origin) == true) goto L33;
        return false;
    L33:
        if (p.g(this.orderType, r52.orderType) == true) goto L36;
        return false;
    L36:
        if (p.g(this.orderTypeDisplay, r52.orderTypeDisplay) == true) goto L39;
        return false;
    L39:
        if (p.g(this.offeringQuantity, r52.offeringQuantity) == true) goto L42;
        return false;
    L42:
        if (p.g(this.allotmentPercentage, r52.allotmentPercentage) == true) goto L45;
        return false;
    L45:
        if (p.g(this.stage, r52.stage) == true) goto L48;
        return false;
    L48:
        if (p.g(this.orderStage, r52.orderStage) == true) goto L51;
        return false;
    L51:
        if (p.g(this.orderStageDisplay, r52.orderStageDisplay) == true) goto L54;
        return false;
    L54:
        if (p.g(this.status, r52.status) == true) goto L57;
        return false;
    L57:
        if (p.g(this.originDisplay, r52.originDisplay) == true) goto L60;
        return false;
    L60:
        if (p.g(this.warrant, r52.warrant) == true) goto L63;
        return false;
    L63:
        if (p.g(this.allotmentPercentageDecimal, r52.allotmentPercentageDecimal) == true) goto L66;
        return false;
    L66:
        if (p.g(this.eipoBrokerPortalId, r52.eipoBrokerPortalId) == true) goto L68;
        return false;
    L68:
        return true;
    }

    public final String f() {
        return this.orderId;
    }

    public final String g() {
        return this.orderStage;
    }

    public final String h() {
        return this.orderStageDisplay;
    }

    public int hashCode() {
        String r02 = this.orderId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.quantity;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.price;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.total;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.stageDisplay;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.statusDisplay;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.orderDate;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.origin;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.orderType;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.orderTypeDisplay;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.offeringQuantity;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        Integer r221 = this.allotmentPercentage;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.stage;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.orderStage;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.orderStageDisplay;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.status;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.originDisplay;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        Double r233 = this.warrant;
        if (r233 != null) goto L73;
        int r234 = 0;
    L74:
        int r021 = (r020 + r234) * 31;
        Double r235 = this.allotmentPercentageDecimal;
        if (r235 != null) goto L77;
        int r236 = 0;
    L78:
        int r022 = (r021 + r236) * 31;
        String r237 = this.eipoBrokerPortalId;
        if (r237 == null) goto L83;
        r1 = r237.hashCode();
    L83:
        return r022 + r1;
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
        return this.orderType;
    }

    public final String j() {
        return this.orderTypeDisplay;
    }

    public final String k() {
        return this.origin;
    }

    public final String l() {
        return this.originDisplay;
    }

    public final String m() {
        return this.price;
    }

    public final String n() {
        return this.quantity;
    }

    public final String o() {
        return this.stage;
    }

    public final String p() {
        return this.stageDisplay;
    }

    public final String q() {
        return this.status;
    }

    public final String r() {
        return this.statusDisplay;
    }

    public final String s() {
        return this.total;
    }

    public final Double t() {
        return this.warrant;
    }

    public String toString() {
        return "EIpoOrderDetailDTO(orderId=" + this.orderId + ", quantity=" + this.quantity + ", price=" + this.price + ", total=" + this.total + ", stageDisplay=" + this.stageDisplay + ", statusDisplay=" + this.statusDisplay + ", orderDate=" + this.orderDate + ", origin=" + this.origin + ", orderType=" + this.orderType + ", orderTypeDisplay=" + this.orderTypeDisplay + ", offeringQuantity=" + this.offeringQuantity + ", allotmentPercentage=" + this.allotmentPercentage + ", stage=" + this.stage + ", orderStage=" + this.orderStage + ", orderStageDisplay=" + this.orderStageDisplay + ", status=" + this.status + ", originDisplay=" + this.originDisplay + ", warrant=" + this.warrant + ", allotmentPercentageDecimal=" + this.allotmentPercentageDecimal + ", eipoBrokerPortalId=" + this.eipoBrokerPortalId + ")";
    }

    public EIpoOrderDetailDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, Integer r12, String r13, String r14, String r15, String r16, String r17, Double r18, Double r19, String r20) {
        this.orderId = r1;
        this.quantity = r2;
        this.price = r3;
        this.total = r4;
        this.stageDisplay = r5;
        this.statusDisplay = r6;
        this.orderDate = r7;
        this.origin = r8;
        this.orderType = r9;
        this.orderTypeDisplay = r10;
        this.offeringQuantity = r11;
        this.allotmentPercentage = r12;
        this.stage = r13;
        this.orderStage = r14;
        this.orderStageDisplay = r15;
        this.status = r16;
        this.originDisplay = r17;
        this.warrant = r18;
        this.allotmentPercentageDecimal = r19;
        this.eipoBrokerPortalId = r20;
    }

    public /* synthetic */ EIpoOrderDetailDTO(String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, Integer r33, String r34, String r35, String r36, String r37, String r38, Double r39, Double r40, String r41, int r42, i r43) {
        if ((r42 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r42 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r42 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r42 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r42 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r42 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r42 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r42 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r42 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r42 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r42 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r42 & 2048) == 0) goto L49;
        Integer r13 = null;
    L51:
        if ((r42 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r42 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r42 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r42 & 32768) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r42 & 65536) == 0) goto L69;
        String r17 = null;
    L71:
        if ((r42 & 131072) == 0) goto L73;
        Double r18 = null;
    L75:
        if ((r42 & 262144) == 0) goto L77;
        Double r19 = null;
    L79:
        if ((r42 & 524288) == 0) goto L82;
        String r422 = null;
    L83:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r422);
        return;
    L82:
        r422 = r41;
        goto L83
    L77:
        r19 = r40;
        goto L79
    L73:
        r18 = r39;
        goto L75
    L69:
        r17 = r38;
        goto L71
    L65:
        r16 = r37;
        goto L67
    L61:
        r2 = r36;
        goto L63
    L57:
        r15 = r35;
        goto L59
    L53:
        r14 = r34;
        goto L55
    L49:
        r13 = r33;
        goto L51
    L45:
        r12 = r32;
        goto L47
    L41:
        r11 = r31;
        goto L43
    L37:
        r10 = r30;
        goto L39
    L33:
        r9 = r29;
        goto L35
    L29:
        r8 = r28;
        goto L31
    L25:
        r7 = r27;
        goto L27
    L21:
        r6 = r26;
        goto L23
    L17:
        r5 = r25;
        goto L19
    L13:
        r4 = r24;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r1 = r22;
        goto L7
    }
}
