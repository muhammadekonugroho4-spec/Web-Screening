package com.github.mikephil.charting.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ExceptionCode;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class Utils {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final double DOUBLE_EPSILON = 0.0d;
    public static final float FDEG2RAD = 0.017453292f;
    public static final float FLOAT_EPSILON = 0.0f;
    private static final int[] POW_10 = null;
    private static Rect mCalcTextHeightRect = null;
    private static Rect mCalcTextSizeRect = null;
    private static ValueFormatter mDefaultValueFormatter = null;
    private static Rect mDrawTextRectBuffer = null;
    private static Rect mDrawableBoundsCache = null;
    private static Paint.FontMetrics mFontMetrics = null;
    private static Paint.FontMetrics mFontMetricsBuffer = null;
    private static int mMaximumFlingVelocity = 8000;
    private static DisplayMetrics mMetrics = null;
    private static int mMinimumFlingVelocity = 50;

    static {
        DOUBLE_EPSILON = Double.longBitsToDouble(1);
        FLOAT_EPSILON = Float.intBitsToFloat(1);
        mCalcTextHeightRect = new Rect();
        mFontMetrics = new Paint.FontMetrics();
        mCalcTextSizeRect = new Rect();
        POW_10 = new int[]{1, 10, 100, 1000, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};
        mDefaultValueFormatter = generateDefaultValueFormatter();
        mDrawableBoundsCache = new Rect();
        mDrawTextRectBuffer = new Rect();
        mFontMetricsBuffer = new Paint.FontMetrics();
    }

    public Utils() {
    }

    public static int calcTextHeight(Paint r3, String r4) {
        Rect r02 = mCalcTextHeightRect;
        r02.set(0, 0, 0, 0);
        r3.getTextBounds(r4, 0, r4.length(), r02);
        return r02.height();
    }

    public static FSize calcTextSize(Paint r1, String r2) {
        FSize r02 = FSize.getInstance(0.0f, 0.0f);
        calcTextSize(r1, r2, r02);
        return r02;
    }

    public static int calcTextWidth(Paint r02, String r1) {
        return (int) r02.measureText(r1);
    }

    public static float convertDpToPixel(float r2) {
        DisplayMetrics r02 = mMetrics;
        if (r02 != null) goto L7;
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return r2;
    L7:
        return r2 * r02.density;
    }

    public static int[] convertIntegers(List<Integer> r1) {
        int[] r02 = new int[r1.size()];
        copyIntegers(r1, r02);
        return r02;
    }

    public static float convertPixelsToDp(float r2) {
        DisplayMetrics r02 = mMetrics;
        if (r02 != null) goto L7;
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.");
        return r2;
    L7:
        return r2 / r02.density;
    }

    public static String[] convertStrings(List<String> r4) {
        int r02 = r4.size();
        String[] r1 = new String[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = r4.get(r2);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static void copyIntegers(List<Integer> r3, int[] r4) {
        if (r4.length >= r3.size()) goto L5;
        int r02 = r4.length;
    L6:
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L9;
        r4[r1] = r3.get(r1).intValue();
        r1 = r1 + 1;
        goto L7
    L9:
        return;
    L5:
        r02 = r3.size();
        goto L6
    }

    public static void copyStrings(List<String> r3, String[] r4) {
        if (r4.length >= r3.size()) goto L5;
        int r02 = r4.length;
    L6:
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L9;
        r4[r1] = r3.get(r1);
        r1 = r1 + 1;
        goto L7
    L9:
        return;
    L5:
        r02 = r3.size();
        goto L6
    }

    public static void drawImage(Canvas r2, Drawable r3, int r4, int r5, int r6, int r7) {
        MPPointF r02 = MPPointF.getInstance();
        r02.f37851x = r4 - (r6 / 2);
        r02.f37852y = r5 - (r7 / 2);
        r3.copyBounds(mDrawableBoundsCache);
        Rect r42 = mDrawableBoundsCache;
        int r52 = r42.left;
        int r43 = r42.top;
        r3.setBounds(r52, r43, r52 + r6, r6 + r43);
        int r44 = r2.save();
        r2.translate(r02.f37851x, r02.f37852y);
        r3.draw(r2);
        r2.restoreToCount(r44);
    }

    public static void drawMultilineText(Canvas r7, StaticLayout r8, float r9, float r10, TextPaint r11, MPPointF r12, float r13) {
        float r02 = r11.getFontMetrics(mFontMetricsBuffer);
        float r1 = r8.getWidth();
        float r2 = r8.getLineCount() * r02;
        float r03 = 0.0f - mDrawTextRectBuffer.left;
        float r4 = r2 + 0.0f;
        Paint.Align r5 = r11.getTextAlign();
        r11.setTextAlign(Paint.Align.LEFT);
        if (r13 == 0.0f) goto L10;
        float r04 = r03 - (r1 * 0.5f);
        float r42 = r4 - (r2 * 0.5f);
        if (r12.f37851x == 0.5f) goto L7;
    L8:
        FSize r14 = getSizeOfRotatedRectangleByDegrees(r1, r2, r13);
        r9 = r9 - (r14.width * (r12.f37851x - 0.5f));
        r10 = r10 - (r14.height * (r12.f37852y - 0.5f));
        FSize.recycleInstance(r14);
    L9:
        r7.save();
        r7.translate(r9, r10);
        r7.rotate(r13);
        r7.translate(r04, r42);
        r8.draw(r7);
        r7.restore();
    L16:
        r11.setTextAlign(r5);
        return;
    L7:
        if (r12.f37852y == 0.5f) goto L9;
    L10:
        float r132 = r12.f37851x;
        if (r132 == 0.0f) goto L13;
    L14:
        r03 = r03 - (r1 * r132);
        r4 = r4 - (r2 * r12.f37852y);
    L15:
        r7.save();
        r7.translate(r03 + r9, r4 + r10);
        r8.draw(r7);
        r7.restore();
        goto L16
    L13:
        if (r12.f37852y == 0.0f) goto L15;
        goto L14
    }

    public static void drawXAxisValue(Canvas r7, String r8, float r9, float r10, Paint r11, MPPointF r12, float r13) {
        float r02 = r11.getFontMetrics(mFontMetricsBuffer);
        r11.getTextBounds(r8, 0, r8.length(), mDrawTextRectBuffer);
        float r1 = 0.0f - mDrawTextRectBuffer.left;
        float r3 = (-mFontMetricsBuffer.ascent) + 0.0f;
        Paint.Align r4 = r11.getTextAlign();
        r11.setTextAlign(Paint.Align.LEFT);
        if (r13 == 0.0f) goto L11;
        float r14 = r1 - (mDrawTextRectBuffer.width() * 0.5f);
        float r32 = r3 - (r02 * 0.5f);
        if (r12.f37851x == 0.5f) goto L7;
    L8:
        FSize r03 = getSizeOfRotatedRectangleByDegrees(mDrawTextRectBuffer.width(), r02, r13);
        r9 = r9 - (r03.width * (r12.f37851x - 0.5f));
        r10 = r10 - (r03.height * (r12.f37852y - 0.5f));
        FSize.recycleInstance(r03);
    L9:
        r7.save();
        r7.translate(r9, r10);
        r7.rotate(r13);
        r7.drawText(r8, r14, r32, r11);
        r7.restore();
    L16:
        r11.setTextAlign(r4);
        return;
    L7:
        if (r12.f37852y == 0.5f) goto L9;
    L11:
        if (r12.f37851x == 0.0f) goto L13;
    L14:
        r1 = r1 - (mDrawTextRectBuffer.width() * r12.f37851x);
        r3 = r3 - (r02 * r12.f37852y);
    L15:
        r7.drawText(r8, r1 + r9, r3 + r10, r11);
        goto L16
    L13:
        if (r12.f37852y == 0.0f) goto L15;
        goto L14
    }

    public static String formatNumber(float r1, int r2, boolean r3) {
        return formatNumber(r1, r2, r3, '.');
    }

    private static ValueFormatter generateDefaultValueFormatter() {
        return new DefaultValueFormatter(1);
    }

    public static int getDecimals(float r2) {
        float r22 = roundToNextSignificant(r2);
        if (Float.isInfinite(r22) == false) goto L7;
        return 0;
    L7:
        return ((int) Math.ceil(-Math.log10(r22))) + 2;
    }

    public static ValueFormatter getDefaultValueFormatter() {
        return mDefaultValueFormatter;
    }

    public static float getLineHeight(Paint r1) {
        return getLineHeight(r1, mFontMetrics);
    }

    public static float getLineSpacing(Paint r1) {
        return getLineSpacing(r1, mFontMetrics);
    }

    public static int getMaximumFlingVelocity() {
        return mMaximumFlingVelocity;
    }

    public static int getMinimumFlingVelocity() {
        return mMinimumFlingVelocity;
    }

    public static float getNormalizedAngle(float r2) {
    L3:
        if (r2 >= 0.0f) goto L6;
        r2 = r2 + 360.0f;
        goto L3
    L6:
        return r2 % 360.0f;
    }

    public static MPPointF getPosition(MPPointF r1, float r2, float r3) {
        MPPointF r02 = MPPointF.getInstance(0.0f, 0.0f);
        getPosition(r1, r2, r3, r02);
        return r02;
    }

    public static int getSDKInt() {
        return Build.VERSION.SDK_INT;
    }

    public static FSize getSizeOfRotatedRectangleByDegrees(FSize r1, float r2) {
        float r02 = r1.width;
        float r12 = r1.height;
        return getSizeOfRotatedRectangleByRadians(r02, r12, r2 * 0.017453292f);
    }

    public static FSize getSizeOfRotatedRectangleByRadians(FSize r1, float r2) {
        return getSizeOfRotatedRectangleByRadians(r1.width, r1.height, r2);
    }

    public static void init(Context r2) {
        if (r2 != null) goto L5;
        mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
        Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        return;
    L5:
        ViewConfiguration r02 = ViewConfiguration.get(r2);
        mMinimumFlingVelocity = r02.getScaledMinimumFlingVelocity();
        mMaximumFlingVelocity = r02.getScaledMaximumFlingVelocity();
        mMetrics = r2.getResources().getDisplayMetrics();
    }

    public static double nextUp(double r4) {
        if (r4 != Double.POSITIVE_INFINITY) goto L5;
        return r4;
    L5:
        double r42 = r4 + 0.0d;
        long r2 = Double.doubleToRawLongBits(r42);
        if (r42 < 0.0d) goto L8;
        long r43 = 1;
    L10:
        return Double.longBitsToDouble(r2 + r43);
    L8:
        r43 = -1;
        goto L10
    }

    @SuppressLint({"NewApi"})
    public static void postInvalidateOnAnimation(View r02) {
        r02.postInvalidateOnAnimation();
    }

    public static float roundToNextSignificant(double r5) {
        if (Double.isInfinite(r5) == false) goto L5;
        return 0.0f;
    L5:
        if (Double.isNaN(r5) == false) goto L7;
        return 0.0f;
    L7:
        if (r5 != 0.0d) goto L10;
        return 0.0f;
    L10:
        if (r5 >= 0.0d) goto L12;
        double r02 = -r5;
    L14:
        return Math.round(r5 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(r02)))));
    L12:
        r02 = r5;
        goto L14
    }

    public static void velocityTrackerPointerUpCleanUpIfNecessary(MotionEvent r7, VelocityTracker r8) {
        r8.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        int r02 = r7.getActionIndex();
        int r1 = r7.getPointerId(r02);
        float r2 = r8.getXVelocity(r1);
        float r12 = r8.getYVelocity(r1);
        int r3 = r7.getPointerCount();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L11;
        if (r4 == r02) goto L10;
        int r5 = r7.getPointerId(r4);
        if (((r8.getXVelocity(r5) * r2) + (r8.getYVelocity(r5) * r12)) >= 0.0f) goto L10;
        r8.clear();
        return;
    L10:
        r4 = r4 + 1;
        goto L3
    }

    public static String formatNumber(float r18, int r19, boolean r20, char r21) {
        float r02 = r18;
        int r1 = 35;
        char[] r2 = new char[35];
        if (r02 != 0.0f) goto L6;
        return "0";
    L6:
        int r6 = 0;
        if (r02 < 1.0f) goto L9;
    L11:
        boolean r4 = false;
    L13:
        if (r02 >= 0.0f) goto L15;
        r02 = -r02;
        boolean r3 = true;
    L16:
        int[] r7 = POW_10;
        if (r19 <= r7.length) goto L19;
        int r8 = r7.length - 1;
    L20:
        long r9 = Math.round(r02 * r7[r8]);
        int r03 = 34;
        boolean r72 = false;
    L22:
        if (r9 == 0) goto L24;
    L32:
        char[] r17 = r2;
        int r12 = (int) (r9 % 10);
        r9 = r9 / 10;
        int r22 = r03 - 1;
        r17[r03] = (char) (r12 + 48);
        int r13 = r6 + 1;
        if (r13 != r8) goto L35;
        r03 = r03 - 2;
        r17[r22] = ',';
        r6 = r6 + 2;
        r72 = true;
    L48:
        r2 = r17;
        r1 = 35;
        goto L22
    L35:
        if (r20 == true) goto L37;
    L47:
        r6 = r13;
        r03 = r22;
        goto L48
    L37:
        if (r9 == 0) goto L47;
        if (r13 <= r8) goto L47;
        if (r72 == false) goto L45;
        if (((r13 - r8) % 4) != 0) goto L47;
        r03 = r03 - 2;
        r17[r22] = r21;
    L43:
        r6 = r6 + 2;
        goto L48
    L45:
        if (((r13 - r8) % 4) != 3) goto L47;
        r03 = r03 - 2;
        r17[r22] = r21;
        goto L43
    L24:
        if (r6 < (r8 + 1)) goto L32;
        if (r4 == false) goto L28;
        r2[r03] = '0';
        r6 = r6 + 1;
        r03 = r03 - 1;
    L28:
        if (r3 == false) goto L30;
        r2[r03] = '-';
        r6 = r6 + 1;
    L30:
        int r14 = r1 - r6;
        return String.valueOf(r2, r14, 35 - r14);
    L19:
        r8 = r19;
        goto L20
    L15:
        r3 = false;
        goto L16
    L9:
        if (r02 <= (-1.0f)) goto L11;
        r4 = true;
        goto L13
    }

    public static float getLineHeight(Paint r02, Paint.FontMetrics r1) {
        r02.getFontMetrics(r1);
        return r1.descent - r1.ascent;
    }

    public static float getLineSpacing(Paint r1, Paint.FontMetrics r2) {
        r1.getFontMetrics(r2);
        return (r2.ascent - r2.top) + r2.bottom;
    }

    public static FSize getSizeOfRotatedRectangleByDegrees(float r1, float r2, float r3) {
        return getSizeOfRotatedRectangleByRadians(r1, r2, r3 * 0.017453292f);
    }

    public static FSize getSizeOfRotatedRectangleByRadians(float r4, float r5, float r6) {
        double r02 = r6;
        return FSize.getInstance(Math.abs(((float) Math.cos(r02)) * r4) + Math.abs(((float) Math.sin(r02)) * r5), Math.abs(r4 * ((float) Math.sin(r02))) + Math.abs(r5 * ((float) Math.cos(r02))));
    }

    public static void calcTextSize(Paint r3, String r4, FSize r5) {
        Rect r02 = mCalcTextSizeRect;
        r02.set(0, 0, 0, 0);
        r3.getTextBounds(r4, 0, r4.length(), r02);
        r5.width = r02.width();
        r5.height = r02.height();
    }

    public static void getPosition(MPPointF r6, float r7, float r8, MPPointF r9) {
        double r2 = r7;
        double r72 = r8;
        r9.f37851x = (float) (r6.f37851x + (Math.cos(Math.toRadians(r72)) * r2));
        r9.f37852y = (float) (r6.f37852y + (r2 * Math.sin(Math.toRadians(r72))));
    }

    @Deprecated
    public static void init(Resources r02) {
        mMetrics = r02.getDisplayMetrics();
        mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
        mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
    }

    public static void drawMultilineText(Canvas r10, String r11, float r12, float r13, TextPaint r14, FSize r15, MPPointF r16, float r17) {
        drawMultilineText(r10, new StaticLayout(r11, 0, r11.length(), r14, (int) Math.max(Math.ceil(r15.width), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), r12, r13, r14, r16, r17);
    }
}
