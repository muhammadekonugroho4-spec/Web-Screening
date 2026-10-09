package com.koushikdutta.ion.apache;

/* loaded from: classes6.dex */
public class c extends a {
    public c() {
    }

    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String r2, String[] r3, String[] r4) {
        f(r2, r3, r4, false);
    }
}
