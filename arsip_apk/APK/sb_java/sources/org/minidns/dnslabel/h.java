package org.minidns.dnslabel;

/* loaded from: classes3.dex */
public class h extends c {
    static {
    }

    public h(String r1) {
        super(r1);
    }

    public static boolean r(String r1) {
        if (c.q(r1) == true) goto L7;
        return false;
    L7:
        return s(r1);
    }

    public static boolean s(String r2) {
        if (r2.length() >= 4) goto L5;
        return false;
    L5:
        if (r2.charAt(2) == '-') goto L7;
        return false;
    L7:
        if (r2.charAt(3) != '-') goto L13;
        return true;
    L13:
        return false;
    }
}
