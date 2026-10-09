package com.stockbit.usecase.chat.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class G {

    public static final class a extends G {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f155747a;

        public a(DomainExodusException r2) {
            kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f155747a = r2;
        }

        public final DomainExodusException a() {
            return this.f155747a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155747a, ((a) r4).f155747a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155747a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f155747a + ")";
        }
    }

    public static final class b extends G {

        /* renamed from: a, reason: collision with root package name */
        public static final b f155748a = null;

        static {
            f155748a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends G {

        /* renamed from: a, reason: collision with root package name */
        public final List f155749a;

        public c(List r2) {
            kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f155749a = r2;
        }

        public final List a() {
            return this.f155749a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f155749a, ((c) r4).f155749a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f155749a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f155749a + ")";
        }
    }

    public /* synthetic */ G(kotlin.jvm.internal.i r1) {
        this();
    }

    public G() {
    }
}
