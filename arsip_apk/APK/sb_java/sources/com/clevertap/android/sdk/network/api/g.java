package com.clevertap.android.sdk.network.api;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f34668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34669b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34670c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public g(String r2, String r3, String r4) {
        p.l(r2, "encryptedPayload");
        p.l(r3, Constants.KEY_KEY);
        p.l(r4, "iv");
        this.f34668a = r2;
        this.f34669b = r3;
        this.f34670c = r4;
    }

    public final String a() {
        JSONObject r02 = new JSONObject();
        r02.put("itp", this.f34668a);
        r02.put("itk", this.f34669b);
        r02.put("itv", this.f34670c);
        String r03 = r02.toString();
        p.k(r03, "toString(...)");
        return r03;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f34668a, r52.f34668a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f34669b, r52.f34669b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f34670c, r52.f34670c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f34668a.hashCode() * 31) + this.f34669b.hashCode()) * 31) + this.f34670c.hashCode();
    }

    public String toString() {
        return "EncryptedSendQueueRequestBody(encryptedPayload=" + this.f34668a + ", key=" + this.f34669b + ", iv=" + this.f34670c + ')';
    }
}
