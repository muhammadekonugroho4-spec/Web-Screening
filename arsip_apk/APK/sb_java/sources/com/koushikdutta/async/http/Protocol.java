package com.koushikdutta.async.http;

import java.util.Hashtable;
import java.util.Locale;

/* loaded from: classes6.dex */
public enum Protocol extends Enum<Protocol> {
    public static final Protocol HTTP_1_0 = null;
    public static final Protocol HTTP_1_1 = null;
    public static final Protocol HTTP_2 = null;
    public static final Protocol SPDY_3 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Hashtable f41329a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Protocol[] f41330b = null;
    private final String protocol;

    static {
        Protocol r02 = new Protocol("HTTP_1_0", 0, "http/1.0");
        HTTP_1_0 = r02;
        Protocol r2 = new Protocol("HTTP_1_1", 1, "http/1.1");
        HTTP_1_1 = r2;
        final int r5 = 2;
        final String r6 = "spdy/3.1";
        final String r7 = "SPDY_3";
        Protocol r4 = new AnonymousClass1(r7, r5, r6);
        SPDY_3 = r4;
        final int r72 = 3;
        final String r8 = "h2-13";
        final String r9 = "HTTP_2";
        Protocol r62 = new AnonymousClass2(r9, r72, r8);
        HTTP_2 = r62;
        f41330b = new Protocol[]{r02, r2, r4, r62};
        Hashtable r1 = new Hashtable();
        f41329a = r1;
        r1.put(r02.toString(), r02);
        r1.put(r2.toString(), r2);
        r1.put(r4.toString(), r4);
        r1.put(r62.toString(), r62);
    }

    /* synthetic */ Protocol(String r1, int r2, String r3, AnonymousClass1 r4) {
        this(r1, r2, r3);
    }

    public static Protocol get(String r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return (Protocol) f41329a.get(r2.toLowerCase(Locale.US));
    }

    public static Protocol valueOf(String r1) {
        return (Protocol) Enum.valueOf(Protocol.class, r1);
    }

    public static Protocol[] values() {
        return (Protocol[]) f41330b.clone();
    }

    public boolean needsSpdyConnection() {
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    Protocol(String r1, int r2, String r3) {
        this.protocol = r3;
    }
}
