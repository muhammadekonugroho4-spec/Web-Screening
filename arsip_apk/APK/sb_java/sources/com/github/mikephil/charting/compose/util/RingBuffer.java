package com.github.mikephil.charting.compose.util;

import com.gojek.ojosdk.exif.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/github/mikephil/charting/compose/util/RingBuffer;", ExifInterface.GpsTrackRef.TRUE_DIRECTION, "", "", "capacity", "<init>", "(I)V", "element", "Lkotlin/w;", "append", "(Ljava/lang/Object;)V", "", "elements", "appendAll", "(Ljava/util/List;)V", "replaceAll", "clear", "()V", "toList", "()Ljava/util/List;", "I", "getCapacity", "()I", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "head", "getSize", "size", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RingBuffer<T> {
    public static final int $stable = 8;
    private final int capacity;
    private final ArrayList<T> data;
    private int head;

    static {
    }

    public RingBuffer(int r1) {
        this.capacity = r1;
        this.data = new ArrayList();
    }

    public final void append(T r3) {
        if (this.capacity != Integer.MAX_VALUE) goto L5;
    L9:
        this.data.add(r3);
        return;
    L5:
        if (this.data.size() < this.capacity) goto L9;
        this.data.set(this.head, r3);
        this.head = (this.head + 1) % this.capacity;
    }

    public final void appendAll(List<? extends T> r2) {
        p.l(r2, "elements");
        Iterator<? extends T> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        append(r22.next());
        goto L4
    }

    public final void clear() {
        this.data.clear();
        this.head = 0;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final int getSize() {
        return this.data.size();
    }

    public final void replaceAll(List<? extends T> r2) {
        p.l(r2, "elements");
        clear();
        appendAll(r2);
    }

    public final List<T> toList() {
        int r02 = this.data.size();
        int r1 = this.capacity;
        if (r02 < r1) goto L12;
        if (r1 == Integer.MAX_VALUE) goto L12;
        ArrayList r03 = new ArrayList(this.data.size());
        int r12 = this.data.size();
        int r2 = 0;
    L8:
        if (r2 >= r12) goto L10;
        ArrayList<T> r3 = this.data;
        r03.add(r3.get((this.head + r2) % r3.size()));
        r2 = r2 + 1;
        goto L8
    L10:
        return r03;
    L12:
        return new ArrayList(this.data);
    }
}
