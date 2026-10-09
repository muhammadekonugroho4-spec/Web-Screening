package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import coil.size.Scale;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.p;
import okhttp3.Headers;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30202a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f30203b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f30204c;
    public final coil.size.f d;

    /* renamed from: e, reason: collision with root package name */
    public final Scale f30205e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30206f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30207g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30208h;

    /* renamed from: i, reason: collision with root package name */
    public final String f30209i;

    /* renamed from: j, reason: collision with root package name */
    public final Headers f30210j;

    /* renamed from: k, reason: collision with root package name */
    public final n f30211k;

    /* renamed from: l, reason: collision with root package name */
    public final j f30212l;

    /* renamed from: m, reason: collision with root package name */
    public final CachePolicy f30213m;

    /* renamed from: n, reason: collision with root package name */
    public final CachePolicy f30214n;

    /* renamed from: o, reason: collision with root package name */
    public final CachePolicy f30215o;

    public i(Context r1, Bitmap.Config r2, ColorSpace r3, coil.size.f r4, Scale r5, boolean r6, boolean r7, boolean r8, String r9, Headers r10, n r11, j r12, CachePolicy r13, CachePolicy r14, CachePolicy r15) {
        this.f30202a = r1;
        this.f30203b = r2;
        this.f30204c = r3;
        this.d = r4;
        this.f30205e = r5;
        this.f30206f = r6;
        this.f30207g = r7;
        this.f30208h = r8;
        this.f30209i = r9;
        this.f30210j = r10;
        this.f30211k = r11;
        this.f30212l = r12;
        this.f30213m = r13;
        this.f30214n = r14;
        this.f30215o = r15;
    }

    public static /* synthetic */ i b(i r16, Context r17, Bitmap.Config r18, ColorSpace r19, coil.size.f r20, Scale r21, boolean r22, boolean r23, boolean r24, String r25, Headers r26, n r27, j r28, CachePolicy r29, CachePolicy r30, CachePolicy r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        Context r2 = r16.f30202a;
    L7:
        if ((r32 & 2) == 0) goto L9;
        Bitmap.Config r3 = r16.f30203b;
    L11:
        if ((r32 & 4) == 0) goto L13;
        ColorSpace r4 = r16.f30204c;
    L15:
        if ((r32 & 8) == 0) goto L17;
        coil.size.f r5 = r16.d;
    L19:
        if ((r32 & 16) == 0) goto L21;
        Scale r6 = r16.f30205e;
    L23:
        if ((r32 & 32) == 0) goto L25;
        boolean r7 = r16.f30206f;
    L27:
        if ((r32 & 64) == 0) goto L29;
        boolean r8 = r16.f30207g;
    L31:
        if ((r32 & 128) == 0) goto L33;
        boolean r9 = r16.f30208h;
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r10 = r16.f30209i;
    L39:
        if ((r32 & 512) == 0) goto L41;
        Headers r11 = r16.f30210j;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        n r12 = r16.f30211k;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        j r13 = r16.f30212l;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        CachePolicy r14 = r16.f30213m;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        CachePolicy r15 = r16.f30214n;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        CachePolicy r322 = r16.f30215o;
    L64:
        return r16.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r322);
    L62:
        r322 = r31;
        goto L64
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L47
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final i a(Context r17, Bitmap.Config r18, ColorSpace r19, coil.size.f r20, Scale r21, boolean r22, boolean r23, boolean r24, String r25, Headers r26, n r27, j r28, CachePolicy r29, CachePolicy r30, CachePolicy r31) {
        return new i(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);
    }

    public final boolean c() {
        return this.f30206f;
    }

    public final boolean d() {
        return this.f30207g;
    }

    public final ColorSpace e() {
        return this.f30204c;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == false) goto L38;
        i r42 = (i) r4;
        if (p.g(this.f30202a, r42.f30202a) == true) goto L10;
        return false;
    L10:
        if (this.f30203b == r42.f30203b) goto L12;
        return false;
    L12:
        if (p.g(this.f30204c, r42.f30204c) == true) goto L14;
        return false;
    L14:
        if (p.g(this.d, r42.d) == true) goto L16;
        return false;
    L16:
        if (this.f30205e == r42.f30205e) goto L18;
        return false;
    L18:
        if (this.f30206f == r42.f30206f) goto L20;
        return false;
    L20:
        if (this.f30207g == r42.f30207g) goto L22;
        return false;
    L22:
        if (this.f30208h == r42.f30208h) goto L24;
        return false;
    L24:
        if (p.g(this.f30209i, r42.f30209i) == true) goto L26;
        return false;
    L26:
        if (p.g(this.f30210j, r42.f30210j) == true) goto L28;
        return false;
    L28:
        if (p.g(this.f30211k, r42.f30211k) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f30212l, r42.f30212l) == true) goto L32;
        return false;
    L32:
        if (this.f30213m == r42.f30213m) goto L34;
        return false;
    L34:
        if (this.f30214n == r42.f30214n) goto L36;
        return false;
    L36:
        if (this.f30215o != r42.f30215o) goto L54;
        return true;
    L54:
        return false;
    L38:
        return false;
    }

    public final Bitmap.Config f() {
        return this.f30203b;
    }

    public final Context g() {
        return this.f30202a;
    }

    public final String h() {
        return this.f30209i;
    }

    public int hashCode() {
        int r02 = ((this.f30202a.hashCode() * 31) + this.f30203b.hashCode()) * 31;
        ColorSpace r1 = this.f30204c;
        int r2 = 0;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L6:
        int r03 = (((((((((((r02 + r12) * 31) + this.d.hashCode()) * 31) + this.f30205e.hashCode()) * 31) + Boolean.hashCode(this.f30206f)) * 31) + Boolean.hashCode(this.f30207g)) * 31) + Boolean.hashCode(this.f30208h)) * 31;
        String r13 = this.f30209i;
        if (r13 == null) goto L10;
        r2 = r13.hashCode();
    L10:
        return ((((((((((((r03 + r2) * 31) + this.f30210j.hashCode()) * 31) + this.f30211k.hashCode()) * 31) + this.f30212l.hashCode()) * 31) + this.f30213m.hashCode()) * 31) + this.f30214n.hashCode()) * 31) + this.f30215o.hashCode();
    L5:
        r12 = 0;
        goto L6
    }

    public final CachePolicy i() {
        return this.f30214n;
    }

    public final Headers j() {
        return this.f30210j;
    }

    public final CachePolicy k() {
        return this.f30215o;
    }

    public final boolean l() {
        return this.f30208h;
    }

    public final Scale m() {
        return this.f30205e;
    }

    public final coil.size.f n() {
        return this.d;
    }

    public final n o() {
        return this.f30211k;
    }
}
