package org.minidns.dnslabel;

import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class j extends h {
    static {
    }

    public j(String r1) {
        super(r1);
    }

    public static c p(String r1) {
        if (r1.equals(org.minidns.idna.c.b(r1)) == false) goto L7;
        return new b(r1);
    L7:
        return new a(r1);
    }

    public static boolean t(String r2) {
        return r2.substring(0, 2).toLowerCase(Locale.US).equals("xn");
    }
}
