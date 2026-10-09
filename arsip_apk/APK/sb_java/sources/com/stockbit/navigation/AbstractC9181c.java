package com.stockbit.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import java.io.Serializable;

/* renamed from: com.stockbit.navigation.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9181c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f122419a = null;

    /* renamed from: com.stockbit.navigation.c$a */
    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f122420a;

        /* renamed from: b, reason: collision with root package name */
        public final int f122421b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f122422c;
        public final int d;

        public a(int r1, int r2, Bundle r3) {
            this.f122420a = r1;
            this.f122421b = r2;
            this.f122422c = r3;
            this.d = D.f122357b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putInt("graph_id", this.f122420a);
            r02.putInt("destination_id", this.f122421b);
            if (Parcelable.class.isAssignableFrom(Bundle.class) == false) goto L7;
            r02.putParcelable("start_destination_args", this.f122422c);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(Bundle.class) == false) goto L9;
            r02.putSerializable("start_destination_args", (Serializable) this.f122422c);
        L9:
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f122420a == r52.f122420a) goto L12;
            return false;
        L12:
            if (this.f122421b == r52.f122421b) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f122422c, r52.f122422c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((Integer.hashCode(this.f122420a) * 31) + Integer.hashCode(this.f122421b)) * 31;
            Bundle r1 = this.f122422c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionOpenAnotherModule(graphId=" + this.f122420a + ", destinationId=" + this.f122421b + ", startDestinationArgs=" + this.f122422c + ')';
        }
    }

    /* renamed from: com.stockbit.navigation.c$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(int r2, int r3, Bundle r4) {
            return new a(r2, r3, r4);
        }

        public b() {
        }
    }

    static {
        f122419a = new b(null);
    }
}
