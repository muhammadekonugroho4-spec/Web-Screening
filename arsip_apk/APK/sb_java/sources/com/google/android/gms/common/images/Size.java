package com.google.android.gms.common.images;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes5.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int r1, int r2) {
        this.zaa = r1;
        this.zab = r2;
    }

    public static Size parseSize(String r3) throws NumberFormatException {
        if (r3 == null) goto L14;
        int r02 = r3.indexOf(42);
        if (r02 >= 0) goto L6;
        r02 = r3.indexOf(Constants.MAX_KEY_LENGTH);
    L6:
        if (r02 < 0) goto L12;
        return new Size(Integer.parseInt(r3.substring(0, r02)), Integer.parseInt(r3.substring(r02 + 1)));
    L10:
        throw zaa(r3);
    L12:
        throw zaa(r3);
    L14:
        throw new IllegalArgumentException("string must not be null");
    }

    private static NumberFormatException zaa(String r3) {
        throw new NumberFormatException("Invalid Size: \"" + r3 + "\"");
    }

    public boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof Size) == false) goto L15;
        Size r52 = (Size) r5;
        if (this.zaa != r52.zaa) goto L15;
        if (this.zab != r52.zab) goto L15;
        return true;
    L15:
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int r02 = this.zaa;
        int r1 = r02 << 16;
        int r03 = (r02 >>> 16) | r1;
        return r03 ^ this.zab;
    }

    public String toString() {
        return this.zaa + "x" + this.zab;
    }
}
