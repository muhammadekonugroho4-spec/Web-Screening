package com.clevertap.android.sdk.gif;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Logger;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: y, reason: collision with root package name */
    public static final String f33915y = "a";

    /* renamed from: a, reason: collision with root package name */
    public int[] f33916a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0346a f33917b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f33918c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f33919e;

    /* renamed from: f, reason: collision with root package name */
    public int f33920f;

    /* renamed from: g, reason: collision with root package name */
    public c f33921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33922h;

    /* renamed from: i, reason: collision with root package name */
    public int f33923i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f33924j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f33925k;

    /* renamed from: l, reason: collision with root package name */
    public d f33926l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f33927m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f33928n;

    /* renamed from: o, reason: collision with root package name */
    public short[] f33929o;

    /* renamed from: p, reason: collision with root package name */
    public Bitmap f33930p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f33931q;

    /* renamed from: r, reason: collision with root package name */
    public int f33932r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33933s;

    /* renamed from: t, reason: collision with root package name */
    public int f33934t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f33935u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f33936v;

    /* renamed from: w, reason: collision with root package name */
    public int f33937w;

    /* renamed from: x, reason: collision with root package name */
    public int f33938x;

    /* renamed from: com.clevertap.android.sdk.gif.a$a, reason: collision with other inner class name */
    public interface InterfaceC0346a {
        byte[] a(int r1);

        Bitmap b(int r1, int r2, Bitmap.Config r3);

        int[] c(int r1);
    }

    static {
    }

    public a(InterfaceC0346a r2) {
        this.f33927m = new int[256];
        this.f33937w = 0;
        this.f33938x = 0;
        this.f33917b = r2;
        this.f33921g = new c();
    }

    public static void s(Bitmap r1) {
        r1.setHasAlpha(true);
    }

    public boolean a() {
        if (this.f33921g.d > 0) goto L6;
        return false;
    L6:
        if (this.f33920f != (g() - 1)) goto L8;
        this.f33923i++;
    L8:
        c r02 = this.f33921g;
        int r2 = r02.f33957j;
        if (r2 != (-1)) goto L11;
    L13:
        this.f33920f = (this.f33920f + 1) % r02.d;
        return true;
    L11:
        if (this.f33923i <= r2) goto L13;
        return false;
    }

    public final int b(int r10, int r11, int r12) {
        int r1 = r10;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L4:
        if (r1 >= (this.f33932r + r10)) goto L12;
        byte[] r7 = this.f33924j;
        if (r1 >= r7.length) goto L12;
        if (r1 >= r11) goto L12;
        int r72 = this.f33916a[r7[r1] & UnsignedBytes.MAX_VALUE];
        if (r72 == 0) goto L11;
        r2 = r2 + ((r72 >> 24) & Constants.MAX_HOST_LENGTH);
        r3 = r3 + ((r72 >> 16) & Constants.MAX_HOST_LENGTH);
        r4 = r4 + ((r72 >> 8) & Constants.MAX_HOST_LENGTH);
        r5 = r5 + (r72 & Constants.MAX_HOST_LENGTH);
        r6 = r6 + 1;
    L11:
        r1 = r1 + 1;
    L12:
        int r102 = r10 + r12;
        int r122 = r102;
    L14:
        if (r122 >= (this.f33932r + r102)) goto L22;
        byte[] r13 = this.f33924j;
        if (r122 >= r13.length) goto L22;
        if (r122 >= r11) goto L22;
        int r14 = this.f33916a[r13[r122] & UnsignedBytes.MAX_VALUE];
        if (r14 == 0) goto L21;
        r2 = r2 + ((r14 >> 24) & Constants.MAX_HOST_LENGTH);
        r3 = r3 + ((r14 >> 16) & Constants.MAX_HOST_LENGTH);
        r4 = r4 + ((r14 >> 8) & Constants.MAX_HOST_LENGTH);
        r5 = r5 + (r14 & Constants.MAX_HOST_LENGTH);
        r6 = r6 + 1;
    L21:
        r122 = r122 + 1;
    L22:
        if (r6 != 0) goto L25;
        return 0;
    L25:
        return ((((r2 / r6) << 24) | ((r3 / r6) << 16)) | ((r4 / r6) << 8)) | (r5 / r6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v43, types: [short] */
    /* JADX WARN: Type inference failed for: r1v47 */
    public final void c(b r28) {
        byte r2 = 0;
        this.f33938x = 0;
        this.f33937w = 0;
        if (r28 == null) goto L5;
        this.f33931q.position(r28.f33939a);
    L5:
        if (r28 != null) goto L8;
        c r1 = this.f33921g;
        int r3 = r1.f33960m;
        int r12 = r1.f33956i;
    L7:
        int r32 = r3 * r12;
        byte[] r13 = this.f33924j;
        if (r13 != null) goto L12;
    L13:
        this.f33924j = this.f33917b.a(r32);
    L15:
        if (this.f33929o != null) goto L18;
        this.f33929o = new short[4096];
    L18:
        if (this.f33935u != null) goto L21;
        this.f33935u = new byte[4096];
    L21:
        if (this.f33928n != null) goto L23;
        this.f33928n = new byte[4097];
    L23:
        int r14 = p();
        boolean r5 = true;
        int r6 = 1 << r14;
        int r7 = r6 + 1;
        int r8 = r6 + 2;
        int r15 = r14 + 1;
        int r9 = (1 << r15) - 1;
        int r10 = 0;
    L24:
        if (r10 >= r6) goto L26;
        this.f33929o[r10] = 0;
        this.f33935u[r10] = (byte) r10;
        r10 = r10 + 1;
        goto L24
    L26:
        int r102 = -1;
        int r19 = r15;
        int r11 = 0;
        int r122 = 0;
        int r132 = 0;
        int r142 = 0;
        int r152 = 0;
        int r16 = 0;
        int r21 = 0;
        int r22 = 0;
        int r17 = r8;
        int r20 = r9;
        int r18 = -1;
    L27:
        byte r23 = r2;
        if (r11 >= r32) goto L67;
        if (r122 != 0) goto L35;
        r122 = o();
        if (r122 <= 0) goto L33;
        r152 = r23;
        goto L35
    L33:
        this.f33934t = 3;
    L35:
        boolean r282 = r5;
        r142 = r142 + ((this.f33918c[r152] & UnsignedBytes.MAX_VALUE) << r132);
        r132 = r132 + 8;
        r152 = r152 + 1;
        r122 = r122 + r102;
        int r52 = r17;
        int r4 = r18;
        int r103 = r19;
        int r24 = r22;
    L36:
        if (r132 < r103) goto L66;
        int r25 = r142 & r20;
        r142 = r142 >> r103;
        r132 = r132 - r103;
        if (r25 == r6) goto L39;
        if (r25 > r52) goto L41;
        int r222 = r15;
        if (r25 == r7) goto L44;
        if (r4 != (-1)) goto L50;
        this.f33928n[r21] = this.f33935u[r25];
        r4 = r25;
        r24 = r4;
        r21 = r21 + 1;
        r15 = r222;
        goto L36
    L50:
        if (r25 < r52) goto L52;
        this.f33928n[r21] = (byte) r24;
        short r110 = r4;
        r21 = r21 + 1;
    L53:
        if (r110 < r6) goto L55;
        char r182 = r110;
        this.f33928n[r21] = this.f33935u[r182];
        r110 = this.f33929o[r182];
        r21 = r21 + 1;
        goto L53
    L55:
        char r183 = r110;
        byte[] r111 = this.f33935u;
        int r112 = r111[r183] & UnsignedBytes.MAX_VALUE;
        int r252 = r21 + 1;
        byte r26 = (byte) r112;
        this.f33928n[r21] = r26;
        if (r52 >= 4096) goto L62;
        this.f33929o[r52] = (short) r4;
        r111[r52] = r26;
        r52 = r52 + 1;
        if ((r52 & r20) != 0) goto L64;
        if (r52 >= 4096) goto L62;
        r103 = r103 + 1;
        r20 = r20 + r52;
    L62:
        if (r252 <= 0) goto L65;
        r252 = r252 - 1;
        this.f33924j[r16] = this.f33928n[r252];
        r11 = r11 + 1;
        r16 = r16 + 1;
        goto L62
    L65:
        r4 = r25;
        r24 = r112;
        r15 = r222;
        r21 = r252;
        goto L36
    L52:
        r110 = r25;
    L44:
        r18 = r4;
        r17 = r52;
        r19 = r103;
        r15 = r222;
        r2 = r23;
        r22 = r24;
    L45:
        r102 = -1;
        r5 = r282;
        goto L27
    L41:
        r222 = r15;
        this.f33934t = 3;
        goto L44
    L39:
        r103 = r15;
        r52 = r8;
        r20 = r9;
        r4 = -1;
        goto L36
    L66:
        r22 = r24;
        r15 = r15;
        r18 = r4;
        r17 = r52;
        r19 = r103;
        r2 = r23;
    L67:
        int r113 = r16;
    L68:
        if (r113 >= r32) goto L70;
        this.f33924j[r113] = r23;
        r113 = r113 + 1;
        goto L68
    L70:
        return;
    L12:
        if (r13.length >= r32) goto L15;
    L8:
        r3 = r28.f33944g;
        r12 = r28.f33945h;
        goto L7
    }

    public final void d(int[] r5, b r6, int r7) {
        int r02 = r6.f33945h;
        int r1 = this.f33932r;
        int r03 = r02 / r1;
        int r2 = r6.f33943f / r1;
        int r3 = r6.f33944g / r1;
        int r62 = r6.f33942e / r1;
        int r12 = this.f33919e;
        int r22 = (r2 * r12) + r62;
        int r04 = (r03 * r12) + r22;
    L3:
        if (r22 >= r04) goto L8;
        int r63 = r22 + r3;
        int r13 = r22;
    L5:
        if (r13 >= r63) goto L7;
        r5[r13] = r7;
        r13 = r13 + 1;
        goto L5
    L7:
        r22 = r22 + this.f33919e;
        goto L3
    }

    public int e() {
        return this.f33920f;
    }

    public int f(int r3) {
        if (r3 < 0) goto L7;
        c r02 = this.f33921g;
        if (r3 < r02.d) goto L6;
        return -1;
    L6:
        return ((b) r02.f33952e.get(r3)).f33940b;
    L7:
        return -1;
    }

    public int g() {
        return this.f33921g.d;
    }

    public final d h() {
        if (this.f33926l != null) goto L6;
        this.f33926l = new d();
    L6:
        return this.f33926l;
    }

    public int i() {
        return this.f33921g.f33956i;
    }

    public final Bitmap j() {
        if (this.f33922h == false) goto L5;
        Bitmap.Config r02 = Bitmap.Config.ARGB_8888;
    L6:
        Bitmap r03 = this.f33917b.b(this.f33919e, this.d, r02);
        s(r03);
        return r03;
    L5:
        r02 = Bitmap.Config.RGB_565;
        goto L6
    }

    public int k() {
        if (this.f33921g.d <= 0) goto L9;
        int r02 = this.f33920f;
        if (r02 >= 0) goto L8;
        return 0;
    L8:
        return f(r02);
    L9:
        return 0;
    }

    public synchronized Bitmap l() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f33921g.d > 0) goto L6;
    L10:
        Logger.d(f33915y, "unable to decode frame, frameCount=" + this.f33921g.d + " framePointer=" + this.f33920f);     // Catch: Throwable -> L8
        this.f33934t = 1;     // Catch: Throwable -> L8
    L11:
        int r02 = this.f33934t;     // Catch: Throwable -> L8
        if (r02 != 1) goto L14;
    L35:
        Logger.d(f33915y, "Unable to decode frame, status=" + this.f33934t);     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L14:
        if (r02 == 2) goto L35;
        this.f33934t = 0;     // Catch: Throwable -> L8
        b r3 = (b) this.f33921g.f33952e.get(this.f33920f);     // Catch: Throwable -> L8
        int r4 = this.f33920f - 1;     // Catch: Throwable -> L8
        if (r4 < 0) goto L19;
        b r42 = (b) this.f33921g.f33952e.get(r4);     // Catch: Throwable -> L8
    L20:
        int[] r5 = r3.f33946i;     // Catch: Throwable -> L8
        if (r5 != null) goto L24;
        r5 = this.f33921g.f33953f;     // Catch: Throwable -> L8
    L24:
        this.f33916a = r5;     // Catch: Throwable -> L8
        if (r5 != null) goto L30;
        Logger.d(f33915y, "No Valid Color Table for frame #" + this.f33920f);     // Catch: Throwable -> L8
        this.f33934t = 1;     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L30:
        if (r3.f33948k == false) goto L32;
        System.arraycopy(r5, 0, this.f33927m, 0, r5.length);     // Catch: Throwable -> L8
        int[] r1 = this.f33927m;     // Catch: Throwable -> L8
        this.f33916a = r1;     // Catch: Throwable -> L8
        r1[r3.f33947j] = 0;     // Catch: Throwable -> L8
    L32:
        Bitmap r03 = x(r3, r42);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r03;
    L19:
        r42 = null;
        goto L20
    L6:
        if (this.f33920f >= 0) goto L11;
        goto L11
    }

    public int m() {
        return this.f33921g.f33960m;
    }

    public synchronized int n(byte[] r2) {
        monitor-enter(this);
        c r02 = h().p(r2).b();     // Catch: Throwable -> L6
        this.f33921g = r02;     // Catch: Throwable -> L6
        if (r2 == null) goto L8;
        v(r02, r2);     // Catch: Throwable -> L6
    L8:
        int r22 = this.f33934t;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    public final int o() {
        int r02 = p();
        if (r02 > 0) goto L22;
    L21:
        return r02;
    L22:
    L8:
        e = move-exception;
        Logger.d(f33915y, "Error Reading Block", e);
        this.f33934t = 1;
        goto L21
    L6:
        if (this.f33918c != null) goto L10;
        this.f33918c = this.f33917b.a(Constants.MAX_HOST_LENGTH);     // Catch: Exception -> L8
    L10:
        int r2 = this.f33938x;     // Catch: Exception -> L8
        int r3 = this.f33937w;     // Catch: Exception -> L8
        int r22 = r2 - r3;     // Catch: Exception -> L8
        if (r22 < r02) goto L15;
        System.arraycopy(this.f33936v, r3, this.f33918c, 0, r02);     // Catch: Exception -> L8
        this.f33937w += r02;
        return r02;
    L15:
        if ((this.f33931q.remaining() + r22) < r02) goto L18;
        System.arraycopy(this.f33936v, this.f33937w, this.f33918c, 0, r22);     // Catch: Exception -> L8
        this.f33937w = this.f33938x;     // Catch: Exception -> L8
        q();     // Catch: Exception -> L8
        int r32 = r02 - r22;     // Catch: Exception -> L8
        System.arraycopy(this.f33936v, 0, this.f33918c, r22, r32);     // Catch: Exception -> L8
        this.f33937w += r32;
        return r02;
    L18:
        this.f33934t = 1;     // Catch: Exception -> L8
        return r02;
    }

    public final int p() {
        q();     // Catch: Exception -> L5
        byte[] r02 = this.f33936v;     // Catch: Exception -> L5
        int r1 = this.f33937w;     // Catch: Exception -> L5
        this.f33937w = r1 + 1;     // Catch: Exception -> L5
        return r02[r1] & UnsignedBytes.MAX_VALUE;
    L5:
        this.f33934t = 1;
        return 0;
    }

    public final void q() {
        if (this.f33938x <= this.f33937w) goto L6;
        return;
    L6:
        if (this.f33936v != null) goto L8;
        this.f33936v = this.f33917b.a(16384);
    L8:
        this.f33937w = 0;
        int r1 = Math.min(this.f33931q.remaining(), 16384);
        this.f33938x = r1;
        this.f33931q.get(this.f33936v, 0, r1);
    }

    public void r() {
        this.f33923i = 0;
    }

    public synchronized void t(c r2, ByteBuffer r3) {
        monitor-enter(this);
        u(r2, r3, 1);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized void u(c r3, ByteBuffer r4, int r5) {
        monitor-enter(this);
        if (r5 <= 0) goto L16;
        int r52 = Integer.highestOneBit(r5);     // Catch: Throwable -> L10
        this.f33934t = 0;     // Catch: Throwable -> L10
        this.f33921g = r3;     // Catch: Throwable -> L10
        this.f33922h = false;     // Catch: Throwable -> L10
        this.f33920f = -1;     // Catch: Throwable -> L10
        r();     // Catch: Throwable -> L10
        ByteBuffer r42 = r4.asReadOnlyBuffer();     // Catch: Throwable -> L10
        this.f33931q = r42;     // Catch: Throwable -> L10
        r42.position(0);     // Catch: Throwable -> L10
        this.f33931q.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Throwable -> L10
        this.f33933s = false;     // Catch: Throwable -> L10
        Iterator r43 = r3.f33952e.iterator();     // Catch: Throwable -> L10
    L6:
        if (r43.hasNext() == false) goto L12;
        if (((b) r43.next()).f33941c != 3) goto L6;
        this.f33933s = true;     // Catch: Throwable -> L10
    L12:
        this.f33932r = r52;     // Catch: Throwable -> L10
        int r44 = r3.f33960m;     // Catch: Throwable -> L10
        this.f33919e = r44 / r52;     // Catch: Throwable -> L10
        int r32 = r3.f33956i;     // Catch: Throwable -> L10
        this.d = r32 / r52;     // Catch: Throwable -> L10
        this.f33924j = this.f33917b.a(r44 * r32);     // Catch: Throwable -> L10
        this.f33925k = this.f33917b.c(this.f33919e * this.d);     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L16:
        throw new IllegalArgumentException("Sample size must be >=0, not: " + r5);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public synchronized void v(c r1, byte[] r2) {
        monitor-enter(this);
        t(r1, ByteBuffer.wrap(r2));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public boolean w(int r2) {
        if (r2 >= (-1)) goto L5;
        return false;
    L5:
        if (r2 >= g()) goto L11;
        this.f33920f = r2;
        return true;
    L11:
        return false;
    }

    public final Bitmap x(b r19, b r20) {
        int[] r3 = this.f33925k;
        int r10 = 0;
        if (r20 != null) goto L5;
        Arrays.fill(r3, 0);
    L5:
        int r11 = 3;
        int r12 = 2;
        int r13 = 1;
        if (r20 == null) goto L21;
        int r4 = r20.f33941c;
        if (r4 <= 0) goto L21;
        if (r4 == 2) goto L11;
        if (r4 != 3) goto L21;
        Bitmap r42 = this.f33930p;
        if (r42 != null) goto L26;
        d(r3, r20, 0);
        goto L21
    L26:
        int r5 = r20.f33945h;
        int r6 = this.f33932r;
        int r9 = r5 / r6;
        int r7 = r20.f33943f / r6;
        int r8 = r20.f33944g / r6;
        int r62 = r20.f33942e / r6;
        int r52 = this.f33919e;
        r42.getPixels(r3, (r7 * r52) + r62, r52, r62, r7, r8, r9);
        goto L21
    L11:
        if (r19.f33948k == true) goto L18;
        c r43 = this.f33921g;
        int r53 = r43.f33949a;
        if (r19.f33946i != null) goto L15;
    L20:
        d(r3, r20, r53);
        goto L21
    L15:
        if (r43.f33950b != r19.f33947j) goto L20;
    L16:
        r53 = 0;
        goto L20
    L18:
        if (this.f33920f != 0) goto L16;
        this.f33922h = true;
    L21:
        int[] r2 = r3;
        c(r19);
        int r32 = r19.f33945h;
        int r44 = this.f33932r;
        int r33 = r32 / r44;
        int r54 = r19.f33943f / r44;
        int r63 = r19.f33944g / r44;
        int r72 = r19.f33942e / r44;
        if (this.f33920f != 0) goto L30;
        boolean r45 = true;
    L31:
        int r82 = 8;
        int r92 = 0;
        int r14 = 1;
    L32:
        if (r10 >= r33) goto L65;
        if (r19.d == false) goto L45;
        if (r92 < r33) goto L44;
        r14 = r14 + 1;
        if (r14 == r12) goto L43;
        if (r14 == r11) goto L42;
        if (r14 != 4) goto L44;
        r82 = r12;
        r92 = r13;
        goto L44
    L42:
        r92 = r12;
        r82 = 4;
        goto L44
    L43:
        r92 = 4;
    L44:
        int r15 = r92 + r82;
    L46:
        int r93 = r92 + r54;
        if (r93 >= this.d) goto L64;
        int r112 = this.f33919e;
        int r94 = r93 * r112;
        int r16 = r94 + r72;
        int r122 = r16 + r63;
        if ((r94 + r112) >= r122) goto L51;
        r122 = r94 + r112;
    L51:
        int r95 = this.f33932r;
        int r113 = (r10 * r95) * r19.f33944g;
        int r132 = ((r122 - r16) * r95) + r113;
        int r96 = r16;
    L52:
        if (r96 >= r122) goto L64;
        int[] r202 = r2;
        int r162 = r33;
        if (this.f33932r != 1) goto L56;
        int r22 = this.f33916a[this.f33924j[r113] & UnsignedBytes.MAX_VALUE];
    L57:
        if (r22 == 0) goto L60;
        r202[r96] = r22;
    L63:
        r113 = r113 + this.f33932r;
        r96 = r96 + 1;
        r2 = r202;
        r33 = r162;
        goto L52
    L60:
        if (this.f33922h == true) goto L63;
        if (r45 == false) goto L63;
        this.f33922h = true;
        goto L63
    L56:
        r22 = b(r113, r132, r19.f33944g);
    L64:
        r10 = r10 + 1;
        r2 = r2;
        r92 = r15;
        r33 = r33;
        r11 = 3;
        r12 = 2;
        r13 = 1;
        goto L32
    L45:
        r15 = r92;
        r92 = r10;
        goto L46
    L65:
        int[] r203 = r2;
        if (this.f33933s == false) goto L72;
        int r1 = r19.f33941c;
        if (r1 == 0) goto L74;
        if (r1 != 1) goto L72;
    L74:
        if (this.f33930p != null) goto L76;
        this.f33930p = j();
    L76:
        Bitmap r17 = this.f33930p;
        int r46 = this.f33919e;
        int[] r23 = r203;
        r17.setPixels(r23, 0, r46, 0, 0, r46, this.d);
    L77:
        Bitmap r18 = j();
        int r47 = this.f33919e;
        r18.setPixels(r23, 0, r47, 0, 0, r47, this.d);
        return r18;
    L72:
        r23 = r203;
        goto L77
    L30:
        r45 = false;
        goto L31
    }

    public a() {
        this(new e());
    }
}
