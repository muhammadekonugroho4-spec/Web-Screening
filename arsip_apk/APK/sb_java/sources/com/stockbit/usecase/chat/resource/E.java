package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class E {

    public static final class a extends E {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155739a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155739a = r2;
        }

        public final DomainExodusException a() {
            return this.f155739a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155739a, ((a) r4).f155739a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155739a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155739a + ")";
        }
    }

    public static final class b extends E {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155740a = null;

        static {
            f155740a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends E {

        /* renamed from: a, reason: collision with root package name */
        public final List f155741a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f155742b;

        public c(List r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f155741a = r2;
            this.f155742b = r3;
        }

        public final List a() {
            return this.f155741a;
        }

        public final boolean b() {
            return this.f155742b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f155741a, r52.f155741a) == true) goto L12;
            return false;
        L12:
            if (this.f155742b == r52.f155742b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f155741a.hashCode() * 31) + Boolean.hashCode(this.f155742b);
        }

        public String toString() {
            return "Success(data=" + this.f155741a + ", isMore=" + this.f155742b + ")";
        }
    }

    public /* synthetic */ E(kotlin.jvm.internal.i r1) {
        this();
    }

    public E() {
    }
}
