package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.C3887n0;
import com.google.common.primitives.Ints;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class A extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3125a;

    /* renamed from: b, reason: collision with root package name */
    public int f3126b;

    /* renamed from: c, reason: collision with root package name */
    public int f3127c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3128e;

    /* renamed from: f, reason: collision with root package name */
    public int f3129f;

    /* renamed from: g, reason: collision with root package name */
    public d f3130g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3131h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3132i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3133j;

    /* renamed from: k, reason: collision with root package name */
    public C3887n0 f3134k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.core.widget.h f3135l;

    /* renamed from: m, reason: collision with root package name */
    public f f3136m;

    public static class a {
        public static void a(View r02, float r1, float r2) {
            r02.drawableHotspotChanged(r1, r2);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static Method f3137a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f3138b;

        /* renamed from: c, reason: collision with root package name */
        public static Method f3139c;
        public static boolean d;

        static {
            Class r3 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5
            Class r5 = Boolean.TYPE;     // Catch: NoSuchMethodException -> L5
            Class r6 = Float.TYPE;     // Catch: NoSuchMethodException -> L5
            Method r1 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[]{r3, View.class, r5, r6, r6});     // Catch: NoSuchMethodException -> L5
            f3137a = r1;     // Catch: NoSuchMethodException -> L5
            r1.setAccessible(true);     // Catch: NoSuchMethodException -> L5
            Method r12 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
            f3138b = r12;     // Catch: NoSuchMethodException -> L5
            r12.setAccessible(true);     // Catch: NoSuchMethodException -> L5
            Method r02 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
            f3139c = r02;     // Catch: NoSuchMethodException -> L5
            r02.setAccessible(true);     // Catch: NoSuchMethodException -> L5
            d = true;     // Catch: NoSuchMethodException -> L5
            return;
        L5:
            e = move-exception;
            e.printStackTrace();
        }

        public static boolean a() {
            return d;
        }

        public static void b(A r5, int r6, View r7) {
            f3137a.invoke(r5, new Object[]{Integer.valueOf(r6), r7, Boolean.FALSE, -1, -1});     // Catch: InvocationTargetException -> L4 IllegalAccessException -> L6
            f3138b.invoke(r5, new Object[]{Integer.valueOf(r6)});     // Catch: InvocationTargetException -> L4 IllegalAccessException -> L6
            f3139c.invoke(r5, new Object[]{Integer.valueOf(r6)});     // Catch: InvocationTargetException -> L4 IllegalAccessException -> L6
            return;
        L6:
            e = move-exception;
            e.printStackTrace();
            return;
        L4:
            e = move-exception;
            e.printStackTrace();
        }
    }

    public static class c {
        public static boolean a(AbsListView r02) {
            return r02.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView r02, boolean r1) {
            r02.setSelectedChildViewEnabled(r1);
        }
    }

    public static class d extends androidx.appcompat.graphics.drawable.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3140a;

        public d(Drawable r1) {
            super(r1);
            this.f3140a = true;
        }

        public void a(boolean r1) {
            this.f3140a = r1;
        }

        @Override // androidx.appcompat.graphics.drawable.a, android.graphics.drawable.Drawable
        public void draw(Canvas r2) {
            if (this.f3140a == false) goto L6;
            super.draw(r2);
            return;
        }

        @Override // androidx.appcompat.graphics.drawable.a, android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
            if (this.f3140a == false) goto L6;
            super.setHotspot(r2, r3);
            return;
        }

        @Override // androidx.appcompat.graphics.drawable.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            if (this.f3140a == false) goto L6;
            super.setHotspotBounds(r2, r3, r4, r5);
            return;
        }

        @Override // androidx.appcompat.graphics.drawable.a, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
            if (this.f3140a == true) goto L5;
            return false;
        L5:
            return super.setState(r2);
        }

        @Override // androidx.appcompat.graphics.drawable.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
            if (this.f3140a == true) goto L5;
            return false;
        L5:
            return super.setVisible(r2, r3);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f3141a = null;

        static {
            Field r02 = null;
            r02 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");     // Catch: NoSuchFieldException -> L5
            r02.setAccessible(true);     // Catch: NoSuchFieldException -> L5
        L7:
            f3141a = r02;
            return;
        L5:
            e = move-exception;
            e.printStackTrace();
            goto L7
        }

        public static boolean a(AbsListView r1) {
            Field r02 = f3141a;
            if (r02 == null) goto L12;
            return r02.getBoolean(r1);
        L6:
            e = move-exception;
            e.printStackTrace();
            return false;
        L12:
            return false;
        }

        public static void b(AbsListView r1, boolean r2) {
            Field r02 = f3141a;
            if (r02 == null) goto L11;
            r02.set(r1, Boolean.valueOf(r2));     // Catch: IllegalAccessException -> L6
            return;
        L6:
            e = move-exception;
            e.printStackTrace();
            return;
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f3142a;

        public f(A r1) {
            this.f3142a = r1;
        }

        public void a() {
            A r02 = this.f3142a;
            r02.f3136m = null;
            r02.removeCallbacks(this);
        }

        public void b() {
            this.f3142a.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            A r02 = this.f3142a;
            r02.f3136m = null;
            r02.drawableStateChanged();
        }
    }

    public A(Context r3, boolean r4) {
        super(r3, null, androidx.appcompat.a.f2285F);
        this.f3125a = new Rect();
        this.f3126b = 0;
        this.f3127c = 0;
        this.d = 0;
        this.f3128e = 0;
        this.f3132i = r4;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f3133j = false;
        setPressed(false);
        drawableStateChanged();
        View r1 = getChildAt(this.f3129f - getFirstVisiblePosition());
        if (r1 == null) goto L5;
        r1.setPressed(false);
    L5:
        C3887n0 r02 = this.f3134k;
        if (r02 == null) goto L9;
        r02.c();
        this.f3134k = null;
        return;
    }

    public final void b(View r3, int r4) {
        performItemClick(r3, r4, getItemIdAtPosition(r4));
    }

    public final void c(Canvas r3) {
        if (this.f3125a.isEmpty() == true) goto L8;
        Drawable r02 = getSelector();
        if (r02 == null) goto L9;
        r02.setBounds(this.f3125a);
        r02.draw(r3);
        return;
    L9:
        return;
    }

    public int d(int r11, int r12, int r13, int r14, int r15) {
        int r122 = getListPaddingTop();
        int r132 = getListPaddingBottom();
        int r02 = getDividerHeight();
        Drawable r1 = getDivider();
        ListAdapter r2 = getAdapter();
        if (r2 == null) goto L5;
        int r123 = r122 + r132;
        if (r02 <= 0) goto L10;
        if (r1 == null) goto L10;
    L11:
        int r16 = r2.getCount();
        int r4 = 0;
        int r5 = 0;
        int r7 = 0;
        View r6 = null;
    L12:
        if (r4 >= r16) goto L38;
        int r8 = r2.getItemViewType(r4);
        if (r8 == r5) goto L16;
        r6 = null;
        r5 = r8;
    L16:
        r6 = r2.getView(r4, r6, this);
        ViewGroup.LayoutParams r82 = r6.getLayoutParams();
        if (r82 != null) goto L19;
        r82 = generateDefaultLayoutParams();
        r6.setLayoutParams(r82);
    L19:
        int r83 = r82.height;
        if (r83 <= 0) goto L22;
        int r84 = View.MeasureSpec.makeMeasureSpec(r83, Ints.MAX_POWER_OF_TWO);
    L23:
        r6.measure(r11, r84);
        r6.forceLayout();
        if (r4 <= 0) goto L26;
        r123 = r123 + r02;
    L26:
        r123 = r123 + r6.getMeasuredHeight();
        if (r123 >= r14) goto L28;
        if (r15 < 0) goto L37;
        if (r4 < r15) goto L37;
        r7 = r123;
    L37:
        r4 = r4 + 1;
        goto L12
    L28:
        if (r15 < 0) goto L33;
        if (r4 <= r15) goto L33;
        if (r7 <= 0) goto L33;
        if (r123 == r14) goto L33;
        return r7;
    L33:
        return r14;
    L22:
        r84 = View.MeasureSpec.makeMeasureSpec(0, 0);
        goto L23
    L38:
        return r123;
    L10:
        r02 = 0;
        goto L11
    L5:
        return r122 + r132;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas r1) {
        c(r1);
        super.dispatchDraw(r1);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f3136m == null) goto L5;
        return;
    L5:
        super.drawableStateChanged();
        j(true);
        n();
    }

    public boolean e(MotionEvent r8, int r9) {
        int r02 = r8.getActionMasked();
        if (r02 != 1) goto L5;
        boolean r3 = false;
    L12:
        int r92 = r8.findPointerIndex(r9);
        if (r92 < 0) goto L9;
        int r4 = (int) r8.getX(r92);
        int r93 = (int) r8.getY(r92);
        int r5 = pointToPosition(r4, r93);
        if (r5 != (-1)) goto L18;
        boolean r94 = true;
    L21:
        if (r3 == false) goto L23;
        if (r94 == true) goto L23;
    L24:
        if (r3 == true) goto L26;
        androidx.core.widget.h r82 = this.f3135l;
        if (r82 == null) goto L33;
        r82.m(false);
    L33:
        return r3;
    L26:
        if (this.f3135l != null) goto L28;
        this.f3135l = new androidx.core.widget.h(this);
    L28:
        this.f3135l.m(true);
        this.f3135l.onTouch(this, r8);
        return r3;
    L23:
        a();
        goto L24
    L18:
        View r32 = getChildAt(r5 - getFirstVisiblePosition());
        i(r32, r5, r4, r93);
        if (r02 == 1) goto L20;
    L8:
        r3 = true;
        r94 = false;
        goto L21
    L20:
        b(r32, r5);
    L9:
        r94 = false;
        r3 = false;
        goto L21
    L5:
        if (r02 != 2) goto L7;
        r3 = true;
        goto L12
    L7:
        if (r02 == 3) goto L9;
        goto L8
    }

    public final void f(int r6, View r7) {
        Rect r02 = this.f3125a;
        r02.set(r7.getLeft(), r7.getTop(), r7.getRight(), r7.getBottom());
        r02.left -= this.f3126b;
        r02.top -= this.f3127c;
        r02.right += this.d;
        r02.bottom += this.f3128e;
        boolean r03 = k();
        if (r7.isEnabled() == r03) goto L8;
        l(!r03);
        if (r6 == (-1)) goto L9;
        refreshDrawableState();
        return;
    L9:
        return;
    }

    public final void g(int r5, View r6) {
        Drawable r02 = getSelector();
        boolean r1 = true;
        if (r02 != null) goto L5;
    L7:
        boolean r3 = false;
    L8:
        if (r3 == false) goto L10;
        r02.setVisible(false, false);
    L10:
        f(r5, r6);
        if (r3 == false) goto L18;
        Rect r52 = this.f3125a;
        float r62 = r52.exactCenterX();
        float r53 = r52.exactCenterY();
        if (getVisibility() == 0) goto L16;
        r1 = false;
    L16:
        r02.setVisible(r1, false);
        androidx.core.graphics.drawable.a.k(r02, r62, r53);
        return;
    L18:
        return;
    L5:
        if (r5 == (-1)) goto L7;
        r3 = true;
        goto L8
    }

    public final void h(int r2, View r3, float r4, float r5) {
        g(r2, r3);
        Drawable r32 = getSelector();
        if (r32 != null) goto L5;
        return;
    L5:
        if (r2 == (-1)) goto L9;
        androidx.core.graphics.drawable.a.k(r32, r4, r5);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (this.f3132i == false) goto L5;
        return true;
    L5:
        if (super.hasFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (this.f3132i == false) goto L5;
        return true;
    L5:
        if (super.hasWindowFocus() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final void i(View r5, int r6, float r7, float r8) {
        this.f3133j = true;
        a.a(this, r7, r8);
        if (isPressed() == true) goto L5;
        setPressed(true);
    L5:
        layoutChildren();
        int r1 = this.f3129f;
        if (r1 == (-1)) goto L13;
        View r12 = getChildAt(r1 - getFirstVisiblePosition());
        if (r12 == null) goto L13;
        if (r12 == r5) goto L13;
        if (r12.isPressed() == false) goto L13;
        r12.setPressed(false);
    L13:
        this.f3129f = r6;
        a.a(r5, r7 - r5.getLeft(), r8 - r5.getTop());
        if (r5.isPressed() == true) goto L16;
        r5.setPressed(true);
    L16:
        h(r6, r5, r7, r8);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f3132i == false) goto L5;
        return true;
    L5:
        if (super.isFocused() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if (this.f3132i == false) goto L7;
        if (this.f3131h == false) goto L7;
        return true;
    L7:
        if (super.isInTouchMode() == true) goto L12;
        return false;
    L12:
        return true;
    }

    public final void j(boolean r2) {
        d r02 = this.f3130g;
        if (r02 == null) goto L6;
        r02.a(r2);
        return;
    }

    public final boolean k() {
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return c.a(this);
    L7:
        return e.a(this);
    }

    public final void l(boolean r3) {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        c.b(this, r3);
        return;
    L6:
        e.b(this, r3);
    }

    public final boolean m() {
        return this.f3133j;
    }

    public final void n() {
        Drawable r02 = getSelector();
        if (r02 != null) goto L5;
        return;
    L5:
        if (m() == true) goto L7;
        return;
    L7:
        if (isPressed() == false) goto L12;
        r02.setState(getDrawableState());
        return;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f3136m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent r6) {
        int r02 = Build.VERSION.SDK_INT;
        int r1 = r6.getActionMasked();
        if (r1 == 10) goto L5;
    L7:
        boolean r2 = super.onHoverEvent(r6);
        if (r1 != 9) goto L10;
    L14:
        int r62 = pointToPosition((int) r6.getX(), (int) r6.getY());
        if (r62 != (-1)) goto L17;
    L27:
        return r2;
    L17:
        if (r62 == getSelectedItemPosition()) goto L27;
        View r12 = getChildAt(r62 - getFirstVisiblePosition());
        if (r12.isEnabled() == false) goto L26;
        requestFocus();
        if (r02 >= 30) goto L23;
    L25:
        setSelectionFromTop(r62, r12.getTop() - getTop());
        goto L26
    L23:
        if (b.a() == false) goto L25;
        b.b(this, r62, r12);
    L26:
        n();
        goto L27
    L10:
        if (r1 == 7) goto L14;
        setSelection(-1);
        return r2;
    L5:
        if (this.f3136m != null) goto L7;
        f r22 = new f(this);
        this.f3136m = r22;
        r22.b();
        goto L7
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent r3) {
        if (r3.getAction() != 0) goto L6;
        this.f3129f = pointToPosition((int) r3.getX(), (int) r3.getY());
    L6:
        f r02 = this.f3136m;
        if (r02 == null) goto L10;
        r02.a();
    L10:
        return super.onTouchEvent(r3);
    }

    public void setListSelectionHidden(boolean r1) {
        this.f3131h = r1;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable r2) {
        if (r2 == null) goto L4;
        d r02 = new d(r2);
    L5:
        this.f3130g = r02;
        super.setSelector(r02);
        Rect r03 = new Rect();
        if (r2 == null) goto L8;
        r2.getPadding(r03);
    L8:
        this.f3126b = r03.left;
        this.f3127c = r03.top;
        this.d = r03.right;
        this.f3128e = r03.bottom;
        return;
    L4:
        r02 = null;
        goto L5
    }
}
