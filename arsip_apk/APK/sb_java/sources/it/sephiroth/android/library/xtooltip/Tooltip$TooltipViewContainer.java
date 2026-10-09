package it.sephiroth.android.library.xtooltip;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.p;
import kotlin.w;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"it/sephiroth/android/library/xtooltip/Tooltip$TooltipViewContainer", "Landroid/widget/FrameLayout;", "", Constants.INAPP_WINDOW, "h", "oldw", "oldh", "Lkotlin/w;", "onSizeChanged", "(IIII)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lkotlin/Function2;", "a", "Lkotlin/jvm/functions/p;", "sizeChange", "xtooltip_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Tooltip$TooltipViewContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public p f177025a;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent r2) {
        kotlin.jvm.internal.p.m(r2, NotificationCompat.CATEGORY_EVENT);
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        super.onLayout(r2, r3, r4, r5, r6);
        if (r2 == false) goto L6;
        int[] r32 = {-1, -1};
        getLocationOnScreen(r32);
        timber.log.a.d("globalVisibleRect: " + r32[0] + ", " + r32[1], new Object[0]);
        offsetTopAndBottom(-r32[1]);
        return;
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        p r32 = this.f177025a;
        if (r32 == null) goto L6;
        w r12 = (w) r32.invoke(Integer.valueOf(r1), Integer.valueOf(r2));
        return;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent r2) {
        kotlin.jvm.internal.p.m(r2, NotificationCompat.CATEGORY_EVENT);
        throw null;
    }
}
