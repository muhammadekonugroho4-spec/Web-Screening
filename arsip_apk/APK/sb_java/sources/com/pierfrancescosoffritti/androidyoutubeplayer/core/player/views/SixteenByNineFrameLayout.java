package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.primitives.Ints;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/SixteenByNineFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/w;", "onMeasure", "(II)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SixteenByNineFrameLayout extends FrameLayout {
    public SixteenByNineFrameLayout(Context r2) {
        p.l(r2, "context");
        this(r2, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r3, int r4) {
        if (getLayoutParams().height != (-2)) goto L6;
        super.onMeasure(r3, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(r3) * 9) / 16, Ints.MAX_POWER_OF_TWO));
        return;
    L6:
        super.onMeasure(r3, r4);
    }

    public SixteenByNineFrameLayout(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        this(r2, r3, 0);
    }

    public SixteenByNineFrameLayout(Context r2, AttributeSet r3, int r4) {
        p.l(r2, "context");
        super(r2, r3, r4);
    }
}
