package com.stockbit.dto.emitten;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\bHÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/emitten/EmittenDiscoverDTO;", "", "companies", "", "Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getCompanies", "()Ljava/util/List;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/dto/emitten/EmittenDiscoverDTO;", "equals", "", "other", "hashCode", "toString", "Company", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmittenDiscoverDTO {

    @SerializedName("companies")
    private final List<Company> companies;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f88648id;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001:\u0003EFGB¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u00109\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"JÊ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010@J\u0014\u0010A\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010C\u001a\u00020\rHÖ\u0081\u0004J\n\u0010D\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\n\u0010\"R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR \u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b/\u0010\"¨\u0006H"}, d2 = {"Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company;", "", "change", "", "companyId", "corpAction", "Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$CorpAction;", "extraAttributes", "Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes;", "iconUrl", "isExists", "", "isexist", "", "last", AppMeasurementSdk.ConditionalUserProperty.NAME, "notation", "", "Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$Notation;", "percent", "symbol", "symbol2", "symbol3", "uma", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$CorpAction;Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getChange", "()Ljava/lang/String;", "getCompanyId", "getCorpAction", "()Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$CorpAction;", "getExtraAttributes", "()Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes;", "getIconUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsexist", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLast", "getName", "getNotation", "()Ljava/util/List;", "getPercent", "getSymbol", "getSymbol2", "getSymbol3", "getUma", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$CorpAction;Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company;", "equals", "other", "hashCode", "toString", "CorpAction", "ExtraAttributes", "Notation", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Company {

        @SerializedName("change")
        private final String change;

        @SerializedName("company_id")
        private final String companyId;

        @SerializedName("corp_action")
        private final CorpAction corpAction;

        @SerializedName("extra_attributes")
        private final ExtraAttributes extraAttributes;

        @SerializedName("icon_url")
        private final String iconUrl;

        @SerializedName("is_exists")
        private final Boolean isExists;

        @SerializedName("isexist")
        private final Integer isexist;

        @SerializedName("last")
        private final String last;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("notation")
        private final List<Object> notation;

        @SerializedName("percent")
        private final String percent;

        @SerializedName("symbol")
        private final String symbol;

        @SerializedName("symbol_2")
        private final String symbol2;

        @SerializedName("symbol_3")
        private final String symbol3;

        @SerializedName("uma")
        private final Boolean uma;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$CorpAction;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", Constants.KEY_ICON, "", Constants.KEY_TEXT, "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$CorpAction;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CorpAction {

            @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
            private final Boolean active;

            @SerializedName(Constants.KEY_ICON)
            private final String icon;

            @SerializedName(Constants.KEY_TEXT)
            private final String text;

            public CorpAction(Boolean r1, String r2, String r3) {
                this.active = r1;
                this.icon = r2;
                this.text = r3;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof CorpAction) == true) goto L8;
                return false;
            L8:
                CorpAction r52 = (CorpAction) r5;
                if (p.g(this.active, r52.active) == true) goto L12;
                return false;
            L12:
                if (p.g(this.icon, r52.icon) == true) goto L15;
                return false;
            L15:
                if (p.g(this.text, r52.text) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                Boolean r02 = this.active;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.icon;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.text;
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
                return "CorpAction(active=" + this.active + ", icon=" + this.icon + ", text=" + this.text + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes;", "", "frAttributes", "Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes$FrAttributes;", "<init>", "(Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes$FrAttributes;)V", "getFrAttributes", "()Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes$FrAttributes;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "FrAttributes", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ExtraAttributes {

            @SerializedName("fr_attributes")
            private final FrAttributes frAttributes;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0004HÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stockbit/dto/emitten/EmittenDiscoverDTO$Company$ExtraAttributes$FrAttributes;", "", "badges", "", "", "bidPrice", "dueDate", "offerPrice", "performance", "yield", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBadges", "()Ljava/util/List;", "getBidPrice", "()Ljava/lang/String;", "getDueDate", "getOfferPrice", "getPerformance", "getYield", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class FrAttributes {

                @SerializedName("badges")
                private final List<String> badges;

                @SerializedName("bid_price")
                private final String bidPrice;

                @SerializedName("due_date")
                private final String dueDate;

                @SerializedName("offer_price")
                private final String offerPrice;

                @SerializedName("performance")
                private final String performance;

                @SerializedName("yield")
                private final String yield;

                public FrAttributes(List<String> r1, String r2, String r3, String r4, String r5, String r6) {
                    this.badges = r1;
                    this.bidPrice = r2;
                    this.dueDate = r3;
                    this.offerPrice = r4;
                    this.performance = r5;
                    this.yield = r6;
                }

                public final List a() {
                    return this.badges;
                }

                public final String b() {
                    return this.bidPrice;
                }

                public final String c() {
                    return this.dueDate;
                }

                public final String d() {
                    return this.yield;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof FrAttributes) == true) goto L8;
                    return false;
                L8:
                    FrAttributes r52 = (FrAttributes) r5;
                    if (p.g(this.badges, r52.badges) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.bidPrice, r52.bidPrice) == true) goto L15;
                    return false;
                L15:
                    if (p.g(this.dueDate, r52.dueDate) == true) goto L18;
                    return false;
                L18:
                    if (p.g(this.offerPrice, r52.offerPrice) == true) goto L21;
                    return false;
                L21:
                    if (p.g(this.performance, r52.performance) == true) goto L24;
                    return false;
                L24:
                    if (p.g(this.yield, r52.yield) == true) goto L26;
                    return false;
                L26:
                    return true;
                }

                public int hashCode() {
                    List<String> r02 = this.badges;
                    int r1 = 0;
                    if (r02 != null) goto L5;
                    int r03 = 0;
                L6:
                    int r04 = r03 * 31;
                    String r2 = this.bidPrice;
                    if (r2 != null) goto L9;
                    int r22 = 0;
                L10:
                    int r05 = (r04 + r22) * 31;
                    String r23 = this.dueDate;
                    if (r23 != null) goto L13;
                    int r24 = 0;
                L14:
                    int r06 = (r05 + r24) * 31;
                    String r25 = this.offerPrice;
                    if (r25 != null) goto L17;
                    int r26 = 0;
                L18:
                    int r07 = (r06 + r26) * 31;
                    String r27 = this.performance;
                    if (r27 != null) goto L21;
                    int r28 = 0;
                L22:
                    int r08 = (r07 + r28) * 31;
                    String r29 = this.yield;
                    if (r29 == null) goto L27;
                    r1 = r29.hashCode();
                L27:
                    return r08 + r1;
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
                    return "FrAttributes(badges=" + this.badges + ", bidPrice=" + this.bidPrice + ", dueDate=" + this.dueDate + ", offerPrice=" + this.offerPrice + ", performance=" + this.performance + ", yield=" + this.yield + ")";
                }
            }

            public ExtraAttributes(FrAttributes r1) {
                this.frAttributes = r1;
            }

            public final FrAttributes a() {
                return this.frAttributes;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof ExtraAttributes) == true) goto L9;
                return false;
            L9:
                if (p.g(this.frAttributes, ((ExtraAttributes) r4).frAttributes) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                FrAttributes r02 = this.frAttributes;
                if (r02 != null) goto L7;
                return 0;
            L7:
                return r02.hashCode();
            }

            public String toString() {
                return "ExtraAttributes(frAttributes=" + this.frAttributes + ")";
            }
        }

        public Company(String r1, String r2, CorpAction r3, ExtraAttributes r4, String r5, Boolean r6, Integer r7, String r8, String r9, List<Object> r10, String r11, String r12, String r13, String r14, Boolean r15) {
            this.change = r1;
            this.companyId = r2;
            this.corpAction = r3;
            this.extraAttributes = r4;
            this.iconUrl = r5;
            this.isExists = r6;
            this.isexist = r7;
            this.last = r8;
            this.name = r9;
            this.notation = r10;
            this.percent = r11;
            this.symbol = r12;
            this.symbol2 = r13;
            this.symbol3 = r14;
            this.uma = r15;
        }

        public final String a() {
            return this.companyId;
        }

        public final ExtraAttributes b() {
            return this.extraAttributes;
        }

        public final String c() {
            return this.name;
        }

        public final String d() {
            return this.symbol;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Company) == true) goto L8;
            return false;
        L8:
            Company r52 = (Company) r5;
            if (p.g(this.change, r52.change) == true) goto L12;
            return false;
        L12:
            if (p.g(this.companyId, r52.companyId) == true) goto L15;
            return false;
        L15:
            if (p.g(this.corpAction, r52.corpAction) == true) goto L18;
            return false;
        L18:
            if (p.g(this.extraAttributes, r52.extraAttributes) == true) goto L21;
            return false;
        L21:
            if (p.g(this.iconUrl, r52.iconUrl) == true) goto L24;
            return false;
        L24:
            if (p.g(this.isExists, r52.isExists) == true) goto L27;
            return false;
        L27:
            if (p.g(this.isexist, r52.isexist) == true) goto L30;
            return false;
        L30:
            if (p.g(this.last, r52.last) == true) goto L33;
            return false;
        L33:
            if (p.g(this.name, r52.name) == true) goto L36;
            return false;
        L36:
            if (p.g(this.notation, r52.notation) == true) goto L39;
            return false;
        L39:
            if (p.g(this.percent, r52.percent) == true) goto L42;
            return false;
        L42:
            if (p.g(this.symbol, r52.symbol) == true) goto L45;
            return false;
        L45:
            if (p.g(this.symbol2, r52.symbol2) == true) goto L48;
            return false;
        L48:
            if (p.g(this.symbol3, r52.symbol3) == true) goto L51;
            return false;
        L51:
            if (p.g(this.uma, r52.uma) == true) goto L53;
            return false;
        L53:
            return true;
        }

        public int hashCode() {
            String r02 = this.change;
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
            CorpAction r23 = this.corpAction;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            ExtraAttributes r25 = this.extraAttributes;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            String r27 = this.iconUrl;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            Boolean r29 = this.isExists;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            Integer r211 = this.isexist;
            if (r211 != null) goto L29;
            int r212 = 0;
        L30:
            int r010 = (r09 + r212) * 31;
            String r213 = this.last;
            if (r213 != null) goto L33;
            int r214 = 0;
        L34:
            int r011 = (r010 + r214) * 31;
            String r215 = this.name;
            if (r215 != null) goto L37;
            int r216 = 0;
        L38:
            int r012 = (r011 + r216) * 31;
            List<Object> r217 = this.notation;
            if (r217 != null) goto L41;
            int r218 = 0;
        L42:
            int r013 = (r012 + r218) * 31;
            String r219 = this.percent;
            if (r219 != null) goto L45;
            int r220 = 0;
        L46:
            int r014 = (r013 + r220) * 31;
            String r221 = this.symbol;
            if (r221 != null) goto L49;
            int r222 = 0;
        L50:
            int r015 = (r014 + r222) * 31;
            String r223 = this.symbol2;
            if (r223 != null) goto L53;
            int r224 = 0;
        L54:
            int r016 = (r015 + r224) * 31;
            String r225 = this.symbol3;
            if (r225 != null) goto L57;
            int r226 = 0;
        L58:
            int r017 = (r016 + r226) * 31;
            Boolean r227 = this.uma;
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

        public String toString() {
            return "Company(change=" + this.change + ", companyId=" + this.companyId + ", corpAction=" + this.corpAction + ", extraAttributes=" + this.extraAttributes + ", iconUrl=" + this.iconUrl + ", isExists=" + this.isExists + ", isexist=" + this.isexist + ", last=" + this.last + ", name=" + this.name + ", notation=" + this.notation + ", percent=" + this.percent + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", symbol3=" + this.symbol3 + ", uma=" + this.uma + ")";
        }
    }

    public EmittenDiscoverDTO(List<Company> r1, Integer r2, String r3) {
        this.companies = r1;
        this.f88648id = r2;
        this.name = r3;
    }

    public final List a() {
        return this.companies;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof EmittenDiscoverDTO) == true) goto L8;
        return false;
    L8:
        EmittenDiscoverDTO r52 = (EmittenDiscoverDTO) r5;
        if (p.g(this.companies, r52.companies) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88648id, r52.f88648id) == true) goto L15;
        return false;
    L15:
        if (p.g(this.name, r52.name) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        List<Company> r02 = this.companies;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f88648id;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.name;
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
        return "EmittenDiscoverDTO(companies=" + this.companies + ", id=" + this.f88648id + ", name=" + this.name + ")";
    }
}
