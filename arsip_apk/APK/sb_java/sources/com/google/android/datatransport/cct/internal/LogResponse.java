package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* loaded from: classes4.dex */
public abstract class LogResponse {
    private static final String LOG_TAG = "LogResponseInternal";

    public LogResponse() {
    }

    public static LogResponse create(long r1) {
        return new AutoValue_LogResponse(r1);
    }

    public static LogResponse fromJson(Reader r3) throws IOException {
        JsonReader r02 = new JsonReader(r3);
        r02.beginObject();     // Catch: Throwable -> L13
    L5:
        if (r02.hasNext() == false) goto L20;
        if (r02.nextName().equals("nextRequestWaitMillis") == true) goto L9;
        r02.skipValue();     // Catch: Throwable -> L13
        goto L5
    L9:
        if (r02.peek() != JsonToken.STRING) goto L15;
        LogResponse r32 = create(Long.parseLong(r02.nextString()));     // Catch: Throwable -> L13
        r02.close();
        return r32;
    L15:
        LogResponse r33 = create(r02.nextLong());     // Catch: Throwable -> L13
        r02.close();
        return r33;
    L20:
        throw new IOException("Response is missing nextRequestWaitMillis field.");     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r02.close();
        throw th;
    }

    public abstract long getNextRequestWaitMillis();
}
