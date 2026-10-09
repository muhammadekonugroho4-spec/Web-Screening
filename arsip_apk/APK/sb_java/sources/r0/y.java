package r0;

import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$UiMessageData;

/* loaded from: classes3.dex */
public final class y extends G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f183418a;

    /* renamed from: b, reason: collision with root package name */
    public final UnifiedKycResponse$UiMessageData f183419b;

    public y(boolean r2, UnifiedKycResponse$UiMessageData r3) {
        kotlin.jvm.internal.p.l(r3, "messageData");
        this.f183418a = r2;
        this.f183419b = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof y) == true) goto L8;
        return false;
    L8:
        y r52 = (y) r5;
        if (this.f183418a == r52.f183418a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f183419b, r52.f183419b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean r02 = this.f183418a;
        ?? r03 = r02;
        if (r02 == false) goto L5;
        r03 = 1;
    L5:
        int r1 = this.f183419b.hashCode();
        return r1 + (r03 * 31);
    }

    public final String toString() {
        return "OneKycBlocked(isFraud=" + this.f183418a + ", messageData=" + this.f183419b + ")";
    }
}
