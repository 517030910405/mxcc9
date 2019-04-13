import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;
public class pro1 {
    public static node root1;
    public static ArrayList <node> scope_info = new ArrayList <node>();
    //return with too many arguments CE
    //assign is not atom
    public static void dfs(node now,int i)throws Exception{
        System.out.print('(');
        System.out.print(i);
        System.out.print(',');
        System.out.print(now.type);
        System.out.print(',');
        System.out.print(now.name);
        if (!now.data_type.equals("")) {
            System.out.print("[" + now.data_type + "]");
        }
        System.out.print(',');
        for (node item:now.son){
            dfs(item,i+1);
        }
        if (now.type.equals("return")){
            if (now.son.size()>1){
                System.out.println();
                System.out.println("CE");
                System.out.println();
                throw new Exception("CE_return");
            }
        }
        if (now.type.equals("self_function")){
            //if (now.son.size()!=0){
            //Not Defined
            //}
        }
        if (now.type.equals("variable")){
            if (!now.son.get(1).type.equals("atom")){
                throw new Exception("Variable Declaim CE");
            }
        }
        if (now.type.equals("input_variable")){
            if (!now.son.get(1).type.equals("atom")){
                throw new Exception("Variable Declaim CE");
            }
        }
        System.out.print(now.type);
        System.out.print(',');
        System.out.print(now.name);
        System.out.print(')');
    }
    //global function & class name
    public static void dfs1(node now,int i) throws Exception{
        if (now.type.equals("class")){
            varname newname = new varname();
            newname.type = "class";
            newname.name = now.name;
            newname.location = now;
            if (root1.scope.containsKey(now.name)){
                throw new Exception("Class Name");
            }
            root1.scope.put(now.name,newname);
            //System.out.println(now.name);
        }
        if (now.type.equals("function")){
            varname newname = new varname();
            newname.type = "function";
            newname.name = now.name;
            newname.location = now;
            if (root1.scope.containsKey(now.name)){
                throw new Exception("Function Name");
            }
            root1.scope.put(now.name,newname);
        }
        //System.out.println(now.type);
        if (i<=0){
            for (node item:now.son){
                dfs1(item,i+1);
            }
        }
    }
    //sub function name
    public static void dfs2(node now,int i) throws Exception{
        if (now.type.equals("class")){
            for (node item:now.son){
                if (item.type.equals("function")){
                    varname newname = new varname();
                    newname.type = "function";
                    newname.name = item.name;
                    newname.location = item;
                    //System.out.println(item.name);
                    if (now.scope.containsKey(newname.name)){
                        throw new Exception("CE_Name_Function");
                    }
                    now.scope.put(newname.name,newname);
                }

                if (item.type.equals("self_function")){
                    //Nothing to do
                    if (!item.name.equals(now.name)){
                        throw new Exception("self_function_name2");
                    }
                }
            }
        }
        //System.out.println(now.type);
        if (i<=0){
            for (node item:now.son){
                dfs2(item,i+1);
            }
        }
    }
    //input of function
    public static void dfs3(node now,int i) throws Exception{
        if (now.type.equals("class")){
            //System.out.println(now.name);
        }
        if (now.type.equals("function")){
            {
                node nowson = now.son.get(0);
                int arrdim = 0;
                while (nowson.name.equals("array")){
                    arrdim = arrdim+1;
                    nowson = nowson.son.get(0);
                }
                now.output_variable_type = nowson.name;
                now.output_variable_array_dim = arrdim;
                if (!root1.scope.containsKey(nowson.name)){
                    throw new Exception(nowson.name+": Type Not Defined");
                }
                varname thistype = root1.scope.get(nowson.name);
                if (!thistype.type.equals("class")){
                    throw new Exception(nowson.name+"Is Not A Type");
                }
            }
            for (int j=1;j<now.son.size()-1;j=j+1){
                int arrdim = 0;
                node nowson = now.son.get(j).son.get(0);
                while (nowson.name.equals("array")){
                    arrdim = arrdim+1;
                    nowson = nowson.son.get(0);
                }
                now.input_variable_type.add(nowson.name);
                now.input_variable_array_dim.add(arrdim);
                if (!root1.scope.containsKey(nowson.name)){
                    throw new Exception(nowson.name+": Type Not Defined");
                }
                varname thistype = root1.scope.get(nowson.name);
                if (!thistype.type.equals("class")){
                    throw new Exception(nowson.name+"Is Not A Type");
                }
                //System.out.println(nowson.name);
            }
        }
        //System.out.println(now.type);
        if ((i<=0)||(now.type.equals("class"))){
            for (node item:now.son){
                dfs3(item,i+1);
            }
        }
    }
    //all scope
    public static void dfs4(node now,int i) throws Exception{
        if (now.has_scope){
            scope_info.add(now);
        }
        if (now.type.equals("variable")||now.type.equals("input_variable")){
            if (now.son.get(1).data_type.equals("int")||now.son.get(1).data_type.equals("string")){
                throw new Exception("Variable is not const");
            }
            varname newname = new varname();
            newname.name = now.son.get(1).name;
            if (newname.name.equals("this")){
                throw new  Exception("invalid variable name 5");
            }
            node nowtype = now.son.get(0);
            int arrdim=0;
            while (nowtype.name.equals("array")){
                arrdim = arrdim +1;
                nowtype = nowtype.son.get(0);
            }
            newname.array_dim = arrdim;
            newname.type = nowtype.name;
            newname.location = now;
            if (!root1.scope.containsKey(newname.type)){
                System.out.println();
                System.out.println(newname.type);
                throw new Exception("Invalid Type");
            }
            if (!root1.scope.get(newname.type).type.equals("class")){
                throw new Exception("Invalid Type");
            }
            if (scope_info.get(scope_info.size()-1).scope.containsKey(newname.name)){
                throw new Exception("Variable Name Invalid");
            }
            {
                System.out.print("");
                /*System.out.print(newname.name);
                System.out.print(" ");
                System.out.print(newname.type);
                System.out.print(" ");
                System.out.print(newname.array_dim);
                System.out.println();*/
            }
            if (scope_info.get(0).scope.containsKey(newname.name)&&
                    (scope_info.get(0).scope.get(newname.name).type.equals("class")
                            ||scope_info.get(0).scope.get(newname.name).type.equals("function"))){
                //throw new Exception("Variable Name Invalid 2");
            }
            if (scope_info.size()>=2&&scope_info.get(1).scope.containsKey(newname.name)&&
                    (scope_info.get(1).scope.get(newname.name).type.equals("function"))){
                //throw new Exception("Variable Name Invalid 3");
            }
            scope_info.get(scope_info.size()-1).scope.put(newname.name,newname);
        }
        for (node item:now.son){
            dfs4(item,i+1);
        }
        if (now.has_scope) {
            scope_info.remove(scope_info.size() - 1);
        }
    }
    //expression's type
    public static void dfs5(node now,int i) throws Exception{
        //head
        if (now.has_scope){
            scope_info.add(now);
        }
        System.out.print(now.type);
        System.out.print(" ");
        System.out.print(now.name);
        System.out.print(" ");
        System.out.println(scope_info.size());
        if (now.type.equals("variable")|| now.type.equals("input_variable")){
            //scope_info.get(scope_info.size()-1).scope.get(now.son.get(1).name).activate =true;
            //Nothing to do
        }

        //middle

        if (now.type.equals("variable")|| now.type.equals("input_variable")) {
            for (int j = 0;j < now.son.size(); ++j){
                if (j!=1){
                    dfs5(now.son.get(j),i+1);
                }
            }
        } else
        if (now.type.equals("expression")&&now.name.equals("function")&&now.son.get(0).type.equals("atom")){
            for (int j = 1;j < now.son.size(); ++j){
                if (j!=0){
                    dfs5(now.son.get(j),i+1);
                }
            }
        } else
        if (now.type.equals("expression")&&now.name.equals("sub")){
            if (!now.son.get(1).type.equals("atom")){
                throw new Exception("Sub is too Complicated");
            }
            dfs5(now.son.get(0),i+1);
        } else{
            for (node item:now.son){
                dfs5(item,i+1);
            }
        }
        //tail
        if (now.type.equals("atom")){
            if (now.name.equals("this")){
                if (scope_info.size()>=3&&scope_info.get(1).type.equals("class")
                        &&(scope_info.get(2).type.equals("function")||
                        scope_info.get(2).type.equals("self_function"))){
                    now.data_type = scope_info.get(1).name;
                    now.data_array_dim = 0;
                }
            }
            if (now.data_type.equals("")){
                int j=scope_info.size()-1;
                System.out.println(now.name);
                while (j>=0&&((!scope_info.get(j).scope.containsKey(now.name))
                        ||(!scope_info.get(j).scope.get(now.name).activate))){
                    j=j-1;
                }
                if (j==-1){
                    throw new Exception("Variable Not Defined");
                }
                now.data_type = scope_info.get(j).scope.get(now.name).type;
                now.data_array_dim = scope_info.get(j).scope.get(now.name).array_dim;
                now.left_value = true;
            }
        }
        if (now.type.equals("expression")){
            if (now.name.equals("+")&&now.expr_type.equals("lr")){
                if (now.son.get(0).data_type.equals("int")&&now.son.get(1).data_type.equals("int")
                        &&now.son.get(0).data_array_dim==0&&now.son.get(1).data_array_dim==0){
                    now.data_type = "int";
                    now.data_array_dim = 0;
                    now.left_value = false;
                }else if (now.son.get(0).data_type.equals("string")&&now.son.get(1).data_type.equals("string")
                        &&now.son.get(0).data_array_dim==0&&now.son.get(1).data_array_dim==0){
                    now.data_type = "string";
                    now.data_array_dim = 0;
                    now.left_value = false;
                }else {
                    System.out.println("["+now.son.get(0).data_type+"]");
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("-")&&now.expr_type.equals("lr")) {
                if (now.son.get(0).data_type.equals("int")&&now.son.get(0).data_array_dim == 0
                        && now.son.get(1).data_type.equals("int")&&now.son.get(1).data_array_dim == 0){
                    now.data_type = "int";
                    now.data_array_dim = 0;
                    now.left_value = false;
                } else{
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("+")&&now.expr_type.equals("r")) {
                if (now.son.get(0).data_type.equals("int")&&now.son.get(0).data_array_dim == 0){
                    now.data_array_dim = 0;
                    now.data_type = "int";
                    now.left_value = false;
                } else{
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("-")&&now.expr_type.equals("r")) {
                if (now.son.get(0).data_type.equals("int")&&now.son.get(0).data_array_dim == 0){
                    now.data_array_dim = 0;
                    now.data_type = "int";
                    now.left_value = false;
                } else{
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("*")||now.name.equals("/")||now.name.equals("%")||
                    now.name.equals("&")||now.name.equals("|")||now.name.equals("^")
                    ||now.name.equals("<<")||now.name.equals(">>")){
                if (now.son.get(0).data_type.equals("int")&&now.son.get(0).data_array_dim == 0
                        && now.son.get(1).data_type.equals("int")&&now.son.get(1).data_array_dim == 0){
                    now.data_type = "int";
                    now.data_array_dim = 0;
                    now.left_value = false;
                } else{
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("~")){
                if (now.son.get(0).data_type.equals("int")&&now.son.get(0).data_array_dim == 0){
                    now.data_type = "int";
                    now.data_array_dim = 0;
                    now.left_value = false;
                } else{
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("&&")||now.name.equals("||")){
                if (now.son.get(0).data_type.equals("bool")&&now.son.get(0).data_array_dim == 0
                        && now.son.get(1).data_type.equals("bool")&&now.son.get(1).data_array_dim == 0){
                    now.data_type = "bool";
                    now.data_array_dim = 0;
                    now.left_value = false;
                } else{
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("!")){
                if (now.son.get(0).data_type.equals("bool")&&now.son.get(0).data_array_dim == 0){
                    now.data_type = "bool";
                    now.data_array_dim = 0;
                    now.left_value = false;
                } else{
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("<")||now.name.equals(">")||now.name.equals("<=")||now.name.equals(">=")){
                if (now.son.get(0).data_type.equals("int")&&now.son.get(1).data_type.equals("int")
                        &&now.son.get(0).data_array_dim==0&&now.son.get(1).data_array_dim==0){
                    now.data_type = "bool";
                    now.data_array_dim = 0;
                    now.left_value = false;
                }else if (now.son.get(0).data_type.equals("string")&&now.son.get(1).data_type.equals("string")
                        &&now.son.get(0).data_array_dim==0&&now.son.get(1).data_array_dim==0){
                    now.data_type = "bool";
                    now.data_array_dim = 0;
                    now.left_value = false;
                }else {
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("==")||now.name.equals("!=")){
                if (now.son.get(0).data_type.equals(now.son.get(1).data_type)
                        &&now.son.get(0).data_array_dim==now.son.get(1).data_array_dim){
                    now.data_type = "bool";
                    now.data_array_dim = 0;
                    now.left_value = false;
                }else if (now.son.get(1).data_type.equals("null")&&now.son.get(1).data_array_dim==0
                        &&(!((now.son.get(0).data_type.equals("int")||now.son.get(0).data_type.equals("string"))
                        &&now.son.get(0).data_array_dim==0))){
                    now.data_type = "bool";
                    now.data_array_dim = 0;
                    now.left_value = false;
                }else if (now.son.get(0).data_type.equals("null")&&now.son.get(0).data_array_dim==0
                        &&(!((now.son.get(1).data_type.equals("int")||now.son.get(1).data_type.equals("string"))
                        &&now.son.get(1).data_array_dim==0))){
                    now.data_type = "bool";
                    now.data_array_dim = 0;
                    now.left_value = false;
                }else {
                    throw new Exception("Expression Type Error: operator = "+now.name);
                }
            } else
            if (now.name.equals("++")||now.name.equals("--")) {
                if (now.son.get(0).left_value){
                    if (now.son.get(0).data_type.equals("int")&&now.son.get(0).data_array_dim==0){
                        now.data_type = "int";
                        now.data_array_dim = 0;
                        now.left_value = (now.expr_type.equals("r"));
                    }else {
                        throw new Exception("Expression Type Error: operator = "+now.name);
                    }
                }else{
                    throw new Exception("++/-- Not a Variable! ");
                }
            } else
            if (now.name.equals("sub")){
                String typea =now.son.get(0).data_type;
                int dima = now.son.get(0).data_array_dim;
                String nameb = now.son.get(1).name;
                varname namespace = root1.scope.get(typea);
                if (!namespace.type.equals("class")){
                    throw new Exception("Not a class");
                }
                if (dima!=0){
                    if (!nameb.equals("size")) {
                        throw new Exception("sub Error");
                    }
                } else {
                    if (typea.equals("string")&&nameb.equals("length")){
                        now.data_type = "function";
                        now.left_value = now.son.get(0).left_value;
                        now.data_array_dim = 0;
                    } else
                    if (typea.equals("string")&&nameb.equals("ord")){
                        now.data_type = "function";
                        now.left_value = now.son.get(0).left_value;
                        now.data_array_dim = 0;
                    } else
                    if (typea.equals("string")&&nameb.equals("substring")){
                        now.data_type = "function";
                        now.left_value = now.son.get(0).left_value;
                        now.data_array_dim = 0;
                    } else
                    if (typea.equals("string")&&nameb.equals("parseInt")){
                        now.data_type = "function";
                        now.left_value = now.son.get(0).left_value;
                        now.data_array_dim = 0;
                    } else {
                        if (namespace.location==null){
                            throw new Exception(nameb + " is not a sub of " + typea);
                        }
                        if (!namespace.location.scope.containsKey(nameb)) {
                            throw new Exception(nameb + " is not a sub of " + typea);
                        }
                        now.data_type = namespace.location.scope.get(nameb).type;
                        now.data_array_dim = namespace.location.scope.get(nameb).array_dim;
                        now.left_value = now.son.get(0).left_value;
                    }
                }
            } else
            if (now.name.equals("=")){
                if (!now.son.get(0).left_value) {
                    throw new Exception("= is not available1");
                }
                if (!((now.son.get(0).data_type.equals("int")||now.son.get(0).data_type.equals("string"))&&
                        now.son.get(0).data_array_dim == 0)&&now.son.get(1).data_type.equals("null")) {

                } else{
                    if (!(now.son.get(0).data_type.equals(now.son.get(1).data_type)
                            && now.son.get(0).data_array_dim == now.son.get(1).data_array_dim)) {
                        System.out.println("["+now.son.get(0).data_type+"] ["+now.son.get(1).data_type+"]");
                        throw new Exception("= is not available2");
                    }
                }
                now.data_array_dim = 0;
                now.data_type = "void";
                now.left_value = false;
            } else
            if (now.name.equals("array")){
                if (now.son.size()!=2){
                    throw new Exception("Array Missing");
                }
                if (now.son.get(0).data_array_dim>0&&now.son.get(1).data_type.equals("int")
                        &&now.son.get(1).data_array_dim==0){
                    now.data_type = now.son.get(0).data_type;
                    now.data_array_dim = now.son.get(0).data_array_dim -1;
                    now.left_value = now.son.get(0).left_value;
                } else {
                    throw new Exception("Array Error");
                }
            } else
            if (now.name.equals("function")){
                if (now.son.get(0).name.equals("sub")){
                    if (now.son.get(0).son.get(0).data_array_dim>0&&
                            now.son.get(0).son.get(1).name.equals("size")){
                        if (now.son.size()!=1){
                            throw new Exception("array.size() Error");
                        }
                        now.data_type = "int";
                        now.data_array_dim = 0;
                        now.left_value = false;
                    } else
                    if (now.son.get(0).son.get(0).data_array_dim==0 &&now.son.get(0).son.get(0).data_type.equals("string")
                            &&now.son.get(0).son.get(1).name.equals("length")){
                        //if (!(now.son.get(0).son.get(0).data_array_dim==0&&now.son.get(0).son.get(0).data_type.equals("string"))){
                        //    throw new Exception("length Error");
                        //}
                        if (now.son.size()!=1){
                            throw new Exception("string.length() Error");
                        }
                        now.data_type = "int";
                        now.data_array_dim = 0;
                        now.left_value = false;
                    } else
                    if (now.son.get(0).son.get(0).data_array_dim==0 &&now.son.get(0).son.get(0).data_type.equals("string")
                            &&now.son.get(0).son.get(1).name.equals("substring")){
                        //if (!(now.son.get(0).son.get(0).data_array_dim==0&&now.son.get(0).son.get(0).data_type.equals("string"))){
                        //    throw new Exception("substring Error");
                        //}
                        if (!(now.son.get(1).data_array_dim==0&&now.son.get(1).data_type.equals("int"))){
                            throw new Exception("substring Error");
                        }
                        if (!(now.son.get(2).data_array_dim==0&&now.son.get(2).data_type.equals("int"))){
                            throw new Exception("substring Error");
                        }
                        if (now.son.size()!=3){
                            throw new Exception("string.substring() Error");
                        }
                        now.data_type = "string";
                        now.data_array_dim = 0;
                        now.left_value = false;
                    } else
                    if (now.son.get(0).son.get(0).data_array_dim==0 &&now.son.get(0).son.get(0).data_type.equals("string")
                            &&now.son.get(0).son.get(1).name.equals("parseInt")){
                        //if (!(now.son.get(0).data_array_dim==0&&now.son.get(0).data_type.equals("string"))){
                        //    throw new Exception("parseInt Error");
                        //}
                        if (now.son.size()!=1){
                            throw new Exception("string.parseInt() Error");
                        }
                        now.data_type = "int";
                        now.data_array_dim = 0;
                        now.left_value = false;
                    } else
                    if (now.son.get(0).son.get(0).data_array_dim==0 &&now.son.get(0).son.get(0).data_type.equals("string")
                            &&now.son.get(0).son.get(1).name.equals("ord")){
                        //if (!(now.son.get(0).data_array_dim==0&&now.son.get(0).data_type.equals("string"))){
                        //    throw new Exception("ord Error");
                        //}
                        if (!(now.son.get(1).data_array_dim==0&&now.son.get(1).data_type.equals("int"))){
                            throw new Exception("ord Error");
                        }
                        if (now.son.size()!=2){
                            throw new Exception("string.ord() Error");
                        }
                        now.data_type = "int";
                        now.data_array_dim = 0;
                        now.left_value = false;
                    } else {
                        node upperclass = now.son.get(0).son.get(0);
                        node lowerclass = now.son.get(0).son.get(1);
                        if (upperclass.data_array_dim != 0) {
                            throw new Exception("function Error");
                        }
                        if (!now.son.get(0).data_type.equals("function")) {
                            throw new Exception("function Error");
                        }
                        node func_space = root1.scope.get(upperclass.data_type).location.
                                scope.get(lowerclass.name).location;
                        if (func_space.input_variable_type.size() + 1 != now.son.size()) {
                            throw new Exception("function Error1");
                        }
                        for (int j = 0; j < func_space.input_variable_type.size(); ++j) {
                            if (!(func_space.input_variable_type.get(j).equals(now.son.get(j + 1).data_type) &&
                                    func_space.input_variable_array_dim.get(j) == now.son.get(j + 1).data_array_dim)) {
                                throw new Exception("function Error2");
                            }
                        }
                        now.data_type = func_space.output_variable_type;
                        now.data_array_dim = func_space.output_variable_array_dim;
                        now.left_value = false;
                    }
                }else if (now.son.get(0).type.equals("atom")){
                    node lowerclass = now.son.get(0);
                    int j=scope_info.size()-1;
                    /*if (scope_info.size()>1&&scope_info.get(1).scope.containsKey(lowerclass.name)){
                        j=1;
                    } else if (scope_info.get(0).scope.containsKey(lowerclass.name)){
                        j=0;
                    } else{
                        throw new Exception("function Error3");
                    }*/
                    while (!scope_info.get(j).scope.containsKey(lowerclass.name)){
                        j=j-1;
                    }
                    //Automatic throw if no function
                    if (j==0&&now.son.get(0).name.equals("print")){
                        if (now.son.size()!=2){
                            throw new Exception("print Error");
                        }
                        if (!(now.son.get(1).data_type.equals("string")&&now.son.get(1).data_array_dim==0)){
                            throw new Exception("print Error");
                        }
                        now.data_type = "void";
                        now.data_array_dim = 0;
                    } else
                    if (j==0&&now.son.get(0).name.equals("println")){
                        if (now.son.size()!=2){
                            throw new Exception("println Error");
                        }
                        if (!(now.son.get(1).data_type.equals("string")&&now.son.get(1).data_array_dim==0)){
                            throw new Exception("println Error");
                        }
                        now.data_type = "void";
                        now.data_array_dim = 0;
                    } else
                    if (j==0&&now.son.get(0).name.equals("getString")){
                        if (now.son.size()!=1){
                            throw new Exception("getString Error");
                        }
                        now.data_array_dim = 0;
                        now.data_type = "string";
                    } else
                    if (j==0&&now.son.get(0).name.equals("getInt")){
                        if (now.son.size()!=1){
                            throw new Exception("getInt Error");
                        }
                        now.data_array_dim = 0;
                        now.data_type = "int";
                    } else
                    if (j==0&&now.son.get(0).name.equals("toString")){
                        if (now.son.size()!=2){
                            throw new Exception("toString Error");
                        }
                        if (!(now.son.get(1).data_type.equals("int")&&now.son.get(1).data_array_dim==0)){
                            throw new Exception("toString Error");
                        }
                        now.data_array_dim = 0;
                        now.data_type = "string";
                    } else{
                        node func_namespace = scope_info.get(j).scope.get(lowerclass.name).location;
                        if (!func_namespace.type.equals("function")) {
                            throw new Exception("function Error4");
                        }
                        if (func_namespace.input_variable_type.size() + 1 != now.son.size()) {
                            throw new Exception("function Error5");
                        }
                        for (int k = 0; k < func_namespace.input_variable_type.size(); ++k) {
                            if (!(func_namespace.input_variable_type.get(k).equals(now.son.get(k + 1).data_type) &&
                                    func_namespace.input_variable_array_dim.get(k) == now.son.get(k + 1).data_array_dim)) {
                                throw new Exception("function Error5");
                            }
                        }
                        now.data_type = func_namespace.output_variable_type;
                        now.data_array_dim = func_namespace.output_variable_array_dim;
                        now.left_value = false;
                    }
                    //
                }
            } else
            if (now.name.equals("new")){
                node typea = now.son.get(0);
                int arr_dim = 0;
                boolean sign = false;
                while (typea.son.size()!=0){
                    if (sign){
                        if (typea.son.size()==1){
                            throw new Exception("new Error1");
                        }
                        if (!typea.son.get(1).data_type.equals("int")){
                            throw new Exception("new Error2");
                        }
                        arr_dim = arr_dim+1;
                        typea = typea.son.get(0);
                    }else{
                        if (typea.son.size()==2){
                            sign = true;
                            if (!typea.son.get(1).data_type.equals("int")){
                                throw new Exception("new Error3");
                            }
                        }
                        arr_dim = arr_dim+1;
                        typea = typea.son.get(0);
                    }
                }
                if (!(root1.scope.containsKey(typea.name)&&root1.scope.get(typea.name).type.equals("class"))){
                    throw new Exception("new Error4");
                }
                if (typea.name.equals("void")) {
                    throw new Exception("new void Error");
                }
                if ((!sign)&&arr_dim>0){
                    throw new Exception("Warning: no use \"new\"");
                }
                now.data_type = typea.name;
                //System.out.println("["+now.data_type+"]");
                now.data_array_dim = arr_dim;
                now.left_value = false;
            }
            else{
                throw new Exception("CE! I dont know");
            }

            //To be done
        }
        if (now.type.equals("variable")||now.type.equals("input_variable")){
            if (scope_info.get(scope_info.size()-1).scope.get(now.son.get(1).name).type.equals("void")){
                throw new Exception("void variable Error");
            }
            if (now.son.size()==3){
                varname typea = scope_info.get(scope_info.size()-1).scope.get(now.son.get(1).name);
                if ((!((typea.type.equals("int")||typea.type.equals("string"))&&typea.array_dim==0))
                        &&now.son.get(2).data_type.equals("null")){
                } else
                if (!(typea.type.equals(now.son.get(2).data_type)
                        &&typea.array_dim == now.son.get(2).data_array_dim)){
                    throw new Exception("variable Error");
                }
            }
        }
        if (now.type.equals("for")){
            if (now.son.get(1).type.equals("none")){
                //Nothing
            } else{
                if (now.son.get(1).data_type.equals("bool")&&now.son.get(1).data_array_dim==0){
                    //Nothing
                } else{
                    throw new Exception("not bool in for");
                }
            }
        }
        if (now.type.equals("while")){
            if (now.son.get(0).data_type.equals("bool")&&now.son.get(1).data_array_dim==0){
                System.out.println("not bool");
                //Nothing
            } else{
                throw new Exception("not bool in while");
            }
        }
        if (now.type.equals("if")){
            if (now.son.get(0).data_type.equals("bool")&&now.son.get(1).data_array_dim==0){
                //Nothing
            } else{
                throw new Exception("not bool in if");
            }
        }
        //return check
        if (now.type.equals("return")) {
            int j;
            if (scope_info.get(1).type.equals("class")) {
                j=2;
            }else if (scope_info.get(1).type.equals("function")){
                j=1;
            } else{
                throw new Exception("CE: return1");
            }
            if (scope_info.get(j).type.equals("self_function")){
                if (now.son.size()==0){

                } else{
                    throw new Exception("CE: return 4");
                }
            } else
            if (scope_info.get(j).output_variable_type.equals("void")&&
                    scope_info.get(j).output_variable_array_dim==0&&now.son.size()==0){

            } else
            if (scope_info.get(j).output_variable_type.equals(now.son.get(0).data_type)){
                if (now.son.get(0).data_type.equals("void")){
                    throw new Exception("CE: return void");
                }


                if (scope_info.get(j).output_variable_array_dim==now.son.get(0).data_array_dim){

                }
                else{
                    throw new Exception("CE: return2");
                }
            } else if (now.son.get(0).data_type.equals("null")){
                if (scope_info.get(j).output_variable_type.equals("int")&&scope_info.get(j).output_variable_array_dim==0){
                    throw new Exception("CE: return5");
                }
                if (scope_info.get(j).output_variable_type.equals("string")&&scope_info.get(j).output_variable_array_dim==0){
                    throw new Exception("CE: return5");
                }

            }else {
                System.out.println("ERROR");
                System.out.println(scope_info.get(j).output_variable_type);
                System.out.println(now.son.get(0).data_type);
                throw new Exception("CE: return3");
            }
        }
        if (now.type.equals("continue")||now.type.equals("break")){
            int j = scope_info.size()-1;
            while (!(scope_info.get(j).type.equals("for")||scope_info.get(j).type.equals("while"))){
                System.err.println(scope_info.get(j).type);
                j = j-1;
            }
            //Automatic CE if no for or while
        }
        if (now.type.equals("variable")|| now.type.equals("input_variable")){
            scope_info.get(scope_info.size()-1).scope.get(now.son.get(1).name).activate = true;
        }
        if (now.has_scope) {
            scope_info.remove(scope_info.size() - 1);
        }
    }
    public static void view1(node now,int i)throws Exception{
        for (int j=0;j<i;++j){
            System.out.print("    ");
        }
        System.out.print(now.type + " " + now.name);
        if (now.type.equals("function")){
            System.out.print(" "+now.output_variable_type+" ");
            System.out.print(now.output_variable_array_dim);
            for (int j=0;j<now.input_variable_type.size();++j){
                System.out.print(" "+now.input_variable_type.get(j)+" ");
                System.out.print(now.input_variable_array_dim.get(j));
            }
        }
        System.out.println();
        for (HashMap.Entry<String,varname> item:now.scope.entrySet()){
            if (item.getValue().location!=null){
                view1(item.getValue().location,i+1);
            }
        }
    }
    public static void view2(node now,int i) throws Exception{
        if (now.has_scope){
            System.out.print(now.name);
            System.out.print("-");
            System.out.println(now.type);
        }
        for (node item:now.son){
            view2(item,i+1);
        }
    }
    public static void view3(node now,int i)throws Exception{
        for (int j=0;j<i;++j){
            System.out.print("    ");
        }
        System.out.print(now.type + " " + now.name);
        if (now.type.equals("function")){
            System.out.print(" "+now.output_variable_type+" ");
            System.out.print(now.output_variable_array_dim);
            for (int j=0;j<now.input_variable_type.size();++j){
                System.out.print(" "+now.input_variable_type.get(j)+" ");
                System.out.print(now.input_variable_array_dim.get(j));
            }
        }
        System.out.println();
        if (now.has_scope){
            for (int j=0;j<i;++j){
                System.out.print("    ");
            }
            System.out.print(" ");
            for (varname item:now.scope.values()){
                System.out.print("(");
                System.out.print(item.type);
                System.out.print(" ");
                System.out.print(item.name);
                System.out.print(" ");
                System.out.print(item.array_dim);
                System.out.print(")");
            }
            System.out.println();
        }
        for (HashMap.Entry<String,varname> item:now.scope.entrySet()){
            if (item.getValue().location!=null){
                view3(item.getValue().location,i+1);
            }
        }
    }
    public static void view4(node now,int i)throws Exception{
        if (now.has_scope){
            for (int j=0;j<i;++j){
                System.out.print("    ");
            }
            System.out.print(now.type + " " + now.name);
            if (now.type.equals("function")){
                System.out.print(" "+now.output_variable_type+" ");
                System.out.print(now.output_variable_array_dim);
                for (int j=0;j<now.input_variable_type.size();++j){
                    System.out.print(" "+now.input_variable_type.get(j)+" ");
                    System.out.print(now.input_variable_array_dim.get(j));
                }
            }
            System.out.println();
            for (int j=0;j<i;++j){
                System.out.print("    ");
            }
            System.out.print(" ");
            for (varname item:now.scope.values()){
                System.out.print("(");
                System.out.print(item.type);
                System.out.print(" ");
                System.out.print(item.name);
                System.out.print(" ");
                System.out.print(item.array_dim);
                System.out.print(")");
            }
            System.out.println();
        }
        for (node item:now.son){
            if (now.has_scope) {
                view4(item, i + 1);
            } else{
                view4(item,i);
            }
        }
    }

    public static void main(String[] args) throws IOException , Exception {
        try{
            //InputStream is = new FileInputStream("example/5.txt"); // or System.in;
            InputStream is = new FileInputStream("program.txt"); // or System.in;
            //InputStream is = System.in; // or System.in;
            ANTLRInputStream input = new ANTLRInputStream(is);
            MxLexer lexer = new MxLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MxParser parser = new MxParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());
            ParseTree tree = parser.mx(); // calc is the starting rule

            System.out.println("LISP:");
            System.out.println(tree.toStringTree(parser));
            System.out.println();

            System.out.println("Visitor:");
            EvalVisitor evalByVisitor = new EvalVisitor();
            root1 = evalByVisitor.visit(tree);
            //System.out.println();
            dfs(root1, 0);
            System.out.println();
            System.out.println("----");
            //--------------------------------
            {
                {
                    varname newname = new varname();
                    newname.type = "class";
                    newname.name = "int";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "class";
                    newname.name = "bool";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "class";
                    newname.name = "void";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "class";
                    newname.name = "string";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "function";
                    newname.name = "print";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "function";
                    newname.name = "println";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "function";
                    newname.name = "getString";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "function";
                    newname.name = "getInt";
                    root1.scope.put(newname.name, newname);
                }
                {
                    varname newname = new varname();
                    newname.type = "function";
                    newname.name = "toString";
                    root1.scope.put(newname.name, newname);
                }
            }
            System.out.println("dfs1");
            dfs1(root1, 0);
            System.out.println("dfs2");
            dfs2(root1, 0);
            //System.out.println();
            System.out.println("dfs3");
            dfs3(root1, 0);
            System.out.println("view1");
            view1(root1, 0);
            System.out.println("view2");
            view2(root1, 0);
            System.out.println("dfs4");
            dfs4(root1, 0);
            System.out.println("view3");
            view3(root1, 0);
            System.out.println("view4");
            view4(root1, 0);
            System.out.println("dfs5");
            dfs5(root1, 0);
            if(root1.son.size()==0){
                throw new Exception("Empty");
            }
            if(!root1.scope.containsKey("main")){
                throw new Exception("No Main");
            }
            if (!root1.scope.get("main").type.equals("function")){
                throw new Exception("No Main");
            }
            if (!(root1.scope.get("main").location.output_variable_array_dim==0
                    &&root1.scope.get("main").location.output_variable_type.equals("int"))){
                throw new Exception("main not good");
            }
        }catch(Throwable eee)
        {
            //throw new Exception("Well");
            //System.err.println("CE");
            //throw eee;
            System.exit(-1);
        }
        System.out.println("OK");
    }
}
    /*public static void dfs4(node now,int i){
        if (now.has_scope){
            scope_info.add(now);
            for (node item:scope_info){
                System.out.print(item.name);
                System.out.print(" ");
            }
        }
        if (now.has_scope){
            scope_info.remove(scope_info.size()-1);
        }
    }*/
