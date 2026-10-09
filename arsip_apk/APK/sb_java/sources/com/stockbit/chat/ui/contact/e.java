package com.stockbit.chat.ui.contact;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f55967a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f55968a;

        /* renamed from: b, reason: collision with root package name */
        public final String f55969b;

        /* renamed from: c, reason: collision with root package name */
        public final String f55970c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final String f55971e;

        /* renamed from: f, reason: collision with root package name */
        public final String f55972f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f55973g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f55974h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f55975i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f55976j;

        /* renamed from: k, reason: collision with root package name */
        public final int f55977k;

        public a(String r2, String r3, String r4, boolean r5, String r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11) {
            p.l(r2, "type");
            p.l(r7, "avatar");
            this.f55968a = r2;
            this.f55969b = r3;
            this.f55970c = r4;
            this.d = r5;
            this.f55971e = r6;
            this.f55972f = r7;
            this.f55973g = r8;
            this.f55974h = r9;
            this.f55975i = r10;
            this.f55976j = r11;
            this.f55977k = com.stockbit.chat.g.f55324h;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("type", this.f55968a);
            r02.putString("chatId", this.f55969b);
            r02.putString("chatUserName", this.f55970c);
            r02.putBoolean("isChatEnabled", this.d);
            r02.putString("userId", this.f55971e);
            r02.putString("avatar", this.f55972f);
            r02.putBoolean("isVerified", this.f55973g);
            r02.putBoolean("isBlocked", this.f55974h);
            r02.putBoolean("isDeactivated", this.f55975i);
            r02.putBoolean("isFromDeeplink", this.f55976j);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f55977k;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f55968a, r52.f55968a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f55969b, r52.f55969b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f55970c, r52.f55970c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L21;
            return false;
        L21:
            if (p.g(this.f55971e, r52.f55971e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f55972f, r52.f55972f) == true) goto L27;
            return false;
        L27:
            if (this.f55973g == r52.f55973g) goto L30;
            return false;
        L30:
            if (this.f55974h == r52.f55974h) goto L33;
            return false;
        L33:
            if (this.f55975i == r52.f55975i) goto L36;
            return false;
        L36:
            if (this.f55976j == r52.f55976j) goto L38;
            return false;
        L38:
            return true;
        }

        public int hashCode() {
            int r02 = this.f55968a.hashCode() * 31;
            String r1 = this.f55969b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f55970c;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (((r03 + r14) * 31) + Boolean.hashCode(this.d)) * 31;
            String r15 = this.f55971e;
            if (r15 == null) goto L15;
            r2 = r15.hashCode();
        L15:
            return ((((((((((r04 + r2) * 31) + this.f55972f.hashCode()) * 31) + Boolean.hashCode(this.f55973g)) * 31) + Boolean.hashCode(this.f55974h)) * 31) + Boolean.hashCode(this.f55975i)) * 31) + Boolean.hashCode(this.f55976j);
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionChatContactFragmentToChatRoomFragment(type=" + this.f55968a + ", chatId=" + this.f55969b + ", chatUserName=" + this.f55970c + ", isChatEnabled=" + this.d + ", userId=" + this.f55971e + ", avatar=" + this.f55972f + ", isVerified=" + this.f55973g + ", isBlocked=" + this.f55974h + ", isDeactivated=" + this.f55975i + ", isFromDeeplink=" + this.f55976j + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r1, String r2, String r3, String r4, boolean r5, String r6, String r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, Object r13) {
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
            return r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        }

        public final InterfaceC4081o0 a(String r13, String r14, String r15, boolean r16, String r17, String r18, boolean r19, boolean r20, boolean r21, boolean r22) {
            p.l(r13, "type");
            p.l(r18, "avatar");
            return new a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        }

        public b() {
        }
    }

    static {
        f55967a = new b(null);
    }
}
