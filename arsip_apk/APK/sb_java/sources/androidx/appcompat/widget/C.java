package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class C implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3326a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3328c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f3329e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f3330f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3331g;

    /* renamed from: h, reason: collision with root package name */
    public int f3332h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f3333i;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C f3334a;

        public a(C r1) {
            this.f3334a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent r02 = this.f3334a.d.getParent();
            if (r02 == null) goto L6;
            r02.requestDisallowInterceptTouchEvent(true);
            return;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C f3335a;

        public b(C r1) {
            this.f3335a = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3335a.e();
        }
    }

    public C(View r3) {
        this.f3333i = new int[2];
        this.d = r3;
        r3.setLongClickable(true);
        r3.addOnAttachStateChangeListener(this);
        this.f3326a = ViewConfiguration.get(r3.getContext()).getScaledTouchSlop();
        int r32 = ViewConfiguration.getTapTimeout();
        this.f3327b = r32;
        this.f3328c = (r32 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View r2, float r3, float r4, float r5) {
        float r02 = -r5;
        if (r3 >= r02) goto L5;
        return false;
    L5:
        if (r4 >= r02) goto L7;
        return false;
    L7:
        if (r3 < ((r2.getRight() - r2.getLeft()) + r5)) goto L9;
        return false;
    L9:
        if (r4 >= ((r2.getBottom() - r2.getTop()) + r5)) goto L16;
        return true;
    L16:
        return false;
    }

    public final void a() {
        Runnable r02 = this.f3330f;
        if (r02 == null) goto L5;
        this.d.removeCallbacks(r02);
    L5:
        Runnable r03 = this.f3329e;
        if (r03 == null) goto L9;
        this.d.removeCallbacks(r03);
        return;
    }

    public abstract androidx.appcompat.view.menu.p b();

    public abstract boolean c();

    public boolean d() {
        androidx.appcompat.view.menu.p r02 = b();
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.a() == false) goto L10;
        r02.dismiss();
        return true;
    L10:
        return true;
    }

    public void e() {
        a();
        View r02 = this.d;
        if (r02.isEnabled() == true) goto L5;
        return;
    L5:
        if (r02.isLongClickable() == false) goto L8;
        return;
    L8:
        if (c() == false) goto L14;
        r02.getParent().requestDisallowInterceptTouchEvent(true);
        long r3 = SystemClock.uptimeMillis();
        MotionEvent r1 = MotionEvent.obtain(r3, r3, 3, 0.0f, 0.0f, 0);
        r02.onTouchEvent(r1);
        r1.recycle();
        this.f3331g = true;
        return;
    }

    public final boolean f(MotionEvent r5) {
        View r02 = this.d;
        androidx.appcompat.view.menu.p r1 = b();
        if (r1 != null) goto L5;
    L21:
        return false;
    L5:
        if (r1.a() == false) goto L21;
        A r12 = (A) r1.i();
        if (r12 == null) goto L21;
        if (r12.isShown() == false) goto L21;
        MotionEvent r3 = MotionEvent.obtainNoHistory(r5);
        i(r02, r3);
        j(r12, r3);
        boolean r03 = r12.e(r3, this.f3332h);
        r3.recycle();
        int r52 = r5.getActionMasked();
        if (r52 != 1) goto L15;
    L17:
        boolean r53 = false;
    L18:
        if (r03 == false) goto L21;
        if (r53 == false) goto L21;
        return true;
    L15:
        if (r52 == 3) goto L17;
        r53 = true;
        goto L18
    }

    public final boolean g(MotionEvent r6) {
        View r02 = this.d;
        if (r02.isEnabled() == true) goto L5;
        return false;
    L5:
        int r1 = r6.getActionMasked();
        if (r1 != 0) goto L8;
        this.f3332h = r6.getPointerId(0);
        if (this.f3329e != null) goto L24;
        this.f3329e = new a(this);
    L24:
        r02.postDelayed(this.f3329e, this.f3327b);
        if (this.f3330f != null) goto L27;
        this.f3330f = new b(this);
    L27:
        r02.postDelayed(this.f3330f, this.f3328c);
    L28:
        return false;
    L8:
        if (r1 != 1) goto L10;
    L20:
        a();
        goto L28
    L10:
        if (r1 != 2) goto L12;
        int r12 = r6.findPointerIndex(this.f3332h);
        if (r12 < 0) goto L28;
        if (h(r02, r6.getX(r12), r6.getY(r12), this.f3326a) == true) goto L28;
        a();
        r02.getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    L12:
        if (r1 == 3) goto L20;
        goto L20
    }

    public final boolean i(View r3, MotionEvent r4) {
        r3.getLocationOnScreen(this.f3333i);
        r4.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View r3, MotionEvent r4) {
        r3.getLocationOnScreen(this.f3333i);
        r4.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View r11, MotionEvent r12) {
        boolean r112 = this.f3331g;
        if (r112 == false) goto L12;
        if (f(r12) == false) goto L7;
    L10:
        boolean r122 = true;
    L19:
        this.f3331g = r122;
        if (r122 == true) goto L24;
        if (r112 == true) goto L24;
        return false;
    L24:
        return true;
    L7:
        if (d() == false) goto L10;
        r122 = false;
        goto L19
    L12:
        if (g(r12) == true) goto L14;
    L16:
        r122 = false;
    L17:
        if (r122 == false) goto L19;
        long r2 = SystemClock.uptimeMillis();
        MotionEvent r22 = MotionEvent.obtain(r2, r2, 3, 0.0f, 0.0f, 0);
        this.d.onTouchEvent(r22);
        r22.recycle();
        goto L19
    L14:
        if (c() == false) goto L16;
        r122 = true;
        goto L17
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View r2) {
        this.f3331g = false;
        this.f3332h = -1;
        Runnable r22 = this.f3329e;
        if (r22 == null) goto L6;
        this.d.removeCallbacks(r22);
        return;
    }
}
