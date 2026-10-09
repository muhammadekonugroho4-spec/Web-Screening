package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public JsonReaderInternalAccess() {
    }

    public abstract void promoteNameToValue(JsonReader r1) throws IOException;
}
