package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.d;

/* loaded from: classes5.dex */
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;
    private static final int[] cornerColors = null;
    private static final float[] cornerPositions = null;
    private static final int[] edgeColors = null;
    private static final float[] edgePositions = null;
    private final Paint cornerShadowPaint;
    private final Paint edgeShadowPaint;
    private final Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;
    private final Paint shadowPaint;
    private int shadowStartColor;
    private final Paint transparentPaint;

    static {
        edgeColors = new int[3];
        edgePositions = new float[]{0.0f, 0.5f, 1.0f};
        cornerColors = new int[4];
        cornerPositions = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    }

    public ShadowRenderer() {
        this(-16777216);
    }

    public void drawCornerShadow(Canvas r21, Matrix r22, RectF r23, int r24, float r25, float r26) {
        if (r26 >= 0.0f) goto L5;
        boolean r6 = true;
    L6:
        Path r9 = this.scratch;
        if (r6 == false) goto L9;
        int[] r12 = cornerColors;
        r12[0] = 0;
        r12[1] = this.shadowEndColor;
        r12[2] = this.shadowMiddleColor;
        r12[3] = this.shadowStartColor;
        float r122 = r25;
    L10:
        float r16 = r23.width() / 2.0f;
        if (r16 > 0.0f) goto L13;
        return;
    L13:
        float r3 = 1.0f - (r24 / r16);
        float[] r18 = cornerPositions;
        r18[1] = r3;
        r18[2] = ((1.0f - r3) / 2.0f) + r3;
        this.cornerShadowPaint.setShader(new RadialGradient(r23.centerX(), r23.centerY(), r16, cornerColors, r18, Shader.TileMode.CLAMP));
        r21.save();
        r21.concat(r22);
        r21.scale(1.0f, r23.height() / r23.width());
        if (r6 == true) goto L16;
        r21.clipPath(r9, Region.Op.DIFFERENCE);
        r21.drawPath(r9, this.transparentPaint);
    L16:
        r21.drawArc(r23, r122, r26, true, this.cornerShadowPaint);
        r21.restore();
        return;
    L9:
        r9.rewind();
        r9.moveTo(r23.centerX(), r23.centerY());
        r122 = r25;
        r9.arcTo(r23, r122, r26);
        r9.close();
        float r13 = -r24;
        r23.inset(r13, r13);
        int[] r132 = cornerColors;
        r132[0] = 0;
        r132[1] = this.shadowStartColor;
        r132[2] = this.shadowMiddleColor;
        r132[3] = this.shadowEndColor;
        goto L10
    L5:
        r6 = false;
        goto L6
    }

    public void drawEdgeShadow(Canvas r10, Matrix r11, RectF r12, int r13) {
        r12.bottom += r13;
        r12.offset(0.0f, -r13);
        int[] r6 = edgeColors;
        r6[0] = this.shadowEndColor;
        r6[1] = this.shadowMiddleColor;
        r6[2] = this.shadowStartColor;
        Paint r132 = this.edgeShadowPaint;
        float r2 = r12.left;
        r132.setShader(new LinearGradient(r2, r12.top, r2, r12.bottom, r6, edgePositions, Shader.TileMode.CLAMP));
        r10.save();
        r10.concat(r11);
        r10.drawRect(r12, this.edgeShadowPaint);
        r10.restore();
    }

    public void drawInnerCornerShadow(Canvas r8, Matrix r9, RectF r10, int r11, float r12, float r13, float[] r14) {
        if (r13 <= 0.0f) goto L5;
        r12 = r12 + r13;
        r13 = -r13;
    L5:
        float r5 = r12;
        float r6 = r13;
        drawCornerShadow(r8, r9, r10, r11, r5, r6);
        Path r82 = this.scratch;
        r82.rewind();
        r82.moveTo(r14[0], r14[1]);
        r82.arcTo(r10, r5, r6);
        r82.close();
        r8.save();
        r8.concat(r9);
        r8.scale(1.0f, r10.height() / r10.width());
        r8.drawPath(r82, this.transparentPaint);
        r8.drawPath(r82, this.shadowPaint);
        r8.restore();
    }

    public Paint getShadowPaint() {
        return this.shadowPaint;
    }

    public void setShadowColor(int r2) {
        this.shadowStartColor = d.p(r2, COLOR_ALPHA_START);
        this.shadowMiddleColor = d.p(r2, 20);
        this.shadowEndColor = d.p(r2, 0);
        this.shadowPaint.setColor(this.shadowStartColor);
    }

    public ShadowRenderer(int r3) {
        this.scratch = new Path();
        Paint r02 = new Paint();
        this.transparentPaint = r02;
        this.shadowPaint = new Paint();
        setShadowColor(r3);
        r02.setColor(0);
        Paint r32 = new Paint(4);
        this.cornerShadowPaint = r32;
        r32.setStyle(Paint.Style.FILL);
        this.edgeShadowPaint = new Paint(r32);
    }
}
