package com.stockbit.component.securities.dialog.subaccount;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface n {

    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public final SwitchAccountEntryPoint f76282a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f76283b;

        static {
        }

        public a(SwitchAccountEntryPoint r2, boolean r3) {
            p.l(r2, "entryPoint");
            this.f76282a = r2;
            this.f76283b = r3;
        }

        @Override // com.stockbit.component.securities.dialog.subaccount.n
        public SwitchAccountEntryPoint a() {
            return this.f76282a;
        }

        public final boolean b() {
            return this.f76283b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f76282a == r52.f76282a) goto L12;
            return false;
        L12:
            if (this.f76283b == r52.f76283b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f76282a.hashCode() * 31) + Boolean.hashCode(this.f76283b);
        }

        public String toString() {
            return "OnUnauthorized(entryPoint=" + this.f76282a + ", isSuccess=" + this.f76283b + ')';
        }
    }

    public static final class b implements n {
        public abstract com.stockbit.usecase.securities.model.account.g b();

        public abstract boolean c();
    }

    public static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public final SwitchAccountEntryPoint f76284a;

        /* renamed from: b, reason: collision with root package name */
        public final String f76285b;

        /* renamed from: c, reason: collision with root package name */
        public final String f76286c;

        static {
        }

        public c(SwitchAccountEntryPoint r2, String r3, String r4) {
            p.l(r2, "entryPoint");
            p.l(r3, "accountId");
            p.l(r4, "accountName");
            this.f76284a = r2;
            this.f76285b = r3;
            this.f76286c = r4;
        }

        @Override // com.stockbit.component.securities.dialog.subaccount.n
        public SwitchAccountEntryPoint a() {
            return this.f76284a;
        }

        public final String b() {
            return this.f76285b;
        }

        public final String c() {
            return this.f76286c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f76284a == r52.f76284a) goto L12;
            return false;
        L12:
            if (p.g(this.f76285b, r52.f76285b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f76286c, r52.f76286c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f76284a.hashCode() * 31) + this.f76285b.hashCode()) * 31) + this.f76286c.hashCode();
        }

        public String toString() {
            return "SwitchAccount(entryPoint=" + this.f76284a + ", accountId=" + this.f76285b + ", accountName=" + this.f76286c + ')';
        }
    }

    SwitchAccountEntryPoint a();
}
