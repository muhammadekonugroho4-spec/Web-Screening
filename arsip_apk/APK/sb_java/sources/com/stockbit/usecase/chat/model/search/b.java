package com.stockbit.usecase.chat.model.search;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f155621a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155622b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155623c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f155624e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f155625f;

    /* renamed from: g, reason: collision with root package name */
    public final String f155626g;

    public b(String r2, boolean r3, String r4, String r5, boolean r6, boolean r7, String r8) {
        p.l(r2, Constants.KEY_ID);
        p.l(r4, "permalink");
        p.l(r5, "type");
        p.l(r8, Constants.ScionAnalytics.PARAM_LABEL);
        this.f155621a = r2;
        this.f155622b = r3;
        this.f155623c = r4;
        this.d = r5;
        this.f155624e = r6;
        this.f155625f = r7;
        this.f155626g = r8;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f155621a, r52.f155621a) == true) goto L12;
        return false;
    L12:
        if (this.f155622b == r52.f155622b) goto L15;
        return false;
    L15:
        if (p.g(this.f155623c, r52.f155623c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155624e == r52.f155624e) goto L24;
        return false;
    L24:
        if (this.f155625f == r52.f155625f) goto L27;
        return false;
    L27:
        if (p.g(this.f155626g, r52.f155626g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f155621a.hashCode() * 31) + Boolean.hashCode(this.f155622b)) * 31) + this.f155623c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f155624e)) * 31) + Boolean.hashCode(this.f155625f)) * 31) + this.f155626g.hashCode();
    }

    public String toString() {
        return "SearchInsiderUIState(id=" + this.f155621a + ", isTradeable=" + this.f155622b + ", permalink=" + this.f155623c + ", type=" + this.d + ", isFollowed=" + this.f155624e + ", isOfficial=" + this.f155625f + ", label=" + this.f155626g + ")";
    }
}
