package com.google.firebase.perf;

import java.util.Map;

/* loaded from: classes6.dex */
public interface FirebasePerformanceAttributable {
    public static final int MAX_ATTRIBUTE_KEY_LENGTH = 40;
    public static final int MAX_ATTRIBUTE_VALUE_LENGTH = 100;
    public static final int MAX_TRACE_CUSTOM_ATTRIBUTES = 5;
    public static final int MAX_TRACE_NAME_LENGTH = 100;

    String getAttribute(String r1);

    Map<String, String> getAttributes();

    void putAttribute(String r1, String r2);

    void removeAttribute(String r1);
}
