package com.stockbit.component.foreignflow.utils;

import com.gojek.ojosdk.exif.ExifInterface;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class ForeignFlowFormatter {

    /* renamed from: a, reason: collision with root package name */
    public static final ForeignFlowFormatter f72049a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormatSymbols f72050b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final DateTimeFormatter f72051c = null;
    public static final int d = 0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stockbit/component/foreignflow/utils/ForeignFlowFormatter$CompactUnitType;", "", "threshold", "", "suffix", "", "<init>", "(Ljava/lang/String;IDLjava/lang/String;)V", "getThreshold", "()D", "getSuffix", "()Ljava/lang/String;", "TRILLION", "BILLION", "MILLION", "THOUSAND", "NONE", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum CompactUnitType extends Enum<CompactUnitType> {
        public static final CompactUnitType BILLION = null;
        public static final CompactUnitType MILLION = null;
        public static final CompactUnitType NONE = null;
        public static final CompactUnitType THOUSAND = null;
        public static final CompactUnitType TRILLION = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ CompactUnitType[] f72052a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f72053b = null;
        private final String suffix;
        private final double threshold;

        static {
            TRILLION = new CompactUnitType("TRILLION", 0, 1.0E12d, ExifInterface.GpsTrackRef.TRUE_DIRECTION);
            BILLION = new CompactUnitType("BILLION", 1, 1.0E9d, "B");
            MILLION = new CompactUnitType("MILLION", 2, 1000000.0d, "M");
            THOUSAND = new CompactUnitType("THOUSAND", 3, 1000.0d, ExifInterface.GpsSpeedRef.KILOMETERS);
            NONE = new CompactUnitType("NONE", 4, 1.0d, "");
            CompactUnitType[] r02 = a();
            f72052a = r02;
            f72053b = kotlin.enums.b.a(r02);
        }

        CompactUnitType(String r1, int r2, double r3, String r5) {
            this.threshold = r3;
            this.suffix = r5;
        }

        public static final /* synthetic */ CompactUnitType[] a() {
            return new CompactUnitType[]{TRILLION, BILLION, MILLION, THOUSAND, NONE};
        }

        public static kotlin.enums.a getEntries() {
            return f72053b;
        }

        public static CompactUnitType valueOf(String r1) {
            return (CompactUnitType) Enum.valueOf(CompactUnitType.class, r1);
        }

        public static CompactUnitType[] values() {
            return (CompactUnitType[]) f72052a.clone();
        }

        public final String getSuffix() {
            return this.suffix;
        }

        public final double getThreshold() {
            return this.threshold;
        }
    }

    static {
        f72049a = new ForeignFlowFormatter();
        f72050b = new DecimalFormatSymbols(Locale.US);
        f72051c = DateTimeFormatter.ofPattern("d MMM yy", Locale.ENGLISH);
        d = 8;
    }

    public ForeignFlowFormatter() {
    }

    public final String a(double r8) {
        if (Math.abs(r8) <= Double.MAX_VALUE) goto L5;
        return "0";
    L5:
        if (Math.abs(r8) < 0.05d) goto L28;
        Iterator<E> r02 = CompactUnitType.getEntries().iterator();
    L9:
        if (r02.hasNext() == false) goto L13;
        Object r1 = r02.next();
        if (Math.abs(r8) < ((CompactUnitType) r1).getThreshold()) goto L9;
    L14:
        CompactUnitType r12 = (CompactUnitType) r1;
        if (r12 != null) goto L17;
        r12 = CompactUnitType.NONE;
    L17:
        BigDecimal r82 = BigDecimal.valueOf(r8);
        BigDecimal r9 = BigDecimal.valueOf(r12.getThreshold());
        RoundingMode r03 = RoundingMode.UP;
        String r83 = c("#,##0.#", r03).format(r82.divide(r9, 8, r03));
        if (r12.getSuffix().length() != 0) goto L22;
        p.i(r83);
        return r83;
    L22:
        return r83 + ' ' + r12.getSuffix();
    L13:
        r1 = null;
        goto L14
    L28:
        return "0";
    }

    public final String b(LocalDate r2) {
        if (r2 == null) goto L7;
        String r22 = r2.format(f72051c);
        if (r22 == null) goto L9;
        return r22;
    L9:
        return "-";
    L7:
        return "-";
    }

    public final DecimalFormat c(String r3, RoundingMode r4) {
        DecimalFormat r02 = new DecimalFormat(r3, f72050b);
        r02.setRoundingMode(r4);
        return r02;
    }
}
