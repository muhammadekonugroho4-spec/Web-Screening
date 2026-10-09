package com.stockbit.setting.ui.linkedaccount.link;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final b f136099a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f136100a;

        /* renamed from: b, reason: collision with root package name */
        public final String f136101b;

        /* renamed from: c, reason: collision with root package name */
        public final int f136102c;

        public a(String r1, String r2) {
            this.f136100a = r1;
            this.f136101b = r2;
            this.f136102c = com.stockbit.stockbit.g.f138706g;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString(Constants.KEY_TITLE, this.f136100a);
            r02.putString("message", this.f136101b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f136102c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f136100a, r52.f136100a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f136101b, r52.f136101b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f136100a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f136101b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionSettingLinkedAccountLinkFragmentToSettingLinkedAccountUnlinkSuccessDialogFragment(title=" + this.f136100a + ", message=" + this.f136101b + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f136099a = new b(null);
    }
}
