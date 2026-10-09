package org.minidns.dnslabel;

/* loaded from: classes3.dex */
public abstract class c extends DnsLabel {
    static {
    }

    public c(String r1) {
        super(r1);
    }

    public static c p(String r1) {
        if (h.r(r1) == false) goto L11;
        if (j.t(r1) == false) goto L9;
        return j.p(r1);
    L9:
        return new h(r1);
    L11:
        return new f(r1);
    }

    public static boolean q(String r2) {
        if (r2.isEmpty() == false) goto L6;
        return false;
    L6:
        if (d.q(r2) == false) goto L9;
        return false;
    L9:
        return DnsLabel.e(r2);
    }
}
