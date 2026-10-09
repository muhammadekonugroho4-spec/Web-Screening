package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC11777v;

/* renamed from: androidx.compose.foundation.lazy.layout.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2615e0 {

    /* renamed from: a, reason: collision with root package name */
    public P0 f8741a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.functions.l f8742b;

    /* renamed from: c, reason: collision with root package name */
    public final M0 f8743c;
    public L0 d;

    /* renamed from: e, reason: collision with root package name */
    public int f8744e;

    /* renamed from: f, reason: collision with root package name */
    public int f8745f;

    /* renamed from: g, reason: collision with root package name */
    public int f8746g;

    /* renamed from: androidx.compose.foundation.lazy.layout.e0$a */
    public final class a implements H0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f8747a;

        /* renamed from: b, reason: collision with root package name */
        public final List f8748b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2615e0 f8749c;

        public a(C2615e0 r1, int r2) {
            this.f8749c = r1;
            this.f8747a = r2;
            this.f8748b = new ArrayList();
        }

        @Override // androidx.compose.foundation.lazy.layout.H0
        public void a(int r4) {
            L0 r02 = this.f8749c.e();
            if (r02 != null) goto L5;
            return;
        L5:
            this.f8748b.add(r02.d(r4, C2615e0.a(this.f8749c)));
        }

        @Override // androidx.compose.foundation.lazy.layout.H0
        public int b() {
            return this.f8747a;
        }

        public final List c() {
            return this.f8748b;
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.e0$b */
    public interface b {
        void c();

        void cancel();
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.e0$c */
    public interface c {
        long a(int r1);

        int b();

        int getIndex();
    }

    static {
    }

    public C2615e0() {
        this.f8743c = new M0();
        this.f8744e = -1;
        this.f8745f = -1;
    }

    public static final /* synthetic */ M0 a(C2615e0 r02) {
        return r02.f8743c;
    }

    public static /* synthetic */ b h(C2615e0 r02, int r1, long r2, kotlin.jvm.functions.l r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r4 = null;
    L6:
        return r02.g(r1, r2, r4);
    }

    public final List b() {
        kotlin.jvm.functions.l r02 = this.f8742b;
        if (r02 == null) goto L5;
        a r1 = new a(this, this.f8744e);
        r02.invoke(r1);
        List r03 = r1.c();
        this.f8746g = r03.size();
        return r03;
    L5:
        return AbstractC11777v.o();
    }

    public final int c() {
        return this.f8745f;
    }

    public final int d() {
        return this.f8746g;
    }

    public final L0 e() {
        return this.d;
    }

    public final P0 f() {
        return this.f8741a;
    }

    public final b g(int r7, long r8, kotlin.jvm.functions.l r10) {
        return i(r7, r8, true, r10);
    }

    public final b i(int r8, long r9, boolean r11, kotlin.jvm.functions.l r12) {
        L0 r02 = this.d;
        if (r02 == null) goto L9;
        b r82 = r02.h(r8, r9, this.f8743c, r11, r12);
        if (r82 == null) goto L9;
        return r82;
    L9:
        return C2626k.f8785a;
    }

    public final void j(int r1) {
        this.f8745f = r1;
    }

    public final void k(L0 r1) {
        this.d = r1;
    }

    public final void l(int r1) {
        this.f8744e = r1;
    }

    public C2615e0(P0 r1, kotlin.jvm.functions.l r2) {
        this();
        this.f8741a = r1;
        this.f8742b = r2;
    }
}
