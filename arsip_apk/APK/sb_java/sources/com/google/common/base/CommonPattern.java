package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
abstract class CommonPattern {
    public CommonPattern() {
    }

    public static CommonPattern compile(String r02) {
        return Platform.compilePattern(r02);
    }

    public static boolean isPcreLike() {
        return Platform.patternCompilerIsPcreLike();
    }

    public abstract int flags();

    public abstract CommonMatcher matcher(CharSequence r1);

    public abstract String pattern();

    public abstract String toString();
}
