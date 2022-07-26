package com.tugalsan.api.tree.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.tugalsan.api.list.client.*;
import java.util.*;
import java.util.stream.*;

public class TGS_TreeBranch<A, B> extends TGS_TreeAbstract<A> implements IsSerializable {

    public TGS_TreeBranch() {//DTO
    }

    public TGS_TreeBranch(A id) {
        this(id, TGS_ListUtils.of());
    }

    public TGS_TreeBranch(A id, List<TGS_TreeAbstract> childeren) {
        super(id);
        this.childeren = TGS_ListUtils.of();
    }
    public List<TGS_TreeAbstract<A>> childeren;

    public static <A, B> TGS_TreeBranch<A, B> of(A id) {
        return new TGS_TreeBranch(id);
    }

    public static <A, B> TGS_TreeBranch<A, B> of(A id, List<TGS_TreeAbstract> childeren) {
        return new TGS_TreeBranch(id, childeren);
    }

    public TGS_TreeBranch<A, B> add(TGS_TreeAbstract<A> child) {
        childeren.add(child);
        return this;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append(TGS_TreeBranch.class.getSimpleName());
        sb.append("{").append("\n");
        sb.append("id=").append(id).append("\n");
        IntStream.range(0, childeren.size()).forEach(i -> {
            sb.append(", child[").append(i).append("]=");
            var obj = childeren.get(i);
            if (obj instanceof TGS_TreeLeaf leaf) {
                sb.append(leaf);
            } else if (obj instanceof TGS_TreeBranch branch) {
                sb.append(branch);
            } else {
                sb.append(obj);
            }
            sb.append("\n");
        });
        sb.append('}');
        return sb.toString();
    }
}
