package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.AbstractC11588f2;
import io.sentry.AbstractC11610k;
import io.sentry.Z2;

/* loaded from: classes3.dex */
public class k implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public String f175598a;

    /* renamed from: b, reason: collision with root package name */
    public long f175599b;

    /* renamed from: c, reason: collision with root package name */
    public long f175600c;
    public long d;

    public k() {
    }

    public int a(k r5) {
        return Long.compare(this.f175599b, r5.f175599b);
    }

    public String b() {
        return this.f175598a;
    }

    public long c() {
        if (o() == true) goto L5;
        return 0;
    L5:
        return this.d - this.f175600c;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((k) r1);
    }

    public AbstractC11588f2 d() {
        if (o() == true) goto L5;
        return null;
    L5:
        return new Z2(AbstractC11610k.i(e()));
    }

    public long e() {
        if (n() == true) goto L5;
        return 0;
    L5:
        return this.f175599b + c();
    }

    public double g() {
        return AbstractC11610k.j(e());
    }

    public AbstractC11588f2 h() {
        if (n() == true) goto L5;
        return null;
    L5:
        return new Z2(AbstractC11610k.i(i()));
    }

    public long i() {
        return this.f175599b;
    }

    public double j() {
        return AbstractC11610k.j(this.f175599b);
    }

    public long k() {
        return this.f175600c;
    }

    public boolean l() {
        if (this.f175600c != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean m() {
        if (this.d != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean n() {
        if (this.f175600c == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean o() {
        if (this.d == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void p() {
        this.f175598a = null;
        this.f175600c = 0;
        this.d = 0;
        this.f175599b = 0;
    }

    public void q(String r1) {
        this.f175598a = r1;
    }

    public void r(long r3) {
        this.f175600c = r3;
        long r32 = SystemClock.uptimeMillis() - this.f175600c;
        this.f175599b = System.currentTimeMillis() - r32;
    }

    public void s(long r1) {
        this.d = r1;
    }

    public void t(String r1, long r2, long r4, long r6) {
        this.f175598a = r1;
        this.f175599b = r2;
        this.f175600c = r4;
        this.d = r6;
    }

    public void u() {
        this.d = SystemClock.uptimeMillis();
    }
}
