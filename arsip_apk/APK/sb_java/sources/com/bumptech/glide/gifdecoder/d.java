package com.bumptech.glide.gifdecoder;

import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f32487a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f32488b;

    /* renamed from: c, reason: collision with root package name */
    public c f32489c;
    public int d;

    public d() {
        this.f32487a = new byte[256];
        this.d = 0;
    }

    public void a() {
        this.f32488b = null;
        this.f32489c = null;
    }

    public final boolean b() {
        if (this.f32489c.f32476b == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public c c() {
        if (this.f32488b == null) goto L16;
        if (b() == true) goto L7;
        k();
        if (b() == true) goto L14;
        h();
        c r02 = this.f32489c;
        if (r02.f32477c >= 0) goto L14;
        r02.f32476b = 1;
    L14:
        return this.f32489c;
    L7:
        return this.f32489c;
    L16:
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int d() {
        return this.f32488b.get() & UnsignedBytes.MAX_VALUE;
    L5:
        this.f32489c.f32476b = 1;
        return 0;
    }

    public final void e() {
        this.f32489c.d.f32465a = n();
        this.f32489c.d.f32466b = n();
        this.f32489c.d.f32467c = n();
        this.f32489c.d.d = n();
        int r02 = d();
        boolean r2 = false;
        if ((r02 & 128) == 0) goto L5;
        boolean r1 = true;
    L6:
        int r4 = (int) Math.pow(2.0d, (r02 & 7) + 1);
        b r5 = this.f32489c.d;
        if ((r02 & 64) == 0) goto L9;
        r2 = true;
    L9:
        r5.f32468e = r2;
        if (r1 == false) goto L12;
        r5.f32474k = g(r4);
    L13:
        this.f32489c.d.f32473j = this.f32488b.position();
        r();
        if (b() == false) goto L16;
        return;
    L16:
        c r03 = this.f32489c;
        r03.f32477c++;
        r03.f32478e.add(r03.d);
        return;
    L12:
        r5.f32474k = null;
        goto L13
    L5:
        r1 = false;
        goto L6
    }

    public final void f() {
        int r02 = d();
        this.d = r02;
        if (r02 <= 0) goto L18;
        int r03 = 0;
        int r1 = 0;
    L15:
        r1 = this.d;     // Catch: Exception -> L9
        if (r03 >= r1) goto L19;
        r1 = r1 - r03;     // Catch: Exception -> L9
        this.f32488b.get(this.f32487a, r03, r1);     // Catch: Exception -> L9
        r03 = r03 + r1;
        goto L15
    L19:
        return;
    L9:
        e = move-exception;
        if (Log.isLoggable("GifHeaderParser", 3) == false) goto L13;
        Log.d("GifHeaderParser", "Error Reading Block n: " + r03 + " count: " + r1 + " blockSize: " + this.d, e);
    L13:
        this.f32489c.f32476b = 1;
        return;
    }

    public final int[] g(int r10) {
        byte[] r02 = new byte[r10 * 3];
        int[] r1 = null;
        this.f32488b.get(r02);     // Catch: BufferUnderflowException -> L7
        r1 = new int[256];     // Catch: BufferUnderflowException -> L7
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r2 >= r10) goto L9;
        int r5 = r02[r3] & UnsignedBytes.MAX_VALUE;     // Catch: BufferUnderflowException -> L7
        int r6 = r3 + 2;     // Catch: BufferUnderflowException -> L7
        int r4 = r02[r3 + 1] & UnsignedBytes.MAX_VALUE;     // Catch: BufferUnderflowException -> L7
        r3 = r3 + 3;     // Catch: BufferUnderflowException -> L7
        int r7 = r2 + 1;     // Catch: BufferUnderflowException -> L7
        r1[r2] = ((r4 << 8) | ((r5 << 16) | (-16777216))) | (r02[r6] & UnsignedBytes.MAX_VALUE);     // Catch: BufferUnderflowException -> L7
        r2 = r7;
        goto L4
    L9:
        return r1;
    L7:
        e = move-exception;
        if (Log.isLoggable("GifHeaderParser", 3) == false) goto L13;
        Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
    L13:
        this.f32489c.f32476b = 1;
        return r1;
    }

    public final void h() {
        i(Integer.MAX_VALUE);
    }

    public final void i(int r6) {
        boolean r1 = false;
    L3:
        if (r1 == true) goto L40;
        if (b() == true) goto L71;
        if (this.f32489c.f32477c > r6) goto L72;
        int r2 = d();
        if (r2 != 33) goto L11;
        int r22 = d();
        if (r22 != 1) goto L23;
        q();
        goto L3
    L23:
        if (r22 != 249) goto L25;
        this.f32489c.d = new b();
        j();
        goto L3
    L25:
        if (r22 != 254) goto L27;
        q();
        goto L3
    L27:
        if (r22 != 255) goto L28;
        f();
        StringBuilder r23 = new StringBuilder();
        int r3 = 0;
    L31:
        if (r3 >= 11) goto L34;
        r23.append((char) this.f32487a[r3]);
        r3 = r3 + 1;
        goto L31
    L34:
        if (r23.toString().equals("NETSCAPE2.0") == true) goto L35;
        q();
        goto L3
    L35:
        m();
        goto L3
    L28:
        q();
        goto L3
    L11:
        if (r2 != 44) goto L13;
        c r24 = this.f32489c;
        if (r24.d != null) goto L19;
        r24.d = new b();
    L19:
        e();
        goto L3
    L13:
        if (r2 != 59) goto L14;
        r1 = true;
        goto L3
    L14:
        this.f32489c.f32476b = 1;
        goto L3
    L72:
        return;
    L71:
        return;
    }

    public final void j() {
        d();
        int r02 = d();
        b r1 = this.f32489c.d;
        int r2 = (r02 & 28) >> 2;
        r1.f32470g = r2;
        boolean r4 = true;
        if (r2 != 0) goto L6;
        r1.f32470g = 1;
    L6:
        if ((r02 & 1) != 0) goto L9;
        r4 = false;
    L9:
        r1.f32469f = r4;
        int r03 = n();
        if (r03 >= 2) goto L12;
        r03 = 10;
    L12:
        b r22 = this.f32489c.d;
        r22.f32472i = r03 * 10;
        r22.f32471h = d();
        d();
    }

    public final void k() {
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= 6) goto L7;
        r02.append((char) d());
        r1 = r1 + 1;
        goto L4
    L7:
        if (r02.toString().startsWith("GIF") == true) goto L10;
        this.f32489c.f32476b = 1;
        return;
    L10:
        l();
        if (this.f32489c.f32481h == true) goto L13;
        return;
    L13:
        if (b() == true) goto L18;
        c r03 = this.f32489c;
        r03.f32475a = g(r03.f32482i);
        c r04 = this.f32489c;
        r04.f32485l = r04.f32475a[r04.f32483j];
        return;
    }

    public final void l() {
        this.f32489c.f32479f = n();
        this.f32489c.f32480g = n();
        int r02 = d();
        c r1 = this.f32489c;
        if ((r02 & 128) == 0) goto L5;
        boolean r2 = true;
    L6:
        r1.f32481h = r2;
        r1.f32482i = (int) Math.pow(2.0d, (r02 & 7) + 1);
        this.f32489c.f32483j = d();
        this.f32489c.f32484k = d();
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void m() {
    L2:
        f();
        byte[] r02 = this.f32487a;
        if (r02[0] != 1) goto L6;
        int r1 = r02[1] & UnsignedBytes.MAX_VALUE;
        int r03 = r02[2] & UnsignedBytes.MAX_VALUE;
        int r04 = (r03 << 8) | r1;
        this.f32489c.f32486m = r04;
    L6:
        if (this.d <= 0) goto L9;
        if (b() == false) goto L2;
        return;
    }

    public final int n() {
        return this.f32488b.getShort();
    }

    public final void o() {
        this.f32488b = null;
        Arrays.fill(this.f32487a, (byte) 0);
        this.f32489c = new c();
        this.d = 0;
    }

    public d p(ByteBuffer r2) {
        o();
        ByteBuffer r22 = r2.asReadOnlyBuffer();
        this.f32488b = r22;
        r22.position(0);
        this.f32488b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void q() {
    L2:
        int r02 = d();
        int r1 = Math.min(this.f32488b.position() + r02, this.f32488b.limit());
        this.f32488b.position(r1);
        if (r02 > 0) goto L2;
    }

    public final void r() {
        d();
        q();
    }
}
