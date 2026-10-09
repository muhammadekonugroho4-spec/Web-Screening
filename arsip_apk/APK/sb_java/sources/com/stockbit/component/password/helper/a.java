package com.stockbit.component.password.helper;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a(Context r1, View r2) {
        p.l(r1, "<this>");
        p.l(r2, "view");
        Object r12 = r1.getSystemService("input_method");
        p.j(r12, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) r12).hideSoftInputFromWindow(r2.getWindowToken(), 0);
    }
}
