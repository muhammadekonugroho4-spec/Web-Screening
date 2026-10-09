package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.watchlist.resource.a$a, reason: collision with other inner class name */
    public static final class C1726a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f164577a;

        public C1726a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164577a = r2;
        }

        public final DomainExodusException a() {
            return this.f164577a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1726a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164577a, ((C1726a) r4).f164577a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164577a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164577a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f164578a;

        public b(String r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f164578a = r2;
        }

        public final String a() {
            return this.f164578a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164578a, ((b) r4).f164578a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164578a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164578a + ")";
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
