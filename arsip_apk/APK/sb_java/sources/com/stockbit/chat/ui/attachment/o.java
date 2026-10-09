package com.stockbit.chat.ui.attachment;

/* loaded from: classes7.dex */
public abstract class o {

    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.chat.model.giphy.c f55775a;

        static {
        }

        public a(com.stockbit.usecase.chat.model.giphy.c r2) {
            kotlin.jvm.internal.p.l(r2, "giphy");
            super(null);
            this.f55775a = r2;
        }

        public final com.stockbit.usecase.chat.model.giphy.c a() {
            return this.f55775a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f55775a, ((a) r4).f55775a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55775a.hashCode();
        }

        public String toString() {
            return "AttachmentGIF(giphy=" + this.f55775a + ')';
        }
    }

    public static final class b extends o {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.chat.model.giphy.c f55776a;

        static {
        }

        public b(com.stockbit.usecase.chat.model.giphy.c r2) {
            kotlin.jvm.internal.p.l(r2, "giphy");
            super(null);
            this.f55776a = r2;
        }

        public final com.stockbit.usecase.chat.model.giphy.c a() {
            return this.f55776a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f55776a, ((b) r4).f55776a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55776a.hashCode();
        }

        public String toString() {
            return "AttachmentSticker(giphy=" + this.f55776a + ')';
        }
    }

    static {
    }

    public /* synthetic */ o(kotlin.jvm.internal.i r1) {
        this();
    }

    public o() {
    }
}
