package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class ArrayBasedEscaperMap {
    private static final char[][] EMPTY_REPLACEMENT_ARRAY = null;
    private final char[][] replacementArray;

    static {
        EMPTY_REPLACEMENT_ARRAY = (char[][]) Array.newInstance(Character.TYPE, new int[]{0, 0});
    }

    private ArrayBasedEscaperMap(char[][] r1) {
        this.replacementArray = r1;
    }

    public static ArrayBasedEscaperMap create(Map<Character, String> r1) {
        return new ArrayBasedEscaperMap(createReplacementArray(r1));
    }

    @VisibleForTesting
    public static char[][] createReplacementArray(Map<Character, String> r4) {
        Preconditions.checkNotNull(r4);
        if (r4.isEmpty() == true) goto L5;
        char[][] r02 = new char[((Character) Collections.max(r4.keySet())).charValue() + 1][];
        Iterator<Character> r1 = r4.keySet().iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        Character r2 = r1.next();
        r02[r2.charValue()] = r4.get(r2).toCharArray();
        goto L8
    L10:
        return r02;
    L5:
        return EMPTY_REPLACEMENT_ARRAY;
    }

    public char[][] getReplacementArray() {
        return this.replacementArray;
    }
}
