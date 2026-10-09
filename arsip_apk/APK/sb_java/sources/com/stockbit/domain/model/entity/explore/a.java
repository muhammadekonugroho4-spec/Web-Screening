package com.stockbit.domain.model.entity.explore;

import com.stockbit.domain.model.entity.stream.VerifiedStatusType;
import com.stockbit.domain.model.entity.userprofile.Profile;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f82744a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82745b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82746c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82747e;

    /* renamed from: f, reason: collision with root package name */
    public final Profile f82748f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82749g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f82750h;

    /* renamed from: i, reason: collision with root package name */
    public final VerifiedStatusType f82751i;

    public a(String r2, String r3, String r4, String r5, boolean r6, Profile r7, boolean r8, boolean r9, VerifiedStatusType r10) {
        p.l(r10, "verifiedStatusType");
        this.f82744a = r2;
        this.f82745b = r3;
        this.f82746c = r4;
        this.d = r5;
        this.f82747e = r6;
        this.f82748f = r7;
        this.f82749g = r8;
        this.f82750h = r9;
        this.f82751i = r10;
    }

    public final String a() {
        return this.f82746c;
    }

    public final Profile b() {
        return this.f82748f;
    }

    public final VerifiedStatusType c() {
        return this.f82751i;
    }

    public final boolean d() {
        return this.f82747e;
    }

    public final boolean e() {
        return this.f82750h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f82744a, r52.f82744a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82745b, r52.f82745b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82746c, r52.f82746c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f82747e == r52.f82747e) goto L24;
        return false;
    L24:
        if (p.g(this.f82748f, r52.f82748f) == true) goto L27;
        return false;
    L27:
        if (this.f82749g == r52.f82749g) goto L30;
        return false;
    L30:
        if (this.f82750h == r52.f82750h) goto L33;
        return false;
    L33:
        if (this.f82751i == r52.f82751i) goto L35;
        return false;
    L35:
        return true;
    }

    public final void f(boolean r1) {
        this.f82747e = r1;
    }

    public int hashCode() {
        String r02 = this.f82744a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82745b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82746c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (((r06 + r26) * 31) + Boolean.hashCode(this.f82747e)) * 31;
        Profile r27 = this.f82748f;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return ((((((r07 + r1) * 31) + Boolean.hashCode(this.f82749g)) * 31) + Boolean.hashCode(this.f82750h)) * 31) + this.f82751i.hashCode();
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "SuggestedUser(point=" + this.f82744a + ", lastActivity=" + this.f82745b + ", reason=" + this.f82746c + ", type=" + this.d + ", isFollowed=" + this.f82747e + ", user=" + this.f82748f + ", isTrendingDay=" + this.f82749g + ", isLoggedInUser=" + this.f82750h + ", verifiedStatusType=" + this.f82751i + ')';
    }

    public /* synthetic */ a(String r3, String r4, String r5, String r6, boolean r7, Profile r8, boolean r9, boolean r10, VerifiedStatusType r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = null;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = null;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = null;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = false;
    L27:
        if ((r12 & 256) == 0) goto L29;
        r11 = VerifiedStatusType.VERIFIED_STATUS_UNVERIFIED;
    L29:
        VerifiedStatusType r122 = r11;
        boolean r112 = r10;
        boolean r102 = r9;
        Profile r92 = r8;
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122);
    }
}
