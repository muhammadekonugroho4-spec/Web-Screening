package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f164603a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164603a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164603a, ((a) r4).f164603a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164603a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164603a + ")";
        }
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164604a = null;

        static {
            f164604a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends k {

        /* renamed from: a, reason: collision with root package name */
        public final List f164605a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f164605a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164605a, ((c) r4).f164605a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164605a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164605a + ")";
        }
    }

    public /* synthetic */ k(kotlin.jvm.internal.i r1) {
        this();
    }

    public k() {
    }
}
