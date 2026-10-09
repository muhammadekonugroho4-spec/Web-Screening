package com.stockbit.usecase.chat.param;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.usecase.chat.model.group.GroupRequirementUIState;
import java.io.File;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f155724a;

    /* renamed from: b, reason: collision with root package name */
    public final File f155725b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155726c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155727e;

    /* renamed from: f, reason: collision with root package name */
    public final GroupRequirementUIState f155728f;

    public c(String r2, File r3, String r4, String r5, String r6, GroupRequirementUIState r7) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "description");
        p.l(r6, "groupId");
        this.f155724a = r2;
        this.f155725b = r3;
        this.f155726c = r4;
        this.d = r5;
        this.f155727e = r6;
        this.f155728f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f155724a;
    }

    public final String c() {
        return this.f155727e;
    }

    public final File d() {
        return this.f155725b;
    }

    public final GroupRequirementUIState e() {
        return this.f155728f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f155724a, r52.f155724a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155725b, r52.f155725b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155726c, r52.f155726c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f155727e, r52.f155727e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f155728f, r52.f155728f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f155726c;
    }

    public int hashCode() {
        String r02 = this.f155724a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        File r2 = this.f155725b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (((((((r04 + r22) * 31) + this.f155726c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f155727e.hashCode()) * 31;
        GroupRequirementUIState r23 = this.f155728f;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UpdateGroupDomainParam(existingAvatar=" + this.f155724a + ", imageFile=" + this.f155725b + ", name=" + this.f155726c + ", description=" + this.d + ", groupId=" + this.f155727e + ", joinSetting=" + this.f155728f + ")";
    }
}
