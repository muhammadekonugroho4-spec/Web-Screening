package androidx.camera.extensions.internal;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final h f6140a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final h f6141b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final h f6142c = null;
    public static final h d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final h f6143e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final h f6144f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f6145g = null;

    static {
        f6140a = c(1, 0, 0, "");
        f6141b = c(1, 1, 0, "");
        f6142c = c(1, 2, 0, "");
        d = c(1, 3, 0, "");
        f6143e = c(1, 4, 0, "");
        f6144f = c(1, 5, 0, "");
        f6145g = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");
    }

    public h() {
    }

    public static h c(int r1, int r2, int r3, String r4) {
        return new a(r1, r2, r3, r4);
    }

    public static BigInteger d(h r4) {
        return BigInteger.valueOf(r4.g()).shiftLeft(32).or(BigInteger.valueOf(r4.h())).shiftLeft(32).or(BigInteger.valueOf(r4.i()));
    }

    public static h j(String r5) {
        if (TextUtils.isEmpty(r5) == false) goto L5;
        return null;
    L5:
        Matcher r52 = f6145g.matcher(r5);
        if (r52.matches() == true) goto L8;
        return null;
    L8:
        int r02 = Integer.parseInt(r52.group(1));
        int r1 = Integer.parseInt(r52.group(2));
        int r2 = Integer.parseInt(r52.group(3));
        if (r52.group(4) == null) goto L11;
        String r53 = r52.group(4);
    L13:
        return c(r02, r1, r2, r53);
    L11:
        r53 = "";
        goto L13
    }

    public int a(int r2, int r3) {
        if (g() != r2) goto L7;
        return Integer.compare(h(), r3);
    L7:
        return Integer.compare(g(), r2);
    }

    public int b(h r2) {
        return d(this).compareTo(d(r2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return b((h) r1);
    }

    public abstract String e();

    public final boolean equals(Object r4) {
        if ((r4 instanceof h) == true) goto L5;
        return false;
    L5:
        h r42 = (h) r4;
        if (Integer.valueOf(g()).equals(Integer.valueOf(r42.g())) == true) goto L8;
    L13:
        return false;
    L8:
        if (Integer.valueOf(h()).equals(Integer.valueOf(r42.h())) == false) goto L13;
        if (Integer.valueOf(i()).equals(Integer.valueOf(r42.i())) == false) goto L13;
        return true;
    }

    public abstract int g();

    public abstract int h();

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(g()), Integer.valueOf(h()), Integer.valueOf(i())});
    }

    public abstract int i();

    public final String toString() {
        StringBuilder r02 = new StringBuilder(g() + "." + h() + "." + i());
        if (TextUtils.isEmpty(e()) == true) goto L6;
        r02.append("-" + e());
    L6:
        return r02.toString();
    }
}
