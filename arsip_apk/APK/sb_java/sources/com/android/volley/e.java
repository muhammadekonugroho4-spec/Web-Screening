package com.android.volley;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f31995a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31996b;

    public e(String r1, String r2) {
        this.f31995a = r1;
        this.f31996b = r2;
    }

    public final String a() {
        return this.f31995a;
    }

    public final String b() {
        return this.f31996b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (e.class != r5.getClass()) goto L15;
        e r52 = (e) r5;
        if (TextUtils.equals(this.f31995a, r52.f31995a) == false) goto L15;
        if (TextUtils.equals(this.f31996b, r52.f31996b) == false) goto L15;
        return true;
    }

    public int hashCode() {
        return (this.f31995a.hashCode() * 31) + this.f31996b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f31995a + ",value=" + this.f31996b + Constants.AES_SUFFIX;
    }
}
