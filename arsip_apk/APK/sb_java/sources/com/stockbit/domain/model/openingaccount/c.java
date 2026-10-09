package com.stockbit.domain.model.openingaccount;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f84521a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f84522a;

        /* renamed from: b, reason: collision with root package name */
        public final String f84523b;

        public a(String r2, String r3) {
            p.l(r2, Constants.KEY_KEY);
            p.l(r3, "value");
            this.f84522a = r2;
            this.f84523b = r3;
        }

        public final String a() {
            return this.f84522a;
        }

        public final String b() {
            return this.f84523b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f84522a, r52.f84522a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f84523b, r52.f84523b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f84522a.hashCode() * 31) + this.f84523b.hashCode();
        }

        public String toString() {
            return "GoogleUploadTokenHeaderEntity(key=" + this.f84522a + ", value=" + this.f84523b + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84524a;

        /* renamed from: b, reason: collision with root package name */
        public final List f84525b;

        /* renamed from: c, reason: collision with root package name */
        public final String f84526c;

        public b(String r2, List r3, String r4) {
            p.l(r2, "fileUrl");
            p.l(r3, "headers");
            p.l(r4, "url");
            this.f84524a = r2;
            this.f84525b = r3;
            this.f84526c = r4;
        }

        public final String a() {
            return this.f84524a;
        }

        public final List b() {
            return this.f84525b;
        }

        public final String c() {
            return this.f84526c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f84524a, r52.f84524a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f84525b, r52.f84525b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f84526c, r52.f84526c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f84524a.hashCode() * 31) + this.f84525b.hashCode()) * 31) + this.f84526c.hashCode();
        }

        public String toString() {
            return "GoogleUploadTokenUrlEntity(fileUrl=" + this.f84524a + ", headers=" + this.f84525b + ", url=" + this.f84526c + ")";
        }
    }

    public c(List r2) {
        p.l(r2, "uploadUrls");
        this.f84521a = r2;
    }

    public final List a() {
        return this.f84521a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f84521a, ((c) r4).f84521a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f84521a.hashCode();
    }

    public String toString() {
        return "GoogleUploadTokenEntity(uploadUrls=" + this.f84521a + ")";
    }
}
