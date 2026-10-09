package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.AbstractC3869e0;
import androidx.core.view.C3860a;
import androidx.core.view.G0;
import androidx.core.view.K;
import androidx.core.view.accessibility.t;
import androidx.customview.view.AbsSavedState;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.util.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: A0, reason: collision with root package name */
    public static final m f28610A0 = null;

    /* renamed from: x0, reason: collision with root package name */
    public static final int[] f28611x0 = null;

    /* renamed from: y0, reason: collision with root package name */
    public static final Comparator f28612y0 = null;

    /* renamed from: z0, reason: collision with root package name */
    public static final Interpolator f28613z0 = null;

    /* renamed from: A, reason: collision with root package name */
    public int f28614A;

    /* renamed from: B, reason: collision with root package name */
    public int f28615B;

    /* renamed from: C, reason: collision with root package name */
    public int f28616C;

    /* renamed from: D, reason: collision with root package name */
    public float f28617D;

    /* renamed from: E, reason: collision with root package name */
    public float f28618E;

    /* renamed from: F, reason: collision with root package name */
    public float f28619F;

    /* renamed from: G, reason: collision with root package name */
    public float f28620G;

    /* renamed from: H, reason: collision with root package name */
    public int f28621H;

    /* renamed from: I, reason: collision with root package name */
    public VelocityTracker f28622I;

    /* renamed from: J, reason: collision with root package name */
    public int f28623J;

    /* renamed from: K, reason: collision with root package name */
    public int f28624K;

    /* renamed from: L, reason: collision with root package name */
    public int f28625L;

    /* renamed from: M, reason: collision with root package name */
    public int f28626M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f28627N;

    /* renamed from: O, reason: collision with root package name */
    public EdgeEffect f28628O;

    /* renamed from: P, reason: collision with root package name */
    public EdgeEffect f28629P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f28630Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f28631R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f28632S;

    /* renamed from: T, reason: collision with root package name */
    public int f28633T;

    /* renamed from: U, reason: collision with root package name */
    public List f28634U;

    /* renamed from: V, reason: collision with root package name */
    public i f28635V;

    /* renamed from: W, reason: collision with root package name */
    public i f28636W;

    /* renamed from: a, reason: collision with root package name */
    public int f28637a;

    /* renamed from: a0, reason: collision with root package name */
    public List f28638a0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28639b;

    /* renamed from: b0, reason: collision with root package name */
    public int f28640b0;

    /* renamed from: c, reason: collision with root package name */
    public final f f28641c;

    /* renamed from: c0, reason: collision with root package name */
    public int f28642c0;
    public final Rect d;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f28643d0;

    /* renamed from: e, reason: collision with root package name */
    public androidx.viewpager.widget.a f28644e;

    /* renamed from: e0, reason: collision with root package name */
    public final Runnable f28645e0;

    /* renamed from: f, reason: collision with root package name */
    public int f28646f;

    /* renamed from: g, reason: collision with root package name */
    public int f28647g;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f28648h;

    /* renamed from: i, reason: collision with root package name */
    public ClassLoader f28649i;

    /* renamed from: j, reason: collision with root package name */
    public Scroller f28650j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28651k;

    /* renamed from: k0, reason: collision with root package name */
    public int f28652k0;

    /* renamed from: l, reason: collision with root package name */
    public k f28653l;

    /* renamed from: m, reason: collision with root package name */
    public int f28654m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f28655n;

    /* renamed from: o, reason: collision with root package name */
    public int f28656o;

    /* renamed from: p, reason: collision with root package name */
    public int f28657p;

    /* renamed from: q, reason: collision with root package name */
    public float f28658q;

    /* renamed from: r, reason: collision with root package name */
    public float f28659r;

    /* renamed from: s, reason: collision with root package name */
    public int f28660s;

    /* renamed from: t, reason: collision with root package name */
    public int f28661t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28662u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28663v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f28664w;

    /* renamed from: x, reason: collision with root package name */
    public int f28665x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28666y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28667z;

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f28668a;

        /* renamed from: b, reason: collision with root package name */
        public int f28669b;

        /* renamed from: c, reason: collision with root package name */
        public float f28670c;
        public boolean d;

        /* renamed from: e, reason: collision with root package name */
        public int f28671e;

        /* renamed from: f, reason: collision with root package name */
        public int f28672f;

        public LayoutParams() {
            super(-1, -1);
            this.f28670c = 0.0f;
        }

        public LayoutParams(Context r2, AttributeSet r3) {
            super(r2, r3);
            this.f28670c = 0.0f;
            TypedArray r22 = r2.obtainStyledAttributes(r3, ViewPager.f28611x0);
            this.f28669b = r22.getInteger(0, 48);
            r22.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public int f28673a;

        /* renamed from: b, reason: collision with root package name */
        public Parcelable f28674b;

        /* renamed from: c, reason: collision with root package name */
        public ClassLoader f28675c;

        public static class a implements Parcelable.ClassLoaderCreator {
            public a() {
            }

            public SavedState a(Parcel r3) {
                return new SavedState(r3, null);
            }

            public SavedState b(Parcel r2, ClassLoader r3) {
                return new SavedState(r2, r3);
            }

            public SavedState[] c(int r1) {
                return new SavedState[r1];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
                return a(r1);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
                return c(r1);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1, ClassLoader r2) {
                return b(r1, r2);
            }
        }

        static {
            CREATOR = new a();
        }

        public SavedState(Parcelable r1) {
            super(r1);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f28673a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel r2, int r3) {
            super.writeToParcel(r2, r3);
            r2.writeInt(this.f28673a);
            r2.writeParcelable(this.f28674b, r3);
        }

        public SavedState(Parcel r2, ClassLoader r3) {
            super(r2, r3);
            if (r3 != null) goto L5;
            r3 = getClass().getClassLoader();
        L5:
            this.f28673a = r2.readInt();
            this.f28674b = r2.readParcelable(r3);
            this.f28675c = r3;
        }
    }

    public static class a implements Comparator {
        public a() {
        }

        public int a(f r1, f r2) {
            return r1.f28680b - r2.f28680b;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((f) r1, (f) r2);
        }
    }

    public static class b implements Interpolator {
        public b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r3) {
            float r32 = r3 - 1.0f;
            return ((((r32 * r32) * r32) * r32) * r32) + 1.0f;
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPager f28676a;

        public c(ViewPager r1) {
            this.f28676a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28676a.setScrollState(0);
            this.f28676a.E();
        }
    }

    public class d implements K {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f28677a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPager f28678b;

        public d(ViewPager r1) {
            this.f28678b = r1;
            this.f28677a = new Rect();
        }

        @Override // androidx.core.view.K
        public G0 onApplyWindowInsets(View r6, G0 r7) {
            G0 r62 = AbstractC3869e0.X(r6, r7);
            if (r62.r() == false) goto L5;
            return r62;
        L5:
            Rect r72 = this.f28677a;
            r72.left = r62.k();
            r72.top = r62.m();
            r72.right = r62.l();
            r72.bottom = r62.j();
            int r02 = this.f28678b.getChildCount();
            int r1 = 0;
        L6:
            if (r1 >= r02) goto L9;
            G0 r2 = AbstractC3869e0.h(this.f28678b.getChildAt(r1), r62);
            r72.left = Math.min(r2.k(), r72.left);
            r72.top = Math.min(r2.m(), r72.top);
            r72.right = Math.min(r2.l(), r72.right);
            r72.bottom = Math.min(r2.j(), r72.bottom);
            r1 = r1 + 1;
            goto L6
        L9:
            return r62.t(r72.left, r72.top, r72.right, r72.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public Object f28679a;

        /* renamed from: b, reason: collision with root package name */
        public int f28680b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f28681c;
        public float d;

        /* renamed from: e, reason: collision with root package name */
        public float f28682e;

        public f() {
        }
    }

    public class g extends C3860a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPager f28683a;

        public g(ViewPager r1) {
            this.f28683a = r1;
        }

        public final boolean c() {
            androidx.viewpager.widget.a r02 = this.f28683a.f28644e;
            if (r02 != null) goto L5;
            return false;
        L5:
            if (r02.d() <= 1) goto L9;
            return true;
        L9:
            return false;
        }

        @Override // androidx.core.view.C3860a
        public void onInitializeAccessibilityEvent(View r2, AccessibilityEvent r3) {
            super.onInitializeAccessibilityEvent(r2, r3);
            r3.setClassName(ViewPager.class.getName());
            r3.setScrollable(c());
            if (r3.getEventType() != 4096) goto L8;
            androidx.viewpager.widget.a r22 = this.f28683a.f28644e;
            if (r22 == null) goto L9;
            r3.setItemCount(r22.d());
            r3.setFromIndex(this.f28683a.f28646f);
            r3.setToIndex(this.f28683a.f28646f);
            return;
        L9:
            return;
        }

        @Override // androidx.core.view.C3860a
        public void onInitializeAccessibilityNodeInfo(View r2, t r3) {
            super.onInitializeAccessibilityNodeInfo(r2, r3);
            r3.l0(ViewPager.class.getName());
            r3.O0(c());
            if (this.f28683a.canScrollHorizontally(1) == false) goto L6;
            r3.a(4096);
        L6:
            if (this.f28683a.canScrollHorizontally(-1) == false) goto L9;
            r3.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            return;
        }

        @Override // androidx.core.view.C3860a
        public boolean performAccessibilityAction(View r2, int r3, Bundle r4) {
            if (super.performAccessibilityAction(r2, r3, r4) == false) goto L6;
            return true;
        L6:
            if (r3 == 4096) goto L16;
            if (r3 == 8192) goto L11;
            return false;
        L11:
            if (this.f28683a.canScrollHorizontally(-1) == false) goto L14;
            ViewPager r22 = this.f28683a;
            r22.setCurrentItem(r22.f28646f - 1);
            return true;
        L14:
            return false;
        L16:
            if (this.f28683a.canScrollHorizontally(1) == false) goto L19;
            ViewPager r23 = this.f28683a;
            r23.setCurrentItem(r23.f28646f + 1);
            return true;
        L19:
            return false;
        }
    }

    public interface h {
        void onAdapterChanged(ViewPager r1, androidx.viewpager.widget.a r2, androidx.viewpager.widget.a r3);
    }

    public interface i {
        void onPageScrollStateChanged(int r1);

        void onPageScrolled(int r1, float r2, int r3);

        void onPageSelected(int r1);
    }

    public interface j {
    }

    public class k extends DataSetObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPager f28684a;

        public k(ViewPager r1) {
            this.f28684a = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            this.f28684a.i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            this.f28684a.i();
        }
    }

    public static class l implements i {
        public l() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int r1) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int r1, float r2, int r3) {
        }
    }

    public static class m implements Comparator {
        public m() {
        }

        public int a(View r3, View r4) {
            LayoutParams r32 = (LayoutParams) r3.getLayoutParams();
            LayoutParams r42 = (LayoutParams) r4.getLayoutParams();
            boolean r02 = r32.f28668a;
            if (r02 == r42.f28668a) goto L10;
            if (r02 == false) goto L7;
            return 1;
        L7:
            return -1;
        L10:
            return r32.f28671e - r42.f28671e;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((View) r1, (View) r2);
        }
    }

    static {
        f28611x0 = new int[]{R.attr.layout_gravity};
        f28612y0 = new a();
        f28613z0 = new b();
        f28610A0 = new m();
    }

    public ViewPager(Context r2) {
        super(r2);
        this.f28639b = new ArrayList();
        this.f28641c = new f();
        this.d = new Rect();
        this.f28647g = -1;
        this.f28648h = null;
        this.f28649i = null;
        this.f28658q = -3.4028235E38f;
        this.f28659r = Float.MAX_VALUE;
        this.f28665x = 1;
        this.f28621H = -1;
        this.f28630Q = true;
        this.f28631R = false;
        this.f28645e0 = new c(this);
        this.f28652k0 = 0;
        v();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean r2) {
        if (this.f28663v == r2) goto L6;
        this.f28663v = r2;
        return;
    }

    public static boolean w(View r1) {
        if (r1.getClass().getAnnotation(e.class) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean A() {
        int r02 = this.f28646f;
        if (r02 <= 0) goto L6;
        setCurrentItem(r02 - 1, true);
        return true;
    L6:
        return false;
    }

    public boolean B() {
        androidx.viewpager.widget.a r02 = this.f28644e;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (this.f28646f >= (r02.d() - 1)) goto L10;
        setCurrentItem(this.f28646f + 1, true);
        return true;
    L10:
        return false;
    }

    public final boolean C(int r8) {
        if (this.f28639b.size() == 0) goto L5;
        f r02 = t();
        int r3 = getClientWidth();
        int r4 = this.f28654m;
        int r5 = r3 + r4;
        float r32 = r3;
        int r6 = r02.f28680b;
        float r82 = ((r8 / r32) - r02.f28682e) / (r02.d + (r4 / r32));
        this.f28632S = false;
        y(r6, r82, (int) (r5 * r82));
        if (this.f28632S == false) goto L17;
        return true;
    L17:
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    L5:
        if (this.f28630Q == false) goto L7;
        return false;
    L7:
        this.f28632S = false;
        y(0, 0.0f, 0);
        if (this.f28632S == false) goto L11;
        return false;
    L11:
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean D(float r10) {
        float r02 = this.f28617D - r10;
        this.f28617D = r10;
        float r102 = getScrollX() + r02;
        float r03 = getClientWidth();
        float r1 = this.f28658q * r03;
        float r2 = this.f28659r * r03;
        boolean r4 = false;
        f r3 = (f) this.f28639b.get(0);
        ArrayList r5 = this.f28639b;
        f r52 = (f) r5.get(r5.size() - 1);
        if (r3.f28680b == 0) goto L5;
        r1 = r3.f28682e * r03;
        boolean r32 = false;
    L7:
        if (r52.f28680b == (this.f28644e.d() - 1)) goto L9;
        r2 = r52.f28682e * r03;
        boolean r53 = false;
    L11:
        if (r102 >= r1) goto L16;
        if (r32 == false) goto L14;
        this.f28628O.onPull(Math.abs(r1 - r102) / r03);
        r4 = true;
    L14:
        r102 = r1;
    L20:
        int r12 = (int) r102;
        this.f28617D += r102 - r12;
        scrollTo(r12, getScrollY());
        C(r12);
        return r4;
    L16:
        if (r102 <= r2) goto L20;
        if (r53 == false) goto L19;
        this.f28629P.onPull(Math.abs(r102 - r2) / r03);
        r4 = true;
    L19:
        r102 = r2;
        goto L20
    L9:
        r53 = true;
        goto L11
    L5:
        r32 = true;
        goto L7
    }

    public void E() {
        F(this.f28646f);
    }

    public void F(int r18) {
        int r2 = this.f28646f;
        if (r2 == r18) goto L5;
        f r22 = u(r2);
        this.f28646f = r18;
    L7:
        if (this.f28644e != null) goto L11;
        R();
        return;
    L11:
        if (this.f28664w == false) goto L15;
        R();
        return;
    L15:
        if (getWindowToken() == null) goto L182;
        this.f28644e.r(this);
        int r1 = this.f28665x;
        int r4 = Math.max(0, this.f28646f - r1);
        int r6 = this.f28644e.d();
        int r12 = Math.min(r6 - 1, this.f28646f + r1);
        if (r6 != this.f28637a) goto L139;
        int r7 = 0;
    L21:
        if (r7 >= this.f28639b.size()) goto L27;
        f r8 = (f) this.f28639b.get(r7);
        int r9 = r8.f28680b;
        int r10 = this.f28646f;
        if (r9 >= r10) goto L24;
        r7 = r7 + 1;
        goto L21
    L24:
        if (r9 != r10) goto L27;
    L28:
        if (r8 != null) goto L32;
        if (r6 <= 0) goto L32;
        r8 = a(this.f28646f, r7);
    L32:
        if (r8 == null) goto L103;
        int r102 = r7 - 1;
        if (r102 < 0) goto L36;
        f r11 = (f) this.f28639b.get(r102);
    L37:
        int r122 = getClientWidth();
        if (r122 > 0) goto L40;
        float r14 = 0.0f;
    L41:
        int r3 = this.f28646f - 1;
        float r15 = 0.0f;
    L42:
        if (r3 < 0) goto L67;
        if (r15 < r14) goto L57;
        if (r3 >= r4) goto L57;
        if (r11 == null) goto L67;
        if (r3 != r11.f28680b) goto L66;
        if (r11.f28681c == true) goto L66;
        this.f28639b.remove(r102);
        this.f28644e.a(this, r3, r11.f28679a);
        r102 = r102 - 1;
        r7 = r7 - 1;
        if (r102 < 0) goto L55;
        f r5 = (f) this.f28639b.get(r102);
    L56:
        r11 = r5;
    L55:
        r5 = null;
    L66:
        r3 = r3 - 1;
    L57:
        if (r11 != null) goto L59;
    L63:
        r15 = r15 + a(r3, r102 + 1).d;
        r7 = r7 + 1;
        if (r102 < 0) goto L55;
        r5 = (f) this.f28639b.get(r102);
        goto L56
    L59:
        if (r3 != r11.f28680b) goto L63;
        r15 = r15 + r11.d;
        r102 = r102 - 1;
        if (r102 < 0) goto L55;
        r5 = (f) this.f28639b.get(r102);
    L67:
        float r32 = r8.d;
        int r42 = r7 + 1;
        if (r32 < 2.0f) goto L70;
    L102:
        e(r8, r7, r22);
        this.f28644e.o(this, this.f28646f, r8.f28679a);
        goto L103
    L70:
        if (r42 >= this.f28639b.size()) goto L72;
        f r52 = (f) this.f28639b.get(r42);
    L73:
        if (r122 > 0) goto L75;
        float r103 = 0.0f;
    L76:
        int r112 = this.f28646f;
    L77:
        r112 = r112 + 1;
        if (r112 >= r6) goto L102;
        if (r32 < r103) goto L92;
        if (r112 <= r12) goto L92;
        if (r52 == null) goto L102;
        if (r112 != r52.f28680b) goto L77;
        if (r52.f28681c == true) goto L77;
        this.f28639b.remove(r42);
        this.f28644e.a(this, r112, r52.f28679a);
        if (r42 < this.f28639b.size()) goto L90;
    L91:
        r52 = null;
        goto L77
    L90:
        r52 = (f) this.f28639b.get(r42);
    L92:
        if (r52 == null) goto L98;
        if (r112 != r52.f28680b) goto L98;
        r32 = r32 + r52.d;
        r42 = r42 + 1;
        if (r42 >= this.f28639b.size()) goto L91;
        r52 = (f) this.f28639b.get(r42);
    L98:
        f r53 = a(r112, r42);
        r42 = r42 + 1;
        r32 = r32 + r53.d;
        if (r42 >= this.f28639b.size()) goto L91;
        r52 = (f) this.f28639b.get(r42);
        goto L77
    L75:
        r103 = (getPaddingRight() / r122) + 2.0f;
        goto L76
    L72:
        r52 = null;
        goto L73
    L40:
        r14 = (2.0f - r8.d) + (getPaddingLeft() / r122);
        goto L41
    L36:
        r11 = null;
    L103:
        this.f28644e.c(this);
        int r13 = getChildCount();
        int r23 = 0;
    L104:
        if (r23 >= r13) goto L113;
        View r33 = getChildAt(r23);
        LayoutParams r43 = (LayoutParams) r33.getLayoutParams();
        r43.f28672f = r23;
        if (r43.f28668a == true) goto L112;
        if (r43.f28670c != 0.0f) goto L112;
        f r34 = s(r33);
        if (r34 == null) goto L112;
        r43.f28670c = r34.d;
        r43.f28671e = r34.f28680b;
    L112:
        r23 = r23 + 1;
        goto L104
    L113:
        R();
        if (hasFocus() == false) goto L133;
        View r16 = findFocus();
        if (r16 == null) goto L118;
        f r35 = r(r16);
    L119:
        if (r35 != null) goto L121;
    L122:
        int r54 = 0;
    L124:
        if (r54 >= getChildCount()) goto L184;
        View r17 = getChildAt(r54);
        f r24 = s(r17);
        if (r24 == null) goto L132;
        if (r24.f28680b != this.f28646f) goto L132;
        if (r17.requestFocus(2) == false) goto L132;
        return;
    L132:
        r54 = r54 + 1;
        goto L124
    L184:
        return;
    L121:
        if (r35.f28680b != this.f28646f) goto L122;
        return;
    L118:
        r35 = null;
        goto L119
    L133:
        return;
    L27:
        r8 = null;
        goto L28
    L139:
        String r19 = getResources().getResourceName(getId());     // Catch: Resources.NotFoundException -> L136
    L138:
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f28637a + ", found: " + r6 + " Pager id: " + r19 + " Pager class: " + getClass() + " Problematic adapter: " + this.f28644e.getClass());
    L136:
        r19 = Integer.toHexString(getId());
        goto L138
    L182:
        return;
    L5:
        r22 = null;
        goto L7
    }

    public final void G(int r2, int r3, int r4, int r5) {
        if (r3 > 0) goto L4;
    L11:
        f r32 = u(this.f28646f);
        if (r32 == null) goto L14;
        float r33 = Math.min(r32.f28682e, this.f28659r);
    L15:
        int r22 = (int) (r33 * ((r2 - getPaddingLeft()) - getPaddingRight()));
        if (r22 == getScrollX()) goto L19;
        h(false);
        scrollTo(r22, getScrollY());
        return;
    L19:
        return;
    L14:
        r33 = 0.0f;
        goto L15
    L4:
        if (this.f28639b.isEmpty() == true) goto L11;
        if (this.f28650j.isFinished() == true) goto L9;
        this.f28650j.setFinalX(getCurrentItem() * getClientWidth());
        return;
    L9:
        scrollTo((int) ((getScrollX() / (((r3 - getPaddingLeft()) - getPaddingRight()) + r5)) * (((r2 - getPaddingLeft()) - getPaddingRight()) + r4)), getScrollY());
    }

    public final void H() {
        int r02 = 0;
    L4:
        if (r02 >= getChildCount()) goto L9;
        if (((LayoutParams) getChildAt(r02).getLayoutParams()).f28668a == true) goto L8;
        removeViewAt(r02);
        r02 = r02 - 1;
    L8:
        r02 = r02 + 1;
        goto L4
    }

    public void I(h r2) {
        List r02 = this.f28638a0;
        if (r02 == null) goto L6;
        r02.remove(r2);
        return;
    }

    public void J(i r2) {
        List r02 = this.f28634U;
        if (r02 == null) goto L6;
        r02.remove(r2);
        return;
    }

    public final void K(boolean r2) {
        ViewParent r02 = getParent();
        if (r02 == null) goto L6;
        r02.requestDisallowInterceptTouchEvent(r2);
        return;
    }

    public final boolean L() {
        this.f28621H = -1;
        o();
        this.f28628O.onRelease();
        this.f28629P.onRelease();
        if (this.f28628O.isFinished() == false) goto L5;
        return true;
    L5:
        if (this.f28629P.isFinished() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final void M(int r6, boolean r7, int r8, boolean r9) {
        f r02 = u(r6);
        if (r02 == null) goto L5;
        int r03 = (int) (getClientWidth() * Math.max(this.f28658q, Math.min(r02.f28682e, this.f28659r)));
    L6:
        if (r7 == false) goto L11;
        Q(r03, 0, r8);
        if (r9 == false) goto L15;
        l(r6);
        return;
    L15:
        return;
    L11:
        if (r9 == false) goto L13;
        l(r6);
    L13:
        h(false);
        scrollTo(r03, 0);
        C(r03);
        return;
    L5:
        r03 = 0;
        goto L6
    }

    public void N(int r2, boolean r3, boolean r4) {
        O(r2, r3, r4, 0);
    }

    public void O(int r5, boolean r6, boolean r7, int r8) {
        androidx.viewpager.widget.a r02 = this.f28644e;
        boolean r1 = false;
        if (r02 != null) goto L5;
    L40:
        setScrollingCacheEnabled(false);
        return;
    L5:
        if (r02.d() <= 0) goto L40;
        if (r7 == true) goto L15;
        if (this.f28646f != r5) goto L15;
        if (this.f28639b.size() == 0) goto L15;
        setScrollingCacheEnabled(false);
        return;
    L15:
        if (r5 >= 0) goto L18;
        r5 = 0;
    L20:
        int r03 = this.f28665x;
        int r2 = this.f28646f;
        if (r5 <= (r2 + r03)) goto L23;
    L24:
        int r04 = 0;
    L26:
        if (r04 >= this.f28639b.size()) goto L29;
        ((f) this.f28639b.get(r04)).f28681c = true;
        r04 = r04 + 1;
    L29:
        if (this.f28646f == r5) goto L32;
        r1 = true;
    L32:
        if (this.f28630Q == false) goto L38;
        this.f28646f = r5;
        if (r1 == false) goto L36;
        l(r5);
    L36:
        requestLayout();
        return;
    L38:
        F(r5);
        M(r5, r6, r8, r1);
        return;
    L23:
        if (r5 >= (r2 - r03)) goto L29;
    L18:
        if (r5 < this.f28644e.d()) goto L20;
        r5 = this.f28644e.d() - 1;
        goto L20
    }

    public i P(i r2) {
        i r02 = this.f28636W;
        this.f28636W = r2;
        return r02;
    }

    public void Q(int r9, int r10, int r11) {
        if (getChildCount() != 0) goto L6;
        setScrollingCacheEnabled(false);
        return;
    L6:
        Scroller r02 = this.f28650j;
        if (r02 != null) goto L9;
    L16:
        int r03 = getScrollX();
    L15:
        int r3 = r03;
        int r4 = getScrollY();
        int r5 = r9 - r3;
        int r6 = r10 - r4;
        if (r5 != 0) goto L22;
        if (r6 != 0) goto L22;
        h(false);
        E();
        setScrollState(0);
        return;
    L22:
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int r92 = getClientWidth();
        int r102 = r92 / 2;
        float r93 = r92;
        float r103 = r102;
        float r104 = r103 + (n(Math.min(1.0f, (Math.abs(r5) * 1.0f) / r93)) * r103);
        int r112 = Math.abs(r11);
        if (r112 <= 0) goto L25;
        int r94 = Math.round(Math.abs(r104 / r112) * 1000.0f) * 4;
    L26:
        int r7 = Math.min(r94, 600);
        this.f28651k = false;
        this.f28650j.startScroll(r3, r4, r5, r6, r7);
        AbstractC3869e0.d0(this);
        return;
    L25:
        r94 = (int) (((Math.abs(r5) / ((r93 * this.f28644e.g(this.f28646f)) + this.f28654m)) + 1.0f) * 100.0f);
        goto L26
    L9:
        if (r02.isFinished() == true) goto L16;
        if (this.f28651k == false) goto L13;
        r03 = this.f28650j.getCurrX();
    L14:
        this.f28650j.abortAnimation();
        setScrollingCacheEnabled(false);
        goto L15
    L13:
        r03 = this.f28650j.getStartX();
        goto L14
    }

    public final void R() {
        if (this.f28642c0 == 0) goto L14;
        ArrayList r02 = this.f28643d0;
        if (r02 != null) goto L7;
        this.f28643d0 = new ArrayList();
    L8:
        int r03 = getChildCount();
        int r1 = 0;
    L9:
        if (r1 >= r03) goto L11;
        View r2 = getChildAt(r1);
        this.f28643d0.add(r2);
        r1 = r1 + 1;
        goto L9
    L11:
        Collections.sort(this.f28643d0, f28610A0);
        return;
    L7:
        r02.clear();
        goto L8
    }

    public f a(int r3, int r4) {
        f r02 = new f();
        r02.f28680b = r3;
        r02.f28679a = this.f28644e.h(this, r3);
        r02.d = this.f28644e.g(r3);
        if (r4 >= 0) goto L5;
    L9:
        this.f28639b.add(r02);
        return r02;
    L5:
        if (r4 >= this.f28639b.size()) goto L9;
        this.f28639b.add(r4, r02);
        return r02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList r7, int r8, int r9) {
        int r02 = r7.size();
        int r1 = getDescendantFocusability();
        if (r1 == 393216) goto L16;
        int r2 = 0;
    L6:
        if (r2 >= getChildCount()) goto L16;
        View r3 = getChildAt(r2);
        if (r3.getVisibility() != 0) goto L14;
        f r4 = s(r3);
        if (r4 == null) goto L14;
        if (r4.f28680b != this.f28646f) goto L14;
        r3.addFocusables(r7, r8, r9);
    L14:
        r2 = r2 + 1;
    L16:
        if (r1 != 262144) goto L20;
        if (r02 == r7.size()) goto L20;
        return;
    L20:
        if (isFocusable() == true) goto L23;
        return;
    L23:
        if ((r9 & 1) == 1) goto L25;
    L29:
        r7.add(this);
        return;
    L25:
        if (isInTouchMode() == false) goto L29;
        if (isFocusableInTouchMode() == true) goto L29;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList r5) {
        int r02 = 0;
    L4:
        if (r02 >= getChildCount()) goto L13;
        View r1 = getChildAt(r02);
        if (r1.getVisibility() != 0) goto L12;
        f r2 = s(r1);
        if (r2 == null) goto L12;
        if (r2.f28680b != this.f28646f) goto L12;
        r1.addTouchables(r5);
    L12:
        r02 = r02 + 1;
        goto L4
    }

    @Override // android.view.ViewGroup
    public void addView(View r4, int r5, ViewGroup.LayoutParams r6) {
        if (checkLayoutParams(r6) == true) goto L5;
        r6 = generateLayoutParams(r6);
    L5:
        LayoutParams r02 = (LayoutParams) r6;
        boolean r1 = r02.f28668a | w(r4);
        r02.f28668a = r1;
        if (this.f28662u == false) goto L12;
        if (r1 == true) goto L11;
        r02.d = true;
        addViewInLayout(r4, r5, r6);
        return;
    L11:
        throw new IllegalStateException("Cannot add pager decor view during layout");
    L12:
        super.addView(r4, r5, r6);
    }

    public void b(h r2) {
        if (this.f28638a0 != null) goto L5;
        this.f28638a0 = new ArrayList();
    L5:
        this.f28638a0.add(r2);
    }

    public void c(i r2) {
        if (this.f28634U != null) goto L5;
        this.f28634U = new ArrayList();
    L5:
        this.f28634U.add(r2);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r5) {
        if (this.f28644e != null) goto L5;
        return false;
    L5:
        int r02 = getClientWidth();
        int r2 = getScrollX();
        if (r5 < 0) goto L8;
        if (r5 > 0) goto L13;
    L15:
        return false;
    L13:
        if (r2 >= ((int) (r02 * this.f28659r))) goto L15;
        return true;
    L8:
        if (r2 <= ((int) (r02 * this.f28658q))) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof LayoutParams) == true) goto L5;
        return false;
    L5:
        if (super.checkLayoutParams(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f28651k = true;
        if (this.f28650j.isFinished() == false) goto L5;
    L14:
        h(true);
        return;
    L5:
        if (this.f28650j.computeScrollOffset() == false) goto L14;
        int r02 = getScrollX();
        int r1 = getScrollY();
        int r2 = this.f28650j.getCurrX();
        int r3 = this.f28650j.getCurrY();
        if (r02 != r2) goto L9;
        if (r1 != r3) goto L9;
    L12:
        AbstractC3869e0.d0(this);
        return;
    L9:
        scrollTo(r2, r3);
        if (C(r2) == true) goto L12;
        this.f28650j.abortAnimation();
        scrollTo(0, r3);
        goto L12
    }

    public boolean d(int r5) {
        View r02 = findFocus();
        if (r02 != this) goto L5;
    L4:
        r02 = null;
    L17:
        View r1 = FocusFinder.getInstance().findNextFocus(this, r02, r5);
        if (r1 == null) goto L32;
        if (r1 == r02) goto L32;
        if (r5 != 17) goto L26;
        int r2 = q(this.d, r1).left;
        int r3 = q(this.d, r02).left;
        if (r02 == null) goto L25;
        if (r2 < r3) goto L25;
        boolean r03 = A();
    L43:
        if (r03 == false) goto L45;
        playSoundEffect(SoundEffectConstants.getContantForFocusDirection(r5));
    L45:
        return r03;
    L25:
        r03 = r1.requestFocus();
        goto L43
    L26:
        if (r5 != 66) goto L40;
        int r22 = q(this.d, r1).left;
        int r32 = q(this.d, r02).left;
        if (r02 == null) goto L31;
        if (r22 > r32) goto L31;
        r03 = B();
    L31:
        r03 = r1.requestFocus();
    L40:
        r03 = false;
    L32:
        if (r5 != 17) goto L34;
    L42:
        r03 = A();
        goto L43
    L34:
        if (r5 == 1) goto L42;
        if (r5 != 66) goto L38;
    L41:
        r03 = B();
        goto L43
    L38:
        if (r5 != 2) goto L40;
    L5:
        if (r02 == null) goto L17;
        ViewParent r23 = r02.getParent();
    L8:
        if ((r23 instanceof ViewGroup) == false) goto L12;
        if (r23 == this) goto L17;
        r23 = r23.getParent();
        goto L8
    L12:
        StringBuilder r24 = new StringBuilder();
        r24.append(r02.getClass().getSimpleName());
        ViewParent r04 = r02.getParent();
    L14:
        if ((r04 instanceof ViewGroup) == false) goto L16;
        r24.append(" => ");
        r24.append(r04.getClass().getSimpleName());
        r04 = r04.getParent();
        goto L14
    L16:
        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + r24.toString());
        goto L4
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent r2) {
        if (super.dispatchKeyEvent(r2) == false) goto L5;
        return true;
    L5:
        if (p(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r7) {
        if (r7.getEventType() == 4096) goto L5;
        int r02 = getChildCount();
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L19;
        View r3 = getChildAt(r2);
        if (r3.getVisibility() != 0) goto L18;
        f r4 = s(r3);
        if (r4 == null) goto L18;
        if (r4.f28680b != this.f28646f) goto L18;
        if (r3.dispatchPopulateAccessibilityEvent(r7) == false) goto L18;
        return true;
    L18:
        r2 = r2 + 1;
        goto L7
    L19:
        return false;
    L5:
        return super.dispatchPopulateAccessibilityEvent(r7);
    }

    @Override // android.view.View
    public void draw(Canvas r8) {
        super.draw(r8);
        int r02 = getOverScrollMode();
        boolean r1 = false;
        if (r02 == 0) goto L13;
        if (r02 != 1) goto L11;
        androidx.viewpager.widget.a r03 = this.f28644e;
        if (r03 == null) goto L11;
        if (r03.d() > 1) goto L13;
    L11:
        this.f28628O.finish();
        this.f28629P.finish();
    L18:
        if (r1 == false) goto L21;
        AbstractC3869e0.d0(this);
        return;
    L21:
        return;
    L13:
        if (this.f28628O.isFinished() == true) goto L16;
        int r04 = r8.save();
        int r12 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int r2 = getWidth();
        r8.rotate(270.0f);
        r8.translate((-r12) + getPaddingTop(), this.f28658q * r2);
        this.f28628O.setSize(r12, r2);
        r1 = this.f28628O.draw(r8);
        r8.restoreToCount(r04);
    L16:
        if (this.f28629P.isFinished() == true) goto L18;
        int r05 = r8.save();
        int r22 = getWidth();
        int r3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r8.rotate(90.0f);
        r8.translate(-getPaddingTop(), (-(this.f28659r + 1.0f)) * r22);
        this.f28629P.setSize(r3, r22);
        r1 = r1 | this.f28629P.draw(r8);
        r8.restoreToCount(r05);
        goto L18
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r02 = this.f28655n;
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.isStateful() == false) goto L9;
        r02.setState(getDrawableState());
        return;
    }

    public final void e(f r11, int r12, f r13) {
        int r02 = this.f28644e.d();
        int r1 = getClientWidth();
        if (r1 <= 0) goto L5;
        float r2 = this.f28654m / r1;
    L7:
        if (r13 == null) goto L39;
        int r3 = r13.f28680b;
        int r4 = r11.f28680b;
        if (r3 >= r4) goto L25;
        float r42 = (r13.f28682e + r13.d) + r2;
        int r32 = r3 + 1;
        int r132 = 0;
    L12:
        if (r32 > r11.f28680b) goto L39;
        if (r132 >= this.f28639b.size()) goto L39;
        Object r5 = this.f28639b.get(r132);
    L16:
        f r52 = (f) r5;
        if (r32 <= r52.f28680b) goto L22;
        if (r132 >= (this.f28639b.size() - 1)) goto L22;
        r132 = r132 + 1;
        r5 = this.f28639b.get(r132);
    L22:
        if (r32 >= r52.f28680b) goto L24;
        r42 = r42 + (this.f28644e.g(r32) + r2);
        r32 = r32 + 1;
        goto L22
    L24:
        r52.f28682e = r42;
        r42 = r42 + (r52.d + r2);
        r32 = r32 + 1;
        goto L12
    L25:
        if (r3 <= r4) goto L39;
        int r43 = this.f28639b.size() - 1;
        float r133 = r13.f28682e;
    L27:
        r3 = r3 - 1;
        if (r3 < r11.f28680b) goto L39;
        if (r43 < 0) goto L39;
        Object r53 = this.f28639b.get(r43);
    L31:
        f r54 = (f) r53;
        if (r3 >= r54.f28680b) goto L36;
        if (r43 <= 0) goto L36;
        r43 = r43 - 1;
        r53 = this.f28639b.get(r43);
    L36:
        if (r3 <= r54.f28680b) goto L38;
        r133 = r133 - (this.f28644e.g(r3) + r2);
        r3 = r3 - 1;
        goto L36
    L38:
        r133 = r133 - (r54.d + r2);
        r54.f28682e = r133;
    L39:
        int r134 = this.f28639b.size();
        float r33 = r11.f28682e;
        int r44 = r11.f28680b;
        int r55 = r44 - 1;
        if (r44 != 0) goto L42;
        float r6 = r33;
    L43:
        this.f28658q = r6;
        int r03 = r02 - 1;
        if (r44 != r03) goto L46;
        float r45 = (r11.d + r33) - 1.0f;
    L47:
        this.f28659r = r45;
        int r46 = r12 - 1;
    L48:
        if (r46 < 0) goto L57;
        f r7 = (f) this.f28639b.get(r46);
    L50:
        int r8 = r7.f28680b;
        if (r55 <= r8) goto L53;
        r33 = r33 - (this.f28644e.g(r55) + r2);
        r55 = r55 - 1;
        goto L50
    L53:
        r33 = r33 - (r7.d + r2);
        r7.f28682e = r33;
        if (r8 != 0) goto L56;
        this.f28658q = r33;
    L56:
        r46 = r46 - 1;
        r55 = r55 - 1;
        goto L48
    L57:
        float r34 = (r11.f28682e + r11.d) + r2;
        int r112 = r11.f28680b + 1;
        int r122 = r12 + 1;
    L58:
        if (r122 >= r134) goto L66;
        f r47 = (f) this.f28639b.get(r122);
    L60:
        int r56 = r47.f28680b;
        if (r112 >= r56) goto L63;
        r34 = r34 + (this.f28644e.g(r112) + r2);
        r112 = r112 + 1;
        goto L60
    L63:
        if (r56 != r03) goto L65;
        this.f28659r = (r47.d + r34) - 1.0f;
    L65:
        r47.f28682e = r34;
        r34 = r34 + (r47.d + r2);
        r122 = r122 + 1;
        r112 = r112 + 1;
        goto L58
    L66:
        this.f28631R = false;
        return;
    L46:
        r45 = Float.MAX_VALUE;
        goto L47
    L42:
        r6 = -3.4028235E38f;
        goto L43
    L5:
        r2 = 0.0f;
        goto L7
    }

    public boolean f(View r12, boolean r13, int r14, int r15, int r16) {
        if ((r12 instanceof ViewGroup) == false) goto L18;
        ViewGroup r02 = (ViewGroup) r12;
        int r2 = r12.getScrollX();
        int r3 = r12.getScrollY();
        int r4 = r02.getChildCount() - 1;
    L5:
        if (r4 < 0) goto L18;
        View r6 = r02.getChildAt(r4);
        int r5 = r15 + r2;
        if (r5 < r6.getLeft()) goto L17;
        if (r5 >= r6.getRight()) goto L17;
        int r7 = r16 + r3;
        if (r7 < r6.getTop()) goto L17;
        if (r7 >= r6.getBottom()) goto L17;
        if (f(r6, true, r14, r5 - r6.getLeft(), r7 - r6.getTop()) == false) goto L17;
        return true;
    L17:
        r4 = r4 - 1;
    L18:
        if (r13 == true) goto L20;
        return false;
    L20:
        if (r12.canScrollHorizontally(-r14) == false) goto L31;
        return true;
    L31:
        return false;
    }

    public void g() {
        List r02 = this.f28634U;
        if (r02 == null) goto L6;
        r02.clear();
        return;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r1) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f28644e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int r3, int r4) {
        if (this.f28642c0 != 2) goto L6;
        r4 = (r3 - 1) - r4;
    L6:
        return ((LayoutParams) ((View) this.f28643d0.get(r4)).getLayoutParams()).f28672f;
    }

    public int getCurrentItem() {
        return this.f28646f;
    }

    public int getOffscreenPageLimit() {
        return this.f28665x;
    }

    public int getPageMargin() {
        return this.f28654m;
    }

    public final void h(boolean r8) {
        if (this.f28652k0 != 2) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == false) goto L15;
        setScrollingCacheEnabled(false);
        if (this.f28650j.isFinished() == true) goto L15;
        this.f28650j.abortAnimation();
        int r1 = getScrollX();
        int r4 = getScrollY();
        int r5 = this.f28650j.getCurrX();
        int r6 = this.f28650j.getCurrY();
        if (r1 != r5) goto L12;
        if (r4 == r6) goto L15;
    L12:
        scrollTo(r5, r6);
        if (r5 == r1) goto L15;
        C(r5);
    L15:
        this.f28664w = false;
        int r12 = 0;
    L17:
        if (r12 >= this.f28639b.size()) goto L22;
        f r42 = (f) this.f28639b.get(r12);
        if (r42.f28681c == false) goto L21;
        r42.f28681c = false;
        r02 = true;
    L21:
        r12 = r12 + 1;
        goto L17
    L22:
        if (r02 == false) goto L31;
        if (r8 == false) goto L26;
        AbstractC3869e0.e0(this, this.f28645e0);
        return;
    L26:
        this.f28645e0.run();
        return;
    L31:
        return;
    L5:
        r02 = false;
        goto L6
    }

    public void i() {
        int r02 = this.f28644e.d();
        this.f28637a = r02;
        if (this.f28639b.size() < ((this.f28665x * 2) + 1)) goto L5;
    L7:
        boolean r1 = false;
    L8:
        int r2 = this.f28646f;
        int r5 = 0;
        boolean r6 = false;
    L10:
        if (r5 >= this.f28639b.size()) goto L30;
        f r7 = (f) this.f28639b.get(r5);
        int r8 = this.f28644e.e(r7.f28679a);
        if (r8 == (-1)) goto L29;
        if (r8 != (-2)) goto L23;
        this.f28639b.remove(r5);
        r5 = r5 - 1;
        if (r6 == true) goto L19;
        this.f28644e.r(this);
        r6 = true;
    L19:
        this.f28644e.a(this, r7.f28680b, r7.f28679a);
        int r12 = this.f28646f;
        if (r12 != r7.f28680b) goto L22;
        r2 = Math.max(0, Math.min(r12, r02 - 1));
    L22:
        r1 = true;
        goto L29
    L23:
        int r9 = r7.f28680b;
        if (r9 == r8) goto L29;
        if (r9 != this.f28646f) goto L28;
        r2 = r8;
    L28:
        r7.f28680b = r8;
    L29:
        r5 = r5 + 1;
        goto L10
    L30:
        if (r6 == false) goto L32;
        this.f28644e.c(this);
    L32:
        Collections.sort(this.f28639b, f28612y0);
        if (r1 == false) goto L49;
        int r03 = getChildCount();
        int r13 = 0;
    L35:
        if (r13 >= r03) goto L40;
        LayoutParams r52 = (LayoutParams) getChildAt(r13).getLayoutParams();
        if (r52.f28668a == true) goto L39;
        r52.f28670c = 0.0f;
    L39:
        r13 = r13 + 1;
        goto L35
    L40:
        N(r2, false, true);
        requestLayout();
        return;
    L49:
        return;
    L5:
        if (this.f28639b.size() >= r02) goto L7;
        r1 = true;
        goto L8
    }

    public final int j(int r2, float r3, int r4, int r5) {
        if (Math.abs(r5) <= this.f28625L) goto L10;
        if (Math.abs(r4) <= this.f28623J) goto L10;
        if (r4 > 0) goto L15;
        r2 = r2 + 1;
    L15:
        if (this.f28639b.size() > 0) goto L17;
        return r2;
    L17:
        return Math.max(((f) this.f28639b.get(0)).f28680b, Math.min(r2, ((f) this.f28639b.get(r4.size() - 1)).f28680b));
    L10:
        if (r2 < this.f28646f) goto L12;
        float r42 = 0.4f;
    L13:
        r2 = r2 + ((int) (r3 + r42));
        goto L15
    L12:
        r42 = 0.6f;
        goto L13
    }

    public final void k(int r4, float r5, int r6) {
        i r02 = this.f28635V;
        if (r02 == null) goto L5;
        r02.onPageScrolled(r4, r5, r6);
    L5:
        List r03 = this.f28634U;
        if (r03 == null) goto L13;
        int r04 = r03.size();
        int r1 = 0;
    L8:
        if (r1 >= r04) goto L13;
        i r2 = (i) this.f28634U.get(r1);
        if (r2 == null) goto L12;
        r2.onPageScrolled(r4, r5, r6);
    L12:
        r1 = r1 + 1;
    L13:
        i r05 = this.f28636W;
        if (r05 == null) goto L20;
        r05.onPageScrolled(r4, r5, r6);
        return;
    }

    public final void l(int r4) {
        i r02 = this.f28635V;
        if (r02 == null) goto L5;
        r02.onPageSelected(r4);
    L5:
        List r03 = this.f28634U;
        if (r03 == null) goto L13;
        int r04 = r03.size();
        int r1 = 0;
    L8:
        if (r1 >= r04) goto L13;
        i r2 = (i) this.f28634U.get(r1);
        if (r2 == null) goto L12;
        r2.onPageSelected(r4);
    L12:
        r1 = r1 + 1;
    L13:
        i r05 = this.f28636W;
        if (r05 == null) goto L20;
        r05.onPageSelected(r4);
        return;
    }

    public final void m(int r4) {
        i r02 = this.f28635V;
        if (r02 == null) goto L5;
        r02.onPageScrollStateChanged(r4);
    L5:
        List r03 = this.f28634U;
        if (r03 == null) goto L13;
        int r04 = r03.size();
        int r1 = 0;
    L8:
        if (r1 >= r04) goto L13;
        i r2 = (i) this.f28634U.get(r1);
        if (r2 == null) goto L12;
        r2.onPageScrollStateChanged(r4);
    L12:
        r1 = r1 + 1;
    L13:
        i r05 = this.f28636W;
        if (r05 == null) goto L20;
        r05.onPageScrollStateChanged(r4);
        return;
    }

    public float n(float r3) {
        return (float) Math.sin((r3 - 0.5f) * 0.47123894f);
    }

    public final void o() {
        this.f28666y = false;
        this.f28667z = false;
        VelocityTracker r02 = this.f28622I;
        if (r02 == null) goto L6;
        r02.recycle();
        this.f28622I = null;
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28630Q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f28645e0);
        Scroller r02 = this.f28650j;
        if (r02 != null) goto L5;
    L7:
        super.onDetachedFromWindow();
        return;
    L5:
        if (r02.isFinished() == true) goto L7;
        this.f28650j.abortAnimation();
        goto L7
    }

    @Override // android.view.View
    public void onDraw(Canvas r18) {
        super.onDraw(r18);
        if (this.f28654m > 0) goto L5;
        return;
    L5:
        if (this.f28655n != null) goto L7;
        return;
    L7:
        if (this.f28639b.size() > 0) goto L9;
        return;
    L9:
        if (this.f28644e == null) goto L34;
        int r1 = getScrollX();
        float r4 = getWidth();
        float r3 = this.f28654m / r4;
        int r6 = 0;
        f r5 = (f) this.f28639b.get(0);
        float r7 = r5.f28682e;
        int r8 = this.f28639b.size();
        int r9 = r5.f28680b;
        int r10 = ((f) this.f28639b.get(r8 - 1)).f28680b;
    L11:
        if (r9 >= r10) goto L35;
    L12:
        int r11 = r5.f28680b;
        if (r9 <= r11) goto L16;
        if (r6 >= r8) goto L16;
        r6 = r6 + 1;
        r5 = (f) this.f28639b.get(r6);
    L16:
        if (r9 != r11) goto L18;
        float r72 = r5.f28682e;
        float r112 = r5.d;
        float r12 = (r72 + r112) * r4;
        r7 = (r72 + r112) + r3;
    L20:
        if ((this.f28654m + r12) <= r1) goto L22;
        int r16 = r1;
        this.f28655n.setBounds(Math.round(r12), this.f28656o, Math.round(this.f28654m + r12), this.f28657p);
        this.f28655n.draw(r18);
    L24:
        if (r12 > (r16 + r2)) goto L36;
        r9 = r9 + 1;
        r1 = r16;
        goto L11
    L36:
        return;
    L22:
        r16 = r1;
        goto L24
    L18:
        float r113 = this.f28644e.g(r9);
        r12 = (r7 + r113) * r4;
        r7 = r7 + (r113 + r3);
        goto L20
    L35:
        return;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent r14) {
        int r1 = r14.getAction() & Constants.MAX_HOST_LENGTH;
        if (r1 != 3) goto L5;
    L60:
        L();
        return false;
    L5:
        if (r1 == 1) goto L60;
        if (r1 == 0) goto L15;
        if (this.f28666y == false) goto L12;
        return true;
    L12:
        if (this.f28667z == false) goto L15;
        return false;
    L15:
        if (r1 == 0) goto L49;
        if (r1 != 2) goto L18;
        int r12 = this.f28621H;
        if (r12 == (-1)) goto L56;
        int r13 = r14.findPointerIndex(r12);
        float r8 = r14.getX(r13);
        float r2 = r8 - this.f28617D;
        float r9 = Math.abs(r2);
        float r10 = r14.getY(r13);
        float r11 = Math.abs(r10 - this.f28620G);
        if (r2 != 0.0f) goto L27;
    L32:
        int r15 = this.f28616C;
        if (r9 <= r15) goto L42;
        if ((r9 * 0.5f) <= r11) goto L42;
        this.f28666y = true;
        K(true);
        setScrollState(1);
        float r16 = this.f28619F;
        float r22 = this.f28616C;
        if (r2 <= 0.0f) goto L39;
        float r17 = r16 + r22;
    L40:
        this.f28617D = r17;
        this.f28618E = r10;
        setScrollingCacheEnabled(true);
    L45:
        if (this.f28666y == false) goto L56;
        if (D(r8) == false) goto L56;
        AbstractC3869e0.d0(this);
        goto L56
    L39:
        r17 = r16 - r22;
    L42:
        if (r11 <= r15) goto L45;
        this.f28667z = true;
        goto L45
    L27:
        if (x(this.f28617D, r2) == true) goto L32;
        if (f(this, false, (int) r2, (int) r8, (int) r10) == false) goto L32;
        this.f28617D = r8;
        this.f28618E = r10;
        this.f28667z = true;
        return false;
    L56:
        if (this.f28622I != null) goto L58;
        this.f28622I = VelocityTracker.obtain();
    L58:
        this.f28622I.addMovement(r14);
        return this.f28666y;
    L18:
        if (r1 != 6) goto L56;
        z(r14);
        goto L56
    L49:
        float r18 = r14.getX();
        this.f28619F = r18;
        this.f28617D = r18;
        float r19 = r14.getY();
        this.f28620G = r19;
        this.f28618E = r19;
        this.f28621H = r14.getPointerId(0);
        this.f28667z = false;
        this.f28651k = true;
        this.f28650j.computeScrollOffset();
        if (this.f28652k0 == 2) goto L52;
    L54:
        h(false);
        this.f28666y = false;
        goto L56
    L52:
        if (Math.abs(this.f28650j.getFinalX() - this.f28650j.getCurrX()) <= this.f28626M) goto L54;
        this.f28650j.abortAnimation();
        this.f28664w = false;
        E();
        this.f28666y = true;
        K(true);
        setScrollState(1);
        goto L56
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        int r1 = getChildCount();
        int r2 = r22 - r20;
        int r3 = r23 - r21;
        int r4 = getPaddingLeft();
        int r5 = getPaddingTop();
        int r6 = getPaddingRight();
        int r7 = getPaddingBottom();
        int r8 = getScrollX();
        int r10 = 0;
        int r11 = 0;
    L4:
        if (r10 >= r1) goto L33;
        View r13 = getChildAt(r10);
        if (r13.getVisibility() == 8) goto L32;
        LayoutParams r12 = (LayoutParams) r13.getLayoutParams();
        if (r12.f28668a == false) goto L32;
        int r122 = r12.f28669b;
        int r14 = r122 & 7;
        int r123 = r122 & 112;
        if (r14 != 1) goto L12;
        int r142 = Math.max((r2 - r13.getMeasuredWidth()) / 2, r4);
    L17:
        int r17 = r142;
        int r143 = r4;
        r4 = r17;
    L21:
        if (r123 != 16) goto L23;
        int r124 = Math.max((r3 - r13.getMeasuredHeight()) / 2, r5);
    L28:
        int r172 = r124;
        int r125 = r5;
        r5 = r172;
    L31:
        int r42 = r4 + r8;
        r13.layout(r42, r5, r13.getMeasuredWidth() + r42, r5 + r13.getMeasuredHeight());
        r11 = r11 + 1;
        r5 = r125;
        r4 = r143;
        goto L32
    L23:
        if (r123 != 48) goto L25;
        r125 = r13.getMeasuredHeight() + r5;
        goto L31
    L25:
        if (r123 == 80) goto L27;
        r125 = r5;
        goto L31
    L27:
        r124 = (r3 - r7) - r13.getMeasuredHeight();
        r7 = r7 + r13.getMeasuredHeight();
        goto L28
    L12:
        if (r14 != 3) goto L14;
        r143 = r13.getMeasuredWidth() + r4;
        goto L21
    L14:
        if (r14 == 5) goto L16;
        r143 = r4;
        goto L21
    L16:
        r142 = (r2 - r6) - r13.getMeasuredWidth();
        r6 = r6 + r13.getMeasuredWidth();
    L32:
        r10 = r10 + 1;
        goto L4
    L33:
        int r24 = (r2 - r4) - r6;
        int r62 = 0;
    L34:
        if (r62 >= r1) goto L46;
        View r82 = getChildAt(r62);
        if (r82.getVisibility() == 8) goto L45;
        LayoutParams r9 = (LayoutParams) r82.getLayoutParams();
        if (r9.f28668a == true) goto L45;
        f r102 = s(r82);
        if (r102 == null) goto L45;
        float r132 = r24;
        int r103 = ((int) (r102.f28682e * r132)) + r4;
        if (r9.d == false) goto L44;
        r9.d = false;
        r82.measure(View.MeasureSpec.makeMeasureSpec((int) (r132 * r9.f28670c), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((r3 - r5) - r7, Ints.MAX_POWER_OF_TWO));
    L44:
        r82.layout(r103, r5, r82.getMeasuredWidth() + r103, r82.getMeasuredHeight() + r5);
    L45:
        r62 = r62 + 1;
        goto L34
    L46:
        this.f28656o = r5;
        this.f28657p = r3 - r7;
        this.f28633T = r11;
        if (this.f28630Q == false) goto L49;
        boolean r144 = false;
        M(this.f28646f, false, 0, false);
    L50:
        this.f28630Q = r144;
        return;
    L49:
        r144 = false;
        goto L50
    }

    @Override // android.view.View
    public void onMeasure(int r14, int r15) {
        int r02 = 0;
        setMeasuredDimension(View.getDefaultSize(0, r14), View.getDefaultSize(0, r15));
        int r142 = getMeasuredWidth();
        this.f28615B = Math.min(r142 / 10, this.f28614A);
        int r143 = (r142 - getPaddingLeft()) - getPaddingRight();
        int r152 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int r1 = getChildCount();
        int r2 = 0;
    L3:
        boolean r4 = true;
        int r5 = Ints.MAX_POWER_OF_TWO;
        if (r2 >= r1) goto L48;
        View r6 = getChildAt(r2);
        if (r6.getVisibility() == 8) goto L47;
        LayoutParams r3 = (LayoutParams) r6.getLayoutParams();
        if (r3 == null) goto L47;
        if (r3.f28668a == false) goto L47;
        int r7 = r3.f28669b;
        int r8 = r7 & 7;
        int r72 = r7 & 112;
        if (r72 != 48) goto L14;
    L17:
        boolean r73 = true;
    L19:
        if (r8 != 3) goto L21;
    L24:
        int r82 = Integer.MIN_VALUE;
        if (r73 == false) goto L27;
        int r9 = Integer.MIN_VALUE;
        r82 = 1073741824;
    L30:
        int r10 = ((ViewGroup.LayoutParams) r3).width;
        if (r10 == (-2)) goto L35;
        if (r10 == (-1)) goto L34;
    L33:
        r82 = 1073741824;
    L36:
        int r32 = ((ViewGroup.LayoutParams) r3).height;
        if (r32 == (-2)) goto L41;
        if (r32 != (-1)) goto L42;
        r32 = r152;
    L42:
        r6.measure(View.MeasureSpec.makeMeasureSpec(r10, r82), View.MeasureSpec.makeMeasureSpec(r32, r5));
        if (r73 == false) goto L45;
        r152 = r152 - r6.getMeasuredHeight();
        goto L47
    L45:
        if (r4 == false) goto L47;
        r143 = r143 - r6.getMeasuredWidth();
        goto L47
    L41:
        r32 = r152;
        r5 = r9;
        goto L42
    L34:
        r10 = r143;
        goto L33
    L35:
        r10 = r143;
        goto L36
    L27:
        if (r4 == false) goto L29;
        r9 = 1073741824;
        goto L30
    L29:
        r9 = Integer.MIN_VALUE;
        goto L30
    L21:
        if (r8 == 5) goto L24;
        r4 = false;
        goto L24
    L14:
        if (r72 == 80) goto L17;
        r73 = false;
    L47:
        r2 = r2 + 1;
        goto L3
    L48:
        this.f28660s = View.MeasureSpec.makeMeasureSpec(r143, Ints.MAX_POWER_OF_TWO);
        this.f28661t = View.MeasureSpec.makeMeasureSpec(r152, Ints.MAX_POWER_OF_TWO);
        this.f28662u = true;
        E();
        this.f28662u = false;
        int r153 = getChildCount();
    L49:
        if (r02 >= r153) goto L58;
        View r12 = getChildAt(r02);
        if (r12.getVisibility() == 8) goto L57;
        LayoutParams r22 = (LayoutParams) r12.getLayoutParams();
        if (r22 != null) goto L55;
    L56:
        r12.measure(View.MeasureSpec.makeMeasureSpec((int) (r143 * r22.f28670c), Ints.MAX_POWER_OF_TWO), this.f28661t);
        goto L57
    L55:
        if (r22.f28668a == false) goto L56;
    L57:
        r02 = r02 + 1;
        goto L49
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int r9, Rect r10) {
        int r02 = getChildCount();
        if ((r9 & 2) == 0) goto L5;
        int r1 = r02;
        int r03 = 0;
        int r4 = 1;
    L6:
        if (r03 == r1) goto L17;
        View r5 = getChildAt(r03);
        if (r5.getVisibility() != 0) goto L16;
        f r6 = s(r5);
        if (r6 == null) goto L16;
        if (r6.f28680b != this.f28646f) goto L16;
        if (r5.requestFocus(r9, r10) == false) goto L16;
        return true;
    L16:
        r03 = r03 + r4;
        goto L6
    L17:
        return false;
    L5:
        r03 = r02 - 1;
        r1 = -1;
        r4 = -1;
        goto L6
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable r4) {
        if ((r4 instanceof SavedState) == true) goto L6;
        super.onRestoreInstanceState(r4);
        return;
    L6:
        SavedState r42 = (SavedState) r4;
        super.onRestoreInstanceState(r42.getSuperState());
        androidx.viewpager.widget.a r02 = this.f28644e;
        if (r02 == null) goto L10;
        r02.l(r42.f28674b, r42.f28675c);
        N(r42.f28673a, false, true);
        return;
    L10:
        this.f28647g = r42.f28673a;
        this.f28648h = r42.f28674b;
        this.f28649i = r42.f28675c;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState r1 = new SavedState(super.onSaveInstanceState());
        r1.f28673a = this.f28646f;
        androidx.viewpager.widget.a r02 = this.f28644e;
        if (r02 == null) goto L5;
        r1.f28674b = r02.m();
    L5:
        return r1;
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 == r3) goto L6;
        int r22 = this.f28654m;
        G(r1, r3, r22, r22);
        return;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent r8) {
        if (this.f28627N == false) goto L5;
        return true;
    L5:
        boolean r2 = false;
        if (r8.getAction() == 0) goto L8;
    L10:
        androidx.viewpager.widget.a r02 = this.f28644e;
        if (r02 != null) goto L13;
    L61:
        return false;
    L13:
        if (r02.d() == 0) goto L61;
        if (this.f28622I != null) goto L18;
        this.f28622I = VelocityTracker.obtain();
    L18:
        this.f28622I.addMovement(r8);
        int r03 = r8.getAction() & Constants.MAX_HOST_LENGTH;
        if (r03 == 0) goto L57;
        if (r03 == 1) goto L55;
        if (r03 == 2) goto L36;
        if (r03 == 3) goto L33;
        if (r03 != 5) goto L28;
        int r04 = r8.getActionIndex();
        this.f28617D = r8.getX(r04);
        this.f28621H = r8.getPointerId(r04);
    L58:
        if (r2 == false) goto L60;
        AbstractC3869e0.d0(this);
    L60:
        return true;
    L28:
        if (r03 != 6) goto L58;
        z(r8);
        this.f28617D = r8.getX(r8.findPointerIndex(this.f28621H));
        goto L58
    L33:
        if (this.f28666y == false) goto L58;
        M(this.f28646f, true, 0, false);
        r2 = L();
        goto L58
    L36:
        if (this.f28666y == true) goto L52;
        int r05 = r8.findPointerIndex(this.f28621H);
        if (r05 != (-1)) goto L40;
        r2 = L();
        goto L58
    L40:
        float r3 = r8.getX(r05);
        float r4 = Math.abs(r3 - this.f28617D);
        float r06 = r8.getY(r05);
        float r5 = Math.abs(r06 - this.f28618E);
        if (r4 <= this.f28616C) goto L52;
        if (r4 <= r5) goto L52;
        this.f28666y = true;
        K(true);
        float r42 = this.f28619F;
        if ((r3 - r42) <= 0.0f) goto L47;
        float r43 = r42 + this.f28616C;
    L48:
        this.f28617D = r43;
        this.f28618E = r06;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        ViewParent r07 = getParent();
        if (r07 == null) goto L52;
        r07.requestDisallowInterceptTouchEvent(true);
        goto L52
    L47:
        r43 = r42 - this.f28616C;
    L52:
        if (this.f28666y == false) goto L58;
        r2 = D(r8.getX(r8.findPointerIndex(this.f28621H)));
        goto L58
    L55:
        if (this.f28666y == false) goto L58;
        VelocityTracker r08 = this.f28622I;
        r08.computeCurrentVelocity(1000, this.f28624K);
        int r09 = (int) r08.getXVelocity(this.f28621H);
        this.f28664w = true;
        int r22 = getClientWidth();
        int r32 = getScrollX();
        f r44 = t();
        float r23 = r22;
        O(j(r44.f28680b, ((r32 / r23) - r44.f28682e) / (r44.d + (this.f28654m / r23)), r09, (int) (r8.getX(r8.findPointerIndex(this.f28621H)) - this.f28619F)), true, true, r09);
        r2 = L();
        goto L58
    L57:
        this.f28650j.abortAnimation();
        this.f28664w = false;
        E();
        float r010 = r8.getX();
        this.f28619F = r010;
        this.f28617D = r010;
        float r011 = r8.getY();
        this.f28620G = r011;
        this.f28618E = r011;
        this.f28621H = r8.getPointerId(0);
        goto L58
    L8:
        if (r8.getEdgeFlags() == 0) goto L10;
        return false;
    }

    public boolean p(KeyEvent r4) {
        if (r4.getAction() != 0) goto L31;
        int r02 = r4.getKeyCode();
        if (r02 == 21) goto L26;
        if (r02 == 22) goto L20;
        if (r02 == 61) goto L12;
        return false;
    L12:
        if (r4.hasNoModifiers() == false) goto L16;
        return d(2);
    L16:
        if (r4.hasModifiers(1) == true) goto L18;
        return false;
    L18:
        return d(1);
    L20:
        if (r4.hasModifiers(2) == false) goto L24;
        return B();
    L24:
        return d(66);
    L26:
        if (r4.hasModifiers(2) == false) goto L30;
        return A();
    L30:
        return d(17);
    L31:
        return false;
    }

    public final Rect q(Rect r3, View r4) {
        if (r3 != null) goto L4;
        r3 = new Rect();
    L4:
        if (r4 != null) goto L7;
        r3.set(0, 0, 0, 0);
        return r3;
    L7:
        r3.left = r4.getLeft();
        r3.right = r4.getRight();
        r3.top = r4.getTop();
        r3.bottom = r4.getBottom();
        ViewParent r42 = r4.getParent();
    L9:
        if ((r42 instanceof ViewGroup) == false) goto L12;
        if (r42 == this) goto L12;
        ViewGroup r43 = (ViewGroup) r42;
        r3.left += r43.getLeft();
        r3.right += r43.getRight();
        r3.top += r43.getTop();
        r3.bottom += r43.getBottom();
        r42 = r43.getParent();
    L12:
        return r3;
    }

    public f r(View r2) {
    L2:
        Object r02 = r2.getParent();
        if (r02 == this) goto L12;
        if (r02 == null) goto L9;
        if ((r02 instanceof View) == false) goto L16;
        r2 = (View) r02;
        goto L2
    L16:
        return null;
    L9:
        return null;
    L12:
        return s(r2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View r2) {
        if (this.f28662u == false) goto L6;
        removeViewInLayout(r2);
        return;
    L6:
        super.removeView(r2);
    }

    public f s(View r5) {
        int r02 = 0;
    L4:
        if (r02 >= this.f28639b.size()) goto L9;
        f r1 = (f) this.f28639b.get(r02);
        if (this.f28644e.i(r5, r1.f28679a) == true) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r1;
    L9:
        return null;
    }

    public void setAdapter(androidx.viewpager.widget.a r8) {
        androidx.viewpager.widget.a r02 = this.f28644e;
        int r2 = 0;
        if (r02 == null) goto L9;
        r02.p(null);
        this.f28644e.r(this);
        int r03 = 0;
    L6:
        if (r03 >= this.f28639b.size()) goto L8;
        f r3 = (f) this.f28639b.get(r03);
        this.f28644e.a(this, r3.f28680b, r3.f28679a);
        r03 = r03 + 1;
        goto L6
    L8:
        this.f28644e.c(this);
        this.f28639b.clear();
        H();
        this.f28646f = 0;
        scrollTo(0, 0);
    L9:
        androidx.viewpager.widget.a r04 = this.f28644e;
        this.f28644e = r8;
        this.f28637a = 0;
        if (r8 != null) goto L12;
    L20:
        List r1 = this.f28638a0;
        if (r1 != null) goto L23;
        return;
    L23:
        if (r1.isEmpty() == true) goto L30;
        int r12 = this.f28638a0.size();
    L25:
        if (r2 >= r12) goto L31;
        ((h) this.f28638a0.get(r2)).onAdapterChanged(this, r04, r8);
        r2 = r2 + 1;
        goto L25
    L31:
        return;
    L30:
        return;
    L12:
        if (this.f28653l != null) goto L14;
        this.f28653l = new k(this);
    L14:
        this.f28644e.p(this.f28653l);
        this.f28664w = false;
        boolean r32 = this.f28630Q;
        this.f28630Q = true;
        this.f28637a = this.f28644e.d();
        if (this.f28647g < 0) goto L17;
        this.f28644e.l(this.f28648h, this.f28649i);
        N(this.f28647g, false, true);
        this.f28647g = -1;
        this.f28648h = null;
        this.f28649i = null;
        goto L20
    L17:
        if (r32 == true) goto L19;
        E();
        goto L20
    L19:
        requestLayout();
        goto L20
    }

    public void setCurrentItem(int r3) {
        this.f28664w = false;
        N(r3, !this.f28630Q, false);
    }

    public void setOffscreenPageLimit(int r4) {
        if (r4 >= 1) goto L6;
        Log.w("ViewPager", "Requested offscreen page limit " + r4 + " too small; defaulting to 1");
        r4 = 1;
    L6:
        if (r4 == this.f28665x) goto L9;
        this.f28665x = r4;
        E();
        return;
    }

    @Deprecated
    public void setOnPageChangeListener(i r1) {
        this.f28635V = r1;
    }

    public void setPageMargin(int r3) {
        int r02 = this.f28654m;
        this.f28654m = r3;
        int r1 = getWidth();
        G(r1, r1, r3, r02);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable r1) {
        this.f28655n = r1;
        if (r1 == null) goto L5;
        refreshDrawableState();
    L5:
        if (r1 != null) goto L7;
        boolean r12 = true;
    L8:
        setWillNotDraw(r12);
        invalidate();
        return;
    L7:
        r12 = false;
        goto L8
    }

    public void setPageTransformer(boolean r2, j r3) {
        setPageTransformer(r2, r3, 2);
    }

    public void setScrollState(int r2) {
        if (this.f28652k0 != r2) goto L5;
        return;
    L5:
        this.f28652k0 = r2;
        m(r2);
    }

    public final f t() {
        int r02 = getClientWidth();
        float r1 = 0.0f;
        if (r02 <= 0) goto L5;
        float r2 = getScrollX() / r02;
    L6:
        if (r02 <= 0) goto L8;
        float r3 = this.f28654m / r02;
    L9:
        int r8 = 0;
        boolean r9 = true;
        f r7 = null;
        int r6 = -1;
        float r4 = 0.0f;
    L11:
        if (r8 >= this.f28639b.size()) goto L28;
        f r10 = (f) this.f28639b.get(r8);
        if (r9 == true) goto L17;
        int r62 = r6 + 1;
        if (r10.f28680b == r62) goto L17;
        r10 = this.f28641c;
        r10.f28682e = (r1 + r4) + r3;
        r10.f28680b = r62;
        r10.d = this.f28644e.g(r62);
        r8 = r8 - 1;
    L17:
        f r63 = r10;
        r1 = r63.f28682e;
        float r42 = (r63.d + r1) + r3;
        if (r9 == true) goto L22;
        if (r2 < r1) goto L28;
    L22:
        if (r2 < r42) goto L27;
        if (r8 == (this.f28639b.size() - 1)) goto L27;
        int r43 = r63.f28680b;
        float r72 = r63.d;
        r8 = r8 + 1;
        r6 = r43;
        r4 = r72;
        r7 = r63;
        r9 = false;
    L27:
        return r63;
    L28:
        return r7;
    L8:
        r3 = 0.0f;
        goto L9
    L5:
        r2 = 0.0f;
        goto L6
    }

    public f u(int r4) {
        int r02 = 0;
    L4:
        if (r02 >= this.f28639b.size()) goto L9;
        f r1 = (f) this.f28639b.get(r02);
        if (r1.f28680b == r4) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r1;
    L9:
        return null;
    }

    public void v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context r1 = getContext();
        this.f28650j = new Scroller(r1, f28613z0);
        ViewConfiguration r2 = ViewConfiguration.get(r1);
        float r3 = r1.getResources().getDisplayMetrics().density;
        this.f28616C = r2.getScaledPagingTouchSlop();
        this.f28623J = (int) (400.0f * r3);
        this.f28624K = r2.getScaledMaximumFlingVelocity();
        this.f28628O = new EdgeEffect(r1);
        this.f28629P = new EdgeEffect(r1);
        this.f28625L = (int) (25.0f * r3);
        this.f28626M = (int) (2.0f * r3);
        this.f28614A = (int) (r3 * 16.0f);
        AbstractC3869e0.m0(this, new g(this));
        if (AbstractC3869e0.x(this) != 0) goto L5;
        AbstractC3869e0.t0(this, 1);
    L5:
        AbstractC3869e0.x0(this, new d(this));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.f28655n) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean x(float r4, float r5) {
        if (r4 >= this.f28615B) goto L7;
        if (r5 <= 0.0f) goto L7;
        return true;
    L7:
        if (r4 > (getWidth() - this.f28615B)) goto L9;
        return false;
    L9:
        if (r5 >= 0.0f) goto L15;
        return true;
    L15:
        return false;
    }

    public void y(int r12, float r13, int r14) {
        if (this.f28633T <= 0) goto L25;
        int r02 = getScrollX();
        int r2 = getPaddingLeft();
        int r3 = getPaddingRight();
        int r4 = getWidth();
        int r5 = getChildCount();
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L25;
        View r7 = getChildAt(r6);
        LayoutParams r8 = (LayoutParams) r7.getLayoutParams();
        if (r8.f28668a == false) goto L24;
        int r82 = r8.f28669b & 7;
        if (r82 != 1) goto L12;
        int r83 = Math.max((r4 - r7.getMeasuredWidth()) / 2, r2);
    L17:
        int r10 = r83;
        int r84 = r2;
        r2 = r10;
    L20:
        int r22 = (r2 + r02) - r7.getLeft();
        if (r22 == 0) goto L23;
        r7.offsetLeftAndRight(r22);
    L23:
        r2 = r84;
        goto L24
    L12:
        if (r82 != 3) goto L14;
        r84 = r7.getWidth() + r2;
        goto L20
    L14:
        if (r82 == 5) goto L16;
        r84 = r2;
        goto L20
    L16:
        r83 = (r4 - r3) - r7.getMeasuredWidth();
        r3 = r3 + r7.getMeasuredWidth();
    L24:
        r6 = r6 + 1;
    L25:
        k(r12, r13, r14);
        this.f28632S = true;
    }

    public final void z(MotionEvent r4) {
        int r02 = r4.getActionIndex();
        if (r4.getPointerId(r02) != this.f28621H) goto L11;
        if (r02 != 0) goto L6;
        int r03 = 1;
    L7:
        this.f28617D = r4.getX(r03);
        this.f28621H = r4.getPointerId(r03);
        VelocityTracker r42 = this.f28622I;
        if (r42 == null) goto L12;
        r42.clear();
        return;
    L12:
        return;
    L6:
        r03 = 0;
        goto L7
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        return new LayoutParams(getContext(), r3);
    }

    public void setPageTransformer(boolean r3, j r4, int r5) {
        int r1 = 1;
        if (r4 == null) goto L5;
        boolean r42 = true;
    L6:
        setChildrenDrawingOrderEnabled(r42);
        if (r42 == false) goto L11;
        if (r3 == false) goto L10;
        r1 = 2;
    L10:
        this.f28642c0 = r1;
        this.f28640b0 = r5;
    L12:
        if (r42 == false) goto L15;
        E();
        return;
    L15:
        return;
    L11:
        this.f28642c0 = 0;
        goto L12
    L5:
        r42 = false;
        goto L6
    }

    public void setCurrentItem(int r2, boolean r3) {
        this.f28664w = false;
        N(r2, r3, false);
    }

    public void setPageMarginDrawable(int r2) {
        setPageMarginDrawable(androidx.core.content.b.getDrawable(getContext(), r2));
    }

    public ViewPager(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f28639b = new ArrayList();
        this.f28641c = new f();
        this.d = new Rect();
        this.f28647g = -1;
        this.f28648h = null;
        this.f28649i = null;
        this.f28658q = -3.4028235E38f;
        this.f28659r = Float.MAX_VALUE;
        this.f28665x = 1;
        this.f28621H = -1;
        this.f28630Q = true;
        this.f28631R = false;
        this.f28645e0 = new c(this);
        this.f28652k0 = 0;
        v();
    }
}
