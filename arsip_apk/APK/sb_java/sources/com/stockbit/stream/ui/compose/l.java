package com.stockbit.stream.ui.compose;

import java.util.List;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f142114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f142115b;

    /* renamed from: c, reason: collision with root package name */
    public final k f142116c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f142117e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f142118f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f142119g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.jvm.functions.l f142120h;

    static {
    }

    public l(int r2, String r3, k r4, List r5, List r6, boolean r7, boolean r8, kotlin.jvm.functions.l r9) {
        kotlin.jvm.internal.p.l(r3, "totalComments");
        kotlin.jvm.internal.p.l(r4, "reaction");
        kotlin.jvm.internal.p.l(r5, "likeEmojiReactions");
        kotlin.jvm.internal.p.l(r6, "dislikeEmojiReactions");
        kotlin.jvm.internal.p.l(r9, "onAction");
        this.f142114a = r2;
        this.f142115b = r3;
        this.f142116c = r4;
        this.d = r5;
        this.f142117e = r6;
        this.f142118f = r7;
        this.f142119g = r8;
        this.f142120h = r9;
    }

    public final List a() {
        return this.f142117e;
    }

    public final List b() {
        return this.d;
    }

    public final kotlin.jvm.functions.l c() {
        return this.f142120h;
    }

    public final k d() {
        return this.f142116c;
    }

    public final int e() {
        return this.f142114a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (this.f142114a == r52.f142114a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f142115b, r52.f142115b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f142116c, r52.f142116c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f142117e, r52.f142117e) == true) goto L24;
        return false;
    L24:
        if (this.f142118f == r52.f142118f) goto L27;
        return false;
    L27:
        if (this.f142119g == r52.f142119g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f142120h, r52.f142120h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f142115b;
    }

    public final boolean g() {
        return this.f142119g;
    }

    public final boolean h() {
        return this.f142118f;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f142114a) * 31) + this.f142115b.hashCode()) * 31) + this.f142116c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f142117e.hashCode()) * 31) + Boolean.hashCode(this.f142118f)) * 31) + Boolean.hashCode(this.f142119g)) * 31) + this.f142120h.hashCode();
    }

    public String toString() {
        return "StreamFooterUiState(topEdgePx=" + this.f142114a + ", totalComments=" + this.f142115b + ", reaction=" + this.f142116c + ", likeEmojiReactions=" + this.d + ", dislikeEmojiReactions=" + this.f142117e + ", isTippingVisible=" + this.f142118f + ", isCommentEnabled=" + this.f142119g + ", onAction=" + this.f142120h + ')';
    }
}
