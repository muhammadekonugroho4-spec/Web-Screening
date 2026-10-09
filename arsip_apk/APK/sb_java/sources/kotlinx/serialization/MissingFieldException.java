package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B5\bB\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB\u001f\bV\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bB\u0019\bV\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\rB+\bW\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000eB\u0011\bQ\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0080\u0080\u0004¢\u0006\u0002\b\u0016R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "message", "", "cause", "", "missingFields", "", "serialName", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;Ljava/lang/String;)V", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "getMissingFields", "()Ljava/util/List;", "getSerialName", "()Ljava/lang/String;", "withNewMessageInternal", "newMessage", "withNewMessageInternal$kotlinx_serialization_core", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;
    private final String serialName;

    public MissingFieldException(String r1, Throwable r2, List r3, String r4) {
        super(r1, r2);
        this.missingFields = r3;
        this.serialName = r4;
    }

    public final MissingFieldException a(String r4) {
        kotlin.jvm.internal.p.l(r4, "newMessage");
        return new MissingFieldException(r4, this, this.missingFields, this.serialName);
    }

    public MissingFieldException(List r3, String r4) {
        kotlin.jvm.internal.p.l(r3, "missingFields");
        kotlin.jvm.internal.p.l(r4, "serialName");
        if (r3.size() != 1) goto L5;
        String r02 = "Field '" + ((String) r3.get(0)) + "' is required for type with serial name '" + r4 + "', but it was missing";
    L6:
        this(r02, null, r3, r4);
        return;
    L5:
        r02 = "Fields " + r3 + " are required for type with serial name '" + r4 + "', but they were missing";
        goto L6
    }
}
