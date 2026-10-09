package com.stockbit.usecase.notification.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158617b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158618c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f158619e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158620f;

    public a(String r2, String r3, String r4, String r5, Integer r6, String r7) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, Constants.KEY_TITLE);
        p.l(r4, "description");
        p.l(r5, Constants.KEY_ICON);
        p.l(r7, "viewType");
        this.f158616a = r2;
        this.f158617b = r3;
        this.f158618c = r4;
        this.d = r5;
        this.f158619e = r6;
        this.f158620f = r7;
    }

    public final String a() {
        return this.f158618c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f158616a;
    }

    public final Integer d() {
        return this.f158619e;
    }

    public final String e() {
        return this.f158617b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f158616a, r52.f158616a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158617b, r52.f158617b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158618c, r52.f158618c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f158619e, r52.f158619e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f158620f, r52.f158620f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f158620f;
    }

    public int hashCode() {
        int r02 = ((((((this.f158616a.hashCode() * 31) + this.f158617b.hashCode()) * 31) + this.f158618c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Integer r1 = this.f158619e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f158620f.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "NotificationInAppUIState(id=" + this.f158616a + ", title=" + this.f158617b + ", description=" + this.f158618c + ", icon=" + this.d + ", localIconRes=" + this.f158619e + ", viewType=" + this.f158620f + ")";
    }

    public /* synthetic */ a(String r8, String r9, String r10, String r11, Integer r12, String r13, int r14, i r15) {
        if ((r14 & 16) == 0) goto L5;
        r12 = null;
    L5:
        Integer r5 = r12;
        if ((r14 & 32) == 0) goto L8;
        r13 = "";
    L8:
        this(r8, r9, r10, r11, r5, r13);
    }
}
