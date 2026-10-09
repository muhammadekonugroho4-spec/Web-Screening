package c;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4247e {

    /* renamed from: a, reason: collision with root package name */
    public final List f29752a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29753b;

    public C4247e(List r3, List r4) {
        p.l("0", "minTrackedVersion");
        p.l(r3, "randomUserIdRemainder");
        p.l(r4, FirebaseAnalytics.Param.DESTINATION);
        p.l("maximum", "verbosityLevel");
        this.f29752a = r3;
        this.f29753b = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4247e) == true) goto L8;
        return false;
    L8:
        C4247e r52 = (C4247e) r5;
        r52.getClass();
        if (p.g("0", "0") == true) goto L12;
        return false;
    L12:
        if (p.g(this.f29752a, r52.f29752a) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f29753b, r52.f29753b) == true) goto L18;
        return false;
    L18:
        if (p.g("maximum", "maximum") == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = (this.f29752a.hashCode() + 1488) * 31;
        return (((this.f29753b.hashCode() + r02) * 31) + 844740128) * 31;
    }

    public final String toString() {
        return "CSHealthEventConfig(minTrackedVersion=0, randomUserIdRemainder=" + this.f29752a + ", destination=" + this.f29753b + ", verbosityLevel=maximum, verboseNetworkErrorTrackingEnabled=false)";
    }
}
