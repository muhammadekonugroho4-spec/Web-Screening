package androidx.core.os;

import android.os.LocaleList;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f22967b = null;

    /* renamed from: a, reason: collision with root package name */
    public final j f22968a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Locale[] f22969a = null;

        static {
            f22969a = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};
        }

        public static Locale a(String r02) {
            return Locale.forLanguageTag(r02);
        }
    }

    public static class b {
        public static LocaleList a(Locale... r1) {
            return new LocaleList(r1);
        }
    }

    static {
        f22967b = a(new Locale[0]);
    }

    public i(j r1) {
        this.f22968a = r1;
    }

    public static i a(Locale... r02) {
        return i(b.a(r02));
    }

    public static i b(String r4) {
        if (r4 == null) goto L12;
        if (r4.isEmpty() == true) goto L12;
        String[] r42 = r4.split(Constants.SEPARATOR_COMMA, -1);
        int r02 = r42.length;
        Locale[] r1 = new Locale[r02];
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L10;
        r1[r2] = a.a(r42[r2]);
        r2 = r2 + 1;
        goto L7
    L10:
        return a(r1);
    L12:
        return d();
    }

    public static i d() {
        return f22967b;
    }

    public static i i(LocaleList r2) {
        return new i(new k(r2));
    }

    public Locale c(int r2) {
        return this.f22968a.get(r2);
    }

    public boolean e() {
        return this.f22968a.isEmpty();
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof i) == true) goto L5;
        return false;
    L5:
        if (this.f22968a.equals(((i) r2).f22968a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int f() {
        return this.f22968a.size();
    }

    public String g() {
        return this.f22968a.a();
    }

    public Object h() {
        return this.f22968a.b();
    }

    public int hashCode() {
        return this.f22968a.hashCode();
    }

    public String toString() {
        return this.f22968a.toString();
    }
}
