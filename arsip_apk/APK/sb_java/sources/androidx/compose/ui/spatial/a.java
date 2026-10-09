package androidx.compose.ui.spatial;

import com.google.common.primitives.Longs;
import java.util.Arrays;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long[] f19585a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f19586b;

    /* renamed from: c, reason: collision with root package name */
    public int f19587c;

    static {
    }

    public a() {
        this.f19585a = new long[192];
        this.f19586b = new long[192];
    }

    public static /* synthetic */ void f(a r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9, boolean r10, boolean r11, int r12, int r13, Object r14) {
        if ((r13 & 32) == 0) goto L6;
        r8 = -1;
    L6:
        if ((r13 & 64) == 0) goto L9;
        r9 = false;
    L9:
        if ((r13 & 128) == 0) goto L12;
        r10 = false;
    L12:
        if ((r13 & 256) == 0) goto L15;
        r11 = false;
    L15:
        if ((r13 & 512) == 0) goto L17;
        r12 = -1;
    L17:
        r2.e(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    public final void a() {
        long[] r02 = this.f19585a;
        int r1 = this.f19587c;
        int r2 = 0;
    L4:
        if (r2 >= (r02.length - 2)) goto L7;
        if (r2 >= r1) goto L10;
        int r3 = r2 + 2;
        r02[r3] = r02[r3] & (-1152921504606846977L);
        r2 = r2 + 3;
        goto L4
    L10:
        return;
    }

    public final void b() {
        long[] r02 = this.f19585a;
        int r1 = this.f19587c;
        long[] r2 = this.f19586b;
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r3 >= (r02.length - 2)) goto L12;
        if (r4 >= (r2.length - 2)) goto L12;
        if (r3 >= r1) goto L12;
        int r5 = r3 + 2;
        if (r02[r5] == b.c()) goto L11;
        r2[r4] = r02[r3];
        r2[r4 + 1] = r02[r3 + 1];
        r2[r4 + 2] = r02[r5];
        r4 = r4 + 3;
    L11:
        r3 = r3 + 3;
    L12:
        this.f19587c = r4;
        this.f19585a = r2;
        this.f19586b = r02;
    }

    public final int c() {
        return this.f19587c / 3;
    }

    public final long d(int r7) {
        int r72 = r7 & 33554431;
        long[] r1 = this.f19585a;
        int r2 = this.f19587c;
        int r3 = 0;
    L4:
        if (r3 >= (r1.length - 2)) goto L11;
        if (r3 >= r2) goto L16;
        if ((((int) r1[r3 + 2]) & 33554431) == r72) goto L9;
        r3 = r3 + 3;
        goto L4
    L9:
        return r1[r3];
    L16:
        return Long.MAX_VALUE;
    L11:
        return Long.MAX_VALUE;
    }

    public final void e(int r11, int r12, int r13, int r14, int r15, int r16, boolean r17, boolean r18, boolean r19, int r20) {
        long[] r02 = this.f19585a;
        int r1 = this.f19587c;
        int r2 = r1 + 3;
        this.f19587c = r2;
        int r3 = r02.length;
        if (r3 > r2) goto L5;
        l(r3, r1, r02);
    L5:
        long[] r03 = this.f19585a;
        r03[r1] = (r12 << 32) | (r13 & 4294967295L);
        r03[r1 + 1] = (r14 << 32) | (r15 & 4294967295L);
        int r6 = r16 & 33554431;
        r03[r1 + 2] = (((((((r19 ? 1 : 0) << 63) | ((r18 ? 1 : 0) << 62)) | ((r17 ? 1 : 0) << 61)) | (1 << 60)) | (Math.min(0, 1023) << 50)) | (r6 << 25)) | (r11 & 33554431);
        if (r16 >= 0) goto L9;
        return;
    L9:
        if (r20 == (-1)) goto L11;
        int r112 = r20;
    L12:
        if (r112 < 0) goto L22;
        int r122 = r112 + 2;
        long r22 = r03[r122];
        if ((((int) r22) & 33554431) == r6) goto L15;
        r112 = r112 - 3;
        goto L12
    L15:
        r03[r122] = (r22 & b.a()) | (Math.min((r1 - r112) / 3, 1023) << 50);
        return;
    L22:
        return;
    L11:
        r112 = r1 - 3;
        goto L12
    }

    public final void g(int r12, int r13, int r14, int r15, int r16, int r17, boolean r18, boolean r19, boolean r20) {
        int r2 = r12 & 33554431;
        long[] r3 = this.f19585a;
        int r4 = this.f19587c;
        int r10 = 0;
    L4:
        if (r10 >= (r3.length - 2)) goto L11;
        if (r10 >= r4) goto L15;
        if ((((int) r3[r10 + 2]) & 33554431) == r13) goto L8;
        r10 = r10 + 3;
        goto L4
    L8:
        long r42 = r3[r10];
        int r1 = ((int) (r42 >> 32)) + r14;
        int r32 = ((int) r42) + r15;
        e(r2, r1, r32, r1 + r16, r32 + r17, r13, r18, r19, r20, r10);
        return;
    L15:
        return;
    }

    public final void h(int r10) {
        int r102 = r10 & 33554431;
        long[] r1 = this.f19585a;
        int r2 = this.f19587c;
        int r3 = 0;
    L4:
        if (r3 >= (r1.length - 2)) goto L11;
        if (r3 >= r2) goto L15;
        int r4 = r3 + 2;
        long r5 = r1[r4];
        if ((((int) r5) & 33554431) == r102) goto L8;
        r3 = r3 + 3;
        goto L4
    L8:
        r1[r4] = (((r5 >> 63) & 1) << 60) | r5;
        return;
    L15:
        return;
    }

    public final void i(int r21, int r22, int r23, int r24, int r25) {
        int r4 = r21 & 33554431;
        long[] r5 = this.f19585a;
        int r6 = this.f19587c;
        int r8 = 0;
    L4:
        if (r8 >= (r5.length - 2)) goto L24;
        if (r8 >= r6) goto L25;
        int r9 = r8 + 2;
        long r10 = r5[r9];
        if ((((int) r10) & 33554431) == r4) goto L8;
        r8 = r8 + 3;
        goto L4
    L8:
        long r12 = r5[r8];
        r5[r8] = (r23 & 4294967295L) | (r22 << 32);
        int r19 = r8;
        r5[r8 + 1] = (r25 & 4294967295L) | (r24 << 32);
        r5[r9] = (((r10 >> 63) & 1) << 60) | r10;
        int r1 = r22 - ((int) (r12 >> 32));
        int r2 = r23 - ((int) r12);
        if (r1 == 0) goto L11;
        boolean r42 = true;
    L12:
        if (r2 == 0) goto L14;
        boolean r7 = true;
    L16:
        if ((r42 | r7) == false) goto L20;
        p((b.b() & r10) | (((r19 + 3) & 33554431) << 25), r1, r2);
        return;
    L20:
        return;
    L14:
        r7 = false;
        goto L16
    L11:
        r42 = false;
        goto L12
    L25:
        return;
    }

    public final void j(int r20, int r21, int r22, int r23, int r24, int r25) {
        int r1 = 33554431;
        int r2 = r20 & 33554431;
        long[] r3 = this.f19585a;
        int r4 = this.f19587c;
        int r5 = 0;
    L4:
        if (r5 >= (r3.length - 2)) goto L28;
        if (r5 >= r4) goto L29;
        if ((((int) r3[r5 + 2]) & r1) != r21) goto L20;
        long r8 = r3[r5];
        int r10 = ((int) (r8 >> 32)) + r22;
        int r82 = ((int) r8) + r23;
        int r9 = r10 + r24;
        int r11 = r82 + r25;
    L9:
        r5 = r5 + 3;
        if (r5 >= (r3.length - 2)) goto L20;
        if (r5 >= r4) goto L20;
        int r12 = r5 + 2;
        long r13 = r3[r12];
        if ((((int) r13) & r1) != r2) goto L9;
        int r15 = r1;
        long r14 = r3[r5];
        int r26 = r10 - ((int) (r14 >> 32));
        int r16 = r82 - ((int) r14);
        long[] r162 = r3;
        r162[r5] = (r82 & 4294967295L) | (r10 << 32);
        r162[r5 + 1] = (r9 << 32) | (r11 & 4294967295L);
        r162[r12] = (((r13 >> 63) & 1) << 60) | r13;
        if (r26 != 0) goto L17;
        if (r16 != 0) goto L17;
        return;
    L17:
        p((b.b() & r13) | (((r5 + 3) & r15) << 25), r26, r16);
        return;
    L20:
        r5 = r5 + 3;
        r1 = r1;
        r3 = r3;
        goto L4
    L29:
        return;
    }

    public final boolean k(int r9) {
        int r92 = r9 & 33554431;
        long[] r1 = this.f19585a;
        int r2 = this.f19587c;
        int r4 = 0;
    L4:
        if (r4 >= (r1.length - 2)) goto L11;
        if (r4 >= r2) goto L11;
        int r5 = r4 + 2;
        if ((((int) r1[r5]) & 33554431) == r92) goto L8;
        r4 = r4 + 3;
        goto L4
    L8:
        r1[r4] = -1;
        r1[r4 + 1] = -1;
        r1[r5] = b.c();
        return true;
    L11:
        return false;
    }

    public final void l(int r1, int r2, long[] r3) {
        int r12 = Math.max(r1 * 2, r2 + 3);
        long[] r22 = Arrays.copyOf(r3, r12);
        p.k(r22, "copyOf(...)");
        this.f19585a = r22;
        long[] r13 = Arrays.copyOf(this.f19586b, r12);
        p.k(r13, "copyOf(...)");
        this.f19586b = r13;
    }

    public final boolean m(int r11, int r12, int r13, int r14, int r15) {
        int r112 = r11 & 33554431;
        long[] r1 = this.f19585a;
        int r2 = this.f19587c;
        int r4 = 0;
    L4:
        if (r4 >= (r1.length - 2)) goto L11;
        if (r4 >= r2) goto L11;
        int r5 = r4 + 2;
        long r6 = r1[r5];
        if ((((int) r6) & 33554431) == r112) goto L8;
        r4 = r4 + 3;
        goto L4
    L8:
        r1[r4] = (r12 << 32) | (r13 & 4294967295L);
        r1[r4 + 1] = (r14 << 32) | (r15 & 4294967295L);
        r1[r5] = (((r6 >> 63) & 1) << 60) | r6;
        return true;
    L11:
        return false;
    }

    public final boolean n(int r10, boolean r11, boolean r12) {
        int r102 = r10 & 33554431;
        long[] r1 = this.f19585a;
        int r2 = this.f19587c;
        int r4 = 0;
    L4:
        if (r4 >= (r1.length - 2)) goto L11;
        if (r4 >= r2) goto L11;
        int r5 = r4 + 2;
        long r6 = r1[r5];
        if ((((int) r6) & 33554431) == r102) goto L8;
        r4 = r4 + 3;
        goto L4
    L8:
        r1[r5] = (((r11 ? 1 : 0) * LockFreeTaskQueueCore.CLOSED_MASK) | ((-6917529027641081857L) & r6)) | ((r12 ? 1 : 0) * Longs.MAX_POWER_OF_TWO);
        return true;
    L11:
        return false;
    }

    public final boolean o(int r11, boolean r12) {
        int r112 = r11 & 33554431;
        long[] r1 = this.f19585a;
        int r2 = this.f19587c;
        int r4 = 0;
    L4:
        if (r4 >= (r1.length - 2)) goto L11;
        if (r4 >= r2) goto L11;
        int r5 = r4 + 2;
        long r6 = r1[r5];
        if ((((int) r6) & 33554431) == r112) goto L8;
        r4 = r4 + 3;
        goto L4
    L8:
        r1[r5] = ((r12 ? 1 : 0) * Long.MIN_VALUE) | ((8070450532247928831L & r6) | ((r12 ? 1 : 0) * LockFreeTaskQueueCore.FROZEN_MASK));
        return true;
    L11:
        return false;
    }

    public final void p(long r23, int r25, int r26) {
        long[] r1 = this.f19585a;
        long[] r2 = this.f19586b;
        c();
        r2[0] = r23;
        int r3 = 1;
    L3:
        if (r3 <= 0) goto L19;
        r3 = r3 - 1;
        long r4 = r2[r3];
        int r7 = 33554431;
        int r6 = ((int) r4) & 33554431;
        char r8 = 25;
        int r9 = ((int) (r4 >> 25)) & 33554431;
        char r10 = '2';
        int r42 = ((int) (r4 >> 50)) & 1023;
        if (r42 != 1023) goto L7;
        int r43 = this.f19587c;
    L8:
        if (r9 < 0) goto L28;
    L10:
        if (r9 >= (r1.length - 2)) goto L3;
        if (r9 >= r43) goto L3;
        int r11 = r9 + 2;
        long r12 = r1[r11];
        if ((((int) (r12 >> r8)) & r7) != r6) goto L17;
        long r14 = r1[r9];
        int r16 = r9 + 1;
        int r232 = r7;
        char r24 = r8;
        long r72 = r1[r16];
        char r18 = r10;
        int r112 = ((int) r14) + r26;
        r1[r9] = (r112 & 4294967295L) | ((((int) (r14 >> 32)) + r25) << 32);
        int r102 = ((int) (r72 >> 32)) + r25;
        r1[r16] = ((((int) r72) + r26) & 4294967295L) | (r102 << 32);
        r1[r11] = (((r12 >> 63) & 1) << 60) | r12;
        if ((((int) (r12 >> r18)) & 1023) <= 0) goto L18;
        r2[r3] = (b.b() & r12) | (((r9 + 3) & r232) << r24);
        r3 = r3 + 1;
    L18:
        r9 = r9 + 3;
        r7 = r232;
        r8 = r24;
        r10 = r18;
        goto L10
    L17:
        r232 = r7;
        r24 = r8;
        r18 = r10;
        goto L18
    L28:
        return;
    L7:
        r43 = (r42 * 3) + r9;
        goto L8
    }

    public final boolean q(int r8, r r9) {
        int r82 = r8 & 33554431;
        long[] r1 = this.f19585a;
        int r2 = this.f19587c;
        int r4 = 0;
    L4:
        if (r4 >= (r1.length - 2)) goto L11;
        if (r4 >= r2) goto L11;
        if ((((int) r1[r4 + 2]) & 33554431) == r82) goto L8;
        r4 = r4 + 3;
        goto L4
    L8:
        long r22 = r1[r4];
        long r02 = r1[r4 + 1];
        r9.invoke(Integer.valueOf((int) (r22 >> 32)), Integer.valueOf((int) r22), Integer.valueOf((int) (r02 >> 32)), Integer.valueOf((int) r02));
        return true;
    L11:
        return false;
    }
}
