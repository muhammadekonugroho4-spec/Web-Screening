package com.iab.digitalidentity.ui.theme.widgets.onboarding;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.iab.digitalidentity.ui.theme.commons.b f40958a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f40959b;

    public a(com.iab.digitalidentity.ui.theme.commons.b r2, Boolean r3) {
        p.l(r2, "background");
        this.f40958a = r2;
        this.f40959b = r3;
    }

    public final com.iab.digitalidentity.ui.theme.commons.b a() {
        return this.f40958a;
    }

    public final Boolean b() {
        return this.f40959b;
    }

    public final void c(a r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        this.f40958a.e(r3.f40958a);
        Boolean r32 = r3.f40959b;
        if (r32 != null) goto L7;
        r32 = this.f40959b;
    L7:
        this.f40959b = r32;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f40958a, r52.f40958a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40959b, r52.f40959b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f40958a.hashCode() * 31;
        Boolean r1 = this.f40959b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "DigitalIdentityHomeHeader(background=" + this.f40958a + ", showPattern=" + this.f40959b + ")";
    }

    public /* synthetic */ a(com.iab.digitalidentity.ui.theme.commons.b r8, Boolean r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r8 = new com.iab.digitalidentity.ui.theme.commons.b(null, null, null, null, 15, null);
    L6:
        if ((r10 & 2) == 0) goto L8;
        r9 = null;
    L8:
        this(r8, r9);
    }
}
