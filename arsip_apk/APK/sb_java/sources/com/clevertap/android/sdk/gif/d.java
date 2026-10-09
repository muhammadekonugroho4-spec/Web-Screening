package com.clevertap.android.sdk.gif;

import com.clevertap.android.sdk.Logger;
import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33961a;

    /* renamed from: b, reason: collision with root package name */
    public int f33962b;

    /* renamed from: c, reason: collision with root package name */
    public c f33963c;
    public ByteBuffer d;

    public d() {
        this.f33961a = new byte[256];
        this.f33962b = 0;
    }

    public final boolean a() {
        if (this.f33963c.f33959l == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public c b() {
        if (this.d == null) goto L16;
        if (a() == true) goto L7;
        j();
        if (a() == true) goto L14;
        g();
        c r02 = this.f33963c;
        if (r02.d >= 0) goto L14;
        r02.f33959l = 1;
    L14:
        return this.f33963c;
    L7:
        return this.f33963c;
    L16:
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        return this.d.get() & UnsignedBytes.MAX_VALUE;
    L5:
        this.f33963c.f33959l = 1;
        return 0;
    }

    public final void d() {
        this.f33963c.f33951c.f33942e = m();
        this.f33963c.f33951c.f33943f = m();
        this.f33963c.f33951c.f33944g = m();
        this.f33963c.f33951c.f33945h = m();
        int r02 = c();
        boolean r2 = false;
        if ((r02 & 128) == 0) goto L5;
        boolean r1 = true;
    L6:
        int r4 = (int) Math.pow(2.0d, (r02 & 7) + 1);
        b r5 = this.f33963c.f33951c;
        if ((r02 & 64) == 0) goto L9;
        r2 = true;
    L9:
        r5.d = r2;
        if (r1 == false) goto L12;
        r5.f33946i = f(r4);
    L13:
        this.f33963c.f33951c.f33939a = this.d.position();
        r();
        if (a() == false) goto L16;
        return;
    L16:
        c r03 = this.f33963c;
        r03.d++;
        r03.f33952e.add(r03.f33951c);
        return;
    L12:
        r5.f33946i = null;
        goto L13
    L5:
        r1 = false;
        goto L6
    }

    public final int e() {
        int r02 = c();
        this.f33962b = r02;
        int r1 = 0;
        if (r02 > 0) goto L10;
    L9:
        return r1;
    L10:
        int r03 = this.f33962b;     // Catch: Exception -> L8
        if (r1 >= r03) goto L9;
        int r04 = r03 - r1;     // Catch: Exception -> L8
        this.d.get(this.f33961a, r1, r04);     // Catch: Exception -> L8
        r1 = r1 + r04;
    L8:
        this.f33963c.f33959l = 1;
        goto L9
    }

    public final int[] f(int r10) {
        byte[] r02 = new byte[r10 * 3];
        int[] r1 = null;
        this.d.get(r02);     // Catch: BufferUnderflowException -> L7
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
        Logger.d("GifHeaderParser", "Format Error Reading Color Table", e);
        this.f33963c.f33959l = 1;
        return r1;
    }

    public final void g() {
        h(Integer.MAX_VALUE);
    }

    public final void h(int r6) {
        boolean r1 = false;
    L3:
        if (r1 == true) goto L40;
        if (a() == true) goto L71;
        if (this.f33963c.d > r6) goto L72;
        int r2 = c();
        if (r2 != 33) goto L11;
        int r22 = c();
        if (r22 != 1) goto L23;
        q();
        goto L3
    L23:
        if (r22 != 249) goto L25;
        this.f33963c.f33951c = new b();
        i();
        goto L3
    L25:
        if (r22 != 254) goto L27;
        q();
        goto L3
    L27:
        if (r22 != 255) goto L28;
        e();
        String r23 = "";
        int r3 = 0;
    L31:
        if (r3 >= 11) goto L34;
        r23 = r23 + ((char) this.f33961a[r3]);
        r3 = r3 + 1;
        goto L31
    L34:
        if (r23.equals("NETSCAPE2.0") == true) goto L35;
        q();
        goto L3
    L35:
        l();
        goto L3
    L28:
        q();
        goto L3
    L11:
        if (r2 != 44) goto L13;
        c r24 = this.f33963c;
        if (r24.f33951c != null) goto L19;
        r24.f33951c = new b();
    L19:
        d();
        goto L3
    L13:
        if (r2 != 59) goto L14;
        r1 = true;
        goto L3
    L14:
        this.f33963c.f33959l = 1;
        goto L3
    L72:
        return;
    L71:
        return;
    }

    public final void i() {
        c();
        int r02 = c();
        b r1 = this.f33963c.f33951c;
        int r2 = (r02 & 28) >> 2;
        r1.f33941c = r2;
        boolean r4 = true;
        if (r2 != 0) goto L6;
        r1.f33941c = 1;
    L6:
        if ((r02 & 1) != 0) goto L9;
        r4 = false;
    L9:
        r1.f33948k = r4;
        int r03 = m();
        if (r03 >= 2) goto L12;
        r03 = 10;
    L12:
        b r22 = this.f33963c.f33951c;
        r22.f33940b = r03 * 10;
        r22.f33947j = c();
        c();
    }

    public final void j() {
        String r02 = "";
        int r1 = 0;
    L4:
        if (r1 >= 6) goto L7;
        r02 = r02 + ((char) c());
        r1 = r1 + 1;
        goto L4
    L7:
        if (r02.startsWith("GIF") == true) goto L10;
        this.f33963c.f33959l = 1;
        return;
    L10:
        k();
        if (this.f33963c.f33954g == true) goto L13;
        return;
    L13:
        if (a() == true) goto L18;
        c r03 = this.f33963c;
        r03.f33953f = f(r03.f33955h);
        c r04 = this.f33963c;
        r04.f33949a = r04.f33953f[r04.f33950b];
        return;
    }

    public final void k() {
        c r02 = this.f33963c;
        r02.f33960m = m();
        c r03 = this.f33963c;
        r03.f33956i = m();
        int r04 = c();
        c r1 = this.f33963c;
        if ((r04 & 128) == 0) goto L5;
        boolean r2 = true;
    L6:
        r1.f33954g = r2;
        r1.f33955h = 2 << (r04 & 7);
        r1.f33950b = c();
        c r05 = this.f33963c;
        r05.f33958k = c();
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void l() {
    L2:
        e();
        byte[] r02 = this.f33961a;
        if (r02[0] != 1) goto L8;
        int r1 = r02[1] & UnsignedBytes.MAX_VALUE;
        int r03 = r02[2] & UnsignedBytes.MAX_VALUE;
        c r2 = this.f33963c;
        int r04 = (r03 << 8) | r1;
        r2.f33957j = r04;
        if (r04 != 0) goto L8;
        r2.f33957j = -1;
    L8:
        if (this.f33962b <= 0) goto L11;
        if (a() == false) goto L2;
        return;
    }

    public final int m() {
        return this.d.getShort();
    }

    public final void n() {
        this.d = null;
        Arrays.fill(this.f33961a, (byte) 0);
        this.f33963c = new c();
        this.f33962b = 0;
    }

    public d o(ByteBuffer r2) {
        n();
        ByteBuffer r22 = r2.asReadOnlyBuffer();
        this.d = r22;
        r22.position(0);
        this.d.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public d p(byte[] r2) {
        if (r2 == null) goto L5;
        o(ByteBuffer.wrap(r2));
        return this;
    L5:
        this.d = null;
        this.f33963c.f33959l = 2;
        return this;
    }

    public final void q() {
    L6:
        int r02 = c();     // Catch: IllegalArgumentException -> L5
        ByteBuffer r1 = this.d;     // Catch: IllegalArgumentException -> L5
        r1.position(r1.position() + r02);     // Catch: IllegalArgumentException -> L5
        if (r02 > 0) goto L6;
        return;
    }

    public final void r() {
        c();
        q();
    }
}
