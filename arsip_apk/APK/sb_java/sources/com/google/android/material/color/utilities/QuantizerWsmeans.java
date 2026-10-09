package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes5.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public static final class Distance implements Comparable<Distance> {
        double distance;
        int index;

        public Distance() {
            this.index = -1;
            this.distance = -1.0d;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Distance r1) {
            return compareTo2(r1);
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Distance r4) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(r4.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] r26, int[] r27, int r28) {
        boolean r2 = true;
        Random r3 = new Random(272008);
        LinkedHashMap r4 = new LinkedHashMap();
        double[][] r5 = new double[r26.length][];
        int[] r6 = new int[r26.length];
        PointProviderLab r7 = new PointProviderLab();
        int r9 = 0;
        int r10 = 0;
    L4:
        if (r9 >= r26.length) goto L10;
        int r11 = r26[r9];
        Integer r12 = (Integer) r4.get(Integer.valueOf(r11));
        if (r12 != null) goto L8;
        r5[r10] = r7.fromInt(r11);
        r6[r10] = r11;
        r10 = r10 + 1;
        r4.put(Integer.valueOf(r11), 1);
    L9:
        r9 = r9 + 1;
        goto L4
    L8:
        r4.put(Integer.valueOf(r11), Integer.valueOf(r12.intValue() + 1));
        goto L9
    L10:
        int[] r02 = new int[r10];
        int r92 = 0;
    L11:
        if (r92 >= r10) goto L13;
        r02[r92] = ((Integer) r4.get(Integer.valueOf(r6[r92]))).intValue();
        r92 = r92 + 1;
        goto L11
    L13:
        int r42 = Math.min(r28, r10);
        if (r27.length == 0) goto L16;
        r42 = Math.min(r42, r27.length);
    L16:
        double[][] r62 = new double[r42][];
        int r93 = 0;
        int r112 = 0;
    L18:
        if (r93 >= r27.length) goto L20;
        r62[r93] = r7.fromInt(r27[r93]);
        r112 = r112 + 1;
        r93 = r93 + 1;
        goto L18
    L20:
        int r1 = r42 - r112;
        if (r1 <= 0) goto L25;
        int r94 = 0;
    L23:
        if (r94 >= r1) goto L25;
        r94 = r94 + 1;
    L25:
        int[] r13 = new int[r10];
        int r95 = 0;
    L26:
        if (r95 >= r10) goto L28;
        r13[r95] = r3.nextInt(r42);
        r95 = r95 + 1;
        goto L26
    L28:
        int[][] r32 = new int[r42][];
        int r96 = 0;
    L29:
        if (r96 >= r42) goto L31;
        r32[r96] = new int[r42];
        r96 = r96 + 1;
        goto L29
    L31:
        Distance[][] r97 = new Distance[r42][];
        int r113 = 0;
    L32:
        if (r113 >= r42) goto L37;
        r97[r113] = new Distance[r42];
        int r122 = 0;
    L34:
        if (r122 >= r42) goto L36;
        r97[r113][r122] = new Distance();
        r122 = r122 + 1;
        goto L34
    L36:
        r113 = r113 + 1;
        goto L32
    L37:
        int[] r114 = new int[r42];
        int r123 = 0;
    L39:
        if (r123 >= 10) goto L82;
        int r132 = 0;
    L41:
        if (r132 >= r42) goto L49;
        int r14 = r132 + 1;
        int r15 = r14;
    L43:
        if (r15 >= r42) goto L45;
        boolean r16 = r2;
        int[] r262 = r02;
        double r03 = r7.distance(r62[r132], r62[r15]);
        Distance r22 = r97[r15][r132];
        r22.distance = r03;
        r22.index = r132;
        Distance r23 = r97[r132][r15];
        r23.distance = r03;
        r23.index = r15;
        r15 = r15 + 1;
        r02 = r262;
        r13 = r13;
        r2 = r16;
        goto L43
    L45:
        int[] r263 = r02;
        int[] r272 = r13;
        boolean r162 = r2;
        Arrays.sort(r97[r132]);
        int r04 = 0;
    L46:
        if (r04 >= r42) goto L48;
        r32[r132][r04] = r97[r132][r04].index;
        r04 = r04 + 1;
        goto L46
    L48:
        r02 = r263;
        r13 = r272;
        r132 = r14;
        r2 = r162;
        goto L41
    L49:
        int[] r264 = r02;
        int[] r273 = r13;
        boolean r163 = r2;
        int r05 = 0;
        int r17 = 0;
    L50:
        if (r05 >= r10) goto L67;
        double[] r24 = r5[r05];
        int r8 = r273[r05];
        double r133 = r7.distance(r24, r62[r8]);
        int r18 = r05;
        double r19 = r133;
        int r06 = -1;
        int r152 = 0;
    L52:
        if (r152 >= r42) goto L60;
        int r222 = r17;
        double[][] r21 = r5;
        double[][] r232 = r62;
        if (r97[r8][r152].distance >= (4.0d * r133)) goto L59;
        double r52 = r7.distance(r24, r232[r152]);
        if (r52 >= r19) goto L59;
        r19 = r52;
        r06 = r152;
    L59:
        r152 = r152 + 1;
        r5 = r21;
        r17 = r222;
        r62 = r232;
        goto L52
    L60:
        int r223 = r17;
        double[][] r212 = r5;
        double[][] r233 = r62;
        if (r06 != (-1)) goto L63;
    L65:
        r17 = r223;
    L66:
        r05 = r18 + 1;
        r5 = r212;
        r62 = r233;
        goto L50
    L63:
        if (Math.abs(Math.sqrt(r19) - Math.sqrt(r133)) <= 3.0d) goto L65;
        r17 = r223 + 1;
        r273[r18] = r06;
        goto L66
    L67:
        double[][] r213 = r5;
        double[][] r234 = r62;
        if (r17 != 0) goto L71;
        if (r123 == 0) goto L71;
    L83:
        LinkedHashMap r07 = new LinkedHashMap();
        int r82 = 0;
    L84:
        if (r82 >= r42) goto L93;
        int r110 = r114[r82];
        if (r110 == 0) goto L92;
        int r25 = r7.toInt(r234[r82]);
        if (r07.containsKey(Integer.valueOf(r25)) == true) goto L92;
        r07.put(Integer.valueOf(r25), Integer.valueOf(r110));
    L92:
        r82 = r82 + 1;
        goto L84
    L93:
        return r07;
    L71:
        double[] r08 = new double[r42];
        double[] r111 = new double[r42];
        double[] r29 = new double[r42];
        char r53 = 0;
        Arrays.fill(r114, 0);
        int r63 = 0;
    L72:
        if (r63 >= r10) goto L74;
        int r134 = r273[r63];
        double[] r142 = r213[r63];
        int r153 = r264[r63];
        r114[r134] = r114[r134] + r153;
        double r83 = r153;
        r08[r134] = r08[r134] + (r142[r53] * r83);
        r111[r134] = r111[r134] + (r142[r163 ? 1 : 0] * r83);
        r29[r134] = r29[r134] + (r142[2] * r83);
        r63 = r63 + 1;
        r97 = r97;
        r53 = 0;
        goto L72
    L74:
        Distance[][] r54 = r97;
        int r64 = 0;
    L75:
        if (r64 >= r42) goto L81;
        int r84 = r114[r64];
        if (r84 != 0) goto L79;
        r234[r64] = new double[]{0.0d, 0.0d, 0.0d};
    L80:
        r64 = r64 + 1;
        goto L75
    L79:
        double r85 = r84;
        double r135 = r08[r64] / r85;
        double r182 = r111[r64] / r85;
        double r242 = r29[r64] / r85;
        double[] r86 = r234[r64];
        r86[0] = r135;
        r86[r163 ? 1 : 0] = r182;
        r86[2] = r242;
        goto L80
    L81:
        r123 = r123 + 1;
        r02 = r264;
        r13 = r273;
        r97 = r54;
        r2 = r163 ? 1 : 0;
        r5 = r213;
        r62 = r234;
        goto L39
    L82:
        r234 = r62;
        goto L83
    }
}
