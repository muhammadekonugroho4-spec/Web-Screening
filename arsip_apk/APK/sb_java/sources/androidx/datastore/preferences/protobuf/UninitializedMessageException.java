package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(H r1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
