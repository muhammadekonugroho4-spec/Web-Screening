package com.aheaditec.talsec.security;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class M {

    /* renamed from: c, reason: collision with root package name */
    public static final String f30393c = null;
    public static final String d = null;

    /* renamed from: a, reason: collision with root package name */
    public a f30394a;

    /* renamed from: b, reason: collision with root package name */
    public Long f30395b;

    public enum a extends Enum<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30396a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final a f30397b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f30398c = null;

        static {
            byte[] r2 = {-94, -54};
            a(r2, new byte[]{-19, -127, -34, 79, 77, -1, 75, 93});
            Charset r4 = StandardCharsets.UTF_8;
            a r02 = new a(new String(r2, r4).intern(), 0);
            f30396a = r02;
            byte[] r5 = {-115, -40, -56};
            a(r5, new byte[]{-61, -105, -125, -48, 36, -3, 105, UnsignedBytes.MAX_POWER_OF_TWO});
            a r1 = new a(new String(r5, r4).intern(), 1);
            f30397b = r1;
            f30398c = new a[]{r02, r1};
        }

        a(String r1, int r2) {
        }

        public static /* synthetic */ a[] a() {
            return new a[]{f30396a, f30397b};
        }

        public static a valueOf(String r1) {
            return (a) Enum.valueOf(a.class, r1);
        }

        public static a[] values() {
            return (a[]) f30398c.clone();
        }

        public static void a(byte[] r23, byte[] r24) {
            byte[] r2 = null;
            int r4 = -1003175592;
            int r5 = 0;
            int r6 = 0;
            int r7 = 0;
            byte[] r3 = null;
        L3:
            int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
            int r42 = r4 >>> 8;
            int r43 = ~((((~r42) | (-1095531540)) | r12) - ((r42 & (-1095531540)) | r12));
            int r8 = (-1171264002) - ((r43 & 2) | ((-130029571) - r43));
            int r44 = (-1109882652) ^ ((~r8) + ((r8 | 1) * 2));
            int r15 = -1216566512;
            boolean r82 = true;
            switch(r44) {
                case -1922532006: goto L40;
                case -1486048729: goto L30;
                case -497756741: goto L28;
                case 256719606: goto L20;
                case 1429728656: goto L13;
                case 1870596681: goto L12;
                case 1879000533: goto L6;
                default: goto L5;
            };
        L6:
            int r45 = r3.length;
            int r52 = 0 - r6;
            int r9 = 0 - r52;
            int r10 = r9 | r45;
            int r46 = (r45 ^ r9) ^ r10;
            int r122 = r9 * 2;
            int r13 = r3.length;
            byte r92 = r3[(r9 ^ r13) - (((~r13) & r9) * 2)];
            int r132 = r3.length;
            byte r53 = r2[((r52 | r132) * 2) - (r132 ^ r52)];
            r3[(r10 - r122) + r46] = (byte) (((((byte) (~r53)) + ((byte) (((byte) 2) * ((byte) (r53 | 1))))) ^ r92) ^ 1);
            r5 = (~r6) + (r6 * 2);
            int r47 = ((r6 > 2 ? 1 : (r6 == 2 ? 0 : -1)) >>> 31) & 1;
            if (r47 != 0) goto L10;
            r15 = 935800592;
        L10:
            if (r47 != 0) goto L11;
        L19:
            r4 = -1058029970;
        L11:
            r4 = r15;
            goto L3
        L12:
            return;
        L13:
            r5 = r3.length % 4;
            int r48 = ((r5 > 1 ? 1 : (r5 == 1 ? 0 : -1)) >>> 31) & 1;
            if (r48 != 0) goto L17;
            r15 = 935800592;
        L17:
            if (r48 == 0) goto L19;
        L20:
            int r152 = (r7 - 1) - (r7 | (-4));
            byte r49 = r2[r152];
            int r410 = ((r49 & 16777216) * (r49 | 16777216)) + ((r49 & UnsignedBytes.MAX_VALUE) * ((~r49) & 16777216));
            int r18 = r7 + 2;
            int r93 = r18 - (r7 & 2);
            int r102 = r2[r93] & UnsignedBytes.MAX_VALUE;
            int r103 = r102 * ((~r102) & 65536);
            int r411 = AbstractC4289n.a(r103, r410, 1, ((-1) - r103) | ((-1) - r410));
            int r182 = r18 + (((-1) - r7) | (-2));
            int r104 = r2[r182] & UnsignedBytes.MAX_VALUE;
            int r105 = r104 * ((~r104) & 256);
            int r106 = (r105 - 1) - ((~r411) | r105);
            int r412 = r2[r7] & UnsignedBytes.MAX_VALUE;
            int r413 = ~((r412 | ((~r106) | (-755325340))) - ((r106 & (-755325340)) | r412));
            byte r107 = r3[r152];
            int r108 = ((r107 & 16777216) * (r107 | 16777216)) + ((r107 & UnsignedBytes.MAX_VALUE) * ((~r107) & 16777216));
            int r123 = r3[r93] & UnsignedBytes.MAX_VALUE;
            int r124 = r123 * ((~r123) & 65536);
            int r133 = r3[r182] & UnsignedBytes.MAX_VALUE;
            int r134 = r133 * ((~r133) & 256);
            int r14 = r3[r7] & UnsignedBytes.MAX_VALUE;
            byte[] r19 = r2;
            int r1 = r413 << ((r413 > Double.NaN ? 1 : (r413 == Double.NaN ? 0 : -1)) >>> 31);
            int r414 = (-659933419) - ((1983400305 - r108) | (r108 & 2));
            int r415 = ((r414 ^ (~r124)) + ((r414 | r124) * 2)) + 1;
            int r416 = (r415 ^ r14) + ((r415 & r14) * 2);
            int r417 = ((r416 | r134) - (((-2109111237) & (~r134)) & r416)) + ((r134 | (-2109111237)) & r416);
            int r16 = AbstractC4309u.a(r1 | r417, 2, r1, r417);
            r3[r7] = (byte) r16;
            r3[r182] = (byte) (r16 >>> 8);
            r3[r93] = (byte) (r16 >>> 16);
            r3[r152] = (byte) (r16 >>> 24);
            r7 = (r7 ^ 4) + ((r7 & 4) * 2);
            int r418 = r3.length ^ (0 - (r3.length % 4));
            int r17 = ((r7 > (((r1 | r2) * 2) - r418) ? 1 : (r7 == (((r1 | r2) * 2) - r418) ? 0 : -1)) >>> 31) & 1;
            if (r17 == 0) goto L23;
            r4 = -1515449616;
        L24:
            r2 = r19;
            if (r17 != 0) goto L3;
            r4 = -10521562;
            goto L3
        L23:
            r4 = 935800592;
            goto L24
        L28:
            byte[] r192 = r2;
            int r110 = r3.length;
            int r22 = 0 - r6;
            int r111 = ((r110 | r22) * 2) - (r110 ^ r22);
            byte r419 = r192[r111];
            int r94 = r3.length;
            byte r25 = r192[((r22 | r94) - (((~r22) & 1163302289) & r94)) + ((1163302289 | r22) & r94)];
            r192[r111] = (byte) (((byte) (((byte) (r25 ^ (~r419))) + ((byte) (((byte) 2) * ((byte) (r25 | r419)))))) + ((byte) 1));
            r4 = 935800592;
        L29:
            r2 = r192;
            goto L3
        L30:
            int r112 = r23.length;
            int r26 = 0 - (0 - (r23.length % 4));
            if (((r112 & (~r26)) - ((~r112) & r26)) > 0) goto L33;
            r82 = false;
        L33:
            if (r82 == false) goto L35;
            int r125 = -1515449616;
        L36:
            if (r82 == false) goto L38;
            r4 = r125;
        L39:
            r2 = r24;
            r3 = r23;
            r7 = 0;
            goto L3
        L38:
            r4 = -10521562;
            goto L39
        L35:
            r125 = 935800592;
            goto L36
        L40:
            r192 = r2;
            int r27 = 0 - r5;
            int r420 = r27 * 3;
            int r28 = r.a(r27, -4, 1, r3.length);
            if ((r192[AbstractC4292o.a(0, (r1 & 2) | r28, r420, 1)] > Double.NaN ? 1 : (r192[AbstractC4292o.a(0, (r1 & 2) | r28, r420, 1)] == Double.NaN ? 0 : -1)) > (-1)) goto L43;
            r82 = false;
        L43:
            if (r82 == false) goto L45;
            r4 = 935800592;
        L46:
            r6 = r5;
            goto L29
        L45:
            r4 = -1671996003;
            goto L46
        L5:
            r4 = 935800592;
            goto L3
        }
    }

    static {
        byte[] r2 = {-42, -10, 61, 54, -93, Ascii.SI};
        d(r2, new byte[]{Ascii.SO, -115, -62, -3, -18, 124, 79, Ascii.SUB});
        Charset r4 = StandardCharsets.UTF_8;
        d = new String(r2, r4).intern();
        byte[] r1 = {-89, -52, -91, -19, -118, -112};
        d(r1, new byte[]{56, -50, 118, 36, -1, -29, 42, -39});
        f30393c = new String(r1, r4).intern();
    }

    public M(a r1, Long r2) {
        this.f30394a = r1;
        this.f30395b = r2;
    }

    public static void d(byte[] r23, byte[] r24) {
        byte[] r2 = null;
        int r4 = -1003175592;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        byte[] r3 = null;
    L3:
        int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
        int r42 = r4 >>> 8;
        int r43 = ~((((~r42) | (-1095531540)) | r12) - ((r42 & (-1095531540)) | r12));
        int r8 = (-1171264002) - ((r43 & 2) | ((-130029571) - r43));
        int r44 = (-1109882652) ^ ((~r8) + ((r8 | 1) * 2));
        int r15 = -1216566512;
        boolean r82 = true;
        switch(r44) {
            case -1922532006: goto L40;
            case -1486048729: goto L30;
            case -497756741: goto L28;
            case 256719606: goto L20;
            case 1429728656: goto L13;
            case 1870596681: goto L12;
            case 1879000533: goto L6;
            default: goto L5;
        };
    L6:
        int r45 = r3.length;
        int r52 = 0 - r6;
        int r9 = 0 - r52;
        int r10 = r9 | r45;
        int r46 = (r45 ^ r9) ^ r10;
        int r122 = r9 * 2;
        int r13 = r3.length;
        byte r92 = r3[(r9 ^ r13) - (((~r13) & r9) * 2)];
        int r132 = r3.length;
        byte r53 = r2[((r52 | r132) * 2) - (r132 ^ r52)];
        r3[(r10 - r122) + r46] = (byte) (((((byte) (~r53)) + ((byte) (((byte) 2) * ((byte) (r53 | 1))))) ^ r92) ^ 1);
        r5 = (~r6) + (r6 * 2);
        int r47 = ((r6 > 2 ? 1 : (r6 == 2 ? 0 : -1)) >>> 31) & 1;
        if (r47 != 0) goto L10;
        r15 = 935800592;
    L10:
        if (r47 != 0) goto L11;
    L19:
        r4 = -1058029970;
    L11:
        r4 = r15;
        goto L3
    L12:
        return;
    L13:
        r5 = r3.length % 4;
        int r48 = ((r5 > 1 ? 1 : (r5 == 1 ? 0 : -1)) >>> 31) & 1;
        if (r48 != 0) goto L17;
        r15 = 935800592;
    L17:
        if (r48 == 0) goto L19;
    L20:
        int r152 = (r7 - 1) - (r7 | (-4));
        byte r49 = r2[r152];
        int r410 = ((r49 & 16777216) * (r49 | 16777216)) + ((r49 & UnsignedBytes.MAX_VALUE) * ((~r49) & 16777216));
        int r18 = r7 + 2;
        int r93 = r18 - (r7 & 2);
        int r102 = r2[r93] & UnsignedBytes.MAX_VALUE;
        int r103 = r102 * ((~r102) & 65536);
        int r411 = AbstractC4289n.a(r103, r410, 1, ((-1) - r103) | ((-1) - r410));
        int r182 = r18 + (((-1) - r7) | (-2));
        int r104 = r2[r182] & UnsignedBytes.MAX_VALUE;
        int r105 = r104 * ((~r104) & 256);
        int r106 = (r105 - 1) - ((~r411) | r105);
        int r412 = r2[r7] & UnsignedBytes.MAX_VALUE;
        int r413 = ~((r412 | ((~r106) | (-755325340))) - ((r106 & (-755325340)) | r412));
        byte r107 = r3[r152];
        int r108 = ((r107 & 16777216) * (r107 | 16777216)) + ((r107 & UnsignedBytes.MAX_VALUE) * ((~r107) & 16777216));
        int r123 = r3[r93] & UnsignedBytes.MAX_VALUE;
        int r124 = r123 * ((~r123) & 65536);
        int r133 = r3[r182] & UnsignedBytes.MAX_VALUE;
        int r134 = r133 * ((~r133) & 256);
        int r14 = r3[r7] & UnsignedBytes.MAX_VALUE;
        byte[] r19 = r2;
        int r1 = r413 << ((r413 > Double.NaN ? 1 : (r413 == Double.NaN ? 0 : -1)) >>> 31);
        int r414 = (-659933419) - ((1983400305 - r108) | (r108 & 2));
        int r415 = ((r414 ^ (~r124)) + ((r414 | r124) * 2)) + 1;
        int r416 = (r415 ^ r14) + ((r415 & r14) * 2);
        int r417 = ((r416 | r134) - (((-2109111237) & (~r134)) & r416)) + ((r134 | (-2109111237)) & r416);
        int r16 = AbstractC4309u.a(r1 | r417, 2, r1, r417);
        r3[r7] = (byte) r16;
        r3[r182] = (byte) (r16 >>> 8);
        r3[r93] = (byte) (r16 >>> 16);
        r3[r152] = (byte) (r16 >>> 24);
        r7 = (r7 ^ 4) + ((r7 & 4) * 2);
        int r418 = r3.length ^ (0 - (r3.length % 4));
        int r17 = ((r7 > (((r1 | r2) * 2) - r418) ? 1 : (r7 == (((r1 | r2) * 2) - r418) ? 0 : -1)) >>> 31) & 1;
        if (r17 == 0) goto L23;
        r4 = -1515449616;
    L24:
        r2 = r19;
        if (r17 != 0) goto L3;
        r4 = -10521562;
        goto L3
    L23:
        r4 = 935800592;
        goto L24
    L28:
        byte[] r192 = r2;
        int r110 = r3.length;
        int r22 = 0 - r6;
        int r111 = ((r110 | r22) * 2) - (r110 ^ r22);
        byte r419 = r192[r111];
        int r94 = r3.length;
        byte r25 = r192[((r22 | r94) - (((~r22) & 1163302289) & r94)) + ((1163302289 | r22) & r94)];
        r192[r111] = (byte) (((byte) (((byte) (r25 ^ (~r419))) + ((byte) (((byte) 2) * ((byte) (r25 | r419)))))) + ((byte) 1));
        r4 = 935800592;
    L29:
        r2 = r192;
        goto L3
    L30:
        int r112 = r23.length;
        int r26 = 0 - (0 - (r23.length % 4));
        if (((r112 & (~r26)) - ((~r112) & r26)) > 0) goto L33;
        r82 = false;
    L33:
        if (r82 == false) goto L35;
        int r125 = -1515449616;
    L36:
        if (r82 == false) goto L38;
        r4 = r125;
    L39:
        r2 = r24;
        r3 = r23;
        r7 = 0;
        goto L3
    L38:
        r4 = -10521562;
        goto L39
    L35:
        r125 = 935800592;
        goto L36
    L40:
        r192 = r2;
        int r27 = 0 - r5;
        int r420 = r27 * 3;
        int r28 = r.a(r27, -4, 1, r3.length);
        if ((r192[AbstractC4292o.a(0, (r1 & 2) | r28, r420, 1)] > Double.NaN ? 1 : (r192[AbstractC4292o.a(0, (r1 & 2) | r28, r420, 1)] == Double.NaN ? 0 : -1)) > (-1)) goto L43;
        r82 = false;
    L43:
        if (r82 == false) goto L45;
        r4 = 935800592;
    L46:
        r6 = r5;
        goto L29
    L45:
        r4 = -1671996003;
        goto L46
    L5:
        r4 = 935800592;
        goto L3
    }

    public JSONObject a() {
        JSONObject r02 = new JSONObject();
        byte[] r3 = {-23, -13, -97, -74, 10, -18};
        d(r3, new byte[]{-2, -107, 112, 109, Ascii.DEL, -99, -91, 33});
        Charset r5 = StandardCharsets.UTF_8;
        r02.put(new String(r3, r5).intern(), this.f30394a.toString());
        if (this.f30395b == null) goto L5;
        byte[] r2 = {109, Ascii.ETB, -12, 111, 108, Ascii.DEL};
        d(r2, new byte[]{101, 108, Ascii.VT, -73, 33, Ascii.FF, -9, -22});
        r02.put(new String(r2, r5).intern(), this.f30395b);
    L5:
        return r02;
    }

    public void b(a r1) {
        this.f30394a = r1;
    }

    public void c(a r1, long r2) {
        this.f30394a = r1;
        this.f30395b = Long.valueOf(r2);
    }
}
