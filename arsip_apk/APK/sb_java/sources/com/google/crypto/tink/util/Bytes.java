package com.google.crypto.tink.util;

import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;

@Immutable
/* loaded from: classes6.dex */
public final class Bytes {
    private final byte[] data;

    private Bytes(byte[] r3, int r4, int r5) {
        byte[] r02 = new byte[r5];
        this.data = r02;
        System.arraycopy(r3, r4, r02, 0, r5);
    }

    public static Bytes copyFrom(byte[] r2) {
        if (r2 == null) goto L6;
        return copyFrom(r2, 0, r2.length);
    L6:
        throw new NullPointerException("data must be non-null");
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof Bytes) == true) goto L7;
        return false;
    L7:
        return Arrays.equals(((Bytes) r2).data, this.data);
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public int size() {
        return this.data.length;
    }

    public byte[] toByteArray() {
        byte[] r02 = this.data;
        byte[] r1 = new byte[r02.length];
        System.arraycopy(r02, 0, r1, 0, r02.length);
        return r1;
    }

    public String toString() {
        return "Bytes(" + Hex.encode(this.data) + ")";
    }

    public static Bytes copyFrom(byte[] r1, int r2, int r3) {
        if (r1 == null) goto L6;
        return new Bytes(r1, r2, r3);
    L6:
        throw new NullPointerException("data must be non-null");
    }
}
