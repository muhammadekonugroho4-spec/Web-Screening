package com.google.firebase.encoders;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes6.dex */
public interface DataEncoder {
    String encode(Object r1);

    void encode(Object r1, Writer r2) throws IOException;
}
