package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f24142a;

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f24143a;

        /* renamed from: b, reason: collision with root package name */
        public final d f24144b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24145c;

        public a(TextView r2) {
            this.f24143a = r2;
            this.f24145c = true;
            this.f24144b = new d(r2);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public InputFilter[] a(InputFilter[] r2) {
            if (this.f24145c == true) goto L7;
            return h(r2);
        L7:
            return f(r2);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f24145c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void c(boolean r1) {
            if (r1 == false) goto L5;
            l();
            return;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void d(boolean r1) {
            this.f24145c = r1;
            l();
            k();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public TransformationMethod e(TransformationMethod r2) {
            if (this.f24145c == false) goto L7;
            return m(r2);
        L7:
            return j(r2);
        }

        public final InputFilter[] f(InputFilter[] r6) {
            int r02 = r6.length;
            int r2 = 0;
        L3:
            if (r2 >= r02) goto L8;
            if (r6[r2] == this.f24144b) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return r6;
        L8:
            InputFilter[] r22 = new InputFilter[r6.length + 1];
            System.arraycopy(r6, 0, r22, 0, r02);
            r22[r02] = this.f24144b;
            return r22;
        }

        public final SparseArray g(InputFilter[] r5) {
            SparseArray r02 = new SparseArray(1);
            int r1 = 0;
        L4:
            if (r1 >= r5.length) goto L9;
            InputFilter r2 = r5[r1];
            if ((r2 instanceof d) == false) goto L8;
            r02.put(r1, r2);
        L8:
            r1 = r1 + 1;
            goto L4
        L9:
            return r02;
        }

        public final InputFilter[] h(InputFilter[] r7) {
            SparseArray r02 = g(r7);
            if (r02.size() != 0) goto L5;
            return r7;
        L5:
            int r1 = r7.length;
            InputFilter[] r2 = new InputFilter[r7.length - r02.size()];
            int r3 = 0;
            int r4 = 0;
        L6:
            if (r3 >= r1) goto L11;
            if (r02.indexOfKey(r3) >= 0) goto L10;
            r2[r4] = r7[r3];
            r4 = r4 + 1;
        L10:
            r3 = r3 + 1;
            goto L6
        L11:
            return r2;
        }

        public void i(boolean r1) {
            this.f24145c = r1;
        }

        public final TransformationMethod j(TransformationMethod r2) {
            if ((r2 instanceof h) == true) goto L5;
            return r2;
        L5:
            return ((h) r2).a();
        }

        public final void k() {
            InputFilter[] r02 = this.f24143a.getFilters();
            this.f24143a.setFilters(a(r02));
        }

        public void l() {
            TransformationMethod r02 = e(this.f24143a.getTransformationMethod());
            this.f24143a.setTransformationMethod(r02);
        }

        public final TransformationMethod m(TransformationMethod r2) {
            if ((r2 instanceof h) == false) goto L6;
            return r2;
        L6:
            if ((r2 instanceof PasswordTransformationMethod) == false) goto L9;
            return r2;
        L9:
            return new h(r2);
        }
    }

    public static class b {
        public b() {
        }

        public abstract InputFilter[] a(InputFilter[] r1);

        public abstract boolean b();

        public abstract void c(boolean r1);

        public abstract void d(boolean r1);

        public abstract TransformationMethod e(TransformationMethod r1);
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f24146a;

        public c(TextView r2) {
            this.f24146a = new a(r2);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public InputFilter[] a(InputFilter[] r2) {
            if (f() == false) goto L6;
            return r2;
        L6:
            return this.f24146a.a(r2);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f24146a.b();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void c(boolean r2) {
            if (f() == false) goto L5;
            return;
        L5:
            this.f24146a.c(r2);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void d(boolean r2) {
            if (f() == false) goto L6;
            this.f24146a.i(r2);
            return;
        L6:
            this.f24146a.d(r2);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public TransformationMethod e(TransformationMethod r2) {
            if (f() == false) goto L6;
            return r2;
        L6:
            return this.f24146a.e(r2);
        }

        public final boolean f() {
            return !androidx.emoji2.text.g.k();
        }
    }

    public f(TextView r2, boolean r3) {
        androidx.core.util.h.h(r2, "textView cannot be null");
        if (r3 == true) goto L6;
        this.f24142a = new c(r2);
        return;
    L6:
        this.f24142a = new a(r2);
    }

    public InputFilter[] a(InputFilter[] r2) {
        return this.f24142a.a(r2);
    }

    public boolean b() {
        return this.f24142a.b();
    }

    public void c(boolean r2) {
        this.f24142a.c(r2);
    }

    public void d(boolean r2) {
        this.f24142a.d(r2);
    }

    public TransformationMethod e(TransformationMethod r2) {
        return this.f24142a.e(r2);
    }
}
