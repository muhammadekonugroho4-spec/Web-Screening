package com.stockbit.model.entity.securities.orderlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u000223B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u000200HÖ\u0081\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00064"}, d2 = {"Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO;", "", Constants.KEY_ID, "", "referenceId", "counterpartyBrokerCode", "settlementMethod", "settlementSchedule", Constants.KEY_DATE, "Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$NegoDateDTO;", "fee", "Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$FeeDTO;", "reason", "purpose", "cancelationState", "matchingState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$NegoDateDTO;Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$FeeDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getReferenceId", "getCounterpartyBrokerCode", "getSettlementMethod", "getSettlementSchedule", "getDate", "()Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$NegoDateDTO;", "getFee", "()Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$FeeDTO;", "getReason", "getPurpose", "getCancelationState", "getMatchingState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "NegoDateDTO", "FeeDTO", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OrderListNegoDTO {

    @SerializedName("cancelation_state")
    private final String cancelationState;

    @SerializedName("counterparty_broker_code")
    private final String counterpartyBrokerCode;

    @SerializedName(Constants.KEY_DATE)
    private final NegoDateDTO date;

    @SerializedName("fee")
    private final FeeDTO fee;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f122095id;

    @SerializedName("matching_state")
    private final String matchingState;

    @SerializedName("purpose")
    private final String purpose;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("reference_id")
    private final String referenceId;

    @SerializedName("settlement_method")
    private final String settlementMethod;

    @SerializedName("settlement_schedule")
    private final String settlementSchedule;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$FeeDTO;", "", "overTheCounterSettlement", "", "broker", "exchange", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getOverTheCounterSettlement", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBroker", "getExchange", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$FeeDTO;", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeeDTO {

        @SerializedName("broker")
        private final Long broker;

        @SerializedName("exchange")
        private final Long exchange;

        @SerializedName("over_the_counter")
        private final Long overTheCounterSettlement;

        public FeeDTO() {
            Long r1 = null;
            Long r2 = null;
            Long r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public final Long a() {
            return this.overTheCounterSettlement;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof FeeDTO) == true) goto L8;
            return false;
        L8:
            FeeDTO r52 = (FeeDTO) r5;
            if (p.g(this.overTheCounterSettlement, r52.overTheCounterSettlement) == true) goto L12;
            return false;
        L12:
            if (p.g(this.broker, r52.broker) == true) goto L15;
            return false;
        L15:
            if (p.g(this.exchange, r52.exchange) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            Long r02 = this.overTheCounterSettlement;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Long r2 = this.broker;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Long r23 = this.exchange;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "FeeDTO(overTheCounterSettlement=" + this.overTheCounterSettlement + ", broker=" + this.broker + ", exchange=" + this.exchange + ')';
        }

        public FeeDTO(Long r1, Long r2, Long r3) {
            this.overTheCounterSettlement = r1;
            this.broker = r2;
            this.exchange = r3;
        }

        public /* synthetic */ FeeDTO(Long r2, Long r3, Long r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = null;
        L11:
            this(r2, r3, r4);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/model/entity/securities/orderlist/OrderListNegoDTO$NegoDateDTO;", "", "transactionDate", "", "settlementDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionDate", "()Ljava/lang/String;", "getSettlementDate", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NegoDateDTO {

        @SerializedName("settlement")
        private final String settlementDate;

        @SerializedName("transaction")
        private final String transactionDate;

        /* JADX WARN: Multi-variable type inference failed */
        public NegoDateDTO() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.settlementDate;
        }

        public final String b() {
            return this.transactionDate;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof NegoDateDTO) == true) goto L8;
            return false;
        L8:
            NegoDateDTO r52 = (NegoDateDTO) r5;
            if (p.g(this.transactionDate, r52.transactionDate) == true) goto L12;
            return false;
        L12:
            if (p.g(this.settlementDate, r52.settlementDate) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.transactionDate;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.settlementDate;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "NegoDateDTO(transactionDate=" + this.transactionDate + ", settlementDate=" + this.settlementDate + ')';
        }

        public NegoDateDTO(String r1, String r2) {
            this.transactionDate = r1;
            this.settlementDate = r2;
        }

        public /* synthetic */ NegoDateDTO(String r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    public OrderListNegoDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        NegoDateDTO r6 = null;
        FeeDTO r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public final String a() {
        return this.cancelationState;
    }

    public final String b() {
        return this.counterpartyBrokerCode;
    }

    public final NegoDateDTO c() {
        return this.date;
    }

    public final FeeDTO d() {
        return this.fee;
    }

    public final String e() {
        return this.f122095id;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderListNegoDTO) == true) goto L8;
        return false;
    L8:
        OrderListNegoDTO r52 = (OrderListNegoDTO) r5;
        if (p.g(this.f122095id, r52.f122095id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.referenceId, r52.referenceId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.counterpartyBrokerCode, r52.counterpartyBrokerCode) == true) goto L18;
        return false;
    L18:
        if (p.g(this.settlementMethod, r52.settlementMethod) == true) goto L21;
        return false;
    L21:
        if (p.g(this.settlementSchedule, r52.settlementSchedule) == true) goto L24;
        return false;
    L24:
        if (p.g(this.date, r52.date) == true) goto L27;
        return false;
    L27:
        if (p.g(this.fee, r52.fee) == true) goto L30;
        return false;
    L30:
        if (p.g(this.reason, r52.reason) == true) goto L33;
        return false;
    L33:
        if (p.g(this.purpose, r52.purpose) == true) goto L36;
        return false;
    L36:
        if (p.g(this.cancelationState, r52.cancelationState) == true) goto L39;
        return false;
    L39:
        if (p.g(this.matchingState, r52.matchingState) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.matchingState;
    }

    public final String g() {
        return this.purpose;
    }

    public final String h() {
        return this.reason;
    }

    public int hashCode() {
        String r02 = this.f122095id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.referenceId;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.counterpartyBrokerCode;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.settlementMethod;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.settlementSchedule;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        NegoDateDTO r29 = this.date;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        FeeDTO r211 = this.fee;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.reason;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.purpose;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.cancelationState;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.matchingState;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
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
        return this.settlementMethod;
    }

    public final String j() {
        return this.settlementSchedule;
    }

    public String toString() {
        return "OrderListNegoDTO(id=" + this.f122095id + ", referenceId=" + this.referenceId + ", counterpartyBrokerCode=" + this.counterpartyBrokerCode + ", settlementMethod=" + this.settlementMethod + ", settlementSchedule=" + this.settlementSchedule + ", date=" + this.date + ", fee=" + this.fee + ", reason=" + this.reason + ", purpose=" + this.purpose + ", cancelationState=" + this.cancelationState + ", matchingState=" + this.matchingState + ')';
    }

    public OrderListNegoDTO(String r1, String r2, String r3, String r4, String r5, NegoDateDTO r6, FeeDTO r7, String r8, String r9, String r10, String r11) {
        this.f122095id = r1;
        this.referenceId = r2;
        this.counterpartyBrokerCode = r3;
        this.settlementMethod = r4;
        this.settlementSchedule = r5;
        this.date = r6;
        this.fee = r7;
        this.reason = r8;
        this.purpose = r9;
        this.cancelationState = r10;
        this.matchingState = r11;
    }

    public /* synthetic */ OrderListNegoDTO(String r2, String r3, String r4, String r5, String r6, NegoDateDTO r7, FeeDTO r8, String r9, String r10, String r11, String r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = null;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        String r132 = null;
    L35:
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        FeeDTO r92 = r8;
        NegoDateDTO r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L36:
        r132 = r12;
        goto L35
    }
}
