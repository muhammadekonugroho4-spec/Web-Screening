package com.stockbit.navigation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* renamed from: com.stockbit.navigation.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9182d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f122430a = null;

    /* renamed from: com.stockbit.navigation.d$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(boolean r2) {
            return new b(r2);
        }

        public a() {
        }
    }

    /* renamed from: com.stockbit.navigation.d$b */
    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f122431a;

        /* renamed from: b, reason: collision with root package name */
        public final int f122432b;

        public b(boolean r1) {
            this.f122431a = r1;
            this.f122432b = D.f122352X;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isVerified", this.f122431a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f122432b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f122431a == ((b) r4).f122431a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f122431a);
        }

        public String toString() {
            return "OpenMainTabActivity(isVerified=" + this.f122431a + ')';
        }
    }

    static {
        f122430a = new a(null);
    }
}
