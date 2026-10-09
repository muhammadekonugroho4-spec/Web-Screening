package com.google.android.datatransport;

/* loaded from: classes4.dex */
public interface TransportFactory {
    <T> Transport<T> getTransport(String r1, Class<T> r2, Encoding r3, Transformer<T, byte[]> r4);

    @Deprecated
    <T> Transport<T> getTransport(String r1, Class<T> r2, Transformer<T, byte[]> r3);
}
