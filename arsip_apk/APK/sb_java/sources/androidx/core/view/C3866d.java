package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3866d {

    /* renamed from: a, reason: collision with root package name */
    public final f f23214a;

    /* renamed from: androidx.core.view.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f23215a;

        public a(ClipData r3, int r4) {
            if (Build.VERSION.SDK_INT < 31) goto L6;
            this.f23215a = new b(r3, r4);
            return;
        L6:
            this.f23215a = new C0174d(r3, r4);
        }

        public C3866d a() {
            return this.f23215a.build();
        }

        public a b(Bundle r2) {
            this.f23215a.setExtras(r2);
            return this;
        }

        public a c(int r2) {
            this.f23215a.b(r2);
            return this;
        }

        public a d(Uri r2) {
            this.f23215a.a(r2);
            return this;
        }
    }

    /* renamed from: androidx.core.view.d$b */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f23216a;

        public b(ClipData r1, int r2) {
            this.f23216a = AbstractC3876i.a(r1, r2);
        }

        @Override // androidx.core.view.C3866d.c
        public void a(Uri r2) {
            AbstractC3872g.a(this.f23216a, r2);
        }

        @Override // androidx.core.view.C3866d.c
        public void b(int r2) {
            AbstractC3870f.a(this.f23216a, r2);
        }

        @Override // androidx.core.view.C3866d.c
        public C3866d build() {
            return new C3866d(new e(AbstractC3868e.a(this.f23216a)));
        }

        @Override // androidx.core.view.C3866d.c
        public void setExtras(Bundle r2) {
            AbstractC3874h.a(this.f23216a, r2);
        }
    }

    /* renamed from: androidx.core.view.d$c */
    public interface c {
        void a(Uri r1);

        void b(int r1);

        C3866d build();

        void setExtras(Bundle r1);
    }

    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    public static final class C0174d implements c {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f23217a;

        /* renamed from: b, reason: collision with root package name */
        public int f23218b;

        /* renamed from: c, reason: collision with root package name */
        public int f23219c;
        public Uri d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f23220e;

        public C0174d(ClipData r1, int r2) {
            this.f23217a = r1;
            this.f23218b = r2;
        }

        @Override // androidx.core.view.C3866d.c
        public void a(Uri r1) {
            this.d = r1;
        }

        @Override // androidx.core.view.C3866d.c
        public void b(int r1) {
            this.f23219c = r1;
        }

        @Override // androidx.core.view.C3866d.c
        public C3866d build() {
            return new C3866d(new g(this));
        }

        @Override // androidx.core.view.C3866d.c
        public void setExtras(Bundle r1) {
            this.f23220e = r1;
        }
    }

    /* renamed from: androidx.core.view.d$e */
    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f23221a;

        public e(ContentInfo r1) {
            this.f23221a = AbstractC3864c.a(androidx.core.util.h.g(r1));
        }

        @Override // androidx.core.view.C3866d.f
        public ClipData a() {
            return AbstractC3878j.a(this.f23221a);
        }

        @Override // androidx.core.view.C3866d.f
        public ContentInfo b() {
            return this.f23221a;
        }

        @Override // androidx.core.view.C3866d.f
        public int c() {
            return AbstractC3880k.a(this.f23221a);
        }

        @Override // androidx.core.view.C3866d.f
        public int getSource() {
            return AbstractC3882l.a(this.f23221a);
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f23221a + "}";
        }
    }

    /* renamed from: androidx.core.view.d$f */
    public interface f {
        ClipData a();

        ContentInfo b();

        int c();

        int getSource();
    }

    /* renamed from: androidx.core.view.d$g */
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f23222a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23223b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23224c;
        public final Uri d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f23225e;

        public g(C0174d r5) {
            this.f23222a = (ClipData) androidx.core.util.h.g(r5.f23217a);
            this.f23223b = androidx.core.util.h.c(r5.f23218b, 0, 5, "source");
            this.f23224c = androidx.core.util.h.f(r5.f23219c, 1);
            this.d = r5.d;
            this.f23225e = r5.f23220e;
        }

        @Override // androidx.core.view.C3866d.f
        public ClipData a() {
            return this.f23222a;
        }

        @Override // androidx.core.view.C3866d.f
        public ContentInfo b() {
            return null;
        }

        @Override // androidx.core.view.C3866d.f
        public int c() {
            return this.f23224c;
        }

        @Override // androidx.core.view.C3866d.f
        public int getSource() {
            return this.f23223b;
        }

        public String toString() {
            StringBuilder r02 = new StringBuilder();
            r02.append("ContentInfoCompat{clip=");
            r02.append(this.f23222a.getDescription());
            r02.append(", source=");
            r02.append(C3866d.e(this.f23223b));
            r02.append(", flags=");
            r02.append(C3866d.a(this.f23224c));
            String r2 = "";
            if (this.d != null) goto L5;
            String r1 = "";
        L6:
            r02.append(r1);
            if (this.f23225e == null) goto L10;
            r2 = ", hasExtras";
        L10:
            r02.append(r2);
            r02.append("}");
            return r02.toString();
        L5:
            r1 = ", hasLinkUri(" + this.d.toString().length() + ")";
            goto L6
        }
    }

    public C3866d(f r1) {
        this.f23214a = r1;
    }

    public static String a(int r1) {
        if ((r1 & 1) == 0) goto L7;
        return "FLAG_CONVERT_TO_PLAIN_TEXT";
    L7:
        return String.valueOf(r1);
    }

    public static String e(int r1) {
        if (r1 != 0) goto L4;
        return "SOURCE_APP";
    L4:
        if (r1 != 1) goto L6;
        return "SOURCE_CLIPBOARD";
    L6:
        if (r1 != 2) goto L8;
        return "SOURCE_INPUT_METHOD";
    L8:
        if (r1 != 3) goto L10;
        return "SOURCE_DRAG_AND_DROP";
    L10:
        if (r1 != 4) goto L12;
        return "SOURCE_AUTOFILL";
    L12:
        if (r1 != 5) goto L14;
        return "SOURCE_PROCESS_TEXT";
    L14:
        return String.valueOf(r1);
    }

    public static C3866d g(ContentInfo r2) {
        return new C3866d(new e(r2));
    }

    public ClipData b() {
        return this.f23214a.a();
    }

    public int c() {
        return this.f23214a.c();
    }

    public int d() {
        return this.f23214a.getSource();
    }

    public ContentInfo f() {
        ContentInfo r02 = this.f23214a.b();
        Objects.requireNonNull(r02);
        return AbstractC3864c.a(r02);
    }

    public String toString() {
        return this.f23214a.toString();
    }
}
