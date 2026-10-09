package com.stockbit.feature.verification.ui.pin;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f119080a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f119081a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f119082b;

        /* renamed from: c, reason: collision with root package name */
        public final int f119083c;

        public a(int r1, Bundle r2) {
            this.f119081a = r1;
            this.f119082b = r2;
            this.f119083c = com.stockbit.feature.verification.c.f118821a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putInt("destinationId", this.f119081a);
            if (Parcelable.class.isAssignableFrom(Bundle.class) == false) goto L7;
            r02.putParcelable("destinationArguments", this.f119082b);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(Bundle.class) == false) goto L11;
            r02.putSerializable("destinationArguments", (Serializable) this.f119082b);
            return r02;
        L11:
            throw new UnsupportedOperationException(Bundle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f119083c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f119081a == r52.f119081a) goto L12;
            return false;
        L12:
            if (p.g(this.f119082b, r52.f119082b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f119081a) * 31;
            Bundle r1 = this.f119082b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionFaceMatchingVerificationFragmentToNavGraphForgotPin(destinationId=" + this.f119081a + ", destinationArguments=" + this.f119082b + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(int r2, Bundle r3) {
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f119080a = new b(null);
    }
}
