// Generated from D:/compiler/untitled16/src\Mx.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxParser#mx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMx(MxParser.MxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MxParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_assign}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_assign(MxParser.Class_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_assign}
	 * labeled alternative in {@link MxParser#outfit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assign(MxParser.Type_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#class_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_(MxParser.Class_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(MxParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#self_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_func(MxParser.Self_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MxParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_stmt(MxParser.Empty_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sing_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSing_stmt(MxParser.Sing_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(MxParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MxParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(MxParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(MxParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(MxParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(MxParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtmix}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtmix(MxParser.StmtmixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link MxParser#singstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MxParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_in_for(MxParser.Assign_in_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_in_for(MxParser.Expr_in_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code none_in_for}
	 * labeled alternative in {@link MxParser#for_expr_in_cir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone_in_for(MxParser.None_in_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#type_and_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_and_var(MxParser.Type_and_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_string}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_string(MxParser.Type_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_bool}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_bool(MxParser.Type_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_array}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_array(MxParser.Type_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_var}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_var(MxParser.Type_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_array_withnum}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_array_withnum(MxParser.Type_array_withnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_void(MxParser.Type_voidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link MxParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(MxParser.Type_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(MxParser.OprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprnew}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprnew(MxParser.ExprnewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprsub}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprsub(MxParser.ExprsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oplr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplr(MxParser.OplrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id2}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId2(MxParser.Id2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exprarr}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprarr(MxParser.ExprarrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id1}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId1(MxParser.Id1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code opl}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpl(MxParser.OplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opassign}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpassign(MxParser.OpassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprthis}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprthis(MxParser.ExprthisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprmix}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprmix(MxParser.ExprmixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprfunc}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprfunc(MxParser.ExprfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#var_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_(MxParser.Var_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#bool_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_(MxParser.Bool_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(MxParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#int_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_(MxParser.Int_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#null__}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull__(MxParser.Null__Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#void__}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid__(MxParser.Void__Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#int__}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt__(MxParser.Int__Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#string__}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString__(MxParser.String__Context ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#bool__}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool__(MxParser.Bool__Context ctx);
}