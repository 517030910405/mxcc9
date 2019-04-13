import java.util.*;
public class node{
    public ArrayList<node> son;
    public String type = "";//expression   for
    public String name = "";//+ - * /      \


    public String expr_type = "";//l r lr
    public String data_type = "";//int string bool
    public int data_array_dim = 0;
    public boolean has_scope = false;
    public HashMap<String, varname> scope = new HashMap<String, varname>();
    public ArrayList<String> input_variable_type = new ArrayList<String>();
    public ArrayList<Integer> input_variable_array_dim = new ArrayList<Integer>();
    public String output_variable_type = "";//"int" from "int f(){}"
    public int output_variable_array_dim = 0;
    public boolean left_value = false;
    public node(){
        son= new ArrayList<node>();
    }
    public boolean add(node nn){
        return son.add(nn);
    }
}