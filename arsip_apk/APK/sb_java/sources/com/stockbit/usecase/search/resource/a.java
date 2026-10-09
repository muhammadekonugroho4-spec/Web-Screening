package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.search.resource.a$a, reason: collision with other inner class name */
    public static final class C1605a extends a {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f160100a;

        public C1605a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f160100a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1605a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160100a, ((C1605a) r4).f160100a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160100a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f160100a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f160101a = null;

        static {
            f160101a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f160102a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f160102a = r2;
        }

        public final List a() {
            return this.f160102a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160102a, ((c) r4).f160102a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160102a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f160102a + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f160103a = null;

        static {
            f160103a = new d();
        }

        public d() {
            super(null);
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
