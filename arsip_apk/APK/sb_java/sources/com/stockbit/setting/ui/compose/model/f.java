package com.stockbit.setting.ui.compose.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f135859a;

    static {
    }

    public f(List r2) {
        p.l(r2, "groupStates");
        this.f135859a = r2;
    }

    public final List a() {
        return this.f135859a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f135859a, ((f) r4).f135859a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f135859a.hashCode();
    }

    public String toString() {
        return "SettingMenuUiState(groupStates=" + this.f135859a + ')';
    }
}
