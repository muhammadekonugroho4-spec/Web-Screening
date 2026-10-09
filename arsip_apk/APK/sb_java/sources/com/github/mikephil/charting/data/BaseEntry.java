package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public abstract class BaseEntry {
    private Object mData;
    private Drawable mIcon;

    /* renamed from: y, reason: collision with root package name */
    private float f37844y;

    public BaseEntry() {
        this.f37844y = 0.0f;
        this.mData = null;
        this.mIcon = null;
    }

    public Object getData() {
        return this.mData;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public float getY() {
        return this.f37844y;
    }

    public void setData(Object r1) {
        this.mData = r1;
    }

    public void setIcon(Drawable r1) {
        this.mIcon = r1;
    }

    public void setY(float r1) {
        this.f37844y = r1;
    }

    public BaseEntry(float r2) {
        this.mData = null;
        this.mIcon = null;
        this.f37844y = r2;
    }

    public BaseEntry(float r1, Object r2) {
        this(r1);
        this.mData = r2;
    }

    public BaseEntry(float r1, Drawable r2) {
        this(r1);
        this.mIcon = r2;
    }

    public BaseEntry(float r1, Drawable r2, Object r3) {
        this(r1);
        this.mIcon = r2;
        this.mData = r3;
    }
}
