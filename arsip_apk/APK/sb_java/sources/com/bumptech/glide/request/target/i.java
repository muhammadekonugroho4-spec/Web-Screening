package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.util.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class i extends com.bumptech.glide.request.target.a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f33349f;

    /* renamed from: g, reason: collision with root package name */
    public static int f33350g;

    /* renamed from: a, reason: collision with root package name */
    public final View f33351a;

    /* renamed from: b, reason: collision with root package name */
    public final a f33352b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnAttachStateChangeListener f33353c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33354e;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static Integer f33355e;

        /* renamed from: a, reason: collision with root package name */
        public final View f33356a;

        /* renamed from: b, reason: collision with root package name */
        public final List f33357b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f33358c;
        public ViewTreeObserverOnPreDrawListenerC0338a d;

        /* renamed from: com.bumptech.glide.request.target.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0338a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f33359a;

            public ViewTreeObserverOnPreDrawListenerC0338a(a r2) {
                this.f33359a = new WeakReference(r2);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2) == false) goto L5;
                Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
            L5:
                a r02 = (a) this.f33359a.get();
                if (r02 == null) goto L10;
                r02.a();
                return true;
            L10:
                return true;
            }
        }

        public a(View r2) {
            this.f33357b = new ArrayList();
            this.f33356a = r2;
        }

        public static int c(Context r1) {
            if (f33355e != null) goto L6;
            Display r12 = ((WindowManager) k.d((WindowManager) r1.getSystemService("window"))).getDefaultDisplay();
            Point r02 = new Point();
            r12.getSize(r02);
            f33355e = Integer.valueOf(Math.max(r02.x, r02.y));
        L6:
            return f33355e.intValue();
        }

        public void a() {
            if (this.f33357b.isEmpty() == true) goto L10;
            int r02 = g();
            int r1 = f();
            if (i(r02, r1) == true) goto L8;
            return;
        L8:
            j(r02, r1);
            b();
            return;
        }

        public void b() {
            ViewTreeObserver r02 = this.f33356a.getViewTreeObserver();
            if (r02.isAlive() == false) goto L5;
            r02.removeOnPreDrawListener(this.d);
        L5:
            this.d = null;
            this.f33357b.clear();
        }

        public void d(g r4) {
            int r02 = g();
            int r1 = f();
            if (i(r02, r1) == false) goto L7;
            r4.e(r02, r1);
            return;
        L7:
            if (this.f33357b.contains(r4) == true) goto L10;
            this.f33357b.add(r4);
        L10:
            if (this.d != null) goto L13;
            ViewTreeObserver r42 = this.f33356a.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC0338a r03 = new ViewTreeObserverOnPreDrawListenerC0338a(this);
            this.d = r03;
            r42.addOnPreDrawListener(r03);
            return;
        }

        public final int e(int r3, int r4, int r5) {
            int r02 = r4 - r5;
            if (r02 <= 0) goto L6;
            return r02;
        L6:
            if (this.f33358c == true) goto L8;
        L10:
            int r32 = r3 - r5;
            if (r32 <= 0) goto L14;
            return r32;
        L14:
            if (this.f33356a.isLayoutRequested() == false) goto L16;
        L22:
            return 0;
        L16:
            if (r4 != (-2)) goto L22;
            if (Log.isLoggable("ViewTarget", 4) == false) goto L21;
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        L21:
            return c(this.f33356a.getContext());
        L8:
            if (this.f33356a.isLayoutRequested() == false) goto L10;
            return 0;
        }

        public final int f() {
            int r02 = this.f33356a.getPaddingTop() + this.f33356a.getPaddingBottom();
            ViewGroup.LayoutParams r1 = this.f33356a.getLayoutParams();
            if (r1 == null) goto L5;
            int r12 = r1.height;
        L7:
            return e(this.f33356a.getHeight(), r12, r02);
        L5:
            r12 = 0;
            goto L7
        }

        public final int g() {
            int r02 = this.f33356a.getPaddingLeft() + this.f33356a.getPaddingRight();
            ViewGroup.LayoutParams r1 = this.f33356a.getLayoutParams();
            if (r1 == null) goto L5;
            int r12 = r1.width;
        L7:
            return e(this.f33356a.getWidth(), r12, r02);
        L5:
            r12 = 0;
            goto L7
        }

        public final boolean h(int r2) {
            if (r2 <= 0) goto L4;
            return true;
        L4:
            if (r2 == Integer.MIN_VALUE) goto L10;
            return false;
        L10:
            return true;
        }

        public final boolean i(int r1, int r2) {
            if (h(r1) == true) goto L5;
            return false;
        L5:
            if (h(r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        public final void j(int r3, int r4) {
            Iterator r02 = new ArrayList(this.f33357b).iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            ((g) r02.next()).e(r3, r4);
            goto L4
        }

        public void k(g r2) {
            this.f33357b.remove(r2);
        }
    }

    static {
        f33350g = com.bumptech.glide.f.f32461a;
    }

    public i(View r2) {
        this.f33351a = (View) k.d(r2);
        this.f33352b = new a(r2);
    }

    @Override // com.bumptech.glide.request.target.h
    public com.bumptech.glide.request.d a() {
        Object r02 = k();
        if (r02 != null) goto L5;
        return null;
    L5:
        if ((r02 instanceof com.bumptech.glide.request.d) == false) goto L9;
        return (com.bumptech.glide.request.d) r02;
    L9:
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.h
    public void b(g r2) {
        this.f33352b.k(r2);
    }

    @Override // com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.h
    public void d(Drawable r1) {
        super.d(r1);
        this.f33352b.b();
        if (this.d == true) goto L6;
        m();
        return;
    }

    @Override // com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.h
    public void g(Drawable r1) {
        super.g(r1);
        l();
    }

    @Override // com.bumptech.glide.request.target.h
    public void h(com.bumptech.glide.request.d r1) {
        n(r1);
    }

    @Override // com.bumptech.glide.request.target.h
    public void j(g r2) {
        this.f33352b.d(r2);
    }

    public final Object k() {
        return this.f33351a.getTag(f33350g);
    }

    public final void l() {
        View.OnAttachStateChangeListener r02 = this.f33353c;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f33354e == true) goto L10;
        this.f33351a.addOnAttachStateChangeListener(r02);
        this.f33354e = true;
        return;
    }

    public final void m() {
        View.OnAttachStateChangeListener r02 = this.f33353c;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f33354e == false) goto L10;
        this.f33351a.removeOnAttachStateChangeListener(r02);
        this.f33354e = false;
        return;
    }

    public final void n(Object r3) {
        f33349f = true;
        this.f33351a.setTag(f33350g, r3);
    }

    public String toString() {
        return "Target for: " + this.f33351a;
    }
}
