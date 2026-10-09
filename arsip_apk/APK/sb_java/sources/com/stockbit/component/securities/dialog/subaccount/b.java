package com.stockbit.component.securities.dialog.subaccount;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final SwitchAccountStateType f76271a;

        /* renamed from: b, reason: collision with root package name */
        public final String f76272b;

        /* renamed from: c, reason: collision with root package name */
        public final String f76273c;

        static {
        }

        public a(SwitchAccountStateType r2, String r3, String r4) {
            p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
            p.l(r3, "accountId");
            p.l(r4, "accountName");
            this.f76271a = r2;
            this.f76272b = r3;
            this.f76273c = r4;
        }

        public final String a() {
            return this.f76272b;
        }

        public final String b() {
            return this.f76273c;
        }

        public final SwitchAccountStateType c() {
            return this.f76271a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f76271a == r52.f76271a) goto L12;
            return false;
        L12:
            if (p.g(this.f76272b, r52.f76272b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f76273c, r52.f76273c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f76271a.hashCode() * 31) + this.f76272b.hashCode()) * 31) + this.f76273c.hashCode();
        }

        public String toString() {
            return "OnSwitchAccount(state=" + this.f76271a + ", accountId=" + this.f76272b + ", accountName=" + this.f76273c + ')';
        }
    }

    /* renamed from: com.stockbit.component.securities.dialog.subaccount.b$b, reason: collision with other inner class name */
    public static final class C0732b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f76274a;

        static {
        }

        public C0732b(String r2) {
            p.l(r2, "errorType");
            this.f76274a = r2;
        }

        public final String a() {
            return this.f76274a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0732b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f76274a, ((C0732b) r4).f76274a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f76274a.hashCode();
        }

        public String toString() {
            return "OnUnauthorized(errorType=" + this.f76274a + ')';
        }
    }
}
