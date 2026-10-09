package androidx.compose.ui.text.font;

import com.google.android.material.card.MaterialCardViewHelper;
import com.google.firebase.perf.util.Constants;
import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import java.util.List;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes.dex */
public final class z implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19942b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final z f19943c = null;
    public static final z d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final z f19944e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final z f19945f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final z f19946g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final z f19947h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final z f19948i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final z f19949j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final z f19950k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final z f19951l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final z f19952m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final z f19953n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final z f19954o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final z f19955p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final z f19956q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final z f19957r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final z f19958s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final z f19959t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final List f19960u = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f19961a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final z a() {
            return z.a();
        }

        public final z b() {
            return z.b();
        }

        public final z c() {
            return z.c();
        }

        public final z d() {
            return z.d();
        }

        public final z e() {
            return z.e();
        }

        public final z f() {
            return z.g();
        }

        public final z g() {
            return z.h();
        }

        public final z h() {
            return z.i();
        }

        public final z i() {
            return z.j();
        }

        public final z j() {
            return z.k();
        }

        public final z k() {
            return z.l();
        }

        public final z l() {
            return z.m();
        }

        public final z m() {
            return z.n();
        }

        public final z n() {
            return z.o();
        }

        public final z o() {
            return z.p();
        }

        public final z p() {
            return z.q();
        }

        public a() {
        }
    }

    static {
        f19942b = new a(null);
        z r2 = new z(100);
        f19943c = r2;
        z r3 = new z(200);
        d = r3;
        z r4 = new z(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
        f19944e = r4;
        z r5 = new z(ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE);
        f19945f = r5;
        z r6 = new z(500);
        f19946g = r6;
        z r7 = new z(600);
        f19947h = r7;
        z r8 = new z(Constants.FROZEN_FRAME_TIME);
        f19948i = r8;
        z r9 = new z(800);
        f19949j = r9;
        z r10 = new z(900);
        f19950k = r10;
        f19951l = r2;
        f19952m = r3;
        f19953n = r4;
        f19954o = r5;
        f19955p = r6;
        f19956q = r7;
        f19957r = r8;
        f19958s = r9;
        f19959t = r10;
        f19960u = AbstractC11777v.r(new z[]{r2, r3, r4, r5, r6, r7, r8, r9, r10});
    }

    public z(int r4) {
        this.f19961a = r4;
        boolean r02 = false;
        if (1 <= r4) goto L5;
    L7:
        if (r02 == true) goto L10;
        androidx.compose.ui.text.internal.a.a("Font weight can be in range [1, 1000]. Current value: " + r4);
        return;
    L10:
        return;
    L5:
        if (r4 >= 1001) goto L7;
        r02 = true;
        goto L7
    }

    public static final /* synthetic */ z a() {
        return f19959t;
    }

    public static final /* synthetic */ z b() {
        return f19957r;
    }

    public static final /* synthetic */ z c() {
        return f19953n;
    }

    public static final /* synthetic */ z d() {
        return f19955p;
    }

    public static final /* synthetic */ z e() {
        return f19954o;
    }

    public static final /* synthetic */ z g() {
        return f19956q;
    }

    public static final /* synthetic */ z h() {
        return f19951l;
    }

    public static final /* synthetic */ z i() {
        return f19943c;
    }

    public static final /* synthetic */ z j() {
        return d;
    }

    public static final /* synthetic */ z k() {
        return f19944e;
    }

    public static final /* synthetic */ z l() {
        return f19945f;
    }

    public static final /* synthetic */ z m() {
        return f19946g;
    }

    public static final /* synthetic */ z n() {
        return f19947h;
    }

    public static final /* synthetic */ z o() {
        return f19948i;
    }

    public static final /* synthetic */ z p() {
        return f19949j;
    }

    public static final /* synthetic */ z q() {
        return f19950k;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return r((z) r1);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof z) == true) goto L9;
        return false;
    L9:
        if (this.f19961a == ((z) r4).f19961a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f19961a;
    }

    public int r(z r2) {
        return kotlin.jvm.internal.p.n(this.f19961a, r2.f19961a);
    }

    public final int s() {
        return this.f19961a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f19961a + ')';
    }
}
