package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
interface FlexContainer {
    public static final int NOT_SET = -1;

    void addView(View r1);

    void addView(View r1, int r2);

    int getAlignContent();

    int getAlignItems();

    int getChildHeightMeasureSpec(int r1, int r2, int r3);

    int getChildWidthMeasureSpec(int r1, int r2, int r3);

    int getDecorationLengthCrossAxis(View r1);

    int getDecorationLengthMainAxis(View r1, int r2, int r3);

    int getFlexDirection();

    View getFlexItemAt(int r1);

    int getFlexItemCount();

    List<FlexLine> getFlexLines();

    List<FlexLine> getFlexLinesInternal();

    int getFlexWrap();

    int getJustifyContent();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    View getReorderedFlexItemAt(int r1);

    int getSumOfCrossSize();

    boolean isMainAxisDirectionHorizontal();

    void onNewFlexItemAdded(View r1, int r2, int r3, FlexLine r4);

    void onNewFlexLineAdded(FlexLine r1);

    void removeAllViews();

    void removeViewAt(int r1);

    void setAlignContent(int r1);

    void setAlignItems(int r1);

    void setFlexDirection(int r1);

    void setFlexLines(List<FlexLine> r1);

    void setFlexWrap(int r1);

    void setJustifyContent(int r1);

    void setMaxLine(int r1);

    void updateViewCache(int r1, View r2);
}
