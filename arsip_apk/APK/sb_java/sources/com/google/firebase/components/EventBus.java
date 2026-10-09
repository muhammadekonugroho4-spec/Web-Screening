package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
class EventBus implements Subscriber, Publisher {
    private final Executor defaultExecutor;
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> handlerMap;
    private Queue<Event<?>> pendingEvents;

    public EventBus(Executor r2) {
        this.handlerMap = new HashMap();
        this.pendingEvents = new ArrayDeque();
        this.defaultExecutor = r2;
    }

    public static /* synthetic */ void a(Map.Entry r02, Event r1) {
        ((EventHandler) r02.getKey()).handle(r1);
    }

    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> getHandlers(Event<?> r2) {
        monitor-enter(this);
        ConcurrentHashMap<EventHandler<Object>, Executor> r22 = this.handlerMap.get(r2.getType());     // Catch: Throwable -> L6
        if (r22 != null) goto L8;
        Set<Map.Entry<EventHandler<Object>, Executor>> r23 = Collections.EMPTY_SET;     // Catch: Throwable -> L6
    L9:
        monitor-exit(this);
        return r23;
    L8:
        r23 = r22.entrySet();     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    public void enablePublishingAndFlushPending() {
        monitor-enter(this);
        Queue<Event<?>> r02 = this.pendingEvents;     // Catch: Throwable -> L6
        if (r02 == null) goto L8;
        this.pendingEvents = null;     // Catch: Throwable -> L6
    L9:
        monitor-exit(this);     // Catch: Throwable -> L6
        if (r02 == null) goto L15;
        Iterator<Event<?>> r03 = r02.iterator();
    L13:
        if (r03.hasNext() == false) goto L21;
        publish(r03.next());
        goto L13
    L21:
        return;
    L15:
        return;
    L8:
        r02 = null;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(final Event<?> r5) {
        Preconditions.checkNotNull(r5);
        monitor-enter(this);
        Queue<Event<?>> r02 = this.pendingEvents;     // Catch: Throwable -> L9
        if (r02 == null) goto L11;
        r02.add(r5);     // Catch: Throwable -> L9
        monitor-exit(this);     // Catch: Throwable -> L9
        return;
    L11:
        monitor-exit(this);     // Catch: Throwable -> L9
        Iterator<Map.Entry<EventHandler<Object>, Executor>> r03 = getHandlers(r5).iterator();
    L14:
        if (r03.hasNext() == false) goto L16;
        final Map.Entry<EventHandler<Object>, Executor> r1 = r03.next();
        r1.getValue().execute(new n(r1, r5));
        goto L14
    L16:
        return;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> r3, Executor r4, EventHandler<? super T> r5) {
        monitor-enter(this);
        Preconditions.checkNotNull(r3);     // Catch: Throwable -> L6
        Preconditions.checkNotNull(r5);     // Catch: Throwable -> L6
        Preconditions.checkNotNull(r4);     // Catch: Throwable -> L6
        if (this.handlerMap.containsKey(r3) == true) goto L8;
        this.handlerMap.put(r3, new ConcurrentHashMap());     // Catch: Throwable -> L6
    L8:
        this.handlerMap.get(r3).put(r5, r4);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> r2, EventHandler<? super T> r3) {
        monitor-enter(this);
        Preconditions.checkNotNull(r2);     // Catch: Throwable -> L11
        Preconditions.checkNotNull(r3);     // Catch: Throwable -> L11
        if (this.handlerMap.containsKey(r2) == true) goto L7;
        monitor-exit(this);
        return;
    L7:
        ConcurrentHashMap<EventHandler<Object>, Executor> r02 = this.handlerMap.get(r2);     // Catch: Throwable -> L11
        r02.remove(r3);     // Catch: Throwable -> L11
        if (r02.isEmpty() == false) goto L13;
        this.handlerMap.remove(r2);     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> r2, EventHandler<? super T> r3) {
        subscribe(r2, this.defaultExecutor, r3);
    }
}
