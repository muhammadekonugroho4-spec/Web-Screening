package com.stockbit.chat.ui.leavegroup;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final b f56495a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f56496a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56497b;

        /* renamed from: c, reason: collision with root package name */
        public final String f56498c;
        public final int d;

        public a(long r2, int r4, String r5) {
            p.l(r5, "groupName");
            this.f56496a = r2;
            this.f56497b = r4;
            this.f56498c = r5;
            this.d = com.stockbit.chat.g.f55323g0;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putLong("roomId", this.f56496a);
            r02.putInt("groupId", this.f56497b);
            r02.putString("groupName", this.f56498c);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.d;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L8;
            return false;
        L8:
            a r82 = (a) r8;
            if (this.f56496a == r82.f56496a) goto L12;
            return false;
        L12:
            if (this.f56497b == r82.f56497b) goto L15;
            return false;
        L15:
            if (p.g(this.f56498c, r82.f56498c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f56496a) * 31) + Integer.hashCode(this.f56497b)) * 31) + this.f56498c.hashCode();
        }

        public String toString() {
            return "ActionLeaveGroupFragmentToChooseAdminFragment(roomId=" + this.f56496a + ", groupId=" + this.f56497b + ", groupName=" + this.f56498c + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(long r2, int r4, String r5) {
            p.l(r5, "groupName");
            return new a(r2, r4, r5);
        }

        public b() {
        }
    }

    static {
        f56495a = new b(null);
    }
}
