package com.fingerprintjs.android.fingerprint.tools.hashers;

import com.google.firebase.messaging.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.p;
import kotlin.text.C11850c;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f37328a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37329b;

    public b() {
        this.f37328a = -8663945395140668459L;
        this.f37329b = 5545529020109919103L;
    }

    public static /* synthetic */ long[] d(b r02, byte[] r1, int r2, long r3, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = 0;
    L6:
        return r02.c(r1, r2, r3);
    }

    @Override // com.fingerprintjs.android.fingerprint.tools.hashers.a
    public String a(String r9) {
        p.l(r9, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        byte[] r2 = r9.getBytes(C11850c.f180365f);
        p.k(r2, "this as java.lang.String).getBytes(charset)");
        long[] r92 = d(this, r2, r9.length(), 0, 4, null);
        StringBuilder r02 = new StringBuilder();
        int r1 = r92.length;
        int r22 = 0;
    L3:
        if (r22 >= r1) goto L5;
        r02.append(Long.toHexString(r92[r22]));
        r22 = r22 + 1;
        goto L3
    L5:
        String r93 = r02.toString();
        p.k(r93, "hashSb.toString()");
        return r93;
    }

    public final long b(long r4) {
        long r42 = (r4 ^ (r4 >>> 33)) * (-49064778989728563L);
        long r43 = (r42 ^ (r42 >>> 33)) * (-4265267296055464877L);
        return r43 ^ (r43 >>> 33);
    }

    public final long[] c(byte[] r26, int r27, long r28) {
        ByteBuffer r4 = ByteBuffer.wrap(r26);
        r4.order(ByteOrder.LITTLE_ENDIAN);
        long r5 = r28;
        long r7 = r5;
    L4:
        if (r4.remaining() < 16) goto L6;
        long r11 = r4.getLong();
        long r13 = r4.getLong();
        long r9 = 5;
        r5 = ((Long.rotateLeft(r5 ^ e(r11), 27) + r7) * r9) + 1390208809;
        r7 = ((Long.rotateLeft(r7 ^ f(r13), 31) + r5) * r9) + 944331445;
        goto L4
    L6:
        r4.compact();
        r4.flip();
        if (r4.remaining() <= 0) goto L32;
        long r23 = 0;
        switch(r4.remaining()) {
            case 1: goto L30;
            case 2: goto L29;
            case 3: goto L27;
            case 4: goto L26;
            case 5: goto L25;
            case 6: goto L24;
            case 7: goto L21;
            case 8: goto L20;
            case 9: goto L19;
            case 10: goto L18;
            case 11: goto L17;
            case 12: goto L16;
            case 13: goto L15;
            case 14: goto L14;
            case 15: goto L12;
            default: goto L11;
        };
    L12:
        r23 = (((r4.get(9) & 255) << 8) ^ ((((((r4.get(14) & 255) << 48) ^ ((r4.get(13) & 255) << 40)) ^ ((r4.get(12) & 255) << 32)) ^ ((r4.get(11) & 255) << 24)) ^ ((r4.get(10) & 255) << 16))) ^ (r4.get(8) & 255);
        long r1 = r4.getLong();
    L13:
        long r3 = r23;
        r5 = r5 ^ e(r1);
        r7 = r7 ^ f(r3);
        goto L32
    L14:
        r23 = (((r4.get(9) & 255) << 8) ^ (((((r4.get(13) & 255) << 40) ^ ((r4.get(12) & 255) << 32)) ^ ((r4.get(11) & 255) << 24)) ^ ((r4.get(10) & 255) << 16))) ^ (r4.get(8) & 255);
        r1 = r4.getLong();
        goto L13
    L15:
        r23 = (((r4.get(9) & 255) << 8) ^ ((((r4.get(12) & 255) << 32) ^ ((r4.get(11) & 255) << 24)) ^ ((r4.get(10) & 255) << 16))) ^ (r4.get(8) & 255);
        r1 = r4.getLong();
        goto L13
    L16:
        r23 = (((r4.get(9) & 255) << 8) ^ (((r4.get(11) & 255) << 24) ^ ((r4.get(10) & 255) << 16))) ^ (r4.get(8) & 255);
        r1 = r4.getLong();
        goto L13
    L17:
        r23 = (((r4.get(9) & 255) << 8) ^ ((r4.get(10) & 255) << 16)) ^ (r4.get(8) & 255);
        r1 = r4.getLong();
        goto L13
    L18:
        r23 = ((r4.get(9) & 255) << 8) ^ (r4.get(8) & 255);
        r1 = r4.getLong();
        goto L13
    L19:
        r23 = r4.get(8) & 255;
        r1 = r4.getLong();
        goto L13
    L20:
        r1 = r4.getLong();
        goto L13
    L21:
        long r12 = ((((((r4.get(6) & 255) << 48) ^ ((r4.get(5) & 255) << 40)) ^ ((r4.get(4) & 255) << 32)) ^ ((r4.get(3) & 255) << 24)) ^ ((r4.get(2) & 255) << 16)) ^ ((r4.get(1) & 255) << 8);
        byte r42 = r4.get(0);
    L22:
        long r32 = r42;
    L23:
        r1 = r12 ^ (r32 & 255);
        goto L13
    L24:
        r12 = (((((r4.get(5) & 255) << 40) ^ ((r4.get(4) & 255) << 32)) ^ ((r4.get(3) & 255) << 24)) ^ ((r4.get(2) & 255) << 16)) ^ ((r4.get(1) & 255) << 8);
        r42 = r4.get(0);
        goto L22
    L25:
        r12 = ((((r4.get(4) & 255) << 32) ^ ((r4.get(3) & 255) << 24)) ^ ((r4.get(2) & 255) << 16)) ^ ((r4.get(1) & 255) << 8);
        r42 = r4.get(0);
        goto L22
    L26:
        r12 = (((r4.get(3) & 255) << 24) ^ ((r4.get(2) & 255) << 16)) ^ ((r4.get(1) & 255) << 8);
        r42 = r4.get(0);
        goto L22
    L27:
        r12 = ((r4.get(2) & 255) << 16) ^ ((r4.get(1) & 255) << 8);
        byte r33 = r4.get(0);
    L28:
        r32 = r33;
        goto L23
    L29:
        r12 = (r4.get(1) & 255) << 8;
        r33 = r4.get(0);
        goto L28
    L30:
        r1 = r4.get(0) & 255;
        goto L13
    L11:
        throw new AssertionError("Code should not reach here!");
    L32:
        long r14 = r27;
        long r34 = r5 ^ r14;
        long r15 = r14 ^ r7;
        long r35 = r34 + r15;
        long r16 = r15 + r35;
        long r36 = b(r35);
        long r17 = b(r16);
        long r37 = r36 + r17;
        return new long[]{r37, r17 + r37};
    }

    public final long e(long r3) {
        return Long.rotateLeft(r3 * this.f37328a, 31) * this.f37329b;
    }

    public final long f(long r3) {
        return Long.rotateLeft(r3 * this.f37329b, 33) * this.f37328a;
    }
}
