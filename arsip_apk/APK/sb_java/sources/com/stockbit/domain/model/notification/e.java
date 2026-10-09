package com.stockbit.domain.model.notification;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f84510a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84511b;

    /* renamed from: c, reason: collision with root package name */
    public final List f84512c;

    public e(String r2, String r3, List r4) {
        p.l(r2, "groupName");
        p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r4, "settingList");
        this.f84510a = r2;
        this.f84511b = r3;
        this.f84512c = r4;
    }

    public final String a() {
        return this.f84511b;
    }

    public final List b() {
        return this.f84512c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f84510a, r52.f84510a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84511b, r52.f84511b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84512c, r52.f84512c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84510a.hashCode() * 31) + this.f84511b.hashCode()) * 31) + this.f84512c.hashCode();
    }

    public String toString() {
        return "NotificationSettingGroupEntity(groupName=" + this.f84510a + ", label=" + this.f84511b + ", settingList=" + this.f84512c + ")";
    }
}
