package com.google.zxing.datamatrix.encoder;

/* loaded from: classes6.dex */
class C40Encoder implements Encoder {
    public C40Encoder() {
    }

    private int backtrackOneCharacter(EncoderContext r2, StringBuilder r3, StringBuilder r4, int r5) {
        int r02 = r3.length();
        r3.delete(r02 - r5, r02);
        r2.pos--;
        int r32 = encodeChar(r2.getCurrentChar(), r4);
        r2.resetSymbolInfo();
        return r32;
    }

    private static String encodeToCodewords(CharSequence r4, int r5) {
        int r02 = (((r4.charAt(r5) * 1600) + (r4.charAt(r5 + 1) * '(')) + r4.charAt(r5 + 2)) + 1;
        return new String(new char[]{(char) (r02 / 256), (char) (r02 % 256)});
    }

    public static void writeNextTriplet(EncoderContext r2, StringBuilder r3) {
        r2.writeCodewords(encodeToCodewords(r3, 0));
        r3.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext r9) {
        StringBuilder r02 = new StringBuilder();
    L4:
        if (r9.hasMoreCharacters() == false) goto L23;
        char r1 = r9.getCurrentChar();
        r9.pos++;
        int r12 = encodeChar(r1, r02);
        int r5 = r9.getCodewordCount() + ((r02.length() / 3) << 1);
        r9.updateSymbolInfo(r5);
        int r2 = r9.getSymbolInfo().getDataCapacity() - r5;
        if (r9.hasMoreCharacters() == false) goto L7;
        if ((r02.length() % 3) != 0) goto L4;
        if (HighLevelEncoder.lookAheadTest(r9.getMessage(), r9.pos, getEncodingMode()) == getEncodingMode()) goto L4;
        r9.signalEncoderChange(0);
        goto L23
    L7:
        StringBuilder r52 = new StringBuilder();
        if ((r02.length() % 3) != 2) goto L13;
        if (r2 < 2) goto L11;
        if (r2 <= 2) goto L13;
    L11:
        r12 = backtrackOneCharacter(r9, r02, r52, r12);
    L13:
        if ((r02.length() % 3) != 1) goto L23;
        if (r12 > 3) goto L16;
        if (r2 == 1) goto L16;
    L17:
        r12 = backtrackOneCharacter(r9, r02, r52, r12);
    L16:
        if (r12 > 3) goto L17;
    L23:
        handleEOD(r9, r02);
    }

    public int encodeChar(char r5, StringBuilder r6) {
        if (r5 != ' ') goto L7;
        r6.append(3);
        return 1;
    L7:
        if (r5 < '0') goto L13;
        if (r5 > '9') goto L13;
        r6.append((char) (r5 - ','));
        return 1;
    L13:
        if (r5 < 'A') goto L19;
        if (r5 > 'Z') goto L19;
        r6.append((char) (r5 - '3'));
        return 1;
    L19:
        if (r5 >= ' ') goto L23;
        r6.append(0);
        r6.append(r5);
        return 2;
    L23:
        if (r5 < '!') goto L29;
        if (r5 > '/') goto L29;
        r6.append(1);
        r6.append((char) (r5 - '!'));
        return 2;
    L29:
        if (r5 < ':') goto L35;
        if (r5 > '@') goto L35;
        r6.append(1);
        r6.append((char) (r5 - '+'));
        return 2;
    L35:
        if (r5 < '[') goto L41;
        if (r5 > '_') goto L41;
        r6.append(1);
        r6.append((char) (r5 - 'E'));
        return 2;
    L41:
        if (r5 >= '`') goto L43;
    L46:
        r6.append("\u0001\u001e");
        return encodeChar((char) (r5 - 128), r6) + 2;
    L43:
        if (r5 > 127) goto L46;
        r6.append(2);
        r6.append((char) (r5 - '`'));
        return 2;
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 1;
    }

    public void handleEOD(EncoderContext r8, StringBuilder r9) {
        int r02 = (r9.length() / 3) << 1;
        int r3 = r9.length() % 3;
        int r4 = r8.getCodewordCount() + r02;
        r8.updateSymbolInfo(r4);
        int r03 = r8.getSymbolInfo().getDataCapacity() - r4;
        if (r3 != 2) goto L11;
        r9.append(0);
    L6:
        if (r9.length() < 3) goto L9;
        writeNextTriplet(r8, r9);
        goto L6
    L9:
        if (r8.hasMoreCharacters() == false) goto L28;
        r8.writeCodeword(254);
    L28:
        r8.signalEncoderChange(0);
        return;
    L11:
        if (r03 != 1) goto L20;
        if (r3 != 1) goto L20;
    L14:
        if (r9.length() < 3) goto L17;
        writeNextTriplet(r8, r9);
        goto L14
    L17:
        if (r8.hasMoreCharacters() == false) goto L19;
        r8.writeCodeword(254);
    L19:
        r8.pos--;
    L20:
        if (r3 != 0) goto L31;
    L22:
        if (r9.length() < 3) goto L24;
        writeNextTriplet(r8, r9);
        goto L22
    L24:
        if (r03 <= 0) goto L26;
    L27:
        r8.writeCodeword(254);
        goto L28
    L26:
        if (r8.hasMoreCharacters() == false) goto L28;
    L31:
        throw new IllegalStateException("Unexpected case. Please report!");
    }
}
