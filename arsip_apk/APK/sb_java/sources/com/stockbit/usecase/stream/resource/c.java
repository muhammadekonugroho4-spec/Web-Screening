package com.stockbit.usecase.stream.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f163075a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f163075a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163075a, ((a) r4).f163075a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163075a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163075a + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163076a = null;

        static {
            f163076a = new b();
        }

        public b() {
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
            return 110152077;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.usecase.stream.resource.c$c, reason: collision with other inner class name */
    public static final class C1667c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f163077a;

        public C1667c(String r2) {
            p.l(r2, "message");
            this.f163077a = r2;
        }

        public final String a() {
            return this.f163077a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1667c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163077a, ((C1667c) r4).f163077a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163077a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f163077a + ")";
        }
    }
}
