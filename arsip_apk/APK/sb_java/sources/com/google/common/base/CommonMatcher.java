package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
abstract class CommonMatcher {
    public CommonMatcher() {
    }

    public abstract int end();

    public abstract boolean find();

    public abstract boolean find(int r1);

    public abstract boolean matches();

    public abstract String replaceAll(String r1);

    public abstract int start();
}
