package com.iab.digitalidentity.ui.button;

import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public abstract class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public static final a f40604a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f40605b;

    /* renamed from: c, reason: collision with root package name */
    public static final Runnable f40606c = null;
    public static final Handler d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final long f40607e = 0;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f40604a = new a(null);
        f40605b = true;
        f40606c = new com.iab.digitalidentity.ui.button.a();
        d = new Handler();
        f40607e = 500;
    }

    public b() {
    }

    public static /* synthetic */ void a() {
        b();
    }

    public static final void b() {
        f40605b = true;
    }

    public abstract void c(View r1);

    @Override // android.view.View.OnClickListener
    public void onClick(View r5) {
        p.l(r5, "view");
        if (f40605b == false) goto L6;
        f40605b = false;
        d.postDelayed(f40606c, f40607e);
        c(r5);
        return;
    }
}
