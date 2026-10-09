package com.google.firebase.components;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes6.dex */
public final class Dependency {
    private final Qualified<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(Class<?> r1, int r2, int r3) {
        this(Qualified.unqualified(r1), r2, r3);
    }

    public static Dependency deferred(Class<?> r3) {
        return new Dependency(r3, 0, 2);
    }

    private static String describeInjection(int r3) {
        if (r3 != 0) goto L4;
        return DevicePublicKeyStringDef.DIRECT;
    L4:
        if (r3 != 1) goto L6;
        return "provider";
    L6:
        if (r3 != 2) goto L10;
        return "deferred";
    L10:
        throw new AssertionError("Unsupported injection: " + r3);
    }

    @Deprecated
    public static Dependency optional(Class<?> r2) {
        return new Dependency(r2, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> r3) {
        return new Dependency(r3, 0, 1);
    }

    public static Dependency required(Class<?> r3) {
        return new Dependency(r3, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> r2) {
        return new Dependency(r2, 1, 1);
    }

    public static Dependency setOf(Class<?> r3) {
        return new Dependency(r3, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> r3) {
        return new Dependency(r3, 2, 1);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof Dependency) == false) goto L12;
        Dependency r42 = (Dependency) r4;
        if (this.anInterface.equals(r42.anInterface) == false) goto L12;
        if (this.type != r42.type) goto L12;
        if (this.injection != r42.injection) goto L12;
        return true;
    L12:
        return false;
    }

    public Qualified<?> getInterface() {
        return this.anInterface;
    }

    public int hashCode() {
        return ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.injection;
    }

    public boolean isDeferred() {
        if (this.injection != 2) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isDirectInjection() {
        if (this.injection != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isRequired() {
        if (this.type != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isSet() {
        if (this.type != 2) goto L6;
        return true;
    L6:
        return false;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("Dependency{anInterface=");
        r02.append(this.anInterface);
        r02.append(", type=");
        int r1 = this.type;
        if (r1 != 1) goto L5;
        String r12 = "required";
    L8:
        r02.append(r12);
        r02.append(", injection=");
        r02.append(describeInjection(this.injection));
        r02.append("}");
        return r02.toString();
    L5:
        if (r1 != 0) goto L7;
        r12 = "optional";
        goto L8
    L7:
        r12 = "set";
        goto L8
    }

    private Dependency(Qualified<?> r2, int r3, int r4) {
        this.anInterface = (Qualified) Preconditions.checkNotNull(r2, "Null dependency anInterface.");
        this.type = r3;
        this.injection = r4;
    }

    public static Dependency deferred(Qualified<?> r3) {
        return new Dependency(r3, 0, 2);
    }

    public static Dependency optionalProvider(Qualified<?> r3) {
        return new Dependency(r3, 0, 1);
    }

    public static Dependency required(Qualified<?> r3) {
        return new Dependency(r3, 1, 0);
    }

    public static Dependency requiredProvider(Qualified<?> r2) {
        return new Dependency(r2, 1, 1);
    }

    public static Dependency setOf(Qualified<?> r3) {
        return new Dependency(r3, 2, 0);
    }

    public static Dependency setOfProvider(Qualified<?> r3) {
        return new Dependency(r3, 2, 1);
    }
}
