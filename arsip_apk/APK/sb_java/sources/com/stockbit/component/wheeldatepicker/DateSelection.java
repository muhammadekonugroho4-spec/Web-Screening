package com.stockbit.component.wheeldatepicker;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/component/wheeldatepicker/DateSelection;", "", "<init>", "(Ljava/lang/String;I)V", "DAY", "MONTH", "YEAR", "Companion", "wheeldatepicker_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
enum DateSelection extends Enum<DateSelection> {
    public static final a Companion = null;
    public static final DateSelection DAY = null;
    public static final DateSelection MONTH = null;
    public static final DateSelection YEAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DateSelection[] f77769a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f77770b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final DateSelection a(int r3, int r4) {
            if (r3 < 0) goto L9;
            if (r3 >= 2) goto L9;
            if (r4 < 0) goto L9;
            if (r4 >= 2) goto L9;
            return DateSelection.DAY;
        L9:
            if (2 > r3) goto L17;
            if (r3 >= 4) goto L17;
            if (2 > r4) goto L17;
            if (r4 >= 4) goto L17;
            return DateSelection.MONTH;
        L17:
            return DateSelection.YEAR;
        }

        public a() {
        }
    }

    static {
        DAY = new DateSelection("DAY", 0);
        MONTH = new DateSelection("MONTH", 1);
        YEAR = new DateSelection("YEAR", 2);
        DateSelection[] r02 = a();
        f77769a = r02;
        f77770b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    DateSelection(String r1, int r2) {
    }

    public static final /* synthetic */ DateSelection[] a() {
        return new DateSelection[]{DAY, MONTH, YEAR};
    }

    public static kotlin.enums.a getEntries() {
        return f77770b;
    }

    public static DateSelection valueOf(String r1) {
        return (DateSelection) Enum.valueOf(DateSelection.class, r1);
    }

    public static DateSelection[] values() {
        return (DateSelection[]) f77769a.clone();
    }
}
