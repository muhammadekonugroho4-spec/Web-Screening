package org.ocpsoft.prettytime.impl;

import com.clevertap.android.sdk.Constants;
import org.ocpsoft.prettytime.e;

/* loaded from: classes3.dex */
public class a implements org.ocpsoft.prettytime.a {

    /* renamed from: a, reason: collision with root package name */
    public long f183018a;

    /* renamed from: b, reason: collision with root package name */
    public long f183019b;

    /* renamed from: c, reason: collision with root package name */
    public e f183020c;

    public a() {
    }

    @Override // org.ocpsoft.prettytime.a
    public e a() {
        return this.f183020c;
    }

    @Override // org.ocpsoft.prettytime.a
    public boolean b() {
        return !d();
    }

    @Override // org.ocpsoft.prettytime.a
    public long c(int r7) {
        long r02 = Math.abs(getQuantity());
        if (e() != 0) goto L5;
        return r02;
    L5:
        if (Math.abs((e() / a().a()) * 100.0d) > r7) goto L7;
        return r02;
    L7:
        return r02 + 1;
    }

    @Override // org.ocpsoft.prettytime.a
    public boolean d() {
        if (getQuantity() >= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public long e() {
        return this.f183019b;
    }

    public boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L9;
        return false;
    L9:
        if (getClass() == r7.getClass()) goto L11;
        return false;
    L11:
        a r72 = (a) r7;
        if (this.f183019b == r72.f183019b) goto L15;
        return false;
    L15:
        if (this.f183018a == r72.f183018a) goto L17;
        return false;
    L17:
        e r2 = this.f183020c;
        if (r2 != null) goto L23;
        if (r72.f183020c == null) goto L25;
        return false;
    L25:
        return true;
    L23:
        if (r2.equals(r72.f183020c) == true) goto L25;
        return false;
    }

    public void f(long r1) {
        this.f183019b = r1;
    }

    public void g(long r1) {
        this.f183018a = r1;
    }

    @Override // org.ocpsoft.prettytime.a
    public long getQuantity() {
        return this.f183018a;
    }

    public void h(e r1) {
        this.f183020c = r1;
    }

    public int hashCode() {
        long r02 = this.f183019b;
        int r03 = (((int) (r02 ^ (r02 >>> 32))) + 31) * 31;
        long r3 = this.f183018a;
        int r04 = (r03 + ((int) (r3 ^ (r3 >>> 32)))) * 31;
        e r1 = this.f183020c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r04 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "DurationImpl [" + this.f183018a + " " + this.f183020c + ", delta=" + this.f183019b + Constants.AES_SUFFIX;
    }
}
