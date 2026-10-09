package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.formatter.DefaultAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AxisBase extends ComponentBase {
    private int mAxisLineColor;
    private DashPathEffect mAxisLineDashPathEffect;
    private float mAxisLineWidth;
    public float mAxisMaximum;
    public float mAxisMinimum;
    public float mAxisRange;
    protected ValueFormatter mAxisValueFormatter;
    protected boolean mCenterAxisLabels;
    public float[] mCenteredEntries;
    protected boolean mCustomAxisMax;
    protected boolean mCustomAxisMin;
    public int mDecimals;
    protected boolean mDrawAxisLine;
    protected boolean mDrawGridLines;
    protected boolean mDrawGridLinesBehindData;
    protected boolean mDrawLabels;
    protected boolean mDrawLimitLineBehindData;
    public float[] mEntries;
    public int mEntryCount;
    protected boolean mForceLabels;
    protected float mGranularity;
    protected boolean mGranularityEnabled;
    private int mGridColor;
    private DashPathEffect mGridDashPathEffect;
    private float mGridLineWidth;
    private int mLabelCount;
    protected List<LimitLine> mLimitLines;
    protected float mSpaceMax;
    protected float mSpaceMin;

    public AxisBase() {
        this.mGridColor = -7829368;
        this.mGridLineWidth = 1.0f;
        this.mAxisLineColor = -7829368;
        this.mAxisLineWidth = 1.0f;
        this.mEntries = new float[0];
        this.mCenteredEntries = new float[0];
        this.mLabelCount = 6;
        this.mGranularity = 1.0f;
        this.mGranularityEnabled = false;
        this.mForceLabels = false;
        this.mDrawGridLines = true;
        this.mDrawAxisLine = true;
        this.mDrawLabels = true;
        this.mCenterAxisLabels = false;
        this.mAxisLineDashPathEffect = null;
        this.mGridDashPathEffect = null;
        this.mDrawLimitLineBehindData = false;
        this.mDrawGridLinesBehindData = true;
        this.mSpaceMin = 0.0f;
        this.mSpaceMax = 0.0f;
        this.mCustomAxisMin = false;
        this.mCustomAxisMax = false;
        this.mAxisMaximum = 0.0f;
        this.mAxisMinimum = 0.0f;
        this.mAxisRange = 0.0f;
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(5.0f);
        this.mLimitLines = new ArrayList();
    }

    public void addLimitLine(LimitLine r2) {
        this.mLimitLines.add(r2);
        if (this.mLimitLines.size() <= 6) goto L6;
        Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        return;
    }

    public void calculate(float r3, float r4) {
        if (this.mCustomAxisMin == false) goto L5;
        float r32 = this.mAxisMinimum;
    L7:
        if (this.mCustomAxisMax == false) goto L9;
        float r42 = this.mAxisMaximum;
    L11:
        if (Math.abs(r42 - r32) != 0.0f) goto L13;
        r42 = r42 + 1.0f;
        r32 = r32 - 1.0f;
    L13:
        this.mAxisMinimum = r32;
        this.mAxisMaximum = r42;
        this.mAxisRange = Math.abs(r42 - r32);
        return;
    L9:
        r42 = r4 + this.mSpaceMax;
        goto L11
    L5:
        r32 = r3 - this.mSpaceMin;
        goto L7
    }

    public void disableAxisLineDashedLine() {
        this.mAxisLineDashPathEffect = null;
    }

    public void disableGridDashedLine() {
        this.mGridDashPathEffect = null;
    }

    public void enableAxisLineDashedLine(float r4, float r5, float r6) {
        this.mAxisLineDashPathEffect = new DashPathEffect(new float[]{r4, r5}, r6);
    }

    public void enableGridDashedLine(float r4, float r5, float r6) {
        this.mGridDashPathEffect = new DashPathEffect(new float[]{r4, r5}, r6);
    }

    public int getAxisLineColor() {
        return this.mAxisLineColor;
    }

    public DashPathEffect getAxisLineDashPathEffect() {
        return this.mAxisLineDashPathEffect;
    }

    public float getAxisLineWidth() {
        return this.mAxisLineWidth;
    }

    public float getAxisMaximum() {
        return this.mAxisMaximum;
    }

    public float getAxisMinimum() {
        return this.mAxisMinimum;
    }

    public String getFormattedLabel(int r3) {
        if (r3 >= 0) goto L4;
        return "";
    L4:
        if (r3 < this.mEntries.length) goto L7;
        return "";
    L7:
        return getValueFormatter().getAxisLabel(this.mEntries[r3], this);
    }

    public float getGranularity() {
        return this.mGranularity;
    }

    public int getGridColor() {
        return this.mGridColor;
    }

    public DashPathEffect getGridDashPathEffect() {
        return this.mGridDashPathEffect;
    }

    public float getGridLineWidth() {
        return this.mGridLineWidth;
    }

    public int getLabelCount() {
        return this.mLabelCount;
    }

    public List<LimitLine> getLimitLines() {
        return this.mLimitLines;
    }

    public String getLongestLabel() {
        String r02 = "";
        int r1 = 0;
    L4:
        if (r1 >= this.mEntries.length) goto L11;
        String r2 = getFormattedLabel(r1);
        if (r2 == null) goto L10;
        if (r02.length() >= r2.length()) goto L10;
        r02 = r2;
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        return r02;
    }

    public float getSpaceMax() {
        return this.mSpaceMax;
    }

    public float getSpaceMin() {
        return this.mSpaceMin;
    }

    public ValueFormatter getValueFormatter() {
        ValueFormatter r02 = this.mAxisValueFormatter;
        if (r02 != null) goto L5;
    L8:
        this.mAxisValueFormatter = new DefaultAxisValueFormatter(this.mDecimals);
    L10:
        return this.mAxisValueFormatter;
    L5:
        if ((r02 instanceof DefaultAxisValueFormatter) == false) goto L10;
        if (((DefaultAxisValueFormatter) r02).getDecimalDigits() == this.mDecimals) goto L10;
        goto L8
    }

    public boolean isAxisLineDashedLineEnabled() {
        if (this.mAxisLineDashPathEffect != null) goto L6;
        return false;
    L6:
        return true;
    }

    public boolean isAxisMaxCustom() {
        return this.mCustomAxisMax;
    }

    public boolean isAxisMinCustom() {
        return this.mCustomAxisMin;
    }

    public boolean isCenterAxisLabelsEnabled() {
        if (this.mCenterAxisLabels == true) goto L5;
        return false;
    L5:
        if (this.mEntryCount <= 0) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isDrawAxisLineEnabled() {
        return this.mDrawAxisLine;
    }

    public boolean isDrawGridLinesBehindDataEnabled() {
        return this.mDrawGridLinesBehindData;
    }

    public boolean isDrawGridLinesEnabled() {
        return this.mDrawGridLines;
    }

    public boolean isDrawLabelsEnabled() {
        return this.mDrawLabels;
    }

    public boolean isDrawLimitLinesBehindDataEnabled() {
        return this.mDrawLimitLineBehindData;
    }

    public boolean isForceLabelsEnabled() {
        return this.mForceLabels;
    }

    public boolean isGranularityEnabled() {
        return this.mGranularityEnabled;
    }

    public boolean isGridDashedLineEnabled() {
        if (this.mGridDashPathEffect != null) goto L6;
        return false;
    L6:
        return true;
    }

    public void removeAllLimitLines() {
        this.mLimitLines.clear();
    }

    public void removeLimitLine(LimitLine r2) {
        this.mLimitLines.remove(r2);
    }

    public void resetAxisMaximum() {
        this.mCustomAxisMax = false;
    }

    public void resetAxisMinimum() {
        this.mCustomAxisMin = false;
    }

    public void setAxisLineColor(int r1) {
        this.mAxisLineColor = r1;
    }

    public void setAxisLineDashedLine(DashPathEffect r1) {
        this.mAxisLineDashPathEffect = r1;
    }

    public void setAxisLineWidth(float r1) {
        this.mAxisLineWidth = Utils.convertDpToPixel(r1);
    }

    @Deprecated
    public void setAxisMaxValue(float r1) {
        setAxisMaximum(r1);
    }

    public void setAxisMaximum(float r2) {
        this.mCustomAxisMax = true;
        this.mAxisMaximum = r2;
        this.mAxisRange = Math.abs(r2 - this.mAxisMinimum);
    }

    @Deprecated
    public void setAxisMinValue(float r1) {
        setAxisMinimum(r1);
    }

    public void setAxisMinimum(float r2) {
        this.mCustomAxisMin = true;
        this.mAxisMinimum = r2;
        this.mAxisRange = Math.abs(this.mAxisMaximum - r2);
    }

    public void setCenterAxisLabels(boolean r1) {
        this.mCenterAxisLabels = r1;
    }

    public void setDrawAxisLine(boolean r1) {
        this.mDrawAxisLine = r1;
    }

    public void setDrawGridLines(boolean r1) {
        this.mDrawGridLines = r1;
    }

    public void setDrawGridLinesBehindData(boolean r1) {
        this.mDrawGridLinesBehindData = r1;
    }

    public void setDrawLabels(boolean r1) {
        this.mDrawLabels = r1;
    }

    public void setDrawLimitLinesBehindData(boolean r1) {
        this.mDrawLimitLineBehindData = r1;
    }

    public void setGranularity(float r1) {
        this.mGranularity = r1;
        this.mGranularityEnabled = true;
    }

    public void setGranularityEnabled(boolean r1) {
        this.mGranularityEnabled = r1;
    }

    public void setGridColor(int r1) {
        this.mGridColor = r1;
    }

    public void setGridDashedLine(DashPathEffect r1) {
        this.mGridDashPathEffect = r1;
    }

    public void setGridLineWidth(float r1) {
        this.mGridLineWidth = Utils.convertDpToPixel(r1);
    }

    public void setLabelCount(int r2) {
        if (r2 <= 25) goto L6;
        r2 = 25;
    L6:
        if (r2 >= 2) goto L8;
        r2 = 2;
    L8:
        this.mLabelCount = r2;
        this.mForceLabels = false;
    }

    public void setSpaceMax(float r1) {
        this.mSpaceMax = r1;
    }

    public void setSpaceMin(float r1) {
        this.mSpaceMin = r1;
    }

    public void setValueFormatter(ValueFormatter r2) {
        if (r2 != null) goto L5;
        this.mAxisValueFormatter = new DefaultAxisValueFormatter(this.mDecimals);
        return;
    L5:
        this.mAxisValueFormatter = r2;
    }

    public void setLabelCount(int r1, boolean r2) {
        setLabelCount(r1);
        this.mForceLabels = r2;
    }
}
