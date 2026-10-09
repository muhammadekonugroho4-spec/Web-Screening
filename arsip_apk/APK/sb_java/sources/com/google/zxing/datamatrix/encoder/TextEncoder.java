package com.google.zxing.datamatrix.encoder;

/* loaded from: classes6.dex */
final class TextEncoder extends C40Encoder {
    public TextEncoder() {
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
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
        if (r5 < 'a') goto L19;
        if (r5 > 'z') goto L19;
        r6.append((char) (r5 - 'S'));
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
        if (r5 < ':') goto L34;
        if (r5 > '@') goto L34;
        r6.append(1);
        r6.append((char) (r5 - '+'));
        return 2;
    L34:
        if (r5 < '[') goto L40;
        if (r5 > '_') goto L40;
        r6.append(1);
        r6.append((char) (r5 - 'E'));
        return 2;
    L40:
        if (r5 != '`') goto L44;
        r6.append(2);
        r6.append((char) (r5 - '`'));
        return 2;
    L44:
        if (r5 < 'A') goto L50;
        if (r5 > 'Z') goto L50;
        r6.append(2);
        r6.append((char) (r5 - '@'));
        return 2;
    L50:
        if (r5 >= '{') goto L52;
    L55:
        r6.append("\u0001\u001e");
        return encodeChar((char) (r5 - 128), r6) + 2;
    L52:
        if (r5 > 127) goto L55;
        r6.append(2);
        r6.append((char) (r5 - '`'));
        return 2;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 2;
    }
}
