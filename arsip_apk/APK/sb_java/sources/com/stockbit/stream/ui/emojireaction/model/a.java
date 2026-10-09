package com.stockbit.stream.ui.emojireaction.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f142886a;

    /* renamed from: b, reason: collision with root package name */
    public final String f142887b;

    static {
    }

    public a(String r2, String r3) {
        p.l(r2, "emoji");
        p.l(r3, "totalLabel");
        this.f142886a = r2;
        this.f142887b = r3;
    }

    public final String a() {
        return this.f142886a;
    }

    public final String b() {
        return this.f142887b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f142886a, r52.f142886a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f142887b, r52.f142887b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f142886a.hashCode() * 31) + this.f142887b.hashCode();
    }

    public String toString() {
        return "EmojiReactionDialogFilterUiState(emoji=" + this.f142886a + ", totalLabel=" + this.f142887b + ')';
    }
}
