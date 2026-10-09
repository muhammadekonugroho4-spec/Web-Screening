package A;

import a.AbstractC2049c;
import b.AbstractC4230a;
import b.AbstractC4231b;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f81a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f83c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84e;

    /* renamed from: f, reason: collision with root package name */
    public final long f85f;

    /* renamed from: g, reason: collision with root package name */
    public final long f86g;

    /* renamed from: h, reason: collision with root package name */
    public final long f87h;

    public e(String r2, String r3, Map r4, int r5, int r6, long r7, long r9, long r11) {
        p.l(r2, "apiKey");
        p.l(r3, "endPoint");
        p.l(r4, "headers");
        this.f81a = r2;
        this.f82b = r3;
        this.f83c = r4;
        this.d = r5;
        this.f84e = r6;
        this.f85f = r7;
        this.f86g = r9;
        this.f87h = r11;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f81a, r82.f81a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82b, r82.f82b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83c, r82.f83c) == true) goto L18;
        return false;
    L18:
        if (p.g(null, null) == true) goto L21;
        return false;
    L21:
        if (this.d == r82.d) goto L24;
        return false;
    L24:
        if (this.f84e == r82.f84e) goto L27;
        return false;
    L27:
        if (this.f85f == r82.f85f) goto L30;
        return false;
    L30:
        if (this.f86g == r82.f86g) goto L33;
        return false;
    L33:
        if (this.f87h == r82.f87h) goto L35;
        return false;
    L35:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f81a.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.f82b, r02, 31);
        int r2 = (this.f83c.hashCode() + r03) * 961;
        int r04 = AbstractC4230a.a(this.d, r2, 31);
        int r05 = AbstractC4230a.a(this.f84e, r04, 31);
        int r06 = AbstractC4231b.a(this.f85f, r05, 31);
        int r07 = AbstractC4231b.a(this.f86g, r06, 31);
        return Long.hashCode(this.f87h) + r07;
    }

    public final String toString() {
        return "OneKycCSNetworkConfig(apiKey=" + this.f81a + ", endPoint=" + this.f82b + ", headers=" + this.f83c + ", okHttpClient=null, maxRetriesPerBatch=" + this.d + ", minBatteryLevelPercent=" + this.f84e + ", maxRequestAckTimeoutInMs=" + this.f85f + ", maxConnectionRetryIntervalInMs=" + this.f86g + ", maxPingIntervalInMs=" + this.f87h + ")";
    }
}
