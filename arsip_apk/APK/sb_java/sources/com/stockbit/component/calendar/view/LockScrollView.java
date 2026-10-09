package com.stockbit.component.calendar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stockbit/component/calendar/view/LockScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "swipeTouchListener", "Lcom/stockbit/component/calendar/view/OnSwipeTouchListener;", "setParams", "", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "calendar_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LockScrollView extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    public a f69641a;

    public LockScrollView(Context r2) {
        p.l(r2, "context");
        super(r2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent r2) {
        p.l(r2, "ev");
        a r02 = this.f69641a;
        if (r02 == null) goto L5;
        Boolean r22 = Boolean.valueOf(r02.onTouch(this, r2));
    L6:
        if (r22 != null) goto L10;
        return false;
    L10:
        return r22.booleanValue();
    L5:
        r22 = null;
        goto L6
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent r2) {
        p.l(r2, "ev");
        super.onTouchEvent(r2);
        return true;
    }

    public final void setParams(a r2) {
        p.l(r2, "swipeTouchListener");
        this.f69641a = r2;
    }

    public LockScrollView(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        p.l(r3, "attrs");
        super(r2, r3);
    }

    public LockScrollView(Context r2, AttributeSet r3, int r4) {
        p.l(r2, "context");
        p.l(r3, "attrs");
        super(r2, r3, r4);
    }
}
