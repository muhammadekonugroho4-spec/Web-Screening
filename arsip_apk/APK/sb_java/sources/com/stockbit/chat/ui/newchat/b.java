package com.stockbit.chat.ui.newchat;

import com.stockbit.domain.model.profile.VerifiedStatusType;

/* loaded from: classes7.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f56693a = null;

        static {
            f56693a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -850955161;
        }

        public String toString() {
            return "HideLoading";
        }
    }

    /* renamed from: com.stockbit.chat.ui.newchat.b$b, reason: collision with other inner class name */
    public static final class C0588b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0588b f56694a = null;

        static {
            f56694a = new C0588b();
        }

        public C0588b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0588b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -490398706;
        }

        public String toString() {
            return "OnNavigatingToChatRoom";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final VerifiedStatusType f56695a;

        static {
        }

        public c(VerifiedStatusType r2) {
            kotlin.jvm.internal.p.l(r2, "verifiedStatus");
            this.f56695a = r2;
        }

        public final VerifiedStatusType a() {
            return this.f56695a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f56695a == ((c) r4).f56695a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56695a.hashCode();
        }

        public String toString() {
            return "ShowCreateGroupLimitDialog(verifiedStatus=" + this.f56695a + ')';
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f56696a = null;

        static {
            f56696a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -342385076;
        }

        public String toString() {
            return "ShowLoading";
        }
    }
}
