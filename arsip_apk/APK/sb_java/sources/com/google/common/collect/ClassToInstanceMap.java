package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@DoNotMock("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
    <T extends B> T getInstance(Class<T> r1);

    @CanIgnoreReturnValue
    <T extends B> T putInstance(Class<T> r1, T r2);
}
