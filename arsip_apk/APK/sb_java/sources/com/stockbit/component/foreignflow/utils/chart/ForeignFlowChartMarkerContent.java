package com.stockbit.component.foreignflow.utils.chart;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;

/* loaded from: classes7.dex */
public final class ForeignFlowChartMarkerContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f72060a;

    /* renamed from: b, reason: collision with root package name */
    public final List f72061b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/component/foreignflow/utils/chart/ForeignFlowChartMarkerContent$Accent;", "", "<init>", "(Ljava/lang/String;I)V", "PRICE", "CANDLE", "POSITIVE", "NEGATIVE", "FOREIGN_FLOW_POSITIVE", "FOREIGN_FLOW_NEGATIVE", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Accent extends Enum<Accent> {
        public static final Accent CANDLE = null;
        public static final Accent FOREIGN_FLOW_NEGATIVE = null;
        public static final Accent FOREIGN_FLOW_POSITIVE = null;
        public static final Accent NEGATIVE = null;
        public static final Accent POSITIVE = null;
        public static final Accent PRICE = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Accent[] f72062a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f72063b = null;

        static {
            PRICE = new Accent("PRICE", 0);
            CANDLE = new Accent("CANDLE", 1);
            POSITIVE = new Accent("POSITIVE", 2);
            NEGATIVE = new Accent("NEGATIVE", 3);
            FOREIGN_FLOW_POSITIVE = new Accent("FOREIGN_FLOW_POSITIVE", 4);
            FOREIGN_FLOW_NEGATIVE = new Accent("FOREIGN_FLOW_NEGATIVE", 5);
            Accent[] r02 = a();
            f72062a = r02;
            f72063b = kotlin.enums.b.a(r02);
        }

        Accent(String r1, int r2) {
        }

        public static final /* synthetic */ Accent[] a() {
            return new Accent[]{PRICE, CANDLE, POSITIVE, NEGATIVE, FOREIGN_FLOW_POSITIVE, FOREIGN_FLOW_NEGATIVE};
        }

        public static kotlin.enums.a getEntries() {
            return f72063b;
        }

        public static Accent valueOf(String r1) {
            return (Accent) Enum.valueOf(Accent.class, r1);
        }

        public static Accent[] values() {
            return (Accent[]) f72062a.clone();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f72064a;

        /* renamed from: b, reason: collision with root package name */
        public final String f72065b;

        /* renamed from: c, reason: collision with root package name */
        public final Accent f72066c;

        static {
        }

        public a(String r2, String r3, Accent r4) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
            kotlin.jvm.internal.p.l(r3, "value");
            kotlin.jvm.internal.p.l(r4, "accent");
            this.f72064a = r2;
            this.f72065b = r3;
            this.f72066c = r4;
        }

        public final Accent a() {
            return this.f72066c;
        }

        public final String b() {
            return this.f72064a;
        }

        public final String c() {
            return this.f72065b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f72064a, r52.f72064a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f72065b, r52.f72065b) == true) goto L15;
            return false;
        L15:
            if (this.f72066c == r52.f72066c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f72064a.hashCode() * 31) + this.f72065b.hashCode()) * 31) + this.f72066c.hashCode();
        }

        public String toString() {
            return "Row(label=" + this.f72064a + ", value=" + this.f72065b + ", accent=" + this.f72066c + ')';
        }
    }

    static {
    }

    public ForeignFlowChartMarkerContent(String r2, List r3) {
        kotlin.jvm.internal.p.l(r2, com.clevertap.android.sdk.Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, "rows");
        this.f72060a = r2;
        this.f72061b = r3;
    }

    public final List a() {
        return this.f72061b;
    }

    public final String b() {
        return this.f72060a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ForeignFlowChartMarkerContent) == true) goto L8;
        return false;
    L8:
        ForeignFlowChartMarkerContent r52 = (ForeignFlowChartMarkerContent) r5;
        if (kotlin.jvm.internal.p.g(this.f72060a, r52.f72060a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f72061b, r52.f72061b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f72060a.hashCode() * 31) + this.f72061b.hashCode();
    }

    public String toString() {
        return "ForeignFlowChartMarkerContent(title=" + this.f72060a + ", rows=" + this.f72061b + ')';
    }
}
