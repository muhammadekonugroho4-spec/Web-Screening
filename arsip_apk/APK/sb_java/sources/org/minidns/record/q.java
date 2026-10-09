package org.minidns.record;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class q extends h {

    /* renamed from: c, reason: collision with root package name */
    public final List f182872c;

    static {
    }

    public q(List r1) {
        this.f182872c = Collections.unmodifiableList(r1);
    }

    public static q h(DataInputStream r5, int r6) {
        if (r6 != 0) goto L4;
        List r52 = Collections.EMPTY_LIST;
    L9:
        return new q(r52);
    L4:
        ArrayList r02 = new ArrayList(4);
    L5:
        if (r6 <= 0) goto L7;
        int r2 = r5.readUnsignedShort();
        int r3 = r5.readUnsignedShort();
        byte[] r4 = new byte[r3];
        r5.read(r4);
        r02.add(org.minidns.edns.b.d(r2, r4));
        r6 = r6 - (r3 + 4);
        goto L5
    L7:
        r52 = r02;
        goto L9
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r3) {
        Iterator r02 = this.f182872c.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((org.minidns.edns.b) r02.next()).f(r3);
        goto L4
    }
}
