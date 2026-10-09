package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.collection.g0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final g0 propertyValues;
    private final g0 timings;

    public MotionSpec() {
        this.timings = new g0();
        this.propertyValues = new g0();
    }

    private static void addInfoFromAnimator(MotionSpec r2, Animator r3) {
        if ((r3 instanceof ObjectAnimator) == false) goto L7;
        ObjectAnimator r32 = (ObjectAnimator) r3;
        r2.setPropertyValues(r32.getPropertyName(), r32.getValues());
        r2.setTiming(r32.getPropertyName(), MotionTiming.createFromAnimator(r32));
        return;
    L7:
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + r3);
    }

    private PropertyValuesHolder[] clonePropertyValuesHolder(PropertyValuesHolder[] r4) {
        PropertyValuesHolder[] r02 = new PropertyValuesHolder[r4.length];
        int r1 = 0;
    L4:
        if (r1 >= r4.length) goto L6;
        r02[r1] = r4[r1].clone();
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    public static MotionSpec createFromAttribute(Context r1, TypedArray r2, int r3) {
        if (r2.hasValue(r3) == false) goto L8;
        int r22 = r2.getResourceId(r3, 0);
        if (r22 != 0) goto L7;
        return null;
    L7:
        return createFromResource(r1, r22);
    L8:
        return null;
    }

    public static MotionSpec createFromResource(Context r3, int r4) {
        Animator r32 = AnimatorInflater.loadAnimator(r3, r4);     // Catch: Exception -> L7
        if ((r32 instanceof AnimatorSet) == true) goto L6;
        if (r32 == null) goto L12;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L7
        r1.add(r32);     // Catch: Exception -> L7
        return createSpecFromAnimators(r1);
    L12:
        return null;
    L6:
        return createSpecFromAnimators(((AnimatorSet) r32).getChildAnimations());
    L7:
        e = move-exception;
        Log.w(TAG, "Can't load animation resource ID #0x" + Integer.toHexString(r4), e);
        return null;
    }

    private static MotionSpec createSpecFromAnimators(List<Animator> r4) {
        MotionSpec r02 = new MotionSpec();
        int r1 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        addInfoFromAnimator(r02, r4.get(r2));
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof MotionSpec) == true) goto L10;
        return false;
    L10:
        return this.timings.equals(((MotionSpec) r2).timings);
    }

    public <T> ObjectAnimator getAnimator(String r2, T r3, Property<T, ?> r4) {
        ObjectAnimator r32 = ObjectAnimator.ofPropertyValuesHolder(r3, getPropertyValues(r2));
        r32.setProperty(r4);
        getTiming(r2).apply(r32);
        return r32;
    }

    public PropertyValuesHolder[] getPropertyValues(String r2) {
        if (hasPropertyValues(r2) == false) goto L7;
        return clonePropertyValuesHolder((PropertyValuesHolder[]) this.propertyValues.get(r2));
    L7:
        throw new IllegalArgumentException();
    }

    public MotionTiming getTiming(String r2) {
        if (hasTiming(r2) == false) goto L7;
        return (MotionTiming) this.timings.get(r2);
    L7:
        throw new IllegalArgumentException();
    }

    public long getTotalDuration() {
        int r02 = this.timings.size();
        long r1 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L5;
        MotionTiming r4 = (MotionTiming) this.timings.l(r3);
        r1 = Math.max(r1, r4.getDelay() + r4.getDuration());
        r3 = r3 + 1;
        goto L3
    L5:
        return r1;
    }

    public boolean hasPropertyValues(String r2) {
        if (this.propertyValues.get(r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean hasTiming(String r2) {
        if (this.timings.get(r2) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String r2, PropertyValuesHolder[] r3) {
        this.propertyValues.put(r2, r3);
    }

    public void setTiming(String r2, MotionTiming r3) {
        this.timings.put(r2, r3);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}
