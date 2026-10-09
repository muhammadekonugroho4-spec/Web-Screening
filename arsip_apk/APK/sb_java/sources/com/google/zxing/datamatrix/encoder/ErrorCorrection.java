package com.google.zxing.datamatrix.encoder;

import clickstream.internal.analytics.healthproto.Health;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.perf.util.Constants;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes6.dex */
public final class ErrorCorrection {
    private static final int[] ALOG = null;
    private static final int[][] FACTORS = null;
    private static final int[] FACTOR_SETS = null;
    private static final int[] LOG = null;
    private static final int MODULO_VALUE = 301;

    static {
        FACTOR_SETS = new int[]{5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
        FACTORS = new int[][]{new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, Constants.MAX_HOST_LENGTH, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, com.clevertap.android.sdk.Constants.MAX_KEY_LENGTH}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, ModuleDescriptor.MODULE_VERSION, com.clevertap.android.sdk.Constants.MAX_KEY_LENGTH, 151, 233, 168, 93, Constants.MAX_HOST_LENGTH}, new int[]{245, WorkQueueKt.MASK, 242, 218, 130, 250, 162, 181, 102, com.clevertap.android.sdk.Constants.MAX_KEY_LENGTH, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, Health.EVENT_TIMESTAMP_FIELD_NUMBER, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, LocationRequest.PRIORITY_NO_POWER, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, LocationRequest.PRIORITY_NO_POWER, 214, 111, 57, 121, 21, 1, 253, 57, 54, Health.EVENT_TIMESTAMP_FIELD_NUMBER, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, com.clevertap.android.sdk.Constants.MAX_KEY_LENGTH, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, WorkQueueKt.MASK, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, WorkQueueKt.MASK, 213, ModuleDescriptor.MODULE_VERSION, 248, SubsamplingScaleImageView.ORIENTATION_180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, ModuleDescriptor.MODULE_VERSION, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
        LOG = new int[256];
        ALOG = new int[Constants.MAX_HOST_LENGTH];
        int r3 = 0;
        int r4 = 1;
    L3:
        if (r3 >= 255) goto L8;
        ALOG[r3] = r4;
        LOG[r4] = r3;
        r4 = r4 << 1;
        if (r4 < 256) goto L7;
        r4 = r4 ^ MODULO_VALUE;
    L7:
        r3 = r3 + 1;
        goto L3
    }

    private ErrorCorrection() {
    }

    private static String createECCBlock(CharSequence r2, int r3) {
        return createECCBlock(r2, 0, r2.length(), r3);
    }

    public static String encodeECC200(String r11, SymbolInfo r12) {
        if (r11.length() != r12.getDataCapacity()) goto L27;
        StringBuilder r02 = new StringBuilder(r12.getDataCapacity() + r12.getErrorCodewords());
        r02.append(r11);
        int r1 = r12.getInterleavedBlockCount();
        if (r1 != 1) goto L7;
        r02.append(createECCBlock(r11, r12.getErrorCodewords()));
    L25:
        return r02.toString();
    L7:
        r02.setLength(r02.capacity());
        int[] r2 = new int[r1];
        int[] r3 = new int[r1];
        int[] r4 = new int[r1];
        int r6 = 0;
    L8:
        if (r6 >= r1) goto L13;
        int r7 = r6 + 1;
        r2[r6] = r12.getDataLengthForInterleavedBlock(r7);
        r3[r6] = r12.getErrorLengthForInterleavedBlock(r7);
        r4[r6] = 0;
        if (r6 <= 0) goto L12;
        r4[r6] = r4[r6 - 1] + r2[r6];
    L12:
        r6 = r7;
        goto L8
    L13:
        int r42 = 0;
    L14:
        if (r42 >= r1) goto L25;
        StringBuilder r62 = new StringBuilder(r2[r42]);
        int r72 = r42;
    L17:
        if (r72 >= r12.getDataCapacity()) goto L19;
        r62.append(r11.charAt(r72));
        r72 = r72 + r1;
        goto L17
    L19:
        String r63 = createECCBlock(r62.toString(), r3[r42]);
        int r73 = r42;
        int r8 = 0;
    L21:
        if (r73 >= (r3[r42] * r1)) goto L23;
        r02.setCharAt(r12.getDataCapacity() + r73, r63.charAt(r8));
        r73 = r73 + r1;
        r8 = r8 + 1;
        goto L21
    L23:
        r42 = r42 + 1;
        goto L14
    L27:
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }

    private static String createECCBlock(CharSequence r11, int r12, int r13, int r14) {
        int r02 = 0;
        int r1 = 0;
    L3:
        int[] r2 = FACTOR_SETS;
        if (r1 >= r2.length) goto L9;
        if (r2[r1] == r14) goto L10;
        r1 = r1 + 1;
    L10:
        if (r1 < 0) goto L37;
        int[] r15 = FACTORS[r1];
        char[] r22 = new char[r14];
        int r3 = 0;
    L12:
        if (r3 >= r14) goto L14;
        r22[r3] = 0;
        r3 = r3 + 1;
        goto L12
    L14:
        int r32 = r12;
    L16:
        if (r32 >= (r12 + r13)) goto L31;
        int r4 = r14 - 1;
        int r5 = r22[r4] ^ r11.charAt(r32);
    L18:
        if (r4 <= 0) goto L25;
        if (r5 == 0) goto L23;
        int r6 = r15[r4];
        if (r6 == 0) goto L23;
        char r7 = r22[r4 - 1];
        int[] r8 = ALOG;
        int[] r9 = LOG;
        r22[r4] = (char) (r8[(r9[r5] + r9[r6]) % Constants.MAX_HOST_LENGTH] ^ r7);
    L24:
        r4 = r4 - 1;
    L23:
        r22[r4] = r22[r4 - 1];
        goto L24
    L25:
        if (r5 == 0) goto L29;
        int r42 = r15[0];
        if (r42 == 0) goto L29;
        int[] r62 = ALOG;
        int[] r72 = LOG;
        r22[0] = (char) r62[(r72[r5] + r72[r42]) % Constants.MAX_HOST_LENGTH];
    L30:
        r32 = r32 + 1;
    L29:
        r22[0] = 0;
        goto L30
    L31:
        char[] r112 = new char[r14];
    L32:
        if (r02 >= r14) goto L35;
        r112[r02] = r22[(r14 - r02) - 1];
        r02 = r02 + 1;
        goto L32
    L35:
        return String.valueOf(r112);
    L37:
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(r14)));
    L9:
        r1 = -1;
        goto L10
    }
}
