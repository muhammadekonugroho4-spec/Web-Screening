package com.stockbit.setting.ui.linkedaccount;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.stockbit.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1225c f136052a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f136053a;

        /* renamed from: b, reason: collision with root package name */
        public final int f136054b;

        public a(String r2) {
            p.l(r2, "EXTRALINKEDACCOUNTTYPE");
            this.f136053a = r2;
            this.f136054b = g.f138702e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("EXTRALINKEDACCOUNTTYPE", this.f136053a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f136054b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f136053a, ((a) r4).f136053a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f136053a.hashCode();
        }

        public String toString() {
            return "ActionSettingLinkedAccountFragmentToSettingLinkedAccountLinkFragment(EXTRALINKEDACCOUNTTYPE=" + this.f136053a + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f136055a;

        /* renamed from: b, reason: collision with root package name */
        public final int f136056b;

        public b(String r1) {
            this.f136055a = r1;
            this.f136056b = g.f138704f;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("EXTRA_LINKED_ACCOUNT_TYPE", this.f136055a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f136056b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f136055a, ((b) r4).f136055a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f136055a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ActionSettingLinkedAccountFragmentToSettingLinkedAccountUnlinkFragment(EXTRALINKEDACCOUNTTYPE=" + this.f136055a + ')';
        }
    }

    /* renamed from: com.stockbit.setting.ui.linkedaccount.c$c, reason: collision with other inner class name */
    public static final class C1225c {
        public /* synthetic */ C1225c(i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            p.l(r2, "EXTRALINKEDACCOUNTTYPE");
            return new a(r2);
        }

        public final InterfaceC4081o0 b(String r2) {
            return new b(r2);
        }

        public C1225c() {
        }
    }

    static {
        f136052a = new C1225c(null);
    }
}
