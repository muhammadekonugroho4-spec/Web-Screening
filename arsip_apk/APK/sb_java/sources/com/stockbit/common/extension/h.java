package com.stockbit.common.extension;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.material.timepicker.TimeModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.y;

/* loaded from: classes7.dex */
public abstract class h {
    public static final boolean A(int r1) {
        if (r1 != 8) goto L6;
        return true;
    L6:
        return false;
    }

    public static final boolean B(Double r2) {
        if (r2 != null) goto L4;
        return true;
    L4:
        if (kotlin.jvm.internal.p.c(r2, 0.0d) == true) goto L10;
        return false;
    L10:
        return true;
    }

    public static final boolean C(Integer r02) {
        if (r02 != null) goto L4;
        return true;
    L4:
        if (r02.intValue() == 0) goto L10;
        return false;
    L10:
        return true;
    }

    public static final boolean D(int r02) {
        if (r02 != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean E(Integer r02) {
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.intValue() != 0) goto L8;
        return true;
    L8:
        return false;
    }

    public static final float F(float r1, float r2) {
        if (r1 <= r2) goto L5;
        return r2;
    L5:
        return r1;
    }

    public static final float G(float r1, float r2) {
        if (r1 >= r2) goto L5;
        return r2;
    L5:
        return r1;
    }

    public static final double H(Double r2) {
        if (r2 != null) goto L4;
        return 0.0d;
    L4:
        return r2.doubleValue();
    }

    public static final float I(Float r02) {
        if (r02 != null) goto L4;
        return 0.0f;
    L4:
        return r02.floatValue();
    }

    public static final int J(Integer r02) {
        if (r02 != null) goto L4;
        return 0;
    L4:
        return r02.intValue();
    }

    public static final long K(Long r2) {
        if (r2 != null) goto L4;
        return 0;
    L4:
        return r2.longValue();
    }

    public static final BigDecimal L(BigDecimal r1) {
        if (r1 != null) goto L5;
        BigDecimal r12 = BigDecimal.ZERO;
        kotlin.jvm.internal.p.k(r12, "ZERO");
        return r12;
    L5:
        return r1;
    }

    public static final float M(BigDecimal r2, double r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if (r3 > 0.0d) goto L7;
        return r2.floatValue();
    L7:
        return r2.divide(new BigDecimal(String.valueOf(r3)), 0, RoundingMode.DOWN).floatValue();
    }

    public static final String a(double r6) {
        long r02 = (long) r6;
        if ((r6 - r02) != 0.0d) goto L6;
        y r62 = y.f177509a;
        String r63 = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(r02)}, 1));
        kotlin.jvm.internal.p.k(r63, "format(...)");
        return r63;
    L6:
        y r03 = y.f177509a;
        String r64 = String.format("%s", Arrays.copyOf(new Object[]{Double.valueOf(r6)}, 1));
        kotlin.jvm.internal.p.k(r64, "format(...)");
        return r64;
    }

    public static final boolean b(Integer r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (r1.intValue() != 1) goto L8;
        return true;
    L8:
        return false;
    }

    public static final int c(float r2, Context r3) {
        kotlin.jvm.internal.p.l(r3, "context");
        return (int) (TypedValue.applyDimension(1, r2, r3.getResources().getDisplayMetrics()) / r3.getResources().getDisplayMetrics().density);
    }

    public static final String d(Integer r8, boolean r9, int r10, boolean r11, boolean r12) {
        String r82 = l.t(String.valueOf(r8), r9, r10, r11, 0, r12, 8, null);
        if (r82 != null) goto L6;
        return "0";
    L6:
        return r82;
    }

    public static /* synthetic */ String e(Integer r1, boolean r2, int r3, boolean r4, boolean r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 2;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = false;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = false;
    L12:
        return d(r1, r2, r3, r4, r5);
    }

    public static final String f(double r3) {
        String r32 = new DecimalFormat("#,###.##", DecimalFormatSymbols.getInstance(Locale.US)).format(r3);
        kotlin.jvm.internal.p.k(r32, "format(...)");
        return r32;
    }

    public static final int g(int r1) {
        return (int) (r1 / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final String h(String r3) {
        if (r3 != null) goto L4;
        return "";
    L4:
        if (r3.length() == 0) goto L10;
        String r32 = new DecimalFormat("#,###").format(Double.parseDouble(r3));
        kotlin.jvm.internal.p.k(r32, "format(...)");
        return r32;
    L10:
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CharSequence i(Double r4, String r5, String r6) {
        if (r4 != null) goto L6;
        return "-";
    L6:
        if (Math.abs(r4.doubleValue()) < 1000000.0d) goto L9;
    L7:
        int r52 = 0;
        int r02 = 0;
    L8:
        int r2 = r02;
        boolean r03 = r02;
    L31:
        NumberFormat r62 = s();
        r62.setMinimumFractionDigits(r2);
        r62.setMaximumFractionDigits(r52);
        if ((r62 instanceof DecimalFormat) == false) goto L39;
        ((DecimalFormat) r62).setDecimalSeparatorAlwaysShown(r03);
    L39:
        String r42 = r62.format(r4.doubleValue());     // Catch: ArithmeticException -> L36
        kotlin.jvm.internal.p.i(r42);     // Catch: ArithmeticException -> L36
        return r42;
    L36:
        e = move-exception;
        timber.log.a.f184289a.b("getFormattedNumber exception : " + e, new Object[0]);
        return "0";
    L9:
        if (r6 == null) goto L11;
        Boolean r04 = Boolean.valueOf(l.i(r6, "CRYPTO"));
    L12:
        r2 = 2;
        if (b.a(r04) == false) goto L15;
        r02 = 0;
        r52 = 2;
        goto L8
    L15:
        boolean r05 = true;
        if (l.i(r5, "ID") == true) goto L18;
    L17:
        r52 = 2;
        r03 = r05;
        goto L31
    L18:
        if (r6 == null) goto L23;
        if (l.c(r6, "Index") != true) goto L23;
    L30:
        r05 = false;
    L23:
        if (l.i(r6, "COMMODITIES") == true) goto L30;
        if (l.i(r6, "FX") == true) goto L30;
        if (l.i(r6, "Reksadana") == true) goto L30;
        if (l.i(r6, "ETF") == false) goto L7;
    L11:
        r04 = null;
        goto L12
    }

    public static final CharSequence j(Double r5) {
        if (r5 != null) goto L5;
        return "-";
    L5:
        NumberFormat r02 = s();
        r02.setMinimumFractionDigits(2);
        r02.setMaximumFractionDigits(2);
        if ((r02 instanceof DecimalFormat) == false) goto L13;
        ((DecimalFormat) r02).setDecimalSeparatorAlwaysShown(false);
    L13:
        String r52 = r02.format(r5.doubleValue());     // Catch: ArithmeticException -> L10
        kotlin.jvm.internal.p.i(r52);     // Catch: ArithmeticException -> L10
        return r52;
    L10:
        e = move-exception;
        timber.log.a.f184289a.b("getFormattedPercentageNumber exception : " + e, new Object[0]);
        return "0";
    }

    public static final String k(Double r02, int r1) {
        return com.stockbit.domain.extension.c.e(r02, r1);
    }

    public static final String l(BigDecimal r02, int r1, int r2) {
        return com.stockbit.domain.extension.c.f(r02, r1, r2);
    }

    public static /* synthetic */ String m(Double r02, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 2;
    L6:
        return k(r02, r1);
    }

    public static final String n(Double r2, int r3) {
        NumberFormat r02 = NumberFormat.getInstance(Locale.US);
        r02.setMinimumFractionDigits(0);
        r02.setMaximumFractionDigits(r3);
        r02.setRoundingMode(RoundingMode.HALF_EVEN);
        if ((r02 instanceof DecimalFormat) == false) goto L6;
        ((DecimalFormat) r02).setDecimalSeparatorAlwaysShown(false);
    L6:
        return r02.format(r2);
    }

    public static final String o(BigDecimal r02) {
        return com.stockbit.domain.extension.c.k(r02);
    }

    public static /* synthetic */ String p(Double r02, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return n(r02, r1);
    }

    public static final String q(Double r02, int r1, int r2) {
        return com.stockbit.domain.extension.c.n(r02, r1, r2);
    }

    public static final String r(String r02) {
        return com.stockbit.domain.extension.c.q(r02);
    }

    public static final NumberFormat s() {
        NumberFormat r02 = NumberFormat.getInstance(Locale.US);
        kotlin.jvm.internal.p.k(r02, "getInstance(...)");
        r02.setMaximumFractionDigits(2);
        r02.setRoundingMode(RoundingMode.HALF_EVEN);
        if ((r02 instanceof DecimalFormat) == false) goto L5;
        ((DecimalFormat) r02).setDecimalSeparatorAlwaysShown(true);
    L5:
        return r02;
    }

    public static final BigDecimal t(CharSequence r4) {
        if (r4 != null) goto L4;
    L16:
        BigDecimal r42 = BigDecimal.ZERO;
        kotlin.jvm.internal.p.k(r42, "ZERO");
        return r42;
    L4:
        if (r4.length() == 0) goto L16;
        if (l.i(r4, "NA") == true) goto L16;
        BigDecimal r02 = BigDecimal.ZERO;
        r02 = new BigDecimal(l.O(r4.toString()));     // Catch: NumberFormatException -> L12
    L14:
        kotlin.jvm.internal.p.i(r02);
        return r02;
    L12:
        e = move-exception;
        timber.log.a.f184289a.b("getParsedBigdecimals exception : " + e, new Object[0]);
        goto L14
    }

    public static final double u(CharSequence r5) {
        if (r5 != null) goto L5;
    L14:
        return 0.0d;
    L5:
        if (r5.length() == 0) goto L14;
        if (l.i(r5, "NA") == true) goto L14;
        return Double.parseDouble(r5.toString());
    L12:
        e = move-exception;
        timber.log.a.f184289a.b("getParsedDouble exception : " + e, new Object[0]);
        goto L14
    }

    public static final int v(CharSequence r4) {
        if (r4 != null) goto L5;
    L11:
        return 0;
    L5:
        if (r4.length() == 0) goto L11;
        return Integer.parseInt(r4.toString());
    L9:
        e = move-exception;
        timber.log.a.f184289a.b("getParsedInteger exception : " + e, new Object[0]);
        goto L11
    }

    public static final long w(CharSequence r5) {
        if (r5 != null) goto L5;
    L14:
        return 0;
    L5:
        if (r5.length() == 0) goto L14;
        if (l.i(r5, "NA") == true) goto L14;
        return Long.parseLong(r5.toString());
    L12:
        e = move-exception;
        timber.log.a.f184289a.b("getParsedLong exception : " + e, new Object[0]);
        goto L14
    }

    public static final int x(int r1) {
        return (int) (r1 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int y(int r2) {
        return (int) Math.ceil(r2 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final BigDecimal z(float r3, double r4) {
        BigDecimal r32 = new BigDecimal(r3 * r4).setScale(0, RoundingMode.UP);
        kotlin.jvm.internal.p.k(r32, "setScale(...)");
        return r32;
    }
}
