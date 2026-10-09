package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes5.dex */
final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean r2, double r3, RoundingMode r5) {
        if (r2 == false) goto L4;
        return;
    L4:
        String r52 = String.valueOf(r5);
        StringBuilder r1 = new StringBuilder(r52.length() + 83);
        r1.append("rounded value is out of range for input ");
        r1.append(r3);
        r1.append(" and rounding mode ");
        r1.append(r52);
        throw new ArithmeticException(r1.toString());
    }

    public static void checkNoOverflow(boolean r2, String r3, int r4, int r5) {
        if (r2 == false) goto L4;
        return;
    L4:
        StringBuilder r1 = new StringBuilder(String.valueOf(r3).length() + 36);
        r1.append("overflow: ");
        r1.append(r3);
        r1.append("(");
        r1.append(r4);
        r1.append(", ");
        r1.append(r5);
        r1.append(")");
        throw new ArithmeticException(r1.toString());
    }

    public static int checkNonNegative(String r3, int r4) {
        if (r4 < 0) goto L4;
        return r4;
    L4:
        StringBuilder r2 = new StringBuilder(String.valueOf(r3).length() + 27);
        r2.append(r3);
        r2.append(" (");
        r2.append(r4);
        r2.append(") must be >= 0");
        throw new IllegalArgumentException(r2.toString());
    }

    public static int checkPositive(String r3, int r4) {
        if (r4 <= 0) goto L4;
        return r4;
    L4:
        StringBuilder r2 = new StringBuilder(String.valueOf(r3).length() + 26);
        r2.append(r3);
        r2.append(" (");
        r2.append(r4);
        r2.append(") must be > 0");
        throw new IllegalArgumentException(r2.toString());
    }

    public static void checkRoundingUnnecessary(boolean r1) {
        if (r1 == false) goto L5;
        return;
    L5:
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }

    public static void checkNoOverflow(boolean r2, String r3, long r4, long r6) {
        if (r2 == false) goto L4;
        return;
    L4:
        StringBuilder r1 = new StringBuilder(String.valueOf(r3).length() + 54);
        r1.append("overflow: ");
        r1.append(r3);
        r1.append("(");
        r1.append(r4);
        r1.append(", ");
        r1.append(r6);
        r1.append(")");
        throw new ArithmeticException(r1.toString());
    }

    public static long checkNonNegative(String r3, long r4) {
        if (r4 < 0) goto L5;
        return r4;
    L5:
        StringBuilder r2 = new StringBuilder(String.valueOf(r3).length() + 36);
        r2.append(r3);
        r2.append(" (");
        r2.append(r4);
        r2.append(") must be >= 0");
        throw new IllegalArgumentException(r2.toString());
    }

    public static long checkPositive(String r3, long r4) {
        if (r4 <= 0) goto L5;
        return r4;
    L5:
        StringBuilder r2 = new StringBuilder(String.valueOf(r3).length() + 35);
        r2.append(r3);
        r2.append(" (");
        r2.append(r4);
        r2.append(") must be > 0");
        throw new IllegalArgumentException(r2.toString());
    }

    public static BigInteger checkNonNegative(String r3, BigInteger r4) {
        if (r4.signum() < 0) goto L5;
        return r4;
    L5:
        String r42 = String.valueOf(r4);
        StringBuilder r2 = new StringBuilder((String.valueOf(r3).length() + 16) + r42.length());
        r2.append(r3);
        r2.append(" (");
        r2.append(r42);
        r2.append(") must be >= 0");
        throw new IllegalArgumentException(r2.toString());
    }

    public static BigInteger checkPositive(String r3, BigInteger r4) {
        if (r4.signum() <= 0) goto L5;
        return r4;
    L5:
        String r42 = String.valueOf(r4);
        StringBuilder r2 = new StringBuilder((String.valueOf(r3).length() + 15) + r42.length());
        r2.append(r3);
        r2.append(" (");
        r2.append(r42);
        r2.append(") must be > 0");
        throw new IllegalArgumentException(r2.toString());
    }

    public static double checkNonNegative(String r3, double r4) {
        if (r4 < 0.0d) goto L5;
        return r4;
    L5:
        StringBuilder r2 = new StringBuilder(String.valueOf(r3).length() + 40);
        r2.append(r3);
        r2.append(" (");
        r2.append(r4);
        r2.append(") must be >= 0");
        throw new IllegalArgumentException(r2.toString());
    }
}
