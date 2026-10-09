package com.stockbit.dto.insider;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J.\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/insider/InsiderActivityDTO;", "", "isMore", "", "movement", "", "Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMovement", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/stockbit/dto/insider/InsiderActivityDTO;", "equals", "other", "hashCode", "", "toString", "", "Movement", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InsiderActivityDTO {

    @SerializedName("is_more")
    private final Boolean isMore;

    @SerializedName("movement")
    private final List<Movement> movement;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003GHIB¯\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÖ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0014\u0010B\u001a\u00020\u00112\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010D\u001a\u00020EHÖ\u0081\u0004J\n\u0010F\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b\u0010\u0010(R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001b¨\u0006J"}, d2 = {"Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement;", "", "actionType", "", "badges", "", "brokerDetail", "Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$BrokerDetail;", "changes", "Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;", "cmhId", "current", "dataSource", "Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$DataSource;", Constants.KEY_DATE, Constants.KEY_ID, "isPosted", "", "marker", AppMeasurementSdk.ConditionalUserProperty.NAME, "nationality", "previous", "priceFormatted", "symbol", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$BrokerDetail;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;Ljava/lang/String;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$DataSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;Ljava/lang/String;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "getBadges", "()Ljava/util/List;", "getBrokerDetail", "()Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$BrokerDetail;", "getChanges", "()Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;", "getCmhId", "getCurrent", "getDataSource", "()Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$DataSource;", "getDate", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarker", "getName", "getNationality", "getPrevious", "getPriceFormatted", "getSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/util/List;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$BrokerDetail;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;Ljava/lang/String;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$DataSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement;", "equals", "other", "hashCode", "", "toString", "BrokerDetail", "PercentageAndValue", "DataSource", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Movement {

        @SerializedName("action_type")
        private final String actionType;

        @SerializedName("badges")
        private final List<String> badges;

        @SerializedName("broker_detail")
        private final BrokerDetail brokerDetail;

        @SerializedName("changes")
        private final PercentageAndValue changes;

        @SerializedName("cmh_id")
        private final String cmhId;

        @SerializedName("current")
        private final PercentageAndValue current;

        @SerializedName("data_source")
        private final DataSource dataSource;

        @SerializedName(Constants.KEY_DATE)
        private final String date;

        /* renamed from: id, reason: collision with root package name */
        @SerializedName(Constants.KEY_ID)
        private final String f88656id;

        @SerializedName("is_posted")
        private final Boolean isPosted;

        @SerializedName("marker")
        private final String marker;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("nationality")
        private final String nationality;

        @SerializedName("previous")
        private final PercentageAndValue previous;

        @SerializedName("price_formatted")
        private final String priceFormatted;

        @SerializedName("symbol")
        private final String symbol;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$BrokerDetail;", "", "code", "", "group", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getGroup", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BrokerDetail {

            @SerializedName("code")
            private final String code;

            @SerializedName("group")
            private final String group;

            public BrokerDetail(String r1, String r2) {
                this.code = r1;
                this.group = r2;
            }

            public final String a() {
                return this.code;
            }

            public final String b() {
                return this.group;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof BrokerDetail) == true) goto L8;
                return false;
            L8:
                BrokerDetail r52 = (BrokerDetail) r5;
                if (p.g(this.code, r52.code) == true) goto L12;
                return false;
            L12:
                if (p.g(this.group, r52.group) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.code;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.group;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "BrokerDetail(code=" + this.code + ", group=" + this.group + ")";
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$DataSource;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getType", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DataSource {

            @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
            private final String label;

            @SerializedName("type")
            private final String type;

            public DataSource(String r1, String r2) {
                this.label = r1;
                this.type = r2;
            }

            public final String a() {
                return this.label;
            }

            public final String b() {
                return this.type;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof DataSource) == true) goto L8;
                return false;
            L8:
                DataSource r52 = (DataSource) r5;
                if (p.g(this.label, r52.label) == true) goto L12;
                return false;
            L12:
                if (p.g(this.type, r52.type) == true) goto L14;
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
                return "DataSource(label=" + this.label + ", type=" + this.type + ")";
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/insider/InsiderActivityDTO$Movement$PercentageAndValue;", "", "formattedValue", "", "percentage", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFormattedValue", "()Ljava/lang/String;", "getPercentage", "getValue", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class PercentageAndValue {

            @SerializedName("formatted_value")
            private final String formattedValue;

            @SerializedName("percentage")
            private final String percentage;

            @SerializedName("value")
            private final String value;

            public PercentageAndValue(String r1, String r2, String r3) {
                this.formattedValue = r1;
                this.percentage = r2;
                this.value = r3;
            }

            public final String a() {
                return this.formattedValue;
            }

            public final String b() {
                return this.percentage;
            }

            public final String c() {
                return this.value;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof PercentageAndValue) == true) goto L8;
                return false;
            L8:
                PercentageAndValue r52 = (PercentageAndValue) r5;
                if (p.g(this.formattedValue, r52.formattedValue) == true) goto L12;
                return false;
            L12:
                if (p.g(this.percentage, r52.percentage) == true) goto L15;
                return false;
            L15:
                if (p.g(this.value, r52.value) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                String r02 = this.formattedValue;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.percentage;
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
                return "PercentageAndValue(formattedValue=" + this.formattedValue + ", percentage=" + this.percentage + ", value=" + this.value + ")";
            }
        }

        public Movement(String r1, List<String> r2, BrokerDetail r3, PercentageAndValue r4, String r5, PercentageAndValue r6, DataSource r7, String r8, String r9, Boolean r10, String r11, String r12, String r13, PercentageAndValue r14, String r15, String r16) {
            this.actionType = r1;
            this.badges = r2;
            this.brokerDetail = r3;
            this.changes = r4;
            this.cmhId = r5;
            this.current = r6;
            this.dataSource = r7;
            this.date = r8;
            this.f88656id = r9;
            this.isPosted = r10;
            this.marker = r11;
            this.name = r12;
            this.nationality = r13;
            this.previous = r14;
            this.priceFormatted = r15;
            this.symbol = r16;
        }

        public final String a() {
            return this.actionType;
        }

        public final List b() {
            return this.badges;
        }

        public final BrokerDetail c() {
            return this.brokerDetail;
        }

        public final PercentageAndValue d() {
            return this.changes;
        }

        public final String e() {
            return this.cmhId;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Movement) == true) goto L8;
            return false;
        L8:
            Movement r52 = (Movement) r5;
            if (p.g(this.actionType, r52.actionType) == true) goto L12;
            return false;
        L12:
            if (p.g(this.badges, r52.badges) == true) goto L15;
            return false;
        L15:
            if (p.g(this.brokerDetail, r52.brokerDetail) == true) goto L18;
            return false;
        L18:
            if (p.g(this.changes, r52.changes) == true) goto L21;
            return false;
        L21:
            if (p.g(this.cmhId, r52.cmhId) == true) goto L24;
            return false;
        L24:
            if (p.g(this.current, r52.current) == true) goto L27;
            return false;
        L27:
            if (p.g(this.dataSource, r52.dataSource) == true) goto L30;
            return false;
        L30:
            if (p.g(this.date, r52.date) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f88656id, r52.f88656id) == true) goto L36;
            return false;
        L36:
            if (p.g(this.isPosted, r52.isPosted) == true) goto L39;
            return false;
        L39:
            if (p.g(this.marker, r52.marker) == true) goto L42;
            return false;
        L42:
            if (p.g(this.name, r52.name) == true) goto L45;
            return false;
        L45:
            if (p.g(this.nationality, r52.nationality) == true) goto L48;
            return false;
        L48:
            if (p.g(this.previous, r52.previous) == true) goto L51;
            return false;
        L51:
            if (p.g(this.priceFormatted, r52.priceFormatted) == true) goto L54;
            return false;
        L54:
            if (p.g(this.symbol, r52.symbol) == true) goto L56;
            return false;
        L56:
            return true;
        }

        public final PercentageAndValue f() {
            return this.current;
        }

        public final DataSource g() {
            return this.dataSource;
        }

        public final String h() {
            return this.date;
        }

        public int hashCode() {
            String r02 = this.actionType;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            List<String> r2 = this.badges;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            BrokerDetail r23 = this.brokerDetail;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            PercentageAndValue r25 = this.changes;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            String r27 = this.cmhId;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            PercentageAndValue r29 = this.current;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            DataSource r211 = this.dataSource;
            if (r211 != null) goto L29;
            int r212 = 0;
        L30:
            int r010 = (r09 + r212) * 31;
            String r213 = this.date;
            if (r213 != null) goto L33;
            int r214 = 0;
        L34:
            int r011 = (r010 + r214) * 31;
            String r215 = this.f88656id;
            if (r215 != null) goto L37;
            int r216 = 0;
        L38:
            int r012 = (r011 + r216) * 31;
            Boolean r217 = this.isPosted;
            if (r217 != null) goto L41;
            int r218 = 0;
        L42:
            int r013 = (r012 + r218) * 31;
            String r219 = this.marker;
            if (r219 != null) goto L45;
            int r220 = 0;
        L46:
            int r014 = (r013 + r220) * 31;
            String r221 = this.name;
            if (r221 != null) goto L49;
            int r222 = 0;
        L50:
            int r015 = (r014 + r222) * 31;
            String r223 = this.nationality;
            if (r223 != null) goto L53;
            int r224 = 0;
        L54:
            int r016 = (r015 + r224) * 31;
            PercentageAndValue r225 = this.previous;
            if (r225 != null) goto L57;
            int r226 = 0;
        L58:
            int r017 = (r016 + r226) * 31;
            String r227 = this.priceFormatted;
            if (r227 != null) goto L61;
            int r228 = 0;
        L62:
            int r018 = (r017 + r228) * 31;
            String r229 = this.symbol;
            if (r229 == null) goto L67;
            r1 = r229.hashCode();
        L67:
            return r018 + r1;
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
            return this.f88656id;
        }

        public final String j() {
            return this.marker;
        }

        public final String k() {
            return this.name;
        }

        public final String l() {
            return this.nationality;
        }

        public final PercentageAndValue m() {
            return this.previous;
        }

        public final String n() {
            return this.priceFormatted;
        }

        public final String o() {
            return this.symbol;
        }

        public final Boolean p() {
            return this.isPosted;
        }

        public String toString() {
            return "Movement(actionType=" + this.actionType + ", badges=" + this.badges + ", brokerDetail=" + this.brokerDetail + ", changes=" + this.changes + ", cmhId=" + this.cmhId + ", current=" + this.current + ", dataSource=" + this.dataSource + ", date=" + this.date + ", id=" + this.f88656id + ", isPosted=" + this.isPosted + ", marker=" + this.marker + ", name=" + this.name + ", nationality=" + this.nationality + ", previous=" + this.previous + ", priceFormatted=" + this.priceFormatted + ", symbol=" + this.symbol + ")";
        }
    }

    public InsiderActivityDTO(Boolean r1, List<Movement> r2) {
        this.isMore = r1;
        this.movement = r2;
    }

    public final List a() {
        return this.movement;
    }

    public final Boolean b() {
        return this.isMore;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof InsiderActivityDTO) == true) goto L8;
        return false;
    L8:
        InsiderActivityDTO r52 = (InsiderActivityDTO) r5;
        if (p.g(this.isMore, r52.isMore) == true) goto L12;
        return false;
    L12:
        if (p.g(this.movement, r52.movement) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isMore;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<Movement> r2 = this.movement;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "InsiderActivityDTO(isMore=" + this.isMore + ", movement=" + this.movement + ")";
    }
}
