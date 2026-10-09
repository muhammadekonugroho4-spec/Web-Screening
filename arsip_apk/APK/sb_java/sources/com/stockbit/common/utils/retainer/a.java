package com.stockbit.common.utils.retainer;

import android.view.View;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f62393a;

    /* renamed from: b, reason: collision with root package name */
    public View f62394b;

    static {
    }

    public a() {
        this.f62393a = true;
    }

    public boolean a() {
        return this.f62393a;
    }

    public View b(kotlin.jvm.functions.a r2) {
        p.l(r2, "viewInflater");
        if (this.f62394b != null) goto L5;
        this.f62393a = true;
        this.f62394b = (View) r2.invoke();
    L6:
        View r02 = this.f62394b;
        if (r02 == null) goto L9;
        return r02;
    L9:
        return (View) r2.invoke();
    L5:
        this.f62393a = false;
        goto L6
    }
}
