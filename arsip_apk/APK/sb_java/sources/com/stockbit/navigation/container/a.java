package com.stockbit.navigation.container;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {
    public static final C1068a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f122427a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122428b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f122429c;

    /* renamed from: com.stockbit.navigation.container.a$a, reason: collision with other inner class name */
    public static final class C1068a {
        public /* synthetic */ C1068a(i r1) {
            this();
        }

        public final a a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(a.class.getClassLoader());
            if (r6.containsKey("graph_id") == false) goto L22;
            int r02 = r6.getInt("graph_id");
            if (r6.containsKey("destination_id") == false) goto L7;
            int r1 = r6.getInt("destination_id");
        L9:
            if (r6.containsKey("start_destination_args") == true) goto L11;
            Bundle r62 = null;
        L20:
            return new a(r02, r1, r62);
        L11:
            if (Parcelable.class.isAssignableFrom(Bundle.class) == false) goto L13;
        L17:
            r62 = (Bundle) r6.get("start_destination_args");
            goto L20
        L13:
            if (Serializable.class.isAssignableFrom(Bundle.class) == true) goto L17;
            throw new UnsupportedOperationException(Bundle.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L7:
            r1 = -1;
            goto L9
        L22:
            throw new IllegalArgumentException("Required argument \"graph_id\" is missing and does not have an android:defaultValue");
        }

        public C1068a() {
        }
    }

    static {
        d = new C1068a(null);
    }

    public a(int r1, int r2, Bundle r3) {
        this.f122427a = r1;
        this.f122428b = r2;
        this.f122429c = r3;
    }

    public static final a fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final int a() {
        return this.f122428b;
    }

    public final int b() {
        return this.f122427a;
    }

    public final Bundle c() {
        return this.f122429c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f122427a == r52.f122427a) goto L12;
        return false;
    L12:
        if (this.f122428b == r52.f122428b) goto L15;
        return false;
    L15:
        if (p.g(this.f122429c, r52.f122429c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.f122427a) * 31) + Integer.hashCode(this.f122428b)) * 31;
        Bundle r1 = this.f122429c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ContainerFragmentArgs(graphId=" + this.f122427a + ", destinationId=" + this.f122428b + ", startDestinationArgs=" + this.f122429c + ')';
    }
}
