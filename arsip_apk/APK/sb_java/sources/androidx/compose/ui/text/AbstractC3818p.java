package androidx.compose.ui.text;

import androidx.compose.ui.text.C3740e;

/* renamed from: androidx.compose.ui.text.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3818p implements C3740e.a {

    /* renamed from: androidx.compose.ui.text.p$a */
    public static final class a extends AbstractC3818p {

        /* renamed from: a, reason: collision with root package name */
        public final String f20163a;

        /* renamed from: b, reason: collision with root package name */
        public final y1 f20164b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC3820q f20165c;

        static {
        }

        public a(String r2, y1 r3, InterfaceC3820q r4) {
            super(null);
            this.f20163a = r2;
            this.f20164b = r3;
            this.f20165c = r4;
        }

        public static /* synthetic */ a d(a r02, String r1, y1 r2, InterfaceC3820q r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r02.f20163a;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r02.b();
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r02.a();
        L12:
            return r02.c(r1, r2, r3);
        }

        @Override // androidx.compose.ui.text.AbstractC3818p
        public InterfaceC3820q a() {
            return this.f20165c;
        }

        @Override // androidx.compose.ui.text.AbstractC3818p
        public y1 b() {
            return this.f20164b;
        }

        public final a c(String r2, y1 r3, InterfaceC3820q r4) {
            return new a(r2, r3, r4);
        }

        public final String e() {
            return this.f20163a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f20163a, r52.f20163a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(b(), r52.b()) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(a(), r52.a()) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = this.f20163a.hashCode() * 31;
            y1 r1 = b();
            int r2 = 0;
            if (r1 == null) goto L5;
            int r12 = r1.hashCode();
        L6:
            int r03 = (r02 + r12) * 31;
            InterfaceC3820q r13 = a();
            if (r13 == null) goto L10;
            r2 = r13.hashCode();
        L10:
            return r03 + r2;
        L5:
            r12 = 0;
            goto L6
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f20163a + ')';
        }
    }

    /* renamed from: androidx.compose.ui.text.p$b */
    public static final class b extends AbstractC3818p {

        /* renamed from: a, reason: collision with root package name */
        public final String f20166a;

        /* renamed from: b, reason: collision with root package name */
        public final y1 f20167b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC3820q f20168c;

        static {
        }

        public b(String r2, y1 r3, InterfaceC3820q r4) {
            super(null);
            this.f20166a = r2;
            this.f20167b = r3;
            this.f20168c = r4;
        }

        public static /* synthetic */ b d(b r02, String r1, y1 r2, InterfaceC3820q r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r02.f20166a;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r02.b();
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r02.a();
        L12:
            return r02.c(r1, r2, r3);
        }

        @Override // androidx.compose.ui.text.AbstractC3818p
        public InterfaceC3820q a() {
            return this.f20168c;
        }

        @Override // androidx.compose.ui.text.AbstractC3818p
        public y1 b() {
            return this.f20167b;
        }

        public final b c(String r2, y1 r3, InterfaceC3820q r4) {
            return new b(r2, r3, r4);
        }

        public final String e() {
            return this.f20166a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f20166a, r52.f20166a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(b(), r52.b()) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(a(), r52.a()) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = this.f20166a.hashCode() * 31;
            y1 r1 = b();
            int r2 = 0;
            if (r1 == null) goto L5;
            int r12 = r1.hashCode();
        L6:
            int r03 = (r02 + r12) * 31;
            InterfaceC3820q r13 = a();
            if (r13 == null) goto L10;
            r2 = r13.hashCode();
        L10:
            return r03 + r2;
        L5:
            r12 = 0;
            goto L6
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f20166a + ')';
        }

        public /* synthetic */ b(String r2, y1 r3, InterfaceC3820q r4, int r5, kotlin.jvm.internal.i r6) {
            if ((r5 & 2) == 0) goto L6;
            r3 = null;
        L6:
            if ((r5 & 4) == 0) goto L8;
            r4 = null;
        L8:
            this(r2, r3, r4);
        }
    }

    static {
    }

    public /* synthetic */ AbstractC3818p(kotlin.jvm.internal.i r1) {
        this();
    }

    public abstract InterfaceC3820q a();

    public abstract y1 b();

    public AbstractC3818p() {
    }
}
