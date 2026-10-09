package com.stockbit.domain.model.stream.emojireaction;

import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC11777v;
import kotlin.collections.S;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f85832a;

    /* renamed from: b, reason: collision with root package name */
    public final List f85833b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f85834c;

    public a(List r2, List r3, Map r4) {
        p.l(r2, "likeReactions");
        p.l(r3, "dislikeReactions");
        p.l(r4, "backgroundColors");
        this.f85832a = r2;
        this.f85833b = r3;
        this.f85834c = r4;
    }

    public final Map a() {
        return this.f85834c;
    }

    public final List b() {
        return this.f85833b;
    }

    public final List c() {
        return this.f85832a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85832a, r52.f85832a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85833b, r52.f85833b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85834c, r52.f85834c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85832a.hashCode() * 31) + this.f85833b.hashCode()) * 31) + this.f85834c.hashCode();
    }

    public String toString() {
        return "StreamPopupEmojiReactionEntity(likeReactions=" + this.f85832a + ", dislikeReactions=" + this.f85833b + ", backgroundColors=" + this.f85834c + ")";
    }

    public /* synthetic */ a(List r1, List r2, Map r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = AbstractC11777v.o();
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = AbstractC11777v.o();
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = S.j();
    L11:
        this(r1, r2, r3);
    }
}
