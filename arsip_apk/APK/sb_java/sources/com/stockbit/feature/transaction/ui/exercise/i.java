package com.stockbit.feature.transaction.ui.exercise;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class i implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f113541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113542b;

    /* renamed from: c, reason: collision with root package name */
    public final String f113543c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(i.class.getClassLoader());
            if (r5.containsKey("symbol") == false) goto L27;
            String r02 = r5.getString("symbol");
            if (r02 == null) goto L25;
            if (r5.containsKey("exerciseType") == false) goto L23;
            String r1 = r5.getString("exerciseType");
            if (r1 == null) goto L21;
            if (r5.containsKey("infoExercise") == false) goto L19;
            String r52 = r5.getString("infoExercise");
            if (r52 == null) goto L17;
            return new i(r02, r1, r52);
        L17:
            throw new IllegalArgumentException("Argument \"infoExercise\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"infoExercise\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"exerciseType\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"exerciseType\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"symbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public i(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "exerciseType");
        kotlin.jvm.internal.p.l(r4, "infoExercise");
        this.f113541a = r2;
        this.f113542b = r3;
        this.f113543c = r4;
    }

    public static final i fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f113542b;
    }

    public final String b() {
        return this.f113543c;
    }

    public final String c() {
        return this.f113541a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f113541a, r52.f113541a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f113542b, r52.f113542b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f113543c, r52.f113543c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f113541a.hashCode() * 31) + this.f113542b.hashCode()) * 31) + this.f113543c.hashCode();
    }

    public String toString() {
        return "ExerciseFragmentArgs(symbol=" + this.f113541a + ", exerciseType=" + this.f113542b + ", infoExercise=" + this.f113543c + ')';
    }
}
