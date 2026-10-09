package com.stockbit.dto.alert;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !BW\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0003HÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00032\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR \u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\""}, d2 = {"Lcom/stockbit/dto/alert/AlertInitializationDTO;", "", "categories", "", "Lcom/stockbit/dto/alert/AlertInitializationDTO$Category;", "conditions", "Lcom/stockbit/dto/alert/AlertInitializationDTO$Condition;", "expirations", "Lcom/stockbit/dto/alert/AlertInitializationDTO$Expiration;", "maLengths", "Lcom/stockbit/dto/alert/AlertInitializationDTO$MaLength;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "getConditions", "getExpirations", "getMaLengths", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Category", "Condition", "Expiration", "MaLength", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AlertInitializationDTO {

    @SerializedName("categories")
    private final List<Category> categories;

    @SerializedName("conditions")
    private final List<Condition> conditions;

    @SerializedName("expirations")
    private final List<Expiration> expirations;

    @SerializedName("ma_lengths")
    private final List<MaLength> maLengths;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/alert/AlertInitializationDTO$Category;", "", "type", "", "types", "", "Lcom/stockbit/dto/alert/AlertInitializationDTO$Category$Type;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getTypes", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Type", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Category {

        @SerializedName("type")
        private final String type;

        @SerializedName("types")
        private final List<Type> types;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/stockbit/dto/alert/AlertInitializationDTO$Category$Type;", "", "item", "", Constants.ScionAnalytics.PARAM_LABEL, "lengths", "", "Lcom/stockbit/dto/alert/AlertInitializationDTO$Category$Type$Length;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getItem", "()Ljava/lang/String;", "getLabel", "getLengths", "()Ljava/util/List;", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Length", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Type {

            @SerializedName("item")
            private final String item;

            @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
            private final String label;

            @SerializedName("lengths")
            private final List<Object> lengths;

            public Type() {
                String r1 = null;
                String r2 = null;
                List r3 = null;
                this(r1, r2, r3, 7, null);
            }

            public final String a() {
                return this.item;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Type) == true) goto L8;
                return false;
            L8:
                Type r52 = (Type) r5;
                if (p.g(this.item, r52.item) == true) goto L12;
                return false;
            L12:
                if (p.g(this.label, r52.label) == true) goto L15;
                return false;
            L15:
                if (p.g(this.lengths, r52.lengths) == true) goto L17;
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
                String r2 = this.label;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                List<Object> r23 = this.lengths;
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
                return "Type(item=" + this.item + ", label=" + this.label + ", lengths=" + this.lengths + ")";
            }

            public Type(String r1, String r2, List<Object> r3) {
                this.item = r1;
                this.label = r2;
                this.lengths = r3;
            }

            public /* synthetic */ Type(String r2, String r3, List r4, int r5, i r6) {
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
        public Category() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.type;
        }

        public final List b() {
            return this.types;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Category) == true) goto L8;
            return false;
        L8:
            Category r52 = (Category) r5;
            if (p.g(this.type, r52.type) == true) goto L12;
            return false;
        L12:
            if (p.g(this.types, r52.types) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.type;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            List<Type> r2 = this.types;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Category(type=" + this.type + ", types=" + this.types + ")";
        }

        public Category(String r1, List<Type> r2) {
            this.type = r1;
            this.types = r2;
        }

        public /* synthetic */ Category(String r2, List r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/alert/AlertInitializationDTO$Condition;", "", "options", "", "Lcom/stockbit/dto/alert/AlertInitializationDTO$Condition$Option;", "type", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOptions", "()Ljava/util/List;", "getType", "()Ljava/lang/String;", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Option", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Condition {

        @SerializedName("options")
        private final List<Option> options;

        @SerializedName("type")
        private final String type;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/alert/AlertInitializationDTO$Condition$Option;", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", Constants.ScionAnalytics.PARAM_LABEL, "operator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDirection", "()Ljava/lang/String;", "getLabel", "getOperator", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Option {

            @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
            private final String direction;

            @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
            private final String label;

            @SerializedName("operator")
            private final String operator;

            public Option() {
                String r1 = null;
                String r2 = null;
                String r3 = null;
                this(r1, r2, r3, 7, null);
            }

            public final String a() {
                return this.direction;
            }

            public final String b() {
                return this.label;
            }

            public final String c() {
                return this.operator;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Option) == true) goto L8;
                return false;
            L8:
                Option r52 = (Option) r5;
                if (p.g(this.direction, r52.direction) == true) goto L12;
                return false;
            L12:
                if (p.g(this.label, r52.label) == true) goto L15;
                return false;
            L15:
                if (p.g(this.operator, r52.operator) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                String r02 = this.direction;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.label;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.operator;
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
                return "Option(direction=" + this.direction + ", label=" + this.label + ", operator=" + this.operator + ")";
            }

            public Option(String r1, String r2, String r3) {
                this.direction = r1;
                this.label = r2;
                this.operator = r3;
            }

            public /* synthetic */ Option(String r2, String r3, String r4, int r5, i r6) {
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
        public Condition() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final List a() {
            return this.options;
        }

        public final String b() {
            return this.type;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Condition) == true) goto L8;
            return false;
        L8:
            Condition r52 = (Condition) r5;
            if (p.g(this.options, r52.options) == true) goto L12;
            return false;
        L12:
            if (p.g(this.type, r52.type) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            List<Option> r02 = this.options;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.type;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Condition(options=" + this.options + ", type=" + this.type + ")";
        }

        public Condition(List<Option> r1, String r2) {
            this.options = r1;
            this.type = r2;
        }

        public /* synthetic */ Condition(List r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/alert/AlertInitializationDTO$Expiration;", "", com.clevertap.android.sdk.Constants.KEY_DATE, "", "expiration", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getExpiration", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Expiration {

        @SerializedName(com.clevertap.android.sdk.Constants.KEY_DATE)
        private final String date;

        @SerializedName("expiration")
        private final String expiration;

        /* JADX WARN: Multi-variable type inference failed */
        public Expiration() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.date;
        }

        public final String b() {
            return this.expiration;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Expiration) == true) goto L8;
            return false;
        L8:
            Expiration r52 = (Expiration) r5;
            if (p.g(this.date, r52.date) == true) goto L12;
            return false;
        L12:
            if (p.g(this.expiration, r52.expiration) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.date;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.expiration;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Expiration(date=" + this.date + ", expiration=" + this.expiration + ")";
        }

        public Expiration(String r1, String r2) {
            this.date = r1;
            this.expiration = r2;
        }

        public /* synthetic */ Expiration(String r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/alert/AlertInitializationDTO$MaLength;", "", Constants.ScionAnalytics.PARAM_LABEL, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getName", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MaLength {

        @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
        private final String label;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public MaLength() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.label;
        }

        public final String b() {
            return this.name;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof MaLength) == true) goto L8;
            return false;
        L8:
            MaLength r52 = (MaLength) r5;
            if (p.g(this.label, r52.label) == true) goto L12;
            return false;
        L12:
            if (p.g(this.name, r52.name) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.label;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.name;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "MaLength(label=" + this.label + ", name=" + this.name + ")";
        }

        public MaLength(String r1, String r2) {
            this.label = r1;
            this.name = r2;
        }

        public /* synthetic */ MaLength(String r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    public AlertInitializationDTO() {
        List r1 = null;
        List r2 = null;
        List r3 = null;
        List r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final List a() {
        return this.categories;
    }

    public final List b() {
        return this.conditions;
    }

    public final List c() {
        return this.expirations;
    }

    public final List d() {
        return this.maLengths;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AlertInitializationDTO) == true) goto L8;
        return false;
    L8:
        AlertInitializationDTO r52 = (AlertInitializationDTO) r5;
        if (p.g(this.categories, r52.categories) == true) goto L12;
        return false;
    L12:
        if (p.g(this.conditions, r52.conditions) == true) goto L15;
        return false;
    L15:
        if (p.g(this.expirations, r52.expirations) == true) goto L18;
        return false;
    L18:
        if (p.g(this.maLengths, r52.maLengths) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        List<Category> r02 = this.categories;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<Condition> r2 = this.conditions;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        List<Expiration> r23 = this.expirations;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        List<MaLength> r25 = this.maLengths;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "AlertInitializationDTO(categories=" + this.categories + ", conditions=" + this.conditions + ", expirations=" + this.expirations + ", maLengths=" + this.maLengths + ")";
    }

    public AlertInitializationDTO(List<Category> r1, List<Condition> r2, List<Expiration> r3, List<MaLength> r4) {
        this.categories = r1;
        this.conditions = r2;
        this.expirations = r3;
        this.maLengths = r4;
    }

    public /* synthetic */ AlertInitializationDTO(List r2, List r3, List r4, List r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
