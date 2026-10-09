package com.stockbit.stream.ui.compose;

import com.stockbit.domain.model.stream.emojireaction.StreamReactionBackgroundColor;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f142083a;

    /* renamed from: b, reason: collision with root package name */
    public final StreamReactionBackgroundColor f142084b;

    static {
    }

    public d(String r2, StreamReactionBackgroundColor r3) {
        kotlin.jvm.internal.p.l(r2, "emoji");
        kotlin.jvm.internal.p.l(r3, "backgroundColor");
        this.f142083a = r2;
        this.f142084b = r3;
    }

    public final StreamReactionBackgroundColor a() {
        return this.f142084b;
    }

    public final String b() {
        return this.f142083a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f142083a, r52.f142083a) == true) goto L12;
        return false;
    L12:
        if (this.f142084b == r52.f142084b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f142083a.hashCode() * 31) + this.f142084b.hashCode();
    }

    public String toString() {
        return "FeaturedReactionUiState(emoji=" + this.f142083a + ", backgroundColor=" + this.f142084b + ')';
    }
}
