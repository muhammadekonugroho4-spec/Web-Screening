package com.spyhunter99.supertooltips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes6.dex */
public class ToolTipRelativeLayout extends RelativeLayout {
    public ToolTipRelativeLayout(Context r1) {
        super(r1);
    }

    public final ToolTipView a(ToolTip r1, View r2, ToolTipView r3) {
        r3.setToolTip(r1, r2);
        return r3;
    }

    public ToolTipView b(ToolTip r3, View r4) {
        return a(r3, r4, new ToolTipView(getContext()));
    }

    public ToolTipRelativeLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    public ToolTipRelativeLayout(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
    }
}
