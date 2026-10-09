package com.koushikdutta.ion.gif;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class a implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public int f41783A;

    /* renamed from: B, reason: collision with root package name */
    public int f41784B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f41785C;

    /* renamed from: D, reason: collision with root package name */
    public int f41786D;

    /* renamed from: E, reason: collision with root package name */
    public int f41787E;

    /* renamed from: F, reason: collision with root package name */
    public short[] f41788F;

    /* renamed from: G, reason: collision with root package name */
    public byte[] f41789G;

    /* renamed from: H, reason: collision with root package name */
    public byte[] f41790H;

    /* renamed from: I, reason: collision with root package name */
    public byte[] f41791I;

    /* renamed from: J, reason: collision with root package name */
    public byte[] f41792J;

    /* renamed from: K, reason: collision with root package name */
    public int f41793K;

    /* renamed from: L, reason: collision with root package name */
    public int f41794L;

    /* renamed from: M, reason: collision with root package name */
    public int f41795M;

    /* renamed from: N, reason: collision with root package name */
    public int f41796N;

    /* renamed from: O, reason: collision with root package name */
    public b f41797O;

    /* renamed from: P, reason: collision with root package name */
    public b f41798P;

    /* renamed from: Q, reason: collision with root package name */
    public int[] f41799Q;

    /* renamed from: R, reason: collision with root package name */
    public int f41800R;

    /* renamed from: a, reason: collision with root package name */
    public int f41801a;

    /* renamed from: b, reason: collision with root package name */
    public int f41802b;

    /* renamed from: c, reason: collision with root package name */
    public int f41803c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f41804e;

    /* renamed from: f, reason: collision with root package name */
    public int f41805f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f41806g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f41807h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f41808i;

    /* renamed from: j, reason: collision with root package name */
    public int f41809j;

    /* renamed from: k, reason: collision with root package name */
    public int f41810k;

    /* renamed from: l, reason: collision with root package name */
    public int f41811l;

    /* renamed from: m, reason: collision with root package name */
    public int f41812m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41813n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41814o;

    /* renamed from: p, reason: collision with root package name */
    public int f41815p;

    /* renamed from: q, reason: collision with root package name */
    public int f41816q;

    /* renamed from: r, reason: collision with root package name */
    public int f41817r;

    /* renamed from: s, reason: collision with root package name */
    public int f41818s;

    /* renamed from: t, reason: collision with root package name */
    public int f41819t;

    /* renamed from: u, reason: collision with root package name */
    public int f41820u;

    /* renamed from: v, reason: collision with root package name */
    public int f41821v;

    /* renamed from: w, reason: collision with root package name */
    public int f41822w;

    /* renamed from: x, reason: collision with root package name */
    public int f41823x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f41824y;

    /* renamed from: z, reason: collision with root package name */
    public int f41825z;

    public a(ByteBuffer r4) {
        this(r4.array(), r4.arrayOffset() + r4.position(), r4.remaining());
    }

    public final void A() {
    L2:
        o();
        if (this.f41825z <= 0) goto L6;
        if (b() == false) goto L2;
        return;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00be -> B:40:0x00b8). Please report as a decompilation issue!!! */
    public final void a() {
        int r1 = this.f41818s * this.f41819t;
        byte[] r2 = this.f41791I;
        if (r2 != null) goto L5;
    L6:
        this.f41791I = new byte[r1];
    L8:
        if (this.f41788F != null) goto L11;
        this.f41788F = new short[4096];
    L11:
        if (this.f41789G != null) goto L14;
        this.f41789G = new byte[4096];
    L14:
        if (this.f41790H != null) goto L16;
        this.f41790H = new byte[4097];
    L16:
        int r22 = l();
        int r5 = 1 << r22;
        int r6 = r5 + 1;
        int r7 = r5 + 2;
        int r23 = r22 + 1;
        int r8 = (1 << r23) - 1;
        int r10 = 0;
    L17:
        if (r10 >= r5) goto L19;
        this.f41788F[r10] = 0;
        this.f41789G[r10] = (byte) r10;
        r10 = r10 + 1;
        goto L17
    L19:
        int r14 = r23;
        int r4 = r7;
        int r16 = r8;
        int r3 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r15 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r9 = -1;
    L20:
        if (r11 >= r1) goto L57;
        if (r12 != 0) goto L55;
        if (r13 < r14) goto L23;
        int r102 = r15 & r16;
        r15 = r15 >> r14;
        r13 = r13 - r14;
        if (r102 > r4) goto L57;
        if (r102 == r6) goto L57;
        if (r102 == r5) goto L34;
        int r222 = r1;
        if (r9 == (-1)) goto L37;
        if (r102 != r4) goto L41;
        int r232 = r12 + 1;
        this.f41790H[r12] = (byte) r3;
        int r17 = r9;
    L40:
        r12 = r232;
        int r110 = r17;
    L42:
        if (r110 <= r5) goto L44;
        r232 = r12 + 1;
        int r24 = r110;
        this.f41790H[r12] = this.f41789G[r24];
        r17 = this.f41788F[r24];
        goto L40
    L44:
        int r242 = r110;
        byte[] r111 = this.f41789G;
        r3 = r111[r242] & UnsignedBytes.MAX_VALUE;
        if (r4 >= 4096) goto L57;
        int r243 = r12 + 1;
        byte r112 = (byte) r3;
        this.f41790H[r12] = r112;
        this.f41788F[r4] = (short) r9;
        r111[r4] = r112;
        r4 = r4 + 1;
        if ((r4 & r16) != 0) goto L53;
        if (r4 >= 4096) goto L53;
        r14 = r14 + 1;
        r16 = r16 + r4;
    L53:
        r9 = r102;
        r12 = r243;
    L56:
        r12 = r12 - 1;
        int r113 = r20;
        r20 = r113 + 1;
        this.f41791I[r113] = this.f41790H[r12];
        r11 = r11 + 1;
        r1 = r222;
        r23 = r23;
        goto L20
    L41:
        r110 = r102;
        goto L42
    L37:
        this.f41790H[r12] = this.f41789G[r102];
        r12 = r12 + 1;
        r3 = r102;
        r9 = r3;
        r1 = r222;
        goto L20
    L34:
        r14 = r23;
        r4 = r7;
        r16 = r8;
        r9 = -1;
        goto L20
    L23:
        if (r18 != 0) goto L28;
        r18 = o();
        if (r18 <= 0) goto L57;
        r19 = 0;
    L28:
        r15 = r15 + ((this.f41824y[r19] & UnsignedBytes.MAX_VALUE) << r13);
        r13 = r13 + 8;
        r19 = r19 + 1;
        r18 = r18 - 1;
        goto L20
    L55:
        r222 = r1;
    L57:
        this.f41800R = r20;
        return;
    L5:
        if (r2.length >= r1) goto L8;
        goto L6
    }

    public final boolean b() {
        if (this.f41801a == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public int c() {
        return this.f41794L;
    }

    public int e() {
        return this.f41803c;
    }

    public b g() {
        return this.f41797O;
    }

    public int h() {
        return this.f41801a;
    }

    public int i() {
        return this.f41802b;
    }

    public a j() {
        a r02 = (a) clone();     // Catch: CloneNotSupportedException -> L4
        this.f41824y = new byte[256];     // Catch: CloneNotSupportedException -> L4
        this.f41788F = null;     // Catch: CloneNotSupportedException -> L4
        this.f41789G = null;     // Catch: CloneNotSupportedException -> L4
        this.f41790H = null;     // Catch: CloneNotSupportedException -> L4
        this.f41791I = null;     // Catch: CloneNotSupportedException -> L4
        this.f41799Q = null;     // Catch: CloneNotSupportedException -> L4
        return r02;
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    public synchronized b k() {
        monitor-enter(this);
    L43:
    L16:
        th = move-exception;
        throw th;
    L4:
        if (b() == true) goto L38;
        if (this.f41801a != 0) goto L38;
        int r02 = l();     // Catch: Throwable -> L16
        if (r02 == 0) goto L43;
        if (r02 != 33) goto L12;
        int r03 = l();     // Catch: Throwable -> L16
        if (r03 != 249) goto L27;
        q();     // Catch: Throwable -> L16
        goto L43
    L27:
        if (r03 != 255) goto L28;
        o();     // Catch: Throwable -> L16
        String r04 = "";
        int r1 = 0;
    L31:
        if (r1 >= 11) goto L34;
        r04 = r04 + ((char) this.f41824y[r1]);     // Catch: Throwable -> L16
        r1 = r1 + 1;     // Catch: Throwable -> L16
        goto L31
    L34:
        if (r04.equals("NETSCAPE2.0") == true) goto L35;
        A();     // Catch: Throwable -> L16
        goto L43
    L35:
        v();     // Catch: Throwable -> L16
        goto L43
    L28:
        A();     // Catch: Throwable -> L16
        goto L43
    L12:
        if (r02 == 44) goto L21;
        if (r02 == 59) goto L18;
        this.f41801a = 1;     // Catch: Throwable -> L16
        goto L43
    L18:
        this.f41801a = -1;     // Catch: Throwable -> L16
        monitor-exit(this);
        return null;
    L21:
        b r05 = s();     // Catch: Throwable -> L16
        this.f41797O = r05;     // Catch: Throwable -> L16
        monitor-exit(this);
        return r05;
    L38:
        this.f41801a = 1;     // Catch: Throwable -> L16
        monitor-exit(this);
        return null;
    }

    public final int l() {
        int r02 = this.f41795M;
        if (r02 < this.f41794L) goto L6;
        return 0;
    L6:
        byte[] r1 = this.f41792J;
        int r2 = this.f41793K;
        this.f41795M = r02 + 1;
        return r1[r2 + r02] & UnsignedBytes.MAX_VALUE;
    }

    public final int m(byte[] r3) {
        return n(r3, 0, r3.length);
    }

    public final int n(byte[] r4, int r5, int r6) {
        int r02 = this.f41795M;
        int r1 = this.f41794L;
        if (r02 < r1) goto L6;
        return -1;
    L6:
        int r62 = Math.min(r1 - r02, r6);
        System.arraycopy(this.f41792J, this.f41793K + this.f41795M, r4, r5, r62);
        this.f41795M += r62;
        return r62;
    }

    public final int o() {
        int r02 = l();
        this.f41825z = r02;
        int r1 = 0;
        if (r02 > 0) goto L17;
    L16:
        return r1;
    L17:
        int r03 = this.f41825z;     // Catch: Exception -> L11
        if (r1 >= r03) goto L14;
        int r04 = n(this.f41824y, r1, r03 - r1);     // Catch: Exception -> L11
        if (r04 == (-1)) goto L14;
        r1 = r1 + r04;
    L14:
        if (r1 >= this.f41825z) goto L16;
        this.f41801a = 1;
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L14
    }

    public final int[] p(int r10) {
        int r02 = r10 * 3;
        byte[] r1 = new byte[r02];
        int r2 = 0;
        int r3 = m(r1);     // Catch: Exception -> L5
    L7:
        if (r3 >= r02) goto L9;
        this.f41801a = 1;
        return null;
    L9:
        int[] r03 = new int[256];
        int r32 = 0;
    L10:
        if (r2 >= r10) goto L13;
        int r5 = r1[r32] & UnsignedBytes.MAX_VALUE;
        int r6 = r32 + 2;
        int r4 = r1[r32 + 1] & UnsignedBytes.MAX_VALUE;
        r32 = r32 + 3;
        r03[r2] = ((r4 << 8) | ((r5 << 16) | (-16777216))) | (r1[r6] & UnsignedBytes.MAX_VALUE);
        r2 = r2 + 1;
        goto L10
    L13:
        return r03;
    L5:
        e = move-exception;
        e.printStackTrace();
        r3 = 0;
        goto L7
    }

    public final void q() {
        l();
        int r02 = l();
        int r1 = (r02 & 28) >> 2;
        this.f41783A = r1;
        boolean r2 = true;
        if (r1 != 0) goto L6;
        this.f41783A = 1;
    L6:
        if ((r02 & 1) != 0) goto L9;
        r2 = false;
    L9:
        this.f41785C = r2;
        this.f41786D = w() * 10;
        this.f41787E = l();
        l();
    }

    public final void r() {
        String r02 = "";
        int r1 = 0;
    L4:
        if (r1 >= 6) goto L7;
        r02 = r02 + ((char) l());
        r1 = r1 + 1;
        goto L4
    L7:
        if (r02.startsWith("GIF") == true) goto L10;
        this.f41801a = 1;
        return;
    L10:
        u();
        if (this.d == true) goto L13;
        return;
    L13:
        if (b() == true) goto L18;
        int[] r03 = p(this.f41804e);
        this.f41806g = r03;
        this.f41810k = r03[this.f41809j];
        return;
    }

    public final b s() {
        this.f41816q = w();
        this.f41817r = w();
        this.f41818s = w();
        this.f41819t = w();
        int r02 = l();
        if ((r02 & 128) == 0) goto L5;
        boolean r1 = true;
    L6:
        this.f41813n = r1;
        if ((r02 & 64) == 0) goto L9;
        boolean r4 = true;
    L10:
        this.f41814o = r4;
        int r03 = 2 << (r02 & 7);
        this.f41815p = r03;
        if (r1 == false) goto L13;
        int[] r04 = p(r03);
        this.f41807h = r04;
        this.f41808i = r04;
    L17:
        if (this.f41808i != null) goto L20;
        this.f41801a = 1;
    L20:
        if (b() == false) goto L22;
        return null;
    L22:
        a();
        A();
        if (b() == false) goto L25;
        return null;
    L25:
        this.f41796N++;
        b r12 = new b(z(), this.f41786D);
        x(r12);
        return r12;
    L13:
        this.f41808i = this.f41806g;
        if (this.f41809j != this.f41787E) goto L17;
        this.f41810k = 0;
        goto L17
    L9:
        r4 = false;
        goto L10
    L5:
        r1 = false;
        goto L6
    }

    public final void u() {
        this.f41802b = w();
        this.f41803c = w();
        int r02 = l();
        if ((r02 & 128) == 0) goto L5;
        boolean r1 = true;
    L6:
        this.d = r1;
        this.f41804e = 2 << (r02 & 7);
        this.f41809j = l();
        this.f41812m = l();
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void v() {
    L2:
        o();
        byte[] r02 = this.f41824y;
        if (r02[0] != 1) goto L6;
        int r1 = r02[1] & UnsignedBytes.MAX_VALUE;
        this.f41805f = ((r02[2] & UnsignedBytes.MAX_VALUE) << 8) | r1;
    L6:
        if (this.f41825z <= 0) goto L9;
        if (b() == false) goto L2;
        return;
    }

    public final int w() {
        return l() | (l() << 8);
    }

    public final void x(b r4) {
        int r02 = this.f41783A;
        if (r02 != 0) goto L5;
        this.f41798P = r4;
    L14:
        this.f41784B = this.f41783A;
        this.f41820u = this.f41816q;
        this.f41821v = this.f41817r;
        this.f41822w = this.f41818s;
        this.f41823x = this.f41819t;
        this.f41811l = this.f41810k;
        this.f41783A = 0;
        this.f41785C = false;
        this.f41786D = 0;
        this.f41807h = null;
        this.f41800R = Integer.MAX_VALUE;
        return;
    L5:
        if (r02 != 1) goto L7;
        this.f41798P = r4;
        goto L14
    L7:
        if (r02 != 2) goto L9;
        this.f41798P = null;
        goto L14
    L9:
        if (r02 == 3) goto L14;
        Log.w("Ion", "Unknown gif dispose code: " + this.f41784B);
        goto L14
    }

    public void y() {
        this.f41795M = 0;
        this.f41801a = 0;
        this.f41806g = null;
        this.f41807h = null;
        r();
    }

    public final Bitmap z() {
        int r02 = this.f41784B;
        int r2 = 0;
        if (r02 == 2) goto L5;
        int[] r6 = this.f41799Q;
        if (r6 != null) goto L18;
        int r10 = this.f41802b;
        int r14 = this.f41803c;
        int[] r8 = new int[r10 * r14];
        this.f41799Q = r8;
        b r03 = this.f41798P;
        if (r03 == null) goto L17;
        r03.f41826a.getPixels(r8, 0, r10, 0, 0, r10, r14);
    L23:
        int r62 = 1;
        int r5 = 8;
        int r4 = 0;
    L24:
        int r7 = this.f41819t;
        if (r2 >= r7) goto L57;
        if (this.f41814o == false) goto L38;
        if (r4 < r7) goto L37;
        r62 = r62 + 1;
        if (r62 == 2) goto L36;
        if (r62 == 3) goto L35;
        if (r62 != 4) goto L37;
        r4 = 1;
        r5 = 2;
        goto L37
    L35:
        r4 = 2;
        r5 = 4;
        goto L37
    L36:
        r4 = 4;
    L37:
        int r72 = r4 + r5;
    L39:
        int r42 = r4 + this.f41817r;
        if (r42 >= this.f41803c) goto L55;
        int r82 = this.f41802b;
        int r43 = r42 * r82;
        int r9 = this.f41816q + r43;
        int r102 = this.f41818s;
        int r11 = r9 + r102;
        if ((r43 + r82) >= r11) goto L44;
        r11 = r43 + r82;
    L44:
        int r103 = r102 * r2;
    L45:
        if (r9 >= r11) goto L55;
        if (r103 >= this.f41800R) goto L55;
        int r83 = r103 + 1;
        int r44 = this.f41791I[r103] & UnsignedBytes.MAX_VALUE;
        if (this.f41785C == true) goto L52;
    L53:
        this.f41799Q[r9] = this.f41808i[r44];
    L54:
        r9 = r9 + 1;
        r103 = r83;
        goto L45
    L52:
        if (r44 == this.f41787E) goto L54;
    L55:
        r2 = r2 + 1;
        r4 = r72;
        goto L24
    L38:
        r72 = r4;
        r4 = r2;
        goto L39
    L57:
        return Bitmap.createBitmap(this.f41799Q, this.f41802b, this.f41803c, Bitmap.Config.ARGB_4444);
    L17:
        Arrays.fill(r8, 0);
        goto L23
    L18:
        if (r02 != 3) goto L23;
        b r04 = this.f41798P;
        if (r04 == null) goto L22;
        Bitmap r52 = r04.f41826a;
        int r84 = this.f41802b;
        r52.getPixels(r6, 0, r84, 0, 0, r84, this.f41803c);
        goto L23
    L22:
        Arrays.fill(r6, 0);
        goto L23
    L5:
        if (this.f41799Q != null) goto L8;
        this.f41799Q = new int[this.f41802b * this.f41803c];
    L8:
        if (this.f41785C == true) goto L10;
        int r05 = this.f41811l;
    L11:
        Arrays.fill(this.f41799Q, r05);
        goto L23
    L10:
        r05 = 0;
        goto L11
    }

    public a(byte[] r2, int r3, int r4) {
        this.f41805f = 1;
        this.f41824y = new byte[256];
        this.f41825z = 0;
        this.f41783A = 0;
        this.f41784B = 0;
        this.f41785C = false;
        this.f41786D = 0;
        this.f41800R = Integer.MAX_VALUE;
        this.f41792J = r2;
        this.f41793K = r3;
        this.f41794L = r4;
        y();
    }
}
