package com.clevertap.android.sdk.network.api;

import kotlin.jvm.internal.p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34665c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f34666a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34667b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(String r5) {
            p.l(r5, "json");
            JSONObject r02 = new JSONObject(r5);
            String r1 = r02.getString("itp");
            p.k(r1, "getString(...)");
            String r03 = r02.getString("itv");
            p.k(r03, "getString(...)");
            return new f(r1, r03);
        }

        public a() {
        }
    }

    static {
        f34665c = new a(null);
    }

    public f(String r2, String r3) {
        p.l(r2, "encryptedPayload");
        p.l(r3, "iv");
        this.f34666a = r2;
        this.f34667b = r3;
    }

    public final String a() {
        return this.f34666a;
    }

    public final String b() {
        return this.f34667b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f34666a, r52.f34666a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f34667b, r52.f34667b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f34666a.hashCode() * 31) + this.f34667b.hashCode();
    }

    public String toString() {
        return "EncryptedResponseBody(encryptedPayload=" + this.f34666a + ", iv=" + this.f34667b + ')';
    }
}
