package com.gojek.ojosdk.exif;

/* loaded from: classes4.dex */
class JpegHeader {
    public static final short APP0 = -32;
    public static final short APP1 = -31;
    public static final short DAC = -52;
    public static final short DHT = -60;
    public static final short EOI = -39;
    public static final short JPG = -56;
    public static final short SOF0 = -64;
    public static final short SOF15 = -49;
    public static final short SOI = -40;

    public JpegHeader() {
    }

    public static final boolean isSofMarker(short r1) {
        if (r1 >= (-64)) goto L5;
        return false;
    L5:
        if (r1 <= (-49)) goto L7;
        return false;
    L7:
        if (r1 != (-60)) goto L9;
        return false;
    L9:
        if (r1 != (-56)) goto L11;
        return false;
    L11:
        if (r1 == (-52)) goto L19;
        return true;
    L19:
        return false;
    }
}
