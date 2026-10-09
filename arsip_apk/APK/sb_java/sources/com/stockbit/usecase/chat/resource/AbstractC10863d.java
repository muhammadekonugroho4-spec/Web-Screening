package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.chat.resource.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10863d {

    /* renamed from: com.stockbit.usecase.chat.resource.d$a */
    public static final class a extends AbstractC10863d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155778a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155778a = r2;
        }

        public final DomainExodusException a() {
            return this.f155778a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155778a, ((a) r4).f155778a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155778a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155778a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.d$b */
    public static final class b extends AbstractC10863d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155779a = null;

        static {
            f155779a = new b();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10863d(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10863d() {
    }
}
