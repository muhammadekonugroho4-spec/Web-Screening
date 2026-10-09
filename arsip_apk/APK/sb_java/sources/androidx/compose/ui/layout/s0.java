package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public interface s0 {

    public static final class a implements Collection, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.collection.Q f18406a;

        static {
        }

        public a(androidx.collection.Q r1) {
            this.f18406a = r1;
        }

        public final boolean a(Object r2) {
            return this.f18406a.g(r2);
        }

        @Override // java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object r1) {
            return a(r1);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection r2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final androidx.collection.Q b() {
            return this.f18406a;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f18406a.k();
        }

        @Override // java.util.Collection
        public boolean contains(Object r2) {
            return this.f18406a.a(r2);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection r3) {
            Iterator r32 = r3.iterator();
        L4:
            if (r32.hasNext() == false) goto L9;
            Object r02 = r32.next();
            if (this.f18406a.a(r02) == true) goto L4;
            return false;
        L9:
            return true;
        }

        public int getSize() {
            return this.f18406a.c();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f18406a.d();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f18406a.j().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object r2) {
            return this.f18406a.x(r2);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection r2) {
            return this.f18406a.x(r2);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate r2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection r2) {
            return this.f18406a.B(r2);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.h.a(this);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] r1) {
            return kotlin.jvm.internal.h.b(this, r1);
        }

        public /* synthetic */ a(androidx.collection.Q r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = androidx.collection.Z.a();
        L5:
            this(r1);
        }
    }

    void a(a r1);

    boolean b(Object r1, Object r2);
}
