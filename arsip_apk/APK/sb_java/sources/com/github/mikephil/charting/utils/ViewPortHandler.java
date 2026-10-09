package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes4.dex */
public class ViewPortHandler {
    protected Matrix mCenterViewPortMatrixBuffer;
    protected float mChartHeight;
    protected float mChartWidth;
    protected RectF mContentRect;
    protected final Matrix mMatrixTouch;
    private float mMaxScaleX;
    private float mMaxScaleY;
    private float mMinScaleX;
    private float mMinScaleY;
    private float mScaleX;
    private float mScaleY;
    private float mTransOffsetX;
    private float mTransOffsetY;
    private float mTransX;
    private float mTransY;
    protected final float[] matrixBuffer;
    protected float[] valsBufferForFitScreen;

    public ViewPortHandler() {
        this.mMatrixTouch = new Matrix();
        this.mContentRect = new RectF();
        this.mChartWidth = 0.0f;
        this.mChartHeight = 0.0f;
        this.mMinScaleY = 1.0f;
        this.mMaxScaleY = Float.MAX_VALUE;
        this.mMinScaleX = 1.0f;
        this.mMaxScaleX = Float.MAX_VALUE;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mTransX = 0.0f;
        this.mTransY = 0.0f;
        this.mTransOffsetX = 0.0f;
        this.mTransOffsetY = 0.0f;
        this.valsBufferForFitScreen = new float[9];
        this.mCenterViewPortMatrixBuffer = new Matrix();
        this.matrixBuffer = new float[9];
    }

    public boolean canZoomInMoreX() {
        if (this.mScaleX >= this.mMaxScaleX) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean canZoomInMoreY() {
        if (this.mScaleY >= this.mMaxScaleY) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean canZoomOutMoreX() {
        if (this.mScaleX <= this.mMinScaleX) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean canZoomOutMoreY() {
        if (this.mScaleY <= this.mMinScaleY) goto L6;
        return true;
    L6:
        return false;
    }

    public void centerViewPort(float[] r5, View r6) {
        Matrix r02 = this.mCenterViewPortMatrixBuffer;
        r02.reset();
        r02.set(this.mMatrixTouch);
        float r1 = r5[0] - offsetLeft();
        r02.postTranslate(-r1, -(r5[1] - offsetTop()));
        refresh(r02, r6, true);
    }

    public float contentBottom() {
        return this.mContentRect.bottom;
    }

    public float contentHeight() {
        return this.mContentRect.height();
    }

    public float contentLeft() {
        return this.mContentRect.left;
    }

    public float contentRight() {
        return this.mContentRect.right;
    }

    public float contentTop() {
        return this.mContentRect.top;
    }

    public float contentWidth() {
        return this.mContentRect.width();
    }

    public Matrix fitScreen() {
        Matrix r02 = new Matrix();
        fitScreen(r02);
        return r02;
    }

    public float getChartHeight() {
        return this.mChartHeight;
    }

    public float getChartWidth() {
        return this.mChartWidth;
    }

    public MPPointF getContentCenter() {
        return MPPointF.getInstance(this.mContentRect.centerX(), this.mContentRect.centerY());
    }

    public RectF getContentRect() {
        return this.mContentRect;
    }

    public Matrix getMatrixTouch() {
        return this.mMatrixTouch;
    }

    public float getMaxScaleX() {
        return this.mMaxScaleX;
    }

    public float getMaxScaleY() {
        return this.mMaxScaleY;
    }

    public float getMinScaleX() {
        return this.mMinScaleX;
    }

    public float getMinScaleY() {
        return this.mMinScaleY;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public float getSmallestContentExtension() {
        return Math.min(this.mContentRect.width(), this.mContentRect.height());
    }

    public float getTransX() {
        return this.mTransX;
    }

    public float getTransY() {
        return this.mTransY;
    }

    public boolean hasChartDimens() {
        if (this.mChartHeight > 0.0f) goto L5;
        return false;
    L5:
        if (this.mChartWidth <= 0.0f) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean hasNoDragOffset() {
        if (this.mTransOffsetX <= 0.0f) goto L5;
        return false;
    L5:
        if (this.mTransOffsetY > 0.0f) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isFullyZoomedOut() {
        if (isFullyZoomedOutX() == true) goto L5;
        return false;
    L5:
        if (isFullyZoomedOutY() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isFullyZoomedOutX() {
        float r02 = this.mScaleX;
        float r1 = this.mMinScaleX;
        if (r02 <= r1) goto L5;
        return false;
    L5:
        if (r1 > 1.0f) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isFullyZoomedOutY() {
        float r02 = this.mScaleY;
        float r1 = this.mMinScaleY;
        if (r02 <= r1) goto L5;
        return false;
    L5:
        if (r1 > 1.0f) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isInBounds(float r1, float r2) {
        if (isInBoundsX(r1) == true) goto L5;
        return false;
    L5:
        if (isInBoundsY(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isInBoundsBottom(float r2) {
        if (this.mContentRect.bottom < (((int) (r2 * 100.0f)) / 100.0f)) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isInBoundsLeft(float r3) {
        if (this.mContentRect.left > (r3 + 1.0f)) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isInBoundsRight(float r3) {
        if (this.mContentRect.right < ((((int) (r3 * 100.0f)) / 100.0f) - 1.0f)) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isInBoundsTop(float r2) {
        if (this.mContentRect.top > r2) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isInBoundsX(float r2) {
        if (isInBoundsLeft(r2) == true) goto L5;
        return false;
    L5:
        if (isInBoundsRight(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isInBoundsY(float r2) {
        if (isInBoundsTop(r2) == true) goto L5;
        return false;
    L5:
        if (isInBoundsBottom(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public void limitTransAndScale(Matrix r10, RectF r11) {
        r10.getValues(this.matrixBuffer);
        float[] r02 = this.matrixBuffer;
        float r2 = r02[2];
        float r4 = r02[0];
        float r6 = r02[5];
        float r03 = r02[4];
        this.mScaleX = Math.min(Math.max(this.mMinScaleX, r4), this.mMaxScaleX);
        this.mScaleY = Math.min(Math.max(this.mMinScaleY, r03), this.mMaxScaleY);
        if (r11 == null) goto L5;
        float r04 = r11.width();
        float r112 = r11.height();
    L6:
        this.mTransX = Math.min(Math.max(r2, ((-r04) * (this.mScaleX - 1.0f)) - this.mTransOffsetX), this.mTransOffsetX);
        float r113 = Math.max(Math.min(r6, (r112 * (this.mScaleY - 1.0f)) + this.mTransOffsetY), -this.mTransOffsetY);
        this.mTransY = r113;
        float[] r05 = this.matrixBuffer;
        r05[2] = this.mTransX;
        r05[0] = this.mScaleX;
        r05[5] = r113;
        r05[4] = this.mScaleY;
        r10.setValues(r05);
        return;
    L5:
        r04 = 0.0f;
        r112 = 0.0f;
        goto L6
    }

    public float offsetBottom() {
        return this.mChartHeight - this.mContentRect.bottom;
    }

    public float offsetLeft() {
        return this.mContentRect.left;
    }

    public float offsetRight() {
        return this.mChartWidth - this.mContentRect.right;
    }

    public float offsetTop() {
        return this.mContentRect.top;
    }

    public Matrix refresh(Matrix r3, View r4, boolean r5) {
        this.mMatrixTouch.set(r3);
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
        if (r5 == false) goto L5;
        r4.invalidate();
    L5:
        r3.set(this.mMatrixTouch);
        return r3;
    }

    public void resetZoom(Matrix r3) {
        r3.reset();
        r3.set(this.mMatrixTouch);
        r3.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public void restrainViewPort(float r3, float r4, float r5, float r6) {
        this.mContentRect.set(r3, r4, this.mChartWidth - r5, this.mChartHeight - r6);
    }

    public void setChartDimens(float r5, float r6) {
        float r02 = offsetLeft();
        float r1 = offsetTop();
        float r2 = offsetRight();
        float r3 = offsetBottom();
        this.mChartHeight = r6;
        this.mChartWidth = r5;
        restrainViewPort(r02, r1, r2, r3);
    }

    public void setDragOffsetX(float r1) {
        this.mTransOffsetX = Utils.convertDpToPixel(r1);
    }

    public void setDragOffsetY(float r1) {
        this.mTransOffsetY = Utils.convertDpToPixel(r1);
    }

    public void setMaximumScaleX(float r2) {
        if (r2 != 0.0f) goto L5;
        r2 = Float.MAX_VALUE;
    L5:
        this.mMaxScaleX = r2;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMaximumScaleY(float r2) {
        if (r2 != 0.0f) goto L5;
        r2 = Float.MAX_VALUE;
    L5:
        this.mMaxScaleY = r2;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinMaxScaleX(float r3, float r4) {
        if (r3 >= 1.0f) goto L6;
        r3 = 1.0f;
    L6:
        if (r4 != 0.0f) goto L8;
        r4 = Float.MAX_VALUE;
    L8:
        this.mMinScaleX = r3;
        this.mMaxScaleX = r4;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinMaxScaleY(float r3, float r4) {
        if (r3 >= 1.0f) goto L6;
        r3 = 1.0f;
    L6:
        if (r4 != 0.0f) goto L8;
        r4 = Float.MAX_VALUE;
    L8:
        this.mMinScaleY = r3;
        this.mMaxScaleY = r4;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinimumScaleX(float r3) {
        if (r3 >= 1.0f) goto L5;
        r3 = 1.0f;
    L5:
        this.mMinScaleX = r3;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinimumScaleY(float r3) {
        if (r3 >= 1.0f) goto L5;
        r3 = 1.0f;
    L5:
        this.mMinScaleY = r3;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public Matrix setZoom(float r2, float r3) {
        Matrix r02 = new Matrix();
        setZoom(r2, r3, r02);
        return r02;
    }

    public Matrix translate(float[] r2) {
        Matrix r02 = new Matrix();
        translate(r2, r02);
        return r02;
    }

    public Matrix zoom(float r2, float r3) {
        Matrix r02 = new Matrix();
        zoom(r2, r3, r02);
        return r02;
    }

    public Matrix zoomIn(float r2, float r3) {
        Matrix r02 = new Matrix();
        zoomIn(r2, r3, r02);
        return r02;
    }

    public Matrix zoomOut(float r2, float r3) {
        Matrix r02 = new Matrix();
        zoomOut(r2, r3, r02);
        return r02;
    }

    public void fitScreen(Matrix r7) {
        this.mMinScaleX = 1.0f;
        this.mMinScaleY = 1.0f;
        r7.set(this.mMatrixTouch);
        float[] r1 = this.valsBufferForFitScreen;
        int r3 = 0;
    L4:
        if (r3 >= 9) goto L6;
        r1[r3] = 0.0f;
        r3 = r3 + 1;
        goto L4
    L6:
        r7.getValues(r1);
        r1[2] = 0.0f;
        r1[5] = 0.0f;
        r1[0] = 1.0f;
        r1[4] = 1.0f;
        r7.setValues(r1);
    }

    public void setZoom(float r2, float r3, Matrix r4) {
        r4.reset();
        r4.set(this.mMatrixTouch);
        r4.setScale(r2, r3);
    }

    public void translate(float[] r3, Matrix r4) {
        r4.reset();
        r4.set(this.mMatrixTouch);
        float r02 = r3[0] - offsetLeft();
        r4.postTranslate(-r02, -(r3[1] - offsetTop()));
    }

    public void zoom(float r2, float r3, Matrix r4) {
        r4.reset();
        r4.set(this.mMatrixTouch);
        r4.postScale(r2, r3);
    }

    public void zoomIn(float r2, float r3, Matrix r4) {
        r4.reset();
        r4.set(this.mMatrixTouch);
        r4.postScale(1.4f, 1.4f, r2, r3);
    }

    public void zoomOut(float r2, float r3, Matrix r4) {
        r4.reset();
        r4.set(this.mMatrixTouch);
        r4.postScale(0.7f, 0.7f, r2, r3);
    }

    public Matrix setZoom(float r3, float r4, float r5, float r6) {
        Matrix r02 = new Matrix();
        r02.set(this.mMatrixTouch);
        r02.setScale(r3, r4, r5, r6);
        return r02;
    }

    public Matrix zoom(float r7, float r8, float r9, float r10) {
        Matrix r5 = new Matrix();
        zoom(r7, r8, r9, r10, r5);
        return r5;
    }

    public void zoom(float r2, float r3, float r4, float r5, Matrix r6) {
        r6.reset();
        r6.set(this.mMatrixTouch);
        r6.postScale(r2, r3, r4, r5);
    }
}
