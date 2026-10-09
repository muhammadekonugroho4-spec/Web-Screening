package com.stockbit.usecase.sharecontent.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.sharecontent.resource.a$a, reason: collision with other inner class name */
    public static final class C1647a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f162839a;

        public C1647a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162839a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1647a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162839a, ((C1647a) r4).f162839a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162839a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162839a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162840a = null;

        static {
            f162840a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final List f162841a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f162842b;

        public c(List r2, boolean r3) {
            p.l(r2, "rooms");
            super(null);
            this.f162841a = r2;
            this.f162842b = r3;
        }

        public final List a() {
            return this.f162841a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f162841a, r52.f162841a) == true) goto L12;
            return false;
        L12:
            if (this.f162842b == r52.f162842b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f162841a.hashCode() * 31) + Boolean.hashCode(this.f162842b);
        }

        public String toString() {
            return "Success(rooms=" + this.f162841a + ", hasMore=" + this.f162842b + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
