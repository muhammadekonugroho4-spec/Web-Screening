package com.stockbit.usecase.stream.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f163078a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f163078a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f163078a, ((a) r4).f163078a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f163078a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f163078a + ")";
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f163079a = null;

        static {
            f163079a = new b();
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
            return -1159965661;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final List f163080a;

        /* renamed from: b, reason: collision with root package name */
        public final String f163081b;

        public c(List r2, String r3) {
            p.l(r2, "notes");
            p.l(r3, "nextCursor");
            this.f163080a = r2;
            this.f163081b = r3;
        }

        public final List a() {
            return this.f163080a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f163080a, r52.f163080a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f163081b, r52.f163081b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f163080a.hashCode() * 31) + this.f163081b.hashCode();
        }

        public String toString() {
            return "Success(notes=" + this.f163080a + ", nextCursor=" + this.f163081b + ")";
        }
    }
}
