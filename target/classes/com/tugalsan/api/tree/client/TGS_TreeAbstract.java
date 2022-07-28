package com.tugalsan.api.tree.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.stream.*;

public class TGS_TreeAbstract<A, B> implements IsSerializable {

    public TGS_TreeAbstract() {//DTO
    }

    public TGS_TreeAbstract(A id) {
        this.id = id;
    }
    public A id;

    @Override
    public String toString() {
        return toString(0);
    }

    public String toString(int indent) {
        var sb = new StringBuilder();
        IntStream.range(0, indent).forEach(i -> sb.append(" "));
        sb.append(TGS_TreeAbstract.class.getSimpleName());
        sb.append(" -> id: ");
        sb.append(id);
        sb.append("\n");
        return sb.toString();
    }
}
