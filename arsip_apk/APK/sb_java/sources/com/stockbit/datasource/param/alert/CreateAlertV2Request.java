package com.stockbit.datasource.param.alert;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stockbit/datasource/param/alert/CreateAlertV2Request;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "symbol", "rules", "Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup;", "expiry", "expiryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSymbol", "getRules", "()Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup;", "getExpiry", "getExpiryDate", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "RuleGroup", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateAlertV2Request {

    @SerializedName("expiry")
    private final String expiry;

    @SerializedName("expiry_date")
    private final String expiryDate;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("rules")
    private final RuleGroup rules;

    @SerializedName("symbol")
    private final String symbol;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup;", "", "and", "", "Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup$RuleNode;", "<init>", "(Ljava/util/List;)V", "getAnd", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "RuleNode", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RuleGroup {

        @SerializedName("and")
        private final List<RuleNode> and;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup$RuleNode;", "", "condition", "Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup$RuleNode$Condition;", "group", "Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup;", "<init>", "(Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup$RuleNode$Condition;Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup;)V", "getCondition", "()Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup$RuleNode$Condition;", "getGroup", "()Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Condition", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class RuleNode {

            @SerializedName("condition")
            private final Condition condition;

            @SerializedName("group")
            private final RuleGroup group;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/datasource/param/alert/CreateAlertV2Request$RuleGroup$RuleNode$Condition;", "", "item", "", "operator", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItem", "()Ljava/lang/String;", "getOperator", "getValue", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Condition {

                @SerializedName("item")
                private final String item;

                @SerializedName("operator")
                private final String operator;

                @SerializedName("value")
                private final String value;

                public Condition(String r2, String r3, String r4) {
                    p.l(r2, "item");
                    p.l(r3, "operator");
                    this.item = r2;
                    this.operator = r3;
                    this.value = r4;
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
                    int r02 = ((this.item.hashCode() * 31) + this.operator.hashCode()) * 31;
                    String r1 = this.value;
                    if (r1 != null) goto L5;
                    int r12 = 0;
                L7:
                    return r02 + r12;
                L5:
                    r12 = r1.hashCode();
                    goto L7
                }

                public String toString() {
                    return "Condition(item=" + this.item + ", operator=" + this.operator + ", value=" + this.value + ")";
                }
            }

            public RuleNode(Condition r2, RuleGroup r3) {
                p.l(r2, "condition");
                this.condition = r2;
                this.group = r3;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof RuleNode) == true) goto L8;
                return false;
            L8:
                RuleNode r52 = (RuleNode) r5;
                if (p.g(this.condition, r52.condition) == true) goto L12;
                return false;
            L12:
                if (p.g(this.group, r52.group) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                int r02 = this.condition.hashCode() * 31;
                RuleGroup r1 = this.group;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "RuleNode(condition=" + this.condition + ", group=" + this.group + ")";
            }
        }

        public RuleGroup(List<RuleNode> r1) {
            this.and = r1;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof RuleGroup) == true) goto L9;
            return false;
        L9:
            if (p.g(this.and, ((RuleGroup) r4).and) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            List<RuleNode> r02 = this.and;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "RuleGroup(and=" + this.and + ")";
        }
    }

    public CreateAlertV2Request(String r2, String r3, RuleGroup r4, String r5, String r6) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "symbol");
        p.l(r4, "rules");
        p.l(r5, "expiry");
        this.name = r2;
        this.symbol = r3;
        this.rules = r4;
        this.expiry = r5;
        this.expiryDate = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CreateAlertV2Request) == true) goto L8;
        return false;
    L8:
        CreateAlertV2Request r52 = (CreateAlertV2Request) r5;
        if (p.g(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (p.g(this.symbol, r52.symbol) == true) goto L15;
        return false;
    L15:
        if (p.g(this.rules, r52.rules) == true) goto L18;
        return false;
    L18:
        if (p.g(this.expiry, r52.expiry) == true) goto L21;
        return false;
    L21:
        if (p.g(this.expiryDate, r52.expiryDate) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((this.name.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.rules.hashCode()) * 31) + this.expiry.hashCode()) * 31;
        String r1 = this.expiryDate;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CreateAlertV2Request(name=" + this.name + ", symbol=" + this.symbol + ", rules=" + this.rules + ", expiry=" + this.expiry + ", expiryDate=" + this.expiryDate + ")";
    }
}
