package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f164596a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164596a = r2;
        }

        public final DomainExodusException a() {
            return this.f164596a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164596a, ((a) r4).f164596a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164596a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164596a + ")";
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164597a = null;

        static {
            f164597a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public final List f164598a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f164598a = r2;
        }

        public final List a() {
            return this.f164598a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164598a, ((c) r4).f164598a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164598a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164598a + ")";
        }
    }

    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final d f164599a = null;

        static {
            f164599a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.i r1) {
        this();
    }

    public i() {
    }
}
