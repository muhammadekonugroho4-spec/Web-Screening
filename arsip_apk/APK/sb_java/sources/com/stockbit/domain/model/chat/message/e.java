package com.stockbit.domain.model.chat.message;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f81295a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81296b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81297c;
    public final c d;

    public e(List r2, boolean r3, List r4, c r5) {
        p.l(r2, "messages");
        p.l(r4, "mentionedMessageIds");
        p.l(r5, "cursor");
        this.f81295a = r2;
        this.f81296b = r3;
        this.f81297c = r4;
        this.d = r5;
    }

    public final c a() {
        return this.d;
    }

    public final List b() {
        return this.f81297c;
    }

    public final List c() {
        return this.f81295a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f81295a, r52.f81295a) == true) goto L12;
        return false;
    L12:
        if (this.f81296b == r52.f81296b) goto L15;
        return false;
    L15:
        if (p.g(this.f81297c, r52.f81297c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81295a.hashCode() * 31) + Boolean.hashCode(this.f81296b)) * 31) + this.f81297c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MessagesEntity(messages=" + this.f81295a + ", isMore=" + this.f81296b + ", mentionedMessageIds=" + this.f81297c + ", cursor=" + this.d + ")";
    }
}
