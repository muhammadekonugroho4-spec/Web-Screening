package com.appmattus.certificatetransparency.internal.loglist.parser;

import com.appmattus.certificatetransparency.loglist.g;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final PublicKey f32112a;

    public d(PublicKey r2) {
        p.l(r2, "publicKey");
        this.f32112a = r2;
    }

    public final g a(byte[] r3, byte[] r4) {
        p.l(r3, "message");
        p.l(r4, "signature");
        Signature r02 = Signature.getInstance("SHA256withRSA");     // Catch: NoSuchAlgorithmException -> L7 InvalidKeyException -> L9 SignatureException -> L11
        r02.initVerify(this.f32112a);     // Catch: NoSuchAlgorithmException -> L7 InvalidKeyException -> L9 SignatureException -> L11
        r02.update(r3);     // Catch: NoSuchAlgorithmException -> L7 InvalidKeyException -> L9 SignatureException -> L11
        if (r02.verify(r4) == false) goto L14;
        return g.b.f32344a;
    L14:
        return g.a.c.f32342a;
    L9:
        e = move-exception;
        return new g.a.b(e);
    L7:
        e = move-exception;
        return new g.a.C0313a(e);
    L11:
        e = move-exception;
        return new g.a.d(e);
    }
}
