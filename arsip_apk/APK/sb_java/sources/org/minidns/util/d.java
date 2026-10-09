package org.minidns.util;

/* loaded from: classes3.dex */
public abstract class d {
    public static StringBuilder a(byte[] r5) {
        StringBuilder r02 = new StringBuilder(r5.length * 2);
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02.append(String.format("%02X ", new Object[]{Byte.valueOf(r5[r2])}));
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }
}
