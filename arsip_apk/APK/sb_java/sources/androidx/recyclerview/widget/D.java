package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes4.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    public final b f27200a;

    /* renamed from: b, reason: collision with root package name */
    public a f27201b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f27202a;

        /* renamed from: b, reason: collision with root package name */
        public int f27203b;

        /* renamed from: c, reason: collision with root package name */
        public int f27204c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public int f27205e;

        public a() {
            this.f27202a = 0;
        }

        public void a(int r2) {
            this.f27202a = r2 | this.f27202a;
        }

        public boolean b() {
            int r02 = this.f27202a;
            if ((r02 & 7) != 0) goto L5;
        L7:
            int r03 = this.f27202a;
            if ((r03 & 112) != 0) goto L10;
        L12:
            int r04 = this.f27202a;
            if ((r04 & 1792) != 0) goto L15;
        L17:
            int r05 = this.f27202a;
            if ((r05 & 28672) != 0) goto L20;
            return true;
        L20:
            if ((r05 & (c(this.f27205e, this.f27204c) << 12)) != 0) goto L24;
            return false;
        L24:
            return true;
        L15:
            if ((r04 & (c(this.f27205e, this.f27203b) << 8)) != 0) goto L17;
            return false;
        L10:
            if ((r03 & (c(this.d, this.f27204c) << 4)) != 0) goto L12;
            return false;
        L5:
            if ((r02 & c(this.d, this.f27203b)) != 0) goto L7;
            return false;
        }

        public int c(int r1, int r2) {
            if (r1 <= r2) goto L5;
            return 1;
        L5:
            if (r1 != r2) goto L8;
            return 2;
        L8:
            return 4;
        }

        public void d() {
            this.f27202a = 0;
        }

        public void e(int r1, int r2, int r3, int r4) {
            this.f27203b = r1;
            this.f27204c = r2;
            this.d = r3;
            this.f27205e = r4;
        }
    }

    public interface b {
        View a(int r1);

        int b();

        int c();

        int d(View r1);

        int e(View r1);
    }

    public D(b r1) {
        this.f27200a = r1;
        this.f27201b = new a();
    }

    public View a(int r9, int r10, int r11, int r12) {
        int r02 = this.f27200a.b();
        int r1 = this.f27200a.c();
        if (r10 <= r9) goto L5;
        int r2 = 1;
    L6:
        View r3 = null;
    L7:
        if (r9 == r10) goto L18;
        View r4 = this.f27200a.a(r9);
        int r5 = this.f27200a.d(r4);
        int r6 = this.f27200a.e(r4);
        this.f27201b.e(r02, r1, r5, r6);
        if (r11 == 0) goto L13;
        this.f27201b.d();
        this.f27201b.a(r11);
        if (this.f27201b.b() == false) goto L13;
        return r4;
    L13:
        if (r12 == 0) goto L17;
        this.f27201b.d();
        this.f27201b.a(r12);
        if (this.f27201b.b() == false) goto L17;
        r3 = r4;
    L17:
        r9 = r9 + r2;
        goto L7
    L18:
        return r3;
    L5:
        r2 = -1;
        goto L6
    }

    public boolean b(View r6, int r7) {
        this.f27201b.e(this.f27200a.b(), this.f27200a.c(), this.f27200a.d(r6), this.f27200a.e(r6));
        if (r7 == 0) goto L6;
        this.f27201b.d();
        this.f27201b.a(r7);
        return this.f27201b.b();
    L6:
        return false;
    }
}
