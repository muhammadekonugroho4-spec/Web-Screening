package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.chat.resource.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10869j {

    /* renamed from: com.stockbit.usecase.chat.resource.j$a */
    public static final class a extends AbstractC10869j {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155794a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155794a = r2;
        }

        public final DomainExodusException a() {
            return this.f155794a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155794a, ((a) r4).f155794a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155794a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155794a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.j$b */
    public static final class b extends AbstractC10869j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155795a = null;

        static {
            f155795a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.j$c */
    public static final class c extends AbstractC10869j {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155796a = null;

        static {
            f155796a = new c();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10869j(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10869j() {
    }
}
