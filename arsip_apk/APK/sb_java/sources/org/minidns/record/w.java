package org.minidns.record;

import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class w extends h {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f182893c;
    public transient String d;

    /* renamed from: e, reason: collision with root package name */
    public transient List f182894e;

    public w(byte[] r1) {
        this.f182893c = r1;
    }

    public static w k(DataInputStream r02, int r1) {
        byte[] r12 = new byte[r1];
        r02.readFully(r12);
        return new w(r12);
    }

    @Override // org.minidns.record.h
    public void c(DataOutputStream r2) {
        r2.write(this.f182893c);
    }

    public List h() {
        if (this.f182894e != null) goto L10;
        List r02 = i();
        ArrayList r1 = new ArrayList(r02.size());
        Iterator r03 = r02.iterator();
    L6:
        if (r03.hasNext() == false) goto L8;
        r1.add(new String((byte[]) r03.next(), StandardCharsets.UTF_8));
        goto L6
    L8:
        this.f182894e = Collections.unmodifiableList(r1);
    L10:
        return this.f182894e;
    }

    public List i() {
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L3:
        byte[] r2 = this.f182893c;
        if (r1 >= r2.length) goto L6;
        int r3 = r2[r1] & UnsignedBytes.MAX_VALUE;
        int r12 = r1 + 1;
        int r32 = r3 + r12;
        r02.add(Arrays.copyOfRange(r2, r12, r32));
        r1 = r32;
        goto L3
    L6:
        return r02;
    }

    public String j() {
        if (this.d != null) goto L12;
        StringBuilder r02 = new StringBuilder();
        Iterator r1 = h().iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        r02.append((String) r1.next());
        if (r1.hasNext() == false) goto L6;
        r02.append(" / ");
        goto L6
    L10:
        this.d = r02.toString();
    L12:
        return this.d;
    }

    public String toString() {
        return "\"" + j() + "\"";
    }
}
