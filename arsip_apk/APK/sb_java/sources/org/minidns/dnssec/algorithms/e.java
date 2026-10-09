package org.minidns.dnssec.algorithms;

import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class e implements org.minidns.dnssec.a {

    /* renamed from: a, reason: collision with root package name */
    public MessageDigest f182723a;

    public e(String r1) {
        this.f182723a = MessageDigest.getInstance(r1);
    }

    @Override // org.minidns.dnssec.a
    public byte[] a(byte[] r2) {
        return this.f182723a.digest(r2);
    }
}
