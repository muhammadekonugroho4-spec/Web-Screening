package androidx.compose.ui.text;

import com.google.common.net.HttpHeaders;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/AnnotationType;", "", "<init>", "(Ljava/lang/String;I)V", "Paragraph", "Span", "VerbatimTts", "Url", HttpHeaders.LINK, "Clickable", "String", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
enum AnnotationType extends Enum<AnnotationType> {
    public static final AnnotationType Clickable = null;
    public static final AnnotationType Link = null;
    public static final AnnotationType Paragraph = null;
    public static final AnnotationType Span = null;
    public static final AnnotationType String = null;
    public static final AnnotationType Url = null;
    public static final AnnotationType VerbatimTts = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnnotationType[] f19616a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f19617b = null;

    static {
        Paragraph = new AnnotationType("Paragraph", 0);
        Span = new AnnotationType("Span", 1);
        VerbatimTts = new AnnotationType("VerbatimTts", 2);
        Url = new AnnotationType("Url", 3);
        Link = new AnnotationType(HttpHeaders.LINK, 4);
        Clickable = new AnnotationType("Clickable", 5);
        String = new AnnotationType("String", 6);
        AnnotationType[] r02 = a();
        f19616a = r02;
        f19617b = kotlin.enums.b.a(r02);
    }

    AnnotationType(String r1, int r2) {
    }

    public static final /* synthetic */ AnnotationType[] a() {
        return new AnnotationType[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    public static kotlin.enums.a getEntries() {
        return f19617b;
    }

    public static AnnotationType valueOf(String r1) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, r1);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) f19616a.clone();
    }
}
