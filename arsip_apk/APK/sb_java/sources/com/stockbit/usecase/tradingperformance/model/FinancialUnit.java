package com.stockbit.usecase.tradingperformance.model;

import com.gojek.ojosdk.exif.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0013"}, d2 = {"Lcom/stockbit/usecase/tradingperformance/model/FinancialUnit;", "", "unitName", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;J)V", "getUnitName", "()Ljava/lang/String;", "getValue", "()J", "TRILLION", "BILLION", "MILLION", "THOUSAND", "NONE", "getDowngradedUnit", "Companion", "usecase-tradingperformance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum FinancialUnit extends Enum<FinancialUnit> {
    public static final FinancialUnit BILLION = null;
    public static final a Companion = null;
    public static final FinancialUnit MILLION = null;
    public static final FinancialUnit NONE = null;
    public static final FinancialUnit THOUSAND = null;
    public static final FinancialUnit TRILLION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FinancialUnit[] f163434a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163435b = null;
    private final String unitName;
    private final long value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final FinancialUnit a(long r6) {
            long r02 = Math.abs(r6);
            FinancialUnit r2 = FinancialUnit.TRILLION;
            if (r02 < r2.getValue()) goto L5;
            return r2;
        L5:
            long r03 = Math.abs(r6);
            FinancialUnit r22 = FinancialUnit.BILLION;
            if (r03 < r22.getValue()) goto L8;
            return r22;
        L8:
            long r04 = Math.abs(r6);
            FinancialUnit r23 = FinancialUnit.MILLION;
            if (r04 < r23.getValue()) goto L11;
            return r23;
        L11:
            long r62 = Math.abs(r6);
            FinancialUnit r05 = FinancialUnit.THOUSAND;
            if (r62 < r05.getValue()) goto L15;
            return r05;
        L15:
            return FinancialUnit.NONE;
        }

        public a() {
        }
    }

    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163436a = null;

        static {
            int[] r02 = new int[FinancialUnit.values().length];
            r02[FinancialUnit.TRILLION.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
        L15:
            r02[FinancialUnit.BILLION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
        L23:
            r02[FinancialUnit.MILLION.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
        L17:
            r02[FinancialUnit.THOUSAND.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
        L19:
            r02[FinancialUnit.NONE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
        L8:
            f163436a = r02;
        }
    }

    static {
        TRILLION = new FinancialUnit("TRILLION", 0, ExifInterface.GpsTrackRef.TRUE_DIRECTION, 1000000000000L);
        BILLION = new FinancialUnit("BILLION", 1, "B", 1000000000);
        MILLION = new FinancialUnit("MILLION", 2, "M", 1000000);
        THOUSAND = new FinancialUnit("THOUSAND", 3, ExifInterface.GpsSpeedRef.KILOMETERS, 1000);
        NONE = new FinancialUnit("NONE", 4, "", 1);
        FinancialUnit[] r02 = a();
        f163434a = r02;
        f163435b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    FinancialUnit(String r1, int r2, String r3, long r4) {
        this.unitName = r3;
        this.value = r4;
    }

    public static final /* synthetic */ FinancialUnit[] a() {
        return new FinancialUnit[]{TRILLION, BILLION, MILLION, THOUSAND, NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f163435b;
    }

    public static FinancialUnit valueOf(String r1) {
        return (FinancialUnit) Enum.valueOf(FinancialUnit.class, r1);
    }

    public static FinancialUnit[] values() {
        return (FinancialUnit[]) f163434a.clone();
    }

    public final FinancialUnit getDowngradedUnit() {
        int r02 = b.f163436a[ordinal()];
        if (r02 == 1) goto L23;
        if (r02 == 2) goto L21;
        if (r02 == 3) goto L19;
        if (r02 == 4) goto L17;
        if (r02 != 5) goto L15;
        return NONE;
    L15:
        throw new NoWhenBranchMatchedException();
    L17:
        return NONE;
    L19:
        return THOUSAND;
    L21:
        return MILLION;
    L23:
        return BILLION;
    }

    public final String getUnitName() {
        return this.unitName;
    }

    public final long getValue() {
        return this.value;
    }
}
