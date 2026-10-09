package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.browser.a;
import com.google.common.primitives.Ints;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f3843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3844b;

    public BrowserActionsFallbackMenuView(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f3843a = getResources().getDimensionPixelOffset(a.f3842b);
        this.f3844b = getResources().getDimensionPixelOffset(a.f3841a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3843a * 2), this.f3844b), Ints.MAX_POWER_OF_TWO), r3);
    }
}
