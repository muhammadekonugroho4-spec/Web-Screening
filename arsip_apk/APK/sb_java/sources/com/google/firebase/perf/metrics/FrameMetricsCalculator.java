package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;

/* loaded from: classes6.dex */
public class FrameMetricsCalculator {

    public static class PerfFrameMetrics {
        int frozenFrames;
        int slowFrames;
        int totalFrames;

        public PerfFrameMetrics(int r1, int r2, int r3) {
            this.totalFrames = r1;
            this.slowFrames = r2;
            this.frozenFrames = r3;
        }

        public PerfFrameMetrics deltaFrameMetricsFromSnapshot(PerfFrameMetrics r4) {
            return new PerfFrameMetrics(this.totalFrames - r4.getTotalFrames(), this.slowFrames - r4.getSlowFrames(), this.frozenFrames - r4.getFrozenFrames());
        }

        public int getFrozenFrames() {
            return this.frozenFrames;
        }

        public int getSlowFrames() {
            return this.slowFrames;
        }

        public int getTotalFrames() {
            return this.totalFrames;
        }
    }

    public FrameMetricsCalculator() {
    }

    public static PerfFrameMetrics calculateFrameMetrics(SparseIntArray[] r7) {
        int r02 = 0;
        if (r7 == null) goto L17;
        SparseIntArray r72 = r7[0];
        if (r72 == null) goto L17;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r02 >= r72.size()) goto L16;
        int r4 = r72.keyAt(r02);
        int r5 = r72.valueAt(r02);
        r1 = r1 + r5;
        if (r4 <= 700) goto L13;
        r3 = r3 + r5;
    L13:
        if (r4 <= 16) goto L15;
        r2 = r2 + r5;
    L15:
        r02 = r02 + 1;
        goto L8
    L16:
        r02 = r1;
    L19:
        return new PerfFrameMetrics(r02, r2, r3);
    L17:
        r2 = 0;
        r3 = 0;
        goto L19
    }
}
