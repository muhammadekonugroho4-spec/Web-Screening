package com.stockbit.setting.ui.compose.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f135842a;

    /* renamed from: b, reason: collision with root package name */
    public final List f135843b;

    static {
    }

    public a(Integer r2, List r3) {
        p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f135842a = r2;
        this.f135843b = r3;
    }

    public final Integer a() {
        return this.f135842a;
    }

    public final List b() {
        return this.f135843b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f135842a, r52.f135842a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f135843b, r52.f135843b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f135842a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f135843b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "SettingMenuGroupUiState(headerTitle=" + this.f135842a + ", items=" + this.f135843b + ')';
    }

    public /* synthetic */ a(Integer r1, List r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1, r2);
    }
}
