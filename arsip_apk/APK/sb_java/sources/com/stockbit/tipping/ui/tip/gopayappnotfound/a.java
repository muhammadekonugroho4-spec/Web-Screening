package com.stockbit.tipping.ui.tip.gopayappnotfound;

import com.stockbit.calendar.CalendarEntryPoint;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.tipping.ui.tip.gopayappnotfound.a$a, reason: collision with other inner class name */
    public static final class C1327a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f146135a;

        public C1327a(String r2) {
            p.l(r2, CalendarEntryPoint.KEY_PAGE_DETAIL);
            super(null);
            this.f146135a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1327a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f146135a, ((C1327a) r4).f146135a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f146135a.hashCode();
        }

        public String toString() {
            return "OpenGojekInPlaystore(page=" + this.f146135a + ')';
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
