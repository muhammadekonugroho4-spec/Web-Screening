package com.stockbit.runningtrade.params;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/runningtrade/params/AdvanceFilterPriceType;", "", "min", "", Constants.PRIORITY_MAX, "<init>", "(Ljava/lang/String;IDD)V", "getMin", "()D", "getMax", "PRICE_RANGE", "PRICE_CHANGE", "runningtrade_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum AdvanceFilterPriceType extends Enum<AdvanceFilterPriceType> {
    public static final AdvanceFilterPriceType PRICE_CHANGE = null;
    public static final AdvanceFilterPriceType PRICE_RANGE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AdvanceFilterPriceType[] f131122a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f131123b = null;
    private final double max;
    private final double min;

    static {
        PRICE_RANGE = new AdvanceFilterPriceType("PRICE_RANGE", 0, 0.0d, 999999.0d);
        PRICE_CHANGE = new AdvanceFilterPriceType("PRICE_CHANGE", 1, -35.0d, 35.0d);
        AdvanceFilterPriceType[] r02 = a();
        f131122a = r02;
        f131123b = b.a(r02);
    }

    AdvanceFilterPriceType(String r1, int r2, double r3, double r5) {
        this.min = r3;
        this.max = r5;
    }

    public static final /* synthetic */ AdvanceFilterPriceType[] a() {
        return new AdvanceFilterPriceType[]{PRICE_RANGE, PRICE_CHANGE};
    }

    public static a getEntries() {
        return f131123b;
    }

    public static AdvanceFilterPriceType valueOf(String r1) {
        return (AdvanceFilterPriceType) Enum.valueOf(AdvanceFilterPriceType.class, r1);
    }

    public static AdvanceFilterPriceType[] values() {
        return (AdvanceFilterPriceType[]) f131122a.clone();
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }
}
