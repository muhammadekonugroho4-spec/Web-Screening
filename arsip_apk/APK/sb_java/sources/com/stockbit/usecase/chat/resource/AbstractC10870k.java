package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* renamed from: com.stockbit.usecase.chat.resource.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10870k {

    /* renamed from: com.stockbit.usecase.chat.resource.k$a */
    public static final class a extends AbstractC10870k {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155797a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155797a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155797a, ((a) r4).f155797a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155797a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155797a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.k$b */
    public static final class b extends AbstractC10870k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155798a = null;

        static {
            f155798a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.chat.resource.k$c */
    public static final class c extends AbstractC10870k {

        /* renamed from: a, reason: collision with root package name */
        public final List f155799a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, "filterType");
            super(null);
            this.f155799a = r2;
        }

        public final List a() {
            return this.f155799a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155799a, ((c) r4).f155799a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155799a.hashCode();
        }

        public String toString() {
            return "Success(filterType=" + this.f155799a + ")";
        }
    }

    public /* synthetic */ AbstractC10870k(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC10870k() {
    }
}
