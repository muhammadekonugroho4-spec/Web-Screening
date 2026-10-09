package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.e;

/* loaded from: classes3.dex */
public class c {

    public static final class a extends c {
        public a() {
        }

        @Override // retrofit2.c
        public List a(Executor r4) {
            return Arrays.asList(new e.a[]{new g(), new i(r4)});
        }

        @Override // retrofit2.c
        public List b() {
            return Collections.singletonList(new p());
        }
    }

    public c() {
    }

    public List a(Executor r2) {
        return Collections.singletonList(new i(r2));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }
}
