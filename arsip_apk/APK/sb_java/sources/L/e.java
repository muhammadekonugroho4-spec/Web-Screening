package L;

import androidx.core.app.NotificationCompat;
import com.iab.digitalidentity.sdk.core.constants.DigitalIdentityExtraData;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f923a;

    /* renamed from: b, reason: collision with root package name */
    public final DigitalIdentityExtraData f924b;

    public e(f r2, DigitalIdentityExtraData r3) {
        kotlin.jvm.internal.p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f923a = r2;
        this.f924b = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f923a == r52.f923a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f924b, r52.f924b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f923a.hashCode() * 31;
        DigitalIdentityExtraData r1 = this.f924b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "OneKycFlowResult(status=" + this.f923a + ", extra=" + this.f924b + ")";
    }
}
