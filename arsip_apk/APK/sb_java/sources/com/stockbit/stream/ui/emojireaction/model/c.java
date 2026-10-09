package com.stockbit.stream.ui.emojireaction.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f142893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f142894b;

    /* renamed from: c, reason: collision with root package name */
    public final String f142895c;

    static {
    }

    public c(String r2, String r3, String r4) {
        p.l(r2, "avatarUrl");
        p.l(r3, "username");
        p.l(r4, "emoji");
        this.f142893a = r2;
        this.f142894b = r3;
        this.f142895c = r4;
    }

    public final String a() {
        return this.f142893a;
    }

    public final String b() {
        return this.f142895c;
    }

    public final String c() {
        return this.f142894b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f142893a, r52.f142893a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f142894b, r52.f142894b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f142895c, r52.f142895c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f142893a.hashCode() * 31) + this.f142894b.hashCode()) * 31) + this.f142895c.hashCode();
    }

    public String toString() {
        return "EmojiReactionListUserUiState(avatarUrl=" + this.f142893a + ", username=" + this.f142894b + ", emoji=" + this.f142895c + ')';
    }
}
