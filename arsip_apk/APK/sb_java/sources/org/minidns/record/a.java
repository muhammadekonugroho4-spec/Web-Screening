package org.minidns.record;

import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;

/* loaded from: classes3.dex */
public class a extends k {
    static {
    }

    public a(byte[] r2) {
        super(r2);
        if (r2.length != 4) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("IPv4 address in A record is always 4 byte");
    }

    public static a j(DataInputStream r1) {
        byte[] r02 = new byte[4];
        r1.readFully(r02);
        return new a(r02);
    }

    public String toString() {
        return Integer.toString(this.f182861c[0] & UnsignedBytes.MAX_VALUE) + "." + Integer.toString(this.f182861c[1] & UnsignedBytes.MAX_VALUE) + "." + Integer.toString(this.f182861c[2] & UnsignedBytes.MAX_VALUE) + "." + Integer.toString(this.f182861c[3] & UnsignedBytes.MAX_VALUE);
    }
}
