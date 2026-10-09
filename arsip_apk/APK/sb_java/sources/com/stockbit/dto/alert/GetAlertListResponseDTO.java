package com.stockbit.dto.alert;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertListResponseDTO;", "", "alerts", "", "Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert;", "<init>", "(Ljava/util/List;)V", "getAlerts", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Alert", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetAlertListResponseDTO {

    @SerializedName("alerts")
    private final List<Alert> alerts;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert;", "", Constants.KEY_ID, "", "createdAt", "expiredAt", "iconUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "rules", "Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules;", NotificationCompat.CATEGORY_STATUS, "symbol", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCreatedAt", "getExpiredAt", "getIconUrl", "getName", "getRules", "()Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules;", "getStatus", "getSymbol", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Rules", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Alert {

        @SerializedName("created_at")
        private final String createdAt;

        @SerializedName("expired_at")
        private final String expiredAt;

        @SerializedName("icon_url")
        private final String iconUrl;

        /* renamed from: id, reason: collision with root package name */
        @SerializedName(Constants.KEY_ID)
        private final String f88599id;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("rules")
        private final Rules rules;

        @SerializedName(NotificationCompat.CATEGORY_STATUS)
        private final String status;

        @SerializedName("symbol")
        private final String symbol;

        @SerializedName("updated_at")
        private final String updatedAt;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules;", "", "and", "", "Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules$And;", "<init>", "(Ljava/util/List;)V", "getAnd", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "And", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Rules {

            @SerializedName("and")
            private final List<And> and;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules$And;", "", "condition", "Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules$And$Condition;", "<init>", "(Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules$And$Condition;)V", "getCondition", "()Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules$And$Condition;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Condition", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class And {

                @SerializedName("condition")
                private final Condition condition;

                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertListResponseDTO$Alert$Rules$And$Condition;", "", "item", "", "operator", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItem", "()Ljava/lang/String;", "getOperator", "getValue", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Condition {

                    @SerializedName("item")
                    private final String item;

                    @SerializedName("operator")
                    private final String operator;

                    @SerializedName("value")
                    private final String value;

                    public Condition() {
                        String r1 = null;
                        String r2 = null;
                        String r3 = null;
                        this(r1, r2, r3, 7, null);
                    }

                    public final String a() {
                        return this.item;
                    }

                    public final String b() {
                        return this.operator;
                    }

                    public final String c() {
                        return this.value;
                    }

                    public boolean equals(Object r5) {
                        if (this != r5) goto L6;
                        return true;
                    L6:
                        if ((r5 instanceof Condition) == true) goto L8;
                        return false;
                    L8:
                        Condition r52 = (Condition) r5;
                        if (p.g(this.item, r52.item) == true) goto L12;
                        return false;
                    L12:
                        if (p.g(this.operator, r52.operator) == true) goto L15;
                        return false;
                    L15:
                        if (p.g(this.value, r52.value) == true) goto L17;
                        return false;
                    L17:
                        return true;
                    }

                    public int hashCode() {
                        String r02 = this.item;
                        int r1 = 0;
                        if (r02 != null) goto L5;
                        int r03 = 0;
                    L6:
                        int r04 = r03 * 31;
                        String r2 = this.operator;
                        if (r2 != null) goto L9;
                        int r22 = 0;
                    L10:
                        int r05 = (r04 + r22) * 31;
                        String r23 = this.value;
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
                        return "Condition(item=" + this.item + ", operator=" + this.operator + ", value=" + this.value + ")";
                    }

                    public Condition(String r1, String r2, String r3) {
                        this.item = r1;
                        this.operator = r2;
                        this.value = r3;
                    }

                    public /* synthetic */ Condition(String r2, String r3, String r4, int r5, i r6) {
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

                /* JADX WARN: Multi-variable type inference failed */
                public And() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final Condition a() {
                    return this.condition;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof And) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.condition, ((And) r4).condition) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    Condition r02 = this.condition;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "And(condition=" + this.condition + ")";
                }

                public And(Condition r1) {
                    this.condition = r1;
                }

                public /* synthetic */ And(Condition r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Rules() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final List a() {
                return this.and;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof Rules) == true) goto L9;
                return false;
            L9:
                if (p.g(this.and, ((Rules) r4).and) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                List<And> r02 = this.and;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "Rules(and=" + this.and + ")";
            }

            public Rules(List<And> r1) {
                this.and = r1;
            }

            public /* synthetic */ Rules(List r1, int r2, i r3) {
                if ((r2 & 1) == 0) goto L5;
                r1 = null;
            L5:
                this(r1);
            }
        }

        public Alert() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            String r5 = null;
            Rules r6 = null;
            String r7 = null;
            String r8 = null;
            String r9 = null;
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
        }

        public final String a() {
            return this.expiredAt;
        }

        public final String b() {
            return this.iconUrl;
        }

        public final String c() {
            return this.f88599id;
        }

        public final String d() {
            return this.name;
        }

        public final Rules e() {
            return this.rules;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Alert) == true) goto L8;
            return false;
        L8:
            Alert r52 = (Alert) r5;
            if (p.g(this.f88599id, r52.f88599id) == true) goto L12;
            return false;
        L12:
            if (p.g(this.createdAt, r52.createdAt) == true) goto L15;
            return false;
        L15:
            if (p.g(this.expiredAt, r52.expiredAt) == true) goto L18;
            return false;
        L18:
            if (p.g(this.iconUrl, r52.iconUrl) == true) goto L21;
            return false;
        L21:
            if (p.g(this.name, r52.name) == true) goto L24;
            return false;
        L24:
            if (p.g(this.rules, r52.rules) == true) goto L27;
            return false;
        L27:
            if (p.g(this.status, r52.status) == true) goto L30;
            return false;
        L30:
            if (p.g(this.symbol, r52.symbol) == true) goto L33;
            return false;
        L33:
            if (p.g(this.updatedAt, r52.updatedAt) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public final String f() {
            return this.status;
        }

        public final String g() {
            return this.symbol;
        }

        public final String h() {
            return this.updatedAt;
        }

        public int hashCode() {
            String r02 = this.f88599id;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.createdAt;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.expiredAt;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.iconUrl;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            String r27 = this.name;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            Rules r29 = this.rules;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            String r211 = this.status;
            if (r211 != null) goto L29;
            int r212 = 0;
        L30:
            int r010 = (r09 + r212) * 31;
            String r213 = this.symbol;
            if (r213 != null) goto L33;
            int r214 = 0;
        L34:
            int r011 = (r010 + r214) * 31;
            String r215 = this.updatedAt;
            if (r215 == null) goto L39;
            r1 = r215.hashCode();
        L39:
            return r011 + r1;
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
            return "Alert(id=" + this.f88599id + ", createdAt=" + this.createdAt + ", expiredAt=" + this.expiredAt + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", rules=" + this.rules + ", status=" + this.status + ", symbol=" + this.symbol + ", updatedAt=" + this.updatedAt + ")";
        }

        public Alert(String r1, String r2, String r3, String r4, String r5, Rules r6, String r7, String r8, String r9) {
            this.f88599id = r1;
            this.createdAt = r2;
            this.expiredAt = r3;
            this.iconUrl = r4;
            this.name = r5;
            this.rules = r6;
            this.status = r7;
            this.symbol = r8;
            this.updatedAt = r9;
        }

        public /* synthetic */ Alert(String r2, String r3, String r4, String r5, String r6, Rules r7, String r8, String r9, String r10, int r11, i r12) {
            if ((r11 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r11 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r11 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r11 & 8) == 0) goto L15;
            r5 = null;
        L15:
            if ((r11 & 16) == 0) goto L18;
            r6 = null;
        L18:
            if ((r11 & 32) == 0) goto L21;
            r7 = null;
        L21:
            if ((r11 & 64) == 0) goto L24;
            r8 = null;
        L24:
            if ((r11 & 128) == 0) goto L27;
            r9 = null;
        L27:
            if ((r11 & 256) == 0) goto L30;
            String r112 = null;
        L29:
            String r102 = r9;
            String r92 = r8;
            Rules r82 = r7;
            String r72 = r6;
            String r62 = r5;
            String r52 = r4;
            this(r2, r3, r52, r62, r72, r82, r92, r102, r112);
            return;
        L30:
            r112 = r10;
            goto L29
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetAlertListResponseDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List a() {
        return this.alerts;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof GetAlertListResponseDTO) == true) goto L9;
        return false;
    L9:
        if (p.g(this.alerts, ((GetAlertListResponseDTO) r4).alerts) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        List<Alert> r02 = this.alerts;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "GetAlertListResponseDTO(alerts=" + this.alerts + ")";
    }

    public GetAlertListResponseDTO(List<Alert> r1) {
        this.alerts = r1;
    }

    public /* synthetic */ GetAlertListResponseDTO(List r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
