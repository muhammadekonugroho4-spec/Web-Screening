package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164600a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164600a = r2;
        }

        public final DomainExodusException a() {
            return this.f164600a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164600a, ((a) r4).f164600a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164600a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164600a + ")";
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164601a = null;

        static {
            f164601a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1027793746;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164602a = null;

        static {
            f164602a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1176026599;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.i r1) {
        this();
    }

    public j() {
    }
}
