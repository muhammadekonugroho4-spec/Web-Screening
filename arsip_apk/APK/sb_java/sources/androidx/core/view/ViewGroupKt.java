package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ViewGroupKt {

    public static final class a implements kotlin.sequences.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f23137a;

        public a(ViewGroup r1) {
            this.f23137a = r1;
        }

        @Override // kotlin.sequences.i
        public Iterator iterator() {
            return ViewGroupKt.d(this.f23137a);
        }
    }

    public static final class b implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public int f23138a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f23139b;

        public b(ViewGroup r1) {
            this.f23139b = r1;
        }

        public View a() {
            ViewGroup r02 = this.f23139b;
            int r1 = this.f23138a;
            this.f23138a = r1 + 1;
            View r03 = r02.getChildAt(r1);
            if (r03 == null) goto L6;
            return r03;
        L6:
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f23138a >= this.f23139b.getChildCount()) goto L6;
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
            ViewGroup r02 = this.f23139b;
            int r1 = this.f23138a - 1;
            this.f23138a = r1;
            r02.removeViewAt(r1);
        }
    }

    public static final class c implements kotlin.sequences.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f23140a;

        public c(ViewGroup r1) {
            this.f23140a = r1;
        }

        @Override // kotlin.sequences.i
        public Iterator iterator() {
            return new C3861a0(ViewGroupKt.b(this.f23140a).iterator(), ViewGroupKt$descendants$1$1.f23141g);
        }
    }

    public static final View a(ViewGroup r3, int r4) {
        View r02 = r3.getChildAt(r4);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new IndexOutOfBoundsException("Index: " + r4 + ", Size: " + r3.getChildCount());
    }

    public static final kotlin.sequences.i b(ViewGroup r1) {
        return new a(r1);
    }

    public static final kotlin.sequences.i c(ViewGroup r1) {
        return new c(r1);
    }

    public static final Iterator d(ViewGroup r1) {
        return new b(r1);
    }
}
