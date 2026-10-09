package com.iab.digitalidentity.ui.commonviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/iab/digitalidentity/ui/commonviews/AutoFitTextureView;", "Landroid/view/TextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoFitTextureView extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    public int f40613a;

    /* renamed from: b, reason: collision with root package name */
    public int f40614b;

    public AutoFitTextureView(Context r8) {
        p.l(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final void a(int r1, int r2) {
        if (r1 < 0) goto L7;
        if (r2 < 0) goto L7;
        this.f40613a = r1;
        this.f40614b = r2;
        requestLayout();
        return;
    L7:
        throw new IllegalArgumentException("Size cannot be negative.");
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
        super.onMeasure(r4, r5);
        int r42 = View.MeasureSpec.getSize(r4);
        int r52 = View.MeasureSpec.getSize(r5);
        int r02 = this.f40613a;
        if (r02 == 0) goto L13;
        int r1 = this.f40614b;
        if (r1 == 0) goto L13;
        int r2 = (r52 * r02) / r1;
        if (r42 >= r2) goto L11;
        setMeasuredDimension(r42, (r1 * r42) / r02);
        return;
    L11:
        setMeasuredDimension(r2, r52);
        return;
    L13:
        setMeasuredDimension(r42, r52);
    }

    public AutoFitTextureView(Context r8, AttributeSet r9) {
        p.l(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    public /* synthetic */ AutoFitTextureView(Context r1, AttributeSet r2, int r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    public AutoFitTextureView(Context r2, AttributeSet r3, int r4) {
        p.l(r2, "context");
        super(r2, r3, r4);
    }
}
