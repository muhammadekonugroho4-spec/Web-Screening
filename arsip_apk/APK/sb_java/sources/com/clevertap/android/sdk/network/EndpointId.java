package com.clevertap.android.sdk.network;

import com.clevertap.android.sdk.events.EventGroup;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import kotlin.text.B;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/network/EndpointId;", "", "", "identifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "Companion", "a", "ENDPOINT_SPIKY", "ENDPOINT_A1", "ENDPOINT_HELLO", "ENDPOINT_DEFINE_VARS", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum EndpointId extends Enum<EndpointId> {
    public static final a Companion = null;
    public static final EndpointId ENDPOINT_A1 = null;
    public static final EndpointId ENDPOINT_DEFINE_VARS = null;
    public static final EndpointId ENDPOINT_HELLO = null;
    public static final EndpointId ENDPOINT_SPIKY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EndpointId[] f34639a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34640b = null;
    private final String identifier;

    public static final class a {

        /* renamed from: com.clevertap.android.sdk.network.EndpointId$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0356a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34641a = null;

            static {
                int[] r02 = new int[EventGroup.values().length];
                r02[EventGroup.PUSH_NOTIFICATION_VIEWED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
            L11:
                r02[EventGroup.REGULAR.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
            L15:
                r02[EventGroup.VARIABLES.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
            L6:
                f34641a = r02;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final EndpointId a(EventGroup r2) {
            p.l(r2, "eventGroup");
            int r22 = C0356a.f34641a[r2.ordinal()];
            if (r22 == 1) goto L15;
            if (r22 == 2) goto L13;
            if (r22 != 3) goto L11;
            return EndpointId.ENDPOINT_DEFINE_VARS;
        L11:
            throw new NoWhenBranchMatchedException();
        L13:
            return EndpointId.ENDPOINT_A1;
        L15:
            return EndpointId.ENDPOINT_SPIKY;
        }

        public final EndpointId b(String r9) {
            p.l(r9, "identifier");
            EndpointId[] r02 = EndpointId.values();
            int r1 = r02.length;
            int r3 = 0;
        L3:
            EndpointId r4 = null;
            if (r3 >= r1) goto L9;
            EndpointId r5 = r02[r3];
            if (B.g0(r9, r5.getIdentifier(), false, 2, null) == true) goto L7;
            r3 = r3 + 1;
            goto L3
        L7:
            r4 = r5;
        L9:
            if (r4 == null) goto L11;
            return r4;
        L11:
            return EndpointId.ENDPOINT_A1;
        }

        public a() {
        }
    }

    static {
        ENDPOINT_SPIKY = new EndpointId("ENDPOINT_SPIKY", 0, "-spiky");
        ENDPOINT_A1 = new EndpointId("ENDPOINT_A1", 1, "/a1");
        ENDPOINT_HELLO = new EndpointId("ENDPOINT_HELLO", 2, "/hello");
        ENDPOINT_DEFINE_VARS = new EndpointId("ENDPOINT_DEFINE_VARS", 3, "/defineVars");
        EndpointId[] r02 = a();
        f34639a = r02;
        f34640b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    EndpointId(String r1, int r2, String r3) {
        this.identifier = r3;
    }

    public static final /* synthetic */ EndpointId[] a() {
        return new EndpointId[]{ENDPOINT_SPIKY, ENDPOINT_A1, ENDPOINT_HELLO, ENDPOINT_DEFINE_VARS};
    }

    public static final EndpointId fromEventGroup(EventGroup r1) {
        return Companion.a(r1);
    }

    public static final EndpointId fromString(String r1) {
        return Companion.b(r1);
    }

    public static kotlin.enums.a getEntries() {
        return f34640b;
    }

    public static EndpointId valueOf(String r1) {
        return (EndpointId) Enum.valueOf(EndpointId.class, r1);
    }

    public static EndpointId[] values() {
        return (EndpointId[]) f34639a.clone();
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}
