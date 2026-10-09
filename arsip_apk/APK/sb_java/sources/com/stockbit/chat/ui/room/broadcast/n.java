package com.stockbit.chat.ui.room.broadcast;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.usecase.chat.model.group.GroupRoomData;
import java.io.Serializable;

/* loaded from: classes7.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final e f58141a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f58142a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58143b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58144c;

        public a(String r1, boolean r2) {
            this.f58142a = r1;
            this.f58143b = r2;
            this.f58144c = com.stockbit.chat.g.d;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("roomId", this.f58142a);
            r02.putBoolean("isMuted", this.f58143b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f58144c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f58142a, r52.f58142a) == true) goto L12;
            return false;
        L12:
            if (this.f58143b == r52.f58143b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f58142a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (r03 * 31) + Boolean.hashCode(this.f58143b);
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionChatBroadcastRoomFragmentToBroadcastMoreMenuDialog(roomId=" + this.f58142a + ", isMuted=" + this.f58143b + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final GroupRoomData f58145a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58146b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58147c;

        public b(GroupRoomData r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "groupData");
            this.f58145a = r2;
            this.f58146b = r3;
            this.f58147c = com.stockbit.chat.g.f55318e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(GroupRoomData.class) == false) goto L6;
            Object r1 = this.f58145a;
            kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("groupData", (Parcelable) r1);
        L8:
            r02.putBoolean("isFromDeeplink", this.f58146b);
            return r02;
        L6:
            if (Serializable.class.isAssignableFrom(GroupRoomData.class) == false) goto L11;
            GroupRoomData r12 = this.f58145a;
            kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
            r02.putSerializable("groupData", r12);
            goto L8
        L11:
            throw new UnsupportedOperationException(GroupRoomData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f58147c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f58145a, r52.f58145a) == true) goto L12;
            return false;
        L12:
            if (this.f58146b == r52.f58146b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f58145a.hashCode() * 31) + Boolean.hashCode(this.f58146b);
        }

        public String toString() {
            return "ActionChatBroadcastRoomFragmentToChatGroupRoomFragment(groupData=" + this.f58145a + ", isFromDeeplink=" + this.f58146b + ')';
        }
    }

    public static final class c implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f58148a;

        /* renamed from: b, reason: collision with root package name */
        public final String f58149b;

        /* renamed from: c, reason: collision with root package name */
        public final String f58150c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final String f58151e;

        /* renamed from: f, reason: collision with root package name */
        public final String f58152f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f58153g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f58154h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f58155i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f58156j;

        /* renamed from: k, reason: collision with root package name */
        public final int f58157k;

        public c(String r2, String r3, String r4, boolean r5, String r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11) {
            kotlin.jvm.internal.p.l(r2, "type");
            kotlin.jvm.internal.p.l(r7, "avatar");
            this.f58148a = r2;
            this.f58149b = r3;
            this.f58150c = r4;
            this.d = r5;
            this.f58151e = r6;
            this.f58152f = r7;
            this.f58153g = r8;
            this.f58154h = r9;
            this.f58155i = r10;
            this.f58156j = r11;
            this.f58157k = com.stockbit.chat.g.f55320f;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("type", this.f58148a);
            r02.putString("chatId", this.f58149b);
            r02.putString("chatUserName", this.f58150c);
            r02.putBoolean("isChatEnabled", this.d);
            r02.putString("userId", this.f58151e);
            r02.putString("avatar", this.f58152f);
            r02.putBoolean("isVerified", this.f58153g);
            r02.putBoolean("isBlocked", this.f58154h);
            r02.putBoolean("isDeactivated", this.f58155i);
            r02.putBoolean("isFromDeeplink", this.f58156j);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f58157k;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f58148a, r52.f58148a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f58149b, r52.f58149b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f58150c, r52.f58150c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f58151e, r52.f58151e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f58152f, r52.f58152f) == true) goto L27;
            return false;
        L27:
            if (this.f58153g == r52.f58153g) goto L30;
            return false;
        L30:
            if (this.f58154h == r52.f58154h) goto L33;
            return false;
        L33:
            if (this.f58155i == r52.f58155i) goto L36;
            return false;
        L36:
            if (this.f58156j == r52.f58156j) goto L38;
            return false;
        L38:
            return true;
        }

        public int hashCode() {
            int r02 = this.f58148a.hashCode() * 31;
            String r1 = this.f58149b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f58150c;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (((r03 + r14) * 31) + Boolean.hashCode(this.d)) * 31;
            String r15 = this.f58151e;
            if (r15 == null) goto L15;
            r2 = r15.hashCode();
        L15:
            return ((((((((((r04 + r2) * 31) + this.f58152f.hashCode()) * 31) + Boolean.hashCode(this.f58153g)) * 31) + Boolean.hashCode(this.f58154h)) * 31) + Boolean.hashCode(this.f58155i)) * 31) + Boolean.hashCode(this.f58156j);
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionChatBroadcastRoomFragmentToChatRoomFragment(type=" + this.f58148a + ", chatId=" + this.f58149b + ", chatUserName=" + this.f58150c + ", isChatEnabled=" + this.d + ", userId=" + this.f58151e + ", avatar=" + this.f58152f + ", isVerified=" + this.f58153g + ", isBlocked=" + this.f58154h + ", isDeactivated=" + this.f58155i + ", isFromDeeplink=" + this.f58156j + ')';
        }
    }

    public static final class d implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f58158a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58159b;

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            this.f58158a = r2;
            this.f58159b = com.stockbit.chat.g.f55322g;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("url", this.f58158a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f58159b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f58158a, ((d) r4).f58158a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f58158a.hashCode();
        }

        public String toString() {
            return "ActionChatBroadcastRoomFragmentToImageViewerDialog(url=" + this.f58158a + ')';
        }
    }

    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 c(e r02, GroupRoomData r1, boolean r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L6;
            r2 = false;
        L6:
            return r02.b(r1, r2);
        }

        public static /* synthetic */ InterfaceC4081o0 e(e r1, String r2, String r3, String r4, boolean r5, String r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, Object r13) {
            if ((r12 & 4) == 0) goto L6;
            r4 = null;
        L6:
            if ((r12 & 8) == 0) goto L9;
            r5 = true;
        L9:
            if ((r12 & 16) == 0) goto L12;
            r6 = null;
        L12:
            if ((r12 & 32) == 0) goto L15;
            r7 = "";
        L15:
            if ((r12 & 64) == 0) goto L18;
            r8 = false;
        L18:
            if ((r12 & 128) == 0) goto L21;
            r9 = false;
        L21:
            if ((r12 & 256) == 0) goto L24;
            r10 = false;
        L24:
            if ((r12 & 512) == 0) goto L27;
            r11 = false;
        L27:
            return r1.d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        }

        public final InterfaceC4081o0 a(String r2, boolean r3) {
            return new a(r2, r3);
        }

        public final InterfaceC4081o0 b(GroupRoomData r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "groupData");
            return new b(r2, r3);
        }

        public final InterfaceC4081o0 d(String r13, String r14, String r15, boolean r16, String r17, String r18, boolean r19, boolean r20, boolean r21, boolean r22) {
            kotlin.jvm.internal.p.l(r13, "type");
            kotlin.jvm.internal.p.l(r18, "avatar");
            return new c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        }

        public final InterfaceC4081o0 f(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            return new d(r2);
        }

        public e() {
        }
    }

    static {
        f58141a = new e(null);
    }
}
