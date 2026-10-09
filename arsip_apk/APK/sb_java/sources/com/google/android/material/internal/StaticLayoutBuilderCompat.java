package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Constructor;

/* loaded from: classes5.dex */
public final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static Constructor<StaticLayout> constructor;
    private static boolean initialized;
    private static Object textDirection;
    private Layout.Alignment alignment;
    private TextUtils.TruncateAt ellipsize;
    private int end;
    private int hyphenationFrequency;
    private boolean includePad;
    private boolean isRtl;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private final TextPaint paint;
    private CharSequence source;
    private int start;
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;

    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable r3) {
            super("Error thrown initializing StaticLayout " + r3.getMessage(), r3);
        }
    }

    static {
        DEFAULT_HYPHENATION_FREQUENCY = 1;
    }

    private StaticLayoutBuilderCompat(CharSequence r1, TextPaint r2, int r3) {
        this.source = r1;
        this.paint = r2;
        this.width = r3;
        this.start = 0;
        this.end = r1.length();
        this.alignment = Layout.Alignment.ALIGN_NORMAL;
        this.maxLines = Integer.MAX_VALUE;
        this.lineSpacingAdd = 0.0f;
        this.lineSpacingMultiplier = 1.0f;
        this.hyphenationFrequency = DEFAULT_HYPHENATION_FREQUENCY;
        this.includePad = true;
        this.ellipsize = null;
    }

    private void createConstructorWithReflection() throws StaticLayoutBuilderCompatException {
        if (initialized == false) goto L15;
        return;
    L15:
    L8:
        e = move-exception;
        throw new StaticLayoutBuilderCompatException(e);
    L6:
        if (this.isRtl == false) goto L10;
        TextDirectionHeuristic r02 = TextDirectionHeuristics.RTL;     // Catch: Exception -> L8
    L11:
        textDirection = r02;     // Catch: Exception -> L8
        Class r3 = Integer.TYPE;     // Catch: Exception -> L8
        Class r9 = Float.TYPE;     // Catch: Exception -> L8
        Constructor<StaticLayout> r03 = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, r3, r3, TextPaint.class, r3, Layout.Alignment.class, TextDirectionHeuristic.class, r9, r9, Boolean.TYPE, TextUtils.TruncateAt.class, r3, r3});     // Catch: Exception -> L8
        constructor = r03;     // Catch: Exception -> L8
        r03.setAccessible(true);     // Catch: Exception -> L8
        initialized = true;     // Catch: Exception -> L8
        return;
    L10:
        r02 = TextDirectionHeuristics.LTR;     // Catch: Exception -> L8
        goto L11
    }

    public static StaticLayoutBuilderCompat obtain(CharSequence r1, TextPaint r2, int r3) {
        return new StaticLayoutBuilderCompat(r1, r2, r3);
    }

    public StaticLayout build() throws StaticLayoutBuilderCompatException {
        if (this.source != null) goto L5;
        this.source = "";
    L5:
        int r02 = Math.max(0, this.width);
        CharSequence r1 = this.source;
        if (this.maxLines != 1) goto L8;
        r1 = TextUtils.ellipsize(r1, this.paint, r02, this.ellipsize);
    L8:
        int r2 = Math.min(r1.length(), this.end);
        this.end = r2;
        if (this.isRtl == true) goto L11;
    L13:
        StaticLayout.Builder r03 = StaticLayout.Builder.obtain(r1, this.start, r2, this.paint, r02);
        r03.setAlignment(this.alignment);
        r03.setIncludePad(this.includePad);
        if (this.isRtl == false) goto L16;
        TextDirectionHeuristic r12 = TextDirectionHeuristics.RTL;
    L17:
        r03.setTextDirection(r12);
        TextUtils.TruncateAt r13 = this.ellipsize;
        if (r13 == null) goto L20;
        r03.setEllipsize(r13);
    L20:
        r03.setMaxLines(this.maxLines);
        float r14 = this.lineSpacingAdd;
        if (r14 == 0.0f) goto L23;
    L24:
        r03.setLineSpacing(r14, this.lineSpacingMultiplier);
    L26:
        if (this.maxLines <= 1) goto L28;
        r03.setHyphenationFrequency(this.hyphenationFrequency);
    L28:
        StaticLayoutBuilderConfigurer r15 = this.staticLayoutBuilderConfigurer;
        if (r15 == null) goto L32;
        r15.configure(r03);
    L32:
        return r03.build();
    L23:
        if (this.lineSpacingMultiplier == 1.0f) goto L26;
    L16:
        r12 = TextDirectionHeuristics.LTR;
        goto L17
    L11:
        if (this.maxLines != 1) goto L13;
        this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
        goto L13
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setAlignment(Layout.Alignment r1) {
        this.alignment = r1;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEllipsize(TextUtils.TruncateAt r1) {
        this.ellipsize = r1;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEnd(int r1) {
        this.end = r1;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setHyphenationFrequency(int r1) {
        this.hyphenationFrequency = r1;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setIncludePad(boolean r1) {
        this.includePad = r1;
        return this;
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean r1) {
        this.isRtl = r1;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setLineSpacing(float r1, float r2) {
        this.lineSpacingAdd = r1;
        this.lineSpacingMultiplier = r2;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setMaxLines(int r1) {
        this.maxLines = r1;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStart(int r1) {
        this.start = r1;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer r1) {
        this.staticLayoutBuilderConfigurer = r1;
        return this;
    }
}
