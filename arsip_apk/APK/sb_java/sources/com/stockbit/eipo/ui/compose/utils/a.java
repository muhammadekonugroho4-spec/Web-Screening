package com.stockbit.eipo.ui.compose.utils;

import android.content.Context;
import com.stockbit.common.utils.C5860j;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: com.stockbit.eipo.ui.compose.utils.a$a, reason: collision with other inner class name */
    public static final class C0868a implements C5860j.a {
        public C0868a() {
        }

        @Override // com.stockbit.common.utils.C5860j.a
        public void a() {
        }

        @Override // com.stockbit.common.utils.C5860j.a
        public void b(String r2) {
            p.l(r2, "url");
        }
    }

    public static final void a(Context r2, String r3) {
        p.l(r2, "<this>");
        p.l(r3, "url");
        new C5860j().e(r2, r3, new C0868a());
    }
}
