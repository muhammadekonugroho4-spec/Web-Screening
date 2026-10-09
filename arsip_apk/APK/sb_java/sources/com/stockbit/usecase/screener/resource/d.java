package com.stockbit.usecase.screener.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f159781a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159781a = r2;
        }

        public final DomainExodusException a() {
            return this.f159781a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159781a, ((a) r4).f159781a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159781a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159781a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public String f159782a;

        public b(String r2) {
            p.l(r2, "message");
            super(null);
            this.f159782a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159782a, ((b) r4).f159782a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159782a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159782a + ")";
        }
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
