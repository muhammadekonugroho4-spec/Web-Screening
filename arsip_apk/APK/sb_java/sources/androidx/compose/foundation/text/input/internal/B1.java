package androidx.compose.foundation.text.input.internal;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public final class B1 implements CharSequence {

    /* renamed from: e, reason: collision with root package name */
    public static final a f10019e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10020f = 0;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f10021a;

    /* renamed from: b, reason: collision with root package name */
    public C2829p0 f10022b;

    /* renamed from: c, reason: collision with root package name */
    public int f10023c;
    public int d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f10019e = new a(null);
        f10020f = 8;
    }

    public B1(CharSequence r1) {
        this.f10021a = r1;
        this.f10023c = -1;
        this.d = -1;
    }

    public static /* synthetic */ void d(B1 r6, int r7, int r8, CharSequence r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        r10 = 0;
    L5:
        int r4 = r10;
        if ((r12 & 16) == 0) goto L8;
        r11 = r9.length();
    L8:
        r6.c(r7, r8, r9, r4, r11);
    }

    public char a(int r5) {
        C2829p0 r02 = this.f10022b;
        if (r02 != null) goto L7;
        return this.f10021a.charAt(r5);
    L7:
        if (r5 < this.f10023c) goto L9;
        int r1 = r02.e();
        int r2 = this.f10023c;
        if (r5 >= (r1 + r2)) goto L15;
        return r02.d(r5 - r2);
    L15:
        return this.f10021a.charAt(r5 - ((r1 - this.d) + r2));
    L9:
        return this.f10021a.charAt(r5);
    }

    public int b() {
        C2829p0 r02 = this.f10022b;
        if (r02 != null) goto L7;
        return this.f10021a.length();
    L7:
        return (this.f10021a.length() - (this.d - this.f10023c)) + r02.e();
    }

    public final void c(int r9, int r10, CharSequence r11, int r12, int r13) {
        boolean r02 = true;
        if (r9 > r10) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L8;
        androidx.compose.foundation.internal.e.a("start=" + r9 + " > end=" + r10);
    L8:
        if (r12 > r13) goto L10;
        boolean r22 = true;
    L11:
        if (r22 == true) goto L13;
        androidx.compose.foundation.internal.e.a("textStart=" + r12 + " > textEnd=" + r13);
    L13:
        if (r9 < 0) goto L15;
        boolean r23 = true;
    L16:
        if (r23 == true) goto L18;
        androidx.compose.foundation.internal.e.a("start must be non-negative, but was " + r9);
    L18:
        if (r12 >= 0) goto L21;
        r02 = false;
    L21:
        if (r02 == true) goto L23;
        androidx.compose.foundation.internal.e.a("textStart must be non-negative, but was " + r12);
    L23:
        C2829p0 r24 = this.f10022b;
        int r03 = r13 - r12;
        if (r24 != null) goto L27;
        int r25 = Math.max(Constants.MAX_HOST_LENGTH, r03 + 128);
        char[] r3 = new char[r25];
        int r5 = Math.min(r9, 64);
        int r4 = Math.min(this.f10021a.length() - r10, 64);
        int r7 = r9 - r5;
        M2.a(this.f10021a, r3, 0, r7, r9);
        int r26 = r25 - r4;
        int r42 = r4 + r10;
        M2.a(this.f10021a, r3, r26, r10, r42);
        M2.a(r11, r3, r5, r12, r13);
        this.f10022b = new C2829p0(r3, r5 + r03, r26);
        this.f10023c = r7;
        this.d = r42;
        return;
    L27:
        int r04 = this.f10023c;
        int r32 = r9 - r04;
        int r43 = r10 - r04;
        if (r32 >= 0) goto L30;
    L34:
        this.f10021a = toString();
        this.f10022b = null;
        this.f10023c = -1;
        this.d = -1;
        c(r9, r10, r11, r12, r13);
        return;
    L30:
        if (r43 > r24.e()) goto L34;
        r24.g(r32, r43, r11, r12, r13);
        return;
    L15:
        r23 = false;
        goto L16
    L10:
        r22 = false;
        goto L11
    L5:
        r2 = false;
        goto L6
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int r1) {
        return a(r1);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return b();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int r2, int r3) {
        return toString().subSequence(r2, r3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        C2829p0 r02 = this.f10022b;
        if (r02 == null) goto L5;
        StringBuilder r1 = new StringBuilder();
        r1.append(this.f10021a, 0, this.f10023c);
        r02.a(r1);
        CharSequence r03 = this.f10021a;
        r1.append(r03, this.d, r03.length());
        return r1.toString();
    L5:
        return this.f10021a.toString();
    }
}
