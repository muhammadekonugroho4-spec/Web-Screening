package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R;

/* loaded from: classes5.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = null;

    static {
        CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");
    }

    private ChildrenAlphaProperty(String r2) {
        super(Float.class, r2);
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Float get(ViewGroup r1) {
        return get2(r1);
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(ViewGroup r1, Float r2) {
        set2(r1, r2);
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public Float get2(ViewGroup r2) {
        Float r22 = (Float) r2.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (r22 == null) goto L6;
        return r22;
    L6:
        return Float.valueOf(1.0f);
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(ViewGroup r4, Float r5) {
        float r02 = r5.floatValue();
        r4.setTag(R.id.mtrl_internal_children_alpha_tag, r5);
        int r52 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r52) goto L5;
        r4.getChildAt(r1).setAlpha(r02);
        r1 = r1 + 1;
        goto L3
    }
}
