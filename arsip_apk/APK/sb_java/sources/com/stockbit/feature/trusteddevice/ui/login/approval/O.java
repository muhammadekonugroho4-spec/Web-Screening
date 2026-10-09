package com.stockbit.feature.trusteddevice.ui.login.approval;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.feature.trusteddevice.contract.PromptType;
import java.io.Serializable;

/* loaded from: classes9.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final c f118258a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final PromptType f118259a;

        /* renamed from: b, reason: collision with root package name */
        public final int f118260b;

        public a(PromptType r2) {
            kotlin.jvm.internal.p.l(r2, "type");
            this.f118259a = r2;
            this.f118260b = com.stockbit.feature.trusteddevice.c.f117760e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(PromptType.class) == false) goto L7;
            Object r1 = this.f118259a;
            kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("type", (Parcelable) r1);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(PromptType.class) == false) goto L9;
            PromptType r12 = this.f118259a;
            kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
            r02.putSerializable("type", r12);
        L9:
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f118260b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f118259a == ((a) r4).f118259a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118259a.hashCode();
        }

        public String toString() {
            return "ActionLoginApprovalFragmentToLoginRejectionFragment(type=" + this.f118259a + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final PromptType f118261a;

        /* renamed from: b, reason: collision with root package name */
        public final int f118262b;

        public b(PromptType r2) {
            kotlin.jvm.internal.p.l(r2, "type");
            this.f118261a = r2;
            this.f118262b = com.stockbit.feature.trusteddevice.c.f117761f;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(PromptType.class) == false) goto L7;
            Object r1 = this.f118261a;
            kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("type", (Parcelable) r1);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(PromptType.class) == false) goto L9;
            PromptType r12 = this.f118261a;
            kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
            r02.putSerializable("type", r12);
        L9:
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f118262b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f118261a == ((b) r4).f118261a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118261a.hashCode();
        }

        public String toString() {
            return "ActionLoginApprovalFragmentToPromptExpiredFragment(type=" + this.f118261a + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 c(c r02, PromptType r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = PromptType.NEW_LOGIN;
        L6:
            return r02.b(r1);
        }

        public final InterfaceC4081o0 a(PromptType r2) {
            kotlin.jvm.internal.p.l(r2, "type");
            return new a(r2);
        }

        public final InterfaceC4081o0 b(PromptType r2) {
            kotlin.jvm.internal.p.l(r2, "type");
            return new b(r2);
        }

        public c() {
        }
    }

    static {
        f118258a = new c(null);
    }
}
