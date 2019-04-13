// Generated from D:/compiler/untitled16/src\Mx.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#mx}.
	 * @param ctx the parse tree
	 */
	void enterMx(MxParser.MxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#mx}.
	 * @param ctx the parse tree
	 */
	void exitMx(MxParser.MxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MxParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_assign}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 */
	void enterClass_assign(MxParser.Class_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_assign}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 */
	void exitClass_assign(MxParser.Class_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_assign}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 */
	void enterType_assign(MxParser.Type_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_assign}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 */
	void exitType_assign(MxParser.Type_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(MxParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(MxParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(MxParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(MxParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#self_func}.
	 * @param ctx the parse tree
	 */
	void enterSelf_func(MxParser.Self_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#self_func}.
	 * @param ctx the parse tree
	 */
	void exitSelf_func(MxParser.Self_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MxParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MxParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_stmt(MxParser.Empty_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_stmt(MxParser.Empty_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sing_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterSing_stmt(MxParser.Sing_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sing_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitSing_stmt(MxParser.Sing_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(MxParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(MxParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MxParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MxParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(MxParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(MxParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(MxParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(MxParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(MxParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(MxParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MxParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MxParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtmix}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterStmtmix(MxParser.StmtmixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtmix}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitStmtmix(MxParser.StmtmixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MxParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MxParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 */
	void enterAssign_in_for(MxParser.Assign_in_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 */
	void exitAssign_in_for(MxParser.Assign_in_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 */
	void enterExpr_in_for(MxParser.Expr_in_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 */
	void exitExpr_in_for(MxParser.Expr_in_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code none_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 */
	void enterNone_in_for(MxParser.None_in_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code none_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 */
	void exitNone_in_for(MxParser.None_in_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#type_and_var}.
	 * @param ctx the parse tree
	 */
	void enterType_and_var(MxParser.Type_and_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#type_and_var}.
	 * @param ctx the parse tree
	 */
	void exitType_and_var(MxParser.Type_and_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_string}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_string(MxParser.Type_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_string}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_string(MxParser.Type_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_bool}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_bool(MxParser.Type_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_bool}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_bool(MxParser.Type_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_array}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_array(MxParser.Type_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_array}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_array(MxParser.Type_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_var}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_var(MxParser.Type_varContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_var}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_var(MxParser.Type_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_array_withnum}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_array_withnum(MxParser.Type_array_withnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_array_withnum}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_array_withnum(MxParser.Type_array_withnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_void(MxParser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_void(MxParser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_int(MxParser.Type_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_int(MxParser.Type_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(MxParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(MxParser.OprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprnew}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprnew(MxParser.ExprnewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprnew}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprnew(MxParser.ExprnewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprsub}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprsub(MxParser.ExprsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprsub}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprsub(MxParser.ExprsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oplr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOplr(MxParser.OplrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oplr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOplr(MxParser.OplrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id2}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId2(MxParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code id2}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId2(MxParser.Id2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exprarr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprarr(MxParser.ExprarrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprarr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprarr(MxParser.ExprarrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id1}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId1(MxParser.Id1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code id1}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId1(MxParser.Id1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code opl}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpl(MxParser.OplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opl}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpl(MxParser.OplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opassign}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpassign(MxParser.OpassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opassign}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpassign(MxParser.OpassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprthis}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprthis(MxParser.ExprthisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprthis}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprthis(MxParser.ExprthisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprmix}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprmix(MxParser.ExprmixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprmix}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprmix(MxParser.ExprmixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprfunc}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprfunc(MxParser.ExprfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprfunc}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprfunc(MxParser.ExprfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#var_}.
	 * @param ctx the parse tree
	 */
	void enterVar_(MxParser.Var_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#var_}.
	 * @param ctx the parse tree
	 */
	void exitVar_(MxParser.Var_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#bool_}.
	 * @param ctx the parse tree
	 */
	void enterBool_(MxParser.Bool_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#bool_}.
	 * @param ctx the parse tree
	 */
	void exitBool_(MxParser.Bool_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(MxParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(MxParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#int_}.
	 * @param ctx the parse tree
	 */
	void enterInt_(MxParser.Int_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#int_}.
	 * @param ctx the parse tree
	 */
	void exitInt_(MxParser.Int_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#null__}.
	 * @param ctx the parse tree
	 */
	void enterNull__(MxParser.Null__Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#null__}.
	 * @param ctx the parse tree
	 */
	void exitNull__(MxParser.Null__Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#void__}.
	 * @param ctx the parse tree
	 */
	void enterVoid__(MxParser.Void__Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#void__}.
	 * @param ctx the parse tree
	 */
	void exitVoid__(MxParser.Void__Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#int__}.
	 * @param ctx the parse tree
	 */
	void enterInt__(MxParser.Int__Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#int__}.
	 * @param ctx the parse tree
	 */
	void exitInt__(MxParser.Int__Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#string__}.
	 * @param ctx the parse tree
	 */
	void enterString__(MxParser.String__Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#string__}.
	 * @param ctx the parse tree
	 */
	void exitString__(MxParser.String__Context ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#bool__}.
	 * @param ctx the parse tree
	 */
	void enterBool__(MxParser.Bool__Context ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#bool__}.
	 * @param ctx the parse tree
	 */
	void exitBool__(MxParser.Bool__Context ctx);
}