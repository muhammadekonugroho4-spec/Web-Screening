package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AbstractC3511d1;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.InterfaceC3552n0;
import androidx.compose.ui.graphics.layer.ViewLayer;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", Constants.KEY_T, "r", "b", "Lkotlin/w;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "forceLayout", "", FirebaseAnalytics.Param.LOCATION, "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getChildCount", "()I", "Landroidx/compose/ui/graphics/n0;", "Landroid/view/View;", "view", "", "drawingTime", "a", "(Landroidx/compose/ui/graphics/n0;Landroid/view/View;J)V", "Z", "isDrawing", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17542a;

    static {
    }

    public DrawChildContainer(Context r2) {
        super(r2);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(AbstractC3511d1.f17307a, Boolean.TRUE);
    }

    public final void a(InterfaceC3552n0 r1, View r2, long r3) {
        super.drawChild(F.d(r1), r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas r6) {
        int r02 = super.getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L14;
        View r3 = getChildAt(r2);
        p.j(r3, "null cannot be cast to non-null type androidx.compose.ui.graphics.layer.ViewLayer");
        if (((ViewLayer) r3).b() == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        this.f17542a = true;
        super.dispatchDraw(r6);     // Catch: Throwable -> L10
        this.f17542a = false;
        return;
    L10:
        th = move-exception;
        this.f17542a = false;
        throw th;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f17542a == true) goto L5;
        return 0;
    L5:
        return super.getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] r1, Rect r2) {
        return null;
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
