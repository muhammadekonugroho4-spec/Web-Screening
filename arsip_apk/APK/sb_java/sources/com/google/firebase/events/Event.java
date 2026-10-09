package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* loaded from: classes6.dex */
public class Event<T> {
    private final T payload;
    private final Class<T> type;

    public Event(Class<T> r1, T r2) {
        this.type = (Class) Preconditions.checkNotNull(r1);
        this.payload = (T) Preconditions.checkNotNull(r2);
    }

    public T getPayload() {
        return this.payload;
    }

    public Class<T> getType() {
        return this.type;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.type, this.payload});
    }
}
