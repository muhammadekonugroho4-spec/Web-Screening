package com.stockbit.usecase.screener.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f159783a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159783a = r2;
        }

        public final DomainExodusException a() {
            return this.f159783a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159783a, ((a) r4).f159783a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159783a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159783a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159784a = null;

        static {
            f159784a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final List f159785a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f159785a = r2;
        }

        public final List a() {
            return this.f159785a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159785a, ((c) r4).f159785a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159785a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f159785a + ")";
        }
    }

    public static final class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f159786a = null;

        static {
            f159786a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
