package com.stockbit.common.uikit.keyboard.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0636a f61830a = null;

    /* renamed from: com.stockbit.common.uikit.keyboard.utilities.a$a, reason: collision with other inner class name */
    public static final class C0636a {
        public /* synthetic */ C0636a(i r1) {
            this();
        }

        public final void a(EditText r3, boolean r4, int r5) {
            p.l(r3, "field");
            if (r4 == false) goto L5;
            r3.setMaxLines(1);
            r3.setSingleLine(true);
        L5:
            r3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(r5)});
        }

        public final int b(Context r3, int r4) {
            p.l(r3, "context");
            return (int) (TypedValue.applyDimension(1, r4, r3.getResources().getDisplayMetrics()) / r3.getResources().getDisplayMetrics().density);
        }

        public final void c(Context r2, View r3) {
            p.l(r2, "context");
            p.l(r3, "view");
            if (r3.getWindowToken() == null) goto L6;
            Object r22 = r2.getSystemService("input_method");
            p.j(r22, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) r22).hideSoftInputFromWindow(r3.getWindowToken(), 0);
            return;
        }

        public final int d(Context r3, int r4) {
            p.l(r3, "context");
            return (int) (TypedValue.applyDimension(0, r4, r3.getResources().getDisplayMetrics()) * r3.getResources().getDisplayMetrics().density);
        }

        public final void e(View r2, int r3) {
            p.l(r2, "view");
            Drawable r22 = androidx.core.graphics.drawable.a.r(r2.getBackground());
            p.k(r22, "wrap(...)");
            androidx.core.graphics.drawable.a.n(r22, r3);
        }

        public C0636a() {
        }
    }

    static {
        f61830a = new C0636a(null);
    }
}
