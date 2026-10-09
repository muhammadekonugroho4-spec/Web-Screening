package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.InterfaceC3552n0;
import com.clevertap.android.sdk.Constants;
import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", Constants.KEY_T, "r", "b", "Lkotlin/w;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getChildCount", "()I", "Landroidx/compose/ui/graphics/n0;", "Landroid/view/View;", "view", "", "drawingTime", "a", "(Landroidx/compose/ui/graphics/n0;Landroid/view/View;J)V", "Z", "isDrawing", BaseSdkBuilder.UI_FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19154a;

    static {
    }

    public DrawChildContainer(Context r2) {
        super(r2);
        setClipChildren(false);
        setTag(androidx.compose.ui.o.f18854K, Boolean.TRUE);
    }

    public final void a(InterfaceC3552n0 r1, View r2, long r3) {
        super.drawChild(androidx.compose.ui.graphics.F.d(r1), r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas r6) {
        int r02 = super.getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L14;
        View r3 = getChildAt(r2);
        kotlin.jvm.internal.p.j(r3, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        if (((ViewLayer) r3).v() == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        this.f19154a = true;
        super.dispatchDraw(r6);     // Catch: Throwable -> L10
        this.f19154a = false;
        return;
    L10:
        th = move-exception;
        this.f19154a = false;
        throw th;
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f19154a == true) goto L5;
        return 0;
    L5:
        return super.getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
