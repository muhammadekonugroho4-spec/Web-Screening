package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class i {

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public int f180545a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f180546b;

        public a(f r1) {
            this.f180546b = r1;
            this.f180545a = r1.e();
        }

        public f a() {
            f r02 = this.f180546b;
            int r1 = r02.e();
            int r2 = this.f180545a;
            this.f180545a = r2 - 1;
            return r02.d(r1 - r2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f180545a <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public int f180547a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f180548b;

        public b(f r1) {
            this.f180548b = r1;
            this.f180547a = r1.e();
        }

        public String a() {
            f r02 = this.f180548b;
            int r1 = r02.e();
            int r2 = this.f180547a;
            this.f180547a = r2 - 1;
            return r02.f(r1 - r2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f180547a <= 0) goto L6;
            return true;
        L6:
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f180549a;

        public c(f r1) {
            this.f180549a = r1;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f180549a);
        }
    }

    public static final class d implements Iterable, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f180550a;

        public d(f r1) {
            this.f180550a = r1;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f180550a);
        }
    }

    public static final Iterable a(f r1) {
        p.l(r1, "<this>");
        return new c(r1);
    }

    public static final Iterable b(f r1) {
        p.l(r1, "<this>");
        return new d(r1);
    }
}
