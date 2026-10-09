package com.stockbit.usecase.notification.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f158646a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158647b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158648c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158649e;

    public f(String r2, String r3, boolean r4, String r5, String r6) {
        p.l(r2, "type");
        p.l(r3, "typeTrackerValue");
        p.l(r5, "info");
        p.l(r6, Constants.ScionAnalytics.PARAM_LABEL);
        this.f158646a = r2;
        this.f158647b = r3;
        this.f158648c = r4;
        this.d = r5;
        this.f158649e = r6;
    }

    public static /* synthetic */ f b(f r02, String r1, String r2, boolean r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f158646a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f158647b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f158648c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f158649e;
    L17:
        String r62 = r4;
        String r72 = r5;
        boolean r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72);
    }

    public final f a(String r8, String r9, boolean r10, String r11, String r12) {
        p.l(r8, "type");
        p.l(r9, "typeTrackerValue");
        p.l(r11, "info");
        p.l(r12, Constants.ScionAnalytics.PARAM_LABEL);
        return new f(r8, r9, r10, r11, r12);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f158646a;
    }

    public final String e() {
        return this.f158647b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f158646a, r52.f158646a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158647b, r52.f158647b) == true) goto L15;
        return false;
    L15:
        if (this.f158648c == r52.f158648c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f158649e, r52.f158649e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final boolean f() {
        return this.f158648c;
    }

    @Override // com.stockbit.usecase.notification.model.g
    public String getLabel() {
        return this.f158649e;
    }

    public int hashCode() {
        return (((((((this.f158646a.hashCode() * 31) + this.f158647b.hashCode()) * 31) + Boolean.hashCode(this.f158648c)) * 31) + this.d.hashCode()) * 31) + this.f158649e.hashCode();
    }

    public String toString() {
        return "NotificationSettingSectionUIState(type=" + this.f158646a + ", typeTrackerValue=" + this.f158647b + ", isEnable=" + this.f158648c + ", info=" + this.d + ", label=" + this.f158649e + ")";
    }
}
