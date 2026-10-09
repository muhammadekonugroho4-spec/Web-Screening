package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Charsets {
    public static final Charset ISO_8859_1 = null;

    @GwtIncompatible
    public static final Charset US_ASCII = null;

    @GwtIncompatible
    public static final Charset UTF_16 = null;

    @GwtIncompatible
    public static final Charset UTF_16BE = null;

    @GwtIncompatible
    public static final Charset UTF_16LE = null;
    public static final Charset UTF_8 = null;

    static {
        US_ASCII = Charset.forName("US-ASCII");
        ISO_8859_1 = Charset.forName("ISO-8859-1");
        UTF_8 = Charset.forName("UTF-8");
        UTF_16BE = Charset.forName("UTF-16BE");
        UTF_16LE = Charset.forName("UTF-16LE");
        UTF_16 = Charset.forName("UTF-16");
    }

    private Charsets() {
    }
}
