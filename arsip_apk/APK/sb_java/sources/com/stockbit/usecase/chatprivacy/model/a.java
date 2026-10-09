package com.stockbit.usecase.chatprivacy.model;

import com.stockbit.domain.model.chat.PersonalSettings;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PersonalSettings f155999a;

    public a(PersonalSettings r2) {
        p.l(r2, "personalSetting");
        this.f155999a = r2;
    }

    public final PersonalSettings a() {
        return this.f155999a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (this.f155999a == ((a) r4).f155999a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f155999a.hashCode();
    }

    public String toString() {
        return "PersonalChatSettingsUIState(personalSetting=" + this.f155999a + ")";
    }
}
