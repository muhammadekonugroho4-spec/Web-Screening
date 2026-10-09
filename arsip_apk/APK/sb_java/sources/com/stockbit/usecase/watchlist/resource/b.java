package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f164579a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164579a = r2;
        }

        public final DomainExodusException a() {
            return this.f164579a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164579a, ((a) r4).f164579a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164579a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164579a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.watchlist.resource.b$b, reason: collision with other inner class name */
    public static final class C1727b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f164580a;

        public C1727b(String r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f164580a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1727b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164580a, ((C1727b) r4).f164580a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164580a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164580a + ")";
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
