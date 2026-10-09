package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public abstract class Escaper {
    private final Function<String, String> asFunction;

    public Escaper() {
        this.asFunction = new a(this);
    }

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }

    public abstract String escape(String r1);
}
