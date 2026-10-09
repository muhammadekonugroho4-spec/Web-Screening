package com.stockbit.domain.model.chat;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final GroupSettings f81194a;

    /* renamed from: b, reason: collision with root package name */
    public final PersonalSettings f81195b;

    public b(GroupSettings r2, PersonalSettings r3) {
        p.l(r2, "groupSettings");
        p.l(r3, "personalSettings");
        this.f81194a = r2;
        this.f81195b = r3;
    }

    public final GroupSettings a() {
        return this.f81194a;
    }

    public final PersonalSettings b() {
        return this.f81195b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f81194a == r52.f81194a) goto L12;
        return false;
    L12:
        if (this.f81195b == r52.f81195b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81194a.hashCode() * 31) + this.f81195b.hashCode();
    }

    public String toString() {
        return "ChatPrivacySettingsEntity(groupSettings=" + this.f81194a + ", personalSettings=" + this.f81195b + ")";
    }
}
