package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.a;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class e implements a {

    /* renamed from: u, reason: collision with root package name */
    public static final String f32490u = "e";

    /* renamed from: a, reason: collision with root package name */
    public int[] f32491a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f32492b;

    /* renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0318a f32493c;
    public ByteBuffer d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f32494e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f32495f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f32496g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f32497h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f32498i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f32499j;

    /* renamed from: k, reason: collision with root package name */
    public int f32500k;

    /* renamed from: l, reason: collision with root package name */
    public c f32501l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f32502m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32503n;

    /* renamed from: o, reason: collision with root package name */
    public int f32504o;

    /* renamed from: p, reason: collision with root package name */
    public int f32505p;

    /* renamed from: q, reason: collision with root package name */
    public int f32506q;

    /* renamed from: r, reason: collision with root package name */
    public int f32507r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f32508s;

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f32509t;

    static {
    }

    public e(a.InterfaceC0318a r1, c r2, ByteBuffer r3, int r4) {
        this(r1);
        r(r2, r3, r4);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void a(Bitmap.Config r6) {
        Bitmap.Config r02 = Bitmap.Config.ARGB_8888;
        if (r6 == r02) goto L9;
        Bitmap.Config r1 = Bitmap.Config.RGB_565;
        if (r6 == r1) goto L9;
        throw new IllegalArgumentException("Unsupported format: " + r6 + ", must be one of " + r02 + " or " + r1);
    L9:
        this.f32509t = r6;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void b() {
        this.f32500k = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int c() {
        return this.f32500k;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.f32501l = null;
        byte[] r1 = this.f32498i;
        if (r1 == null) goto L5;
        this.f32493c.e(r1);
    L5:
        int[] r12 = this.f32499j;
        if (r12 == null) goto L8;
        this.f32493c.f(r12);
    L8:
        Bitmap r13 = this.f32502m;
        if (r13 == null) goto L11;
        this.f32493c.d(r13);
    L11:
        this.f32502m = null;
        this.d = null;
        this.f32508s = null;
        byte[] r02 = this.f32494e;
        if (r02 == null) goto L15;
        this.f32493c.e(r02);
        return;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int d() {
        return (this.d.limit() + this.f32498i.length) + (this.f32499j.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized Bitmap e() {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f32501l.f32477c > 0) goto L6;
    L10:
        String r02 = f32490u;     // Catch: Throwable -> L8
        if (Log.isLoggable(r02, 3) == false) goto L13;
        Log.d(r02, "Unable to decode frame, frameCount=" + this.f32501l.f32477c + ", framePointer=" + this.f32500k);     // Catch: Throwable -> L8
    L13:
        this.f32504o = 1;     // Catch: Throwable -> L8
    L14:
        int r03 = this.f32504o;     // Catch: Throwable -> L8
        if (r03 != 1) goto L17;
    L48:
        String r04 = f32490u;     // Catch: Throwable -> L8
        if (Log.isLoggable(r04, 3) == false) goto L51;
        Log.d(r04, "Unable to decode frame, status=" + this.f32504o);     // Catch: Throwable -> L8
    L51:
        monitor-exit(this);
        return null;
    L17:
        if (r03 == 2) goto L48;
        this.f32504o = 0;     // Catch: Throwable -> L8
        if (this.f32494e != null) goto L22;
        this.f32494e = this.f32493c.a(Constants.MAX_HOST_LENGTH);     // Catch: Throwable -> L8
    L22:
        b r5 = (b) this.f32501l.f32478e.get(this.f32500k);     // Catch: Throwable -> L8
        int r6 = this.f32500k - 1;     // Catch: Throwable -> L8
        if (r6 < 0) goto L25;
        b r62 = (b) this.f32501l.f32478e.get(r6);     // Catch: Throwable -> L8
    L26:
        int[] r7 = r5.f32474k;     // Catch: Throwable -> L8
        if (r7 != null) goto L30;
        r7 = this.f32501l.f32475a;     // Catch: Throwable -> L8
    L30:
        this.f32491a = r7;     // Catch: Throwable -> L8
        if (r7 != null) goto L39;
        String r05 = f32490u;     // Catch: Throwable -> L8
        if (Log.isLoggable(r05, 3) == false) goto L35;
        Log.d(r05, "No valid color table found for frame #" + this.f32500k);     // Catch: Throwable -> L8
    L35:
        this.f32504o = 1;     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L39:
        if (r5.f32469f == false) goto L45;
        System.arraycopy(r7, 0, this.f32492b, 0, r7.length);     // Catch: Throwable -> L8
        int[] r1 = this.f32492b;     // Catch: Throwable -> L8
        this.f32491a = r1;     // Catch: Throwable -> L8
        r1[r5.f32471h] = 0;     // Catch: Throwable -> L8
        if (r5.f32470g != 2) goto L45;
        if (this.f32500k != 0) goto L45;
        this.f32508s = Boolean.TRUE;     // Catch: Throwable -> L8
    L45:
        Bitmap r06 = s(r5, r62);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r06;
    L25:
        r62 = null;
        goto L26
    L6:
        if (this.f32500k >= 0) goto L14;
        goto L14
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void f() {
        this.f32500k = (this.f32500k + 1) % this.f32501l.f32477c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int g() {
        return this.f32501l.f32477c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public ByteBuffer getData() {
        return this.d;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int h() {
        int r02 = this.f32501l.f32486m;
        if (r02 != (-1)) goto L5;
        return 1;
    L5:
        if (r02 != 0) goto L9;
        return 0;
    L9:
        return r02 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int i() {
        if (this.f32501l.f32477c <= 0) goto L9;
        int r02 = this.f32500k;
        if (r02 >= 0) goto L8;
        return 0;
    L8:
        return n(r02);
    L9:
        return 0;
    }

    public final int j(int r10, int r11, int r12) {
        int r1 = r10;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L4:
        if (r1 >= (this.f32505p + r10)) goto L12;
        byte[] r7 = this.f32498i;
        if (r1 >= r7.length) goto L12;
        if (r1 >= r11) goto L12;
        int r72 = this.f32491a[r7[r1] & UnsignedBytes.MAX_VALUE];
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
        if (r122 >= (this.f32505p + r102)) goto L22;
        byte[] r13 = this.f32498i;
        if (r122 >= r13.length) goto L22;
        if (r122 >= r11) goto L22;
        int r14 = this.f32491a[r13[r122] & UnsignedBytes.MAX_VALUE];
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

    public final void k(b r24) {
        int[] r2 = this.f32499j;
        int r3 = r24.d;
        int r4 = this.f32505p;
        int r32 = r3 / r4;
        int r5 = r24.f32466b / r4;
        int r6 = r24.f32467c / r4;
        int r7 = r24.f32465a / r4;
        if (this.f32500k != 0) goto L5;
        boolean r8 = true;
    L6:
        int r11 = this.f32507r;
        int r12 = this.f32506q;
        byte[] r13 = this.f32498i;
        int[] r14 = this.f32491a;
        Boolean r15 = this.f32508s;
        int r16 = 8;
        int r9 = 0;
        int r10 = 0;
        int r18 = 1;
    L7:
        if (r10 >= r32) goto L56;
        int[] r19 = r2;
        if (r24.f32468e == false) goto L23;
        if (r9 < r32) goto L21;
        int r22 = r18 + 1;
        int r20 = r32;
        if (r22 != 2) goto L14;
        r18 = r22;
        r9 = 4;
    L22:
        int r23 = r9 + r16;
    L24:
        int r92 = r9 + r5;
        if (r4 != 1) goto L27;
        boolean r17 = true;
    L28:
        if (r92 >= r12) goto L53;
        int r93 = r92 * r11;
        int r21 = r93 + r7;
        int r33 = r21 + r6;
        int r94 = r93 + r11;
        if (r94 >= r33) goto L32;
        r33 = r94;
    L32:
        int r222 = r23;
        int r95 = (r10 * r4) * r24.f32467c;
        if (r17 == false) goto L44;
        int r25 = r21;
    L35:
        if (r25 >= r33) goto L43;
        int r172 = r25;
        int r26 = r14[r13[r95] & UnsignedBytes.MAX_VALUE];
        if (r26 == 0) goto L39;
        r19[r172] = r26;
    L42:
        r95 = r95 + r4;
        r25 = r172 + 1;
        goto L35
    L39:
        if (r8 == false) goto L42;
        if (r15 != null) goto L42;
        r15 = Boolean.TRUE;
    L43:
        int r173 = r4;
    L54:
        r10 = r10 + 1;
        r4 = r173;
        r2 = r19;
        r32 = r20;
        r9 = r222;
        goto L7
    L44:
        int r27 = ((r33 - r21) * r4) + r95;
        r173 = r4;
        int r42 = r21;
    L45:
        if (r42 >= r33) goto L54;
        int r212 = r33;
        int r34 = j(r95, r27, r24.f32467c);
        if (r34 == 0) goto L49;
        r19[r42] = r34;
    L52:
        r95 = r95 + r173;
        r42 = r42 + 1;
        r33 = r212;
        goto L45
    L49:
        if (r8 == false) goto L52;
        if (r15 != null) goto L52;
        r15 = Boolean.TRUE;
        goto L52
    L53:
        r222 = r23;
        goto L43
    L27:
        r17 = false;
        goto L28
    L14:
        if (r22 != 3) goto L16;
        r18 = r22;
        r16 = 4;
        r9 = 2;
        goto L22
    L16:
        if (r22 == 4) goto L18;
        r18 = r22;
        goto L22
    L18:
        r18 = r22;
        r9 = 1;
        r16 = 2;
        goto L22
    L21:
        r20 = r32;
        goto L22
    L23:
        r20 = r32;
        r23 = r9;
        r9 = r10;
        goto L24
    L56:
        if (this.f32508s != null) goto L74;
        if (r15 != null) goto L59;
        boolean r102 = false;
    L60:
        this.f32508s = Boolean.valueOf(r102);
        return;
    L59:
        r102 = r15.booleanValue();
        goto L60
    L74:
        return;
    L5:
        r8 = false;
        goto L6
    }

    public final void l(b r19) {
        b r1 = r19;
        int[] r2 = this.f32499j;
        int r3 = r1.d;
        int r4 = r1.f32466b;
        int r5 = r1.f32467c;
        int r6 = r1.f32465a;
        if (this.f32500k != 0) goto L5;
        boolean r7 = true;
    L6:
        int r10 = this.f32507r;
        byte[] r11 = this.f32498i;
        int[] r12 = this.f32491a;
        int r14 = 0;
        byte r15 = -1;
    L7:
        if (r14 >= r3) goto L21;
        int r16 = (r14 + r4) * r10;
        int r17 = r16 + r6;
        int r8 = r17 + r5;
        int r9 = r16 + r10;
        if (r9 >= r8) goto L11;
        r8 = r9;
    L11:
        int r92 = r1.f32467c * r14;
        int r13 = r17;
    L12:
        if (r13 >= r8) goto L20;
        byte r18 = r11[r92];
        int[] r172 = r2;
        int r22 = r18 & UnsignedBytes.MAX_VALUE;
        if (r22 == r15) goto L19;
        int r23 = r12[r22];
        if (r23 == 0) goto L18;
        r172[r13] = r23;
        goto L19
    L18:
        r15 = r18;
    L19:
        r92 = r92 + 1;
        r13 = r13 + 1;
        r2 = r172;
        goto L12
    L20:
        r14 = r14 + 1;
        r1 = r19;
        goto L7
    L21:
        Boolean r110 = this.f32508s;
        if (r110 == null) goto L26;
        if (r110.booleanValue() == false) goto L26;
    L30:
        boolean r82 = true;
    L32:
        this.f32508s = Boolean.valueOf(r82);
        return;
    L26:
        if (this.f32508s != null) goto L31;
        if (r7 == false) goto L31;
        if (r15 != (-1)) goto L30;
    L31:
        r82 = false;
        goto L32
    L5:
        r7 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void m(b r29) {
        e r02 = this;
        if (r29 == null) goto L5;
        r02.d.position(r29.f32473j);
    L5:
        if (r29 != null) goto L8;
        c r1 = r02.f32501l;
        int r2 = r1.f32479f;
        int r12 = r1.f32480g;
    L7:
        int r22 = r2 * r12;
        byte[] r13 = r02.f32498i;
        if (r13 != null) goto L12;
    L13:
        r02.f32498i = r02.f32493c.a(r22);
    L14:
        byte[] r14 = r02.f32498i;
        if (r02.f32495f != null) goto L17;
        r02.f32495f = new short[4096];
    L17:
        short[] r3 = r02.f32495f;
        if (r02.f32496g != null) goto L20;
        r02.f32496g = new byte[4096];
    L20:
        byte[] r5 = r02.f32496g;
        if (r02.f32497h != null) goto L23;
        r02.f32497h = new byte[4097];
    L23:
        byte[] r6 = r02.f32497h;
        int r7 = r02.q();
        int r9 = 1 << r7;
        int r10 = r9 + 1;
        int r11 = r9 + 2;
        int r72 = r7 + 1;
        int r122 = (1 << r72) - 1;
        byte r132 = 0;
        int r142 = 0;
    L24:
        if (r142 >= r9) goto L26;
        r3[r142] = 0;
        r5[r142] = (byte) r142;
        r142 = r142 + 1;
        goto L24
    L26:
        byte[] r143 = r02.f32494e;
        int r23 = r72;
        int r21 = r11;
        int r24 = r122;
        int r8 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r25 = 0;
        int r26 = 0;
        int r222 = -1;
    L27:
        if (r8 >= r22) goto L63;
        if (r16 != 0) goto L34;
        r16 = r02.p();
        if (r16 <= 0) goto L31;
        r17 = r132;
        goto L34
    L31:
        r02.f32504o = 3;
    L34:
        r19 = r19 + ((r143[r17] & UnsignedBytes.MAX_VALUE) << r18);
        r17 = r17 + 1;
        r16 = r16 - 1;
        int r133 = r18 + 8;
        int r4 = r21;
        int r03 = r222;
        int r15 = r23;
        short[] r223 = r3;
        int r32 = r26;
    L35:
        byte[] r232 = r5;
        if (r133 < r15) goto L62;
        int r52 = r19 & r24;
        r19 = r19 >> r15;
        r133 = r133 - r15;
        if (r52 == r9) goto L39;
        if (r52 == r10) goto L41;
        byte[] r262 = r6;
        if (r03 == (-1)) goto L45;
        if (r52 < r4) goto L48;
        r262[r25] = (byte) r32;
        r25 = r25 + 1;
        short r33 = r03;
    L49:
        if (r33 < r9) goto L51;
        r262[r25] = r232[r33];
        r25 = r25 + 1;
        r33 = r223[r33];
        goto L49
    L51:
        int r34 = r232[r33] & UnsignedBytes.MAX_VALUE;
        byte r62 = (byte) r34;
        r14[r20] = r62;
    L52:
        r20 = r20 + 1;
        r8 = r8 + 1;
        if (r25 <= 0) goto L56;
        r25 = r25 - 1;
        r14[r20] = r262[r25];
        goto L52
    L56:
        if (r4 >= 4096) goto L61;
        r223[r4] = (short) r03;
        r232[r4] = r62;
        r4 = r4 + 1;
        if ((r4 & r24) != 0) goto L61;
        if (r4 >= 4096) goto L61;
        r15 = r15 + 1;
        r24 = r24 + r4;
    L61:
        r03 = r52;
        r5 = r232;
        r6 = r262;
        r32 = r34;
        goto L35
    L48:
        r33 = r52;
        goto L49
    L45:
        r14[r20] = r232[r52];
        r20 = r20 + 1;
        r8 = r8 + 1;
        r03 = r52;
        r32 = r03;
        r5 = r232;
        r6 = r262;
        goto L35
    L41:
        r26 = r32;
        r21 = r4;
    L42:
        r18 = r133;
        r3 = r223;
        r5 = r232;
        r132 = 0;
        r222 = r03;
        r23 = r15;
        r02 = this;
        goto L27
    L39:
        r15 = r72;
        r4 = r11;
        r24 = r122;
        r5 = r232;
        r03 = -1;
        goto L35
    L62:
        r21 = r4;
        r26 = r32;
    L63:
        Arrays.fill(r14, r20, r22, r132);
        return;
    L12:
        if (r13.length >= r22) goto L14;
    L8:
        r2 = r29.f32467c;
        r12 = r29.d;
        goto L7
    }

    public int n(int r3) {
        if (r3 < 0) goto L7;
        c r02 = this.f32501l;
        if (r3 < r02.f32477c) goto L6;
        return -1;
    L6:
        return ((b) r02.f32478e.get(r3)).f32472i;
    L7:
        return -1;
    }

    public final Bitmap o() {
        Boolean r02 = this.f32508s;
        if (r02 != null) goto L5;
    L8:
        Bitmap.Config r03 = Bitmap.Config.ARGB_8888;
    L9:
        Bitmap r04 = this.f32493c.b(this.f32507r, this.f32506q, r03);
        r04.setHasAlpha(true);
        return r04;
    L5:
        if (r02.booleanValue() == true) goto L8;
        r03 = this.f32509t;
        goto L9
    }

    public final int p() {
        int r02 = q();
        if (r02 > 0) goto L5;
        return r02;
    L5:
        ByteBuffer r1 = this.d;
        r1.get(this.f32494e, 0, Math.min(r02, r1.remaining()));
        return r02;
    }

    public final int q() {
        return this.d.get() & UnsignedBytes.MAX_VALUE;
    }

    public synchronized void r(c r3, ByteBuffer r4, int r5) {
        monitor-enter(this);
        if (r5 <= 0) goto L16;
        int r52 = Integer.highestOneBit(r5);     // Catch: Throwable -> L10
        this.f32504o = 0;     // Catch: Throwable -> L10
        this.f32501l = r3;     // Catch: Throwable -> L10
        this.f32500k = -1;     // Catch: Throwable -> L10
        ByteBuffer r42 = r4.asReadOnlyBuffer();     // Catch: Throwable -> L10
        this.d = r42;     // Catch: Throwable -> L10
        r42.position(0);     // Catch: Throwable -> L10
        this.d.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Throwable -> L10
        this.f32503n = false;     // Catch: Throwable -> L10
        Iterator r43 = r3.f32478e.iterator();     // Catch: Throwable -> L10
    L6:
        if (r43.hasNext() == false) goto L12;
        if (((b) r43.next()).f32470g != 3) goto L6;
        this.f32503n = true;     // Catch: Throwable -> L10
    L12:
        this.f32505p = r52;     // Catch: Throwable -> L10
        int r44 = r3.f32479f;     // Catch: Throwable -> L10
        this.f32507r = r44 / r52;     // Catch: Throwable -> L10
        int r32 = r3.f32480g;     // Catch: Throwable -> L10
        this.f32506q = r32 / r52;     // Catch: Throwable -> L10
        this.f32498i = this.f32493c.a(r44 * r32);     // Catch: Throwable -> L10
        this.f32499j = this.f32493c.c(this.f32507r * this.f32506q);     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L16:
        throw new IllegalArgumentException("Sample size must be >=0, not: " + r5);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public final Bitmap s(b r9, b r10) {
        int[] r1 = this.f32499j;
        int r02 = 0;
        if (r10 != null) goto L9;
        Bitmap r2 = this.f32502m;
        if (r2 == null) goto L7;
        this.f32493c.d(r2);
    L7:
        this.f32502m = null;
        Arrays.fill(r1, 0);
    L9:
        if (r10 != null) goto L11;
    L15:
        if (r10 == null) goto L38;
        int r3 = r10.f32470g;
        if (r3 <= 0) goto L38;
        if (r3 == 2) goto L21;
        if (r3 != 3) goto L38;
        Bitmap r03 = this.f32502m;
        if (r03 == null) goto L38;
        int r32 = this.f32507r;
        r03.getPixels(r1, 0, r32, 0, 0, r32, this.f32506q);
        goto L38
    L21:
        if (r9.f32469f == true) goto L28;
        c r22 = this.f32501l;
        int r33 = r22.f32485l;
        if (r9.f32474k != null) goto L25;
    L27:
        r02 = r33;
        goto L28
    L25:
        if (r22.f32483j != r9.f32471h) goto L27;
    L28:
        int r23 = r10.d;
        int r34 = this.f32505p;
        int r24 = r23 / r34;
        int r4 = r10.f32466b / r34;
        int r5 = r10.f32467c / r34;
        int r102 = r10.f32465a / r34;
        int r35 = this.f32507r;
        int r42 = (r4 * r35) + r102;
        int r25 = (r24 * r35) + r42;
    L29:
        if (r42 >= r25) goto L38;
        int r103 = r42 + r5;
        int r36 = r42;
    L31:
        if (r36 >= r103) goto L33;
        r1[r36] = r02;
        r36 = r36 + 1;
        goto L31
    L33:
        r42 = r42 + this.f32507r;
    L38:
        m(r9);
        if (r9.f32468e == false) goto L41;
    L44:
        k(r9);
    L46:
        if (this.f32503n == false) goto L54;
        int r92 = r9.f32470g;
        if (r92 == 0) goto L51;
        if (r92 != 1) goto L54;
    L51:
        if (this.f32502m != null) goto L53;
        this.f32502m = o();
    L53:
        Bitmap r04 = this.f32502m;
        int r37 = this.f32507r;
        r04.setPixels(r1, 0, r37, 0, 0, r37, this.f32506q);
    L54:
        Bitmap r05 = o();
        int r38 = this.f32507r;
        r05.setPixels(r1, 0, r38, 0, 0, r38, this.f32506q);
        return r05;
    L41:
        if (this.f32505p != 1) goto L44;
        l(r9);
        goto L46
    L11:
        if (r10.f32470g != 3) goto L15;
        if (this.f32502m != null) goto L15;
        Arrays.fill(r1, 0);
        goto L15
    }

    public e(a.InterfaceC0318a r2) {
        this.f32492b = new int[256];
        this.f32509t = Bitmap.Config.ARGB_8888;
        this.f32493c = r2;
        this.f32501l = new c();
    }
}
