package p;

import androidx.core.app.NotificationCompat;
import f.C11390a;
import java.util.Map;

/* loaded from: classes3.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final String f183083a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f183084b;

    /* renamed from: c, reason: collision with root package name */
    public final C11390a f183085c;

    public M(String r2, Map r3, C11390a r4) {
        kotlin.jvm.internal.p.l(r2, "eventName");
        kotlin.jvm.internal.p.l(r3, "eventProperties");
        kotlin.jvm.internal.p.l(r4, NotificationCompat.CATEGORY_EVENT);
        this.f183083a = r2;
        this.f183084b = r3;
        this.f183085c = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof M) == true) goto L8;
        return false;
    L8:
        M r52 = (M) r5;
        if (kotlin.jvm.internal.p.g(this.f183083a, r52.f183083a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f183084b, r52.f183084b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f183085c, r52.f183085c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f183083a.hashCode() * 31;
        int r1 = (this.f183084b.hashCode() + r02) * 31;
        return this.f183085c.hashCode() + r1;
    }

    public final String toString() {
        return "CSEventListenerData(eventName=" + this.f183083a + ", eventProperties=" + this.f183084b + ", event=" + this.f183085c + ')';
    }
}
