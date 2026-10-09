package kotlin.time;

import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: h, reason: collision with root package name */
    public static final a f180435h = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f180436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180437b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180438c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180439e;

    /* renamed from: f, reason: collision with root package name */
    public final int f180440f;

    /* renamed from: g, reason: collision with root package name */
    public final int f180441g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final w a(Instant r25) {
            kotlin.jvm.internal.p.l(r25, "instant");
            long r2 = r25.d();
            long r6 = r2 / 86400;
            if ((r2 ^ 86400) < 0) goto L5;
        L7:
            long r22 = r2 % 86400;
            int r02 = (int) (r22 + (86400 & (((r22 ^ 86400) & ((-r22) | r22)) >> 63)));
            long r62 = (r6 + 719528) - 60;
            if (r62 >= 0) goto L10;
            long r16 = -1;
            long r8 = 146097;
            long r14 = ((r62 + 1) / r8) - 1;
            long r12 = ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE * r14;
            r62 = r62 + ((-r14) * r8);
        L11:
            long r23 = ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE;
            long r82 = ((r23 * r62) + 591) / 146097;
            long r4 = 365;
            long r10 = 4;
            long r1 = 100;
            long r142 = r62 - ((((r4 * r82) + (r82 / r10)) - (r82 / r1)) + (r82 / r23));
            if (r142 >= 0) goto L14;
            r82 = r82 + r16;
            r142 = r62 - ((((r4 * r82) + (r82 / r10)) - (r82 / r1)) + (r82 / r23));
        L14:
            long r83 = r82 + r12;
            int r13 = (int) r142;
            int r24 = ((r13 * 5) + 2) / 153;
            int r143 = r02 / 3600;
            int r03 = r02 - (r143 * 3600);
            int r15 = r03 / 60;
            return new w((int) (r83 + (r24 / 10)), ((r24 + 2) % 12) + 1, (r13 - (((r24 * 306) + 5) / 10)) + 1, r143, r15, r03 - (r15 * 60), r25.e());
        L10:
            r16 = -1;
            r12 = 0;
            goto L11
        L5:
            if ((r6 * 86400) == r2) goto L7;
            r6 = r6 - 1;
            goto L7
        }

        public a() {
        }
    }

    static {
        f180435h = new a(null);
    }

    public w(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.f180436a = r1;
        this.f180437b = r2;
        this.f180438c = r3;
        this.d = r4;
        this.f180439e = r5;
        this.f180440f = r6;
        this.f180441g = r7;
    }

    public final int a() {
        return this.f180438c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f180439e;
    }

    public final int d() {
        return this.f180437b;
    }

    public final int e() {
        return this.f180441g;
    }

    public final int f() {
        return this.f180440f;
    }

    public final int g() {
        return this.f180436a;
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.f180436a + '-' + this.f180437b + '-' + this.f180438c + ' ' + this.d + ':' + this.f180439e + ':' + this.f180440f + '.' + this.f180441g + ')';
    }
}
