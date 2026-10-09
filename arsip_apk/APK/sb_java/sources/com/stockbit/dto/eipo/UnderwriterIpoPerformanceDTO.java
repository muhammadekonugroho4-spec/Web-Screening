package com.stockbit.dto.eipo;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.stockbit.calendar.CalendarEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004!\"#$B?\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO;", "", "companies", "", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company;", "pagination", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Pagination;", "summary", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary;", "underwriter", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Underwriter;", "<init>", "(Ljava/util/List;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Pagination;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Underwriter;)V", "getCompanies", "()Ljava/util/List;", "getPagination", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Pagination;", "getSummary", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary;", "getUnderwriter", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Underwriter;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Company", "Pagination", "Summary", "Underwriter", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnderwriterIpoPerformanceDTO {

    @SerializedName("companies")
    private final List<Company> companies;

    @SerializedName("pagination")
    private final Pagination pagination;

    @SerializedName("summary")
    private final Summary summary;

    @SerializedName("underwriter")
    private final Underwriter underwriter;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\f_`abcdefghijBç\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010W\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!HÆ\u0003Jî\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!HÆ\u0001¢\u0006\u0002\u0010YJ\u0014\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010]\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010^\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R \u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006k"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company;", "", "araStreak", "", "companyId", "", "fundRaised", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised;", "fundRaisedPct", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct;", "ipoPrice", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice;", "lastPrice", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice;", "listedDate", "logoUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "return10d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d;", "return15d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d;", "return1d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d;", "return20d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d;", "return3d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d;", "return5d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d;", "returnSinceIpo", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo;", "symbol", "underwriters", "", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo;Ljava/lang/String;Ljava/util/List;)V", "getAraStreak", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompanyId", "()Ljava/lang/String;", "getFundRaised", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised;", "getFundRaisedPct", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct;", "getIpoPrice", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice;", "getLastPrice", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice;", "getListedDate", "getLogoUrl", "getName", "getReturn10d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d;", "getReturn15d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d;", "getReturn1d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d;", "getReturn20d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d;", "getReturn3d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d;", "getReturn5d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d;", "getReturnSinceIpo", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo;", "getSymbol", "getUnderwriters", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo;Ljava/lang/String;Ljava/util/List;)Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company;", "equals", "", "other", "hashCode", "toString", "FundRaised", "FundRaisedPct", "IpoPrice", "LastPrice", "Return10d", "Return15d", "Return1d", "Return20d", "Return3d", "Return5d", "ReturnSinceIpo", "Underwriter", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Company {

        @SerializedName("ara_streak")
        private final Integer araStreak;

        @SerializedName("company_id")
        private final String companyId;

        @SerializedName("fund_raised")
        private final FundRaised fundRaised;

        @SerializedName("fund_raised_pct")
        private final FundRaisedPct fundRaisedPct;

        @SerializedName("ipo_price")
        private final IpoPrice ipoPrice;

        @SerializedName("last_price")
        private final LastPrice lastPrice;

        @SerializedName("listed_date")
        private final String listedDate;

        @SerializedName("logo_url")
        private final String logoUrl;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("return_10d")
        private final Return10d return10d;

        @SerializedName("return_15d")
        private final Return15d return15d;

        @SerializedName("return_1d")
        private final Return1d return1d;

        @SerializedName("return_20d")
        private final Return20d return20d;

        @SerializedName("return_3d")
        private final Return3d return3d;

        @SerializedName("return_5d")
        private final Return5d return5d;

        @SerializedName("return_since_ipo")
        private final ReturnSinceIpo returnSinceIpo;

        @SerializedName("symbol")
        private final String symbol;

        @SerializedName("underwriters")
        private final List<Underwriter> underwriters;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class FundRaised {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaised$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FundRaised() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof FundRaised) == true) goto L8;
                return false;
            L8:
                FundRaised r52 = (FundRaised) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "FundRaised(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public FundRaised(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ FundRaised(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class FundRaisedPct {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$FundRaisedPct$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FundRaisedPct() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof FundRaisedPct) == true) goto L8;
                return false;
            L8:
                FundRaisedPct r52 = (FundRaisedPct) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "FundRaisedPct(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public FundRaisedPct(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ FundRaisedPct(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class IpoPrice {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$IpoPrice$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public IpoPrice() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof IpoPrice) == true) goto L8;
                return false;
            L8:
                IpoPrice r52 = (IpoPrice) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "IpoPrice(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public IpoPrice(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ IpoPrice(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LastPrice {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$LastPrice$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public LastPrice() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof LastPrice) == true) goto L8;
                return false;
            L8:
                LastPrice r52 = (LastPrice) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "LastPrice(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public LastPrice(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ LastPrice(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Return10d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return10d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Return10d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Return10d) == true) goto L8;
                return false;
            L8:
                Return10d r52 = (Return10d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "Return10d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public Return10d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ Return10d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Return15d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return15d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Return15d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Return15d) == true) goto L8;
                return false;
            L8:
                Return15d r52 = (Return15d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "Return15d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public Return15d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ Return15d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Return1d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return1d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Return1d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Return1d) == true) goto L8;
                return false;
            L8:
                Return1d r52 = (Return1d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "Return1d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public Return1d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ Return1d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Return20d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return20d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Return20d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Return20d) == true) goto L8;
                return false;
            L8:
                Return20d r52 = (Return20d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "Return20d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public Return20d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ Return20d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Return3d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return3d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Return3d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Return3d) == true) goto L8;
                return false;
            L8:
                Return3d r52 = (Return3d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "Return3d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public Return3d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ Return3d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Return5d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Return5d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Return5d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Return5d) == true) goto L8;
                return false;
            L8:
                Return5d r52 = (Return5d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "Return5d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public Return5d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ Return5d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ReturnSinceIpo {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$ReturnSinceIpo$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ReturnSinceIpo() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof ReturnSinceIpo) == true) goto L8;
                return false;
            L8:
                ReturnSinceIpo r52 = (ReturnSinceIpo) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "ReturnSinceIpo(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public ReturnSinceIpo(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ ReturnSinceIpo(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter;", "", "broker", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter$Broker;", "sequence", "", "type", "", "<init>", "(Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter$Broker;Ljava/lang/Integer;Ljava/lang/String;)V", "getBroker", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter$Broker;", "getSequence", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter$Broker;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter;", "equals", "", "other", "hashCode", "toString", "Broker", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Underwriter {

            @SerializedName("broker")
            private final Broker broker;

            @SerializedName("sequence")
            private final Integer sequence;

            @SerializedName("type")
            private final String type;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter$Broker;", "", "code", "", Constants.KEY_COLOR, "group", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "permission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getColor", "getGroup", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getPermission", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Company$Underwriter$Broker;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Broker {

                @SerializedName("code")
                private final String code;

                @SerializedName(Constants.KEY_COLOR)
                private final String color;

                @SerializedName("group")
                private final String group;

                /* renamed from: id, reason: collision with root package name */
                @SerializedName(Constants.KEY_ID)
                private final Integer f88645id;

                @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
                private final String name;

                @SerializedName("permission")
                private final String permission;

                public Broker() {
                    String r1 = null;
                    String r2 = null;
                    String r3 = null;
                    Integer r4 = null;
                    String r5 = null;
                    String r6 = null;
                    this(r1, r2, r3, r4, r5, r6, 63, null);
                }

                public final String a() {
                    return this.code;
                }

                public final String b() {
                    return this.color;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof Broker) == true) goto L8;
                    return false;
                L8:
                    Broker r52 = (Broker) r5;
                    if (p.g(this.code, r52.code) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.color, r52.color) == true) goto L15;
                    return false;
                L15:
                    if (p.g(this.group, r52.group) == true) goto L18;
                    return false;
                L18:
                    if (p.g(this.f88645id, r52.f88645id) == true) goto L21;
                    return false;
                L21:
                    if (p.g(this.name, r52.name) == true) goto L24;
                    return false;
                L24:
                    if (p.g(this.permission, r52.permission) == true) goto L26;
                    return false;
                L26:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.code;
                    int r1 = 0;
                    if (r02 != null) goto L5;
                    int r03 = 0;
                L6:
                    int r04 = r03 * 31;
                    String r2 = this.color;
                    if (r2 != null) goto L9;
                    int r22 = 0;
                L10:
                    int r05 = (r04 + r22) * 31;
                    String r23 = this.group;
                    if (r23 != null) goto L13;
                    int r24 = 0;
                L14:
                    int r06 = (r05 + r24) * 31;
                    Integer r25 = this.f88645id;
                    if (r25 != null) goto L17;
                    int r26 = 0;
                L18:
                    int r07 = (r06 + r26) * 31;
                    String r27 = this.name;
                    if (r27 != null) goto L21;
                    int r28 = 0;
                L22:
                    int r08 = (r07 + r28) * 31;
                    String r29 = this.permission;
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
                    return "Broker(code=" + this.code + ", color=" + this.color + ", group=" + this.group + ", id=" + this.f88645id + ", name=" + this.name + ", permission=" + this.permission + ")";
                }

                public Broker(String r1, String r2, String r3, Integer r4, String r5, String r6) {
                    this.code = r1;
                    this.color = r2;
                    this.group = r3;
                    this.f88645id = r4;
                    this.name = r5;
                    this.permission = r6;
                }

                public /* synthetic */ Broker(String r2, String r3, String r4, Integer r5, String r6, String r7, int r8, i r9) {
                    if ((r8 & 1) == 0) goto L6;
                    r2 = null;
                L6:
                    if ((r8 & 2) == 0) goto L9;
                    r3 = null;
                L9:
                    if ((r8 & 4) == 0) goto L12;
                    r4 = null;
                L12:
                    if ((r8 & 8) == 0) goto L15;
                    r5 = null;
                L15:
                    if ((r8 & 16) == 0) goto L18;
                    r6 = null;
                L18:
                    if ((r8 & 32) == 0) goto L21;
                    String r82 = null;
                L20:
                    String r72 = r6;
                    Integer r62 = r5;
                    String r52 = r4;
                    this(r2, r3, r52, r62, r72, r82);
                    return;
                L21:
                    r82 = r7;
                    goto L20
                }
            }

            public Underwriter() {
                Broker r1 = null;
                Integer r2 = null;
                String r3 = null;
                this(r1, r2, r3, 7, null);
            }

            public final Broker a() {
                return this.broker;
            }

            public final Integer b() {
                return this.sequence;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Underwriter) == true) goto L8;
                return false;
            L8:
                Underwriter r52 = (Underwriter) r5;
                if (p.g(this.broker, r52.broker) == true) goto L12;
                return false;
            L12:
                if (p.g(this.sequence, r52.sequence) == true) goto L15;
                return false;
            L15:
                if (p.g(this.type, r52.type) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                Broker r02 = this.broker;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Integer r2 = this.sequence;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.type;
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
                return "Underwriter(broker=" + this.broker + ", sequence=" + this.sequence + ", type=" + this.type + ")";
            }

            public Underwriter(Broker r1, Integer r2, String r3) {
                this.broker = r1;
                this.sequence = r2;
                this.type = r3;
            }

            public /* synthetic */ Underwriter(Broker r2, Integer r3, String r4, int r5, i r6) {
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

        public Company() {
            Integer r1 = null;
            String r2 = null;
            FundRaised r3 = null;
            FundRaisedPct r4 = null;
            IpoPrice r5 = null;
            LastPrice r6 = null;
            String r7 = null;
            String r8 = null;
            String r9 = null;
            Return10d r10 = null;
            Return15d r11 = null;
            Return1d r12 = null;
            Return20d r13 = null;
            Return3d r14 = null;
            Return5d r15 = null;
            ReturnSinceIpo r16 = null;
            String r17 = null;
            List r18 = null;
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, 262143, null);
        }

        public final Integer a() {
            return this.araStreak;
        }

        public final String b() {
            return this.companyId;
        }

        public final FundRaised c() {
            return this.fundRaised;
        }

        public final FundRaisedPct d() {
            return this.fundRaisedPct;
        }

        public final IpoPrice e() {
            return this.ipoPrice;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Company) == true) goto L8;
            return false;
        L8:
            Company r52 = (Company) r5;
            if (p.g(this.araStreak, r52.araStreak) == true) goto L12;
            return false;
        L12:
            if (p.g(this.companyId, r52.companyId) == true) goto L15;
            return false;
        L15:
            if (p.g(this.fundRaised, r52.fundRaised) == true) goto L18;
            return false;
        L18:
            if (p.g(this.fundRaisedPct, r52.fundRaisedPct) == true) goto L21;
            return false;
        L21:
            if (p.g(this.ipoPrice, r52.ipoPrice) == true) goto L24;
            return false;
        L24:
            if (p.g(this.lastPrice, r52.lastPrice) == true) goto L27;
            return false;
        L27:
            if (p.g(this.listedDate, r52.listedDate) == true) goto L30;
            return false;
        L30:
            if (p.g(this.logoUrl, r52.logoUrl) == true) goto L33;
            return false;
        L33:
            if (p.g(this.name, r52.name) == true) goto L36;
            return false;
        L36:
            if (p.g(this.return10d, r52.return10d) == true) goto L39;
            return false;
        L39:
            if (p.g(this.return15d, r52.return15d) == true) goto L42;
            return false;
        L42:
            if (p.g(this.return1d, r52.return1d) == true) goto L45;
            return false;
        L45:
            if (p.g(this.return20d, r52.return20d) == true) goto L48;
            return false;
        L48:
            if (p.g(this.return3d, r52.return3d) == true) goto L51;
            return false;
        L51:
            if (p.g(this.return5d, r52.return5d) == true) goto L54;
            return false;
        L54:
            if (p.g(this.returnSinceIpo, r52.returnSinceIpo) == true) goto L57;
            return false;
        L57:
            if (p.g(this.symbol, r52.symbol) == true) goto L60;
            return false;
        L60:
            if (p.g(this.underwriters, r52.underwriters) == true) goto L62;
            return false;
        L62:
            return true;
        }

        public final LastPrice f() {
            return this.lastPrice;
        }

        public final String g() {
            return this.listedDate;
        }

        public final String h() {
            return this.logoUrl;
        }

        public int hashCode() {
            Integer r02 = this.araStreak;
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
            FundRaised r23 = this.fundRaised;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            FundRaisedPct r25 = this.fundRaisedPct;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            IpoPrice r27 = this.ipoPrice;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            LastPrice r29 = this.lastPrice;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            String r211 = this.listedDate;
            if (r211 != null) goto L29;
            int r212 = 0;
        L30:
            int r010 = (r09 + r212) * 31;
            String r213 = this.logoUrl;
            if (r213 != null) goto L33;
            int r214 = 0;
        L34:
            int r011 = (r010 + r214) * 31;
            String r215 = this.name;
            if (r215 != null) goto L37;
            int r216 = 0;
        L38:
            int r012 = (r011 + r216) * 31;
            Return10d r217 = this.return10d;
            if (r217 != null) goto L41;
            int r218 = 0;
        L42:
            int r013 = (r012 + r218) * 31;
            Return15d r219 = this.return15d;
            if (r219 != null) goto L45;
            int r220 = 0;
        L46:
            int r014 = (r013 + r220) * 31;
            Return1d r221 = this.return1d;
            if (r221 != null) goto L49;
            int r222 = 0;
        L50:
            int r015 = (r014 + r222) * 31;
            Return20d r223 = this.return20d;
            if (r223 != null) goto L53;
            int r224 = 0;
        L54:
            int r016 = (r015 + r224) * 31;
            Return3d r225 = this.return3d;
            if (r225 != null) goto L57;
            int r226 = 0;
        L58:
            int r017 = (r016 + r226) * 31;
            Return5d r227 = this.return5d;
            if (r227 != null) goto L61;
            int r228 = 0;
        L62:
            int r018 = (r017 + r228) * 31;
            ReturnSinceIpo r229 = this.returnSinceIpo;
            if (r229 != null) goto L65;
            int r230 = 0;
        L66:
            int r019 = (r018 + r230) * 31;
            String r231 = this.symbol;
            if (r231 != null) goto L69;
            int r232 = 0;
        L70:
            int r020 = (r019 + r232) * 31;
            List<Underwriter> r233 = this.underwriters;
            if (r233 == null) goto L75;
            r1 = r233.hashCode();
        L75:
            return r020 + r1;
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
            return this.name;
        }

        public final Return10d j() {
            return this.return10d;
        }

        public final Return15d k() {
            return this.return15d;
        }

        public final Return1d l() {
            return this.return1d;
        }

        public final Return20d m() {
            return this.return20d;
        }

        public final Return3d n() {
            return this.return3d;
        }

        public final Return5d o() {
            return this.return5d;
        }

        public final ReturnSinceIpo p() {
            return this.returnSinceIpo;
        }

        public final String q() {
            return this.symbol;
        }

        public final List r() {
            return this.underwriters;
        }

        public String toString() {
            return "Company(araStreak=" + this.araStreak + ", companyId=" + this.companyId + ", fundRaised=" + this.fundRaised + ", fundRaisedPct=" + this.fundRaisedPct + ", ipoPrice=" + this.ipoPrice + ", lastPrice=" + this.lastPrice + ", listedDate=" + this.listedDate + ", logoUrl=" + this.logoUrl + ", name=" + this.name + ", return10d=" + this.return10d + ", return15d=" + this.return15d + ", return1d=" + this.return1d + ", return20d=" + this.return20d + ", return3d=" + this.return3d + ", return5d=" + this.return5d + ", returnSinceIpo=" + this.returnSinceIpo + ", symbol=" + this.symbol + ", underwriters=" + this.underwriters + ")";
        }

        public Company(Integer r1, String r2, FundRaised r3, FundRaisedPct r4, IpoPrice r5, LastPrice r6, String r7, String r8, String r9, Return10d r10, Return15d r11, Return1d r12, Return20d r13, Return3d r14, Return5d r15, ReturnSinceIpo r16, String r17, List<Underwriter> r18) {
            this.araStreak = r1;
            this.companyId = r2;
            this.fundRaised = r3;
            this.fundRaisedPct = r4;
            this.ipoPrice = r5;
            this.lastPrice = r6;
            this.listedDate = r7;
            this.logoUrl = r8;
            this.name = r9;
            this.return10d = r10;
            this.return15d = r11;
            this.return1d = r12;
            this.return20d = r13;
            this.return3d = r14;
            this.return5d = r15;
            this.returnSinceIpo = r16;
            this.symbol = r17;
            this.underwriters = r18;
        }

        public /* synthetic */ Company(Integer r20, String r21, FundRaised r22, FundRaisedPct r23, IpoPrice r24, LastPrice r25, String r26, String r27, String r28, Return10d r29, Return15d r30, Return1d r31, Return20d r32, Return3d r33, Return5d r34, ReturnSinceIpo r35, String r36, List r37, int r38, i r39) {
            if ((r38 & 1) == 0) goto L5;
            Integer r1 = null;
        L7:
            if ((r38 & 2) == 0) goto L9;
            String r3 = null;
        L11:
            if ((r38 & 4) == 0) goto L13;
            FundRaised r4 = null;
        L15:
            if ((r38 & 8) == 0) goto L17;
            FundRaisedPct r5 = null;
        L19:
            if ((r38 & 16) == 0) goto L21;
            IpoPrice r6 = null;
        L23:
            if ((r38 & 32) == 0) goto L25;
            LastPrice r7 = null;
        L27:
            if ((r38 & 64) == 0) goto L29;
            String r8 = null;
        L31:
            if ((r38 & 128) == 0) goto L33;
            String r9 = null;
        L35:
            if ((r38 & 256) == 0) goto L37;
            String r10 = null;
        L39:
            if ((r38 & 512) == 0) goto L41;
            Return10d r11 = null;
        L43:
            if ((r38 & 1024) == 0) goto L45;
            Return15d r12 = null;
        L47:
            if ((r38 & 2048) == 0) goto L49;
            Return1d r13 = null;
        L51:
            if ((r38 & 4096) == 0) goto L53;
            Return20d r14 = null;
        L55:
            if ((r38 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
            Return3d r15 = null;
        L59:
            if ((r38 & 16384) == 0) goto L61;
            Return5d r2 = null;
        L63:
            if ((r38 & 32768) == 0) goto L65;
            ReturnSinceIpo r16 = null;
        L67:
            if ((r38 & 65536) == 0) goto L69;
            String r17 = null;
        L71:
            if ((r38 & 131072) == 0) goto L74;
            List r382 = null;
        L75:
            this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r382);
            return;
        L74:
            r382 = r37;
            goto L75
        L69:
            r17 = r36;
            goto L71
        L65:
            r16 = r35;
            goto L67
        L61:
            r2 = r34;
            goto L63
        L57:
            r15 = r33;
            goto L59
        L53:
            r14 = r32;
            goto L55
        L49:
            r13 = r31;
            goto L51
        L45:
            r12 = r30;
            goto L47
        L41:
            r11 = r29;
            goto L43
        L37:
            r10 = r28;
            goto L39
        L33:
            r9 = r27;
            goto L35
        L29:
            r8 = r26;
            goto L31
        L25:
            r7 = r25;
            goto L27
        L21:
            r6 = r24;
            goto L23
        L17:
            r5 = r23;
            goto L19
        L13:
            r4 = r22;
            goto L15
        L9:
            r3 = r21;
            goto L11
        L5:
            r1 = r20;
            goto L7
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Pagination;", "", "hasNext", "", "hasPrev", Constants.KEY_LIMIT, "", CalendarEntryPoint.KEY_PAGE_DETAIL, "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHasNext", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasPrev", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Pagination;", "equals", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Pagination {

        @SerializedName("has_next")
        private final Boolean hasNext;

        @SerializedName("has_prev")
        private final Boolean hasPrev;

        @SerializedName(Constants.KEY_LIMIT)
        private final Integer limit;

        @SerializedName(CalendarEntryPoint.KEY_PAGE_DETAIL)
        private final Integer page;

        public Pagination() {
            Boolean r1 = null;
            Boolean r2 = null;
            Integer r3 = null;
            Integer r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Pagination) == true) goto L8;
            return false;
        L8:
            Pagination r52 = (Pagination) r5;
            if (p.g(this.hasNext, r52.hasNext) == true) goto L12;
            return false;
        L12:
            if (p.g(this.hasPrev, r52.hasPrev) == true) goto L15;
            return false;
        L15:
            if (p.g(this.limit, r52.limit) == true) goto L18;
            return false;
        L18:
            if (p.g(this.page, r52.page) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            Boolean r02 = this.hasNext;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Boolean r2 = this.hasPrev;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Integer r23 = this.limit;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            Integer r25 = this.page;
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
            return "Pagination(hasNext=" + this.hasNext + ", hasPrev=" + this.hasPrev + ", limit=" + this.limit + ", page=" + this.page + ")";
        }

        public Pagination(Boolean r1, Boolean r2, Integer r3, Integer r4) {
            this.hasNext = r1;
            this.hasPrev = r2;
            this.limit = r3;
            this.page = r4;
        }

        public /* synthetic */ Pagination(Boolean r2, Boolean r3, Integer r4, Integer r5, int r6, i r7) {
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

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\nJKLMNOPQRSB£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010@\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003Jª\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010CJ\u0014\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010G\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010H\u001a\u00020IHÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006T"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary;", "", "araStreakAvg", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg;", "avgReturn10d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d;", "avgReturn15d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d;", "avgReturn1d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d;", "avgReturn20d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d;", "avgReturn3d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d;", "avgReturn5d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d;", "avgReturnSinceIpo", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo;", "fundRaisedSum", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum;", "fundRaisedAvg", "success1dCount", "", "totalIpos", "winRate1d", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d;", "<init>", "(Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d;)V", "getAraStreakAvg", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg;", "getAvgReturn10d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d;", "getAvgReturn15d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d;", "getAvgReturn1d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d;", "getAvgReturn20d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d;", "getAvgReturn3d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d;", "getAvgReturn5d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d;", "getAvgReturnSinceIpo", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo;", "getFundRaisedSum", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum;", "getFundRaisedAvg", "getSuccess1dCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalIpos", "getWinRate1d", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "(Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d;)Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary;", "equals", "", "other", "hashCode", "toString", "", "AraStreakAvg", "AvgReturn10d", "AvgReturn15d", "AvgReturn1d", "AvgReturn20d", "AvgReturn3d", "AvgReturn5d", "AvgReturnSinceIpo", "FundRaisedSum", "WinRate1d", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Summary {

        @SerializedName("ara_streak_avg")
        private final AraStreakAvg araStreakAvg;

        @SerializedName("avg_return_10d")
        private final AvgReturn10d avgReturn10d;

        @SerializedName("avg_return_15d")
        private final AvgReturn15d avgReturn15d;

        @SerializedName("avg_return_1d")
        private final AvgReturn1d avgReturn1d;

        @SerializedName("avg_return_20d")
        private final AvgReturn20d avgReturn20d;

        @SerializedName("avg_return_3d")
        private final AvgReturn3d avgReturn3d;

        @SerializedName("avg_return_5d")
        private final AvgReturn5d avgReturn5d;

        @SerializedName("avg_return_since_ipo")
        private final AvgReturnSinceIpo avgReturnSinceIpo;

        @SerializedName("fund_raised_avg")
        private final FundRaisedSum fundRaisedAvg;

        @SerializedName("fund_raised_sum")
        private final FundRaisedSum fundRaisedSum;

        @SerializedName("success_1d_count")
        private final Integer success1dCount;

        @SerializedName("total_ipos")
        private final Integer totalIpos;

        @SerializedName("win_rate_1d")
        private final WinRate1d winRate1d;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AraStreakAvg {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AraStreakAvg$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AraStreakAvg() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AraStreakAvg) == true) goto L8;
                return false;
            L8:
                AraStreakAvg r52 = (AraStreakAvg) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AraStreakAvg(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AraStreakAvg(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AraStreakAvg(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AvgReturn10d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn10d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AvgReturn10d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AvgReturn10d) == true) goto L8;
                return false;
            L8:
                AvgReturn10d r52 = (AvgReturn10d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AvgReturn10d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AvgReturn10d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AvgReturn10d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AvgReturn15d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn15d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AvgReturn15d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AvgReturn15d) == true) goto L8;
                return false;
            L8:
                AvgReturn15d r52 = (AvgReturn15d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AvgReturn15d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AvgReturn15d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AvgReturn15d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AvgReturn1d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn1d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AvgReturn1d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AvgReturn1d) == true) goto L8;
                return false;
            L8:
                AvgReturn1d r52 = (AvgReturn1d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AvgReturn1d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AvgReturn1d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AvgReturn1d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AvgReturn20d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn20d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AvgReturn20d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AvgReturn20d) == true) goto L8;
                return false;
            L8:
                AvgReturn20d r52 = (AvgReturn20d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AvgReturn20d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AvgReturn20d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AvgReturn20d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AvgReturn3d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn3d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AvgReturn3d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AvgReturn3d) == true) goto L8;
                return false;
            L8:
                AvgReturn3d r52 = (AvgReturn3d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AvgReturn3d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AvgReturn3d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AvgReturn3d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AvgReturn5d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturn5d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AvgReturn5d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AvgReturn5d) == true) goto L8;
                return false;
            L8:
                AvgReturn5d r52 = (AvgReturn5d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AvgReturn5d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AvgReturn5d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AvgReturn5d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AvgReturnSinceIpo {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$AvgReturnSinceIpo$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AvgReturnSinceIpo() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof AvgReturnSinceIpo) == true) goto L8;
                return false;
            L8:
                AvgReturnSinceIpo r52 = (AvgReturnSinceIpo) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "AvgReturnSinceIpo(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public AvgReturnSinceIpo(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ AvgReturnSinceIpo(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class FundRaisedSum {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$FundRaisedSum$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FundRaisedSum() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof FundRaisedSum) == true) goto L8;
                return false;
            L8:
                FundRaisedSum r52 = (FundRaisedSum) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "FundRaisedSum(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public FundRaisedSum(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ FundRaisedSum(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d;", "", "formatted", "", "raw", "Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d$Raw;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d$Raw;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d$Raw;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Raw", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class WinRate1d {

            @SerializedName("formatted")
            private final String formatted;

            @SerializedName("raw")
            private final Raw raw;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Summary$WinRate1d$Raw;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Raw {

                @SerializedName("value")
                private final String value;

                /* JADX WARN: Multi-variable type inference failed */
                public Raw() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public final String a() {
                    return this.value;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof Raw) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.value, ((Raw) r4).value) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.value;
                    if (r02 != null) goto L7;
                    return 0;
                L7:
                    return r02.hashCode();
                }

                public String toString() {
                    return "Raw(value=" + this.value + ")";
                }

                public Raw(String r1) {
                    this.value = r1;
                }

                public /* synthetic */ Raw(String r1, int r2, i r3) {
                    if ((r2 & 1) == 0) goto L5;
                    r1 = null;
                L5:
                    this(r1);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public WinRate1d() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.formatted;
            }

            public final Raw b() {
                return this.raw;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof WinRate1d) == true) goto L8;
                return false;
            L8:
                WinRate1d r52 = (WinRate1d) r5;
                if (p.g(this.formatted, r52.formatted) == true) goto L12;
                return false;
            L12:
                if (p.g(this.raw, r52.raw) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                String r02 = this.formatted;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Raw r2 = this.raw;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "WinRate1d(formatted=" + this.formatted + ", raw=" + this.raw + ")";
            }

            public WinRate1d(String r1, Raw r2) {
                this.formatted = r1;
                this.raw = r2;
            }

            public /* synthetic */ WinRate1d(String r2, Raw r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        public Summary() {
            AraStreakAvg r1 = null;
            AvgReturn10d r2 = null;
            AvgReturn15d r3 = null;
            AvgReturn1d r4 = null;
            AvgReturn20d r5 = null;
            AvgReturn3d r6 = null;
            AvgReturn5d r7 = null;
            AvgReturnSinceIpo r8 = null;
            FundRaisedSum r9 = null;
            FundRaisedSum r10 = null;
            Integer r11 = null;
            Integer r12 = null;
            WinRate1d r13 = null;
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, 8191, null);
        }

        public final AraStreakAvg a() {
            return this.araStreakAvg;
        }

        public final AvgReturn10d b() {
            return this.avgReturn10d;
        }

        public final AvgReturn15d c() {
            return this.avgReturn15d;
        }

        public final AvgReturn1d d() {
            return this.avgReturn1d;
        }

        public final AvgReturn20d e() {
            return this.avgReturn20d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Summary) == true) goto L8;
            return false;
        L8:
            Summary r52 = (Summary) r5;
            if (p.g(this.araStreakAvg, r52.araStreakAvg) == true) goto L12;
            return false;
        L12:
            if (p.g(this.avgReturn10d, r52.avgReturn10d) == true) goto L15;
            return false;
        L15:
            if (p.g(this.avgReturn15d, r52.avgReturn15d) == true) goto L18;
            return false;
        L18:
            if (p.g(this.avgReturn1d, r52.avgReturn1d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.avgReturn20d, r52.avgReturn20d) == true) goto L24;
            return false;
        L24:
            if (p.g(this.avgReturn3d, r52.avgReturn3d) == true) goto L27;
            return false;
        L27:
            if (p.g(this.avgReturn5d, r52.avgReturn5d) == true) goto L30;
            return false;
        L30:
            if (p.g(this.avgReturnSinceIpo, r52.avgReturnSinceIpo) == true) goto L33;
            return false;
        L33:
            if (p.g(this.fundRaisedSum, r52.fundRaisedSum) == true) goto L36;
            return false;
        L36:
            if (p.g(this.fundRaisedAvg, r52.fundRaisedAvg) == true) goto L39;
            return false;
        L39:
            if (p.g(this.success1dCount, r52.success1dCount) == true) goto L42;
            return false;
        L42:
            if (p.g(this.totalIpos, r52.totalIpos) == true) goto L45;
            return false;
        L45:
            if (p.g(this.winRate1d, r52.winRate1d) == true) goto L47;
            return false;
        L47:
            return true;
        }

        public final AvgReturn3d f() {
            return this.avgReturn3d;
        }

        public final AvgReturn5d g() {
            return this.avgReturn5d;
        }

        public final AvgReturnSinceIpo h() {
            return this.avgReturnSinceIpo;
        }

        public int hashCode() {
            AraStreakAvg r02 = this.araStreakAvg;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            AvgReturn10d r2 = this.avgReturn10d;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            AvgReturn15d r23 = this.avgReturn15d;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            AvgReturn1d r25 = this.avgReturn1d;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            AvgReturn20d r27 = this.avgReturn20d;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            AvgReturn3d r29 = this.avgReturn3d;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            AvgReturn5d r211 = this.avgReturn5d;
            if (r211 != null) goto L29;
            int r212 = 0;
        L30:
            int r010 = (r09 + r212) * 31;
            AvgReturnSinceIpo r213 = this.avgReturnSinceIpo;
            if (r213 != null) goto L33;
            int r214 = 0;
        L34:
            int r011 = (r010 + r214) * 31;
            FundRaisedSum r215 = this.fundRaisedSum;
            if (r215 != null) goto L37;
            int r216 = 0;
        L38:
            int r012 = (r011 + r216) * 31;
            FundRaisedSum r217 = this.fundRaisedAvg;
            if (r217 != null) goto L41;
            int r218 = 0;
        L42:
            int r013 = (r012 + r218) * 31;
            Integer r219 = this.success1dCount;
            if (r219 != null) goto L45;
            int r220 = 0;
        L46:
            int r014 = (r013 + r220) * 31;
            Integer r221 = this.totalIpos;
            if (r221 != null) goto L49;
            int r222 = 0;
        L50:
            int r015 = (r014 + r222) * 31;
            WinRate1d r223 = this.winRate1d;
            if (r223 == null) goto L55;
            r1 = r223.hashCode();
        L55:
            return r015 + r1;
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

        public final FundRaisedSum i() {
            return this.fundRaisedAvg;
        }

        public final FundRaisedSum j() {
            return this.fundRaisedSum;
        }

        public final Integer k() {
            return this.success1dCount;
        }

        public final Integer l() {
            return this.totalIpos;
        }

        public final WinRate1d m() {
            return this.winRate1d;
        }

        public String toString() {
            return "Summary(araStreakAvg=" + this.araStreakAvg + ", avgReturn10d=" + this.avgReturn10d + ", avgReturn15d=" + this.avgReturn15d + ", avgReturn1d=" + this.avgReturn1d + ", avgReturn20d=" + this.avgReturn20d + ", avgReturn3d=" + this.avgReturn3d + ", avgReturn5d=" + this.avgReturn5d + ", avgReturnSinceIpo=" + this.avgReturnSinceIpo + ", fundRaisedSum=" + this.fundRaisedSum + ", fundRaisedAvg=" + this.fundRaisedAvg + ", success1dCount=" + this.success1dCount + ", totalIpos=" + this.totalIpos + ", winRate1d=" + this.winRate1d + ")";
        }

        public Summary(AraStreakAvg r1, AvgReturn10d r2, AvgReturn15d r3, AvgReturn1d r4, AvgReturn20d r5, AvgReturn3d r6, AvgReturn5d r7, AvgReturnSinceIpo r8, FundRaisedSum r9, FundRaisedSum r10, Integer r11, Integer r12, WinRate1d r13) {
            this.araStreakAvg = r1;
            this.avgReturn10d = r2;
            this.avgReturn15d = r3;
            this.avgReturn1d = r4;
            this.avgReturn20d = r5;
            this.avgReturn3d = r6;
            this.avgReturn5d = r7;
            this.avgReturnSinceIpo = r8;
            this.fundRaisedSum = r9;
            this.fundRaisedAvg = r10;
            this.success1dCount = r11;
            this.totalIpos = r12;
            this.winRate1d = r13;
        }

        public /* synthetic */ Summary(AraStreakAvg r14, AvgReturn10d r15, AvgReturn15d r16, AvgReturn1d r17, AvgReturn20d r18, AvgReturn3d r19, AvgReturn5d r20, AvgReturnSinceIpo r21, FundRaisedSum r22, FundRaisedSum r23, Integer r24, Integer r25, WinRate1d r26, int r27, i r28) {
            if ((r27 & 1) == 0) goto L6;
            r14 = null;
        L6:
            if ((r27 & 2) == 0) goto L8;
            AvgReturn10d r1 = null;
        L10:
            if ((r27 & 4) == 0) goto L12;
            AvgReturn15d r3 = null;
        L14:
            if ((r27 & 8) == 0) goto L16;
            AvgReturn1d r4 = null;
        L18:
            if ((r27 & 16) == 0) goto L20;
            AvgReturn20d r5 = null;
        L22:
            if ((r27 & 32) == 0) goto L24;
            AvgReturn3d r6 = null;
        L26:
            if ((r27 & 64) == 0) goto L28;
            AvgReturn5d r7 = null;
        L30:
            if ((r27 & 128) == 0) goto L32;
            AvgReturnSinceIpo r8 = null;
        L34:
            if ((r27 & 256) == 0) goto L36;
            FundRaisedSum r9 = null;
        L38:
            if ((r27 & 512) == 0) goto L40;
            FundRaisedSum r10 = null;
        L42:
            if ((r27 & 1024) == 0) goto L44;
            Integer r11 = null;
        L46:
            if ((r27 & 2048) == 0) goto L48;
            Integer r12 = null;
        L50:
            if ((r27 & 4096) == 0) goto L53;
            WinRate1d r272 = null;
        L54:
            this(r14, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r272);
            return;
        L53:
            r272 = r26;
            goto L54
        L48:
            r12 = r25;
            goto L50
        L44:
            r11 = r24;
            goto L46
        L40:
            r10 = r23;
            goto L42
        L36:
            r9 = r22;
            goto L38
        L32:
            r8 = r21;
            goto L34
        L28:
            r7 = r20;
            goto L30
        L24:
            r6 = r19;
            goto L26
        L20:
            r5 = r18;
            goto L22
        L16:
            r4 = r17;
            goto L18
        L12:
            r3 = r16;
            goto L14
        L8:
            r1 = r15;
            goto L10
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Underwriter;", "", "code", "", Constants.KEY_COLOR, "group", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "permission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getColor", "getGroup", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getPermission", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/eipo/UnderwriterIpoPerformanceDTO$Underwriter;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Underwriter {

        @SerializedName("code")
        private final String code;

        @SerializedName(Constants.KEY_COLOR)
        private final String color;

        @SerializedName("group")
        private final String group;

        /* renamed from: id, reason: collision with root package name */
        @SerializedName(Constants.KEY_ID)
        private final Integer f88646id;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("permission")
        private final String permission;

        public Underwriter() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            Integer r4 = null;
            String r5 = null;
            String r6 = null;
            this(r1, r2, r3, r4, r5, r6, 63, null);
        }

        public final String a() {
            return this.code;
        }

        public final String b() {
            return this.color;
        }

        public final String c() {
            return this.name;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Underwriter) == true) goto L8;
            return false;
        L8:
            Underwriter r52 = (Underwriter) r5;
            if (p.g(this.code, r52.code) == true) goto L12;
            return false;
        L12:
            if (p.g(this.color, r52.color) == true) goto L15;
            return false;
        L15:
            if (p.g(this.group, r52.group) == true) goto L18;
            return false;
        L18:
            if (p.g(this.f88646id, r52.f88646id) == true) goto L21;
            return false;
        L21:
            if (p.g(this.name, r52.name) == true) goto L24;
            return false;
        L24:
            if (p.g(this.permission, r52.permission) == true) goto L26;
            return false;
        L26:
            return true;
        }

        public int hashCode() {
            String r02 = this.code;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.color;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.group;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            Integer r25 = this.f88646id;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            String r27 = this.name;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            String r29 = this.permission;
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
            return "Underwriter(code=" + this.code + ", color=" + this.color + ", group=" + this.group + ", id=" + this.f88646id + ", name=" + this.name + ", permission=" + this.permission + ")";
        }

        public Underwriter(String r1, String r2, String r3, Integer r4, String r5, String r6) {
            this.code = r1;
            this.color = r2;
            this.group = r3;
            this.f88646id = r4;
            this.name = r5;
            this.permission = r6;
        }

        public /* synthetic */ Underwriter(String r2, String r3, String r4, Integer r5, String r6, String r7, int r8, i r9) {
            if ((r8 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r8 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r8 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r8 & 8) == 0) goto L15;
            r5 = null;
        L15:
            if ((r8 & 16) == 0) goto L18;
            r6 = null;
        L18:
            if ((r8 & 32) == 0) goto L21;
            String r82 = null;
        L20:
            String r72 = r6;
            Integer r62 = r5;
            String r52 = r4;
            this(r2, r3, r52, r62, r72, r82);
            return;
        L21:
            r82 = r7;
            goto L20
        }
    }

    public UnderwriterIpoPerformanceDTO() {
        List r1 = null;
        Pagination r2 = null;
        Summary r3 = null;
        Underwriter r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final List a() {
        return this.companies;
    }

    public final Summary b() {
        return this.summary;
    }

    public final Underwriter c() {
        return this.underwriter;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnderwriterIpoPerformanceDTO) == true) goto L8;
        return false;
    L8:
        UnderwriterIpoPerformanceDTO r52 = (UnderwriterIpoPerformanceDTO) r5;
        if (p.g(this.companies, r52.companies) == true) goto L12;
        return false;
    L12:
        if (p.g(this.pagination, r52.pagination) == true) goto L15;
        return false;
    L15:
        if (p.g(this.summary, r52.summary) == true) goto L18;
        return false;
    L18:
        if (p.g(this.underwriter, r52.underwriter) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        List<Company> r02 = this.companies;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Pagination r2 = this.pagination;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Summary r23 = this.summary;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Underwriter r25 = this.underwriter;
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
        return "UnderwriterIpoPerformanceDTO(companies=" + this.companies + ", pagination=" + this.pagination + ", summary=" + this.summary + ", underwriter=" + this.underwriter + ")";
    }

    public UnderwriterIpoPerformanceDTO(List<Company> r1, Pagination r2, Summary r3, Underwriter r4) {
        this.companies = r1;
        this.pagination = r2;
        this.summary = r3;
        this.underwriter = r4;
    }

    public /* synthetic */ UnderwriterIpoPerformanceDTO(List r2, Pagination r3, Summary r4, Underwriter r5, int r6, i r7) {
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
