package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3143a;

    /* renamed from: b, reason: collision with root package name */
    public View f3144b;

    /* renamed from: c, reason: collision with root package name */
    public View f3145c;
    public View d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3146e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3147f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f3148g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3149h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3150i;

    /* renamed from: j, reason: collision with root package name */
    public int f3151j;

    public static class a {
        public static void a(ActionBarContainer r02) {
            r02.invalidateOutline();
        }
    }

    public ActionBarContainer(Context r2) {
        this(r2, null);
    }

    public final int a(View r3) {
        FrameLayout.LayoutParams r02 = (FrameLayout.LayoutParams) r3.getLayoutParams();
        return (r3.getMeasuredHeight() + r02.topMargin) + r02.bottomMargin;
    }

    public final boolean b(View r3) {
        if (r3 != null) goto L4;
        return true;
    L4:
        if (r3.getVisibility() != 8) goto L6;
        return true;
    L6:
        if (r3.getMeasuredHeight() == 0) goto L13;
        return false;
    L13:
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r02 = this.f3146e;
        if (r02 != null) goto L5;
    L7:
        Drawable r03 = this.f3147f;
        if (r03 != null) goto L10;
    L12:
        Drawable r04 = this.f3148g;
        if (r04 != null) goto L15;
        return;
    L15:
        if (r04.isStateful() == false) goto L19;
        this.f3148g.setState(getDrawableState());
        return;
    L19:
        return;
    L10:
        if (r03.isStateful() == false) goto L12;
        this.f3147f.setState(getDrawableState());
        goto L12
    L5:
        if (r02.isStateful() == false) goto L7;
        this.f3146e.setState(getDrawableState());
        goto L7
    }

    public View getTabContainer() {
        return this.f3144b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r02 = this.f3146e;
        if (r02 == null) goto L5;
        r02.jumpToCurrentState();
    L5:
        Drawable r03 = this.f3147f;
        if (r03 == null) goto L8;
        r03.jumpToCurrentState();
    L8:
        Drawable r04 = this.f3148g;
        if (r04 == null) goto L12;
        r04.jumpToCurrentState();
        return;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3145c = findViewById(androidx.appcompat.f.f2694a);
        this.d = findViewById(androidx.appcompat.f.f2698f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent r1) {
        super.onHoverEvent(r1);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent r2) {
        if (this.f3143a == false) goto L5;
        return true;
    L5:
        if (super.onInterceptTouchEvent(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        super.onLayout(r6, r7, r8, r9, r10);
        View r82 = this.f3144b;
        boolean r02 = true;
        boolean r1 = false;
        if (r82 != null) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r82 == null) goto L13;
        if (r82.getVisibility() == 8) goto L13;
        int r102 = getMeasuredHeight();
        FrameLayout.LayoutParams r3 = (FrameLayout.LayoutParams) r82.getLayoutParams();
        int r4 = r102 - r82.getMeasuredHeight();
        int r32 = r3.bottomMargin;
        r82.layout(r7, r4 - r32, r9, r102 - r32);
    L13:
        if (this.f3149h == false) goto L19;
        Drawable r72 = this.f3148g;
        if (r72 == null) goto L17;
        r72.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    L35:
        if (r02 == false) goto L38;
        invalidate();
        return;
    L38:
        return;
    L17:
        r02 = r1;
        goto L35
    L19:
        if (this.f3146e != null) goto L21;
    L30:
        this.f3150i = r2;
        if (r2 == false) goto L17;
        Drawable r73 = this.f3147f;
        if (r73 == null) goto L17;
        r73.setBounds(r82.getLeft(), r82.getTop(), r82.getRight(), r82.getBottom());
        goto L35
    L21:
        if (this.f3145c.getVisibility() != 0) goto L23;
        this.f3146e.setBounds(this.f3145c.getLeft(), this.f3145c.getTop(), this.f3145c.getRight(), this.f3145c.getBottom());
    L29:
        r1 = true;
        goto L30
    L23:
        View r74 = this.d;
        if (r74 != null) goto L26;
    L28:
        this.f3146e.setBounds(0, 0, 0, 0);
        goto L29
    L26:
        if (r74.getVisibility() != 0) goto L28;
        this.f3146e.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
        goto L29
    L5:
        if (r82.getVisibility() == 8) goto L7;
        r2 = true;
        goto L8
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r4, int r5) {
        if (this.f3145c == null) goto L5;
    L9:
        super.onMeasure(r4, r5);
        if (this.f3145c == null) goto L33;
        int r42 = View.MeasureSpec.getMode(r5);
        View r02 = this.f3144b;
        if (r02 != null) goto L15;
        return;
    L15:
        if (r02.getVisibility() != 8) goto L17;
        return;
    L17:
        if (r42 != 1073741824) goto L19;
        return;
    L19:
        if (b(this.f3145c) == true) goto L22;
        int r03 = a(this.f3145c);
    L25:
        if (r42 != Integer.MIN_VALUE) goto L27;
        int r43 = View.MeasureSpec.getSize(r5);
    L28:
        setMeasuredDimension(getMeasuredWidth(), Math.min(r03 + a(this.f3144b), r43));
        return;
    L27:
        r43 = Integer.MAX_VALUE;
        goto L28
    L22:
        if (b(this.d) == true) goto L24;
        r03 = a(this.d);
        goto L25
    L24:
        r03 = 0;
        goto L25
    L33:
        return;
    L5:
        if (View.MeasureSpec.getMode(r5) != Integer.MIN_VALUE) goto L9;
        int r04 = this.f3151j;
        if (r04 < 0) goto L9;
        r5 = View.MeasureSpec.makeMeasureSpec(Math.min(r04, View.MeasureSpec.getSize(r5)), Integer.MIN_VALUE);
        goto L9
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent r1) {
        super.onTouchEvent(r1);
        return true;
    }

    public void setPrimaryBackground(Drawable r5) {
        Drawable r02 = this.f3146e;
        if (r02 == null) goto L5;
        r02.setCallback(null);
        unscheduleDrawable(this.f3146e);
    L5:
        this.f3146e = r5;
        if (r5 == null) goto L10;
        r5.setCallback(this);
        View r52 = this.f3145c;
        if (r52 == null) goto L10;
        this.f3146e.setBounds(r52.getLeft(), this.f3145c.getTop(), this.f3145c.getRight(), this.f3145c.getBottom());
    L10:
        boolean r03 = false;
        if (this.f3149h == false) goto L16;
        if (this.f3148g != null) goto L20;
    L14:
        r03 = true;
    L20:
        setWillNotDraw(r03);
        invalidate();
        a.a(this);
        return;
    L16:
        if (this.f3146e != null) goto L20;
        if (this.f3147f != null) goto L20;
        goto L20
    }

    public void setSplitBackground(Drawable r4) {
        Drawable r02 = this.f3148g;
        if (r02 == null) goto L5;
        r02.setCallback(null);
        unscheduleDrawable(this.f3148g);
    L5:
        this.f3148g = r4;
        boolean r03 = false;
        if (r4 == null) goto L13;
        r4.setCallback(this);
        if (this.f3149h == false) goto L13;
        Drawable r42 = this.f3148g;
        if (r42 == null) goto L13;
        r42.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    L13:
        if (this.f3149h == false) goto L18;
        if (this.f3148g != null) goto L22;
    L16:
        r03 = true;
    L22:
        setWillNotDraw(r03);
        invalidate();
        a.a(this);
        return;
    L18:
        if (this.f3146e != null) goto L22;
        if (this.f3147f != null) goto L22;
        goto L22
    }

    public void setStackedBackground(Drawable r5) {
        Drawable r02 = this.f3147f;
        if (r02 == null) goto L5;
        r02.setCallback(null);
        unscheduleDrawable(this.f3147f);
    L5:
        this.f3147f = r5;
        if (r5 == null) goto L12;
        r5.setCallback(this);
        if (this.f3150i == false) goto L12;
        Drawable r52 = this.f3147f;
        if (r52 == null) goto L12;
        r52.setBounds(this.f3144b.getLeft(), this.f3144b.getTop(), this.f3144b.getRight(), this.f3144b.getBottom());
    L12:
        boolean r03 = false;
        if (this.f3149h == false) goto L18;
        if (this.f3148g != null) goto L22;
    L16:
        r03 = true;
    L22:
        setWillNotDraw(r03);
        invalidate();
        a.a(this);
        return;
    L18:
        if (this.f3146e != null) goto L22;
        if (this.f3147f != null) goto L22;
        goto L22
    }

    public void setTabContainer(ScrollingTabContainerView r3) {
        View r02 = this.f3144b;
        if (r02 == null) goto L5;
        removeView(r02);
    L5:
        this.f3144b = r3;
        if (r3 == null) goto L9;
        addView(r3);
        ViewGroup.LayoutParams r03 = r3.getLayoutParams();
        r03.width = -1;
        r03.height = -2;
        r3.setAllowCollapse(false);
        return;
    }

    public void setTransitioning(boolean r1) {
        this.f3143a = r1;
        if (r1 == false) goto L5;
        int r12 = 393216;
    L6:
        setDescendantFocusability(r12);
        return;
    L5:
        r12 = 262144;
        goto L6
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        if (r3 != 0) goto L5;
        boolean r32 = true;
    L6:
        Drawable r1 = this.f3146e;
        if (r1 == null) goto L9;
        r1.setVisible(r32, false);
    L9:
        Drawable r12 = this.f3147f;
        if (r12 == null) goto L12;
        r12.setVisible(r32, false);
    L12:
        Drawable r13 = this.f3148g;
        if (r13 == null) goto L16;
        r13.setVisible(r32, false);
        return;
    L16:
        return;
    L5:
        r32 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View r1, ActionMode.Callback r2) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable r2) {
        if (r2 != this.f3146e) goto L7;
        if (this.f3149h == true) goto L7;
        return true;
    L7:
        if (r2 != this.f3147f) goto L11;
        if (this.f3150i == false) goto L11;
        return true;
    L11:
        if (r2 != this.f3148g) goto L15;
        if (this.f3149h == false) goto L15;
        return true;
    L15:
        if (super.verifyDrawable(r2) == true) goto L22;
        return false;
    L22:
        return true;
    }

    public ActionBarContainer(Context r3, AttributeSet r4) {
        super(r3, r4);
        setBackground(new C2085b(this));
        TypedArray r32 = r3.obtainStyledAttributes(r4, androidx.appcompat.j.f2816a);
        this.f3146e = r32.getDrawable(androidx.appcompat.j.f2818b);
        this.f3147f = r32.getDrawable(androidx.appcompat.j.d);
        this.f3151j = r32.getDimensionPixelSize(androidx.appcompat.j.f2833j, -1);
        boolean r1 = true;
        if (getId() != androidx.appcompat.f.f2685M) goto L5;
        this.f3149h = true;
        this.f3148g = r32.getDrawable(androidx.appcompat.j.f2820c);
    L5:
        r32.recycle();
        if (this.f3149h == false) goto L12;
        if (this.f3148g == null) goto L15;
    L10:
        r1 = false;
    L15:
        setWillNotDraw(r1);
        return;
    L12:
        if (this.f3146e != null) goto L10;
        if (this.f3147f != null) goto L10;
        goto L10
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View r1, ActionMode.Callback r2, int r3) {
        if (r3 != 0) goto L4;
        return null;
    L4:
        return super.startActionModeForChild(r1, r2, r3);
    }
}
