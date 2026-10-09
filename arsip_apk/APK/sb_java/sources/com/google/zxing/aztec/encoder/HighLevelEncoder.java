package com.google.zxing.aztec.encoder;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.common.BitArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes6.dex */
public final class HighLevelEncoder {
    private static final int[][] CHAR_MAP = null;
    static final int[][] LATCH_TABLE = null;
    static final int MODE_DIGIT = 2;
    static final int MODE_LOWER = 1;
    static final int MODE_MIXED = 3;
    static final String[] MODE_NAMES = null;
    static final int MODE_PUNCT = 4;
    static final int MODE_UPPER = 0;
    static final int[][] SHIFT_TABLE = null;
    private final byte[] text;

    static {
        MODE_NAMES = new String[]{"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
        LATCH_TABLE = new int[][]{new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
        Class r3 = Integer.TYPE;
        int[][] r1 = (int[][]) Array.newInstance(r3, new int[]{5, 256});
        CHAR_MAP = r1;
        r1[0][32] = 1;
        int r12 = 65;
    L4:
        if (r12 > 90) goto L6;
        CHAR_MAP[0][r12] = r12 - 63;
        r12 = r12 + 1;
        goto L4
    L6:
        CHAR_MAP[1][32] = 1;
        int r13 = 97;
    L8:
        if (r13 > 122) goto L10;
        CHAR_MAP[1][r13] = r13 - 95;
        r13 = r13 + 1;
        goto L8
    L10:
        CHAR_MAP[2][32] = 1;
        int r14 = 48;
    L12:
        if (r14 > 57) goto L14;
        CHAR_MAP[2][r14] = r14 - 46;
        r14 = r14 + 1;
        goto L12
    L14:
        int[] r15 = CHAR_MAP[2];
        r15[44] = 12;
        r15[46] = 13;
        int[] r16 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, WorkQueueKt.MASK};
        int r4 = 0;
    L15:
        if (r4 >= 28) goto L17;
        CHAR_MAP[3][r16[r4]] = r4;
        r4 = r4 + 1;
        goto L15
    L17:
        int[] r17 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        int r42 = 0;
    L18:
        if (r42 >= 31) goto L23;
        int r7 = r17[r42];
        if (r7 <= 0) goto L22;
        CHAR_MAP[4][r7] = r42;
    L22:
        r42 = r42 + 1;
        goto L18
    L23:
        int[][] r18 = (int[][]) Array.newInstance(r3, new int[]{6, 6});
        SHIFT_TABLE = r18;
        int r32 = r18.length;
        int r43 = 0;
    L24:
        if (r43 >= r32) goto L26;
        Arrays.fill(r18[r43], -1);
        r43 = r43 + 1;
        goto L24
    L26:
        int[][] r19 = SHIFT_TABLE;
        r19[0][4] = 0;
        int[] r2 = r19[1];
        r2[4] = 0;
        r2[0] = 28;
        r19[3][4] = 0;
        int[] r02 = r19[2];
        r02[4] = 0;
        r02[0] = 15;
    }

    public HighLevelEncoder(byte[] r1) {
        this.text = r1;
    }

    private static Collection<State> simplifyStates(Iterable<State> r5) {
        LinkedList r02 = new LinkedList();
        Iterator<State> r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L15;
        State r1 = r52.next();
        Iterator r2 = r02.iterator();
    L7:
        if (r2.hasNext() == false) goto L14;
        State r3 = (State) r2.next();
        if (r3.isBetterThanOrEqualTo(r1) == true) goto L4;
        if (r1.isBetterThanOrEqualTo(r3) == false) goto L7;
        r2.remove();
        goto L7
    L14:
        r02.add(r1);
        goto L4
    L15:
        return r02;
    }

    private void updateStateForChar(State r8, int r9, Collection<State> r10) {
        char r02 = (char) (this.text[r9] & UnsignedBytes.MAX_VALUE);
        int r2 = 0;
        if (CHAR_MAP[r8.getMode()][r02] <= 0) goto L5;
        boolean r1 = true;
    L6:
        State r3 = null;
    L8:
        if (r2 > 4) goto L25;
        int r4 = CHAR_MAP[r2][r02];
        if (r4 <= 0) goto L23;
        if (r3 != null) goto L13;
        r3 = r8.endBinaryShift(r9);
    L13:
        if (r1 == true) goto L15;
    L18:
        r10.add(r3.latchAndAppend(r2, r4));
    L19:
        if (r1 == true) goto L23;
        if (SHIFT_TABLE[r8.getMode()][r2] < 0) goto L23;
        r10.add(r3.shiftAndAppend(r2, r4));
        goto L23
    L15:
        if (r2 == r8.getMode()) goto L18;
        if (r2 != 2) goto L19;
    L23:
        r2 = r2 + 1;
        goto L8
    L25:
        if (r8.getBinaryShiftByteCount() <= 0) goto L27;
    L30:
        r10.add(r8.addBinaryShiftChar(r9));
        return;
    L27:
        if (CHAR_MAP[r8.getMode()][r02] == 0) goto L30;
        return;
    L5:
        r1 = false;
        goto L6
    }

    private static void updateStateForPair(State r4, int r5, int r6, Collection<State> r7) {
        State r02 = r4.endBinaryShift(r5);
        r7.add(r02.latchAndAppend(4, r6));
        if (r4.getMode() == 4) goto L6;
        r7.add(r02.shiftAndAppend(4, r6));
    L6:
        if (r6 == 3) goto L8;
        if (r6 == 4) goto L8;
    L10:
        if (r4.getBinaryShiftByteCount() <= 0) goto L13;
        r7.add(r4.addBinaryShiftChar(r5).addBinaryShiftChar(r5 + 1));
        return;
    L13:
        return;
    L8:
        r7.add(r02.latchAndAppend(2, 16 - r6).latchAndAppend(2, 1));
        goto L10
    }

    private Collection<State> updateStateListForChar(Iterable<State> r3, int r4) {
        LinkedList r02 = new LinkedList();
        Iterator<State> r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L7;
        updateStateForChar(r32.next(), r4, r02);
        goto L4
    L7:
        return simplifyStates(r02);
    }

    private static Collection<State> updateStateListForPair(Iterable<State> r2, int r3, int r4) {
        LinkedList r02 = new LinkedList();
        Iterator<State> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L7;
        updateStateForPair(r22.next(), r3, r4, r02);
        goto L4
    L7:
        return simplifyStates(r02);
    }

    public BitArray encode() {
        Collection<State> r02 = Collections.singletonList(State.INITIAL_STATE);
        int r2 = 0;
    L3:
        byte[] r3 = this.text;
        if (r2 >= r3.length) goto L32;
        int r4 = r2 + 1;
        if (r4 >= r3.length) goto L8;
        byte r5 = r3[r4];
    L9:
        byte r32 = r3[r2];
        if (r32 == 13) goto L25;
        if (r32 != 44) goto L14;
        if (r5 == 32) goto L23;
    L17:
        int r33 = 0;
    L27:
        if (r33 <= 0) goto L29;
        r02 = updateStateListForPair(r02, r2, r33);
        r2 = r4;
    L30:
        r2 = r2 + 1;
        goto L3
    L29:
        r02 = updateStateListForChar(r02, r2);
        goto L30
    L23:
        r33 = 4;
        goto L27
    L14:
        if (r32 != 46) goto L16;
        if (r5 != 32) goto L17;
        r33 = 3;
        goto L27
    L16:
        if (r32 != 58) goto L17;
        if (r5 != 32) goto L17;
        r33 = 5;
        goto L27
    L25:
        if (r5 != 10) goto L17;
        r33 = 2;
        goto L27
    L8:
        r5 = 0;
        goto L9
    L32:
        return ((State) Collections.min(r02, new AnonymousClass1(this))).toBitArray(this.text);
    }
}
