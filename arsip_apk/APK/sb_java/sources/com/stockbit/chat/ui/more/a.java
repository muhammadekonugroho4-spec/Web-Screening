package com.stockbit.chat.ui.more;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.chat.ui.more.a$a, reason: collision with other inner class name */
    public static final class C0581a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f56558a;

        static {
        }

        public C0581a(boolean r2) {
            super(null);
            this.f56558a = r2;
        }

        public final boolean a() {
            return this.f56558a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0581a) == true) goto L9;
            return false;
        L9:
            if (this.f56558a == ((C0581a) r4).f56558a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f56558a);
        }

        public String toString() {
            return "OnBlockClicked(isBlocked=" + this.f56558a + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f56559a = null;

        static {
            f56559a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f56560a;

        static {
        }

        public c(String r2) {
            p.l(r2, "chatId");
            super(null);
            this.f56560a = r2;
        }

        public final String a() {
            return this.f56560a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56560a, ((c) r4).f56560a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56560a.hashCode();
        }

        public String toString() {
            return "OnClearChatClicked(chatId=" + this.f56560a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f56561a;

        static {
        }

        public d(String r2) {
            p.l(r2, "chatId");
            super(null);
            this.f56561a = r2;
        }

        public final String a() {
            return this.f56561a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f56561a, ((d) r4).f56561a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f56561a.hashCode();
        }

        public String toString() {
            return "OnDeleteChatClicked(chatId=" + this.f56561a + ')';
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f56562a = null;

        static {
            f56562a = new e();
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f56563a = null;

        static {
            f56563a = new f();
        }

        public f() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof f) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -590302069;
        }

        public String toString() {
            return "OnShareTradeUpdated";
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
