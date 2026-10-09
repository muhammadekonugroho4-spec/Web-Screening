package org.minidns.dnslabel;

/* loaded from: classes3.dex */
public final class i extends e {
    public i(String r1) {
        super(r1);
    }

    public static boolean q(String r2) {
        if (r2.charAt(0) != '_') goto L6;
        return true;
    L6:
        return false;
    }
}
