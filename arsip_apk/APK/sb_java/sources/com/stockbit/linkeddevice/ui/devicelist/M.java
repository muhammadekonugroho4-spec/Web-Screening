package com.stockbit.linkeddevice.ui.devicelist;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes10.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final b f120919a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f120920a;

        /* renamed from: b, reason: collision with root package name */
        public final int f120921b;

        public a(String r2) {
            kotlin.jvm.internal.p.l(r2, "uuid");
            this.f120920a = r2;
            this.f120921b = com.stockbit.linkeddevice.d.f120824a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("uuid", this.f120920a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f120921b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f120920a, ((a) r4).f120920a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f120920a.hashCode();
        }

        public String toString() {
            return "ActionFragmentDeviceListToFragmentPasswordConfirmation(uuid=" + this.f120920a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2) {
            kotlin.jvm.internal.p.l(r2, "uuid");
            return new a(r2);
        }

        public b() {
        }
    }

    static {
        f120919a = new b(null);
    }
}
