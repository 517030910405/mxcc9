// Generated from D:/compiler/untitled10/src\Mx.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.*;


public class EvalVisitor extends MxBaseVisitor<node> {
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitMx(MxParser.MxContext ctx) {
        List<MxParser.OutfitContext> list0 = ctx.outfit();
        node ans = new node();
        //ans.son = new ArrayList<node>();
        int n =list0.size();
        for (MxParser.OutfitContext item : list0) {
            node newnode = visit(item);
            //newnode.name; no change
            ans.son .add(newnode);
        }
        ans.type = "MxLang" ;
        ans.name = "";
        ans.has_scope = true;
        return ans;
    }
    @Override public node visitExprthis(MxParser.ExprthisContext ctx){
        node ans = new node();
        ans.name = "this";
        ans.type = "atom";
        ans.left_value = true;
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitFunction(MxParser.FunctionContext ctx) {
        node ans = visit(ctx.func());
        ans.type = "function";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitClass_assign(MxParser.Class_assignContext ctx) {
        node ans = visit(ctx.class_());
        ans.type = "class";
        ans.has_scope = true;
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_assign(MxParser.Type_assignContext ctx) {
        node ans = visit(ctx.type_and_var());
        ans.type = "variable";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitClass_(MxParser.Class_Context ctx) {
        node ans = new node();
        MxParser.Var_Context son1 = ctx.var_();
        ans.name = son1.getText();
        ans.type = "class";

        List <MxParser.Type_and_varContext> list0 = ctx.type_and_var();
        List <MxParser.FuncContext> list1 = ctx.func();
        List <MxParser.Self_funcContext> list2 = ctx.self_func();
        //List<MxParser.Type_and_varContext>
        for (MxParser.Type_and_varContext item : list0){
            node newnode = visit(item);
            newnode.type = "variable";
            ans.son.add(newnode);
        }
        for (MxParser.FuncContext item : list1){
            node newnode = visit(item);
            newnode.type = "function";
            ans.son.add(newnode);
        }
        for (MxParser.Self_funcContext item : list2){
            node newnode = visit(item);
            newnode.type = "self_function";
            ans.son.add(newnode);
        }
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitFunc(MxParser.FuncContext ctx) {
        node ans = new node();
        ans.type = "function";
        ans.name = ctx.var_().getText();

        node type_info =  visit(ctx.type_());
        type_info.type = "type";

        ans.son.add(type_info);

        List <MxParser.Type_and_varContext> list0 = ctx.type_and_var();
        for (MxParser.Type_and_varContext item:list0){
            node newnode = visit(item);
            newnode.type = "input_variable";
            //newnode.name = "";
            ans.son.add(newnode);
        }
        node node1 = visit(ctx.stat());
        node1.type = "statements";
        node1.name = "";
        node1.has_scope = false;
        ans.has_scope = true;
        ans.son.add(node1);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitSelf_func(MxParser.Self_funcContext ctx) {
        node ans = new node();
        ans.name = ctx.var_().getText();
        ans.type = "self_function";

        List <MxParser.Type_and_varContext> list0 = ctx.type_and_var();
        for (MxParser.Type_and_varContext item:list0){
            node newnode = visit(item);
            newnode.type = "input_variable";
            ans.son.add(newnode);
        }
        node node1 = visit(ctx.stat());
        node1.type = "statements";
        node1.name = "";
        ans.has_scope = true;
        node1.has_scope = false;
        ans.son.add(node1);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitStat(MxParser.StatContext ctx) {
        node ans = new node();
        ans.type = "statements";
        ans.name = "";
        ans.has_scope = true;
        List<MxParser.SingstatContext> list0 = ctx.singstat();
        for (MxParser.SingstatContext item: list0){
            node newnode = visit(item);
            ans.add(newnode);
        }

        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitSing_stmt(MxParser.Sing_stmtContext ctx) {
        node ans = visit(ctx.expr());
        //ans.type = "";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitAssign_stmt(MxParser.Assign_stmtContext ctx) {
        node ans = visit(ctx.type_and_var());
        ans.type = "variable";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitReturn_stmt(MxParser.Return_stmtContext ctx){
        node ans = new node();
        ans.type = "return";
        List <MxParser.ExprContext> list0 = ctx.expr();
        if (list0.size()>1){
            //throw new Exception("CE_return");
        }
        for (MxParser.ExprContext item: list0){
            node newnode = visit(item);
            ans.son.add(newnode);
        }
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitBreak_stmt(MxParser.Break_stmtContext ctx) {
        node ans = new node();
        ans.type = "break";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitContinue_stmt(MxParser.Continue_stmtContext ctx) {
        node ans = new node();
        ans.type = "continue";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitFor_stmt(MxParser.For_stmtContext ctx) {
        node ans = new node();
        ans.type = "for";

        List <MxParser.For_expr_in_cirContext> list0 = ctx.for_expr_in_cir();
        for (MxParser.For_expr_in_cirContext item:list0){
            node newnode = visit(item);
            ans.son.add(newnode);
        }
        node node1 = visit(ctx.singstat());
        node1.has_scope = false;
        ans.has_scope = true;
        //node1.type = "statements";
        ans.son.add(node1);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitWhile_stmt(MxParser.While_stmtContext ctx) {
        node ans = new node();
        ans.type = "while";
        node node1 = visit(ctx.expr());
        node node2 = visit(ctx.singstat());
        node2.has_scope = false;
        ans.has_scope = true;
        ans.son.add(node1);
        ans.son.add(node2);
        return ans;
    }
    @Override public node visitEmpty_stmt(MxParser.Empty_stmtContext ctx){
        node ans = new node();
        ans.type = "none";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitStmtmix(MxParser.StmtmixContext ctx) {
        node ans = visit(ctx.stat());
        ans.type = "statements";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitIf_stmt(MxParser.If_stmtContext ctx) {
        node ans = new node();
        ans.type = "if";
        List<MxParser.SingstatContext> list0 = ctx.singstat();
        node node1 = visit(ctx.expr());
        ans.son.add(node1);
        for (MxParser.SingstatContext item:list0){
            node node2 = visit(item);
            ans.son.add(node2);
        }
        ans.has_scope = true;
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitAssign_in_for(MxParser.Assign_in_forContext ctx) {
        node ans = visit(ctx.type_and_var());
        //ans.type = "variable";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitExpr_in_for(MxParser.Expr_in_forContext ctx) {
        node ans = visit(ctx.expr());
        //ans.type = "expression";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitNone_in_for(MxParser.None_in_forContext ctx) {
        node ans = new node();
        ans.type = "none";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_and_var(MxParser.Type_and_varContext ctx) {
        node ans = new node();
        ans.type = "variable";
        node node1 = visit(ctx.type_());
        node1.type = "type";
        node node2 = visit(ctx.expr());
        //node2.type = "expr";
        ans.son.add(node1);
        if (node2.name.equals("=")){
            ans.son.add(node2.son.get(0));
            ans.son.add(node2.son.get(1));
        } else {
            ans.son.add(node2);
        }
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_string(MxParser.Type_stringContext ctx) {
        node ans = new node();
        ans.type = "type";
        ans.name = ctx.getText();
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_bool(MxParser.Type_boolContext ctx) {
        node ans = new node();
        ans.type = "type";
        ans.name = ctx.getText();
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_array(MxParser.Type_arrayContext ctx) {
        node ans = new node();
        ans.type = "type";
        ans.name = "array";
        node node1 = visit(ctx.type_());
        ans.son.add(node1);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_var(MxParser.Type_varContext ctx) {
        node ans = new node();
        ans.type = "type";
        ans.name = ctx.getText();
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_array_withnum(MxParser.Type_array_withnumContext ctx) {
        node ans = new node();
        ans.type = "type";
        ans.name = "array";
        node node1 = visit(ctx.type_());
        ans.son.add(node1);
        node node2 = visit(ctx.expr());
        ans.son.add(node2);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_void(MxParser.Type_voidContext ctx) {
        node ans = new node();
        ans.type = "type";
        ans.name = "void";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitType_int(MxParser.Type_intContext ctx) {
        node ans = new node();
        ans.type = "type";
        ans.name = ctx.getText();
        return ans;
    }
    @Override public node visitExprfunc(MxParser.ExprfuncContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = "function";
        List <MxParser.ExprContext> list0 = ctx.expr();
        for (MxParser.ExprContext item : list0) {
            node newnode = visit(item);
            ans.son.add(newnode);
        }
        return ans;
    }
    @Override public node visitOpr(MxParser.OprContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = ctx.op_in_expr.getText();
        ans.expr_type = "r";
        node node1 = visit(ctx.expr());
        ans.son.add(node1);
        return ans;
    }
    @Override public node visitOpl(MxParser.OplContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = ctx.op_in_expr.getText();
        ans.expr_type = "l";
        node node1 = visit(ctx.expr());
        ans.son.add(node1);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitExprnew(MxParser.ExprnewContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = "new";
        node node1 = visit(ctx.type_());
        ans.son.add(node1);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitExprsub(MxParser.ExprsubContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = "sub";
        node node1 = visit(ctx.expr(0));
        node node2 = visit(ctx.expr(1));
        ans.son.add(node1);
        ans.son.add(node2);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitOplr(MxParser.OplrContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = ctx.op_in_expr.getText();
        ans.expr_type = "lr";
        node node1 = visit(ctx.expr(0));
        node node2 = visit(ctx.expr(1));
        ans.son.add(node1);
        ans.son.add(node2);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitId2(MxParser.Id2Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "atom";
        ans.left_value = true;
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitExprarr(MxParser.ExprarrContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = "array";
        node node1 = visit(ctx.expr(0));
        node node2 = visit(ctx.expr(1));
        ans.son.add(node1);
        ans.son.add(node2);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitId1(MxParser.Id1Context ctx) {
        //node ans = new node();
        node ans = visit(ctx.getChild(0));
        ans.name = ctx.getText();
        ans.type = "atom";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitOpassign(MxParser.OpassignContext ctx) {
        node ans = new node();
        ans.type = "expression";
        ans.name = "=";
        node node1 = visit(ctx.expr(0));
        node node2 = visit(ctx.expr(1));
        ans.son.add(node1);
        ans.son.add(node2);
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitExprmix(MxParser.ExprmixContext ctx) {
        node ans = visit(ctx.expr());
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitVar_(MxParser.Var_Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "atom";
        ans.left_value = true;
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitBool_(MxParser.Bool_Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "atom";
        ans.data_type = "bool";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitString_(MxParser.String_Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "atom";
        ans.data_type = "string";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitInt_(MxParser.Int_Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "atom";
        ans.data_type = "int";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitNull__(MxParser.Null__Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "atom";
        ans.data_type = "null";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitVoid__(MxParser.Void__Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "type";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitInt__(MxParser.Int__Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "type";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitString__(MxParser.String__Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "type";
        return ans;
    }
    /*
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public node visitBool__(MxParser.Bool__Context ctx) {
        node ans = new node();
        ans.name = ctx.getText();
        ans.type = "type";
        return ans;
    }
}