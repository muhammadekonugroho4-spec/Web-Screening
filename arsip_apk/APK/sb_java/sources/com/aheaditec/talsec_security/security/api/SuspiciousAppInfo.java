package com.aheaditec.talsec_security.security.api;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.aheaditec.talsec.security.A;
import com.aheaditec.talsec.security.AbstractC4292o;
import com.aheaditec.talsec.security.C;
import com.aheaditec.talsec.security.r;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.util.Constants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class SuspiciousAppInfo implements Parcelable {
    public static final Parcelable.Creator<SuspiciousAppInfo> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final PackageInfo f30809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30810b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public static void a(byte[] r23, byte[] r24) {
            byte[] r2 = null;
            int r5 = 0;
            int r6 = 0;
            int r7 = 0;
            int r4 = -894652659;
            byte[] r3 = null;
        L3:
            int r12 = ((r4 & 16777216) * (r4 | 16777216)) + ((r4 & (-16777217)) * ((~r4) & 16777216));
            int r42 = r4 >>> 8;
            int r43 = (r42 + r12) - (r42 & r12);
            int r44 = (r43 ^ 1458005263) + ((r43 & 1458005263) * 2);
            int r15 = 145880015;
            int r16 = 1298988808;
            boolean r8 = true;
            switch(((r44 - 1434379843) + (((~r44) & 1434379843) * 2))) {
                case -1970406716: goto L40;
                case -1882653318: goto L34;
                case -625567707: goto L33;
                case 172635213: goto L26;
                case 614184219: goto L21;
                case 835516413: goto L12;
                case 1888416065: goto L6;
                default: goto L5;
            };
        L6:
            r7 = r3.length % 4;
            int r45 = ((r7 > 1 ? 1 : (r7 == 1 ? 0 : -1)) >>> 31) & 1;
            if (r45 == 0) goto L9;
            r16 = 196573321;
        L9:
            if (r45 == 0) goto L11;
        L25:
            r4 = -518432968;
        L11:
            r4 = r16;
            goto L3
        L12:
            int r22 = r23.length;
            int r32 = 0 - (0 - (r23.length % 4));
            if (((r22 ^ r32) - (((~r22) & r32) * 2)) > 0) goto L15;
            r8 = false;
        L15:
            if (r8 == false) goto L17;
            r15 = 196573321;
        L17:
            if (r8 == false) goto L19;
            r4 = -826922365;
        L20:
            r2 = r24;
            r3 = r23;
            r6 = 0;
            goto L3
        L19:
            r4 = r15;
            goto L20
        L21:
            int r46 = r3.length;
            int r72 = 0 - r5;
            int r9 = r72 * 3;
            int r10 = r.a(r72, -4, 1, r46);
            int r11 = r3.length;
            byte r112 = r3[(r11 ^ r72) + ((r11 & r72) * 2)];
            int r13 = r3.length;
            int r73 = 0 - r72;
            byte r74 = r2[(((~r73) & r13) * 2) - (r13 ^ r73)];
            r3[AbstractC4292o.a(0, (r46 & 2) | r10, r9, 1)] = (byte) (((byte) (r74 + r112)) - ((byte) (((byte) 2) * ((byte) (r74 & r112)))));
            r7 = ((-338014207) | r5) + (338014206 | r5);
            int r47 = ((r5 > 2 ? 1 : (r5 == 2 ? 0 : -1)) >>> 31) & 1;
            if (r47 == 0) goto L24;
            r16 = 196573321;
        L24:
            if (r47 == 0) goto L11;
        L26:
            int r92 = (r3.length & (0 - r7)) * 2;
            if ((r2[(r4 ^ r5) + r92] > Double.NaN ? 1 : (r2[(r4 ^ r5) + r92] == Double.NaN ? 0 : -1)) > (-1)) goto L29;
            r8 = false;
        L29:
            if (r8 == false) goto L31;
            r4 = -34715366;
        L32:
            r5 = r7;
            goto L3
        L31:
            r4 = 196573321;
            goto L32
        L33:
            return;
        L34:
            int r162 = (r6 - 1) - (r6 | (-4));
            byte r48 = r2[r162];
            int r49 = ((r48 & 16777216) * (r48 | 16777216)) + ((r48 & UnsignedBytes.MAX_VALUE) * ((~r48) & 16777216));
            int r18 = (r6 + 3) + (((-1) - r6) | (-3));
            int r93 = r2[r18] & UnsignedBytes.MAX_VALUE;
            int r94 = r93 * ((~r93) & 65536);
            int r410 = ~((r49 | ((~r94) | 1169991170)) - ((1169991170 & r94) | r49));
            int r95 = A.a(689061172 & r6, r6, 1, 689061173 & r6);
            int r102 = r2[r95] & UnsignedBytes.MAX_VALUE;
            int r82 = ((~r410) & (r102 * ((~r102) & 256))) + r410;
            int r83 = (r82 - 1) - ((~(r2[r6] & UnsignedBytes.MAX_VALUE)) | r82);
            byte r411 = r3[r162];
            int r412 = ((r411 & 16777216) * (r411 | 16777216)) + ((r411 & UnsignedBytes.MAX_VALUE) * ((~r411) & 16777216));
            int r103 = r3[r18] & UnsignedBytes.MAX_VALUE;
            int r104 = r103 * ((~r103) & 65536);
            int r413 = ~((r412 | ((~r104) | (-445685625))) - (((-445685625) & r104) | r412));
            int r105 = r3[r95] & UnsignedBytes.MAX_VALUE;
            int r106 = r105 * ((~r105) & 256);
            int r107 = (r106 + r413) - (r106 & r413);
            int r414 = r3[r6] & UnsignedBytes.MAX_VALUE;
            int r108 = (r107 & (~r414)) + r414;
            int r415 = r83 << ((r83 > Double.NaN ? 1 : (r83 == Double.NaN ? 0 : -1)) >>> 31);
            int r416 = (r415 + r108) - ((r415 & r108) * 2);
            int r84 = 659933421 - ((r416 & 2) | ((-1983400303) - r416));
            r3[r6] = (byte) r84;
            r3[r95] = (byte) (r84 >>> 8);
            r3[r18] = (byte) (r84 >>> 16);
            r3[r162] = (byte) (r84 >>> 24);
            r6 = (r6 ^ 4) + ((r6 & 4) * 2);
            int r96 = (r3.length & (0 - (r3.length % 4))) * 2;
            int r417 = ((r6 > ((r4 ^ r8) + r96) ? 1 : (r6 == ((r4 ^ r8) + r96) ? 0 : -1)) >>> 31) & 1;
            if (r417 == 0) goto L37;
            r15 = 196573321;
        L37:
            if (r417 != 0) goto L38;
            r4 = r15;
            goto L3
        L38:
            r4 = -826922365;
            goto L3
        L40:
            int r418 = r3.length;
            int r85 = 0 - r5;
            int r109 = ~r85;
            int r419 = ((r418 | r85) - ((602749225 & r109) & r418)) + ((602749225 | r85) & r418);
            byte r97 = r2[r419];
            int r113 = r3.length;
            byte r86 = r2[((r109 ^ r113) + ((r85 | r113) * 2)) + 1];
            int r1010 = ((byte) 0) - r97;
            r2[r419] = (byte) (((byte) (((byte) 2) * ((byte) (r86 & (~r1010))))) - ((byte) (r86 ^ r1010)));
            r4 = -34715366;
            goto L3
        L5:
            r4 = 196573321;
            goto L3
        }

        public final SuspiciousAppInfo b(Parcel r4) {
            byte[] r1 = {121, 96, Ascii.SYN, 47, 40, 50};
            a(r1, new byte[]{109, 47, -14, -22, 77, 94, 1, -79});
            p.l(r4, new String(r1, StandardCharsets.UTF_8).intern());
            return new SuspiciousAppInfo((PackageInfo) r4.readParcelable(SuspiciousAppInfo.class.getClassLoader()), r4.readString());
        }

        public final SuspiciousAppInfo[] c(int r1) {
            return new SuspiciousAppInfo[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return b(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return c(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public SuspiciousAppInfo(PackageInfo r5, String r6) {
        byte[] r2 = {45, Ascii.DEL, 59, 120, -45, 81, 33, -70, Ascii.CAN, -120, 32};
        a(r2, new byte[]{-124, 79, -18, 118, -101, 3, -61, -19, 100, -7, -34});
        Charset r1 = StandardCharsets.UTF_8;
        p.l(r5, new String(r2, r1).intern());
        byte[] r22 = {-118, -43, -93, -70, -42, 105};
        a(r22, new byte[]{-67, 7, -71, 61, 53, -47, 54, 105});
        p.l(r6, new String(r22, r1).intern());
        this.f30809a = r5;
        this.f30810b = r6;
    }

    public static void a(byte[] r18, byte[] r19) {
        short[] r1 = null;
        char r3 = 50438;
        int r4 = 0;
        int r5 = 0;
        short r6 = 0;
        short r7 = 0;
        short r8 = 0;
        int r9 = 0;
    L4:
        switch(r3) {
            case -2143294076: goto L28;
            case -2038999444: goto L27;
            case -1809249287: goto L26;
            case -1740520186: goto L25;
            case -1489518479: goto L23;
            case -473033593: goto L22;
            case 766056152: goto L19;
            case 974072829: goto L17;
            case 998066383: goto L16;
            case 1314339506: goto L15;
            case 1734050766: goto L12;
            case 1771480224: goto L10;
            case 2093236949: goto L7;
            default: goto L5;
        };
    L7:
        if (r9 < 32) goto L8;
        r3 = 42144;
        goto L4
    L8:
        r3 = 22124;
        goto L4
    L10:
        r18[r4] = (byte) (r7 & 255);
        r18[r4 + 1] = (byte) ((r7 >> 8) & Constants.MAX_HOST_LENGTH);
        r18[r4 + 2] = (byte) (r8 & 255);
        r18[r4 + 3] = (byte) ((r8 >> 8) & Constants.MAX_HOST_LENGTH);
        r4 = r4 + 4;
    L11:
        r3 = 60804;
        goto L4
    L12:
        if (r4 > 0) goto L13;
        r3 = 15026;
        goto L4
    L13:
        r3 = 5255;
        goto L4
    L15:
        return;
    L16:
        r5 = r18.length - (r18.length % 4);
        r4 = 0;
        goto L11
    L17:
        r4 = r18.length % 4;
    L18:
        r3 = 33742;
        goto L4
    L19:
        if (r4 < 4) goto L20;
        r3 = 18639;
        goto L4
    L20:
        r3 = 49265;
        goto L4
    L22:
        int r10 = -r4;
        int r32 = -r18.length;
        int r12 = r32 | r10;
        r18[(r12 - (r32 * 2)) + ((r32 ^ r10) ^ r12)] = (byte) (r18[r18.length - r4] ^ r19[r4 % 8]);
        r4 = r4 - 1;
        goto L18
    L23:
        r1[r4] = (short) ((r19[(((~r4) & 2) * (r4 & (-3))) + ((r4 & 2) * (r4 | 2))] & UnsignedBytes.MAX_VALUE) ^ ((r19[(r4 * 2) + 1] & UnsignedBytes.MAX_VALUE) << 8));
        r4 = r4 + 1;
    L24:
        r3 = 5848;
        goto L4
    L25:
        r1 = new short[4];
        r4 = 0;
        goto L24
    L28:
        if (r4 < r5) goto L29;
        r3 = 11261;
        goto L4
    L29:
        r3 = 3065;
    L5:
        r3 = 17109;
        goto L4
    L26:
        byte r33 = r18[r4];
        r7 = (short) (((r18[((r4 & 1) * 2) + (r4 ^ 1)] & UnsignedBytes.MAX_VALUE) << 8) | ((255 - (r33 | UnsignedBytes.MAX_VALUE)) + r33));
        int r34 = -r4;
        int r62 = r34 | 2;
        r8 = (short) ((r18[(r62 - (r34 * 2)) + ((r34 ^ 2) ^ r62)] & UnsignedBytes.MAX_VALUE) | ((r18[r4 + 3] & UnsignedBytes.MAX_VALUE) << 8));
        r6 = -14624;
        r9 = 0;
        goto L5
    L27:
        int r35 = ((short) ((r7 << 4) + r1[2])) ^ (r7 + r6);
        short r122 = r1[3];
        int r102 = -(r7 >>> 5);
        int r14 = r102 | r122;
        int r17 = (r14 - (r102 * 2)) + ((r102 ^ r122) ^ r14);
        int r36 = -(((r17 - r35) - ((r17 | (~r35)) * 2)) - 2);
        r8 = (short) C.a(r8, 3, -(r.a(r8, -4, 1, r36) | (r36 & 2)), 1);
        r7 = (short) (r7 - ((((short) ((r8 << 4) + r1[0])) ^ (((r6 | r8) - (((~r8) & 60) & r6)) + ((r8 | 60) & r6))) ^ ((r8 >>> 5) + r1[1])));
        r6 = (short) (r6 - 40503);
        r9 = r9 + 1;
        goto L5
    }

    public final PackageInfo b() {
        return this.f30809a;
    }

    public final String c() {
        return this.f30810b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof SuspiciousAppInfo) == false) goto L14;
        if (this != r2) goto L8;
        return true;
    L8:
        if (p.g(this.f30809a.packageName, ((SuspiciousAppInfo) r2).f30809a.packageName) == false) goto L11;
        return true;
    L11:
        return false;
    L14:
        return false;
    }

    public int hashCode() {
        return this.f30809a.packageName.hashCode();
    }

    public String toString() {
        PackageInfo r02 = this.f30809a;
        String r1 = this.f30810b;
        byte[] r5 = {104, 92, 99, -37, -80, -12, Ascii.GS, 120, -64, -71, 57, 17, -77, 65, -42, -25, 70, 92, -63, 95, 5, 107, Ascii.NAK, -57, 49, 103, -117, 74, -65, 105};
        a(r5, new byte[]{116, 84, -48, -58, 70, 6, 19, -124, -30, -26, 77, 96, -63, 34, 117, -87, -50, -33, 67, -30, 62, -45, -14, -38, -112, -11, 91, -20, -74, -17});
        Charset r4 = StandardCharsets.UTF_8;
        String r2 = new String(r5, r4).intern();
        byte[] r7 = {7, 107, 95, 118, -81, -61, -65, -62, -98};
        a(r7, new byte[]{55, -93, 124, 85, -22, -126, 119, Ascii.SYN, 8});
        String r52 = new String(r7, r4).intern();
        byte[] r72 = {-37};
        a(r72, new byte[]{Ascii.FF, -14, -31, 85, 38, 103, -11, -125});
        return r2 + r02 + r52 + r1 + new String(r72, r4).intern();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        byte[] r1 = {SignedBytes.MAX_POWER_OF_TWO, -18, -33, -77};
        a(r1, new byte[]{125, Ascii.US, 98, 5, 90, 63, 80, -66});
        p.l(r4, new String(r1, StandardCharsets.UTF_8).intern());
        r4.writeParcelable(this.f30809a, r5);
        r4.writeString(this.f30810b);
    }
}
