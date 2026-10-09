package com.stockbit.usecase.chat.model.newchat;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f155586a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155587b;

    public d(List r2, String r3) {
        p.l(r2, "members");
        p.l(r3, "cursor");
        this.f155586a = r2;
        this.f155587b = r3;
    }

    public final String a() {
        return this.f155587b;
    }

    public final List b() {
        return this.f155586a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f155586a, r52.f155586a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155587b, r52.f155587b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f155586a.hashCode() * 31) + this.f155587b.hashCode();
    }

    public String toString() {
        return "SuggestedContactsUIState(members=" + this.f155586a + ", cursor=" + this.f155587b + ")";
    }
}
