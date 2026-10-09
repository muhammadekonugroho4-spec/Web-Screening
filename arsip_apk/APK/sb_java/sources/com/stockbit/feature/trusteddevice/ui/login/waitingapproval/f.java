package com.stockbit.feature.trusteddevice.ui.login.waitingapproval;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f118565a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f118566a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f118567b;

        /* renamed from: c, reason: collision with root package name */
        public final int f118568c;

        public a(int r1, Bundle r2) {
            this.f118566a = r1;
            this.f118567b = r2;
            this.f118568c = com.stockbit.feature.trusteddevice.c.f117765j;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putInt("destinationId", this.f118566a);
            if (Parcelable.class.isAssignableFrom(Bundle.class) == false) goto L7;
            r02.putParcelable("destinationArguments", this.f118567b);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(Bundle.class) == false) goto L11;
            r02.putSerializable("destinationArguments", (Serializable) this.f118567b);
            return r02;
        L11:
            throw new UnsupportedOperationException(Bundle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f118568c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f118566a == r52.f118566a) goto L12;
            return false;
        L12:
            if (p.g(this.f118567b, r52.f118567b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f118566a) * 31;
            Bundle r1 = this.f118567b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionLoginWaitingApprovalFragmentToNavGraphVerification(destinationId=" + this.f118566a + ", destinationArguments=" + this.f118567b + ')';
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
        f118565a = new b(null);
    }
}
