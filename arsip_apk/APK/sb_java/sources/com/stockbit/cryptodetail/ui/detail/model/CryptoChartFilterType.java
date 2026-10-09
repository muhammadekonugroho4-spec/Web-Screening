package com.stockbit.cryptodetail.ui.detail.model;

import com.google.firebase.messaging.Constants;
import com.stockbit.common.o;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/stockbit/cryptodetail/ui/detail/model/CryptoChartFilterType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "apiValue", "timeframe", "periodDescRes", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getApiValue", "getTimeframe", "getPeriodDescRes", "()I", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "THREE_MONTHS", "YEAR_TO_DATE", "ONE_YEAR", "THREE_YEARS", "FIVE_YEARS", "Companion", "crypto-detail_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CryptoChartFilterType extends Enum<CryptoChartFilterType> {
    public static final a Companion = null;
    public static final CryptoChartFilterType FIVE_YEARS = null;
    public static final CryptoChartFilterType ONE_DAY = null;
    public static final CryptoChartFilterType ONE_MONTH = null;
    public static final CryptoChartFilterType ONE_WEEK = null;
    public static final CryptoChartFilterType ONE_YEAR = null;
    public static final CryptoChartFilterType THREE_MONTHS = null;
    public static final CryptoChartFilterType THREE_YEARS = null;
    public static final CryptoChartFilterType YEAR_TO_DATE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoChartFilterType[] f79661a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f79662b = null;
    private final String apiValue;
    private final String label;
    private final int periodDescRes;
    private final String timeframe;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CryptoChartFilterType a(String r6) {
            Iterator<E> r02 = CryptoChartFilterType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L12;
            Object r1 = r02.next();
            String r2 = ((CryptoChartFilterType) r1).getApiValue();
            if (r6 != null) goto L8;
            String r3 = "";
        L10:
            if (y.J(r2, r3, true) == false) goto L4;
        L14:
            return (CryptoChartFilterType) r1;
        L8:
            r3 = r6;
            goto L10
        L12:
            r1 = null;
            goto L14
        }

        public a() {
        }
    }

    static {
        ONE_DAY = new CryptoChartFilterType("ONE_DAY", 0, "1D", "today", "TIMEFRAME_TODAY", o.Ue);
        ONE_WEEK = new CryptoChartFilterType("ONE_WEEK", 1, "1W", "1w", "TIMEFRAME_1W", o.Qe);
        ONE_MONTH = new CryptoChartFilterType("ONE_MONTH", 2, "1M", "1m", "TIMEFRAME_1M", o.Pe);
        THREE_MONTHS = new CryptoChartFilterType("THREE_MONTHS", 3, "3M", "3m", "TIMEFRAME_3M", o.Se);
        YEAR_TO_DATE = new CryptoChartFilterType("YEAR_TO_DATE", 4, "YTD", "ytd", "TIMEFRAME_YTD", o.Ve);
        ONE_YEAR = new CryptoChartFilterType("ONE_YEAR", 5, "1Y", "1y", "TIMEFRAME_1Y", o.Re);
        THREE_YEARS = new CryptoChartFilterType("THREE_YEARS", 6, "3Y", "3y", "TIMEFRAME_3Y", o.Te);
        FIVE_YEARS = new CryptoChartFilterType("FIVE_YEARS", 7, "5Y", "5y", "TIMEFRAME_5Y", o.Oe);
        CryptoChartFilterType[] r02 = a();
        f79661a = r02;
        f79662b = b.a(r02);
        Companion = new a(null);
    }

    CryptoChartFilterType(String r1, int r2, String r3, String r4, String r5, int r6) {
        this.label = r3;
        this.apiValue = r4;
        this.timeframe = r5;
        this.periodDescRes = r6;
    }

    public static final /* synthetic */ CryptoChartFilterType[] a() {
        return new CryptoChartFilterType[]{ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTHS, YEAR_TO_DATE, ONE_YEAR, THREE_YEARS, FIVE_YEARS};
    }

    public static kotlin.enums.a getEntries() {
        return f79662b;
    }

    public static CryptoChartFilterType valueOf(String r1) {
        return (CryptoChartFilterType) Enum.valueOf(CryptoChartFilterType.class, r1);
    }

    public static CryptoChartFilterType[] values() {
        return (CryptoChartFilterType[]) f79661a.clone();
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getPeriodDescRes() {
        return this.periodDescRes;
    }

    public final String getTimeframe() {
        return this.timeframe;
    }
}
