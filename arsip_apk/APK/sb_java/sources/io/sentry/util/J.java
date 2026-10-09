package io.sentry.util;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f176851a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f176852b = null;

    static {
        f176851a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
        long[] r02 = new long[128];
        f176852b = r02;
        Arrays.fill(r02, -1);
        r02[48] = 0;
        r02[49] = 1;
        r02[50] = 2;
        r02[51] = 3;
        r02[52] = 4;
        r02[53] = 5;
        r02[54] = 6;
        r02[55] = 7;
        r02[56] = 8;
        r02[57] = 9;
        r02[97] = 10;
        r02[98] = 11;
        r02[99] = 12;
        r02[100] = 13;
        r02[101(0x65, float:1.42E-43)] = 14;
        r02[102(0x66, float:1.43E-43)] = 15;
        r02[65] = 10;
        r02[66] = 11;
        r02[67] = 12;
        r02[68] = 13;
        r02[69] = 14;
        r02[70] = 15;
    }

    public static void a(char[] r6, long r7) {
        char[] r02 = f176851a;
        r6[0] = r02[(int) (((-1152921504606846976L) & r7) >>> 60)];
        r6[1] = r02[(int) ((1080863910568919040L & r7) >>> 56)];
        r6[2] = r02[(int) ((67553994410557440L & r7) >>> 52)];
        r6[3] = r02[(int) ((4222124650659840L & r7) >>> 48)];
        r6[4] = r02[(int) ((263882790666240L & r7) >>> 44)];
        r6[5] = r02[(int) ((16492674416640L & r7) >>> 40)];
        r6[6] = r02[(int) ((1030792151040L & r7) >>> 36)];
        r6[7] = r02[(int) ((64424509440L & r7) >>> 32)];
        r6[8] = r02[(int) ((4026531840L & r7) >>> 28)];
        r6[9] = r02[(int) ((251658240 & r7) >>> 24)];
        r6[10] = r02[(int) ((15728640 & r7) >>> 20)];
        r6[11] = r02[(int) ((983040 & r7) >>> 16)];
        r6[12] = r02[(int) ((61440 & r7) >>> 12)];
        r6[13] = r02[(int) ((3840 & r7) >>> 8)];
        r6[14] = r02[(int) ((240 & r7) >>> 4)];
        r6[15] = r02[(int) (r7 & 15)];
    }

    public static String b(long r7, long r9) {
        char[] r1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, r7[(int) (((-1152921504606846976L) & r9) >>> 60)], r7[(int) ((1080863910568919040L & r9) >>> 56)], r7[(int) ((67553994410557440L & r9) >>> 52)], r7[(int) ((4222124650659840L & r9) >>> 48)], r7[(int) ((263882790666240L & r9) >>> 44)], r7[(int) ((16492674416640L & r9) >>> 40)], r7[(int) ((1030792151040L & r9) >>> 36)], r7[(int) ((64424509440L & r9) >>> 32)], r7[(int) ((4026531840L & r9) >>> 28)], r7[(int) ((251658240 & r9) >>> 24)], r7[(int) ((15728640 & r9) >>> 20)], r7[(int) ((983040 & r9) >>> 16)], r7[(int) ((61440 & r9) >>> 12)], r7[(int) ((3840 & r9) >>> 8)], r7[(int) ((240 & r9) >>> 4)], r7[(int) (r9 & 15)]};
        a(r1, r7);
        char[] r72 = f176851a;
        return new String(r1);
    }

    public static String c(UUID r4) {
        return b(r4.getMostSignificantBits(), r4.getLeastSignificantBits());
    }

    public static String d(long r1) {
        char[] r02 = new char[16];
        a(r02, r1);
        return new String(r02);
    }
}
