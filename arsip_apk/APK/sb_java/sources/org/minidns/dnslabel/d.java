package org.minidns.dnslabel;

/* loaded from: classes3.dex */
public final class d extends e {
    public d(String r1) {
        super(r1);
    }

    public static boolean q(String r4) {
        if (r4.isEmpty() == false) goto L6;
        return false;
    L6:
        if (r4.charAt(0) != '-') goto L9;
        return true;
    L9:
        if (r4.charAt(r4.length() - 1) != '-') goto L11;
        return true;
    L11:
        return false;
    }
}
