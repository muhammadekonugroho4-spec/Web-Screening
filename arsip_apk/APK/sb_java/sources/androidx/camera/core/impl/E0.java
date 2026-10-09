package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5195a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5196b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5197c;

    public static /* synthetic */ class a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5198a;

        /* renamed from: b, reason: collision with root package name */
        public Set f5199b;

        /* renamed from: c, reason: collision with root package name */
        public Set f5200c;

        public b() {
            this.f5198a = true;
        }

        public E0 a() {
            return new E0(this.f5198a, this.f5199b, this.f5200c, null);
        }

        public b b(Set r2) {
            this.f5200c = new HashSet(r2);
            return this;
        }

        public b c(Set r2) {
            this.f5199b = new HashSet(r2);
            return this;
        }

        public b d(boolean r1) {
            this.f5198a = r1;
            return this;
        }
    }

    public /* synthetic */ E0(boolean r1, Set r2, Set r3, a r4) {
        this(r1, r2, r3);
    }

    public static E0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class r3, boolean r4) {
        if (this.f5196b.contains(r3) == false) goto L6;
        return true;
    L6:
        if (this.f5197c.contains(r3) == false) goto L9;
        return false;
    L9:
        if (this.f5195a == false) goto L12;
        if (r4 == false) goto L12;
        return true;
    L12:
        return false;
    }

    public boolean equals(Object r5) {
        if ((r5 instanceof E0) == true) goto L6;
        return false;
    L6:
        if (this != r5) goto L8;
        return true;
    L8:
        E0 r52 = (E0) r5;
        if (this.f5195a == r52.f5195a) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.f5196b, r52.f5196b) == false) goto L15;
        if (Objects.equals(this.f5197c, r52.f5197c) == false) goto L15;
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f5195a), this.f5196b, this.f5197c});
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f5195a + ", forceEnabledQuirks=" + this.f5196b + ", forceDisabledQuirks=" + this.f5197c + '}';
    }

    public E0(boolean r1, Set r2, Set r3) {
        this.f5195a = r1;
        if (r2 != null) goto L5;
        Set r12 = Collections.EMPTY_SET;
    L6:
        this.f5196b = r12;
        if (r3 != null) goto L9;
        Set r13 = Collections.EMPTY_SET;
    L10:
        this.f5197c = r13;
        return;
    L9:
        r13 = new HashSet(r3);
        goto L10
    L5:
        r12 = new HashSet(r2);
        goto L6
    }
}
