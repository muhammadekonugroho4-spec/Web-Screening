package com.stockbit.usecase.chat.model.giphy;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f155519a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155521c;
    public final a d;

    public c(String r2, String r3, String r4, a r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "previewUrl");
        p.l(r4, "displayUrl");
        this.f155519a = r2;
        this.f155520b = r3;
        this.f155521c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f155519a;
    }

    public final a b() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f155519a, r52.f155519a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155520b, r52.f155520b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155521c, r52.f155521c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.f155519a.hashCode() * 31) + this.f155520b.hashCode()) * 31) + this.f155521c.hashCode()) * 31;
        a r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "GiphyUIState(id=" + this.f155519a + ", previewUrl=" + this.f155520b + ", displayUrl=" + this.f155521c + ", images=" + this.d + ")";
    }
}
