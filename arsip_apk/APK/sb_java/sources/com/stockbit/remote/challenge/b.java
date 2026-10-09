package com.stockbit.remote.challenge;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.OkHttp;

/* loaded from: classes10.dex */
public final class b {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f129191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129193c;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a() {
            return new b("cf_clearance", "okhttp/" + OkHttp.f181447b, 86400);
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public b(String r2, String r3, int r4) {
        p.l(r2, "clearanceCookieName");
        p.l(r3, "userAgent");
        this.f129191a = r2;
        this.f129192b = r3;
        this.f129193c = r4;
    }

    public final String a() {
        return this.f129191a;
    }

    public final int b() {
        return this.f129193c;
    }

    public final String c() {
        return this.f129192b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f129191a, r52.f129191a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f129192b, r52.f129192b) == true) goto L15;
        return false;
    L15:
        if (this.f129193c == r52.f129193c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f129191a.hashCode() * 31) + this.f129192b.hashCode()) * 31) + Integer.hashCode(this.f129193c);
    }

    public String toString() {
        return "ChallengeVendorConfig(clearanceCookieName=" + this.f129191a + ", userAgent=" + this.f129192b + ", clearanceTtlSeconds=" + this.f129193c + ')';
    }
}
