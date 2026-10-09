package com.iab.digitalidentity.ui.commonviews;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import n0.C12011a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/iab/digitalidentity/ui/commonviews/KycSdkLoaderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycSdkLoaderView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public ObjectAnimator f40645a;

    public KycSdkLoaderView(Context r8) {
        p.l(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // android.view.View
    public final boolean isInEditMode() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator r02 = ObjectAnimator.ofFloat(this, "rotation", new float[]{0.0f, 360.0f});
        this.f40645a = r02;
        if (r02 == null) goto L6;
        r02.setRepeatCount(-1);
        r02.setDuration(500);
        r02.setInterpolator(new LinearInterpolator());
        r02.start();
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator r02 = this.f40645a;
        if (r02 == null) goto L6;
        r02.cancel();
        return;
    }

    public KycSdkLoaderView(Context r8, AttributeSet r9) {
        p.l(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    public /* synthetic */ KycSdkLoaderView(Context r1, AttributeSet r2, int r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    public KycSdkLoaderView(Context r2, AttributeSet r3, int r4) {
        p.l(r2, "context");
        super(r2, r3, r4);
        View.inflate(new C12011a(r2), com.iab.digitalidentity.h.f39818B, this);
    }
}
