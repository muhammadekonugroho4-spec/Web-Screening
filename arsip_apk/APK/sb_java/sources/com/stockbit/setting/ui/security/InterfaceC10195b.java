package com.stockbit.setting.ui.security;

import com.clevertap.android.sdk.Constants;
import com.stockbit.personalamend.model.BlockingChangeDataMessageUIState;

/* renamed from: com.stockbit.setting.ui.security.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC10195b {

    /* renamed from: com.stockbit.setting.ui.security.b$a */
    public static final class a implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f136756a = null;

        static {
            f136756a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1587787193;
        }

        public String toString() {
            return "Default";
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$b, reason: collision with other inner class name */
    public static final class C1240b implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1240b f136757a = null;

        static {
            f136757a = new C1240b();
        }

        public C1240b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1240b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2097606930;
        }

        public String toString() {
            return "HideLoading";
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$c */
    public static final class c implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f136758a = null;

        static {
            f136758a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 379633844;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$d */
    public static final class d implements InterfaceC10195b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f136759b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final BlockingChangeDataMessageUIState f136760a;

        static {
            f136759b = BlockingChangeDataMessageUIState.f125328c;
        }

        public d(BlockingChangeDataMessageUIState r2) {
            kotlin.jvm.internal.p.l(r2, "blockingChangeDataMessageUIState");
            this.f136760a = r2;
        }

        public final BlockingChangeDataMessageUIState a() {
            return this.f136760a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f136760a, ((d) r4).f136760a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f136760a.hashCode();
        }

        public String toString() {
            return "NavigateToBlockingMessage(blockingChangeDataMessageUIState=" + this.f136760a + ')';
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$e */
    public static final class e implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f136761a;

        /* renamed from: b, reason: collision with root package name */
        public final String f136762b;

        /* renamed from: c, reason: collision with root package name */
        public final String f136763c;

        static {
        }

        public e(boolean r2, String r3, String r4) {
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r4, "content");
            this.f136761a = r2;
            this.f136762b = r3;
            this.f136763c = r4;
        }

        public final String a() {
            return this.f136763c;
        }

        public final String b() {
            return this.f136762b;
        }

        public final boolean c() {
            return this.f136761a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (this.f136761a == r52.f136761a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f136762b, r52.f136762b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f136763c, r52.f136763c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f136761a) * 31) + this.f136762b.hashCode()) * 31) + this.f136763c.hashCode();
        }

        public String toString() {
            return "ShowBottomSheetEmail(isCancelable=" + this.f136761a + ", title=" + this.f136762b + ", content=" + this.f136763c + ')';
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$f */
    public static final class f implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public final int f136764a;

        /* renamed from: b, reason: collision with root package name */
        public final int f136765b;

        static {
        }

        public f(int r1, int r2) {
            this.f136764a = r1;
            this.f136765b = r2;
        }

        public final int a() {
            return this.f136765b;
        }

        public final int b() {
            return this.f136764a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (this.f136764a == r52.f136764a) goto L12;
            return false;
        L12:
            if (this.f136765b == r52.f136765b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f136764a) * 31) + Integer.hashCode(this.f136765b);
        }

        public String toString() {
            return "ShowBottomSheetError(title=" + this.f136764a + ", description=" + this.f136765b + ')';
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$g */
    public static final class g implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f136766a;

        /* renamed from: b, reason: collision with root package name */
        public final String f136767b;

        /* renamed from: c, reason: collision with root package name */
        public final String f136768c;

        static {
        }

        public g(boolean r2, String r3, String r4) {
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r4, "content");
            this.f136766a = r2;
            this.f136767b = r3;
            this.f136768c = r4;
        }

        public final String a() {
            return this.f136768c;
        }

        public final String b() {
            return this.f136767b;
        }

        public final boolean c() {
            return this.f136766a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof g) == true) goto L8;
            return false;
        L8:
            g r52 = (g) r5;
            if (this.f136766a == r52.f136766a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f136767b, r52.f136767b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f136768c, r52.f136768c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f136766a) * 31) + this.f136767b.hashCode()) * 31) + this.f136768c.hashCode();
        }

        public String toString() {
            return "ShowBottomSheetPhoneNumber(isCancelable=" + this.f136766a + ", title=" + this.f136767b + ", content=" + this.f136768c + ')';
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$h */
    public static final class h implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f136769a = null;

        static {
            f136769a = new h();
        }

        public h() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof h) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 267826975;
        }

        public String toString() {
            return "ShowChangeEmailWarningBottomSheet";
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$i */
    public static final class i implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public static final i f136770a = null;

        static {
            f136770a = new i();
        }

        public i() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof i) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 911841393;
        }

        public String toString() {
            return "ShowChangePhoneWarningBottomSheet";
        }
    }

    /* renamed from: com.stockbit.setting.ui.security.b$j */
    public static final class j implements InterfaceC10195b {

        /* renamed from: a, reason: collision with root package name */
        public final String f136771a;

        static {
        }

        public j(String r2) {
            kotlin.jvm.internal.p.l(r2, "errorMessage");
            this.f136771a = r2;
        }

        public final String a() {
            return this.f136771a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof j) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f136771a, ((j) r4).f136771a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f136771a.hashCode();
        }

        public String toString() {
            return "ShowToastError(errorMessage=" + this.f136771a + ')';
        }
    }
}
