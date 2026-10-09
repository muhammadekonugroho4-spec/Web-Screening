package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;

/* loaded from: classes6.dex */
public abstract class SerializationDelegatingTypeAdapter<T> extends TypeAdapter<T> {
    public SerializationDelegatingTypeAdapter() {
    }

    public abstract TypeAdapter<T> getSerializationDelegate();
}
