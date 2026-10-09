package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    public static class ScoredComparator implements Comparator<ScoredHCT> {
        public ScoredComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ScoredHCT r1, ScoredHCT r2) {
            return compare2(r1, r2);
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(ScoredHCT r3, ScoredHCT r4) {
            return Double.compare(r4.score, r3.score);
        }
    }

    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct r1, double r2) {
            this.hct = r1;
            this.score = r2;
        }
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> r3) {
        return score(r3, 4, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> r2, int r3) {
        return score(r2, r3, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> r1, int r2, int r3) {
        return score(r1, r2, r3, true);
    }

    public static List<Integer> score(Map<Integer, Integer> r12, int r13, int r14, boolean r15) {
        ArrayList r02 = new ArrayList();
        int[] r2 = new int[360];
        Iterator<Map.Entry<Integer, Integer>> r122 = r12.entrySet().iterator();
        double r3 = 0.0d;
    L4:
        if (r122.hasNext() == false) goto L6;
        Map.Entry<Integer, Integer> r5 = r122.next();
        Hct r6 = Hct.fromInt(r5.getKey().intValue());
        r02.add(r6);
        int r62 = (int) Math.floor(r6.getHue());
        int r52 = r5.getValue().intValue();
        r2[r62] = r2[r62] + r52;
        r3 = r3 + r52;
        goto L4
    L6:
        double[] r123 = new double[360];
        int r53 = 0;
    L7:
        if (r53 >= 360) goto L13;
        double r63 = r2[r53] / r3;
        int r8 = r53 - 14;
    L10:
        if (r8 >= (r53 + 16)) goto L12;
        int r9 = MathUtils.sanitizeDegreesInt(r8);
        r123[r9] = r123[r9] + r63;
        r8 = r8 + 1;
        goto L10
    L12:
        r53 = r53 + 1;
        goto L7
    L13:
        ArrayList r1 = new ArrayList();
        Iterator r03 = r02.iterator();
    L15:
        if (r03.hasNext() == false) goto L28;
        Hct r22 = (Hct) r03.next();
        double r32 = r123[MathUtils.sanitizeDegreesInt((int) Math.round(r22.getHue()))];
        if (r15 == false) goto L23;
        if (r22.getChroma() < CUTOFF_CHROMA) goto L15;
        if (r32 <= CUTOFF_EXCITED_PROPORTION) goto L15;
    L23:
        double r33 = (r32 * 100.0d) * WEIGHT_PROPORTION;
        if (r22.getChroma() >= TARGET_CHROMA) goto L26;
        double r54 = WEIGHT_CHROMA_BELOW;
    L27:
        r1.add(new ScoredHCT(r22, r33 + ((r22.getChroma() - TARGET_CHROMA) * r54)));
        goto L15
    L26:
        r54 = WEIGHT_CHROMA_ABOVE;
        goto L27
    L28:
        Collections.sort(r1, new ScoredComparator());
        ArrayList r124 = new ArrayList();
        int r152 = 90;
    L30:
        if (r152 < 15) goto L47;
        r124.clear();
        Iterator r04 = r1.iterator();
    L33:
        if (r04.hasNext() == false) goto L44;
        Hct r23 = ((ScoredHCT) r04.next()).hct;
        Iterator r34 = r124.iterator();
    L36:
        if (r34.hasNext() == false) goto L40;
        if (MathUtils.differenceDegrees(r23.getHue(), ((Hct) r34.next()).getHue()) >= r152) goto L36;
    L42:
        if (r124.size() < r13) goto L33;
    L40:
        r124.add(r23);
    L44:
        if (r124.size() >= r13) goto L47;
        r152 = r152 - 1;
    L47:
        ArrayList r132 = new ArrayList();
        if (r124.isEmpty() == false) goto L51;
        r132.add(Integer.valueOf(r14));
        return r132;
    L51:
        Iterator r125 = r124.iterator();
    L53:
        if (r125.hasNext() == false) goto L55;
        r132.add(Integer.valueOf(((Hct) r125.next()).toInt()));
        goto L53
    L55:
        return r132;
    }
}
