package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes4.dex */
public class Space extends View {
    @Deprecated
    public Space(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        if (getVisibility() != 0) goto L6;
        setVisibility(4);
        return;
    }

    public static int a(int r2, int r3) {
        int r02 = View.MeasureSpec.getMode(r3);
        int r32 = View.MeasureSpec.getSize(r3);
        if (r02 == Integer.MIN_VALUE) goto L9;
        if (r02 == 1073741824) goto L7;
        return r2;
    L7:
        return r32;
    L9:
        return Math.min(r2, r32);
    }

    @Override // android.view.View
    public void draw(Canvas r1) {
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), r2), a(getSuggestedMinimumHeight(), r3));
    }

    @Deprecated
    public Space(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    @Deprecated
    public Space(Context r2) {
        this(r2, null);
    }
}
