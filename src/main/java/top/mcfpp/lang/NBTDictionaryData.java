package top.mcfpp.lang;

import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import top.mcfpp.model.function.MNIMethodContainer;
import top.mcfpp.util.ValueWrapper;

import java.util.HashMap;

public class NBTDictionaryData extends MNIMethodContainer {
    static HashMap<String, Function4<Var<?>[], Var<?>[], CanSelectMember, ValueWrapper<Var<?>>, java.lang.Void>> methods;

    static {
        methods = new HashMap<>();
        methods.put("containsKey", (vars, vars2, canSelectMember, varValueWrapper) -> {
            return null;
        });

        methods.put("merge", (vars, vars2, canSelectMember, varValueWrapper) -> {
            return null;
        });

        methods.put("remove", (vars, vars2, canSelectMember, varValueWrapper) -> {
            return null;
        });
    }

    @NotNull
    @Override
    public Function4<Var<?>[], Var<?>[], CanSelectMember, ValueWrapper<Var<?>>, java.lang.Void> getMNIMethod(@NotNull String name) {
        return methods.get(name);
    }
}
