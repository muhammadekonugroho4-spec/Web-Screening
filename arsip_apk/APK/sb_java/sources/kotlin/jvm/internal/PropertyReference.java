package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public abstract class PropertyReference extends CallableReference implements kotlin.reflect.l {
    private final boolean syntheticJavaProperty;

    public PropertyReference(Object r10, Class r11, String r12, String r13, int r14) {
        boolean r1 = false;
        if ((r14 & 1) != 1) goto L6;
        boolean r8 = true;
    L7:
        super(r10, r11, r12, r13, r8);
        if ((r14 & 2) != 2) goto L10;
        r1 = true;
    L10:
        this.syntheticJavaProperty = r1;
        return;
    L6:
        r8 = false;
        goto L7
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c compute() {
        if (this.syntheticJavaProperty == false) goto L6;
        return this;
    L6:
        return super.compute();
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof PropertyReference) == false) goto L18;
        PropertyReference r52 = (PropertyReference) r5;
        if (getOwner().equals(r52.getOwner()) == true) goto L10;
    L16:
        return false;
    L10:
        if (getName().equals(r52.getName()) == false) goto L16;
        if (getSignature().equals(r52.getSignature()) == false) goto L16;
        if (p.g(getBoundReceiver(), r52.getBoundReceiver()) == false) goto L16;
        return true;
    L18:
        if ((r5 instanceof kotlin.reflect.l) == true) goto L20;
        return false;
    L20:
        return r5.equals(compute());
    }

    @Override // kotlin.jvm.internal.CallableReference
    public /* bridge */ /* synthetic */ kotlin.reflect.c getReflected() {
        return getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.l
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.l
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.c r02 = compute();
        if (r02 == this) goto L7;
        return r02.toString();
    L7:
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.l getReflected() {
        if (this.syntheticJavaProperty == true) goto L7;
        return (kotlin.reflect.l) super.getReflected();
    L7:
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
