package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.chat.resource.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10868i {

    /* renamed from: com.stockbit.usecase.chat.resource.i$a */
    public static final class a extends AbstractC10868i {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155791a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155791a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155791a, ((a) r4).f155791a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155791a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155791a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.i$b */
    public static final class b extends AbstractC10868i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155792a = null;

        static {
            f155792a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.i$c */
    public static final class c extends AbstractC10868i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f155793a = null;

        static {
            f155793a = new c();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10868i(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10868i() {
    }
}
