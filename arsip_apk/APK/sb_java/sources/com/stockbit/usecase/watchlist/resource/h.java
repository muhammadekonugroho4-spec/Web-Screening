package com.stockbit.usecase.watchlist.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f164593a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f164593a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164593a, ((a) r4).f164593a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164593a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f164593a + ")";
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164594a = null;

        static {
            f164594a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public final List f164595a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f164595a = r2;
        }

        public final List a() {
            return this.f164595a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164595a, ((c) r4).f164595a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164595a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f164595a + ")";
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.i r1) {
        this();
    }

    public h() {
    }
}
