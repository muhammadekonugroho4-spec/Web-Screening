package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.X;

/* loaded from: classes3.dex */
public class p implements r {
    public p() {
    }

    public static /* synthetic */ void b(int r3) {
        Object[] r02 = new Object[3];
        switch(r3) {
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L4;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L9;
            case 8: goto L6;
            case 9: goto L5;
            case 10: goto L8;
            case 11: goto L7;
            default: goto L4;
        };
    L4:
        r02[0] = "a";
    L11:
        r02[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch(r3) {
            case 3: goto L17;
            case 4: goto L17;
            case 5: goto L16;
            case 6: goto L16;
            case 7: goto L16;
            case 8: goto L15;
            case 9: goto L15;
            case 10: goto L14;
            case 11: goto L14;
            default: goto L13;
        };
    L13:
        r02[2] = "assertEqualTypes";
    L19:
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", r02));
    L14:
        r02[2] = "noCorrespondingSupertype";
        goto L19
    L15:
        r02[2] = "capture";
        goto L19
    L16:
        r02[2] = "assertSubtype";
        goto L19
    L17:
        r02[2] = "assertEqualTypeConstructors";
        goto L19
    L5:
        r02[0] = "typeProjection";
        goto L11
    L6:
        r02[0] = "type";
        goto L11
    L7:
        r02[0] = "supertype";
        goto L11
    L8:
        r02[0] = "subtype";
        goto L11
    L9:
        r02[0] = "typeCheckingProcedure";
        goto L11
    L10:
        r02[0] = "b";
        goto L11
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.r
    public boolean a(X r2, X r3) {
        if (r2 != null) goto L4;
        b(3);
    L4:
        if (r3 != null) goto L7;
        b(4);
    L7:
        return r2.equals(r3);
    }
}
