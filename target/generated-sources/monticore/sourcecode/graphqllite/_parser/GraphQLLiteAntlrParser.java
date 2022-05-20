// Generated from /Users/esentri/bitbucket/dsl-demo/digraph/target/generated-sources/monticore/sourcecode/graphqllite/_parser/GraphQLLiteAntlrParser.g4 by ANTLR 4.7.1

package graphqllite._parser;
import de.monticore.antlr4.*;
import de.monticore.parser.*;
import graphqllite.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphQLLiteAntlrParser extends MCParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCHEMA3386979745=1, EXCLAMATIONMARK=2, FALSE97196323=3, STRING2486848561=4, 
		TYPE3575610=5, MINUS=6, POINT=7, INT73679=8, FLOAT67973692=9, SCALAR3386777580=10, 
		NULL3392903=11, TRUE3569038=12, COLON=13, LCURLY=14, LBRACK=15, ID2331=16, 
		BOOLEAN1729365000=17, RCURLY=18, RBRACK=19, Digits=20, String=21, Name=22, 
		Char=23, ML_COMMENT=24, SL_COMMENT=25, WS=26;
	public static final int
		RULE_nullLiteral = 0, RULE_booleanLiteral = 1, RULE_charLiteral = 2, RULE_stringLiteral = 3, 
		RULE_natLiteral = 4, RULE_signedNatLiteral = 5, RULE_basicLongLiteral = 6, 
		RULE_signedBasicLongLiteral = 7, RULE_basicFloatLiteral = 8, RULE_signedBasicFloatLiteral = 9, 
		RULE_basicDoubleLiteral = 10, RULE_signedBasicDoubleLiteral = 11, RULE_schema = 12, 
		RULE_scalar = 13, RULE_type = 14, RULE_gQLTypeAttribute = 15, RULE_simpleAttributeType = 16, 
		RULE_collectionAttributeType = 17, RULE_bUILDINSCALAR = 18, RULE_literal = 19, 
		RULE_signedLiteral = 20, RULE_numericLiteral = 21, RULE_signedNumericLiteral = 22, 
		RULE_gQLType = 23, RULE_attributeType = 24, RULE_mc_eof = 25, RULE_nokeyword_f102 = 26, 
		RULE_nokeyword_F70 = 27, RULE_nokeyword_l108 = 28, RULE_nokeyword_L76 = 29;
	public static final String[] ruleNames = {
		"nullLiteral", "booleanLiteral", "charLiteral", "stringLiteral", "natLiteral", 
		"signedNatLiteral", "basicLongLiteral", "signedBasicLongLiteral", "basicFloatLiteral", 
		"signedBasicFloatLiteral", "basicDoubleLiteral", "signedBasicDoubleLiteral", 
		"schema", "scalar", "type", "gQLTypeAttribute", "simpleAttributeType", 
		"collectionAttributeType", "bUILDINSCALAR", "literal", "signedLiteral", 
		"numericLiteral", "signedNumericLiteral", "gQLType", "attributeType", 
		"mc_eof", "nokeyword_f102", "nokeyword_F70", "nokeyword_l108", "nokeyword_L76"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'schema'", "'!'", "'false'", "'String'", "'type'", "'-'", "'.'", 
		"'Int'", "'Float'", "'scalar'", "'null'", "'true'", "':'", "'{'", "'['", 
		"'ID'", "'Boolean'", "'}'", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCHEMA3386979745", "EXCLAMATIONMARK", "FALSE97196323", "STRING2486848561", 
		"TYPE3575610", "MINUS", "POINT", "INT73679", "FLOAT67973692", "SCALAR3386777580", 
		"NULL3392903", "TRUE3569038", "COLON", "LCURLY", "LBRACK", "ID2331", "BOOLEAN1729365000", 
		"RCURLY", "RBRACK", "Digits", "String", "Name", "Char", "ML_COMMENT", 
		"SL_COMMENT", "WS"
	};
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
	public String getGrammarFileName() { return "GraphQLLiteAntlrParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	  // convert function for Name
	private String convertName(Token t)  {
	    return t.getText();
	}

	  // convert function for NEWLINE
	private String convertNEWLINE(Token t)  {
	    return t.getText();
	}

	  // convert function for WS
	private String convertWS(Token t)  {
	    return t.getText();
	}

	  // convert function for SL_COMMENT
	private String convertSL_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for ML_COMMENT
	private String convertML_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for Digits
	private String convertDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for Digit
	private String convertDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for Char
	private String convertChar(Token t)  {
	    return t.getText();
	}

	  // convert function for SingleCharacter
	private String convertSingleCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for String
	private String convertString(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacters
	private String convertStringCharacters(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacter
	private String convertStringCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for EscapeSequence
	private String convertEscapeSequence(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalEscape
	private String convertOctalEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for UnicodeEscape
	private String convertUnicodeEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for ZeroToThree
	private String convertZeroToThree(Token t)  {
	    return t.getText();
	}

	  // convert function for HexDigit
	private String convertHexDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalDigit
	private String convertOctalDigit(Token t)  {
	    return t.getText();
	}


	public GraphQLLiteAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public TerminalNode NULL3392903() { return getToken(GraphQLLiteAntlrParser.NULL3392903, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNullLiteralBuilder _builder = graphqllite.GraphQLLiteMill.nullLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(NULL3392903);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_booleanLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteralBuilder _builder = graphqllite.GraphQLLiteMill.booleanLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE3569038:
				{
				setState(62);
				match(TRUE3569038);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case FALSE97196323:
				{
				setState(64);
				match(FALSE97196323);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.FALSE);

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class CharLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public Token tmp0;
		public TerminalNode Char() { return getToken(GraphQLLiteAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTCharLiteralBuilder _builder = graphqllite.GraphQLLiteMill.charLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			((CharLiteralContext)_localctx).tmp0 = match(Char);
			_builder.setSource(convertChar(((CharLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null;
		public Token tmp0;
		public TerminalNode String() { return getToken(GraphQLLiteAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stringLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTStringLiteralBuilder _builder = graphqllite.GraphQLLiteMill.stringLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71);
			((StringLiteralContext)_localctx).tmp0 = match(String);
			_builder.setSource(convertString(((StringLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class NatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(GraphQLLiteAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
	}

	public final NatLiteralContext natLiteral() throws RecognitionException {
		NatLiteralContext _localctx = new NatLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_natLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNatLiteralBuilder _builder = graphqllite.GraphQLLiteMill.natLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(74);
			((NatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((NatLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class SignedNatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode Digits() { return getToken(GraphQLLiteAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(GraphQLLiteAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
	}

	public final SignedNatLiteralContext signedNatLiteral() throws RecognitionException {
		SignedNatLiteralContext _localctx = new SignedNatLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signedNatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteralBuilder _builder = graphqllite.GraphQLLiteMill.signedNatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				if (!(noSpace(2))) throw new FailedPredicateException(this, "noSpace(2)");
				{
				{
				setState(78);
				match(MINUS);

				_builder.setNegative(true);

				}
				}
				{
				setState(81);
				((SignedNatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp0));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(83);
				((SignedNatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp1));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class BasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(GraphQLLiteAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
	}

	public final BasicLongLiteralContext basicLongLiteral() throws RecognitionException {
		BasicLongLiteralContext _localctx = new BasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteralBuilder _builder = graphqllite.GraphQLLiteMill.basicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
			{
			setState(88);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(91);
				nokeyword_l108();
				}
				break;
			case 2:
				{
				setState(92);
				nokeyword_L76();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class SignedBasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode MINUS() { return getToken(GraphQLLiteAntlrParser.MINUS, 0); }
		public TerminalNode Digits() { return getToken(GraphQLLiteAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
	}

	public final SignedBasicLongLiteralContext signedBasicLongLiteral() throws RecognitionException {
		SignedBasicLongLiteralContext _localctx = new SignedBasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signedBasicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteralBuilder _builder = graphqllite.GraphQLLiteMill.signedBasicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				if (!(cmpToken(3,"l","L") && noSpace(2,3))) throw new FailedPredicateException(this, "cmpToken(3,\"l\",\"L\") && noSpace(2,3)");
				{
				setState(96);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(99);
				((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
				}
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(102);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(103);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
				{
				setState(107);
				((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp1));
				}
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(110);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(111);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class BasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(GraphQLLiteAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(GraphQLLiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(GraphQLLiteAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
	}

	public final BasicFloatLiteralContext basicFloatLiteral() throws RecognitionException {
		BasicFloatLiteralContext _localctx = new BasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_basicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteralBuilder _builder = graphqllite.GraphQLLiteMill.basicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
			{
			setState(117);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(120);
			match(POINT);
			{
			setState(121);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(124);
				nokeyword_f102();
				}
				break;
			case 2:
				{
				setState(125);
				nokeyword_F70();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class SignedBasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(GraphQLLiteAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(GraphQLLiteAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(GraphQLLiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(GraphQLLiteAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
	}

	public final SignedBasicFloatLiteralContext signedBasicFloatLiteral() throws RecognitionException {
		SignedBasicFloatLiteralContext _localctx = new SignedBasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signedBasicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteralBuilder _builder = graphqllite.GraphQLLiteMill.signedBasicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				if (!(cmpToken(5,"f","F") && noSpace(2,3,4,5))) throw new FailedPredicateException(this, "cmpToken(5,\"f\",\"F\") && noSpace(2,3,4,5)");
				{
				setState(129);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(132);
				((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
				}
				setState(135);
				match(POINT);
				{
				setState(136);
				((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
				}
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(139);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(140);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
				{
				setState(144);
				((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp2));
				}
				setState(147);
				match(POINT);
				{
				setState(148);
				((SignedBasicFloatLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp3));
				}
				{
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(151);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(152);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class BasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(GraphQLLiteAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(GraphQLLiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(GraphQLLiteAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
	}

	public final BasicDoubleLiteralContext basicDoubleLiteral() throws RecognitionException {
		BasicDoubleLiteralContext _localctx = new BasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteralBuilder _builder = graphqllite.GraphQLLiteMill.basicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
			{
			setState(158);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(161);
			match(POINT);
			{
			setState(162);
			((BasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp1));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class SignedBasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(GraphQLLiteAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(GraphQLLiteAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(GraphQLLiteAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(GraphQLLiteAntlrParser.Digits, i);
		}
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
	}

	public final SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() throws RecognitionException {
		SignedBasicDoubleLiteralContext _localctx = new SignedBasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signedBasicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteralBuilder _builder = graphqllite.GraphQLLiteMill.signedBasicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				if (!(noSpace(2,3,4))) throw new FailedPredicateException(this, "noSpace(2,3,4)");
				{
				setState(166);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(169);
				((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
				}
				setState(172);
				match(POINT);
				{
				setState(173);
				((SignedBasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp1));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
				{
				setState(176);
				((SignedBasicDoubleLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp2));
				}
				setState(179);
				match(POINT);
				{
				setState(180);
				((SignedBasicDoubleLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp3));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class SchemaContext extends ParserRuleContext {
		public graphqllite._ast.ASTSchema ret = null;
		public Token tmp0;
		public GQLTypeContext tmp1;
		public TerminalNode SCHEMA3386979745() { return getToken(GraphQLLiteAntlrParser.SCHEMA3386979745, 0); }
		public TerminalNode LCURLY() { return getToken(GraphQLLiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(GraphQLLiteAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public List<GQLTypeContext> gQLType() {
			return getRuleContexts(GQLTypeContext.class);
		}
		public GQLTypeContext gQLType(int i) {
			return getRuleContext(GQLTypeContext.class,i);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_schema);
		// getActionForAltBeforeRuleBody
		graphqllite._ast.ASTSchemaBuilder _builder = graphqllite.GraphQLLiteMill.schemaBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(SCHEMA3386979745);
			{
			setState(185);
			((SchemaContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((SchemaContext)_localctx).tmp0));
			}
			setState(188);
			match(LCURLY);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE3575610 || _la==SCALAR3386777580) {
				{
				{
				setState(189);
				((SchemaContext)_localctx).tmp1 = gQLType();
				addToIteratedAttributeIfNotNull(_builder.getGQLTypeList(), _localctx.tmp1.ret);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class ScalarContext extends ParserRuleContext {
		public graphqllite._ast.ASTScalar ret = null;
		public Token tmp0;
		public TerminalNode SCALAR3386777580() { return getToken(GraphQLLiteAntlrParser.SCALAR3386777580, 0); }
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scalar);
		// getActionForAltBeforeRuleBody
		graphqllite._ast.ASTScalarBuilder _builder = graphqllite.GraphQLLiteMill.scalarBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SCALAR3386777580);
			{
			setState(200);
			((ScalarContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((ScalarContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class TypeContext extends ParserRuleContext {
		public graphqllite._ast.ASTType ret = null;
		public Token tmp0;
		public GQLTypeAttributeContext tmp1;
		public TerminalNode TYPE3575610() { return getToken(GraphQLLiteAntlrParser.TYPE3575610, 0); }
		public TerminalNode LCURLY() { return getToken(GraphQLLiteAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(GraphQLLiteAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public List<GQLTypeAttributeContext> gQLTypeAttribute() {
			return getRuleContexts(GQLTypeAttributeContext.class);
		}
		public GQLTypeAttributeContext gQLTypeAttribute(int i) {
			return getRuleContext(GQLTypeAttributeContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		// getActionForAltBeforeRuleBody
		graphqllite._ast.ASTTypeBuilder _builder = graphqllite.GraphQLLiteMill.typeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(TYPE3575610);
			{
			setState(204);
			((TypeContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((TypeContext)_localctx).tmp0));
			}
			setState(207);
			match(LCURLY);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				((TypeContext)_localctx).tmp1 = gQLTypeAttribute();
				addToIteratedAttributeIfNotNull(_builder.getAttributesList(), _localctx.tmp1.ret);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			setState(215);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class GQLTypeAttributeContext extends ParserRuleContext {
		public graphqllite._ast.ASTGQLTypeAttribute ret = null;
		public Token tmp0;
		public AttributeTypeContext tmp1;
		public TerminalNode COLON() { return getToken(GraphQLLiteAntlrParser.COLON, 0); }
		public AttributeTypeContext attributeType() {
			return getRuleContext(AttributeTypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public GQLTypeAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gQLTypeAttribute; }
	}

	public final GQLTypeAttributeContext gQLTypeAttribute() throws RecognitionException {
		GQLTypeAttributeContext _localctx = new GQLTypeAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_gQLTypeAttribute);
		// getActionForAltBeforeRuleBody
		graphqllite._ast.ASTGQLTypeAttributeBuilder _builder = graphqllite.GraphQLLiteMill.gQLTypeAttributeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			((GQLTypeAttributeContext)_localctx).tmp0 = match(Name);
			_builder.setAttributeName(convertName(((GQLTypeAttributeContext)_localctx).tmp0));
			}
			setState(220);
			match(COLON);
			setState(221);
			((GQLTypeAttributeContext)_localctx).tmp1 = attributeType();
			_builder.setType(_localctx.tmp1.ret);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class SimpleAttributeTypeContext extends ParserRuleContext {
		public graphqllite._ast.ASTSimpleAttributeType ret = null;
		public Token tmp0;
		public BUILDINSCALARContext tmp1;
		public BUILDINSCALARContext bUILDINSCALAR() {
			return getRuleContext(BUILDINSCALARContext.class,0);
		}
		public TerminalNode EXCLAMATIONMARK() { return getToken(GraphQLLiteAntlrParser.EXCLAMATIONMARK, 0); }
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public SimpleAttributeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleAttributeType; }
	}

	public final SimpleAttributeTypeContext simpleAttributeType() throws RecognitionException {
		SimpleAttributeTypeContext _localctx = new SimpleAttributeTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleAttributeType);
		// getActionForAltBeforeRuleBody
		graphqllite._ast.ASTSimpleAttributeTypeBuilder _builder = graphqllite.GraphQLLiteMill.simpleAttributeTypeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				{
				{
				setState(224);
				((SimpleAttributeTypeContext)_localctx).tmp0 = match(Name);
				_builder.setType(convertName(((SimpleAttributeTypeContext)_localctx).tmp0));
				}
				}
				break;
			case STRING2486848561:
			case INT73679:
			case FLOAT67973692:
			case ID2331:
			case BOOLEAN1729365000:
				{
				setState(226);
				((SimpleAttributeTypeContext)_localctx).tmp1 = bUILDINSCALAR();
				_builder.setBuildInScalar(_localctx.tmp1.ret);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATIONMARK) {
				{
				setState(231);
				match(EXCLAMATIONMARK);

				_builder.setRequired(true);

				}
			}

			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class CollectionAttributeTypeContext extends ParserRuleContext {
		public graphqllite._ast.ASTCollectionAttributeType ret = null;
		public SimpleAttributeTypeContext tmp0;
		public TerminalNode LBRACK() { return getToken(GraphQLLiteAntlrParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GraphQLLiteAntlrParser.RBRACK, 0); }
		public SimpleAttributeTypeContext simpleAttributeType() {
			return getRuleContext(SimpleAttributeTypeContext.class,0);
		}
		public TerminalNode EXCLAMATIONMARK() { return getToken(GraphQLLiteAntlrParser.EXCLAMATIONMARK, 0); }
		public CollectionAttributeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionAttributeType; }
	}

	public final CollectionAttributeTypeContext collectionAttributeType() throws RecognitionException {
		CollectionAttributeTypeContext _localctx = new CollectionAttributeTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_collectionAttributeType);
		// getActionForAltBeforeRuleBody
		graphqllite._ast.ASTCollectionAttributeTypeBuilder _builder = graphqllite.GraphQLLiteMill.collectionAttributeTypeBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(LBRACK);
			setState(236);
			((CollectionAttributeTypeContext)_localctx).tmp0 = simpleAttributeType();
			_builder.setSimpleAttributeType(_localctx.tmp0.ret);
			setState(238);
			match(RBRACK);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATIONMARK) {
				{
				setState(239);
				match(EXCLAMATIONMARK);

				_builder.setRequired(true);

				}
			}

			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
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

	public static class BUILDINSCALARContext extends ParserRuleContext {
		public graphqllite._ast.ASTBUILDINSCALAR ret = null;
		public TerminalNode ID2331() { return getToken(GraphQLLiteAntlrParser.ID2331, 0); }
		public TerminalNode STRING2486848561() { return getToken(GraphQLLiteAntlrParser.STRING2486848561, 0); }
		public TerminalNode BOOLEAN1729365000() { return getToken(GraphQLLiteAntlrParser.BOOLEAN1729365000, 0); }
		public TerminalNode INT73679() { return getToken(GraphQLLiteAntlrParser.INT73679, 0); }
		public TerminalNode FLOAT67973692() { return getToken(GraphQLLiteAntlrParser.FLOAT67973692, 0); }
		public BUILDINSCALARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bUILDINSCALAR; }
	}

	public final BUILDINSCALARContext bUILDINSCALAR() throws RecognitionException {
		BUILDINSCALARContext _localctx = new BUILDINSCALARContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bUILDINSCALAR);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID2331:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(ID2331);
				((BUILDINSCALARContext)_localctx).ret =  graphqllite._ast.ASTBUILDINSCALAR.ID;
				}
				break;
			case STRING2486848561:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(STRING2486848561);
				((BUILDINSCALARContext)_localctx).ret =  graphqllite._ast.ASTBUILDINSCALAR.STRING;
				}
				break;
			case BOOLEAN1729365000:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(BOOLEAN1729365000);
				((BUILDINSCALARContext)_localctx).ret =  graphqllite._ast.ASTBUILDINSCALAR.BOOLEAN;
				}
				break;
			case INT73679:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(INT73679);
				((BUILDINSCALARContext)_localctx).ret =  graphqllite._ast.ASTBUILDINSCALAR.INT;
				}
				break;
			case FLOAT67973692:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(FLOAT67973692);
				((BUILDINSCALARContext)_localctx).ret =  graphqllite._ast.ASTBUILDINSCALAR.FLOAT;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret;
		public NumericLiteralContext tmp0;
		public NullLiteralContext tmp1;
		public BooleanLiteralContext tmp2;
		public CharLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((LiteralContext)_localctx).tmp0 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp0.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((LiteralContext)_localctx).tmp1 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp1.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				((LiteralContext)_localctx).tmp2 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp2.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				((LiteralContext)_localctx).tmp3 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				((LiteralContext)_localctx).tmp4 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
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

	public static class SignedLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret;
		public SignedNumericLiteralContext tmp5;
		public NullLiteralContext tmp1;
		public BooleanLiteralContext tmp2;
		public CharLiteralContext tmp3;
		public StringLiteralContext tmp4;
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SignedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral; }
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_signedLiteral);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((SignedLiteralContext)_localctx).tmp5 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				((SignedLiteralContext)_localctx).tmp1 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp1.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				((SignedLiteralContext)_localctx).tmp2 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp2.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				((SignedLiteralContext)_localctx).tmp3 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp3.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				((SignedLiteralContext)_localctx).tmp4 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp4.ret;
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret;
		public NatLiteralContext tmp6;
		public BasicLongLiteralContext tmp7;
		public BasicFloatLiteralContext tmp8;
		public BasicDoubleLiteralContext tmp9;
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numericLiteral);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((NumericLiteralContext)_localctx).tmp6 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				((NumericLiteralContext)_localctx).tmp7 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp7.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				((NumericLiteralContext)_localctx).tmp8 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				((NumericLiteralContext)_localctx).tmp9 = basicDoubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp9.ret;
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

	public static class SignedNumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret;
		public SignedNatLiteralContext tmp10;
		public SignedBasicLongLiteralContext tmp11;
		public SignedBasicFloatLiteralContext tmp12;
		public SignedBasicDoubleLiteralContext tmp13;
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedNumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral; }
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signedNumericLiteral);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				((SignedNumericLiteralContext)_localctx).tmp10 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				((SignedNumericLiteralContext)_localctx).tmp11 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				((SignedNumericLiteralContext)_localctx).tmp12 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp12.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				((SignedNumericLiteralContext)_localctx).tmp13 = signedBasicDoubleLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp13.ret;
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

	public static class GQLTypeContext extends ParserRuleContext {
		public graphqllite._ast.ASTGQLType ret;
		public ScalarContext tmp14;
		public TypeContext tmp15;
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GQLTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gQLType; }
	}

	public final GQLTypeContext gQLType() throws RecognitionException {
		GQLTypeContext _localctx = new GQLTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gQLType);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCALAR3386777580:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				((GQLTypeContext)_localctx).tmp14 = scalar();
				((GQLTypeContext)_localctx).ret = ((GQLTypeContext)_localctx).tmp14.ret;
				}
				break;
			case TYPE3575610:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((GQLTypeContext)_localctx).tmp15 = type();
				((GQLTypeContext)_localctx).ret = ((GQLTypeContext)_localctx).tmp15.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AttributeTypeContext extends ParserRuleContext {
		public graphqllite._ast.ASTAttributeType ret;
		public SimpleAttributeTypeContext tmp16;
		public CollectionAttributeTypeContext tmp17;
		public SimpleAttributeTypeContext simpleAttributeType() {
			return getRuleContext(SimpleAttributeTypeContext.class,0);
		}
		public CollectionAttributeTypeContext collectionAttributeType() {
			return getRuleContext(CollectionAttributeTypeContext.class,0);
		}
		public AttributeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeType; }
	}

	public final AttributeTypeContext attributeType() throws RecognitionException {
		AttributeTypeContext _localctx = new AttributeTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attributeType);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING2486848561:
			case INT73679:
			case FLOAT67973692:
			case ID2331:
			case BOOLEAN1729365000:
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				((AttributeTypeContext)_localctx).tmp16 = simpleAttributeType();
				((AttributeTypeContext)_localctx).ret = ((AttributeTypeContext)_localctx).tmp16.ret;
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				((AttributeTypeContext)_localctx).tmp17 = collectionAttributeType();
				((AttributeTypeContext)_localctx).ret = ((AttributeTypeContext)_localctx).tmp17.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Mc_eofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GraphQLLiteAntlrParser.EOF, 0); }
		public Mc_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mc_eof; }
	}

	public final Mc_eofContext mc_eof() throws RecognitionException {
		Mc_eofContext _localctx = new Mc_eofContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mc_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(EOF);
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

	public static class Nokeyword_f102Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public Nokeyword_f102Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_f102; }
	}

	public final Nokeyword_f102Context nokeyword_f102() throws RecognitionException {
		Nokeyword_f102Context _localctx = new Nokeyword_f102Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_nokeyword_f102);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			if (!(next("f"))) throw new FailedPredicateException(this, "next(\"f\")");
			setState(336);
			match(Name);
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

	public static class Nokeyword_F70Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public Nokeyword_F70Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_F70; }
	}

	public final Nokeyword_F70Context nokeyword_F70() throws RecognitionException {
		Nokeyword_F70Context _localctx = new Nokeyword_F70Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_nokeyword_F70);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			if (!(next("F"))) throw new FailedPredicateException(this, "next(\"F\")");
			setState(339);
			match(Name);
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

	public static class Nokeyword_l108Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public Nokeyword_l108Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_l108; }
	}

	public final Nokeyword_l108Context nokeyword_l108() throws RecognitionException {
		Nokeyword_l108Context _localctx = new Nokeyword_l108Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_nokeyword_l108);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			if (!(next("l"))) throw new FailedPredicateException(this, "next(\"l\")");
			setState(342);
			match(Name);
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

	public static class Nokeyword_L76Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(GraphQLLiteAntlrParser.Name, 0); }
		public Nokeyword_L76Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_L76; }
	}

	public final Nokeyword_L76Context nokeyword_L76() throws RecognitionException {
		Nokeyword_L76Context _localctx = new Nokeyword_L76Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_nokeyword_L76);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			if (!(next("L"))) throw new FailedPredicateException(this, "next(\"L\")");
			setState(345);
			match(Name);
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
		case 5:
			return signedNatLiteral_sempred((SignedNatLiteralContext)_localctx, predIndex);
		case 6:
			return basicLongLiteral_sempred((BasicLongLiteralContext)_localctx, predIndex);
		case 7:
			return signedBasicLongLiteral_sempred((SignedBasicLongLiteralContext)_localctx, predIndex);
		case 8:
			return basicFloatLiteral_sempred((BasicFloatLiteralContext)_localctx, predIndex);
		case 9:
			return signedBasicFloatLiteral_sempred((SignedBasicFloatLiteralContext)_localctx, predIndex);
		case 10:
			return basicDoubleLiteral_sempred((BasicDoubleLiteralContext)_localctx, predIndex);
		case 11:
			return signedBasicDoubleLiteral_sempred((SignedBasicDoubleLiteralContext)_localctx, predIndex);
		case 26:
			return nokeyword_f102_sempred((Nokeyword_f102Context)_localctx, predIndex);
		case 27:
			return nokeyword_F70_sempred((Nokeyword_F70Context)_localctx, predIndex);
		case 28:
			return nokeyword_l108_sempred((Nokeyword_l108Context)_localctx, predIndex);
		case 29:
			return nokeyword_L76_sempred((Nokeyword_L76Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean signedNatLiteral_sempred(SignedNatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noSpace(2);
		}
		return true;
	}
	private boolean basicLongLiteral_sempred(BasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean signedBasicLongLiteral_sempred(SignedBasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return cmpToken(3,"l","L") && noSpace(2,3);
		case 3:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean basicFloatLiteral_sempred(BasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean signedBasicFloatLiteral_sempred(SignedBasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return cmpToken(5,"f","F") && noSpace(2,3,4,5);
		case 6:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean basicDoubleLiteral_sempred(BasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean signedBasicDoubleLiteral_sempred(SignedBasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return noSpace(2,3,4);
		case 9:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean nokeyword_f102_sempred(Nokeyword_f102Context _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return next("f");
		}
		return true;
	}
	private boolean nokeyword_F70_sempred(Nokeyword_F70Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return next("F");
		}
		return true;
	}
	private boolean nokeyword_l108_sempred(Nokeyword_l108Context _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return next("l");
		}
		return true;
	}
	private boolean nokeyword_L76_sempred(Nokeyword_L76Context _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return next("L");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u015e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n"+
		"\t\5\tu\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0090"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13"+
		"\5\13\u009e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b9\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c3\n\16\f\16\16\16\u00c6\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\6\20\u00d6\n\20\r\20\16\20\u00d7\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00e8\n\22\3\22\3\22\5\22\u00ec"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f4\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0100\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0111\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0122\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0130\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u013e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0146\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014e\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\2\u0163\2>\3"+
		"\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bI\3\2\2\2\nL\3\2\2\2\fW\3\2\2\2\16Y\3\2"+
		"\2\2\20t\3\2\2\2\22v\3\2\2\2\24\u009d\3\2\2\2\26\u009f\3\2\2\2\30\u00b8"+
		"\3\2\2\2\32\u00ba\3\2\2\2\34\u00c9\3\2\2\2\36\u00cd\3\2\2\2 \u00db\3\2"+
		"\2\2\"\u00e7\3\2\2\2$\u00ed\3\2\2\2&\u00ff\3\2\2\2(\u0110\3\2\2\2*\u0121"+
		"\3\2\2\2,\u012f\3\2\2\2.\u013d\3\2\2\2\60\u0145\3\2\2\2\62\u014d\3\2\2"+
		"\2\64\u014f\3\2\2\2\66\u0151\3\2\2\28\u0154\3\2\2\2:\u0157\3\2\2\2<\u015a"+
		"\3\2\2\2>?\7\r\2\2?\3\3\2\2\2@A\7\16\2\2AE\b\3\1\2BC\7\5\2\2CE\b\3\1\2"+
		"D@\3\2\2\2DB\3\2\2\2E\5\3\2\2\2FG\7\31\2\2GH\b\4\1\2H\7\3\2\2\2IJ\7\27"+
		"\2\2JK\b\5\1\2K\t\3\2\2\2LM\7\26\2\2MN\b\6\1\2N\13\3\2\2\2OP\6\7\2\2P"+
		"Q\7\b\2\2QR\b\7\1\2RS\3\2\2\2ST\7\26\2\2TX\b\7\1\2UV\7\26\2\2VX\b\7\1"+
		"\2WO\3\2\2\2WU\3\2\2\2X\r\3\2\2\2YZ\6\b\3\2Z[\7\26\2\2[\\\b\b\1\2\\_\3"+
		"\2\2\2]`\5:\36\2^`\5<\37\2_]\3\2\2\2_^\3\2\2\2`\17\3\2\2\2ab\6\t\4\2b"+
		"c\7\b\2\2cd\b\t\1\2de\3\2\2\2ef\7\26\2\2fg\b\t\1\2gj\3\2\2\2hk\5:\36\2"+
		"ik\5<\37\2jh\3\2\2\2ji\3\2\2\2ku\3\2\2\2lm\6\t\5\2mn\7\26\2\2no\b\t\1"+
		"\2or\3\2\2\2ps\5:\36\2qs\5<\37\2rp\3\2\2\2rq\3\2\2\2su\3\2\2\2ta\3\2\2"+
		"\2tl\3\2\2\2u\21\3\2\2\2vw\6\n\6\2wx\7\26\2\2xy\b\n\1\2yz\3\2\2\2z{\7"+
		"\t\2\2{|\7\26\2\2|}\b\n\1\2}\u0080\3\2\2\2~\u0081\5\66\34\2\177\u0081"+
		"\58\35\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083"+
		"\6\13\7\2\u0083\u0084\7\b\2\2\u0084\u0085\b\13\1\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\7\26\2\2\u0087\u0088\b\13\1\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\7\t\2\2\u008a\u008b\7\26\2\2\u008b\u008c\b\13\1\2\u008c\u008f\3\2\2\2"+
		"\u008d\u0090\5\66\34\2\u008e\u0090\58\35\2\u008f\u008d\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u009e\3\2\2\2\u0091\u0092\6\13\b\2\u0092\u0093\7\26\2\2"+
		"\u0093\u0094\b\13\1\2\u0094\u0095\3\2\2\2\u0095\u0096\7\t\2\2\u0096\u0097"+
		"\7\26\2\2\u0097\u0098\b\13\1\2\u0098\u009b\3\2\2\2\u0099\u009c\5\66\34"+
		"\2\u009a\u009c\58\35\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009e"+
		"\3\2\2\2\u009d\u0082\3\2\2\2\u009d\u0091\3\2\2\2\u009e\25\3\2\2\2\u009f"+
		"\u00a0\6\f\t\2\u00a0\u00a1\7\26\2\2\u00a1\u00a2\b\f\1\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\b\f\1\2\u00a6"+
		"\27\3\2\2\2\u00a7\u00a8\6\r\n\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\b\r\1"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\b\r\1\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b9\b"+
		"\r\1\2\u00b1\u00b2\6\r\13\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4\b\r\1\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b9\b"+
		"\r\1\2\u00b8\u00a7\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b9\31\3\2\2\2\u00ba"+
		"\u00bb\7\3\2\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\b\16\1\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00c4\7\20\2\2\u00bf\u00c0\5\60\31\2\u00c0\u00c1\b\16\1\2"+
		"\u00c1\u00c3\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\7\24\2\2\u00c8\33\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\7\30"+
		"\2\2\u00cb\u00cc\b\17\1\2\u00cc\35\3\2\2\2\u00cd\u00ce\7\7\2\2\u00ce\u00cf"+
		"\7\30\2\2\u00cf\u00d0\b\20\1\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\7\20\2"+
		"\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\b\20\1\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\24\2\2\u00da\37\3\2\2\2\u00db\u00dc"+
		"\7\30\2\2\u00dc\u00dd\b\21\1\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\17\2"+
		"\2\u00df\u00e0\5\62\32\2\u00e0\u00e1\b\21\1\2\u00e1!\3\2\2\2\u00e2\u00e3"+
		"\7\30\2\2\u00e3\u00e8\b\22\1\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\b\22\1"+
		"\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00ea\7\4\2\2\u00ea\u00ec\b\22\1\2\u00eb\u00e9\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00ee\7\21\2\2\u00ee\u00ef\5"+
		"\"\22\2\u00ef\u00f0\b\23\1\2\u00f0\u00f3\7\25\2\2\u00f1\u00f2\7\4\2\2"+
		"\u00f2\u00f4\b\23\1\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4%\3"+
		"\2\2\2\u00f5\u00f6\7\22\2\2\u00f6\u0100\b\24\1\2\u00f7\u00f8\7\6\2\2\u00f8"+
		"\u0100\b\24\1\2\u00f9\u00fa\7\23\2\2\u00fa\u0100\b\24\1\2\u00fb\u00fc"+
		"\7\n\2\2\u00fc\u0100\b\24\1\2\u00fd\u00fe\7\13\2\2\u00fe\u0100\b\24\1"+
		"\2\u00ff\u00f5\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fb"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\'\3\2\2\2\u0101\u0102\5,\27\2\u0102"+
		"\u0103\b\25\1\2\u0103\u0111\3\2\2\2\u0104\u0105\5\2\2\2\u0105\u0106\b"+
		"\25\1\2\u0106\u0111\3\2\2\2\u0107\u0108\5\4\3\2\u0108\u0109\b\25\1\2\u0109"+
		"\u0111\3\2\2\2\u010a\u010b\5\6\4\2\u010b\u010c\b\25\1\2\u010c\u0111\3"+
		"\2\2\2\u010d\u010e\5\b\5\2\u010e\u010f\b\25\1\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0101\3\2\2\2\u0110\u0104\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u010a\3\2"+
		"\2\2\u0110\u010d\3\2\2\2\u0111)\3\2\2\2\u0112\u0113\5.\30\2\u0113\u0114"+
		"\b\26\1\2\u0114\u0122\3\2\2\2\u0115\u0116\5\2\2\2\u0116\u0117\b\26\1\2"+
		"\u0117\u0122\3\2\2\2\u0118\u0119\5\4\3\2\u0119\u011a\b\26\1\2\u011a\u0122"+
		"\3\2\2\2\u011b\u011c\5\6\4\2\u011c\u011d\b\26\1\2\u011d\u0122\3\2\2\2"+
		"\u011e\u011f\5\b\5\2\u011f\u0120\b\26\1\2\u0120\u0122\3\2\2\2\u0121\u0112"+
		"\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0122+\3\2\2\2\u0123\u0124\5\n\6\2\u0124\u0125\b\27\1\2"+
		"\u0125\u0130\3\2\2\2\u0126\u0127\5\16\b\2\u0127\u0128\b\27\1\2\u0128\u0130"+
		"\3\2\2\2\u0129\u012a\5\22\n\2\u012a\u012b\b\27\1\2\u012b\u0130\3\2\2\2"+
		"\u012c\u012d\5\26\f\2\u012d\u012e\b\27\1\2\u012e\u0130\3\2\2\2\u012f\u0123"+
		"\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u012c\3\2\2\2\u0130"+
		"-\3\2\2\2\u0131\u0132\5\f\7\2\u0132\u0133\b\30\1\2\u0133\u013e\3\2\2\2"+
		"\u0134\u0135\5\20\t\2\u0135\u0136\b\30\1\2\u0136\u013e\3\2\2\2\u0137\u0138"+
		"\5\24\13\2\u0138\u0139\b\30\1\2\u0139\u013e\3\2\2\2\u013a\u013b\5\30\r"+
		"\2\u013b\u013c\b\30\1\2\u013c\u013e\3\2\2\2\u013d\u0131\3\2\2\2\u013d"+
		"\u0134\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u013a\3\2\2\2\u013e/\3\2\2\2"+
		"\u013f\u0140\5\34\17\2\u0140\u0141\b\31\1\2\u0141\u0146\3\2\2\2\u0142"+
		"\u0143\5\36\20\2\u0143\u0144\b\31\1\2\u0144\u0146\3\2\2\2\u0145\u013f"+
		"\3\2\2\2\u0145\u0142\3\2\2\2\u0146\61\3\2\2\2\u0147\u0148\5\"\22\2\u0148"+
		"\u0149\b\32\1\2\u0149\u014e\3\2\2\2\u014a\u014b\5$\23\2\u014b\u014c\b"+
		"\32\1\2\u014c\u014e\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e"+
		"\63\3\2\2\2\u014f\u0150\7\2\2\3\u0150\65\3\2\2\2\u0151\u0152\6\34\f\2"+
		"\u0152\u0153\7\30\2\2\u0153\67\3\2\2\2\u0154\u0155\6\35\r\2\u0155\u0156"+
		"\7\30\2\2\u01569\3\2\2\2\u0157\u0158\6\36\16\2\u0158\u0159\7\30\2\2\u0159"+
		";\3\2\2\2\u015a\u015b\6\37\17\2\u015b\u015c\7\30\2\2\u015c=\3\2\2\2\31"+
		"DW_jrt\u0080\u008f\u009b\u009d\u00b8\u00c4\u00d7\u00e7\u00eb\u00f3\u00ff"+
		"\u0110\u0121\u012f\u013d\u0145\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}