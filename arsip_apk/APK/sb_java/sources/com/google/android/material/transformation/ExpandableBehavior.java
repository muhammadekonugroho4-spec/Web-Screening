package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
/* loaded from: classes5.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    public static /* synthetic */ int access$000(ExpandableBehavior r02) {
        return r02.currentState;
    }

    private boolean didStateChange(boolean r4) {
        if (r4 == false) goto L12;
        int r42 = this.currentState;
        if (r42 != 0) goto L7;
    L10:
        return true;
    L7:
        if (r42 == 2) goto L10;
        return false;
    L12:
        if (this.currentState != 1) goto L14;
        return true;
    L14:
        return false;
    }

    public static <T extends ExpandableBehavior> T from(View r1, Class<T> r2) {
        ViewGroup.LayoutParams r12 = r1.getLayoutParams();
        if ((r12 instanceof CoordinatorLayout.e) == false) goto L11;
        CoordinatorLayout.Behavior r13 = ((CoordinatorLayout.e) r12).f();
        if ((r13 instanceof ExpandableBehavior) == false) goto L9;
        return r2.cast(r13);
    L9:
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    L11:
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidget findExpandableWidget(CoordinatorLayout r6, View r7) {
        List<View> r02 = r6.getDependencies(r7);
        int r1 = r02.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        View r3 = r02.get(r2);
        if (layoutDependsOn(r6, r7, r3) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return (ExpandableWidget) r3;
    L9:
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout r1, View r2, View r3);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout r2, View r3, View r4) {
        ExpandableWidget r42 = (ExpandableWidget) r4;
        if (didStateChange(r42.isExpanded()) == true) goto L5;
        return false;
    L5:
        if (r42.isExpanded() == false) goto L7;
        int r22 = 1;
    L8:
        this.currentState = r22;
        return onExpandedStateChange((View) r42, r3, r42.isExpanded(), true);
    L7:
        r22 = 2;
        goto L8
    }

    public abstract boolean onExpandedStateChange(View r1, View r2, boolean r3, boolean r4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout r3, final View r4, int r5) {
        if (r4.isLaidOut() == true) goto L15;
        final ExpandableWidget r32 = findExpandableWidget(r3, r4);
        if (r32 != null) goto L7;
        return false;
    L7:
        if (didStateChange(r32.isExpanded()) == true) goto L9;
        return false;
    L9:
        if (r32.isExpanded() == false) goto L11;
        final int r52 = 1;
    L12:
        this.currentState = r52;
        r4.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1(this, r4, r52, r32));
        return false;
    L11:
        r52 = 2;
        goto L12
    L15:
        return false;
    }

    public ExpandableBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.currentState = 0;
    }
}
