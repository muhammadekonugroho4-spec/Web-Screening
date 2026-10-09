package androidx.compose.runtime;

import java.util.Arrays;

/* renamed from: androidx.compose.runtime.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3390e {

    /* renamed from: a, reason: collision with root package name */
    public long f16164a;

    /* renamed from: b, reason: collision with root package name */
    public long f16165b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f16166c;

    static {
    }

    public C3390e() {
        this.f16166c = J1.c();
    }

    public final boolean a(int r11) {
        if (r11 >= 64) goto L9;
        if (((1 << r11) & this.f16164a) == 0) goto L7;
        return true;
    L7:
        return false;
    L9:
        if (r11 < 128) goto L11;
        long[] r7 = this.f16166c;
        int r8 = r7.length;
        if (r8 != 0) goto L17;
        return false;
    L17:
        int r9 = (r11 / 64) - 2;
        if (r9 < r8) goto L21;
        return false;
    L21:
        if (((1 << (r11 % 64)) & r7[r9]) == 0) goto L23;
        return true;
    L23:
        return false;
    L11:
        if (((1 << (r11 - 64)) & this.f16165b) == 0) goto L13;
        return true;
    L13:
        return false;
    }

    public final int b() {
        return (this.f16166c.length + 2) * 64;
    }

    public final int c(int r10) {
        if (r10 >= 64) goto L8;
        int r1 = Long.numberOfTrailingZeros(((~this.f16164a) >>> r10) << r10);
        if (r1 >= 64) goto L8;
        return r1;
    L8:
        if (r10 >= 128) goto L13;
        int r2 = r10 - 64;
        int r22 = Long.numberOfTrailingZeros(((~this.f16165b) >>> r2) << r2);
        if (r22 >= 64) goto L13;
        return r22 + 64;
    L13:
        int r102 = Math.max(r10, 128);
        int r23 = (r102 / 64) - 2;
        long[] r3 = this.f16166c;
        int r4 = r3.length;
        int r5 = r23;
    L14:
        if (r5 >= r4) goto L23;
        long r6 = ~r3[r5];
        if (r5 != r23) goto L18;
        int r8 = r102 % 64;
        r6 = (r6 >>> r8) << r8;
    L18:
        int r62 = Long.numberOfTrailingZeros(r6);
        if (r62 < 64) goto L21;
        r5 = r5 + 1;
        goto L14
    L21:
        return ((r5 * 64) + 128) + r62;
    L23:
        return Integer.MAX_VALUE;
    }

    public final void d(int r8, boolean r9) {
        if (r8 >= 64) goto L7;
        this.f16164a = ((r9 ? 1 : 0) << r8) | ((~(1 << r8)) & this.f16164a);
        return;
    L7:
        if (r8 >= 128) goto L10;
        long r2 = this.f16165b;
        this.f16165b = ((r9 ? 1 : 0) << r8) | ((~(1 << (r8 - 64))) & r2);
        return;
    L10:
        int r3 = r8 / 64;
        int r4 = r3 - 2;
        int r82 = r8 % 64;
        long r02 = 1 << r82;
        long[] r22 = this.f16166c;
        if (r4 < r22.length) goto L13;
        r22 = Arrays.copyOf(r22, r3 - 1);
        kotlin.jvm.internal.p.k(r22, "copyOf(...)");
        this.f16166c = r22;
    L13:
        r22[r4] = ((r9 ? 1 : 0) << r82) | ((~r02) & r22[r4]);
    }

    public final void e(int r10, int r11) {
        if (r10 >= r11) goto L4;
        long r02 = -1;
    L5:
        int r2 = 0;
        if (r10 >= 64) goto L8;
        int r5 = 1;
    L9:
        this.f16164a = (((r5 * r02) >>> (64 - (Math.min(64, r11) - r10))) << r10) | this.f16164a;
        if (r11 <= 64) goto L19;
        int r102 = Math.max(r10, 64);
        if (r102 >= 128) goto L14;
        r2 = 1;
    L14:
        this.f16165b = (((r02 * r2) >>> (128 - (Math.min(128, r11) - r102))) << r102) | this.f16165b;
        if (r11 <= 128) goto L21;
        int r103 = Math.max(r102, 128);
    L17:
        if (r103 >= r11) goto L22;
        d(r103, true);
        r103 = r103 + 1;
        goto L17
    L22:
        return;
    L21:
        return;
    L19:
        return;
    L8:
        r5 = 0;
        goto L9
    L4:
        r02 = 0;
        goto L5
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("BitVector [");
        int r1 = b();
        boolean r2 = true;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L10;
        if (a(r4) == false) goto L9;
        if (r2 == true) goto L8;
        r02.append(", ");
    L8:
        r02.append(r4);
        r2 = false;
    L9:
        r4 = r4 + 1;
        goto L3
    L10:
        r02.append(']');
        String r03 = r02.toString();
        kotlin.jvm.internal.p.k(r03, "toString(...)");
        return r03;
    }
}
