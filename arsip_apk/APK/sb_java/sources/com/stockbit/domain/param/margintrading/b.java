package com.stockbit.domain.param.margintrading;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f87420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87421b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87422c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87423a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87424b;

        public a(String r2, String r3) {
            p.l(r2, Constants.KEY_KEY);
            p.l(r3, "value");
            this.f87423a = r2;
            this.f87424b = r3;
        }

        public final String a() {
            return this.f87423a;
        }

        public final String b() {
            return this.f87424b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f87423a, r52.f87423a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87424b, r52.f87424b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87423a.hashCode() * 31) + this.f87424b.hashCode();
        }

        public String toString() {
            return "MarginTradingESignURLHeaderEntity(key=" + this.f87423a + ", value=" + this.f87424b + ")";
        }
    }

    public b(String r2, String r3, List r4) {
        p.l(r2, "url");
        p.l(r3, "fileUrl");
        p.l(r4, "headers");
        this.f87420a = r2;
        this.f87421b = r3;
        this.f87422c = r4;
    }

    public final String a() {
        return this.f87421b;
    }

    public final List b() {
        return this.f87422c;
    }

    public final String c() {
        return this.f87420a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87420a, r52.f87420a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87421b, r52.f87421b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87422c, r52.f87422c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f87420a.hashCode() * 31) + this.f87421b.hashCode()) * 31) + this.f87422c.hashCode();
    }

    public String toString() {
        return "UploadFileURLDomainParam(url=" + this.f87420a + ", fileUrl=" + this.f87421b + ", headers=" + this.f87422c + ")";
    }
}
