package com.stockbit.domain.model.financial;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f84048a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84049b;

    public e(int r2, List r3) {
        p.l(r3, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f84048a = r2;
        this.f84049b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f84048a == r52.f84048a) goto L12;
        return false;
    L12:
        if (p.g(this.f84049b, r52.f84049b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f84048a) * 31) + this.f84049b.hashCode();
    }

    public String toString() {
        return "Top20Entity(type=" + this.f84048a + ", data=" + this.f84049b + ")";
    }
}
