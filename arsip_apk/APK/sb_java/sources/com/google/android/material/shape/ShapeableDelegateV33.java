package com.google.android.material.shape;

import android.view.View;

/* loaded from: classes5.dex */
class ShapeableDelegateV33 extends ShapeableDelegate {
    public ShapeableDelegateV33(View r1) {
        initMaskOutlineProvider(r1);
    }

    private void initMaskOutlineProvider(View r2) {
        r2.setOutlineProvider(new AnonymousClass1(this));
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(View r2) {
        r2.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping() == false) goto L6;
        r2.invalidate();
        return;
    L6:
        r2.invalidateOutline();
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }
}
