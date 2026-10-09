package com.google.android.flexbox;

import android.os.Parcelable;

/* loaded from: classes4.dex */
interface FlexItem extends Parcelable {
    public static final float FLEX_BASIS_PERCENT_DEFAULT = -1.0f;
    public static final float FLEX_GROW_DEFAULT = 0.0f;
    public static final float FLEX_SHRINK_DEFAULT = 1.0f;
    public static final float FLEX_SHRINK_NOT_SET = 0.0f;
    public static final int MAX_SIZE = 16777215;
    public static final int ORDER_DEFAULT = 1;

    int getAlignSelf();

    float getFlexBasisPercent();

    float getFlexGrow();

    float getFlexShrink();

    int getHeight();

    int getMarginBottom();

    int getMarginEnd();

    int getMarginLeft();

    int getMarginRight();

    int getMarginStart();

    int getMarginTop();

    int getMaxHeight();

    int getMaxWidth();

    int getMinHeight();

    int getMinWidth();

    int getOrder();

    int getWidth();

    boolean isWrapBefore();

    void setAlignSelf(int r1);

    void setFlexBasisPercent(float r1);

    void setFlexGrow(float r1);

    void setFlexShrink(float r1);

    void setHeight(int r1);

    void setMaxHeight(int r1);

    void setMaxWidth(int r1);

    void setMinHeight(int r1);

    void setMinWidth(int r1);

    void setOrder(int r1);

    void setWidth(int r1);

    void setWrapBefore(boolean r1);
}
