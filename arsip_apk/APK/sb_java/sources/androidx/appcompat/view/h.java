package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC3891p0;
import androidx.core.view.C3887n0;
import androidx.core.view.InterfaceC3889o0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2927a;

    /* renamed from: b, reason: collision with root package name */
    public long f2928b;

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f2929c;
    public InterfaceC3889o0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2930e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC3891p0 f2931f;

    public class a extends AbstractC3891p0 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2932a;

        /* renamed from: b, reason: collision with root package name */
        public int f2933b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f2934c;

        public a(h r1) {
            this.f2934c = r1;
            this.f2932a = false;
            this.f2933b = 0;
        }

        @Override // androidx.core.view.InterfaceC3889o0
        public void b(View r2) {
            int r22 = this.f2933b + 1;
            this.f2933b = r22;
            if (r22 != this.f2934c.f2927a.size()) goto L9;
            InterfaceC3889o0 r23 = this.f2934c.d;
            if (r23 == null) goto L7;
            r23.b(null);
        L7:
            d();
            return;
        }

        @Override // androidx.core.view.AbstractC3891p0, androidx.core.view.InterfaceC3889o0
        public void c(View r2) {
            if (this.f2932a == true) goto L10;
            this.f2932a = true;
            InterfaceC3889o0 r22 = this.f2934c.d;
            if (r22 == null) goto L9;
            r22.c(null);
            return;
        L9:
            return;
        }

        public void d() {
            this.f2933b = 0;
            this.f2932a = false;
            this.f2934c.b();
        }
    }

    public h() {
        this.f2928b = -1;
        this.f2931f = new a(this);
        this.f2927a = new ArrayList();
    }

    public void a() {
        if (this.f2930e == true) goto L5;
        return;
    L5:
        Iterator r02 = this.f2927a.iterator();
    L7:
        if (r02.hasNext() == false) goto L9;
        ((C3887n0) r02.next()).c();
        goto L7
    L9:
        this.f2930e = false;
    }

    public void b() {
        this.f2930e = false;
    }

    public h c(C3887n0 r2) {
        if (this.f2930e == true) goto L5;
        this.f2927a.add(r2);
    L5:
        return this;
    }

    public h d(C3887n0 r3, C3887n0 r4) {
        this.f2927a.add(r3);
        r4.i(r3.d());
        this.f2927a.add(r4);
        return this;
    }

    public h e(long r2) {
        if (this.f2930e == true) goto L5;
        this.f2928b = r2;
    L5:
        return this;
    }

    public h f(Interpolator r2) {
        if (this.f2930e == true) goto L5;
        this.f2929c = r2;
    L5:
        return this;
    }

    public h g(InterfaceC3889o0 r2) {
        if (this.f2930e == true) goto L5;
        this.d = r2;
    L5:
        return this;
    }

    public void h() {
        if (this.f2930e == false) goto L5;
        return;
    L5:
        Iterator r02 = this.f2927a.iterator();
    L7:
        if (r02.hasNext() == false) goto L18;
        C3887n0 r1 = (C3887n0) r02.next();
        long r2 = this.f2928b;
        if (r2 < 0) goto L11;
        r1.e(r2);
    L11:
        Interpolator r22 = this.f2929c;
        if (r22 == null) goto L15;
        r1.f(r22);
    L15:
        if (this.d == null) goto L17;
        r1.g(this.f2931f);
    L17:
        r1.k();
        goto L7
    L18:
        this.f2930e = true;
    }
}
