package com.stockbit.usecase.profile.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f159482a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159482a = r2;
        }

        public final DomainExodusException a() {
            return this.f159482a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159482a, ((a) r4).f159482a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159482a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159482a + ')';
        }
    }

    /* renamed from: com.stockbit.usecase.profile.resource.b$b, reason: collision with other inner class name */
    public static final class C1592b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f159483a;

        public C1592b(boolean r2) {
            super(null);
            this.f159483a = r2;
        }

        public final boolean a() {
            return this.f159483a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1592b) == true) goto L9;
            return false;
        L9:
            if (this.f159483a == ((C1592b) r4).f159483a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f159483a);
        }

        public String toString() {
            return "Success(alert=" + this.f159483a + ')';
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
