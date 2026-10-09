package okio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import kotlin.collections.AbstractC11772p;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: h, reason: collision with root package name */
    public static final a f182316h = null;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f182317a;

    /* renamed from: b, reason: collision with root package name */
    public int f182318b;

    /* renamed from: c, reason: collision with root package name */
    public int f182319c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f182320e;

    /* renamed from: f, reason: collision with root package name */
    public F f182321f;

    /* renamed from: g, reason: collision with root package name */
    public F f182322g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f182316h = new a(null);
    }

    public F() {
        this.f182317a = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        this.f182320e = true;
        this.d = false;
    }

    public final void a() {
        F r02 = this.f182322g;
        if (r02 == this) goto L17;
        kotlin.jvm.internal.p.i(r02);
        if (r02.f182320e == false) goto L18;
        int r03 = this.f182319c - this.f182318b;
        F r1 = this.f182322g;
        kotlin.jvm.internal.p.i(r1);
        int r12 = 8192 - r1.f182319c;
        F r2 = this.f182322g;
        kotlin.jvm.internal.p.i(r2);
        if (r2.d == false) goto L10;
        int r22 = 0;
    L12:
        if (r03 <= (r12 + r22)) goto L14;
        return;
    L14:
        F r13 = this.f182322g;
        kotlin.jvm.internal.p.i(r13);
        g(r13, r03);
        b();
        G.b(this);
        return;
    L10:
        F r23 = this.f182322g;
        kotlin.jvm.internal.p.i(r23);
        r22 = r23.f182318b;
        goto L12
    L18:
        return;
    L17:
        throw new IllegalStateException("cannot compact");
    }

    public final F b() {
        F r02 = this.f182321f;
        if (r02 != this) goto L6;
        r02 = null;
    L6:
        F r2 = this.f182322g;
        kotlin.jvm.internal.p.i(r2);
        r2.f182321f = this.f182321f;
        F r22 = this.f182321f;
        kotlin.jvm.internal.p.i(r22);
        r22.f182322g = this.f182322g;
        this.f182321f = null;
        this.f182322g = null;
        return r02;
    }

    public final F c(F r2) {
        kotlin.jvm.internal.p.l(r2, "segment");
        r2.f182322g = this;
        r2.f182321f = this.f182321f;
        F r02 = this.f182321f;
        kotlin.jvm.internal.p.i(r02);
        r02.f182322g = r2;
        this.f182321f = r2;
        return r2;
    }

    public final F d() {
        this.d = true;
        return new F(this.f182317a, this.f182318b, this.f182319c, true, false);
    }

    public final F e(int r9) {
        if (r9 <= 0) goto L12;
        if (r9 > (this.f182319c - this.f182318b)) goto L12;
        if (r9 < 1024) goto L8;
        F r02 = d();
    L9:
        r02.f182319c = r02.f182318b + r9;
        this.f182318b += r9;
        F r92 = this.f182322g;
        kotlin.jvm.internal.p.i(r92);
        r92.c(r02);
        return r02;
    L8:
        r02 = G.c();
        byte[] r1 = this.f182317a;
        byte[] r2 = r02.f182317a;
        int r4 = this.f182318b;
        AbstractC11772p.p(r1, r2, 0, r4, r4 + r9, 2, null);
    L12:
        throw new IllegalArgumentException("byteCount out of range");
    }

    public final F f() {
        byte[] r1 = this.f182317a;
        byte[] r12 = Arrays.copyOf(r1, r1.length);
        kotlin.jvm.internal.p.k(r12, "copyOf(...)");
        return new F(r12, this.f182318b, this.f182319c, false, true);
    }

    public final void g(F r9, int r10) {
        kotlin.jvm.internal.p.l(r9, "sink");
        if (r9.f182320e == false) goto L18;
        int r5 = r9.f182319c;
        if ((r5 + r10) > 8192) goto L7;
    L15:
        byte[] r02 = this.f182317a;
        byte[] r1 = r9.f182317a;
        int r2 = r9.f182319c;
        int r3 = this.f182318b;
        AbstractC11772p.j(r02, r1, r2, r3, r3 + r10);
        r9.f182319c += r10;
        this.f182318b += r10;
        return;
    L7:
        if (r9.d == true) goto L14;
        int r4 = r9.f182318b;
        if (((r5 + r10) - r4) > 8192) goto L12;
        byte[] r12 = r9.f182317a;
        AbstractC11772p.p(r12, r12, 0, r4, r5, 2, null);
        r9.f182319c -= r9.f182318b;
        r9.f182318b = 0;
        goto L15
    L12:
        throw new IllegalArgumentException();
    L14:
        throw new IllegalArgumentException();
    L18:
        throw new IllegalStateException("only owner can write");
    }

    public F(byte[] r2, int r3, int r4, boolean r5, boolean r6) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f182317a = r2;
        this.f182318b = r3;
        this.f182319c = r4;
        this.d = r5;
        this.f182320e = r6;
    }
}
