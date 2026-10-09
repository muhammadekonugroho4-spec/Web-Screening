package com.google.firebase.encoders;

import java.io.IOException;

/* loaded from: classes6.dex */
interface Encoder<TValue, TContext> {
    void encode(TValue r1, TContext r2) throws IOException;
}
