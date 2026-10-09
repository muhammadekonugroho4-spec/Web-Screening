package com.github.mikephil.charting.data.filter;

import android.annotation.TargetApi;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class Approximator {

    public class Line {
        private float dx;
        private float dy;
        private float exsy;
        private float length;
        private float[] points;
        private float sxey;
        final /* synthetic */ Approximator this$0;

        public Line(Approximator r3, float r4, float r5, float r6, float r7) {
            this.this$0 = r3;
            this.dx = r4 - r6;
            this.dy = r5 - r7;
            this.sxey = r4 * r7;
            this.exsy = r6 * r5;
            this.length = (float) Math.sqrt((r3 * r3) + (r0 * r0));
            this.points = new float[]{r4, r5, r6, r7};
        }

        public float distance(float r2, float r3) {
            return Math.abs((((this.dy * r2) - (this.dx * r3)) + this.sxey) - this.exsy) / this.length;
        }

        public float[] getPoints() {
            return this.points;
        }
    }

    public Approximator() {
    }

    public float[] concat(float[]... r10) {
        int r02 = r10.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r3 = r3 + r10[r2].length;
        r2 = r2 + 1;
        goto L3
    L5:
        float[] r03 = new float[r3];
        int r22 = r10.length;
        int r32 = 0;
        int r4 = 0;
    L6:
        if (r32 >= r22) goto L11;
        float[] r5 = r10[r32];
        int r6 = r5.length;
        int r7 = 0;
    L8:
        if (r7 >= r6) goto L10;
        r03[r4] = r5[r7];
        r4 = r4 + 1;
        r7 = r7 + 1;
        goto L8
    L10:
        r32 = r32 + 1;
        goto L6
    L11:
        return r03;
    }

    @TargetApi(9)
    public float[] reduceWithDouglasPeucker(float[] r10, float r11) {
        Line r02 = new Line(this, r10[0], r10[1], r10[r10.length - 2], r10[r10.length - 1]);
        float r2 = 0.0f;
        int r4 = 0;
        int r3 = 2;
    L4:
        if (r3 >= (r10.length - 2)) goto L10;
        float r5 = r02.distance(r10[r3], r10[r3 + 1]);
        if (r5 <= r2) goto L8;
        r4 = r3;
        r2 = r5;
    L8:
        r3 = r3 + 2;
        goto L4
    L10:
        if (r2 <= r11) goto L14;
        float[] r03 = reduceWithDouglasPeucker(Arrays.copyOfRange(r10, 0, r4 + 2), r11);
        float[] r102 = reduceWithDouglasPeucker(Arrays.copyOfRange(r10, r4, r10.length), r11);
        return concat(new float[][]{r03, Arrays.copyOfRange(r102, 2, r102.length)});
    L14:
        return r02.getPoints();
    }
}
