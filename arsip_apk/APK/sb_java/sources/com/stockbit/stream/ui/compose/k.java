package com.stockbit.stream.ui.compose;

import com.stockbit.domain.model.stream.emojireaction.StreamReactionSide;
import java.util.List;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f142110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f142111b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f142112c;
    public final StreamReactionSide d;

    /* renamed from: e, reason: collision with root package name */
    public final List f142113e;

    static {
    }

    public k(int r2, String r3, boolean r4, StreamReactionSide r5, List r6) {
        kotlin.jvm.internal.p.l(r5, "side");
        kotlin.jvm.internal.p.l(r6, "currentReactions");
        this.f142110a = r2;
        this.f142111b = r3;
        this.f142112c = r4;
        this.d = r5;
        this.f142113e = r6;
    }

    public final List a() {
        return this.f142113e;
    }

    public final String b() {
        return this.f142111b;
    }

    public final boolean c() {
        return this.f142112c;
    }

    public final StreamReactionSide d() {
        return this.d;
    }

    public final int e() {
        return this.f142110a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (this.f142110a == r52.f142110a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f142111b, r52.f142111b) == true) goto L15;
        return false;
    L15:
        if (this.f142112c == r52.f142112c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f142113e, r52.f142113e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f142110a) * 31;
        String r1 = this.f142111b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((r02 + r12) * 31) + Boolean.hashCode(this.f142112c)) * 31) + this.d.hashCode()) * 31) + this.f142113e.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "StreamFooterReactionUiState(total=" + this.f142110a + ", myReaction=" + this.f142111b + ", oneTapReaction=" + this.f142112c + ", side=" + this.d + ", currentReactions=" + this.f142113e + ')';
    }
}
