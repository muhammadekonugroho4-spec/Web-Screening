package com.stockbit.chat.ui.searchgroupmember;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.google.firebase.messaging.Constants;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f59263a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f59264a;

        /* renamed from: b, reason: collision with root package name */
        public final int f59265b;

        /* renamed from: c, reason: collision with root package name */
        public final int f59266c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final String f59267e;

        /* renamed from: f, reason: collision with root package name */
        public final int f59268f;

        public a(int r1, int r2, int r3, boolean r4, String r5) {
            this.f59264a = r1;
            this.f59265b = r2;
            this.f59266c = r3;
            this.d = r4;
            this.f59267e = r5;
            this.f59268f = com.stockbit.chat.g.f55333l0;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putInt("groupId", this.f59264a);
            r02.putInt("roomId", this.f59265b);
            r02.putInt("memberId", this.f59266c);
            r02.putBoolean("isGroupAdmin", this.d);
            r02.putString(Constants.MessagePayloadKeys.FROM, this.f59267e);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f59268f;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f59264a == r52.f59264a) goto L12;
            return false;
        L12:
            if (this.f59265b == r52.f59265b) goto L15;
            return false;
        L15:
            if (this.f59266c == r52.f59266c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f59267e, r52.f59267e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            int r02 = ((((((Integer.hashCode(this.f59264a) * 31) + Integer.hashCode(this.f59265b)) * 31) + Integer.hashCode(this.f59266c)) * 31) + Boolean.hashCode(this.d)) * 31;
            String r1 = this.f59267e;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionSearchGroupMemberFragmentToChooseGroupMemberDialogFragment(groupId=" + this.f59264a + ", roomId=" + this.f59265b + ", memberId=" + this.f59266c + ", isGroupAdmin=" + this.d + ", from=" + this.f59267e + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(int r7, int r8, int r9, boolean r10, String r11) {
            return new a(r7, r8, r9, r10, r11);
        }

        public b() {
        }
    }

    static {
        f59263a = new b(null);
    }
}
