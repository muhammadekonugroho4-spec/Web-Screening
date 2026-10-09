package org.minidns.dnslabel;

/* loaded from: classes3.dex */
public abstract class e extends DnsLabel {
    public e(String r1) {
        super(r1);
    }

    public static DnsLabel p(String r1) {
        if (i.q(r1) == false) goto L7;
        return new i(r1);
    L7:
        if (d.q(r1) == false) goto L11;
        return new d(r1);
    L11:
        return new g(r1);
    }
}
