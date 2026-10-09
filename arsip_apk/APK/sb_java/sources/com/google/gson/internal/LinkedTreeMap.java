package com.google.gson.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes6.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = null;
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.EntrySet entrySet;
    final Node<K, V> header;
    private LinkedTreeMap<K, V>.KeySet keySet;
    int modCount;
    Node<K, V> root;
    int size;

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        final /* synthetic */ LinkedTreeMap this$0;

        public EntrySet(LinkedTreeMap r1) {
            this.this$0 = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object r2) {
            if ((r2 instanceof Map.Entry) == true) goto L5;
            return false;
        L5:
            if (this.this$0.findByEntry((Map.Entry) r2) == null) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new AnonymousClass1(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object r3) {
            if ((r3 instanceof Map.Entry) == true) goto L5;
            return false;
        L5:
            Node<K, V> r32 = this.this$0.findByEntry((Map.Entry) r3);
            if (r32 != null) goto L8;
            return false;
        L8:
            this.this$0.removeInternal(r32, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size;
        }
    }

    public final class KeySet extends AbstractSet<K> {
        final /* synthetic */ LinkedTreeMap this$0;

        public KeySet(LinkedTreeMap r1) {
            this.this$0 = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object r2) {
            return this.this$0.containsKey(r2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new AnonymousClass1(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object r2) {
            if (this.this$0.removeInternalByKey(r2) == null) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        int expectedModCount;
        Node<K, V> lastReturned;
        Node<K, V> next;
        final /* synthetic */ LinkedTreeMap this$0;

        public LinkedTreeMapIterator(LinkedTreeMap r2) {
            this.this$0 = r2;
            this.next = r2.header.next;
            this.lastReturned = null;
            this.expectedModCount = r2.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.next == this.this$0.header) goto L6;
            return true;
        L6:
            return false;
        }

        public final Node<K, V> nextNode() {
            Node<K, V> r02 = this.next;
            LinkedTreeMap r1 = this.this$0;
            if (r02 == r1.header) goto L11;
            if (r1.modCount != this.expectedModCount) goto L9;
            this.next = r02.next;
            this.lastReturned = r02;
            return r02;
        L9:
            throw new ConcurrentModificationException();
        L11:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> r02 = this.lastReturned;
            if (r02 == null) goto L7;
            this.this$0.removeInternal(r02, true);
            this.lastReturned = null;
            this.expectedModCount = this.this$0.modCount;
            return;
        L7:
            throw new IllegalStateException();
        }
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {
        final boolean allowNullValue;
        int height;
        final K key;
        Node<K, V> left;
        Node<K, V> next;
        Node<K, V> parent;
        Node<K, V> prev;
        Node<K, V> right;
        V value;

        public Node(boolean r2) {
            this.key = null;
            this.allowNullValue = r2;
            this.prev = this;
            this.next = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object r4) {
            if ((r4 instanceof Map.Entry) == false) goto L20;
            Map.Entry r42 = (Map.Entry) r4;
            K r02 = this.key;
            if (r02 != null) goto L10;
            if (r42.getKey() != null) goto L20;
        L11:
            V r03 = this.value;
            if (r03 != null) goto L17;
            if (r42.getValue() != null) goto L20;
            return true;
        L17:
            if (r03.equals(r42.getValue()) == false) goto L20;
            return true;
        L10:
            if (r02.equals(r42.getKey()) == true) goto L11;
        L20:
            return false;
        }

        public Node<K, V> first() {
            Node<K, V> r02 = this.left;
            Node<K, V> r1 = this;
        L3:
            if (r02 == null) goto L5;
            r1 = r02;
            r02 = r02.left;
            goto L3
        L5:
            return r1;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K r02 = this.key;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            V r2 = this.value;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r03 ^ r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public Node<K, V> last() {
            Node<K, V> r02 = this.right;
            Node<K, V> r1 = this;
        L3:
            if (r02 == null) goto L5;
            r1 = r02;
            r02 = r02.right;
            goto L3
        L5:
            return r1;
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
            if (r2 == null) goto L4;
        L8:
            V r02 = this.value;
            this.value = r2;
            return r02;
        L4:
            if (this.allowNullValue == true) goto L8;
            throw new NullPointerException("value == null");
        }

        public String toString() {
            return this.key + ContainerUtils.KEY_VALUE_DELIMITER + this.value;
        }

        public Node(boolean r1, Node<K, V> r2, K r3, Node<K, V> r4, Node<K, V> r5) {
            this.parent = r2;
            this.key = r3;
            this.allowNullValue = r1;
            this.height = 1;
            this.next = r4;
            this.prev = r5;
            r5.next = this;
            r4.prev = this;
        }
    }

    static {
        NATURAL_ORDER = new AnonymousClass1();
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER, true);
    }

    private boolean equal(Object r1, Object r2) {
        return Objects.equals(r1, r2);
    }

    private void readObject(ObjectInputStream r2) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(Node<K, V> r8, boolean r9) {
    L2:
        if (r8 == null) goto L52;
        Node<K, V> r02 = r8.left;
        Node<K, V> r1 = r8.right;
        int r2 = 0;
        if (r02 == null) goto L6;
        int r3 = r02.height;
    L7:
        if (r1 == null) goto L9;
        int r4 = r1.height;
    L10:
        int r5 = r3 - r4;
        if (r5 != (-2)) goto L28;
        Node<K, V> r03 = r1.left;
        Node<K, V> r32 = r1.right;
        if (r32 == null) goto L15;
        int r33 = r32.height;
    L16:
        if (r03 == null) goto L18;
        r2 = r03.height;
    L18:
        int r22 = r2 - r33;
        if (r22 == (-1)) goto L24;
        if (r22 != 0) goto L23;
        if (r9 == false) goto L24;
    L23:
        rotateRight(r1);
        rotateLeft(r8);
    L25:
        if (r9 == false) goto L51;
        return;
    L51:
        r8 = r8.parent;
    L24:
        rotateLeft(r8);
        goto L25
    L15:
        r33 = 0;
        goto L16
    L28:
        if (r5 != 2) goto L44;
        Node<K, V> r12 = r02.left;
        Node<K, V> r34 = r02.right;
        if (r34 == null) goto L32;
        int r35 = r34.height;
    L33:
        if (r12 == null) goto L35;
        r2 = r12.height;
    L35:
        int r23 = r2 - r35;
        if (r23 == 1) goto L41;
        if (r23 != 0) goto L40;
        if (r9 == false) goto L41;
    L40:
        rotateLeft(r02);
        rotateRight(r8);
    L42:
        if (r9 == false) goto L51;
        return;
    L41:
        rotateRight(r8);
        goto L42
    L32:
        r35 = 0;
        goto L33
    L44:
        if (r5 != 0) goto L48;
        r8.height = r3 + 1;
        if (r9 == false) goto L51;
        return;
    L48:
        r8.height = Math.max(r3, r4) + 1;
        if (r9 == true) goto L51;
        return;
    L9:
        r4 = 0;
        goto L10
    L6:
        r3 = 0;
        goto L7
    }

    private void replaceInParent(Node<K, V> r3, Node<K, V> r4) {
        Node<K, V> r02 = r3.parent;
        r3.parent = null;
        if (r4 == null) goto L5;
        r4.parent = r02;
    L5:
        if (r02 != null) goto L7;
        this.root = r4;
        return;
    L7:
        if (r02.left != r3) goto L10;
        r02.left = r4;
        return;
    L10:
        r02.right = r4;
    }

    private void rotateLeft(Node<K, V> r6) {
        Node<K, V> r02 = r6.left;
        Node<K, V> r1 = r6.right;
        Node<K, V> r2 = r1.left;
        Node<K, V> r3 = r1.right;
        r6.right = r2;
        if (r2 == null) goto L5;
        r2.parent = r6;
    L5:
        replaceInParent(r6, r1);
        r1.left = r6;
        r6.parent = r1;
        int r4 = 0;
        if (r02 == null) goto L8;
        int r03 = r02.height;
    L9:
        if (r2 == null) goto L11;
        int r22 = r2.height;
    L12:
        int r04 = Math.max(r03, r22) + 1;
        r6.height = r04;
        if (r3 == null) goto L15;
        r4 = r3.height;
    L15:
        r1.height = Math.max(r04, r4) + 1;
        return;
    L11:
        r22 = 0;
        goto L12
    L8:
        r03 = 0;
        goto L9
    }

    private void rotateRight(Node<K, V> r6) {
        Node<K, V> r02 = r6.left;
        Node<K, V> r1 = r6.right;
        Node<K, V> r2 = r02.left;
        Node<K, V> r3 = r02.right;
        r6.left = r3;
        if (r3 == null) goto L5;
        r3.parent = r6;
    L5:
        replaceInParent(r6, r02);
        r02.right = r6;
        r6.parent = r02;
        int r4 = 0;
        if (r1 == null) goto L8;
        int r12 = r1.height;
    L9:
        if (r3 == null) goto L11;
        int r32 = r3.height;
    L12:
        int r13 = Math.max(r12, r32) + 1;
        r6.height = r13;
        if (r2 == null) goto L15;
        r4 = r2.height;
    L15:
        r02.height = Math.max(r13, r4) + 1;
        return;
    L11:
        r32 = 0;
        goto L12
    L8:
        r12 = 0;
        goto L9
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        Node<K, V> r02 = this.header;
        r02.prev = r02;
        r02.next = r02;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object r1) {
        if (findByObject(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.EntrySet r02 = this.entrySet;
        if (r02 == null) goto L5;
        return r02;
    L5:
        LinkedTreeMap<K, V>.EntrySet r03 = new EntrySet(this);
        this.entrySet = r03;
        return r03;
    }

    public Node<K, V> find(K r12, boolean r13) {
        Comparator<? super K> r02 = this.comparator;
        Node<K, V> r1 = this.root;
        if (r1 != null) goto L5;
        int r4 = 0;
    L17:
        Node<K, V> r7 = r1;
        if (r13 == true) goto L22;
        return null;
    L22:
        Node<K, V> r9 = this.header;
        if (r7 == null) goto L25;
        Node<K, V> r5 = new Node(this.allowNullValues, r7, r12, r9, r9.prev);
        if (r4 >= 0) goto L35;
        r7.left = r5;
    L36:
        rebalance(r7, true);
    L37:
        this.size++;
        this.modCount++;
        return r5;
    L35:
        r7.right = r5;
        goto L36
    L25:
        if (r02 == NATURAL_ORDER) goto L27;
    L31:
        r5 = new Node(this.allowNullValues, r7, r12, r9, r9.prev);
        this.root = r5;
        goto L37
    L27:
        if ((r12 instanceof Comparable) == true) goto L31;
        throw new ClassCastException(r12.getClass().getName() + " is not Comparable");
    L5:
        if (r02 != NATURAL_ORDER) goto L7;
        Comparable r3 = (Comparable) r12;
    L8:
        if (r3 == null) goto L10;
        r4 = r3.compareTo(r1.key);
    L11:
        if (r4 == 0) goto L12;
        if (r4 >= 0) goto L15;
        Node<K, V> r52 = r1.left;
    L16:
        if (r52 == null) goto L17;
        r1 = r52;
        goto L8
    L15:
        r52 = r1.right;
        goto L16
    L12:
        return r1;
    L10:
        r4 = r02.compare(r12, r1.key);
        goto L11
    L7:
        r3 = null;
        goto L8
    }

    public Node<K, V> findByEntry(Map.Entry<?, ?> r3) {
        Node<K, V> r02 = findByObject(r3.getKey());
        if (r02 != null) goto L5;
        return null;
    L5:
        if (equal(r02.value, r3.getValue()) == false) goto L9;
        return r02;
    L9:
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Node<K, V> findByObject(Object r3) {
        if (r3 != 0) goto L9;
    L7:
        return null;
    L9:
        return find(r3, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object r1) {
        Node<K, V> r12 = findByObject(r1);
        if (r12 != null) goto L5;
        return null;
    L5:
        return r12.value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.KeySet r02 = this.keySet;
        if (r02 == null) goto L5;
        return r02;
    L5:
        LinkedTreeMap<K, V>.KeySet r03 = new KeySet(this);
        this.keySet = r03;
        return r03;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r2, V r3) {
        if (r2 == null) goto L12;
        if (r3 == null) goto L5;
    L9:
        Node<K, V> r22 = find(r2, true);
        V r02 = r22.value;
        r22.value = r3;
        return r02;
    L5:
        if (this.allowNullValues == true) goto L9;
        throw new NullPointerException("value == null");
    L12:
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object r1) {
        Node<K, V> r12 = removeInternalByKey(r1);
        if (r12 != null) goto L5;
        return null;
    L5:
        return r12.value;
    }

    public void removeInternal(Node<K, V> r6, boolean r7) {
        if (r7 == false) goto L4;
        Node<K, V> r72 = r6.prev;
        r72.next = r6.next;
        r6.next.prev = r72;
    L4:
        Node<K, V> r73 = r6.left;
        Node<K, V> r02 = r6.right;
        Node<K, V> r1 = r6.parent;
        int r2 = 0;
        if (r73 == null) goto L20;
        if (r02 == null) goto L20;
        if (r73.height <= r02.height) goto L10;
        Node<K, V> r74 = r73.last();
    L11:
        removeInternal(r74, false);
        Node<K, V> r03 = r6.left;
        if (r03 == null) goto L14;
        int r12 = r03.height;
        r74.left = r03;
        r03.parent = r74;
        r6.left = null;
    L15:
        Node<K, V> r04 = r6.right;
        if (r04 == null) goto L18;
        r2 = r04.height;
        r74.right = r04;
        r04.parent = r74;
        r6.right = null;
    L18:
        r74.height = Math.max(r12, r2) + 1;
        replaceInParent(r6, r74);
        return;
    L14:
        r12 = 0;
        goto L15
    L10:
        r74 = r02.first();
    L20:
        if (r73 == null) goto L22;
        replaceInParent(r6, r73);
        r6.left = null;
    L25:
        rebalance(r1, false);
        this.size--;
        this.modCount++;
        return;
    L22:
        if (r02 == null) goto L24;
        replaceInParent(r6, r02);
        r6.right = null;
        goto L25
    L24:
        replaceInParent(r6, null);
        goto L25
    }

    public Node<K, V> removeInternalByKey(Object r2) {
        Node<K, V> r22 = findByObject(r2);
        if (r22 == null) goto L5;
        removeInternal(r22, true);
    L5:
        return r22;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean r2) {
        this(NATURAL_ORDER, r2);
    }

    public LinkedTreeMap(Comparator<? super K> r2, boolean r3) {
        this.size = 0;
        this.modCount = 0;
        if (r2 != null) goto L6;
        r2 = NATURAL_ORDER;
    L6:
        this.comparator = r2;
        this.allowNullValues = r3;
        this.header = new Node(r3);
    }
}
