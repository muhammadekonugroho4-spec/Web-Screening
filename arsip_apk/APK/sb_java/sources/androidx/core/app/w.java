package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f22702a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f22703b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f22704c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22705e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f22706f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f22707g;

    public static class a {
        public static RemoteInput a(w r4) {
            RemoteInput.Builder r02 = new RemoteInput.Builder(r4.j()).setLabel(r4.i()).setChoices(r4.f()).setAllowFreeFormInput(r4.d()).addExtras(r4.h());
            Set r1 = r4.e();
            if (r1 == null) goto L9;
            Iterator r12 = r1.iterator();
        L6:
            if (r12.hasNext() == false) goto L9;
            b.b(r02, (String) r12.next(), true);
        L9:
            if (Build.VERSION.SDK_INT < 29) goto L12;
            c.b(r02, r4.g());
        L12:
            return r02.build();
        }

        public static w b(Object r4) {
            RemoteInput r42 = (RemoteInput) r4;
            d r02 = new d(r42.getResultKey()).g(r42.getLabel()).e(r42.getChoices()).d(r42.getAllowFreeFormInput()).a(r42.getExtras());
            Set r1 = b.a(r42);
            if (r1 == null) goto L9;
            Iterator r12 = r1.iterator();
        L6:
            if (r12.hasNext() == false) goto L9;
            r02.c((String) r12.next(), true);
        L9:
            if (Build.VERSION.SDK_INT < 29) goto L12;
            r02.f(c.a(r42));
        L12:
            return r02.b();
        }
    }

    public static class b {
        public static Set a(Object r02) {
            return ((RemoteInput) r02).getAllowedDataTypes();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder r02, String r1, boolean r2) {
            return r02.setAllowDataType(r1, r2);
        }
    }

    public static class c {
        public static int a(Object r02) {
            return ((RemoteInput) r02).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder r02, int r1) {
            return r02.setEditChoicesBeforeSending(r1);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f22708a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f22709b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f22710c;
        public CharSequence d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence[] f22711e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22712f;

        /* renamed from: g, reason: collision with root package name */
        public int f22713g;

        public d(String r2) {
            this.f22709b = new HashSet();
            this.f22710c = new Bundle();
            this.f22712f = true;
            this.f22713g = 0;
            if (r2 == null) goto L7;
            this.f22708a = r2;
            return;
        L7:
            throw new IllegalArgumentException("Result key can't be null");
        }

        public d a(Bundle r2) {
            if (r2 == null) goto L4;
            this.f22710c.putAll(r2);
        L4:
            return this;
        }

        public w b() {
            return new w(this.f22708a, this.d, this.f22711e, this.f22712f, this.f22713g, this.f22710c, this.f22709b);
        }

        public d c(String r1, boolean r2) {
            if (r2 == false) goto L5;
            this.f22709b.add(r1);
            return this;
        L5:
            this.f22709b.remove(r1);
            return this;
        }

        public d d(boolean r1) {
            this.f22712f = r1;
            return this;
        }

        public d e(CharSequence[] r1) {
            this.f22711e = r1;
            return this;
        }

        public d f(int r1) {
            this.f22713g = r1;
            return this;
        }

        public d g(CharSequence r1) {
            this.d = r1;
            return this;
        }
    }

    public w(String r1, CharSequence r2, CharSequence[] r3, boolean r4, int r5, Bundle r6, Set r7) {
        this.f22702a = r1;
        this.f22703b = r2;
        this.f22704c = r3;
        this.d = r4;
        this.f22705e = r5;
        this.f22706f = r6;
        this.f22707g = r7;
        if (g() == 2) goto L5;
        return;
    L5:
        if (d() == false) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
    }

    public static RemoteInput a(w r02) {
        return a.a(r02);
    }

    public static RemoteInput[] b(w[] r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        RemoteInput[] r02 = new RemoteInput[r3.length];
        int r1 = 0;
    L7:
        if (r1 >= r3.length) goto L9;
        r02[r1] = a(r3[r1]);
        r1 = r1 + 1;
        goto L7
    L9:
        return r02;
    }

    public static w c(RemoteInput r02) {
        return a.b(r02);
    }

    public boolean d() {
        return this.d;
    }

    public Set e() {
        return this.f22707g;
    }

    public CharSequence[] f() {
        return this.f22704c;
    }

    public int g() {
        return this.f22705e;
    }

    public Bundle h() {
        return this.f22706f;
    }

    public CharSequence i() {
        return this.f22703b;
    }

    public String j() {
        return this.f22702a;
    }

    public boolean k() {
        if (d() == false) goto L5;
        return false;
    L5:
        if (f() == null) goto L9;
        if (f().length == 0) goto L9;
        return false;
    L9:
        if (e() != null) goto L11;
        return false;
    L11:
        if (e().isEmpty() == true) goto L18;
        return true;
    L18:
        return false;
    }
}
