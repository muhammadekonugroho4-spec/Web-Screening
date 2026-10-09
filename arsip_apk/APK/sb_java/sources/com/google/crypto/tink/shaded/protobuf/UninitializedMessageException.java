package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(MessageLite r1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    private static String buildDescription(List<String> r4) {
        StringBuilder r02 = new StringBuilder("Message missing required fields: ");
        Iterator<String> r42 = r4.iterator();
        boolean r1 = true;
    L4:
        if (r42.hasNext() == false) goto L11;
        String r2 = r42.next();
        if (r1 == false) goto L8;
        r1 = false;
    L9:
        r02.append(r2);
        goto L4
    L8:
        r02.append(", ");
        goto L9
    L11:
        return r02.toString();
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public UninitializedMessageException(List<String> r2) {
        super(buildDescription(r2));
        this.missingFields = r2;
    }
}
