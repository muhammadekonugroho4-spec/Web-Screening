package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f4325a;

    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputConfiguration f4326a;

        public a(Object r1) {
            this.f4326a = (InputConfiguration) r1;
        }

        @Override // androidx.camera.camera2.internal.compat.params.i.c
        public Object a() {
            return this.f4326a;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof c) == true) goto L7;
            return false;
        L7:
            return Objects.equals(this.f4326a, ((c) r2).a());
        }

        public int hashCode() {
            return this.f4326a.hashCode();
        }

        public String toString() {
            return this.f4326a.toString();
        }
    }

    public static final class b extends a {
        public b(Object r1) {
            super(r1);
        }
    }

    public interface c {
        Object a();
    }

    public i(c r1) {
        this.f4325a = r1;
    }

    public static i b(Object r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        if (Build.VERSION.SDK_INT < 31) goto L10;
        return new i(new b(r2));
    L10:
        return new i(new a(r2));
    }

    public Object a() {
        return this.f4325a.a();
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof i) == true) goto L7;
        return false;
    L7:
        return this.f4325a.equals(((i) r2).f4325a);
    }

    public int hashCode() {
        return this.f4325a.hashCode();
    }

    public String toString() {
        return this.f4325a.toString();
    }
}
