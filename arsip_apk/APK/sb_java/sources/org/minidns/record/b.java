package org.minidns.record;

import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;

/* loaded from: classes3.dex */
public class b extends k {
    static {
    }

    public b(byte[] r2) {
        super(r2);
        if (r2.length != 16) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("IPv6 address in AAAA record is always 16 byte");
    }

    public static b j(DataInputStream r1) {
        byte[] r02 = new byte[16];
        r1.readFully(r02);
        return new b(r02);
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= this.f182861c.length) goto L9;
        if (r1 == 0) goto L7;
        r02.append(':');
    L7:
        byte[] r2 = this.f182861c;
        r02.append(Integer.toHexString(((r2[r1] & UnsignedBytes.MAX_VALUE) << 8) + (r2[r1 + 1] & UnsignedBytes.MAX_VALUE)));
        r1 = r1 + 2;
        goto L4
    L9:
        return r02.toString();
    }
}
