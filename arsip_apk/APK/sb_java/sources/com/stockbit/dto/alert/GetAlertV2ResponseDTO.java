package com.stockbit.dto.alert;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO;", "", "alert", "Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert;", "<init>", "(Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert;)V", "getAlert", "()Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Alert", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetAlertV2ResponseDTO {

    @SerializedName("alert")
    private final Alert alert;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001-B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert;", "", "companyId", "", "createdAt", "expiredAt", Constants.KEY_ID, AppMeasurementSdk.ConditionalUserProperty.NAME, "rules", "Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules;", NotificationCompat.CATEGORY_STATUS, "symbol", "updatedAt", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyId", "()Ljava/lang/String;", "getCreatedAt", "getExpiredAt", "getId", "getName", "getRules", "()Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules;", "getStatus", "getSymbol", "getUpdatedAt", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Rules", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Alert {

        @SerializedName("company_id")
        private final String companyId;

        @SerializedName("created_at")
        private final String createdAt;

        @SerializedName("expired_at")
        private final String expiredAt;

        /* renamed from: id, reason: collision with root package name */
        @SerializedName(Constants.KEY_ID)
        private final String f88600id;

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

        @SerializedName("user_id")
        private final String userId;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules;", "", "and", "", "Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And;", "<init>", "(Ljava/util/List;)V", "getAnd", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "And", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Rules {

            @SerializedName("and")
            private final List<And> and;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And;", "", "condition", "Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And$Condition;", "group", "Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And$Group;", "<init>", "(Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And$Condition;Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And$Group;)V", "getCondition", "()Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And$Condition;", "getGroup", "()Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And$Group;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Condition", "Group", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class And {

                @SerializedName("condition")
                private final Condition condition;

                @SerializedName("group")
                private final a group;

                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/alert/GetAlertV2ResponseDTO$Alert$Rules$And$Condition;", "", "item", "", "operator", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItem", "()Ljava/lang/String;", "getOperator", "getValue", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

                public static final class a {
                }

                /* JADX WARN: Multi-variable type inference failed */
                public And() {
                    Object[] r02 = 0 == true ? 1 : 0;
                    this(null, r02, 3, 0 == true ? 1 : 0);
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
                    if (p.g(this.condition, ((And) r4).condition) == true) goto L12;
                    return false;
                L12:
                    if (p.g(null, null) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    Condition r02 = this.condition;
                    if (r02 != null) goto L5;
                    int r03 = 0;
                L7:
                    return r03 * 31;
                L5:
                    r03 = r02.hashCode();
                    goto L7
                }

                public String toString() {
                    return "And(condition=" + this.condition + ", group=null)";
                }

                public And(Condition r1, a r2) {
                    this.condition = r1;
                }

                public /* synthetic */ And(Condition r2, a r3, int r4, i r5) {
                    if ((r4 & 1) == 0) goto L6;
                    r2 = null;
                L6:
                    if ((r4 & 2) == 0) goto L8;
                    r3 = null;
                L8:
                    this(r2, r3);
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
            String r10 = null;
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
        }

        public final String a() {
            return this.expiredAt;
        }

        public final String b() {
            return this.f88600id;
        }

        public final String c() {
            return this.name;
        }

        public final Rules d() {
            return this.rules;
        }

        public final String e() {
            return this.status;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Alert) == true) goto L8;
            return false;
        L8:
            Alert r52 = (Alert) r5;
            if (p.g(this.companyId, r52.companyId) == true) goto L12;
            return false;
        L12:
            if (p.g(this.createdAt, r52.createdAt) == true) goto L15;
            return false;
        L15:
            if (p.g(this.expiredAt, r52.expiredAt) == true) goto L18;
            return false;
        L18:
            if (p.g(this.f88600id, r52.f88600id) == true) goto L21;
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
            if (p.g(this.updatedAt, r52.updatedAt) == true) goto L36;
            return false;
        L36:
            if (p.g(this.userId, r52.userId) == true) goto L38;
            return false;
        L38:
            return true;
        }

        public final String f() {
            return this.symbol;
        }

        public final String g() {
            return this.updatedAt;
        }

        public int hashCode() {
            String r02 = this.companyId;
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
            String r25 = this.f88600id;
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
            if (r215 != null) goto L37;
            int r216 = 0;
        L38:
            int r012 = (r011 + r216) * 31;
            String r217 = this.userId;
            if (r217 == null) goto L43;
            r1 = r217.hashCode();
        L43:
            return r012 + r1;
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
            return "Alert(companyId=" + this.companyId + ", createdAt=" + this.createdAt + ", expiredAt=" + this.expiredAt + ", id=" + this.f88600id + ", name=" + this.name + ", rules=" + this.rules + ", status=" + this.status + ", symbol=" + this.symbol + ", updatedAt=" + this.updatedAt + ", userId=" + this.userId + ")";
        }

        public Alert(String r1, String r2, String r3, String r4, String r5, Rules r6, String r7, String r8, String r9, String r10) {
            this.companyId = r1;
            this.createdAt = r2;
            this.expiredAt = r3;
            this.f88600id = r4;
            this.name = r5;
            this.rules = r6;
            this.status = r7;
            this.symbol = r8;
            this.updatedAt = r9;
            this.userId = r10;
        }

        public /* synthetic */ Alert(String r2, String r3, String r4, String r5, String r6, Rules r7, String r8, String r9, String r10, String r11, int r12, i r13) {
            if ((r12 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r12 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r12 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r12 & 8) == 0) goto L15;
            r5 = null;
        L15:
            if ((r12 & 16) == 0) goto L18;
            r6 = null;
        L18:
            if ((r12 & 32) == 0) goto L21;
            r7 = null;
        L21:
            if ((r12 & 64) == 0) goto L24;
            r8 = null;
        L24:
            if ((r12 & 128) == 0) goto L27;
            r9 = null;
        L27:
            if ((r12 & 256) == 0) goto L30;
            r10 = null;
        L30:
            if ((r12 & 512) == 0) goto L33;
            String r122 = null;
        L32:
            String r112 = r10;
            String r102 = r9;
            String r92 = r8;
            Rules r82 = r7;
            String r72 = r6;
            String r62 = r5;
            String r52 = r4;
            this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122);
            return;
        L33:
            r122 = r11;
            goto L32
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetAlertV2ResponseDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Alert a() {
        return this.alert;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof GetAlertV2ResponseDTO) == true) goto L9;
        return false;
    L9:
        if (p.g(this.alert, ((GetAlertV2ResponseDTO) r4).alert) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Alert r02 = this.alert;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "GetAlertV2ResponseDTO(alert=" + this.alert + ")";
    }

    public GetAlertV2ResponseDTO(Alert r1) {
        this.alert = r1;
    }

    public /* synthetic */ GetAlertV2ResponseDTO(Alert r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
