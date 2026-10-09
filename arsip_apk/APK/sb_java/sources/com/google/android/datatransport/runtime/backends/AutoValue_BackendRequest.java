package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class AutoValue_BackendRequest extends BackendRequest {
    private final Iterable<EventInternal> events;
    private final byte[] extras;

    /* renamed from: com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends BackendRequest.Builder {
        private Iterable<EventInternal> events;
        private byte[] extras;

        public Builder() {
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest build() {
            String r1 = "";
            if (this.events != null) goto L6;
            r1 = " events";
        L6:
            if (r1.isEmpty() == false) goto L10;
            return new AutoValue_BackendRequest(this.events, this.extras, null);
        L10:
            throw new IllegalStateException("Missing required properties:" + r1);
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setEvents(Iterable<EventInternal> r2) {
            if (r2 == null) goto L6;
            this.events = r2;
            return this;
        L6:
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setExtras(byte[] r1) {
            this.extras = r1;
            return this;
        }
    }

    public /* synthetic */ AutoValue_BackendRequest(Iterable r1, byte[] r2, AnonymousClass1 r3) {
        this(r1, r2);
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof BackendRequest) == false) goto L16;
        BackendRequest r52 = (BackendRequest) r5;
        if (this.events.equals(r52.getEvents()) == false) goto L16;
        byte[] r1 = this.extras;
        if ((r52 instanceof AutoValue_BackendRequest) == false) goto L12;
        byte[] r53 = ((AutoValue_BackendRequest) r52).extras;
    L14:
        if (Arrays.equals(r1, r53) == false) goto L16;
        return true;
    L12:
        r53 = r52.getExtras();
    L16:
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public Iterable<EventInternal> getEvents() {
        return this.events;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public byte[] getExtras() {
        return this.extras;
    }

    public int hashCode() {
        return ((this.events.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras);
    }

    public String toString() {
        return "BackendRequest{events=" + this.events + ", extras=" + Arrays.toString(this.extras) + "}";
    }

    private AutoValue_BackendRequest(Iterable<EventInternal> r1, byte[] r2) {
        this.events = r1;
        this.extras = r2;
    }
}
