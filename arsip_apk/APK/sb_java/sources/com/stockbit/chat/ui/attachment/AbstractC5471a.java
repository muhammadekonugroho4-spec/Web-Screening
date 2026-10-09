package com.stockbit.chat.ui.attachment;

/* renamed from: com.stockbit.chat.ui.attachment.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5471a {

    /* renamed from: com.stockbit.chat.ui.attachment.a$a, reason: collision with other inner class name */
    public static final class C0567a extends AbstractC5471a {

        /* renamed from: a, reason: collision with root package name */
        public final String f55748a;

        static {
        }

        public C0567a(String r2) {
            kotlin.jvm.internal.p.l(r2, "query");
            super(null);
            this.f55748a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0567a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f55748a, ((C0567a) r4).f55748a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55748a.hashCode();
        }

        public String toString() {
            return "GetDataGIF(query=" + this.f55748a + ')';
        }

        public /* synthetic */ C0567a(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "";
        L5:
            this(r1);
        }
    }

    /* renamed from: com.stockbit.chat.ui.attachment.a$b */
    public static final class b extends AbstractC5471a {

        /* renamed from: a, reason: collision with root package name */
        public final String f55749a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "query");
            super(null);
            this.f55749a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f55749a, ((b) r4).f55749a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f55749a.hashCode();
        }

        public String toString() {
            return "GetDataSticker(query=" + this.f55749a + ')';
        }

        public /* synthetic */ b(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = "";
        L5:
            this(r1);
        }
    }

    static {
    }

    public /* synthetic */ AbstractC5471a(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC5471a() {
    }
}
