package io.sentry.vendor;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1859a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f176907a;

        /* renamed from: b, reason: collision with root package name */
        public int f176908b;

        public AbstractC1859a() {
        }
    }

    public static class b extends AbstractC1859a {

        /* renamed from: j, reason: collision with root package name */
        public static final byte[] f176909j = null;

        /* renamed from: k, reason: collision with root package name */
        public static final byte[] f176910k = null;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f176911c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public int f176912e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f176913f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f176914g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f176915h;

        /* renamed from: i, reason: collision with root package name */
        public final byte[] f176916i;

        static {
            f176909j = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
            f176910k = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        }

        public b(int r4, byte[] r5) {
            this.f176907a = r5;
            boolean r1 = true;
            if ((r4 & 1) != 0) goto L5;
            boolean r52 = true;
        L6:
            this.f176913f = r52;
            if ((r4 & 2) != 0) goto L9;
            boolean r53 = true;
        L10:
            this.f176914g = r53;
            if ((r4 & 4) != 0) goto L14;
            r1 = false;
        L14:
            this.f176915h = r1;
            if ((r4 & 8) != 0) goto L17;
            byte[] r42 = f176909j;
        L18:
            this.f176916i = r42;
            this.f176911c = new byte[2];
            this.d = 0;
            if (r53 == false) goto L21;
            int r43 = 19;
        L22:
            this.f176912e = r43;
            return;
        L21:
            r43 = -1;
            goto L22
        L17:
            r42 = f176910k;
            goto L18
        L9:
            r53 = false;
            goto L10
        L5:
            r52 = false;
            goto L6
        }

        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            byte[] r1 = this.f176916i;
            byte[] r2 = this.f176907a;
            int r3 = this.f176912e;
            int r4 = r20 + r19;
            int r5 = this.d;
            char r6 = 2;
            int r8 = 0;
            if (r5 == 1) goto L10;
            if (r5 != 2) goto L12;
            int r52 = r19 + 1;
            if (r52 > r4) goto L12;
            byte[] r10 = this.f176911c;
            int r102 = (((r10[1] & UnsignedBytes.MAX_VALUE) << 8) | ((r10[0] & UnsignedBytes.MAX_VALUE) << 16)) | (r18[r19] & UnsignedBytes.MAX_VALUE);
            this.d = 0;
            int r11 = r52;
        L14:
            if (r102 == (-1)) goto L23;
            r2[0] = r1[(r102 >> 18) & 63];
            r2[1] = r1[(r102 >> 12) & 63];
            r2[2] = r1[(r102 >> 6) & 63];
            r2[3] = r1[r102 & 63];
            r3 = r3 - 1;
            if (r3 == 0) goto L18;
            int r9 = 4;
        L24:
            int r103 = r11 + 3;
            if (r103 > r4) goto L34;
            char r202 = r6;
            int r62 = (((r18[r11 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((r18[r11] & UnsignedBytes.MAX_VALUE) << 16)) | (r18[r11 + 2] & UnsignedBytes.MAX_VALUE);
            r2[r9] = r1[(r62 >> 18) & 63];
            r2[r9 + 1] = r1[(r62 >> 12) & 63];
            r2[r9 + 2] = r1[(r62 >> 6) & 63];
            r2[r9 + 3] = r1[r62 & 63];
            int r63 = r9 + 4;
            r3 = r3 - 1;
            if (r3 == 0) goto L29;
            r9 = r63;
            r11 = r103;
            r6 = r202;
            goto L24
        L29:
            if (this.f176915h == false) goto L31;
            r2[r63] = Ascii.CR;
            r63 = r9 + 5;
        L31:
            r9 = r63 + 1;
            r2[r63] = 10;
            r6 = r202;
            r3 = 19;
            r11 = r103;
            goto L24
        L34:
            if (r21 == false) goto L79;
            int r64 = this.d;
            if ((r11 - r64) != (r4 - 1)) goto L52;
            if (r64 <= 0) goto L39;
            byte r42 = this.f176911c[0];
            r8 = 1;
        L40:
            int r43 = (r42 & UnsignedBytes.MAX_VALUE) << 4;
            this.d = r64 - r8;
            r2[r9] = r1[(r43 >> 6) & 63];
            int r65 = r9 + 2;
            r2[r9 + 1] = r1[r43 & 63];
            if (this.f176913f == false) goto L44;
            r2[r65] = 61;
            r65 = r9 + 4;
            r2[r9 + 3] = 61;
        L44:
            if (this.f176914g == true) goto L46;
            r9 = r65;
        L84:
            this.f176908b = r9;
            this.f176912e = r3;
            return true;
        L46:
            if (this.f176915h == false) goto L48;
            r2[r65] = Ascii.CR;
            r65 = r65 + 1;
        L48:
            int r12 = r65 + 1;
            r2[r65] = 10;
        L49:
            r9 = r12;
            goto L84
        L39:
            r42 = r18[r11];
            goto L40
        L52:
            if ((r11 - r64) != (r4 - 2)) goto L71;
            if (r64 <= 1) goto L55;
            byte r44 = this.f176911c[0];
            r8 = 1;
        L56:
            int r45 = (r44 & UnsignedBytes.MAX_VALUE) << 10;
            if (r64 <= 0) goto L59;
            byte r53 = this.f176911c[r8];
            r8 = r8 + 1;
        L60:
            int r46 = r45 | ((r53 & UnsignedBytes.MAX_VALUE) << 2);
            this.d = r64 - r8;
            r2[r9] = r1[(r46 >> 12) & 63];
            r2[r9 + 1] = r1[(r46 >> 6) & 63];
            int r54 = r9 + 3;
            r2[r9 + 2] = r1[r46 & 63];
            if (this.f176913f == false) goto L64;
            r2[r54] = 61;
            r54 = r9 + 4;
        L64:
            if (this.f176914g == true) goto L66;
            r9 = r54;
            goto L84
        L66:
            if (this.f176915h == false) goto L68;
            r2[r54] = Ascii.CR;
            r54 = r54 + 1;
        L68:
            r12 = r54 + 1;
            r2[r54] = 10;
            goto L49
        L59:
            r53 = r18[r11];
            goto L60
        L55:
            byte r55 = r18[r11];
            r11 = r11 + 1;
            r44 = r55;
            goto L56
        L71:
            if (this.f176914g == false) goto L84;
            if (r9 <= 0) goto L84;
            if (r3 == 19) goto L84;
            if (this.f176915h == false) goto L77;
            r2[r9] = Ascii.CR;
            r9 = r9 + 1;
        L77:
            r12 = r9 + 1;
            r2[r9] = 10;
            goto L49
        L79:
            if (r11 != (r4 - 1)) goto L82;
            byte[] r13 = this.f176911c;
            int r22 = this.d;
            this.d = r22 + 1;
            r13[r22] = r18[r11];
            goto L84
        L82:
            if (r11 != (r4 - 2)) goto L84;
            byte[] r14 = this.f176911c;
            int r23 = this.d;
            int r47 = r23 + 1;
            this.d = r47;
            r14[r23] = r18[r11];
            this.d = r23 + 2;
            r14[r47] = r18[r11 + 1];
            goto L84
        L18:
            if (this.f176915h == false) goto L20;
            r2[4] = Ascii.CR;
            int r32 = 5;
        L21:
            r9 = r32 + 1;
            r2[r32] = 10;
            r3 = 19;
            goto L24
        L20:
            r32 = 4;
            goto L21
        L23:
            r9 = 0;
        L12:
            r11 = r19;
            r102 = -1;
            goto L14
        L10:
            if ((r19 + 2) > r4) goto L12;
            r11 = r19 + 2;
            r102 = (r18[r19 + 1] & UnsignedBytes.MAX_VALUE) | (((this.f176911c[0] & UnsignedBytes.MAX_VALUE) << 16) | ((r18[r19] & UnsignedBytes.MAX_VALUE) << 8));
            this.d = 0;
            goto L14
        }
    }

    static {
    }

    public static byte[] a(byte[] r2, int r3) {
        return b(r2, 0, r2.length, r3);
    }

    public static byte[] b(byte[] r5, int r6, int r7, int r8) {
        b r02 = new b(r8, null);
        int r82 = (r7 / 3) * 4;
        int r2 = 2;
        if (r02.f176913f == true) goto L5;
        int r1 = r7 % 3;
        if (r1 == 1) goto L12;
        if (r1 != 2) goto L14;
        r82 = r82 + 3;
    L14:
        if (r02.f176914g == false) goto L21;
        if (r7 <= 0) goto L21;
        int r12 = ((r7 - 1) / 57) + 1;
        if (r02.f176915h == true) goto L20;
        r2 = 1;
    L20:
        r82 = r82 + (r12 * r2);
    L21:
        r02.f176907a = new byte[r82];
        r02.a(r5, r6, r7, true);
        return r02.f176907a;
    L12:
        r82 = r82 + 2;
        goto L14
    L5:
        if ((r7 % 3) <= 0) goto L14;
        r82 = r82 + 4;
        goto L14
    }

    public static String c(byte[] r1, int r2) {
        return new String(a(r1, r2), "US-ASCII");
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }
}
