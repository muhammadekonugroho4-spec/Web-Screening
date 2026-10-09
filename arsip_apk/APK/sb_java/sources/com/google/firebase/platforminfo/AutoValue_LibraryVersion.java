package com.google.firebase.platforminfo;

/* loaded from: classes6.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {
    private final String libraryName;
    private final String version;

    public AutoValue_LibraryVersion(String r1, String r2) {
        if (r1 == null) goto L11;
        this.libraryName = r1;
        if (r2 == null) goto L9;
        this.version = r2;
        return;
    L9:
        throw new NullPointerException("Null version");
    L11:
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof LibraryVersion) == false) goto L12;
        LibraryVersion r52 = (LibraryVersion) r5;
        if (this.libraryName.equals(r52.getLibraryName()) == false) goto L12;
        if (this.version.equals(r52.getVersion()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((this.libraryName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.libraryName + ", version=" + this.version + "}";
    }
}
