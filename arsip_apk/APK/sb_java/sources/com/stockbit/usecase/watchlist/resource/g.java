package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f164590a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164590a = r2;
        }

        public final DomainExodusException a() {
            return this.f164590a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164590a, ((a) r4).f164590a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164590a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164590a + ")";
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164591a = null;

        static {
            f164591a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends g {

        /* renamed from: a, reason: collision with root package name */
        public final List f164592a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f164592a = r2;
        }

        public final List a() {
            return this.f164592a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164592a, ((c) r4).f164592a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164592a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164592a + ")";
        }
    }

    public /* synthetic */ g(kotlin.jvm.internal.i r1) {
        this();
    }

    public g() {
    }
}
