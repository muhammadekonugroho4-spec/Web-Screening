package com.stockbit.domain.model.ktur;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f84214a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84215b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84216c;
    public final String d;

    public b(List r2, String r3, String r4, String r5) {
        p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        p.l(r3, "paginationNextCursor");
        p.l(r4, "paginationPrevCursor");
        p.l(r5, "paginationLimit");
        this.f84214a = r2;
        this.f84215b = r3;
        this.f84216c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.f84214a;
    }

    public final String b() {
        return this.f84215b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f84214a, r52.f84214a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84215b, r52.f84215b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84216c, r52.f84216c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84214a.hashCode() * 31) + this.f84215b.hashCode()) * 31) + this.f84216c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "KturListEntity(data=" + this.f84214a + ", paginationNextCursor=" + this.f84215b + ", paginationPrevCursor=" + this.f84216c + ", paginationLimit=" + this.d + ")";
    }
}
