package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
abstract class ToDoubleRounder<X extends Number & Comparable<X>> {

    /* renamed from: com.google.common.math.ToDoubleRounder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
            int[] r02 = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = r02;
            r02[RoundingMode.DOWN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
        L20:
            $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
        L24:
            $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
        L34:
            $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
        L22:
            $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
        L26:
            $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
        L28:
            $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
        L30:
            $SwitchMap$java$math$RoundingMode[RoundingMode.UNNECESSARY.ordinal()] = 8;     // Catch: NoSuchFieldError -> L19
            return;
        }
    }

    public ToDoubleRounder() {
    }

    public abstract X minus(X r1, X r2);

    public final double roundToDouble(X r14, RoundingMode r15) {
        Preconditions.checkNotNull(r14, "x");
        Preconditions.checkNotNull(r15, "mode");
        double r02 = roundToDoubleArbitrarily(r14);
        if (Double.isInfinite(r02) == true) goto L5;
    L20:
        Number r2 = toX(r02, RoundingMode.UNNECESSARY);
        int r7 = ((Comparable) r14).compareTo(r2);
        int[] r8 = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
        switch(r8[r15.ordinal()]) {
            case 1: goto L80;
            case 2: goto L47;
            case 3: goto L47;
            case 4: goto L47;
            case 5: goto L43;
            case 6: goto L39;
            case 7: goto L30;
            case 8: goto L24;
            default: goto L23;
        };
    L24:
        if (r7 != 0) goto L26;
        boolean r142 = true;
    L27:
        MathPreconditions.checkRoundingUnnecessary(r142);
        return r02;
    L26:
        r142 = false;
        goto L27
    L39:
        if (r7 > 0) goto L42;
    L86:
        return r02;
    L42:
        return Math.nextUp(r02);
    L43:
        if (r7 >= 0) goto L86;
        return DoubleUtils.nextDown(r02);
    L47:
        if (r7 < 0) goto L52;
        double r3 = Math.nextUp(r02);
        if (r3 == Double.POSITIVE_INFINITY) goto L86;
        Number r5 = toX(r3, RoundingMode.CEILING);
    L56:
        int r22 = ((Comparable) minus(r14, r2)).compareTo(minus(r5, r14));
        if (r22 < 0) goto L77;
        if (r22 > 0) goto L78;
        int r152 = r8[r15.ordinal()];
        if (r152 == 2) goto L76;
        if (r152 == 3) goto L73;
        if (r152 != 4) goto L71;
        if (sign(r14) < 0) goto L77;
    L71:
        throw new AssertionError("impossible");
    L73:
        if (sign(r14) < 0) goto L78;
    L76:
        if ((Double.doubleToRawLongBits(r02) & 1) == 0) goto L77;
    L78:
        return r3;
    L77:
        return r02;
    L52:
        double r52 = DoubleUtils.nextDown(r02);
        if (r52 == Double.NEGATIVE_INFINITY) goto L86;
        Number r32 = toX(r52, RoundingMode.FLOOR);
        r5 = r2;
        r2 = r32;
        r3 = r02;
        r02 = r52;
        goto L56
    L23:
        throw new AssertionError("impossible");
    L30:
        if (sign(r14) < 0) goto L35;
        if (r7 <= 0) goto L86;
        return Math.nextUp(r02);
    L35:
        if (r7 >= 0) goto L86;
        return DoubleUtils.nextDown(r02);
    L80:
        if (sign(r14) < 0) goto L85;
        if (r7 >= 0) goto L86;
        return DoubleUtils.nextDown(r02);
    L85:
        if (r7 <= 0) goto L86;
        return Math.nextUp(r02);
    L5:
        switch(AnonymousClass1.$SwitchMap$java$math$RoundingMode[r15.ordinal()]) {
            case 1: goto L19;
            case 2: goto L19;
            case 3: goto L19;
            case 4: goto L19;
            case 5: goto L15;
            case 6: goto L10;
            case 7: goto L86;
            case 8: goto L7;
            default: goto L20;
        };
    L7:
        String r143 = String.valueOf(r14);
        StringBuilder r1 = new StringBuilder(r143.length() + 44);
        r1.append(r143);
        r1.append(" cannot be represented precisely as a double");
        throw new ArithmeticException(r1.toString());
    L10:
        if (r02 != Double.POSITIVE_INFINITY) goto L12;
        return Double.POSITIVE_INFINITY;
    L12:
        return -1.7976931348623157E308d;
    L15:
        if (r02 != Double.POSITIVE_INFINITY) goto L17;
        return Double.MAX_VALUE;
    L17:
        return Double.NEGATIVE_INFINITY;
    L19:
        return sign(r14) * Double.MAX_VALUE;
    }

    public abstract double roundToDoubleArbitrarily(X r1);

    public abstract int sign(X r1);

    public abstract X toX(double r1, RoundingMode r3);
}
