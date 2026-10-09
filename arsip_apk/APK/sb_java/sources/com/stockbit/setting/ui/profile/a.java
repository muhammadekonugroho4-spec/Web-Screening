package com.stockbit.setting.ui.profile;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.stockbit.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f136621a = null;

    /* renamed from: com.stockbit.setting.ui.profile.a$a, reason: collision with other inner class name */
    public static final class C1237a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f136622a;

        /* renamed from: b, reason: collision with root package name */
        public final int f136623b;

        public C1237a(String r2) {
            p.l(r2, "webiewUrl");
            this.f136622a = r2;
            this.f136623b = g.f138718m;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("webiewUrl", this.f136622a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f136623b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1237a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f136622a, ((C1237a) r4).f136622a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f136622a.hashCode();
        }

        public String toString() {
            return "ActionSettingProfileFragmentToDeleteAccountFragment(webiewUrl=" + this.f136622a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            p.l(r2, "webiewUrl");
            return new C1237a(r2);
        }

        public b() {
        }
    }

    static {
        f136621a = new b(null);
    }
}
