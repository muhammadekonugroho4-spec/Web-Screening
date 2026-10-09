package com.stockbit.requestverifiedbadge.uploadphoto;

import android.os.Bundle;
import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f130819a;

        public a(Bundle r2) {
            p.l(r2, "bundle");
            super(null);
            this.f130819a = r2;
        }

        public final Bundle a() {
            return this.f130819a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f130819a, ((a) r4).f130819a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f130819a.hashCode();
        }

        public String toString() {
            return "RequestCamera(bundle=" + this.f130819a + ')';
        }
    }

    /* renamed from: com.stockbit.requestverifiedbadge.uploadphoto.b$b, reason: collision with other inner class name */
    public static final class C1188b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final File f130820a;

        public C1188b(File r2) {
            super(null);
            this.f130820a = r2;
        }

        public final File a() {
            return this.f130820a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1188b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f130820a, ((C1188b) r4).f130820a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            File r02 = this.f130820a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "SubmitPhoto(file=" + this.f130820a + ')';
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
