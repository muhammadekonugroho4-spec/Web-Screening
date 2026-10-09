package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.gojek.ojosdk.exif.ExifInterface;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
final class TopicOperation {
    private static final String OLD_TOPIC_PREFIX = "/topics/";
    static final String OPERATION_PAIR_DIVIDER = "!";
    private static final String TOPIC_NAME_PATTERN = "[a-zA-Z0-9-_.~%]{1,900}";
    private static final Pattern TOPIC_NAME_REGEXP = null;
    private final String operation;
    private final String serializedString;
    private final String topic;

    static {
        TOPIC_NAME_REGEXP = Pattern.compile(TOPIC_NAME_PATTERN);
    }

    private TopicOperation(String r2, String r3) {
        this.topic = normalizeTopicOrThrow(r3, r2);
        this.operation = r2;
        this.serializedString = r2 + OPERATION_PAIR_DIVIDER + r3;
    }

    public static TopicOperation from(String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
        return null;
    L5:
        String[] r32 = r3.split(OPERATION_PAIR_DIVIDER, -1);
        if (r32.length == 2) goto L9;
        return null;
    L9:
        return new TopicOperation(r32[0], r32[1]);
    }

    private static String normalizeTopicOrThrow(String r1, String r2) {
        if (r1 != null) goto L4;
    L6:
        if (r1 == null) goto L11;
        if (TOPIC_NAME_REGEXP.matcher(r1).matches() == false) goto L11;
        return r1;
    L11:
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{r1, TOPIC_NAME_PATTERN}));
    L4:
        if (r1.startsWith(OLD_TOPIC_PREFIX) == false) goto L6;
        Log.w(Constants.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{r2}));
        r1 = r1.substring(8);
        goto L6
    }

    public static TopicOperation subscribe(String r2) {
        return new TopicOperation(ExifInterface.GpsLatitudeRef.SOUTH, r2);
    }

    public static TopicOperation unsubscribe(String r2) {
        return new TopicOperation("U", r2);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof TopicOperation) == true) goto L5;
        return false;
    L5:
        TopicOperation r42 = (TopicOperation) r4;
        if (this.topic.equals(r42.topic) == true) goto L8;
    L11:
        return false;
    L8:
        if (this.operation.equals(r42.operation) == false) goto L11;
        return true;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.operation, this.topic});
    }

    public String serialize() {
        return this.serializedString;
    }
}
