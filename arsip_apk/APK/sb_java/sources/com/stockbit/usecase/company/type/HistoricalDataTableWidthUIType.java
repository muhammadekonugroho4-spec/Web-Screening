package com.stockbit.usecase.company.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/usecase/company/type/HistoricalDataTableWidthUIType;", "", "ohlcWidth", "", "changeWidth", "<init>", "(Ljava/lang/String;III)V", "getOhlcWidth", "()I", "getChangeWidth", "UNITS", "TENS", "HUNDREDS", "THOUSANDS", "LONG_NUMBER", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum HistoricalDataTableWidthUIType extends Enum<HistoricalDataTableWidthUIType> {
    public static final HistoricalDataTableWidthUIType HUNDREDS = null;
    public static final HistoricalDataTableWidthUIType LONG_NUMBER = null;
    public static final HistoricalDataTableWidthUIType TENS = null;
    public static final HistoricalDataTableWidthUIType THOUSANDS = null;
    public static final HistoricalDataTableWidthUIType UNITS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HistoricalDataTableWidthUIType[] f156898a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f156899b = null;
    private final int changeWidth;
    private final int ohlcWidth;

    static {
        UNITS = new HistoricalDataTableWidthUIType("UNITS", 0, 46, 82);
        TENS = new HistoricalDataTableWidthUIType("TENS", 1, 50, 88);
        HUNDREDS = new HistoricalDataTableWidthUIType("HUNDREDS", 2, 50, 100);
        THOUSANDS = new HistoricalDataTableWidthUIType("THOUSANDS", 3, 60, 110);
        LONG_NUMBER = new HistoricalDataTableWidthUIType("LONG_NUMBER", 4, 64, 118);
        HistoricalDataTableWidthUIType[] r02 = a();
        f156898a = r02;
        f156899b = b.a(r02);
    }

    HistoricalDataTableWidthUIType(String r1, int r2, int r3, int r4) {
        this.ohlcWidth = r3;
        this.changeWidth = r4;
    }

    public static final /* synthetic */ HistoricalDataTableWidthUIType[] a() {
        return new HistoricalDataTableWidthUIType[]{UNITS, TENS, HUNDREDS, THOUSANDS, LONG_NUMBER};
    }

    public static a getEntries() {
        return f156899b;
    }

    public static HistoricalDataTableWidthUIType valueOf(String r1) {
        return (HistoricalDataTableWidthUIType) Enum.valueOf(HistoricalDataTableWidthUIType.class, r1);
    }

    public static HistoricalDataTableWidthUIType[] values() {
        return (HistoricalDataTableWidthUIType[]) f156898a.clone();
    }

    public final int getChangeWidth() {
        return this.changeWidth;
    }

    public final int getOhlcWidth() {
        return this.ohlcWidth;
    }
}
