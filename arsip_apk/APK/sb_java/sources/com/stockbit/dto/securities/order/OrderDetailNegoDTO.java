package com.stockbit.dto.securities.order;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002@AB»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010(JÂ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010=\u001a\u00020>HÖ\u0081\u0004J\n\u0010?\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0013\u0010(¨\u0006B"}, d2 = {"Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO;", "", Constants.KEY_ID, "", "referenceId", "counterpartyBrokerCode", "settlementMethod", "settlementSchedule", Constants.KEY_DATE, "Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$NegoDateDTO;", "fee", "Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$FeeDTO;", "reason", "purpose", "cancelationState", "visibility", "matchingState", "counterPartyUserName", "counterPartyUserId", "isUnderRiskManagementReview", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$NegoDateDTO;Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$FeeDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getReferenceId", "getCounterpartyBrokerCode", "getSettlementMethod", "getSettlementSchedule", "getDate", "()Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$NegoDateDTO;", "getFee", "()Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$FeeDTO;", "getReason", "getPurpose", "getCancelationState", "getVisibility", "getMatchingState", "getCounterPartyUserName", "getCounterPartyUserId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$NegoDateDTO;Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$FeeDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO;", "equals", "other", "hashCode", "", "toString", "NegoDateDTO", "FeeDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderDetailNegoDTO {

    @SerializedName("cancelation_state")
    private final String cancelationState;

    @SerializedName("counterparty_user_id")
    private final String counterPartyUserId;

    @SerializedName("counterparty_username")
    private final String counterPartyUserName;

    @SerializedName("counterparty_broker_code")
    private final String counterpartyBrokerCode;

    @SerializedName(Constants.KEY_DATE)
    private final NegoDateDTO date;

    @SerializedName("fee")
    private final FeeDTO fee;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88696id;

    @SerializedName("is_under_riskmgmt_review")
    private final Boolean isUnderRiskManagementReview;

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

    @SerializedName("visibility")
    private final String visibility;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$FeeDTO;", "", "overTheCounterSettlement", "", "broker", "exchange", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getOverTheCounterSettlement", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBroker", "getExchange", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$FeeDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return "FeeDTO(overTheCounterSettlement=" + this.overTheCounterSettlement + ", broker=" + this.broker + ", exchange=" + this.exchange + ")";
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/securities/order/OrderDetailNegoDTO$NegoDateDTO;", "", "transactionDate", "", "settlementDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionDate", "()Ljava/lang/String;", "getSettlementDate", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return "NegoDateDTO(transactionDate=" + this.transactionDate + ", settlementDate=" + this.settlementDate + ")";
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

    public OrderDetailNegoDTO() {
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
        String r12 = null;
        String r13 = null;
        String r14 = null;
        Boolean r15 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, 32767, null);
    }

    public final String a() {
        return this.cancelationState;
    }

    public final String b() {
        return this.counterPartyUserId;
    }

    public final String c() {
        return this.counterPartyUserName;
    }

    public final String d() {
        return this.counterpartyBrokerCode;
    }

    public final NegoDateDTO e() {
        return this.date;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderDetailNegoDTO) == true) goto L8;
        return false;
    L8:
        OrderDetailNegoDTO r52 = (OrderDetailNegoDTO) r5;
        if (p.g(this.f88696id, r52.f88696id) == true) goto L12;
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
        if (p.g(this.visibility, r52.visibility) == true) goto L42;
        return false;
    L42:
        if (p.g(this.matchingState, r52.matchingState) == true) goto L45;
        return false;
    L45:
        if (p.g(this.counterPartyUserName, r52.counterPartyUserName) == true) goto L48;
        return false;
    L48:
        if (p.g(this.counterPartyUserId, r52.counterPartyUserId) == true) goto L51;
        return false;
    L51:
        if (p.g(this.isUnderRiskManagementReview, r52.isUnderRiskManagementReview) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final FeeDTO f() {
        return this.fee;
    }

    public final String g() {
        return this.f88696id;
    }

    public final String h() {
        return this.matchingState;
    }

    public int hashCode() {
        String r02 = this.f88696id;
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
        String r219 = this.visibility;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.matchingState;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.counterPartyUserName;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.counterPartyUserId;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        Boolean r227 = this.isUnderRiskManagementReview;
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
        return this.purpose;
    }

    public final String j() {
        return this.reason;
    }

    public final String k() {
        return this.referenceId;
    }

    public final String l() {
        return this.settlementMethod;
    }

    public final String m() {
        return this.settlementSchedule;
    }

    public final String n() {
        return this.visibility;
    }

    public final Boolean o() {
        return this.isUnderRiskManagementReview;
    }

    public String toString() {
        return "OrderDetailNegoDTO(id=" + this.f88696id + ", referenceId=" + this.referenceId + ", counterpartyBrokerCode=" + this.counterpartyBrokerCode + ", settlementMethod=" + this.settlementMethod + ", settlementSchedule=" + this.settlementSchedule + ", date=" + this.date + ", fee=" + this.fee + ", reason=" + this.reason + ", purpose=" + this.purpose + ", cancelationState=" + this.cancelationState + ", visibility=" + this.visibility + ", matchingState=" + this.matchingState + ", counterPartyUserName=" + this.counterPartyUserName + ", counterPartyUserId=" + this.counterPartyUserId + ", isUnderRiskManagementReview=" + this.isUnderRiskManagementReview + ")";
    }

    public OrderDetailNegoDTO(String r1, String r2, String r3, String r4, String r5, NegoDateDTO r6, FeeDTO r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, Boolean r15) {
        this.f88696id = r1;
        this.referenceId = r2;
        this.counterpartyBrokerCode = r3;
        this.settlementMethod = r4;
        this.settlementSchedule = r5;
        this.date = r6;
        this.fee = r7;
        this.reason = r8;
        this.purpose = r9;
        this.cancelationState = r10;
        this.visibility = r11;
        this.matchingState = r12;
        this.counterPartyUserName = r13;
        this.counterPartyUserId = r14;
        this.isUnderRiskManagementReview = r15;
    }

    public /* synthetic */ OrderDetailNegoDTO(String r17, String r18, String r19, String r20, String r21, NegoDateDTO r22, FeeDTO r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, Boolean r31, int r32, i r33) {
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
        NegoDateDTO r7 = null;
    L27:
        if ((r32 & 64) == 0) goto L29;
        FeeDTO r8 = null;
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
        String r14 = null;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        Boolean r322 = null;
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
