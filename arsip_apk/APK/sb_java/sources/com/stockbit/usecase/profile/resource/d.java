package com.stockbit.usecase.profile.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public DomainExodusException f159487a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f159487a = r2;
        }

        public final DomainExodusException a() {
            return this.f159487a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159487a, ((a) r4).f159487a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159487a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f159487a + ')';
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f159488a = null;

        static {
            f159488a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final List f159489a;

        public c(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f159489a = r2;
        }

        public final List a() {
            return this.f159489a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159489a, ((c) r4).f159489a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159489a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f159489a + ')';
        }
    }

    public /* synthetic */ d(kotlin.jvm.internal.i r1) {
        this();
    }

    public d() {
    }
}
