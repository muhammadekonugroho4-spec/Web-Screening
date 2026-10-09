package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final Encoding encoding;

    public EncodedPayload(Encoding r1, byte[] r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.encoding = r1;
        this.bytes = r2;
        return;
    L8:
        throw new NullPointerException("bytes is null");
    L10:
        throw new NullPointerException("encoding is null");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof EncodedPayload) == true) goto L8;
        return false;
    L8:
        EncodedPayload r42 = (EncodedPayload) r4;
        if (this.encoding.equals(r42.encoding) == true) goto L12;
        return false;
    L12:
        return Arrays.equals(this.bytes, r42.bytes);
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return ((this.encoding.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.bytes);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.encoding + ", bytes=[...]}";
    }
}
