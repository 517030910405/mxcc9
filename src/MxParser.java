// Generated from D:/compiler/untitled16/src\Mx.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Comment=20, WS=21, True__=22, False__=23, Op1=24, 
		Op2=25, Shlr=26, RelatOp1=27, RelatOp2=28, LogicOp=29, Bool__=30, Int__=31, 
		String__=32, Null__=33, Void__=34, For__=35, If__=36, While__=37, Break__=38, 
		Continue__=39, Return__=40, New__=41, Class__=42, This__=43, Else__=44, 
		Int_=45, Var=46, Digits=47, NL=48, String_=49;
	public static final int
		RULE_mx = 0, RULE_outfit = 1, RULE_class_ = 2, RULE_func = 3, RULE_self_func = 4, 
		RULE_stat = 5, RULE_singstat = 6, RULE_for_expr_in_cir = 7, RULE_type_and_var = 8, 
		RULE_type_ = 9, RULE_expr = 10, RULE_var_ = 11, RULE_bool_ = 12, RULE_string_ = 13, 
		RULE_int_ = 14, RULE_null__ = 15, RULE_void__ = 16, RULE_int__ = 17, RULE_string__ = 18, 
		RULE_bool__ = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"mx", "outfit", "class_", "func", "self_func", "stat", "singstat", "for_expr_in_cir", 
			"type_and_var", "type_", "expr", "var_", "bool_", "string_", "int_", 
			"null__", "void__", "int__", "string__", "bool__"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "'['", "']'", "'.'", 
			"'++'", "'--'", "'!'", "'~'", "'&'", "'^'", "'|'", "'&&'", "'||'", "'='", 
			null, null, null, null, null, null, null, null, null, null, "'bool'", 
			"'int'", "'string'", "'null'", "'void'", "'for'", "'if'", "'while'", 
			"'break'", "'continue'", "'return'", "'new'", "'class'", "'this'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Comment", "WS", "True__", 
			"False__", "Op1", "Op2", "Shlr", "RelatOp1", "RelatOp2", "LogicOp", "Bool__", 
			"Int__", "String__", "Null__", "Void__", "For__", "If__", "While__", 
			"Break__", "Continue__", "Return__", "New__", "Class__", "This__", "Else__", 
			"Int_", "Var", "Digits", "NL", "String_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MxContext extends ParserRuleContext {
		public List<OutfitContext> outfit() {
			return getRuleContexts(OutfitContext.class);
		}
		public OutfitContext outfit(int i) {
			return getRuleContext(OutfitContext.class,i);
		}
		public MxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MxContext mx() throws RecognitionException {
		MxContext _localctx = new MxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool__) | (1L << Int__) | (1L << String__) | (1L << Void__) | (1L << Class__) | (1L << Var))) != 0)) {
				{
				{
				setState(40);
				outfit();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutfitContext extends ParserRuleContext {
		public OutfitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outfit; }
	 
		public OutfitContext() { }
		public void copyFrom(OutfitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_assignContext extends OutfitContext {
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public Class_assignContext(OutfitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClass_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClass_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClass_assign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends OutfitContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FunctionContext(OutfitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_assignContext extends OutfitContext {
		public Type_and_varContext type_and_var() {
			return getRuleContext(Type_and_varContext.class,0);
		}
		public Type_assignContext(OutfitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutfitContext outfit() throws RecognitionException {
		OutfitContext _localctx = new OutfitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_outfit);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				func();
				}
				break;
			case 2:
				_localctx = new Class_assignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				class_();
				}
				break;
			case 3:
				_localctx = new Type_assignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				type_and_var();
				setState(49);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode Class__() { return getToken(MxParser.Class__, 0); }
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<Type_and_varContext> type_and_var() {
			return getRuleContexts(Type_and_varContext.class);
		}
		public Type_and_varContext type_and_var(int i) {
			return getRuleContext(Type_and_varContext.class,i);
		}
		public List<Self_funcContext> self_func() {
			return getRuleContexts(Self_funcContext.class);
		}
		public Self_funcContext self_func(int i) {
			return getRuleContext(Self_funcContext.class,i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClass_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClass_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClass_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(Class__);
			setState(54);
			var_();
			setState(55);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool__) | (1L << Int__) | (1L << String__) | (1L << Void__) | (1L << Var))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(56);
					func();
					}
					break;
				case 2:
					{
					setState(57);
					type_and_var();
					setState(58);
					match(T__0);
					}
					break;
				case 3:
					{
					setState(60);
					self_func();
					}
					break;
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<Type_and_varContext> type_and_var() {
			return getRuleContexts(Type_and_varContext.class);
		}
		public Type_and_varContext type_and_var(int i) {
			return getRuleContext(Type_and_varContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type_(0);
			setState(69);
			var_();
			setState(70);
			match(T__3);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool__) | (1L << Int__) | (1L << String__) | (1L << Void__) | (1L << Var))) != 0)) {
				{
				setState(71);
				type_and_var();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(72);
					match(T__4);
					setState(73);
					type_and_var();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
			match(T__5);
			setState(82);
			match(T__1);
			setState(83);
			stat();
			setState(84);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Self_funcContext extends ParserRuleContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<Type_and_varContext> type_and_var() {
			return getRuleContexts(Type_and_varContext.class);
		}
		public Type_and_varContext type_and_var(int i) {
			return getRuleContext(Type_and_varContext.class,i);
		}
		public Self_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSelf_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSelf_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSelf_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_funcContext self_func() throws RecognitionException {
		Self_funcContext _localctx = new Self_funcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_self_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			var_();
			setState(87);
			match(T__3);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool__) | (1L << Int__) | (1L << String__) | (1L << Void__) | (1L << Var))) != 0)) {
				{
				setState(88);
				type_and_var();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(89);
					match(T__4);
					setState(90);
					type_and_var();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(98);
			match(T__5);
			setState(99);
			match(T__1);
			setState(100);
			stat();
			setState(101);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public List<SingstatContext> singstat() {
			return getRuleContexts(SingstatContext.class);
		}
		public SingstatContext singstat(int i) {
			return getRuleContext(SingstatContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << True__) | (1L << False__) | (1L << Op2) | (1L << Bool__) | (1L << Int__) | (1L << String__) | (1L << Null__) | (1L << Void__) | (1L << For__) | (1L << If__) | (1L << While__) | (1L << Break__) | (1L << Continue__) | (1L << Return__) | (1L << New__) | (1L << This__) | (1L << Int_) | (1L << Var) | (1L << String_))) != 0)) {
				{
				{
				setState(103);
				singstat();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingstatContext extends ParserRuleContext {
		public SingstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singstat; }
	 
		public SingstatContext() { }
		public void copyFrom(SingstatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_stmtContext extends SingstatContext {
		public TerminalNode While__() { return getToken(MxParser.While__, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingstatContext singstat() {
			return getRuleContext(SingstatContext.class,0);
		}
		public While_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtmixContext extends SingstatContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StmtmixContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStmtmix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStmtmix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStmtmix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sing_stmtContext extends SingstatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sing_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSing_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSing_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSing_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Empty_stmtContext extends SingstatContext {
		public Empty_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterEmpty_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitEmpty_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitEmpty_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Continue_stmtContext extends SingstatContext {
		public TerminalNode Continue__() { return getToken(MxParser.Continue__, 0); }
		public Continue_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_stmtContext extends SingstatContext {
		public TerminalNode If__() { return getToken(MxParser.If__, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SingstatContext> singstat() {
			return getRuleContexts(SingstatContext.class);
		}
		public SingstatContext singstat(int i) {
			return getRuleContext(SingstatContext.class,i);
		}
		public TerminalNode Else__() { return getToken(MxParser.Else__, 0); }
		public If_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Break_stmtContext extends SingstatContext {
		public TerminalNode Break__() { return getToken(MxParser.Break__, 0); }
		public Break_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_stmtContext extends SingstatContext {
		public TerminalNode For__() { return getToken(MxParser.For__, 0); }
		public List<For_expr_in_cirContext> for_expr_in_cir() {
			return getRuleContexts(For_expr_in_cirContext.class);
		}
		public For_expr_in_cirContext for_expr_in_cir(int i) {
			return getRuleContext(For_expr_in_cirContext.class,i);
		}
		public SingstatContext singstat() {
			return getRuleContext(SingstatContext.class,0);
		}
		public For_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assign_stmtContext extends SingstatContext {
		public Type_and_varContext type_and_var() {
			return getRuleContext(Type_and_varContext.class,0);
		}
		public Assign_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_stmtContext extends SingstatContext {
		public TerminalNode Return__() { return getToken(MxParser.Return__, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Return_stmtContext(SingstatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingstatContext singstat() throws RecognitionException {
		SingstatContext _localctx = new SingstatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singstat);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Empty_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new Sing_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				expr(0);
				setState(111);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new Assign_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				type_and_var();
				setState(114);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new Return_stmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(Return__);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << True__) | (1L << False__) | (1L << Op2) | (1L << Null__) | (1L << Void__) | (1L << New__) | (1L << This__) | (1L << Int_) | (1L << Var) | (1L << String_))) != 0)) {
					{
					{
					setState(117);
					expr(0);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new Break_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(Break__);
				setState(125);
				match(T__0);
				}
				break;
			case 6:
				_localctx = new Continue_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(Continue__);
				setState(127);
				match(T__0);
				}
				break;
			case 7:
				_localctx = new For_stmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				match(For__);
				setState(129);
				match(T__3);
				setState(130);
				for_expr_in_cir();
				setState(131);
				match(T__0);
				setState(132);
				for_expr_in_cir();
				setState(133);
				match(T__0);
				setState(134);
				for_expr_in_cir();
				setState(135);
				match(T__5);
				setState(136);
				singstat();
				}
				break;
			case 8:
				_localctx = new While_stmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				match(While__);
				setState(139);
				match(T__3);
				setState(140);
				expr(0);
				setState(141);
				match(T__5);
				setState(142);
				singstat();
				}
				break;
			case 9:
				_localctx = new StmtmixContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				match(T__1);
				setState(145);
				stat();
				setState(146);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				match(If__);
				setState(149);
				match(T__3);
				setState(150);
				expr(0);
				setState(151);
				match(T__5);
				setState(152);
				singstat();
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(153);
					match(Else__);
					setState(154);
					singstat();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_expr_in_cirContext extends ParserRuleContext {
		public For_expr_in_cirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr_in_cir; }
	 
		public For_expr_in_cirContext() { }
		public void copyFrom(For_expr_in_cirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class None_in_forContext extends For_expr_in_cirContext {
		public None_in_forContext(For_expr_in_cirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNone_in_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNone_in_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNone_in_for(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_in_forContext extends For_expr_in_cirContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_in_forContext(For_expr_in_cirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExpr_in_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExpr_in_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExpr_in_for(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assign_in_forContext extends For_expr_in_cirContext {
		public Type_and_varContext type_and_var() {
			return getRuleContext(Type_and_varContext.class,0);
		}
		public Assign_in_forContext(For_expr_in_cirContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterAssign_in_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitAssign_in_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAssign_in_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_expr_in_cirContext for_expr_in_cir() throws RecognitionException {
		For_expr_in_cirContext _localctx = new For_expr_in_cirContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_expr_in_cir);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Assign_in_forContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				type_and_var();
				}
				break;
			case 2:
				_localctx = new Expr_in_forContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				expr(0);
				}
				break;
			case 3:
				_localctx = new None_in_forContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_and_varContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_and_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_and_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_and_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_and_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_and_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_and_varContext type_and_var() throws RecognitionException {
		Type_and_varContext _localctx = new Type_and_varContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_and_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			type_(0);
			setState(165);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	 
		public Type_Context() { }
		public void copyFrom(Type_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_stringContext extends Type_Context {
		public String__Context string__() {
			return getRuleContext(String__Context.class,0);
		}
		public Type_stringContext(Type_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_string(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_boolContext extends Type_Context {
		public Bool__Context bool__() {
			return getRuleContext(Bool__Context.class,0);
		}
		public Type_boolContext(Type_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_arrayContext extends Type_Context {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Type_arrayContext(Type_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_varContext extends Type_Context {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public Type_varContext(Type_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_array_withnumContext extends Type_Context {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_array_withnumContext(Type_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_array_withnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_array_withnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_array_withnum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_voidContext extends Type_Context {
		public Void__Context void__() {
			return getRuleContext(Void__Context.class,0);
		}
		public Type_voidContext(Type_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_void(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_intContext extends Type_Context {
		public Int__Context int__() {
			return getRuleContext(Int__Context.class,0);
		}
		public Type_intContext(Type_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		return type_(0);
	}

	private Type_Context type_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_Context _localctx = new Type_Context(_ctx, _parentState);
		Type_Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_type_, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				_localctx = new Type_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				var_();
				}
				break;
			case Int__:
				{
				_localctx = new Type_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				int__();
				}
				break;
			case Void__:
				{
				_localctx = new Type_voidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				void__();
				}
				break;
			case String__:
				{
				_localctx = new Type_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				string__();
				}
				break;
			case Bool__:
				{
				_localctx = new Type_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				bool__();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Type_arrayContext(new Type_Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(T__6);
						setState(177);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new Type_array_withnumContext(new Type_Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_);
						setState(178);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(179);
						match(T__6);
						setState(180);
						expr(0);
						setState(181);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OprContext extends ExprContext {
		public Token op_in_expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Op2() { return getToken(MxParser.Op2, 0); }
		public OprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprnewContext extends ExprContext {
		public TerminalNode New__() { return getToken(MxParser.New__, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ExprnewContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprnew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprnew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprnew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprsubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprsub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OplrContext extends ExprContext {
		public Token op_in_expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Op1() { return getToken(MxParser.Op1, 0); }
		public TerminalNode Op2() { return getToken(MxParser.Op2, 0); }
		public TerminalNode Shlr() { return getToken(MxParser.Shlr, 0); }
		public TerminalNode RelatOp1() { return getToken(MxParser.RelatOp1, 0); }
		public TerminalNode RelatOp2() { return getToken(MxParser.RelatOp2, 0); }
		public OplrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterOplr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitOplr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitOplr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Id2Context extends ExprContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public Id2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterId2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitId2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitId2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprarrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprarrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprarr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprarr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprarr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Id1Context extends ExprContext {
		public Int_Context int_() {
			return getRuleContext(Int_Context.class,0);
		}
		public Bool_Context bool_() {
			return getRuleContext(Bool_Context.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public Null__Context null__() {
			return getRuleContext(Null__Context.class,0);
		}
		public Void__Context void__() {
			return getRuleContext(Void__Context.class,0);
		}
		public Id1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterId1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitId1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitId1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OplContext extends ExprContext {
		public Token op_in_expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OplContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitOpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitOpl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpassignContext extends ExprContext {
		public Token op_in_expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpassignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterOpassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitOpassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitOpassign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprthisContext extends ExprContext {
		public TerminalNode This__() { return getToken(MxParser.This__, 0); }
		public ExprthisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprthis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprthis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprthis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprmixContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprmixContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprmix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprmix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprmix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprfuncContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprfuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterExprfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitExprfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case This__:
				{
				_localctx = new ExprthisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				match(This__);
				}
				break;
			case Int_:
				{
				_localctx = new Id1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				int_();
				}
				break;
			case True__:
			case False__:
				{
				_localctx = new Id1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				bool_();
				}
				break;
			case Var:
				{
				_localctx = new Id2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				var_();
				}
				break;
			case String_:
				{
				_localctx = new Id1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				string_();
				}
				break;
			case Null__:
				{
				_localctx = new Id1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				null__();
				}
				break;
			case Void__:
				{
				_localctx = new Id1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				void__();
				}
				break;
			case T__3:
				{
				_localctx = new ExprmixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__3);
				setState(197);
				expr(0);
				setState(198);
				match(T__5);
				}
				break;
			case T__9:
			case T__10:
				{
				_localctx = new OprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				((OprContext)_localctx).op_in_expr = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((OprContext)_localctx).op_in_expr = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				expr(15);
				}
				break;
			case T__11:
			case T__12:
				{
				_localctx = new OprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				((OprContext)_localctx).op_in_expr = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
					((OprContext)_localctx).op_in_expr = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				expr(14);
				}
				break;
			case New__:
				{
				_localctx = new ExprnewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(New__);
				setState(205);
				type_(0);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(206);
					match(T__3);
					setState(207);
					match(T__5);
					}
					break;
				}
				}
				break;
			case Op2:
				{
				_localctx = new OprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				((OprContext)_localctx).op_in_expr = match(Op2);
				setState(211);
				expr(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(215);
						match(T__8);
						setState(216);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(218);
						((OplrContext)_localctx).op_in_expr = match(Op1);
						setState(219);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(221);
						((OplrContext)_localctx).op_in_expr = match(Op2);
						setState(222);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(224);
						((OplrContext)_localctx).op_in_expr = match(Shlr);
						setState(225);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						((OplrContext)_localctx).op_in_expr = match(RelatOp1);
						setState(228);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
						((OplrContext)_localctx).op_in_expr = match(RelatOp2);
						setState(231);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(233);
						((OplrContext)_localctx).op_in_expr = match(T__13);
						setState(234);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(236);
						((OplrContext)_localctx).op_in_expr = match(T__14);
						setState(237);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(239);
						((OplrContext)_localctx).op_in_expr = match(T__15);
						setState(240);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						((OplrContext)_localctx).op_in_expr = match(T__16);
						setState(243);
						expr(4);
						}
						break;
					case 11:
						{
						_localctx = new OplrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(245);
						((OplrContext)_localctx).op_in_expr = match(T__17);
						setState(246);
						expr(3);
						}
						break;
					case 12:
						{
						_localctx = new OpassignContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(248);
						((OpassignContext)_localctx).op_in_expr = match(T__18);
						setState(249);
						expr(2);
						}
						break;
					case 13:
						{
						_localctx = new OplContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(251);
						((OplContext)_localctx).op_in_expr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((OplContext)_localctx).op_in_expr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprarrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(253);
						match(T__6);
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << True__) | (1L << False__) | (1L << Op2) | (1L << Null__) | (1L << Void__) | (1L << New__) | (1L << This__) | (1L << Int_) | (1L << Var) | (1L << String_))) != 0)) {
							{
							setState(254);
							expr(0);
							}
						}

						setState(257);
						match(T__7);
						}
						break;
					case 15:
						{
						_localctx = new ExprfuncContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(259);
						match(T__3);
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << True__) | (1L << False__) | (1L << Op2) | (1L << Null__) | (1L << Void__) | (1L << New__) | (1L << This__) | (1L << Int_) | (1L << Var) | (1L << String_))) != 0)) {
							{
							setState(260);
							expr(0);
							setState(265);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(261);
								match(T__4);
								setState(262);
								expr(0);
								}
								}
								setState(267);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(270);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Var_Context extends ParserRuleContext {
		public TerminalNode Var() { return getToken(MxParser.Var, 0); }
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVar_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVar_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Var);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_Context extends ParserRuleContext {
		public TerminalNode True__() { return getToken(MxParser.True__, 0); }
		public TerminalNode False__() { return getToken(MxParser.False__, 0); }
		public Bool_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBool_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBool_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBool_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_Context bool_() throws RecognitionException {
		Bool_Context _localctx = new Bool_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==True__ || _la==False__) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_Context extends ParserRuleContext {
		public TerminalNode String_() { return getToken(MxParser.String_, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitString_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitString_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_string_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(String_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_Context extends ParserRuleContext {
		public TerminalNode Int_() { return getToken(MxParser.Int_, 0); }
		public Int_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterInt_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitInt_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitInt_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_Context int_() throws RecognitionException {
		Int_Context _localctx = new Int_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_int_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(Int_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null__Context extends ParserRuleContext {
		public TerminalNode Null__() { return getToken(MxParser.Null__, 0); }
		public Null__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null__; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNull__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNull__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNull__(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null__Context null__() throws RecognitionException {
		Null__Context _localctx = new Null__Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_null__);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Null__);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Void__Context extends ParserRuleContext {
		public TerminalNode Void__() { return getToken(MxParser.Void__, 0); }
		public Void__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void__; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVoid__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVoid__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVoid__(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void__Context void__() throws RecognitionException {
		Void__Context _localctx = new Void__Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_void__);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(Void__);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int__Context extends ParserRuleContext {
		public TerminalNode Int__() { return getToken(MxParser.Int__, 0); }
		public Int__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int__; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterInt__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitInt__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitInt__(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int__Context int__() throws RecognitionException {
		Int__Context _localctx = new Int__Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_int__);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(Int__);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String__Context extends ParserRuleContext {
		public TerminalNode String__() { return getToken(MxParser.String__, 0); }
		public String__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string__; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterString__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitString__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitString__(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String__Context string__() throws RecognitionException {
		String__Context _localctx = new String__Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_string__);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(String__);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool__Context extends ParserRuleContext {
		public TerminalNode Bool__() { return getToken(MxParser.Bool__, 0); }
		public Bool__Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool__; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBool__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBool__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBool__(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool__Context bool__() throws RecognitionException {
		Bool__Context _localctx = new Bool__Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool__);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(Bool__);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return type__sempred((Type_Context)_localctx, predIndex);
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type__sempred(Type_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		case 14:
			return precpred(_ctx, 18);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4"+
		"C\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\5\5R\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\5\6"+
		"c\n\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\5\b\u00a0\n\b\3\t\3\t\3"+
		"\t\5\t\u00a5\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b0"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ba\n\13\f\13\16"+
		"\13\u00bd\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\3\f\3\f\5\f\u00d7\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0102\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010a\n\f\f"+
		"\f\16\f\u010d\13\f\5\f\u010f\n\f\3\f\7\f\u0112\n\f\f\f\16\f\u0115\13\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\2\4\24\26\26\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(\2\5\3\2\f\r\3\2\16\17\3\2\30\31\2\u0150\2-\3\2\2\2\4\65\3"+
		"\2\2\2\6\67\3\2\2\2\bF\3\2\2\2\nX\3\2\2\2\fl\3\2\2\2\16\u009f\3\2\2\2"+
		"\20\u00a4\3\2\2\2\22\u00a6\3\2\2\2\24\u00af\3\2\2\2\26\u00d6\3\2\2\2\30"+
		"\u0116\3\2\2\2\32\u0118\3\2\2\2\34\u011a\3\2\2\2\36\u011c\3\2\2\2 \u011e"+
		"\3\2\2\2\"\u0120\3\2\2\2$\u0122\3\2\2\2&\u0124\3\2\2\2(\u0126\3\2\2\2"+
		"*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2"+
		"\2\60\66\5\b\5\2\61\66\5\6\4\2\62\63\5\22\n\2\63\64\7\3\2\2\64\66\3\2"+
		"\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\66\5\3\2\2\2\678\7,\2\2"+
		"89\5\30\r\29A\7\4\2\2:@\5\b\5\2;<\5\22\n\2<=\7\3\2\2=@\3\2\2\2>@\5\n\6"+
		"\2?:\3\2\2\2?;\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2"+
		"\2CA\3\2\2\2DE\7\5\2\2E\7\3\2\2\2FG\5\24\13\2GH\5\30\r\2HQ\7\6\2\2IN\5"+
		"\22\n\2JK\7\7\2\2KM\5\22\n\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O"+
		"R\3\2\2\2PN\3\2\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\b\2\2TU\7\4\2\2"+
		"UV\5\f\7\2VW\7\5\2\2W\t\3\2\2\2XY\5\30\r\2Yb\7\6\2\2Z_\5\22\n\2[\\\7\7"+
		"\2\2\\^\5\22\n\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2bZ\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\b\2\2ef\7\4\2\2fg\5\f\7\2gh\7"+
		"\5\2\2h\13\3\2\2\2ik\5\16\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2"+
		"m\r\3\2\2\2nl\3\2\2\2o\u00a0\7\3\2\2pq\5\26\f\2qr\7\3\2\2r\u00a0\3\2\2"+
		"\2st\5\22\n\2tu\7\3\2\2u\u00a0\3\2\2\2vz\7*\2\2wy\5\26\f\2xw\3\2\2\2y"+
		"|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u00a0\7\3\2\2~\177"+
		"\7(\2\2\177\u00a0\7\3\2\2\u0080\u0081\7)\2\2\u0081\u00a0\7\3\2\2\u0082"+
		"\u0083\7%\2\2\u0083\u0084\7\6\2\2\u0084\u0085\5\20\t\2\u0085\u0086\7\3"+
		"\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7\3\2\2\u0088\u0089\5\20\t\2\u0089"+
		"\u008a\7\b\2\2\u008a\u008b\5\16\b\2\u008b\u00a0\3\2\2\2\u008c\u008d\7"+
		"\'\2\2\u008d\u008e\7\6\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7\b\2\2\u0090"+
		"\u0091\5\16\b\2\u0091\u00a0\3\2\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5"+
		"\f\7\2\u0094\u0095\7\5\2\2\u0095\u00a0\3\2\2\2\u0096\u0097\7&\2\2\u0097"+
		"\u0098\7\6\2\2\u0098\u0099\5\26\f\2\u0099\u009a\7\b\2\2\u009a\u009d\5"+
		"\16\b\2\u009b\u009c\7.\2\2\u009c\u009e\5\16\b\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009fo\3\2\2\2\u009fp\3\2\2\2\u009f"+
		"s\3\2\2\2\u009fv\3\2\2\2\u009f~\3\2\2\2\u009f\u0080\3\2\2\2\u009f\u0082"+
		"\3\2\2\2\u009f\u008c\3\2\2\2\u009f\u0092\3\2\2\2\u009f\u0096\3\2\2\2\u00a0"+
		"\17\3\2\2\2\u00a1\u00a5\5\22\n\2\u00a2\u00a5\5\26\f\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\21\3\2\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\5\26\f\2\u00a8\23\3\2\2"+
		"\2\u00a9\u00aa\b\13\1\2\u00aa\u00b0\5\30\r\2\u00ab\u00b0\5$\23\2\u00ac"+
		"\u00b0\5\"\22\2\u00ad\u00b0\5&\24\2\u00ae\u00b0\5(\25\2\u00af\u00a9\3"+
		"\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00bb\3\2\2\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3\7\t"+
		"\2\2\u00b3\u00ba\7\n\2\2\u00b4\u00b5\f\3\2\2\u00b5\u00b6\7\t\2\2\u00b6"+
		"\u00b7\5\26\f\2\u00b7\u00b8\7\n\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b1\3"+
		"\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\25\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\f\1"+
		"\2\u00bf\u00d7\7-\2\2\u00c0\u00d7\5\36\20\2\u00c1\u00d7\5\32\16\2\u00c2"+
		"\u00d7\5\30\r\2\u00c3\u00d7\5\34\17\2\u00c4\u00d7\5 \21\2\u00c5\u00d7"+
		"\5\"\22\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7\b\2\2"+
		"\u00c9\u00d7\3\2\2\2\u00ca\u00cb\t\2\2\2\u00cb\u00d7\5\26\f\21\u00cc\u00cd"+
		"\t\3\2\2\u00cd\u00d7\5\26\f\20\u00ce\u00cf\7+\2\2\u00cf\u00d2\5\24\13"+
		"\2\u00d0\u00d1\7\6\2\2\u00d1\u00d3\7\b\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d7\5\26\f\r"+
		"\u00d6\u00be\3\2\2\2\u00d6\u00c0\3\2\2\2\u00d6\u00c1\3\2\2\2\u00d6\u00c2"+
		"\3\2\2\2\u00d6\u00c3\3\2\2\2\u00d6\u00c4\3\2\2\2\u00d6\u00c5\3\2\2\2\u00d6"+
		"\u00c6\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00ce\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u0113\3\2\2\2\u00d8\u00d9\f\25\2\2\u00d9"+
		"\u00da\7\13\2\2\u00da\u0112\5\26\f\26\u00db\u00dc\f\16\2\2\u00dc\u00dd"+
		"\7\32\2\2\u00dd\u0112\5\26\f\17\u00de\u00df\f\f\2\2\u00df\u00e0\7\33\2"+
		"\2\u00e0\u0112\5\26\f\r\u00e1\u00e2\f\13\2\2\u00e2\u00e3\7\34\2\2\u00e3"+
		"\u0112\5\26\f\f\u00e4\u00e5\f\n\2\2\u00e5\u00e6\7\35\2\2\u00e6\u0112\5"+
		"\26\f\13\u00e7\u00e8\f\t\2\2\u00e8\u00e9\7\36\2\2\u00e9\u0112\5\26\f\n"+
		"\u00ea\u00eb\f\b\2\2\u00eb\u00ec\7\20\2\2\u00ec\u0112\5\26\f\t\u00ed\u00ee"+
		"\f\7\2\2\u00ee\u00ef\7\21\2\2\u00ef\u0112\5\26\f\b\u00f0\u00f1\f\6\2\2"+
		"\u00f1\u00f2\7\22\2\2\u00f2\u0112\5\26\f\7\u00f3\u00f4\f\5\2\2\u00f4\u00f5"+
		"\7\23\2\2\u00f5\u0112\5\26\f\6\u00f6\u00f7\f\4\2\2\u00f7\u00f8\7\24\2"+
		"\2\u00f8\u0112\5\26\f\5\u00f9\u00fa\f\3\2\2\u00fa\u00fb\7\25\2\2\u00fb"+
		"\u0112\5\26\f\4\u00fc\u00fd\f\24\2\2\u00fd\u0112\t\2\2\2\u00fe\u00ff\f"+
		"\23\2\2\u00ff\u0101\7\t\2\2\u0100\u0102\5\26\f\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0112\7\n\2\2\u0104\u0105\f\22"+
		"\2\2\u0105\u010e\7\6\2\2\u0106\u010b\5\26\f\2\u0107\u0108\7\7\2\2\u0108"+
		"\u010a\5\26\f\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0106\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7\b"+
		"\2\2\u0111\u00d8\3\2\2\2\u0111\u00db\3\2\2\2\u0111\u00de\3\2\2\2\u0111"+
		"\u00e1\3\2\2\2\u0111\u00e4\3\2\2\2\u0111\u00e7\3\2\2\2\u0111\u00ea\3\2"+
		"\2\2\u0111\u00ed\3\2\2\2\u0111\u00f0\3\2\2\2\u0111\u00f3\3\2\2\2\u0111"+
		"\u00f6\3\2\2\2\u0111\u00f9\3\2\2\2\u0111\u00fc\3\2\2\2\u0111\u00fe\3\2"+
		"\2\2\u0111\u0104\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\27\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\60\2"+
		"\2\u0117\31\3\2\2\2\u0118\u0119\t\4\2\2\u0119\33\3\2\2\2\u011a\u011b\7"+
		"\63\2\2\u011b\35\3\2\2\2\u011c\u011d\7/\2\2\u011d\37\3\2\2\2\u011e\u011f"+
		"\7#\2\2\u011f!\3\2\2\2\u0120\u0121\7$\2\2\u0121#\3\2\2\2\u0122\u0123\7"+
		"!\2\2\u0123%\3\2\2\2\u0124\u0125\7\"\2\2\u0125\'\3\2\2\2\u0126\u0127\7"+
		" \2\2\u0127)\3\2\2\2\31-\65?ANQ_blz\u009d\u009f\u00a4\u00af\u00b9\u00bb"+
		"\u00d2\u00d6\u0101\u010b\u010e\u0111\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}