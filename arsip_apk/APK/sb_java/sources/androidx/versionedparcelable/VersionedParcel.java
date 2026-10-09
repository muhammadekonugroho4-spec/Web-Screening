package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.C2337a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class VersionedParcel {

    /* renamed from: a, reason: collision with root package name */
    public final C2337a f28564a;

    /* renamed from: b, reason: collision with root package name */
    public final C2337a f28565b;

    /* renamed from: c, reason: collision with root package name */
    public final C2337a f28566c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C2337a r1, C2337a r2, C2337a r3) {
        this.f28564a = r1;
        this.f28565b = r2;
        this.f28566c = r3;
    }

    public abstract void A(byte[] r1);

    public void B(byte[] r1, int r2) {
        w(r2);
        A(r1);
    }

    public abstract void C(CharSequence r1);

    public void D(CharSequence r1, int r2) {
        w(r2);
        C(r1);
    }

    public abstract void E(int r1);

    public void F(int r1, int r2) {
        w(r2);
        E(r1);
    }

    public abstract void G(Parcelable r1);

    public void H(Parcelable r1, int r2) {
        w(r2);
        G(r1);
    }

    public abstract void I(String r1);

    public void J(String r1, int r2) {
        w(r2);
        I(r1);
    }

    public void K(b r2, VersionedParcel r3) {
        e(r2.getClass()).invoke(null, new Object[]{r2, r3});     // Catch: ClassNotFoundException -> L4 NoSuchMethodException -> L6 InvocationTargetException -> L8 IllegalAccessException -> L10
        return;
    L4:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L10:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L6:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L8:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L21;
        throw ((RuntimeException) e.getCause());
    L21:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    }

    public void L(b r2) {
        if (r2 != null) goto L5;
        I(null);
        return;
    L5:
        N(r2);
        VersionedParcel r02 = b();
        K(r2, r02);
        r02.a();
    }

    public void M(b r1, int r2) {
        w(r2);
        L(r1);
    }

    public final void N(b r4) {
        I(c(r4.getClass()).getName());
        return;
    L5:
        e = move-exception;
        throw new RuntimeException(r4.getClass().getSimpleName() + " does not have a Parcelizer", e);
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class r4) {
        Class r02 = (Class) this.f28566c.get(r4.getName());
        if (r02 != null) goto L6;
        Class<?> r03 = Class.forName(String.format("%s.%sParcelizer", new Object[]{r4.getPackage().getName(), r4.getSimpleName()}), false, r4.getClassLoader());
        this.f28566c.put(r4.getName(), r03);
        return r03;
    L6:
        return r02;
    }

    public final Method d(String r4) {
        Method r02 = (Method) this.f28564a.get(r4);
        if (r02 != null) goto L6;
        System.currentTimeMillis();
        Method r03 = Class.forName(r4, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", new Class[]{VersionedParcel.class});
        this.f28564a.put(r4, r03);
        return r03;
    L6:
        return r02;
    }

    public final Method e(Class r4) {
        Method r02 = (Method) this.f28565b.get(r4.getName());
        if (r02 != null) goto L6;
        Class r03 = c(r4);
        System.currentTimeMillis();
        Method r04 = r03.getDeclaredMethod("write", new Class[]{r4, VersionedParcel.class});
        this.f28565b.put(r4.getName(), r04);
        return r04;
    L6:
        return r02;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean r1, int r2) {
        if (m(r2) == true) goto L6;
        return r1;
    L6:
        return g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] r1, int r2) {
        if (m(r2) == true) goto L6;
        return r1;
    L6:
        return i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence r1, int r2) {
        if (m(r2) == true) goto L6;
        return r1;
    L6:
        return k();
    }

    public abstract boolean m(int r1);

    public b n(String r2, VersionedParcel r3) {
        return (b) d(r2).invoke(null, new Object[]{r3});
    L4:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L10:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L6:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L8:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L21;
        throw ((RuntimeException) e.getCause());
    L21:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    }

    public abstract int o();

    public int p(int r1, int r2) {
        if (m(r2) == true) goto L6;
        return r1;
    L6:
        return o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable r1, int r2) {
        if (m(r2) == true) goto L6;
        return r1;
    L6:
        return q();
    }

    public abstract String s();

    public String t(String r1, int r2) {
        if (m(r2) == true) goto L6;
        return r1;
    L6:
        return s();
    }

    public b u() {
        String r02 = s();
        if (r02 != null) goto L7;
        return null;
    L7:
        return n(r02, b());
    }

    public b v(b r1, int r2) {
        if (m(r2) == true) goto L6;
        return r1;
    L6:
        return u();
    }

    public abstract void w(int r1);

    public void x(boolean r1, boolean r2) {
    }

    public abstract void y(boolean r1);

    public void z(boolean r1, int r2) {
        w(r2);
        y(r1);
    }
}
